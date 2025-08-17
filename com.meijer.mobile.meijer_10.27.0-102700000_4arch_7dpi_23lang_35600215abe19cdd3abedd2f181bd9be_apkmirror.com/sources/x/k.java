package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final a f166618a;

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
            this.f166618a = new o(i10, surface);
            return;
        }
        if (i11 >= 28) {
            this.f166618a = new n(i10, surface);
        } else if (i11 >= 26) {
            this.f166618a = new m(i10, surface);
        } else {
            this.f166618a = new l(i10, surface);
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
        this.f166618a.b(surface);
    }

    public void b() {
        this.f166618a.f();
    }

    public String c() {
        return this.f166618a.e();
    }

    public Surface d() {
        return this.f166618a.getSurface();
    }

    public void e(long j10) {
        this.f166618a.c(j10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f166618a.equals(((k) obj).f166618a);
        }
        return false;
    }

    public void f(int i10) {
        this.f166618a.g(i10);
    }

    public void g(String str) {
        this.f166618a.d(str);
    }

    public void h(long j10) {
        this.f166618a.a(j10);
    }

    public int hashCode() {
        return this.f166618a.hashCode();
    }

    public Object i() {
        return this.f166618a.h();
    }

    public k(OutputConfiguration outputConfiguration) {
        this.f166618a = o.m(outputConfiguration);
    }

    private k(a aVar) {
        this.f166618a = aVar;
    }
}
