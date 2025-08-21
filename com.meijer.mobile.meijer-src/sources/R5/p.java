package R5;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.UnknownServiceException;

/* loaded from: classes4.dex */
class p implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final String f31928b = "p";

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f31929a;

    @Override // R5.o
    public InputStream a() {
        try {
            return this.f31929a.getErrorStream();
        } catch (Error | Exception e10) {
            t.f("Services", f31928b, String.format("Could not get the input stream. (%s)", e10), new Object[0]);
            return null;
        }
    }

    @Override // R5.o
    public String b(String str) {
        return this.f31929a.getHeaderField(str);
    }

    @Override // R5.o
    public InputStream c() {
        try {
            return this.f31929a.getInputStream();
        } catch (Error e10) {
            e = e10;
            t.f("Services", f31928b, String.format("Could not get the input stream. (%s)", e), new Object[0]);
            return null;
        } catch (UnknownServiceException e11) {
            t.f("Services", f31928b, String.format("Could not get the input stream, protocol does not support input. (%s)", e11), new Object[0]);
            return null;
        } catch (Exception e12) {
            e = e12;
            t.f("Services", f31928b, String.format("Could not get the input stream. (%s)", e), new Object[0]);
            return null;
        }
    }

    @Override // R5.o
    public int d() {
        try {
            return this.f31929a.getResponseCode();
        } catch (Error | Exception e10) {
            t.f("Services", f31928b, String.format("Could not get response code. (%s)", e10), new Object[0]);
            return -1;
        }
    }

    @Override // R5.o
    public String e() {
        try {
            return this.f31929a.getResponseMessage();
        } catch (Error | Exception e10) {
            t.f("Services", f31928b, String.format("Could not get the response message. (%s)", e10), new Object[0]);
            return null;
        }
    }

    p(HttpURLConnection httpURLConnection) {
        this.f31929a = httpURLConnection;
    }

    @Override // R5.o
    public void close() throws IOException {
        InputStream inputStreamC = c();
        InputStream inputStreamA = a();
        if (inputStreamC != null) {
            try {
                inputStreamC.close();
            } catch (Error | Exception e10) {
                t.f("Services", f31928b, String.format("Could not close the input stream. (%s)", e10), new Object[0]);
            }
        }
        if (inputStreamA != null) {
            try {
                inputStreamA.close();
            } catch (Error | Exception e11) {
                t.f("Services", f31928b, String.format("Could not close the error stream. (%s)", e11), new Object[0]);
            }
        }
        this.f31929a.disconnect();
    }
}
