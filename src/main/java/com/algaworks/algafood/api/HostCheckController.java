package com.algaworks.algafood.api;

import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HostCheckController {

    @GetMapping("/hostcheck")
    public String getMethodName() throws UnknownHostException {
        /*
         * Pegar o Ip do container que esta correspondendo a essa requisicao
         */
        return InetAddress.getLocalHost().getHostAddress()
                + " - "
                + InetAddress.getLocalHost().getHostName();
    }

}
