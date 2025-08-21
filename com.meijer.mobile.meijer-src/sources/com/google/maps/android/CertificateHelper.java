package com.google.maps.android;

import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public class CertificateHelper {
    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(String.format("%02X", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static String getSigningCertificateSha1Fingerprint(Context context) {
        PackageInfo packageInfo;
        Object objSigningSignature;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64)) == null || (objSigningSignature = packageInfo.signingSignature()) == null) {
            return null;
        }
        try {
            return bytesToHex(MessageDigest.getInstance("SHA-1").digest((byte[]) Class.forName("android.content.pm.Signature").getMethod("toByteArray", null).invoke(objSigningSignature, null)));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
