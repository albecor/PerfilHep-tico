package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

/**
 * @author GTST - Grupo de tratamiento de señales y telecomunicaciones -
 *         Universidad Surcolombiana
 *
 */

public class PanelHepatic {

	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 *            - exam object
	 * @return -
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "6768-6":
			exam.setDisplayCode("ALP Alkaline phosphatase");
			exam.setCode("6768-6");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/6768-6.html?sections=Comprehensive");
			exam.setLow("30.0");
			exam.setHigh("120.0");
			exam.setUnit("U/L");
			break;
		case "1751-7":
			exam.setDisplayCode("Albumin [Mass/volume] in Serum or Plasma");
			exam.setCode("1751-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1751-7.html?sections=Comprehensive");
			exam.setLow("3.5");
			exam.setHigh("5.5");
			exam.setUnit("g/dL");
			break;
		case "1742-6":
			exam.setDisplayCode("ALT Alanine transaminase");
			exam.setCode("1742-6");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1742-6.html?sections=Comprehensive");
			exam.setLow("30.0");
			exam.setHigh("120.0");
			exam.setUnit("U/L");
			break;
		case "1920-8":
			exam.setDisplayCode("AST Aspartate transaminase");
			exam.setCode("1920-8");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1920-8.html?sections=Comprehensive");
			exam.setLow("0.0");
			exam.setHigh("52.0");
			exam.setUnit("U/L");
			break;
		case "1968-7":
			exam.setDisplayCode("Bilirubin.direct [Mass/volume] in Serum or Plasma");
			exam.setCode("1968-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1968-7.html?sections=Comprehensive");
			exam.setLow("0.1");
			exam.setHigh("0.3");
			exam.setUnit("mg/dL");
			break;
		case "1975-2":
			exam.setDisplayCode("Bilirubin.total [Mass/volume] in Serum or Plasma");
			exam.setCode("1975-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1975-2.html?sections=Comprehensive");
			exam.setLow("0.1");
			exam.setHigh("0.3");
			exam.setUnit("mg/dL");
			break;
		case "2324-2":
			exam.setDisplayCode("GGT Gamma glutamyl transferase");
			exam.setCode("2324-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2324-2.html?sections=Comprehensive");
			exam.setLow("0.0");
			exam.setHigh("25.0");
			exam.setUnit("U/L");
			break;
		case "2532-0":
			exam.setDisplayCode("LDH Lactate dehydrogenase");
			exam.setCode("2532-0");
			exam.setSystemCode("https://s.details.loinc.org/LOINC/2532-0.html");
			exam.setLow("30.0");
			exam.setHigh("120.0");
			exam.setUnit("U/L");
			break;
		case "2885-2":
			exam.setDisplayCode("Protein [Mass/volume] in Serum or Plasma");
			exam.setCode("2885-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2885-2.html?sections=Comprehensive");
			exam.setLow("5.5");
			exam.setHigh("8.0");
			exam.setUnit("g/dL");
			break;
		case "5902-2":
			exam.setDisplayCode("Prothrombin time (PT)");
			exam.setCode("5902-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/5902-2.html?sections=Comprehensive");
			exam.setLow("8.3");
			exam.setHigh("10.8");
			exam.setUnit("s");
			break;
		}
		return exam;
	}

	/**
	 * 
	 * @return exam name list
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("6768-6");
		listExam.add("1751-7");
		listExam.add("1742-6");
		listExam.add("1920-8");
		listExam.add("1968-7");
		listExam.add("1975-2");
		listExam.add("2324-2");
		listExam.add("2532-0");
		listExam.add("2885-2");
		listExam.add("5902-2");
		return listExam;
	}
}
