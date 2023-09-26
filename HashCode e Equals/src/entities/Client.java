package entities;

public class Client {

    private String name;
    private String email;

    public Client(){
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() { // umas das maneiras do hashCode
        //so pode ter seu valor atribuido uma unica vez
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override // O Override indica que nois estar subscrevendo essas operações 
    public boolean equals(Object obj) {// o Equals n é um metodo generico
        if (this == obj)// ver se a referencia do objeto estar igual,se entrar so if ai retorna verdadeiro 
            return true;
        if (obj == null)// ver se o objeto que vc estar comparando é null, se entrar no if ai retorna false
            return false;
        if (getClass() != obj.getClass())// teste se objeto tem a mesma classe, se entrar no if ai retorna false
            return false;
        Client other = (Client) obj;// que ele faz um casting para testa no proximo if
        if (name == null) {// teste se o nome é null e o nome do outro não é null, ele vai retorna false logo de cara
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))// se o if de cima não for utilizado ele vai aplicar o metodo equals no nome de cada um
        // ai se não for igual vai retornar false
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;// ai se todos os ifs de cima não acontecer vai retornar verdadeiro
    }
}
