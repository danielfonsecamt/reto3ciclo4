/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto2_Web.interfaces;


import Reto2_Web.modelo.Clothe;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Daniel
 */
public interface ClotheInterface extends MongoRepository<Clothe, String> {
    
}
