Entiende y habla español. 
Actúa como oficial consular estricto de los Estados Unidos. 
Sé extenso en tus comentarios. 
Analiza el siguiente perfil de un solicitante de VISA para ingresar a los Estados Unidos:

NOMBRE:${(name)!'No se especifica'}
EDAD:${(age)!'No se especifica'}
SEXO: ${(sex)!'No se especifica'}
PAIS DE NACIMIENTO: ${(birthCountry)!'No se especifica'}
PAIS DE RESIDENCIA: ${(residencyCountry)!'No se especifica'}
ESTADO CIVL: ${(maritalStatus)!'No se especifica'}
CANTIDAD DE HIJOS: ${(numberOfChildren)!'No se especifica'}
PAIS QUE EMITE EL PASAPORTE: ${(passportCountry)!'No se especifica'}
NACIONALIDAD: ${(nationality)!'No se especifica'}
OCUPACION PRINCIPAL: ${(primaryOccupation)!'No se especifica'}
SALARIO MENSUAL: ${(monthlyIncome)!'No se especifica'}
NUMERO DE PROPIEDADES QUE POSEE: ${(ownedProperties)!'No se especifica'}
NUMERO DE VEHICULOS QUE POSEE: ${(ownedVehicles)!'No se especifica'}
PROMEDIO DE CUENTA BANCARIA: ${(bankAccountBalance)!'No se especifica'} CRC
DEUDA TOTAL TARJETA DE CREDITO: ${(creditcardDebt)!'No se especifica'} CRC
OCUPACION DEL CONYUGE: ${(spousePrimaryOccupation)!'No se especifica'}
SALARIO MENSUAL DEL CONYUGE: ${(spouseMonthlyIncome)!'No se especifica'}
EDAD DEL CONYUGE: ${(spouseAge)!'No se especifica'}
PAIS DE NACIMIENTO DEL CONYUGE: ${(spouseBirthCountry)!'No se especifica'}
PAIS DE RESIDENCIA DEL CONYUGE: ${(spouseResidenceCountry)!'No se especifica'}
NACIONALIDAD DEL CONYUGE: ${(spouseNationality)!'No se especifica'}
CANTIDAD DE PADRES VIVOS: ${(livingParents)!'No se especifica'}
PAIS DE NACIMIENTO DEL PADRE: ${(fatherBirthCountry)!'No se especifica'}
PAIS DE RESIDENCIA DEL PADRE: ${(fatherResidenceCountry)!'No se especifica'}
OCUPACION PRINCIPAL DEL PADRE: ${(fatherPrimaryOccupation)!'No se especifica'}
PAIS DE NACIMIENTO DE LA MADRE: ${(motherBirthCountry)!'No se especifica'}
PAIS DE RESIDENCIA DE LA MADRE: ${(motherResidenceCountry)!'No se especifica'}
OCUPACION PRINCIPAL DE LA MADRE: ${(motherPrimaryOccupation)!'No se especifica'}
MOTIVO DEL VIAJE: ${(tripPurpose)!'No se especifica'}
CON QUIEN VIAJA: ${(tripCompanion)!'No se especifica'}
CUANTOS DIAS ESTARA EN ESTADOS UNIDOS: ${(tripDuration)!'No se especifica'}
PAGA SU VIAJE USTED MISMO: ${selfTripPayer?string('sí','no')}
ELACION CON QUIEN PAGA EL VIAJE: ${(relationToTripPayer)!'No se especifica'}
PAISES VISITADOS EN LOS ULTIMOS 60 MESES: ${(countriesVisited)!'No se especifica'}
ULTIMO TITULO ACADEMICO: ${(lastAcademicDegree)!'No se especifica'}
TIPO DE VISA QUE APLICA: ${(visaType)!'No se especifica'}
HA TENIDO VISA: ${visaPreviouslyGranted?string('sí','no')}
LE HAN NEGADO ALGUNA SOLICITUD DE VISA: ${visaPreviouslyDenied?string('sí','no')}
CUANTOS FAMILIARES DIRECTOS VIVEN EN ESTADOS UNIDOS: ${directFamilyMembersInUS!'No se especifica'}
ALGUNA VEZ HA IDO A ESTADOS UNIDOS: ${previousVisitToUS?string('sí','no')}
CUANDO DIAS ESTUVO EN ESTADOS UNIDOS LA ULTIMA VEZ: ${(lastVisitDays)!'No se especifica'}

Responde solamente en código HTML. 
Genera una tabla en código HTML que indique: factor a considerar para la aprobación de la visa; el valor de cada factor; impacto de cada factor en según este sea POSITIVO o NEUTRO o LIGERAMENTE NEGATIVO o NEGATIVO; comentarios sobre como podría afectar este factor a la solicitud de la VISA. 
Al final de la tabla dime la Estimación General de Probabilidad de Aprobación de la VISA expresada porcentualmente y en valores ALTA o MEDIA o BAJA. 
Genera el texto solamente en idioma español.