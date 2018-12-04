/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import static dao.VeiculoDao.listar;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Veiculo;

/**
 *
 * @author 07610115959
 */
@Path("/veiculos")
public class VeiculoResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String buscaVeiculo() {
        List<Veiculo> veiculos = listar();
        return veiculos.toString();
    }
}
