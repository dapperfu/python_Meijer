package Lf;

import Lf.a;
import Lf.c;

/* loaded from: classes7.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static d f18099a = a().a();

    public static abstract class a {
        public abstract d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(c.a aVar);

        public abstract a h(long j10);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c.a g();

    public abstract long h();

    public abstract a n();

    public static a a() {
        return new a.b().h(0L).g(c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public boolean i() {
        if (g() == c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != c.a.NOT_GENERATED && g() != c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public d o(String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    public d p() {
        return n().b(null).a();
    }

    public d q(String str) {
        return n().e(str).g(c.a.REGISTER_ERROR).a();
    }

    public d r() {
        return n().g(c.a.NOT_GENERATED).a();
    }

    public d s(String str, String str2, long j10, String str3, long j11) {
        return n().d(str).g(c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    public d t(String str) {
        return n().d(str).g(c.a.UNREGISTERED).a();
    }
}
