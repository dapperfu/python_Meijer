package id;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    private static j f137541c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f137542a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f137543b;

    public static final boolean e(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? d(packageInfo2, x.f137554a) : d(packageInfo2, x.f137554a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (C14726i.e(this.f137542a)) {
                return true;
            }
            FS.log_w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    static final u d(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                FS.log_w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            v vVar = new v(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < uVarArr.length; i10++) {
                if (uVarArr[i10].equals(vVar)) {
                    return uVarArr[i10];
                }
            }
        }
        return null;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final C14717H f(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        C14717H c14717hC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C14717H.c("null pkg");
        }
        if (str.equals(this.f137543b)) {
            return C14717H.b();
        }
        if (y.e()) {
            c14717hC = y.b(str, C14726i.e(this.f137542a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f137542a.getPackageManager().getPackageInfo(str, 64);
                boolean zE = C14726i.e(this.f137542a);
                if (packageInfo == null) {
                    c14717hC = C14717H.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c14717hC = C14717H.c("single cert required");
                    } else {
                        v vVar = new v(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C14717H c14717hA = y.a(str2, vVar, zE, false);
                        c14717hC = (!c14717hA.f137515a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !y.a(str2, vVar, false, true).f137515a) ? c14717hA : C14717H.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return C14717H.d("no pkg ".concat(str), e10);
            }
        }
        if (c14717hC.f137515a) {
            this.f137543b = str;
        }
        return c14717hC;
    }

    public boolean c(int i10) throws PackageManager.NameNotFoundException {
        C14717H c14717hC;
        int length;
        String[] packagesForUid = this.f137542a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c14717hC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    com.google.android.gms.common.internal.r.l(c14717hC);
                    break;
                }
                c14717hC = f(packagesForUid[i11], false, false);
                if (c14717hC.f137515a) {
                    break;
                }
                i11++;
            }
        } else {
            c14717hC = C14717H.c("no pkgs");
        }
        c14717hC.e();
        return c14717hC.f137515a;
    }

    public j(Context context) {
        this.f137542a = context.getApplicationContext();
    }

    public static j a(Context context) {
        com.google.android.gms.common.internal.r.l(context);
        synchronized (j.class) {
            try {
                if (f137541c == null) {
                    y.d(context);
                    f137541c = new j(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f137541c;
    }
}
