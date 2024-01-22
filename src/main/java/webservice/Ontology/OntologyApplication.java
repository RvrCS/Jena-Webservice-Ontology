package webservice.Ontology;

import org.apache.jena.Jena;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import webservice.Ontology.DTOs.VideoTaggedDTO;
import webservice.Ontology.Repos.JenaVideoRepository;
import webservice.Ontology.Services.VideoService;

import java.util.List;

@SpringBootApplication
public class OntologyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OntologyApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(OntologyApplication.class);
	}
}
