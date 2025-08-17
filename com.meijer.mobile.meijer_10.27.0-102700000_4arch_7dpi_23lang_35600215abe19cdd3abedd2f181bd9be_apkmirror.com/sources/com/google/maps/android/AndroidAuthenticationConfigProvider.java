package com.google.maps.android;

/* loaded from: classes7.dex */
public class AndroidAuthenticationConfigProvider {
    public AndroidAuthenticationConfig provide() {
        Context applicationContext = Context.getApplicationContext();
        if (applicationContext == null) {
            return AndroidAuthenticationConfig.EMPTY;
        }
        return new AndroidAuthenticationConfig(applicationContext.getPackageName(), CertificateHelper.getSigningCertificateSha1Fingerprint(applicationContext));
    }
}
