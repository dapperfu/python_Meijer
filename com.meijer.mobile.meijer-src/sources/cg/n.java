package cg;

import com.fullstory.FS;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes8.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final URL f62482a;

    public URLConnection a() throws IOException {
        return FS.urlconnection_wrapInstance(this.f62482a.openConnection());
    }

    public String toString() {
        return this.f62482a.toString();
    }

    public n(URL url) {
        this.f62482a = url;
    }
}
