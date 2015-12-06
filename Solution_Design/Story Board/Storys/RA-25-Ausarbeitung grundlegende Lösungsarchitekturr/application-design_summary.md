Note: current status of this document is first draft

# Summary of the RefugeesWelcomeApp application design

##Architecture
The application uses a three-tier architecture:
* A HTML5-compatible webbrowser will be used to display the presentation tier. Foundation Framework and AngularJS will provide necessary rapid-development support on the front-end side.
* TomEE web profile (based on the Apache Tomcat webserver / servlet container, Java EE featuresets and OpenEJB) will be used for the logic tier. ToDo: what about Spring.io additons?
* MariaDB will be used for the data tier to store information, do basic consistency/validity checking and provide basic authorisation checks before executing requests on stored data.

##Security
The finished application will comply to the Deutsche Telekom Group [privacy and security assessment process](https://www.telekom.com/psa-process) and thus fulfill the security requirements available at [DE](https://www.telekom.com/static/-/155996/18/technische-sicherheitsanforderungen-si) [EN](https://www.telekom.com/static/-/246042/6/security-requirements-si).

##Allgemeines zu 3-Tier-Architektur
3-Tier-Architektur, oder auch Schichtenarchitektur genannt, ist ein Strukturierungsprinzip für die Architektur von Softwaresystemen. Den einzelnen Schichten (Layern) werden einzelne Aspekte des Softwaresystems konzeptionell zugeordnet, wobei zu beachten ist, dass Aspekte einer Schicht nur durch höhere Schichten verwendet werden können.
Vorteile:
Komplexität der Abhängigkeiten innerhalb des Systems werden reduziert und vereinfacht.
Zyklen im Abhängigkeitsgraphen werden vermieden (leichteres Verständnis und leichtere Wartung
einzelne Schichten können ausgetauscht werden ohne das gesamte Softwaresystem ändern zu müssen
Nachteile:
Ausführgeschwindigkeit der Anwendung kann aufgrund der Datenverarbeitung in den einzelnen Schichten verschlechtert werden
Die drei Schichten der 3-Tier-Architektur sind:
Präsentationsschicht (Front-End): Schnittstelle zwischen Benutzer und System, Datenein- und ausgabe
Logikschicht (Middle-Tier): Verarbeitungsmechanismen
Datenhaltungsschicht (Back-End): enthält die Datenbank und ist verantwortlich für das Laden und das Speichern der Daten

