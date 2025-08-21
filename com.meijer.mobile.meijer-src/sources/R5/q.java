package R5;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes4.dex */
class q {

    /* renamed from: c, reason: collision with root package name */
    private static final String f31930c = "q";

    /* renamed from: a, reason: collision with root package name */
    protected final HttpsURLConnection f31931a;

    /* renamed from: b, reason: collision with root package name */
    protected a f31932b = a.GET;

    protected enum a {
        GET(false),
        POST(true);


        /* renamed from: a, reason: collision with root package name */
        private final boolean f31936a;

        public boolean b() {
            return this.f31936a;
        }

        a(boolean z10) {
            this.f31936a = z10;
        }
    }

    o a(byte[] bArr) throws IOException {
        t.a("Services", f31930c, String.format("Connecting to URL %s (%s)", this.f31931a.getURL() == null ? "" : this.f31931a.getURL().toString(), this.f31932b.toString()), new Object[0]);
        a aVar = this.f31932b;
        a aVar2 = a.POST;
        if (aVar == aVar2 && bArr != null) {
            this.f31931a.setFixedLengthStreamingMode(bArr.length);
        }
        try {
            this.f31931a.connect();
            if (this.f31932b == aVar2 && bArr != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(this.f31931a.getOutputStream());
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (SocketTimeoutException e10) {
            t.f("Services", f31930c, String.format("Connection failure, socket timeout (%s)", e10), new Object[0]);
        } catch (IOException e11) {
            t.f("Services", f31930c, String.format("Connection failure (%s)", e11.getLocalizedMessage() != null ? e11.getLocalizedMessage() : e11.getMessage()), new Object[0]);
        } catch (Error e12) {
            e = e12;
            t.f("Services", f31930c, String.format("Connection failure (%s)", e), new Object[0]);
        } catch (Exception e13) {
            e = e13;
            t.f("Services", f31930c, String.format("Connection failure (%s)", e), new Object[0]);
        }
        return new p(this.f31931a);
    }

    boolean b(r rVar) throws ProtocolException {
        if (rVar == null) {
            return false;
        }
        try {
            a aVarValueOf = a.valueOf(rVar.name());
            this.f31931a.setRequestMethod(aVarValueOf.name());
            this.f31931a.setDoOutput(aVarValueOf.b());
            this.f31931a.setUseCaches(false);
            this.f31932b = aVarValueOf;
            return true;
        } catch (Error e10) {
            e = e10;
            t.f("Services", f31930c, String.format("Failed to set http command (%s)!", e), new Object[0]);
            return false;
        } catch (IllegalArgumentException e11) {
            t.f("Services", f31930c, String.format("%s command is not supported (%s)!", rVar, e11), new Object[0]);
            return false;
        } catch (IllegalStateException e12) {
            t.f("Services", f31930c, String.format("Cannot set command after connect (%s)!", e12), new Object[0]);
            return false;
        } catch (ProtocolException e13) {
            t.f("Services", f31930c, String.format("%s is not a valid HTTP command (%s)!", rVar, e13), new Object[0]);
            return false;
        } catch (Exception e14) {
            e = e14;
            t.f("Services", f31930c, String.format("Failed to set http command (%s)!", e), new Object[0]);
            return false;
        }
    }

    void c(int i10) {
        try {
            this.f31931a.setConnectTimeout(i10);
        } catch (Error e10) {
            e = e10;
            t.f("Services", f31930c, String.format("Failed to set connection timeout (%s)!", e), new Object[0]);
        } catch (IllegalArgumentException e11) {
            t.f("Services", f31930c, String.format(i10 + " is not valid timeout value (%s)", e11), new Object[0]);
        } catch (Exception e12) {
            e = e12;
            t.f("Services", f31930c, String.format("Failed to set connection timeout (%s)!", e), new Object[0]);
        }
    }

    void d(int i10) {
        try {
            this.f31931a.setReadTimeout(i10);
        } catch (Error e10) {
            e = e10;
            t.f("Services", f31930c, String.format("Failed to set read timeout (%s)!", e), new Object[0]);
        } catch (IllegalArgumentException e11) {
            t.f("Services", f31930c, String.format(i10 + " is not valid timeout value (%s)", e11), new Object[0]);
        } catch (Exception e12) {
            e = e12;
            t.f("Services", f31930c, String.format("Failed to set read timeout (%s)!", e), new Object[0]);
        }
    }

    void e(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                this.f31931a.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Error e10) {
                e = e10;
                t.f("Services", f31930c, String.format("Failed to set request property (%s)!", e), new Object[0]);
            } catch (IllegalStateException e11) {
                t.f("Services", f31930c, String.format("Cannot set header field after connect (%s)!", e11), new Object[0]);
                return;
            } catch (Exception e12) {
                e = e12;
                t.f("Services", f31930c, String.format("Failed to set request property (%s)!", e), new Object[0]);
            }
        }
    }

    q(URL url) throws IOException {
        this.f31931a = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
    }
}
