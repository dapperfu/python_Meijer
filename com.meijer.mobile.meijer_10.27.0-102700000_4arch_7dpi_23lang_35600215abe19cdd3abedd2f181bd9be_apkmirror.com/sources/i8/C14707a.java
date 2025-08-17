package i8;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14707a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private X509TrustManager f137611a;

    /* renamed from: b, reason: collision with root package name */
    private X509TrustManager f137612b;

    /* renamed from: c, reason: collision with root package name */
    private X509Certificate[] f137613c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f137614d;

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, true);
    }

    private void a(X509Certificate[] x509CertificateArr, String str, boolean z10) throws CertificateException {
        if (this.f137614d) {
            return;
        }
        if (z10) {
            try {
                this.f137612b.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                X509TrustManager x509TrustManager = this.f137611a;
                if (x509TrustManager == null) {
                    throw e10;
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            }
        }
        try {
            this.f137612b.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e11) {
            X509TrustManager x509TrustManager2 = this.f137611a;
            if (x509TrustManager2 == null) {
                throw e11;
            }
            x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f137613c;
    }

    public C14707a(KeyStore keyStore, boolean z10) throws NoSuchAlgorithmException, KeyStoreException {
        this.f137611a = null;
        this.f137612b = null;
        this.f137614d = z10;
        ArrayList arrayList = new ArrayList();
        C14708b c14708b = new C14708b(null);
        this.f137612b = c14708b;
        for (X509Certificate x509Certificate : c14708b.getAcceptedIssuers()) {
            arrayList.add(x509Certificate);
        }
        if (keyStore != null) {
            C14708b c14708b2 = new C14708b(keyStore);
            this.f137611a = c14708b2;
            for (X509Certificate x509Certificate2 : c14708b2.getAcceptedIssuers()) {
                arrayList.add(x509Certificate2);
            }
        }
        this.f137613c = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }
}
