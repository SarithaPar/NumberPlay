# NumberPlay Project

  > Project Name 		    : NumberPlay
  
  > Project Management   : Maven
 
  > Test Framework		    : TestNG
  
  > ExcelSheet Library	  : Apache Poi


# Run of Test Scripts:

  ```
 Project$  mvn clean test -DsuiteXmlFile=testng.xml
 ```
  or
  ```
 Right click on project and hit “**Run as - TestNG Test**”
  ```


# Files included:

**Main Class files:**

  1. [Interface](https://github.com/SarithaPar/NumberPlay/blob/master/src/main/java/Exercise1/NumberPlay.java)
  2. [Class implements Interface](https://github.com/SarithaPar/NumberPlay/blob/master/src/main/java/Exercise1/NumberPlayImplement.java)


**Unit Test files:**

  1. [LowestNumber()](https://github.com/SarithaPar/NumberPlay/blob/master/src/test/java/Exercise1Test/NumberPlay_lowestTest_Excel.java) verification
  2. [SecondLowestNumber()](https://github.com/SarithaPar/NumberPlay/blob/master/src/test/java/Exercise1Test/NumberPlay_SecondLowestTest_Excel.java) verification


**Input Data:**

  1. [Input Data](https://github.com/SarithaPar/NumberPlay/blob/master/src/test/resources/Data.xlsx)
  2. [Read Excel Data](https://github.com/SarithaPar/NumberPlay/blob/master/src/test/java/InputData/ReadExcelData.java) class


# Dependencies:
 
  ```
  <dependencies>
			<dependency>
				<groupId>org.testng</groupId>
				<artifactId>testng</artifactId>
				<version>6.8</version>
			</dependency>
			<dependency>
				<groupId>org.apache.poi</groupId>
				<artifactId>poi</artifactId>
				<version>3.16</version>
			</dependency>
			<dependency>
				<groupId>org.apache.poi</groupId>
				<artifactId>poi-ooxml</artifactId>
				<version>3.16</version>
			</dependency>
			<dependency>
				<groupId>org.apache.poi</groupId>
				<artifactId>poi-ooxml-schemas</artifactId>
				<version>3.16</version>
			</dependency>
		</dependencies>
  ```

# Test-Output

  1. /NumberPlay/test-output/index.html
  2. /NumberPlay/test-output/emailable-report.html



