package id;

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
    private static volatile X f137559e;

    /* renamed from: g, reason: collision with root package name */
    private static Context f137561g;

    /* renamed from: a, reason: collision with root package name */
    static final w f137555a = new q(u.c2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b, reason: collision with root package name */
    static final w f137556b = new r(u.c2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c, reason: collision with root package name */
    static final w f137557c = new s(u.c2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d, reason: collision with root package name */
    static final w f137558d = new t(u.c2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f, reason: collision with root package name */
    private static final Object f137560f = new Object();

    static C14717H b(String str, boolean z10, boolean z11, boolean z12) {
        return g(str, z10, false, false, true);
    }

    static /* synthetic */ String c(boolean z10, String str, u uVar) throws Exception {
        String str2 = (z10 || !f(str, uVar, true, false).f137515a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = com.google.android.gms.common.util.a.b("SHA-256");
        com.google.android.gms.common.internal.r.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, com.google.android.gms.common.util.k.a(messageDigestB.digest(uVar.I2())), Boolean.valueOf(z10), "12451000.false");
    }

    static synchronized void d(Context context) {
        if (f137561g != null) {
            FS.log_w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f137561g = context.getApplicationContext();
        }
    }

    private static C14717H f(final String str, final u uVar, final boolean z10, boolean z11) {
        try {
            h();
            com.google.android.gms.common.internal.r.l(f137561g);
            try {
                return f137559e.x3(new C14713D(str, uVar, z10, z11), com.google.android.gms.dynamic.d.I2(f137561g.getPackageManager())) ? C14717H.b() : new C14715F(new Callable() { // from class: id.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return y.c(z10, str, uVar);
                    }
                }, null);
            } catch (RemoteException e10) {
                FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C14717H.d("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C14717H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.b] */
    private static C14717H g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        C14717H c14717hD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.r.l(f137561g);
            try {
                h();
                z zVar = new z(str, z10, false, com.google.android.gms.dynamic.d.I2(f137561g), false, true);
                try {
                    C14711B c14711bL4 = z13 ? f137559e.L4(zVar) : f137559e.s4(zVar);
                    if (c14711bL4.B()) {
                        c14717hD = C14717H.f(c14711bL4.T());
                    } else {
                        String strZza = c14711bL4.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = c14711bL4.b0() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        c14717hD = C14717H.g(c14711bL4.T(), c14711bL4.b0(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    c14717hD = C14717H.d("module call", e10);
                }
            } catch (DynamiteModule.LoadingException e11) {
                FS.log_e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                c14717hD = C14717H.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c14717hD;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    private static void h() throws DynamiteModule.LoadingException {
        if (f137559e != null) {
            return;
        }
        com.google.android.gms.common.internal.r.l(f137561g);
        synchronized (f137560f) {
            try {
                if (f137559e == null) {
                    f137559e = W.a2(DynamiteModule.e(f137561g, DynamiteModule.f65840f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static C14717H a(String str, u uVar, boolean z10, boolean z11) {
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
                zZzi = f137559e.zzi();
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
