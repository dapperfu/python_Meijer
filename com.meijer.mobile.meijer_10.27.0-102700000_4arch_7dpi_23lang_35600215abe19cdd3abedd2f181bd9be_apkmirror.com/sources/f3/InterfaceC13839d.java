package f3;

import a3.InterfaceC5571k;
import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: f3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC13839d extends InterfaceC5571k {

    /* renamed from: f3.d$a */
    public interface a {
        InterfaceC13839d a();
    }

    void close() throws IOException;

    void e(o oVar);

    Uri getUri();

    long h(g gVar) throws IOException;

    default Map<String, List<String>> c() {
        return Collections.EMPTY_MAP;
    }
}
