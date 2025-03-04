

# Maven project

## Archetypes

- Maven Provides us with a templating tool called Archetypes

- There are lot of archetypes avaible to use

- Or We could create our own Archetype for a new Project.

## How to use Archetypes

- While creating a Project in IDE
- Click on Maven Archetype
    - On the right panel we get 'Archetype:' below the Name, JDK and Catalog
    - For a default we could you 'maven-archetype-quickstart'
    - For a Webapp we could you 'maven-archetype-webapp'

- When we need more from internet
    - Click on the Catalog : Maven Central
    - Now if we check the Archetype - we get more archetypes from the net.



___________________________

## Maven Dependencies

- To add Maven Dependencies

    - In mvnrepository.com
    - Search for MySQL Connector 
    - In this We could take the MAVEN code - Copy
    - In the Maven Project
    - We have a pom.xml - Project Object Maven
        - We hae GroupId, ArtifactId & Version, This is called **'GAV'**
        - GroupId -> Org Name -> Website 
        - ArtifactId -> Project Name
        - Version -> Version Number
    - To add a dependency
        - Add <dependencies> ... </dependencies>
        - Add the required maven dependencies you need here, Ex:
            - MySQl-Connector
            - Hibernate-Core



