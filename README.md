### Webservice Ontology

**Java v11 - Spring v2.5.4 – Jena v3.12.0**

**Webservice HOST:** [https://apimodelador.borrego-research.com/webserviceontology/videotagger](https://apimodelador.borrego-research.com/webserviceontology/videotagger)

- **ArtifactLocation:** _Es la URL del video en drive._
- **ArtifactTagsTimestamp:** _Array de objetos tipo TagTimestamp que contiene el tag y el timestamp._

#### GET Endpoints

1. **/videos**
   - Este endpoint obtiene todos los videos con su respectivo _artifactLocation_ y su array de _artifactTagsTimestamp._

2. **/videos/{tag}**
   - Este endpoint obtiene todos los videos en base al TAG dado en la URL, y obtendrá todos los videos que contengan ese respectivo TAG con el _artifactLocation_ y su array de _artifactTagsTimestamp._

3. **/videos/all**
   - Este endpoint regresa todos los tags que hay en la ontologia guardados, sin la relación entre sus _artifactLocation_.

#### POST Endpoints

1. **/videos/save**
   - Este endpoint espera recibir un body para guardar la metadata de un video, puede enviarse sin _artifactTags_. El siguiente JSON es el que se espera recibir.
   ```json
   {
     "artifactName": "",
     "artifactLocation": "",
     "artifactFormat": "",
     "artifactTags": [],
     "isMadeBy": "",
     "isUsedBy": "",
     "hasUsedIn": ""
   }
