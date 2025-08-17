package com.google.android.gms.internal.ads;

import android.os.Build;
import fsimpl.C14045dq;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Xb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7325Xb0 {

    /* renamed from: c, reason: collision with root package name */
    protected static final byte[] f71354c = {61, 122, C14045dq.OVERLAY, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: d, reason: collision with root package name */
    protected static final byte[] f71355d = {-110, -13, -34, 70, -83, 43, 97, 21, -44, C14045dq.SCREEN, -54, -125, -28, -57, -125, -127, -7, C14045dq.ADD, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f71356a = f71355d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f71357b = f71354c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrA = E6.a(file.getAbsolutePath());
            if (x509CertificateArrA.length == 1) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrA[0][0].getEncoded());
                if (Arrays.equals(this.f71357b, bArrDigest)) {
                    return true;
                }
                if (!"user".equals(Build.TYPE) && Arrays.equals(this.f71356a, bArrDigest)) {
                    return true;
                }
                return false;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzaoo e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
