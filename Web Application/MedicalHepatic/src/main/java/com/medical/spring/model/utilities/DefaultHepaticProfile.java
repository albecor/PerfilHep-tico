package com.medical.spring.model.utilities;

/**
 * @author GTST - Grupo de tratamiento de señales y telecomunicaciones - Universidad Surcolombiana
 *
 */
import com.medical.spring.model.Exam;

public class DefaultHepaticProfile {

	/**
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

	public Exam getAlt() {
		Exam exam = new Exam();
		exam.setDisplayCode("ALT Alanine transaminase");
		exam.setCode("1742-6");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/1742-6.html?sections=Comprehensive");
		exam.setLow("30.0");
		exam.setHigh("120.0");
		exam.setUnit("U/L");
		return exam;
	}

	public Exam getAlbumin() {
		Exam exam = new Exam();
		exam.setDisplayCode("Albumin [Mass/volume] in Serum or Plasma");
		exam.setCode("1751-7");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/1751-7.html?sections=Comprehensive");
		exam.setLow("3.5");
		exam.setHigh("5.5");
		exam.setUnit("g/dL");
		return exam;
	}

	public Exam getAlp() {
		Exam exam = new Exam();
		exam.setDisplayCode("ALP Alkaline phosphatase");
		exam.setCode("6768-6");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/6768-6.html?sections=Comprehensive");
		exam.setLow("30.0");
		exam.setHigh("120.0");
		exam.setUnit("U/L");
		return exam;
	}

	public Exam getAst() {
		Exam exam = new Exam();
		exam.setDisplayCode("AST Aspartate transaminase");
		exam.setCode("1920-8");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/1920-8.html?sections=Comprehensive");
		exam.setLow("0.0");
		exam.setHigh("52.0");
		exam.setUnit("U/L");
		return exam;
	}

	public Exam getBilirubindirect() {
		Exam exam = new Exam();
		exam.setDisplayCode("Bilirubin.direct [Mass/volume] in Serum or Plasma");
		exam.setCode("1968-7");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/1968-7.html?sections=Comprehensive");
		exam.setLow("0.1");
		exam.setHigh("0.3");
		exam.setUnit("mg/dL");
		return exam;
	}

	public Exam getBilirubintotal() {
		Exam exam = new Exam();
		exam.setDisplayCode("Bilirubin.total [Mass/volume] in Serum or Plasma");
		exam.setCode("1975-2");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/1975-2.html?sections=Comprehensive");
		exam.setLow("0.1");
		exam.setHigh("0.3");
		exam.setUnit("mg/dL");
		return exam;
	}

	public Exam getGgt() {
		Exam exam = new Exam();
		exam.setDisplayCode("GGT Gamma glutamyl transferase");
		exam.setCode("2324-2");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/2324-2.html?sections=Comprehensive");
		exam.setLow("0.0");
		exam.setHigh("25.0");
		exam.setUnit("U/L");
		return exam;
	}

	public Exam getLdh() {
		Exam exam = new Exam();
		exam.setDisplayCode("LDH Lactate dehydrogenase");
		exam.setCode("2532-0");
		exam.setSystemCode("https://s.details.loinc.org/LOINC/2532-0.html");
		exam.setLow("30.0");
		exam.setHigh("120.0");
		exam.setUnit("U/L");
		return exam;
	}

	public Exam getProtein() {
		Exam exam = new Exam();
		exam.setDisplayCode("Protein [Mass/volume] in Serum or Plasma");
		exam.setCode("2885-2");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/2885-2.html?sections=Comprehensive");
		exam.setLow("5.5");
		exam.setHigh("8.0");
		exam.setUnit("g/dL");
		return exam;
	}

	public Exam getPt() {
		Exam exam = new Exam();
		exam.setDisplayCode("Prothrombin time (PT)");
		exam.setCode("5902-2");
		exam.setSystemCode("https://r.details.loinc.org/LOINC/5902-2.html?sections=Comprehensive");
		exam.setLow("8.3");
		exam.setHigh("10.8");
		exam.setUnit("s");
		return exam;
	}

}
