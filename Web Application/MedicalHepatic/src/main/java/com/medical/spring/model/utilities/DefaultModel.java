package com.medical.spring.model.utilities;

import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultModel {

	public Map<String, String> ndiList() {

		Map<String, String> ndi = new LinkedHashMap<String, String>();
		ndi.put("C.C", "Cédula de ciudadania");
		ndi.put("T.I", "Tarjeta de identidad");
		ndi.put("R.C", "Registro Civil");

		return ndi;
	}
	
	public Map<String, String> hepaticProfileList() {

		Map<String, String> hepaticProfile = new LinkedHashMap<String, String>();
		hepaticProfile.put("6768-6", "ALP O FAL - FOSFATASA ALCALINA");
		hepaticProfile.put("1751-7", "ALBÚMINA");
		hepaticProfile.put("1742-6", "ALT - ALANINO AMINOTRANSFERASA");
		hepaticProfile.put("1920-8", "AST - ASPARTATO AMINOTRANSFERASA");
		hepaticProfile.put("1968-7", "BILIRUBINA DIRECTA");
		hepaticProfile.put("1975-2", "BILIRUBINA TOTAL");
		hepaticProfile.put("2324-2", "GGT - GAMMA GLUTAMILTRANSPEPTIDASA");
		hepaticProfile.put("2532-0", "DHL - DESHIDROGENASA LÁCTICA");
		hepaticProfile.put("2885-2", "PROTEÍNAS TOTALES");
		hepaticProfile.put("5902-2", "PT - PROTROMBINA");

		return hepaticProfile;
	}

	public Map<String, String> genderList() {

		Map<String, String> gender = new LinkedHashMap<String, String>();
		gender.put("Hombre", "Hombre");
		gender.put("Mujer", "Mujer");
		gender.put("Otro", "Otro");
		return gender;
	}

	public Map<String, String> roleList() {

		Map<String, String> role = new LinkedHashMap<String, String>();
		role.put("Médico(a) Endocrinólogo(a)", "Médico(a) Endocrinólogo(a)");
		role.put("Médico(a) General", "Médico(a) General");
		role.put("Estudiante de medicina", "Estudiante de medicina");
		role.put("Enfermero(a) Jefe", "Enfermero(a) Jefe");
		role.put("Enfermero(a)", "Enfermero(a)");

		return role;
	}

	public Map<String, String> bloodList() {

		Map<String, String> blood = new LinkedHashMap<String, String>();
		blood.put("A+", "A+");
		blood.put("A-", "A-");
		blood.put("B+", "B+");
		blood.put("B-", "B-");
		blood.put("AB+", "AB+");
		blood.put("AB-", "AB-");
		blood.put("O+", "O+");
		blood.put("O-", "O-");

		return blood;
	}

	public Map<String, String> relationshipList() {

		Map<String, String> relationship = new LinkedHashMap<String, String>();
		relationship.put("Familia", "Familia");
		relationship.put("Pareja", "Pareja");
		relationship.put("Amigo(a)", "Amigo(a)");
		return relationship;
	}

	public Map<String, String> maritalStatusList() {

		Map<String, String> maritalStatus = new LinkedHashMap<String, String>();
		maritalStatus.put("Casado(a)", "Casado(a)");
		maritalStatus.put("Soltero(a)", "Soltero(a)");
		maritalStatus.put("Unión libre", "Unión libre");
		maritalStatus.put("Separado(a)", "Separado(a)");
		maritalStatus.put("Viudo(a)", "Viudo(a)");

		return maritalStatus;
	}

}
