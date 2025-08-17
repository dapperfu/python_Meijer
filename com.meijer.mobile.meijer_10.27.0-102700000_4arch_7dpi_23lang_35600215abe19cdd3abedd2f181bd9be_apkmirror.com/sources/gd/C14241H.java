package gd;

import android.util.Log;
import com.fullstory.FS;

/* renamed from: gd.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C14241H {

    /* renamed from: e, reason: collision with root package name */
    private static final C14241H f133298e = new C14241H(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f133299a;

    /* renamed from: b, reason: collision with root package name */
    final String f133300b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f133301c;

    /* renamed from: d, reason: collision with root package name */
    final int f133302d;

    private C14241H(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f133299a = z10;
        this.f133302d = i10;
        this.f133300b = str;
        this.f133301c = th2;
    }

    @Deprecated
    static C14241H b() {
        return f133298e;
    }

    static C14241H c(String str) {
        return new C14241H(false, 1, 5, str, null);
    }

    static C14241H d(String str, Throwable th2) {
        return new C14241H(false, 1, 5, str, th2);
    }

    static C14241H f(int i10) {
        return new C14241H(true, i10, 1, null, null);
    }

    static C14241H g(int i10, int i11, String str, Throwable th2) {
        return new C14241H(false, i10, i11, str, th2);
    }

    String a() {
        return this.f133300b;
    }

    final void e() {
        if (this.f133299a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f133301c != null) {
            FS.log_d("GoogleCertificatesRslt", a(), this.f133301c);
        } else {
            FS.log_d("GoogleCertificatesRslt", a());
        }
    }
}
