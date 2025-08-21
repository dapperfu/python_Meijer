package k8;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import javax.net.ssl.X509TrustManager;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15110a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private X509TrustManager f141700a;

    /* renamed from: b, reason: collision with root package name */
    private X509TrustManager f141701b;

    /* renamed from: c, reason: collision with root package name */
    private X509Certificate[] f141702c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f141703d;

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        a(x509CertificateArr, str, true);
    }

    private void a(X509Certificate[] x509CertificateArr, String str, boolean z10) throws CertificateException {
        if (this.f141703d) {
            return;
        }
        if (z10) {
            try {
                this.f141701b.checkServerTrusted(x509CertificateArr, str);
                return;
            } catch (CertificateException e10) {
                X509TrustManager x509TrustManager = this.f141700a;
                if (x509TrustManager == null) {
                    throw e10;
                }
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                return;
            }
        }
        try {
            this.f141701b.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException e11) {
            X509TrustManager x509TrustManager2 = this.f141700a;
            if (x509TrustManager2 == null) {
                throw e11;
            }
            x509TrustManager2.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f141702c;
    }

    public C15110a(KeyStore keyStore, boolean z10) throws NoSuchAlgorithmException, KeyStoreException {
        this.f141700a = null;
        this.f141701b = null;
        this.f141703d = z10;
        ArrayList arrayList = new ArrayList();
        C15111b c15111b = new C15111b(null);
        this.f141701b = c15111b;
        for (X509Certificate x509Certificate : c15111b.getAcceptedIssuers()) {
            arrayList.add(x509Certificate);
        }
        if (keyStore != null) {
            C15111b c15111b2 = new C15111b(keyStore);
            this.f141700a = c15111b2;
            for (X509Certificate x509Certificate2 : c15111b2.getAcceptedIssuers()) {
                arrayList.add(x509Certificate2);
            }
        }
        this.f141702c = (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
    }
}
