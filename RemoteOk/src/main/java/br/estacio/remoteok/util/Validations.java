/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.remoteok.util;

/**
 *
 * @author Feeco
 */
public class Validations {
    public static boolean isvalid(String a){
        if(a.length()<3 ){
            return false;
        }
        return true;
    }
    public static Boolean isEmail(String email) {
        // expressões regulares
        // forma de validação -> estrutura
        // @ .
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        // email => estiver os padrões do regex => true / false
        return email.matches(regex);
    }
}
