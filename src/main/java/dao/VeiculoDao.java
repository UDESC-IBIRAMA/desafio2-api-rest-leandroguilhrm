/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.Query;
import model.Veiculo;

/**
 *
 * @author 07610115959
 */
public class VeiculoDao extends Dao {
    public static List<Veiculo> listar() {
        Query q = exec("SELECT v FROM Veiculo v ORDER BY v.id");
        List<Veiculo> veiculo = q.getResultList();
        return veiculo;
    }
}
