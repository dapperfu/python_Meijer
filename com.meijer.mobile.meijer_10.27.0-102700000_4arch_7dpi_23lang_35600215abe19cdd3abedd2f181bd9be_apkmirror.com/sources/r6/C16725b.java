package r6;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16725b implements f {
    @Override // r6.f
    public InterfaceC16727d a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(new URL(str).openConnection())));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C16724a(httpURLConnection);
    }
}
