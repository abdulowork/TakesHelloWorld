import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;

public class Main {

    public static void main(final String... args) throws Exception {
        new FtBasic(
                new TkFork(
                        new FkRegex(
                                "/",
                                "hello, world!"
                        )
                ), 8080
        ).start(Exit.NEVER);
    }
}
