/*
 * SOBIO
 * SOBIO Biometric Services
 *
 * OpenAPI spec version: 1
 * Contact: info@softwaredelcentro.com.ar
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ar.com.sdc.sobio.api.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import ar.com.sdc.sobio.client.v1.ApiClient;
import ar.com.sdc.sobio.client.v1.ApiException;
import ar.com.sdc.sobio.model.v1.BiometricData;
import ar.com.sdc.sobio.model.v1.DeleteInput;
import ar.com.sdc.sobio.model.v1.DetectedAction;
import ar.com.sdc.sobio.model.v1.EnrollInput;
import ar.com.sdc.sobio.model.v1.EnrollResult;
import ar.com.sdc.sobio.model.v1.Expresion;
import ar.com.sdc.sobio.model.v1.ExtractDNIARInput;
import ar.com.sdc.sobio.model.v1.ExtractDNIARResult;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromImageResult;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoInput;
import ar.com.sdc.sobio.model.v1.ExtractFaceFromVideoResult;
import ar.com.sdc.sobio.model.v1.Face;
import ar.com.sdc.sobio.model.v1.FaceExtractionParams;
import ar.com.sdc.sobio.model.v1.Gender;
import ar.com.sdc.sobio.model.v1.VerificationParameters;
import ar.com.sdc.sobio.model.v1.VerifyInput;
import ar.com.sdc.sobio.model.v1.VerifyResult;
import ar.com.sdc.sobio.model.v1.VerifyT2TInput;

public class SOBIOClienteApiV1Test {

	protected byte[] cargar(String rscName) throws IOException {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(rscName).getFile());
		FileInputStream fis = new FileInputStream(file);
		byte[] cnt = IOUtils.toByteArray(fis);
		fis.close();
		return cnt;
	}
	
	public ApiClient createApiClient() {
		ApiClient api = new ApiClient();
		api.setBasePath("http://127.0.0.1:8081");
		return api;
	}

	@Test
	public void extractFaceWithGenderFromImage01() throws ApiException, IOException {
		ExtractionApi api = new ExtractionApi(createApiClient());
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("paul-1.jpg"));
		FaceExtractionParams params = new FaceExtractionParams();
		params.setDetectGender(true);
		input.setParams(params);
		ExtractFaceFromImageResult output = api.extractFaceImage(input);
		assertTrue(output.getExtractedFaces().size()>0);
		assertEquals(output.getExtractedFaces().get(0).getProperties().getGender().getType(), Gender.TypeEnum.MALE);

	}

	@Test
	public void match2Faces() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		MatchingApi apiMatching = new MatchingApi(createApiClient());
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("paul-1.jpg"));
		ExtractFaceFromImageResult output1 = apiExtraction.extractFaceImage(input);
		input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok456");
		input.setImage(cargar("paul-2.jpg"));
		ExtractFaceFromImageResult output2 = apiExtraction.extractFaceImage(input);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(output1.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(output2.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.995);// Assess that matched probability is above accepted rate (99.5%)
	}

	@Test
	public void extractFaceFromVideo01() throws ApiException, IOException {
		ExtractionApi api = new ExtractionApi(createApiClient());
		ExtractFaceFromVideoInput input = new ExtractFaceFromVideoInput();
		FaceExtractionParams params = new FaceExtractionParams();
		params.setDetectGender(true);
		input.setParams(params);
		input.setAuditToken("tok123");
		input.setVideo(cargar("paul-3.mp4"));// Extracted from https://www.youtube.com/watch?v=ui4at87SCB0
		ExtractFaceFromVideoResult output = api.extractFaceVideo(input);
		assertEquals(output.getStatus(), ExtractFaceFromVideoResult.StatusEnum.OK);
		assertEquals(output.getProperties().getGender().getType(), Gender.TypeEnum.MALE);
	}

	@Test
	public void matchFaceFromVideo2FaceFromImage() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		ExtractFaceFromVideoInput inputVideo = new ExtractFaceFromVideoInput();
		inputVideo.setAuditToken("tok123");
		inputVideo.setVideo(cargar("paul-3.mp4"));// Extracted from https://www.youtube.com/watch?v=ui4at87SCB0
		ExtractFaceFromVideoResult outputVideo = apiExtraction.extractFaceVideo(inputVideo);
		ExtractFaceFromImageInput inputImage = new ExtractFaceFromImageInput();
		inputImage.setAuditToken("tok123");
		inputImage.setImage(cargar("paul-1.jpg"));
		ExtractFaceFromImageResult outputImage = apiExtraction.extractFaceImage(inputImage);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputVideo.getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputImage.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		MatchingApi apiMatching = new MatchingApi(createApiClient());
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.995);// Assess that matched probability is above accepted rate (99.5%)
	}
	
	@Test
	public void matchIDCardImage2SelfieImage01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		MatchingApi apiMatching = new MatchingApi(createApiClient());
		ExtractFaceFromImageInput inputIDCard = new ExtractFaceFromImageInput();
		inputIDCard.setAuditToken("tok123");
		inputIDCard.setImage(cargar("idcard-01.jpg"));
		ExtractFaceFromImageResult outputIDCard = apiExtraction.extractFaceImage(inputIDCard);
		ExtractFaceFromImageInput inputSelfie= new ExtractFaceFromImageInput();
		inputSelfie.setAuditToken("tok123");
		inputSelfie.setImage(cargar("selfie-01.jpg"));
		ExtractFaceFromImageResult outputSelfie = apiExtraction.extractFaceImage(inputSelfie);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputIDCard.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputSelfie.getExtractedFaces().get(0).getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.993);// Assess that matched probability is above accepted rate (99.5%)
	}

	@Test
	public void matchIDCardImage2SelfieVideo01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		MatchingApi apiMatching = new MatchingApi(createApiClient());
		ExtractFaceFromImageInput inputIDCard = new ExtractFaceFromImageInput();
		inputIDCard.setAuditToken("tok123");
		inputIDCard.setImage(cargar("idcard-01.jpg"));
		ExtractFaceFromImageResult outputIDCard = apiExtraction.extractFaceImage(inputIDCard);
		ExtractFaceFromVideoInput inputSelfieVideo = new ExtractFaceFromVideoInput();
		inputSelfieVideo.setAuditToken("tok123");
		inputSelfieVideo.setVideo(cargar("selfie-vid-01.mp4"));
		ExtractFaceFromVideoResult outputSelfieVideo = apiExtraction.extractFaceVideo(inputSelfieVideo);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputIDCard.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputSelfieVideo.getFace());
		VerifyT2TInput verifyInput = new VerifyT2TInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyInput.setParams(verifyParams);
		verifyInput.bioInfo1(subject1BioInfo);
		verifyInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.993);// Assess that matched probability is above accepted rate (99.5%)
	}
	
	@Test
	public void extractAndAssertVideoActions() throws IOException, ApiException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		ExtractFaceFromVideoInput inputSelfieVideo = new ExtractFaceFromVideoInput();
		inputSelfieVideo.setAuditToken("tok123");
		inputSelfieVideo.setVideo(cargar("selfie-vid-01.mp4"));
		FaceExtractionParams params=new FaceExtractionParams();
		params.detectTraitsAndActions(true);
		inputSelfieVideo.setParams(params);
		ExtractFaceFromVideoResult outputSelfieVideo = apiExtraction.extractFaceVideo(inputSelfieVideo);
		List<DetectedAction.TypeEnum> expected = new ArrayList<DetectedAction.TypeEnum>();
		expected.add(DetectedAction.TypeEnum.LOOKING_FRONT);
		expected.add(DetectedAction.TypeEnum.LOOKING_RIGHT);
		expected.add(DetectedAction.TypeEnum.LOOKING_FRONT);
		expected.add(DetectedAction.TypeEnum.LOOKING_LEFT);
		expected.add(DetectedAction.TypeEnum.LOOKING_FRONT);
		expected.add(DetectedAction.TypeEnum.LOOKING_UPWARDS);
		expected.add(DetectedAction.TypeEnum.LOOKING_FRONT);
		expected.add(DetectedAction.TypeEnum.LOOKING_DOWNWARDS);
		expected.add(DetectedAction.TypeEnum.LOOKING_FRONT);
		int idxEsperada=0;
		for (DetectedAction ad : outputSelfieVideo.getDetectedActions()) {
			if (ad.getType().toString().startsWith("LOOKING")) {// Only interested in LOOKING ones
				assertEquals(ad.getType(), expected.get(idxEsperada));
				idxEsperada++;
			}
		}
	}
	
	@Test
	public void completeOnboardingExample01() throws ApiException, IOException {
		//Takes id Card and selfie video, matches them and make an enrollment
		//Perform a verification against enrollement with id
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		MatchingApi apiMatching = new MatchingApi(createApiClient());
		DatabaseApi dbApi=new DatabaseApi(createApiClient());
		ExtractFaceFromImageInput inputIDCard = new ExtractFaceFromImageInput();
		inputIDCard.setAuditToken("tok123");
		inputIDCard.setImage(cargar("idcard-01.jpg"));
		ExtractFaceFromImageResult outputIDCard = apiExtraction.extractFaceImage(inputIDCard);
		ExtractFaceFromVideoInput inputSelfieVideo = new ExtractFaceFromVideoInput();
		inputSelfieVideo.setAuditToken("tok123");
		inputSelfieVideo.setVideo(cargar("selfie-vid-01.mp4"));
		ExtractFaceFromVideoResult outputSelfieVideo = apiExtraction.extractFaceVideo(inputSelfieVideo);
		BiometricData subject1BioInfo = new BiometricData();
		subject1BioInfo.addFacesItem(outputIDCard.getExtractedFaces().get(0).getFace());
		BiometricData subject2BioInfo = new BiometricData();
		subject2BioInfo.addFacesItem(outputSelfieVideo.getFace());
		VerifyT2TInput verifyT2TInput = new VerifyT2TInput();
		VerificationParameters verifyT2TParams = new VerificationParameters();
		verifyT2TInput.setParams(verifyT2TParams);
		verifyT2TInput.bioInfo1(subject1BioInfo);
		verifyT2TInput.bioInfo2(subject2BioInfo);
		VerifyResult verifyOutput = apiMatching.verifyT2t(verifyT2TInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.993);// Assess that matched probability is above accepted rate (99.5%)
		//Enrollment
		String subjectId=UUID.randomUUID().toString();//Random subjectId
		BiometricData enrollmentBioData=new BiometricData();
		//Put 2 biometric faces from previous steps into the same enrollment template (we previously verified that are from the same person)
		enrollmentBioData.setFaces(subject1BioInfo.getFaces());
		enrollmentBioData.getFaces().addAll(subject2BioInfo.getFaces());
		EnrollInput enrollInput=new EnrollInput();
		enrollInput.setSubjectId(subjectId);
		enrollInput.setBioInfo(enrollmentBioData);
		enrollInput.setAuditToken("tok123");
		//Now perform enrollment
		EnrollResult enrollOutput = dbApi.enroll(enrollInput);
		//Assert enrollment Ok
		assertEquals(enrollOutput.getStatus(), EnrollResult.StatusEnum.ENROLL_OK);
		//Now perform verification against another subject selfie
		ExtractFaceFromImageInput inputSelfieImg= new ExtractFaceFromImageInput();
		inputSelfieImg.setAuditToken("tok123");
		inputSelfieImg.setImage(cargar("selfie-01.jpg"));
		ExtractFaceFromImageResult outputSelfieImg = apiExtraction.extractFaceImage(inputSelfieImg);
		BiometricData verifyBioData=new BiometricData();
		verifyBioData.setFaces(new ArrayList<Face>());
		verifyBioData.getFaces().add(outputSelfieImg.getExtractedFaces().get(0).getFace());
		VerifyInput verifyInput = new VerifyInput();
		VerificationParameters verifyParams = new VerificationParameters();
		verifyInput.setAuditToken("tok123");
		verifyInput.setParams(verifyParams);
		verifyInput.setSubjectId(subjectId);
		verifyInput.setBioInfo(verifyBioData);
		verifyOutput=apiMatching.verify(verifyInput);
		assertEquals(verifyOutput.getStatus(), VerifyResult.StatusEnum.CHECK_CONFIDENCE);
		assertTrue(verifyOutput.getConfidence()>0.993);// Assess that matched probability is above accepted rate (99.5%)
		DeleteInput deleteInput=new DeleteInput();
		deleteInput.setSubjectId(subjectId);
		deleteInput.setAuditToken("tok123");
		//Clean enrollment to clean test environment
		dbApi.delete(deleteInput);
	}

	@Test
	public void faceTraitDetection01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("paul-3.jpg"));
		FaceExtractionParams params=new FaceExtractionParams();
		params.detectTraitsAndActions(true);
		input.setParams(params);
		ExtractFaceFromImageResult output = apiExtraction.extractFaceImage(input);
//		assertTrue(output.getExtractedFaces().get(0).getProperties().getTraits().getOpenMouth()>=50);//50% or more is a good confidence value
		assertTrue(!output.getExtractedFaces().get(0).getProperties().getTraits().isRightEyeClosed());
		assertTrue(!output.getExtractedFaces().get(0).getProperties().getTraits().isLeftEyeClosed());
	}
	
	@Test
	public void faceEmotionDetection01() throws ApiException, IOException {
		//A single face can have different emotion confidence values (ie. neutral - 60% , disgust - 45%) 
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("emotion-01.jpg"));
		FaceExtractionParams params=new FaceExtractionParams();
		params.detectEmotion(true);
		input.setParams(params);
		ExtractFaceFromImageResult output = apiExtraction.extractFaceImage(input);
//		assertTrue(output.getExtractedFaces().get(0).getProperties().getEmotion().getSurprise()>=50);//50% or more is a good confidence value
		input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("emotion-02.jpg"));
		params.detectEmotion(true);
		input.setParams(params);
		output = apiExtraction.extractFaceImage(input);
//		assertTrue(output.getExtractedFaces().get(0).getProperties().getEmotion().getFear()>=50);//50% or more is a good confidence value
	}

	@Test
	public void faceExpressionDetection01() throws ApiException, IOException {
		ExtractionApi apiExtraction = new ExtractionApi(createApiClient());
		ExtractFaceFromImageInput input = new ExtractFaceFromImageInput();
		input.setAuditToken("tok123");
		input.setImage(cargar("expression-01.jpg"));
		FaceExtractionParams params=new FaceExtractionParams();
		params.detectExpression(true);
		input.setParams(params);
		ExtractFaceFromImageResult output = apiExtraction.extractFaceImage(input);
//		assertTrue(output.getExtractedFaces().get(0).getProperties().getExpression().getConfidence()>=50);//[50-100] or more is a good value for confidence
		assertEquals(output.getExtractedFaces().get(0).getProperties().getExpression().getType(),Expresion.TypeEnum.SMILE);
	}

	@Test
	public void extractFromIDArgentinaV2_01() throws IOException, ApiException {
		DocumentExtractionApi eapi = new DocumentExtractionApi(createApiClient());
		ExtractDNIARInput input = new ExtractDNIARInput();
		input.setAuditToken("tok123");
		input.setFrontImage(cargar("dni_argentino_front.jpg"));
		input.setBackImage(cargar("dni_argentino_back.jpg"));
		ExtractDNIARResult o = eapi.extractDniArDocInfo(input);
		assertEquals(o.getStatus(), ExtractDNIARResult.StatusEnum.OK);
		assertEquals(o.getDocumentInfo().getDocumentNumber(), "99999999");
		assertEquals(o.getDocumentInfo().getNationality(), "ARG");
		assertEquals(o.getDocumentInfo().getSurname(), "VILLAREAL");
		assertEquals(o.getDocumentInfo().getGivenNames(), "MARIA VICTORIA");
	}

}
