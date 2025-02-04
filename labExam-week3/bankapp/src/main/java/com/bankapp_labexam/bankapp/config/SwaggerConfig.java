package com.bankapp_labexam.bankapp.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Bank application",
                description = "Lab Exam week 3",
                version = "v1",
                contact = @Contact(
                        name = "Nitesh",
                        email = "Nitesh@gmail.com",
                        url = ""
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.cbre.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "",
                url = "https://www.zaa.com/swagger-ui.html"
        )
)

@Configuration
public class SwaggerConfig {

}
