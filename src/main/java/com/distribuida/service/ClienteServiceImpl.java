package com.distribuida.service;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl  implements ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente findOne(int id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente update(int id, Cliente Cliente) {

        Cliente clienteExistente = findOne(id);

        if (clienteExistente == null){
        return null;
        }

        clienteExistente.setCedula(clienteExistente.getCedula());
        clienteExistente.setNombre(clienteExistente.getNombre());
        clienteExistente.setApellido(clienteExistente.getApellido());
        clienteExistente.setDireccion(clienteExistente.getDireccion());
        clienteExistente.setTelefono(clienteExistente.getTelefono());
        clienteExistente.setCorreo(clienteExistente.getCorreo());

        return clienteDAO.save(clienteExistente);

    }
//hola

    @Override
    public void delete(int id) {
        if (clienteDAO.existsById(id)){
         clienteDAO.deleteById(id);
        }
    }
}
