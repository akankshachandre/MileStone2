## Milestone 2: Test + Analysis
Team members:  
1. Akanksha Chandre - achand10  
2. Amruta Shintre - ashintr  
3. Vaibhav Rajadhyaksha - vrajadh  

### Test
We have used Jenkins as the build server. The java maven project we have used is the sample project given in Evosuite.  
(http://evosuite.org/files/tutorial/Tutorial_Maven.zip)
We have created a job in Jenkins for a local git repository. 

#### Test suites
We have used Cobertura to measure and report code coverage.
- Maven: Edit ```pom.xml``` to include cobertura maven plugin in the reporting section.
- Jenkins: 
    - Install cobertura plugin. In the build step, add ```site``` and 
      ```cobertura:cobertura``` as goals.  
    - Add a post-build step "Publish cobertura coverage results".   

After building the project, the coverage report can be seen in Jenkins.

#### Advanced testing
For test case generation, we have used Evosuite.
Run the following commands:  
```mvn evosuite:generate```  
```mvn evosuite:export```  
After building the project, the improved code coverage can be seen in Jenkins.

#### Basic Analysis
We have used Checkstyle, a static analyis tool.  
- Maven: Edit ```pom.xml``` to include the checkstyle maven plugin in the reporting and build sections.  
- Jenkins: 
    - Install checkstyle plugin. In the build step, add              ```checkstyle:checkstyle``` goal.
    - Add "Publish checkstyle warnings" as a post-build action.    

After building the project, checkstyle warnings can be seen in Jenkins.  

#### Custom metrics  
We have implemented security token detection. We have written a pre-commit hook to detect if a .pem file is present, and if a file contains a digital ocean token. If any of these two are present, the commit will be rejected and build will not be triggered.  

#### Gates  
We have written a post-commit hook to implement test and analysis gates. It checks the status of a build after it has been triggered by a commit. If the build has failed, it is reset to the previous commit.   
- Test criteria: The build fails on a failed test case. 
- Analysis criteria: The build fails if there are checkstyle warnings like      'Method name should begin with a lowercase letter'.  
  In the build step in Jenkins, add the goal ```checkstyle:check```.

#### Screencast
https://youtu.be/yPaBgsHu9GI
