package fsimpl;

import com.fullstory.rust.RustInterface;
import java.net.HttpURLConnection;

/* loaded from: classes14.dex */
public class bK {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f131768a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f131769b;

    public bK(RustInterface rustInterface) {
        this.f131768a = rustInterface;
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
            this.f131769b = true;
            if (!C13993br.d()) {
                return obj;
            }
            try {
                this.f131768a.a(new C14093fk(httpURLConnection.getURL().toString(), httpURLConnection.getRequestMethod(), fS.a(j10), responseCode, a(httpURLConnection), httpURLConnection.getContentLengthLong(), b(httpURLConnection)));
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
        if (this.f131769b) {
            return bLVar.get();
        }
        return a(httpURLConnection, bLVar.get(), System.nanoTime());
    }

    public Object a(HttpURLConnection httpURLConnection, bM bMVar) {
        if (this.f131769b) {
            return bMVar.get();
        }
        return a(httpURLConnection, bMVar.get(), System.nanoTime());
    }
}
