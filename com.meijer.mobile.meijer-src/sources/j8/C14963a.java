package j8;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import i8.x;
import io.constructor.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import k8.C15110a;
import m8.C15689d;
import z8.f;

/* renamed from: j8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14963a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f140187b = x.f137411a + "CommHandler";

    /* renamed from: c, reason: collision with root package name */
    private static int f140188c = 10000;

    /* renamed from: d, reason: collision with root package name */
    private static int f140189d = 30000;

    /* renamed from: a, reason: collision with root package name */
    private C15689d f140190a;

    private static boolean c(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    private static byte[] a(byte[] bArr) throws IOException {
        return f.q(new GZIPInputStream(new ByteArrayInputStream(bArr)));
    }

    private HttpURLConnection d(URL url) throws GeneralSecurityException, IOException {
        if (!this.f140190a.a().startsWith(BuildConfig.SERVICE_SCHEME)) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection())));
        C15689d c15689d = this.f140190a;
        if (c15689d.f150769f == null && c15689d.f150768e) {
            return httpsURLConnection;
        }
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C15689d c15689d2 = this.f140190a;
        sSLContext.init(c15689d2.f150770g, new TrustManager[]{new C15110a(c15689d2.f150769f, !c15689d2.f150768e)}, new SecureRandom());
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
        return httpsURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x00cb, B:43:0x00f0, B:45:0x00f6, B:46:0x00fa, B:47:0x00ff, B:49:0x0103, B:50:0x0116, B:32:0x00d4, B:34:0x00d8, B:36:0x00de), top: B:73:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:27:0x00cb, B:43:0x00f0, B:45:0x00f6, B:46:0x00fa, B:47:0x00ff, B:49:0x0103, B:50:0x0116, B:32:0x00d4, B:34:0x00d8, B:36:0x00de), top: B:73:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    j8.C14965c b(java.lang.String r7, java.lang.String r8, boolean r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.C14963a.b(java.lang.String, java.lang.String, boolean):j8.c");
    }

    public C14963a(C15689d c15689d) {
        this.f140190a = c15689d;
    }
}
