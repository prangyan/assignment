package com.json.jsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.json.dao.FacultyDetails;
import com.json.dao.SchoolAddress;
import com.json.dao.Schools;

public class JsonParse {


    public static void main(String[] args) {

    	InputStream in =  new JsonParse().getClass().getClassLoader().getResourceAsStream("sample_api_output.json"); 
    	try (InputStreamReader reader = new InputStreamReader(in)) {
    		
    		// read the json file
    		JSONParser jsonParser = new JSONParser();
    		JSONArray jsonArray = (JSONArray) jsonParser.parse(reader);
    		Iterator schoolDetails = jsonArray.iterator();
    		List<SchoolAddress> schoolAddresses = new ArrayList<SchoolAddress>();
    		int addressCount= 0;
    		int facultyCount=0;

    		// take each value from the json array separately
    		while (schoolDetails.hasNext()) {
    			JSONObject innerObj = (JSONObject) schoolDetails.next();
    			SchoolAddress single = new SchoolAddress();
    			int count = addressCount++;
    			single.setAddressCount(count);
    			single.setAddress(innerObj.get("address").toString());
    			single.setCity(innerObj.get("city").toString());
    			//single.setDistrictId(innerObj.get("districtId").toString());
    			single.setMedianHouseValue(innerObj.get("medianHouseValue").toString());
    			single.setZip(innerObj.get("zip").toString());

    			JSONObject districtObject =(JSONObject) innerObj.get("schoolDistrict");
    			JSONArray schoolArray =(JSONArray) districtObject.get("schools");

    			Iterator schoolIterator = schoolArray.iterator();
    			List<FacultyDetails> facultyList= new ArrayList<FacultyDetails>();
    			Schools school = new Schools();
    			while (schoolIterator.hasNext()) {
    				JSONObject schoolSingle = (JSONObject) schoolIterator.next();

    				JSONArray facultyArray = (JSONArray)schoolSingle.get("faculty");
    				JSONObject facultySingleObject = (JSONObject)facultyArray.iterator().next();
    				FacultyDetails singleFaculty = new FacultyDetails();
    				singleFaculty.setName(facultySingleObject.get("name").toString());
    				singleFaculty.setRole(facultySingleObject.get("role").toString());
    				singleFaculty.setStartDate(facultySingleObject.get("startDate").toString());
    				singleFaculty.setSchollGrade(schoolSingle.get("schoolGrade").toString());
    				singleFaculty.setSchollName(schoolSingle.get("schoolName").toString());
    				singleFaculty.setFacultyCount(facultyCount++);
    				singleFaculty.setAddressCount(count);

    				facultyList.add(singleFaculty);
    			}
    			facultyCount=0;
    			school.setFacultyDetails(facultyList);
    			school.setDistrictId(districtObject.get("districtId").toString());
    			single.setSchool(school);
    			schoolAddresses.add(single);
    			System.out.println("SchoolAddress is  " +single.toString());

    		}
    		System.out.println("Size " +schoolAddresses.size() );
    		System.out.println("Size " +addressCount);

    	}     

    	catch (Exception ex) {
    		ex.printStackTrace();
    	}
    }

}
