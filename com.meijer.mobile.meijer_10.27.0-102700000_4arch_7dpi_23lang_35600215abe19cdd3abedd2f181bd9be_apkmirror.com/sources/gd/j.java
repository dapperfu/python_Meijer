package gd;

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
    private static j f133325c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f133326a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f133327b;

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
            if ((z10 ? d(packageInfo2, x.f133338a) : d(packageInfo2, x.f133338a[0])) != null) {
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
            if (C14250i.e(this.f133326a)) {
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
    private final C14241H f(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        C14241H c14241hC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return C14241H.c("null pkg");
        }
        if (str.equals(this.f133327b)) {
            return C14241H.b();
        }
        if (y.e()) {
            c14241hC = y.b(str, C14250i.e(this.f133326a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f133326a.getPackageManager().getPackageInfo(str, 64);
                boolean zE = C14250i.e(this.f133326a);
                if (packageInfo == null) {
                    c14241hC = C14241H.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c14241hC = C14241H.c("single cert required");
                    } else {
                        v vVar = new v(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        C14241H c14241hA = y.a(str2, vVar, zE, false);
                        c14241hC = (!c14241hA.f133299a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !y.a(str2, vVar, false, true).f133299a) ? c14241hA : C14241H.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return C14241H.d("no pkg ".concat(str), e10);
            }
        }
        if (c14241hC.f133299a) {
            this.f133327b = str;
        }
        return c14241hC;
    }

    public boolean c(int i10) throws PackageManager.NameNotFoundException {
        C14241H c14241hC;
        int length;
        String[] packagesForUid = this.f133326a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c14241hC = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    com.google.android.gms.common.internal.r.l(c14241hC);
                    break;
                }
                c14241hC = f(packagesForUid[i11], false, false);
                if (c14241hC.f133299a) {
                    break;
                }
                i11++;
            }
        } else {
            c14241hC = C14241H.c("no pkgs");
        }
        c14241hC.e();
        return c14241hC.f133299a;
    }

    public j(Context context) {
        this.f133326a = context.getApplicationContext();
    }

    public static j a(Context context) {
        com.google.android.gms.common.internal.r.l(context);
        synchronized (j.class) {
            try {
                if (f133325c == null) {
                    y.d(context);
                    f133325c = new j(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f133325c;
    }
}
