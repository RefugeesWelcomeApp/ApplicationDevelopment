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
3-Tier-Architektur, oder auch Schichtenarchitektur genannt, ist ein Strukturierungsprinzip f�r die Architektur von Softwaresystemen. Den einzelnen Schichten (Layern) werden einzelne Aspekte des Softwaresystems konzeptionell zugeordnet, wobei zu beachten ist, dass Aspekte einer Schicht nur durch h�here Schichten verwendet werden k�nnen.
Vorteile:
Komplexit�t der Abh�ngigkeiten innerhalb des Systems werden reduziert und vereinfacht.
Zyklen im Abh�ngigkeitsgraphen werden vermieden (leichteres Verst�ndnis und leichtere Wartung
einzelne Schichten k�nnen ausgetauscht werden ohne das gesamte Softwaresystem �ndern zu m�ssen
Nachteile:
Ausf�hrgeschwindigkeit der Anwendung kann aufgrund der Datenverarbeitung in den einzelnen Schichten verschlechtert werden
Die drei Schichten der 3-Tier-Architektur sind:
Pr�sentationsschicht (Front-End): Schnittstelle zwischen Benutzer und System, Datenein- und ausgabe
Logikschicht (Middle-Tier): Verarbeitungsmechanismen
Datenhaltungsschicht (Back-End): enth�lt die Datenbank und ist verantwortlich f�r das Laden und das Speichern der Daten

