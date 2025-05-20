package com.skillbridge.config;


import at.favre.lib.crypto.bcrypt.BCrypt;

public class PasswordHash {

    public static String encriptarContrasena(String contrasena){
        return BCrypt.withDefaults().hashToString(20, contrasena.toCharArray());
    }

    public boolean verificarContrasena(String contrasena, String contrasenaHash) {
        return BCrypt.verifyer().verify(contrasena.toCharArray(), contrasenaHash).verified;
    }
}
