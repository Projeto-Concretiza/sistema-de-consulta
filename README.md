# sistema-de-consulta

Guia de instalação:

- Após o download(ou clone) abrir com uma ide de sua preferencia.
- Para o funcionamento necessita de um banco de dados local postgres, ou qualquer outro(porém para o seu uso deve ser atualizada as dependencias do maven)
- Assim quer abrir , use o comando "mvn clean install" no diretorio raiz do projeto, para garantir que todas dependencias estejam atualizdas.
- O usuario e url do banco de dados devem constar no arquivo application.properties:

    spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

    spring.datasource.url= jdbc:postgresql://localhost:5432/concretiza
    spring.datasource.username=claudio
    spring.jpa.hibernate.ddl-auto=update
    
- Após isso execute a classe ConcretizaApplication. O back-end da aplicação será startado. Para obter dados é necessario fazer alguns inserts no banco local.
