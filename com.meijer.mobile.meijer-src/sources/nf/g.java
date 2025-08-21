package nf;

import android.util.Log;
import com.fullstory.FS;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    static final g f152433c = new g("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f152434a;

    /* renamed from: b, reason: collision with root package name */
    private int f152435b = 4;

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            FS.log_d(this.f152434a, str, th2);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            FS.log_e(this.f152434a, str, th2);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            FS.log_i(this.f152434a, str, th2);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            FS.log_v(this.f152434a, str, th2);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            FS.log_w(this.f152434a, str, th2);
        }
    }

    private boolean a(int i10) {
        return this.f152435b <= i10 || Log.isLoggable(this.f152434a, i10);
    }

    public static g f() {
        return f152433c;
    }

    public g(String str) {
        this.f152434a = str;
    }
}
