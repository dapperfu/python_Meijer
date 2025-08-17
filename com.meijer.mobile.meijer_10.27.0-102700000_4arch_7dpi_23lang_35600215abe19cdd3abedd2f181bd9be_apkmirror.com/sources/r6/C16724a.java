package r6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16724a implements InterfaceC16727d {

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f157842a;

    @Override // r6.InterfaceC16727d
    public boolean l1() {
        try {
            return this.f157842a.getResponseCode() / 100 == 2;
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

    @Override // r6.InterfaceC16727d
    public String H0() {
        return this.f157842a.getContentType();
    }

    @Override // r6.InterfaceC16727d
    public InputStream O0() throws IOException {
        return this.f157842a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f157842a.disconnect();
    }

    public C16724a(HttpURLConnection httpURLConnection) {
        this.f157842a = httpURLConnection;
    }

    @Override // r6.InterfaceC16727d
    public String E() {
        try {
            if (l1()) {
                return null;
            }
            return "Unable to fetch " + this.f157842a.getURL() + ". Failed with " + this.f157842a.getResponseCode() + "\n" + a(this.f157842a);
        } catch (IOException e10) {
            u6.g.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
