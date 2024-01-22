### <span style="color:blue">Webservice Ontology</span>

**Java v11 - Spring v2.5.4 – Jena v3.12.0**

**Webservice HOST:** [https://apimodelador.borrego-research.com/webserviceontology/videotagger](https://apimodelador.borrego-research.com/webserviceontology/videotagger)

- **ArtifactLocation:** _The URL of the video in Google Drive._
- **ArtifactTagsTimestamp:** _Array of objects of type TagTimestamp containing the tag and the timestamp._

#### <span style="color:green">GET Endpoints</span>

1. **/videos**
   - Retrieves all videos with their respective artifactLocation and an array of artifactTagsTimestamp. Provides a comprehensive overview of available videos._

2. **/videos/{tag}**
   - Retrieves videos based on the specified TAG in the URL. Returns all videos containing the provided TAG with their artifactLocation and corresponding artifactTagsTimestamp._

3. **/videos/all**
   - Returns a list of all tags stored in the ontology, excluding the relationship with their artifactLocation. Useful for obtaining a complete list of available tags..


#### <span style="color:orange">POST Endpoints</span>

1. **/videos/save**
   - Expects a JSON body to save the metadata of a video. It can be sent without artifactTags. Use this endpoint to store details about a video, including name, location, format, and additional information.
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
   

#### <span style="color:blue">PUT Endpoints</span>

1. **/videos/tag**

Expects a JSON body to update a tag, URL, or timestamp for a video. Use this endpoint to modify the tag, URL, or timestamp of a video.

```json
{

    "url": "",

    "artifactTag": "",

    "timestamp": ""

}

Made by : Ing. River Damian Torres Urrutia
