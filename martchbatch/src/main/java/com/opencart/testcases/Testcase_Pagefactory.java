package martchbatch;



package com.opencart.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

Run All

public class Testcase_Pagefactory {

@Test

Run | Debug

public void Testcase2() throws IOException {

// TODO Auto-generated method stub String projectpath-System.getProperty("user.dir"); ExtentReports extent-new ExtentReports(); ExtentSparkReporter spark-new ExtentSparkReporter (projectpath+"\\Reports\\TC1.html"); extent.attachReporter (spark); ExtentTest test-extent.createTest("Login to OpenCart");

String propertypath="C:\\Users\\Administrator\\Desktop\\Eclipse\\march\\src\\test\\java\\com\\opencart\\testdata\\inputproperties";

propertypath-propertypath.trim();

InputStream input-new FileInputStream(propertypath); Properties prob-new Properties();

prob.load(input);

String url-prob.getProperty("url");

File fl-new File(projectpath+"\\src\\test\\java\\com\\opencart\\testdata\\Book2.xlsx"); FileInputStream fis new FileInputStream(f1);

XSSFWorkbook workbook-new XSSFWorkbook(fis); XSSFSheet sheet-workbook.getSheetAt(0); int rowcount-sheet.getPhysicalNumberOfRows(); for (int i=0;i<rowcount; i++)

}
