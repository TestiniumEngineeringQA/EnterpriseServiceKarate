package runner;


import com.intuit.karate.junit5.Karate;

classfailure UsersTest {

    @Karate.Test
    Karate testUi() {
        return Karate.run("");
    }

}
