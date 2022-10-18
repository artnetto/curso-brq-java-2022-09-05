package com.brq.ms01.controllers;

        import com.brq.ms01.models.UsuarioModel;
        import org.springframework.web.bind.annotation.*;

        import java.util.ArrayList;

// comentário

/*
 * comentário
 * */

@RestController
public class UsuarioController {

    // Este ARRAY é Didático, Simulando um Banco de Dados
    private ArrayList<UsuarioModel> usuarios = new ArrayList<>();
    private int counter = 1;
    /*
     * o @GetMapping permite associoar o verbo GET com a rota /usuarios
     * */
    @GetMapping("usuarios")
    public ArrayList<UsuarioModel> getAllUsuarios(){

//        UsuarioModel u = new UsuarioModel();
//        u.setId(1);
//        u.setNome("Manoel");
//        u.setEmail("manoel@gmail.com");
//
//        usuarios.add(u);

        return usuarios;
    }

    @PostMapping("usuarios")
    public UsuarioModel create(@RequestBody UsuarioModel usuario){

        usuario.setId( counter );
        usuarios.add(usuario);
        counter++;

        System.out.println(usuario);
        // return "POST Usuários";
        return usuario;
    }

    // /usuarios/1 -> o valor do id vai ser 1
    // /usuarios/1/Fabrizio -> o valor do id vai ser 1  e  nome é igual Fabrizio
    @PatchMapping("usuarios/{id}")
    public UsuarioModel update(@RequestBody UsuarioModel usuarioBody,
                               @PathVariable int id ){
        // como achar o usuário a ser alterado?
        for ( int i = 0; i <  usuarios.size(); i++ ){
            if (usuarios.get(i).getId() == id){
                // achamos o usuário a ser alterado
                usuarios.get(i).setNome( usuarioBody.getNome() );
                usuarios.get(i).setEmail( usuarioBody.getEmail() );

                return usuarios.get(i);
            } // if
        }// for
        return null;
    } // update()

    @DeleteMapping("usuarios/{id}")
    public String delete(@PathVariable int id){

        // FORECH
//        for (UsuarioModel usuarioLocal: usuarios) {
//            usuarios.remove(usuarioLocal);
//        }
        for (int i = 0; i < usuarios.size(); i++){
            // se achar o usuário, então exclui do arraylist
            if (usuarios.get(i).getId() == id){
                usuarios.remove(i);
                return "Usuário Excluido com Sucesso!";
            } // if
        } // for
        return "Usuário Não Encontrado";
    } // delete

    // busca por apenas um usuário (pelo id)
    @GetMapping("usuarios/{id}")
    public UsuarioModel getOne(@PathVariable int id){

        for (int i = 0; i < usuarios.size(); i++){
            if (usuarios.get(i).getId() == id){
                return usuarios.get(i);
            } // if
        } // for
        return null;
    }

    // GetOne

} // UsuarioController