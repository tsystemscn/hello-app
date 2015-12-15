# Hello example with Maven

## Create a Maven jar project

__Eclipse__

    File -> New -> Maven Project

Filter: `quickstart`

`groupId`: `com.tsystems.demo`(project group)
`artifactId`: `hello-app`(the project name)
`version`: `0.0.1-SNAPSHOT` (default)

or __type the following command__

    mvn archetype:generate \
        -DarchetypeArtifactId=maven-archetype-quickstart \
        -DgroupId=com.tsystems.demo \
        -DartifactId=hello-app \
        -DinteractiveMode=false

## Test the application

### Use JUnit to Test

JUnit `3.8` is not easy to use, so we change the version to `4`(support annotation and needn't extends from TestCase).

Add a property in `<properties>` node.

    <!-- junit -->
    <junit-version>4.11</junit-version>

and replace the `3.8` to `${junit-version}`.

    <version>${junit-version}</version>

Use `@Test` method to test the method.

    @Test
    public void testSayHi() {
        String result = new App().sayHi("World");
        assertEquals(result, "Hello World");
    }

### Specify the JDK version

Annotation and static import need JDK version upper than `1.5`.
We have better always specify the JDK version we used.

Add version constants in `<properties>` node.

    <!-- jdk setting -->
    <target.jdk>1.7</target.jdk>
    <compiler.source.jdk>${target.jdk}</compiler.source.jdk>
    <compiler.target.jdk>${target.jdk}</compiler.target.jdk>

Define build setting.

    <build>
        <finalName>hello</finalName>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.0.2</version>
                <configuration>
                    <source>${compiler.source.jdk}</source>
                    <target>${compiler.target.jdk}</target>
                </configuration>
            </plugin>
        </plugins>
    </build>

