package s6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17021a implements InterfaceC17024d {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f160057a;

    @Override // s6.InterfaceC17024d
    public boolean m1() {
        try {
            return this.f160057a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // s6.InterfaceC17024d
    public String F0() {
        return this.f160057a.getContentType();
    }

    @Override // s6.InterfaceC17024d
    public InputStream L0() throws IOException {
        return this.f160057a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f160057a.disconnect();
    }

    public C17021a(HttpURLConnection httpURLConnection) {
        this.f160057a = httpURLConnection;
    }

    @Override // s6.InterfaceC17024d
    public String E() {
        try {
            if (m1()) {
                return null;
            }
            return "Unable to fetch " + this.f160057a.getURL() + ". Failed with " + this.f160057a.getResponseCode() + "\n" + a(this.f160057a);
        } catch (IOException e10) {
            v6.g.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
