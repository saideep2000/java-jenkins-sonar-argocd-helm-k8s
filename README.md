Keep your spring-boot-app ready

ssh -i ../pem_files/aws_login.pem ubuntu@18.232.65.241

sudo apt update
sudo apt install openjdk-21-jre

java -version

curl -fsSL https://pkg.jenkins.io/debian/jenkins.io-2023.key | sudo tee \
  /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install jenkins

make the inbound traffic to get open for the 8080 port.

ps -ef | grep jenkins

http://YOUR_EC2_PUBLIC_IP:8080/

sudo cat /var/lib/jenkins/secrets/initialAdminPassword

177cdd5976be435986f219696e5351b6