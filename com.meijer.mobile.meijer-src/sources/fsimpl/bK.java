package fsimpl;

import com.fullstory.rust.RustInterface;
import java.net.HttpURLConnection;

/* loaded from: classes15.dex */
public class bK {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f133018a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f133019b;

    public bK(RustInterface rustInterface) {
        this.f133018a = rustInterface;
    }

    private static long a(HttpURLConnection httpURLConnection) {
        String requestProperty = httpURLConnection.getRequestProperty("content-length");
        if (requestProperty != null) {
            return Long.parseLong(requestProperty);
        }
        return 0L;
    }

    private Object a(HttpURLConnection httpURLConnection, Object obj, long j10) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                return obj;
            }
            this.f133019b = true;
            if (!C14118br.d()) {
                return obj;
            }
            try {
                this.f133018a.a(new C14218fk(httpURLConnection.getURL().toString(), httpURLConnection.getRequestMethod(), fS.a(j10), responseCode, a(httpURLConnection), httpURLConnection.getContentLengthLong(), b(httpURLConnection)));
            } catch (Throwable th2) {
            }
            return obj;
        } catch (Throwable th3) {
            return obj;
        }
    }

    private static int b(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("X-Android-Response-Source");
        return (headerField == null || !headerField.startsWith("CACHE")) ? 1 : 2;
    }

    public Object a(HttpURLConnection httpURLConnection, bL bLVar) {
        if (this.f133019b) {
            return bLVar.get();
        }
        return a(httpURLConnection, bLVar.get(), System.nanoTime());
    }

    public Object a(HttpURLConnection httpURLConnection, bM bMVar) {
        if (this.f133019b) {
            return bMVar.get();
        }
        return a(httpURLConnection, bMVar.get(), System.nanoTime());
    }
}
