package com.algaworks.algafood.core.security.authorizationserver;

import jakarta.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Validated
@ConfigurationProperties("algafood.auth")
public class AlgaFoodSecurtyProperties {

    @NotBlank
    private String providerUrl;
}
