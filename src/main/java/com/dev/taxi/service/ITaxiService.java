/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dev.taxi.service;

import com.dev.taxi.dto.RespuestaGrafoDto;

public interface ITaxiService {
    
    RespuestaGrafoDto destinoMasCercano(String lugarInicio, String lugarFinal);
    
}
