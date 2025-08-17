package ag;

import com.fullstory.FS;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final URL f45467a;

    public URLConnection a() throws IOException {
        return FS.urlconnection_wrapInstance(this.f45467a.openConnection());
    }

    public String toString() {
        return this.f45467a.toString();
    }

    public n(URL url) {
        this.f45467a = url;
    }
}
