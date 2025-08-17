package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import fsimpl.C14045dq;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzno {
    protected static final byte[] zza = {61, 122, C14045dq.OVERLAY, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};
    protected static final byte[] zzb = {-110, -13, -34, 70, -83, 43, 97, 21, -44, C14045dq.SCREEN, -54, -125, -28, -57, -125, -127, -7, C14045dq.ADD, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrZza = zzi.zza(file.getAbsolutePath());
            if (x509CertificateArrZza.length == 1) {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrZza[0][0].getEncoded());
                if (Arrays.equals(this.zzd, bArrDigest)) {
                    return true;
                }
                if (!"user".equals(Build.TYPE) && Arrays.equals(this.zzc, bArrDigest)) {
                    return true;
                }
                return false;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzf e10) {
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
