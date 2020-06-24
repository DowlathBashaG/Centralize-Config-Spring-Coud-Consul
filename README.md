# centralize-config-spring-cloud-consul

## HashiCorp Consul is Automate network configurations, discover services, and enable secure connectivity across any cloud or runtime

Step 1:

Download from : https://www.consul.io/

Step 2:

Check ipaddress in your system

Step 3:

Execute the blow command along with ip address.

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=<IP-ADDRESS>

For Example :

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.0.65

Step 4:

Launch consul in brower using default port number for consul : 8500.

http://localhost:8500/

Step 5:

Create Key / Value  for user name and password.

A. Create flder - Config

B. Under config folder create application name - Dowlath

C. Under application name : create key and value.

my.username : dowlath basha g

my password : password

Note : Dynamically (on fly) change the password or username it will reflect.

For Example :



