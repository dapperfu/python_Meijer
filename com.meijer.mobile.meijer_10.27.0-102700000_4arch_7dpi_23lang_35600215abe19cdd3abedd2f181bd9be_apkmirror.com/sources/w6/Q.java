package w6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class Q {
    private static String a(Signature signature) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(signature.toByteArray());
        return b(messageDigest.digest());
    }

    private static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public static List<String> c(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            int i10 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
                if (signingInfo.hasMultipleSigners()) {
                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                    int length = apkContentsSigners.length;
                    while (i10 < length) {
                        arrayList.add(a(apkContentsSigners[i10]));
                        i10++;
                    }
                } else {
                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                    int length2 = signingCertificateHistory.length;
                    while (i10 < length2) {
                        arrayList.add(a(signingCertificateHistory[i10]));
                        i10++;
                    }
                }
            } else {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                int length3 = signatureArr.length;
                while (i10 < length3) {
                    arrayList.add(a(signatureArr[i10]));
                    i10++;
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return new ArrayList();
        }
    }
}
