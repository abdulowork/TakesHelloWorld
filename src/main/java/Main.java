import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.*;
import org.takes.rs.*;

import java.io.IOException;

public class Main {

    public static void main(final String... args) throws Exception {
      new FtBasic(
        new TkFork(
          new FkRegex(
            "/",
            new TkIndex()
          )
        ),
        80
      ).start(Exit.NEVER);
    }
}

public final class TkIndex implements Take {
  
  public Response act(Request req) {
    return RsHtml("<html>Hello, world!</html>");
  }

}