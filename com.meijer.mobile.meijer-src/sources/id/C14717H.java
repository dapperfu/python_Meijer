package id;

import android.util.Log;
import com.fullstory.FS;

/* renamed from: id.H, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C14717H {

    /* renamed from: e, reason: collision with root package name */
    private static final C14717H f137514e = new C14717H(true, 3, 1, null, null);

    /* renamed from: a, reason: collision with root package name */
    final boolean f137515a;

    /* renamed from: b, reason: collision with root package name */
    final String f137516b;

    /* renamed from: c, reason: collision with root package name */
    final Throwable f137517c;

    /* renamed from: d, reason: collision with root package name */
    final int f137518d;

    private C14717H(boolean z10, int i10, int i11, String str, Throwable th2) {
        this.f137515a = z10;
        this.f137518d = i10;
        this.f137516b = str;
        this.f137517c = th2;
    }

    @Deprecated
    static C14717H b() {
        return f137514e;
    }

    static C14717H c(String str) {
        return new C14717H(false, 1, 5, str, null);
    }

    static C14717H d(String str, Throwable th2) {
        return new C14717H(false, 1, 5, str, th2);
    }

    static C14717H f(int i10) {
        return new C14717H(true, i10, 1, null, null);
    }

    static C14717H g(int i10, int i11, String str, Throwable th2) {
        return new C14717H(false, i10, i11, str, th2);
    }

    String a() {
        return this.f137516b;
    }

    final void e() {
        if (this.f137515a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f137517c != null) {
            FS.log_d("GoogleCertificatesRslt", a(), this.f137517c);
        } else {
            FS.log_d("GoogleCertificatesRslt", a());
        }
    }
}
