## Quick start guide



1. Install rabbitmq
2. Checkout this project (https://github.com/jmuscles/jmuscles-rabbitmq-consumer-demo). “quick-start-guide” branch.
3. Check the [application-rabbitmq-setup-props.yml](https://github.com/jmuscles/jmuscles-rabbitmq-consumer-demo/blob/main/src/main/resources/application-rabbitmq-setup-props.yml) file and make sure the correct rabbitmq connection parameters for line 2 to 6
4. Execute maven build and run the com.jmuscles.async.consumer.Application class as java application.
5. Below new queues and exchanges should be created on successful start of the consumer app. Screenshot from rabbitmq management console:

![rabbitmq-queues-screen-shot](https://user-images.githubusercontent.com/91483360/147897007-dffb1eae-9528-415a-8030-f1983a87c50b.png)

![image4](https://user-images.githubusercontent.com/91483360/147897214-cdd2e8f0-3758-422c-afee-71af424892c6.png)
![image1](https://user-images.githubusercontent.com/91483360/147897227-463c5406-5f2d-4481-9979-2819a2c657fc.png)

6. Testing of consumer app: 

![image1](https://user-images.githubusercontent.com/91483360/147897233-a509faa1-020d-4636-b8a9-f0efc7823472.png) <br/> There are some sample messages in the project e.g. sample-message.json.. Copy the json content and publish them in DEMO_QUEUE. And observe the console log of the running application. You will observe some failures and messages moving to retry and finally abandoned queues. Check the message once it reaches the abandoned queue and observe the change in message..only failure call data remains. If you see this- application working as expected.

7. What is in demo consumer app:  
    1. [Application class](https://github.com/jmuscles/jmuscles-rabbitmq-consumer-demo/blob/main/src/main/java/com/jmuscles/async/consumer/Application.java)  Regular spring boot application
    2. Below dependency in [Pom.xml](https://github.com/jmuscles/jmuscles-rabbitmq-consumer-demo/blob/main/pom.xml) 
      ```
       <dependency>
          <groupId>com.jmuscles</groupId>
          <artifactId>jmuscles-rabbitmq-consumer-j1.8-sb2.2.5.RELEASE</artifactId>
          <version>1.0</version>
       </dependency>
      ```
    3. Configuration file - .yml files in [src/main/resources](https://github.com/jmuscles/jmuscles-rabbitmq-consumer-demo/tree/main/src/main/resources) folder

  
  
