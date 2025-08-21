package fsimpl;

import com.fullstory.rust.RustInterface;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes15.dex */
public class bN {
    public static URLConnection a(RustInterface rustInterface, URLConnection uRLConnection) {
        if (C14118br.c() && !(uRLConnection instanceof bJ) && !(uRLConnection instanceof bI)) {
            if (uRLConnection instanceof HttpsURLConnection) {
                return new bJ((HttpsURLConnection) uRLConnection, new bK(rustInterface));
            }
            if (uRLConnection instanceof HttpURLConnection) {
                return new bI((HttpURLConnection) uRLConnection, new bK(rustInterface));
            }
        }
        return uRLConnection;
    }
}
