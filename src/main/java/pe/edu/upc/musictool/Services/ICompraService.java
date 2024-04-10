package pe.edu.upc.musictool.Services;

import pe.edu.upc.musictool.Entities.Compra;

import java.util.List;

public interface ICompraService {
    public void insert (Compra compra);
    public void delete (int id);
    public List<Compra> list ();

}
