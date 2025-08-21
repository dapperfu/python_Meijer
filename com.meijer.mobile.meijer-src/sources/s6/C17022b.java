package s6;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17022b implements InterfaceC17026f {
    @Override // s6.InterfaceC17026f
    public InterfaceC17024d a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection())));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C17021a(httpURLConnection);
    }
}
