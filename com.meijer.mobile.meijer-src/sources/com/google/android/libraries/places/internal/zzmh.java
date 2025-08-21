package com.google.android.libraries.places.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.fullstory.FS;
import com.google.common.io.BaseEncoding;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public final class zzmh {
    public static String zza(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArr;
        Signature signature;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0 && (signature = signatureArr[0]) != null) {
                return zzb(signature);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_e("CredentialsHelper", "Unable to get certificate fingerprint for package: ".concat(String.valueOf(str)), e10);
            return null;
        }
    }

    private static String zzb(Signature signature) {
        try {
            return BaseEncoding.a().f(MessageDigest.getInstance("SHA-1").digest(signature.toByteArray()));
        } catch (NoSuchAlgorithmException e10) {
            FS.log_e("CredentialsHelper", "Unable to get certificate fingerprint.", e10);
            return null;
        }
    }
}
