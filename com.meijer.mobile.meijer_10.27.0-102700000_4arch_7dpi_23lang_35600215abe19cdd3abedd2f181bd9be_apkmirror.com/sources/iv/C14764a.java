package iv;

import bv.C6286b;
import bv.m;
import bv.n;
import gv.C14313a;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* renamed from: iv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14764a {

    /* renamed from: a, reason: collision with root package name */
    static final t f138511a = C14313a.h(new h());

    /* renamed from: b, reason: collision with root package name */
    static final t f138512b = C14313a.e(new b());

    /* renamed from: c, reason: collision with root package name */
    static final t f138513c = C14313a.f(new c());

    /* renamed from: d, reason: collision with root package name */
    static final t f138514d = n.g();

    /* renamed from: e, reason: collision with root package name */
    static final t f138515e = C14313a.g(new f());

    /* renamed from: iv.a$a, reason: collision with other inner class name */
    static final class C2192a {

        /* renamed from: a, reason: collision with root package name */
        static final t f138516a = new C6286b();
    }

    /* renamed from: iv.a$b */
    static final class b implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return C2192a.f138516a;
        }

        b() {
        }
    }

    /* renamed from: iv.a$c */
    static final class c implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return d.f138517a;
        }

        c() {
        }
    }

    /* renamed from: iv.a$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final t f138517a = new bv.d();
    }

    /* renamed from: iv.a$e */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final t f138518a = new bv.e();
    }

    /* renamed from: iv.a$f */
    static final class f implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return e.f138518a;
        }

        f() {
        }
    }

    /* renamed from: iv.a$g */
    static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final t f138519a = new m();
    }

    /* renamed from: iv.a$h */
    static final class h implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return g.f138519a;
        }

        h() {
        }
    }

    public static t a() {
        return C14313a.r(f138512b);
    }

    public static t b() {
        return C14313a.t(f138513c);
    }

    public static t c() {
        return C14313a.v(f138511a);
    }

    public static t d() {
        return f138514d;
    }
}
