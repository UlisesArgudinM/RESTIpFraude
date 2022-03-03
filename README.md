# RESTIpFraude

Aqui esta el metodo principal contiene las entidades,dto, controladores,mappers y los metodos para listar todos los datos de la base de datos en memoria, buscar de que ip es originaria y suelta los datos del pais asi como su moneda y su cambio en dolares a Euros y viceversa dependiendo el caso.

La api en donde se ejecuta el servicio Feing y Resilience4J se encuentra en el siguiente link: https://github.com/UlisesArgudinM/RESTIpAdress.git 

Cabe recalcar que las ipes deben inicializar un numero de entre 1-6 ya que la base datos se hizo en un archivo import.sql


# Endpoints

Todos deben ser ejecutados en el gateway puerto 8090

Listar toda la info de la base de datos 

http://localhost:8090/api-gateway/api/v1/rest-ipfraudes/Ip/listar

Buscar info por ip 

http://localhost:8090/api-gateway/api/v1/rest-ipfraudes/Ip/ver-detalle/ip/5.6.7.8

Buscar ips en BlackList

http://localhost:8090/api-gateway/api/v1/rest-ipfraudes/IpBlack/BlackList/ip/5.6.7.8

Listar toda la info desde el RESTIpAdress

http://localhost:8090/api/gateway/api/v1/rest-ipadress/IpAdress/listar

Buscar info por ip desde el RESTIpAdress

http://localhost:8090/api/gateway/api/v1/rest-ipadress/IpAdress/ver-detalle/ip/5.6.7.8

