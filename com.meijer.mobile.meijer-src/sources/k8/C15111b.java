package k8;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: k8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15111b implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private X509TrustManager f141704a;

    /* renamed from: b, reason: collision with root package name */
    private X509Certificate[] f141705b;

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f141704a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509Certificate x509Certificate;
        if (x509CertificateArr != null && x509CertificateArr.length == 1 && (x509Certificate = x509CertificateArr[0]) != null) {
            x509Certificate.checkValidity();
            X509Certificate[] acceptedIssuers = getAcceptedIssuers();
            if (acceptedIssuers != null) {
                for (X509Certificate x509Certificate2 : acceptedIssuers) {
                    if (x509CertificateArr[0].equals(x509Certificate2)) {
                        return;
                    }
                }
            }
        }
        this.f141704a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f141705b;
    }

    public C15111b(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        this.f141704a = null;
        this.f141705b = null;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        X509TrustManager x509TrustManagerA = a(trustManagerFactory);
        this.f141704a = x509TrustManagerA;
        if (x509TrustManagerA != null) {
            this.f141705b = x509TrustManagerA.getAcceptedIssuers();
            return;
        }
        throw new NoSuchAlgorithmException("no trust manager found");
    }

    private X509TrustManager a(TrustManagerFactory trustManagerFactory) {
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }
}
