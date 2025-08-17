package gd;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.fullstory.FS;
import com.google.android.gms.common.internal.W;
import com.google.android.gms.common.internal.X;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class y {

    /* renamed from: e, reason: collision with root package name */
    private static volatile X f133343e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f133345g;

    /* renamed from: a, reason: collision with root package name */
    static final w f133339a = new q(u.b2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final w f133340b = new r(u.b2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final w f133341c = new s(u.b2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final w f133342d = new t(u.b2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f133344f = new Object();

    static C14241H b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, u uVar) throws Exception {
        String str2 = (z10 || !f(str, uVar, true, false).f133299a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        com.google.android.gms.common.internal.r.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(messageDigestB.digest(uVar.F2())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f133345g != null) {
            FS.log_w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f133345g = context.getApplicationContext();
        }
    }

    private static C14241H f(final String str, final u uVar, final boolean z10, boolean z11) {
        try {
            h();
            com.google.android.gms.common.internal.r.l(f133345g);
            try {
                return f133343e.x2(new C14237D(str, uVar, z10, z11), com.google.android.gms.dynamic.d.F2(f133345g.getPackageManager())) ? C14241H.b() : new C14239F(new Callable() { // from class: gd.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return y.c(z10, str, uVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C14241H.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C14241H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.b] */
    private static C14241H g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14241H c14241hD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.r.l(f133345g);
            try {
                h();
                z zVar = new z(str, z10, false, com.google.android.gms.dynamic.d.F2(f133345g), false, true);
                try {
                    C14235B c14235bL5 = z13 ? f133343e.l5(zVar) : f133343e.Z8(zVar);
                    if (c14235bL5.B()) {
                        c14241hD = C14241H.f(c14235bL5.T());
                    } else {
                        String strZza = c14235bL5.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = c14235bL5.c0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        c14241hD = C14241H.g(c14235bL5.T(), c14235bL5.c0(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    c14241hD = C14241H.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                c14241hD = C14241H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c14241hD;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static void h() throws DynamiteModule.LoadingException {
        if (f133343e != null) {
            return;
        }
        com.google.android.gms.common.internal.r.l(f133345g);
        synchronized (f133344f) {
            try {
                if (f133343e == null) {
                    f133343e = W.a2(DynamiteModule.e(f133345g, DynamiteModule.f65000f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static C14241H a(String str, u uVar, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, uVar, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static boolean e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zZzi = f133343e.zzi();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            zZzi = false;
        }
        return zZzi;
    }
}
