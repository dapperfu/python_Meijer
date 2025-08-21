package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final a f167706a;

    interface a {
        void a(long j10);

        void b(Surface surface);

        void c(long j10);

        void d(String str);

        String e();

        void f();

        void g(int i10);

        Surface getSurface();

        Object h();
    }

    public k(int i10, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            this.f167706a = new o(i10, surface);
            return;
        }
        if (i11 >= 28) {
            this.f167706a = new n(i10, surface);
        } else if (i11 >= 26) {
            this.f167706a = new m(i10, surface);
        } else {
            this.f167706a = new l(i10, surface);
        }
    }

    public static k j(Object obj) {
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        a aVarM = i10 >= 33 ? o.m((OutputConfiguration) obj) : i10 >= 28 ? n.l((OutputConfiguration) obj) : i10 >= 26 ? m.k((OutputConfiguration) obj) : l.j((OutputConfiguration) obj);
        if (aVarM == null) {
            return null;
        }
        return new k(aVarM);
    }

    public void a(Surface surface) {
        this.f167706a.b(surface);
    }

    public void b() {
        this.f167706a.f();
    }

    public String c() {
        return this.f167706a.e();
    }

    public Surface d() {
        return this.f167706a.getSurface();
    }

    public void e(long j10) {
        this.f167706a.c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f167706a.equals(((k) obj).f167706a);
        }
        return false;
    }

    public void f(int i10) {
        this.f167706a.g(i10);
    }

    public void g(String str) {
        this.f167706a.d(str);
    }

    public void h(long j10) {
        this.f167706a.a(j10);
    }

    public int hashCode() {
        return this.f167706a.hashCode();
    }

    public Object i() {
        return this.f167706a.h();
    }

    public k(OutputConfiguration outputConfiguration) {
        this.f167706a = o.m(outputConfiguration);
    }

    private k(a aVar) {
        this.f167706a = aVar;
    }
}
