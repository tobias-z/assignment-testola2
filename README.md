# Test assignment 2

## Group Members

- Frederik Johnsen, cph-fj111@cphbusiness.dk
- Jean-Poul Leth-Møller, cph-jl360@cphbusiness.dk
- Mathias Parking, cph-mp525@cphbusiness.dk
- Magdalena Wawrzak cph-mw216@cphbusiness.dk
- Tobias Zimmermann cph-tz11@cphbusiness.dk

## Computer mouse

Computer mouse units:

- Left mouse button
- Right mouse button
- Scroll Wheel
- Scroll Wheel button
- Move the mouse to the right, left, up, down (reaction)
- Other mouse buttons

### Level

#### Unit test

Because all the small units have to work by themselves. If one of them fails, we know for sure which part of the system is not
working.

#### Integration testing

We have to be able to view if the components work together as intended to get the performance as expected from the mouse.
How the units/components work together.

#### System testing

System testing done by a professional testing agent on the completed product before it is introduced to the market, so we are sure
that all components cooperate as expected.

#### Acceptance test

Because each use case scenario described with a customer needs to be tested as a whole to confirm that a given task is completed
to an acceptable degree.
Example:
Given that the mouse is connected to a computer,
When the user moves the mouse,
Then the cursor on the screen moves accordingly.

### Type

You could also perform four types of testing within each test level in the form of functional, performance, security and
regression.

## Catastrophic failure

_The Mars Climate Orbiter crashed in September 1999 because of a "silly mistake": wrong units in a program._

One could have written several unit tests, testing the units of the program. The input units of the program should have been
tested for wrong input.

To be able to figure out if the probe was working correctly together with the Mars Lander, we would have conducted a system test
to make sure that the whole system was able to interact with each other as intended.

If you want to read more horror stories look at the following link: https://www.cs.tau.ac.il/~nachumd/horror.html

## String Utility KATA

1. Reverse string
   - [Feature](src/test/resources/features/reverse-string.feature)
   - [Acceptance tests](src/test/java/io/github/tobiasz/assignmenttestola2/acceptance/ReverseStringAcceptanceTest.java)
   - [Unit Tests](src/test/java/io/github/tobiasz/assignmenttestola2/service/StringServiceTest.java)
   - [Implementation](src/main/java/io/github/tobiasz/assignmenttestola2/service/StringService.java)
2. Capitalize string
    - [Feature](src/test/resources/features/uppercase-string.feature)
    - [Acceptance tests](src/test/java/io/github/tobiasz/assignmenttestola2/acceptance/UppercaseStringAcceptanceTest.java)
    - [Unit Tests](src/test/java/io/github/tobiasz/assignmenttestola2/service/StringServiceTest.java)
    - [Implementation](src/main/java/io/github/tobiasz/assignmenttestola2/service/StringService.java)
3. Lowercase string
    - [Feature](src/test/resources/features/lowercase-string.feature)
    - [Acceptance tests](src/test/java/io/github/tobiasz/assignmenttestola2/acceptance/LowercaseStringAcceptanceTest.java)
    - [Unit Tests](src/test/java/io/github/tobiasz/assignmenttestola2/service/StringServiceTest.java)
    - [Implementation](src/main/java/io/github/tobiasz/assignmenttestola2/service/StringService.java)

## Bowling Game KATE

I may have done this wrong? I found this task really weird since the solution is just given to us. I would have liked this way
more if we only got the task description given to us without the solution afterwards!

- [Feature](src/test/resources/features/game.feature)
- [Acceptance tests](src/test/java/io/github/tobiasz/assignmenttestola2/acceptance/GameAcceptanceTest.java)
- [Unit Tests](src/test/java/io/github/tobiasz/assignmenttestola2/service/GameTest.java)
- [Implementation](src/main/java/io/github/tobiasz/assignmenttestola2/service/Game.java)

## JUnit 5 (Jupiter)

### @Tag

Used to declare tags for filtering tests, either at the class or method level; analogous to test groups in TestNG or Categories in
JUnit 4. Such annotations are inherited at the class level but not at the method level. In short, if we want to group our test we
would use @Tag(“UnitTest”), @Tag(“IntegrationTest”).

### @Disabled

This annotation allows you to disable a test to be run during automation. Examples of tests that you could disable in automation
could be tests that use built in sleep methods or other things that might take too long for CI.

### @RepeatedTest

The term ‘repeated test’ means to repeat the execution of specific tests or tests for a certain number of times. This annotation
allows you to make a test run X amount of times.
For Example: Clicking on the ‘Payment’ link for a particular banking application shows “Exception: Page cannot be displayed” and
this environment disappears after 4 clicks. This is a consistent and known issue for the client.
Now, we know that we cannot afford to have tests failed for such known environmental issues that would not be accepted by the
client as real defects.
Thus, in this case, of course, either we could build the code logic within the test itself to handle the clicking of the Payment
link 4 times and have our test proceed further without failing or we could better take the advantage of the repeated test feature
supported by JUnit 5.

### @BeforeEach / @AfterEach

is an annotation used for a test that should be run before/after every single unit test in a given file. As the example it is
helpful in integration test to revert database to the known stage, so the other test can be performed on known datasetA

### @BeforeAll / @AfterAll

is run once and can be used as a setup / cleanup. When testing integration with e.g. databases, The test database can be populated
with known entities so each unit test can be performed on that setup at first when the test class is runned, (BeforeAll) and then
the database can be cleaned from data after all unit test ver performed (AfterAll)

### @DisplayName

This annotation allows you to define a description for your test method/class, this means that instead of showing the class name
or method name when a test is completed it will print the display name instead.

### @Nested

Denotes that the annotated class is a nested, non-static test class. @BeforeAll and @AfterAll methods cannot be used directly in a
@Nested test class unless the “per-class” test instance lifecycle is used. Such annotations are not inherited.

example:

```java
class SomethingTest {

    @BeforeEach
    void setup() {
        // setup some normal state
    }

    @Nested
    class AddTest {

        @BeforeEach
        void setup() {
            // state specific for Add
        }

        @Test
        void testAdd() {
            // test add
        }
    }
}
```

### assumeFalse/assumeTrue

A set of methods useful for stating assumptions about the conditions in which a test is meaningful. A failed assumption does not
mean the code is broken, but that the test provides no useful information. Assume basically means "don't run this test if these
conditions don't apply". The default JUnit runner skips tests with failing assumptions. Custom runners may behave differently.

## Mocking frameworks

In this section we will compare the two mocking frameworks for Java; Mockito and EasyMock.

### Similarities
- Both allow us to create test-doubles such as stubs, spies and mocks.
- Both allow mocking of method calls, verifying method calls and verifying arguments passed to the methods.
- Both allow us to throw exceptions at will when testing mocked methods.
- Both allow us to create mocks for objects passed as arguments.
- Both allow specific matching of arguments.
- Both can use partial mocking.

### Differences
Overall Mockito syntax is slightly more compact
Custom argument matching and partial mocking are more complex to do in EasyMock
Mockito provides more readable error messages on failed tests
EasyMock splits mocking up into a “recording” phase, where you “record” the expected behavior”, and a “replay” phase, where the recorded mocking behavior is used to execute a test. Whereas Mockito simply asks that you stub before execution and verify after.

### Preference
Our preference between Mockito and EasyMock would be Mockito. With Mockito having simpler ways of making the same tests compared to EasyMock(for example custom argument matching), not having to call “replay” everytime we want to use a mock and having special annotations for partial mock, we definitely would prefer to use Mockito.

