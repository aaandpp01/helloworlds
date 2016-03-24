package hellotest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = { GreeterTest.class, GreeterNullTest.class})
public class GreeterTestSuites {

}
