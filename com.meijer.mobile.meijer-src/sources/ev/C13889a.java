package ev;

import Xu.m;
import Xu.n;
import cv.C13558a;
import io.reactivex.t;
import java.util.concurrent.Callable;

/* renamed from: ev.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13889a {

    /* renamed from: a, reason: collision with root package name */
    static final t f130900a = C13558a.h(new h());

    /* renamed from: b, reason: collision with root package name */
    static final t f130901b = C13558a.e(new b());

    /* renamed from: c, reason: collision with root package name */
    static final t f130902c = C13558a.f(new c());

    /* renamed from: d, reason: collision with root package name */
    static final t f130903d = n.g();

    /* renamed from: e, reason: collision with root package name */
    static final t f130904e = C13558a.g(new f());

    /* renamed from: ev.a$a, reason: collision with other inner class name */
    static final class C2070a {

        /* renamed from: a, reason: collision with root package name */
        static final t f130905a = new Xu.b();
    }

    /* renamed from: ev.a$b */
    static final class b implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return C2070a.f130905a;
        }

        b() {
        }
    }

    /* renamed from: ev.a$c */
    static final class c implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return d.f130906a;
        }

        c() {
        }
    }

    /* renamed from: ev.a$d */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        static final t f130906a = new Xu.d();
    }

    /* renamed from: ev.a$e */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        static final t f130907a = new Xu.e();
    }

    /* renamed from: ev.a$f */
    static final class f implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return e.f130907a;
        }

        f() {
        }
    }

    /* renamed from: ev.a$g */
    static final class g {

        /* renamed from: a, reason: collision with root package name */
        static final t f130908a = new m();
    }

    /* renamed from: ev.a$h */
    static final class h implements Callable<t> {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t call() throws Exception {
            return g.f130908a;
        }

        h() {
        }
    }

    public static t a() {
        return C13558a.r(f130901b);
    }

    public static t b() {
        return C13558a.t(f130902c);
    }

    public static t c() {
        return C13558a.v(f130900a);
    }

    public static t d() {
        return f130903d;
    }
}
