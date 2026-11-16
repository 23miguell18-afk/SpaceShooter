/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package contratos;
import java.awt.Rectangle;
/**
 *
 * @author Aula
 */
public interface Colisionable {
 Rectangle getLimites();
 void alColisionar(Colisionable otro);
}
