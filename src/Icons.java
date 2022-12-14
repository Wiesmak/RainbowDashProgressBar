import javax.swing.*;
import java.util.Objects;

public interface Icons {
    ImageIcon DASHIE = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/dashie/rsz_dashie.gif")));
    // TODO: replace with the waiting one
    ImageIcon SLOWRIGHT = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/dashie_wait/right/rsz_dashieslow.gif")));
    ImageIcon SLOWLEFT = new ImageIcon(Objects.requireNonNull(Icons.class.getResource("/dashie_wait/left/rsz_rdashieslow.gif")));
//    ImageIcon WAIT = new ImageIcon(Icons.class.getResource("/rsz_dashie_wait.gif"));
//    ImageIcon RWAIT = new ImageIcon(Icons.class.getResource("/rsz_rdashie_wait.gif"));
}
