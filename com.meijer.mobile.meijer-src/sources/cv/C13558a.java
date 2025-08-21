package cv;

import Lu.c;
import Lu.g;
import Lu.o;
import av.j;
import bv.AbstractC6411a;
import io.reactivex.b;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.f;
import io.reactivex.h;
import io.reactivex.i;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import io.reactivex.w;
import java.util.concurrent.Callable;

/* renamed from: cv.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13558a {

    /* renamed from: a, reason: collision with root package name */
    static volatile g<? super Throwable> f127586a;

    /* renamed from: b, reason: collision with root package name */
    static volatile o<? super Runnable, ? extends Runnable> f127587b;

    /* renamed from: c, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f127588c;

    /* renamed from: d, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f127589d;

    /* renamed from: e, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f127590e;

    /* renamed from: f, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f127591f;

    /* renamed from: g, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f127592g;

    /* renamed from: h, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f127593h;

    /* renamed from: i, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f127594i;

    /* renamed from: j, reason: collision with root package name */
    static volatile o<? super f, ? extends f> f127595j;

    /* renamed from: k, reason: collision with root package name */
    static volatile o<? super l, ? extends l> f127596k;

    /* renamed from: l, reason: collision with root package name */
    static volatile o<? super AbstractC6411a, ? extends AbstractC6411a> f127597l;

    /* renamed from: m, reason: collision with root package name */
    static volatile o<? super h, ? extends h> f127598m;

    /* renamed from: n, reason: collision with root package name */
    static volatile o<? super u, ? extends u> f127599n;

    /* renamed from: o, reason: collision with root package name */
    static volatile o<? super b, ? extends b> f127600o;

    /* renamed from: p, reason: collision with root package name */
    static volatile c<? super f, ? super lw.b, ? extends lw.b> f127601p;

    /* renamed from: q, reason: collision with root package name */
    static volatile c<? super h, ? super i, ? extends i> f127602q;

    /* renamed from: r, reason: collision with root package name */
    static volatile c<? super l, ? super s, ? extends s> f127603r;

    /* renamed from: s, reason: collision with root package name */
    static volatile c<? super u, ? super w, ? extends w> f127604s;

    /* renamed from: t, reason: collision with root package name */
    static volatile c<? super b, ? super io.reactivex.c, ? extends io.reactivex.c> f127605t;

    /* renamed from: u, reason: collision with root package name */
    static volatile boolean f127606u;

    /* renamed from: v, reason: collision with root package name */
    static volatile boolean f127607v;

    public static boolean q() {
        return false;
    }

    public static <T> lw.b<? super T> A(f<T> fVar, lw.b<? super T> bVar) {
        c<? super f, ? super lw.b, ? extends lw.b> cVar = f127601p;
        return cVar != null ? (lw.b) a(cVar, fVar, bVar) : bVar;
    }

    public static void B(g<? super Throwable> gVar) {
        if (f127606u) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f127586a = gVar;
    }

    public static t e(Callable<t> callable) {
        Nu.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f127588c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t f(Callable<t> callable) {
        Nu.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f127590e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t g(Callable<t> callable) {
        Nu.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f127591f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t h(Callable<t> callable) {
        Nu.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f127589d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f127607v;
    }

    public static <T> AbstractC6411a<T> k(AbstractC6411a<T> abstractC6411a) {
        o<? super AbstractC6411a, ? extends AbstractC6411a> oVar = f127597l;
        return oVar != null ? (AbstractC6411a) b(oVar, abstractC6411a) : abstractC6411a;
    }

    public static b l(b bVar) {
        o<? super b, ? extends b> oVar = f127600o;
        return oVar != null ? (b) b(oVar, bVar) : bVar;
    }

    public static <T> f<T> m(f<T> fVar) {
        o<? super f, ? extends f> oVar = f127595j;
        return oVar != null ? (f) b(oVar, fVar) : fVar;
    }

    public static <T> h<T> n(h<T> hVar) {
        o<? super h, ? extends h> oVar = f127598m;
        return oVar != null ? (h) b(oVar, hVar) : hVar;
    }

    public static <T> l<T> o(l<T> lVar) {
        o<? super l, ? extends l> oVar = f127596k;
        return oVar != null ? (l) b(oVar, lVar) : lVar;
    }

    public static <T> u<T> p(u<T> uVar) {
        o<? super u, ? extends u> oVar = f127599n;
        return oVar != null ? (u) b(oVar, uVar) : uVar;
    }

    public static t r(t tVar) {
        o<? super t, ? extends t> oVar = f127592g;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static void s(Throwable th2) {
        g<? super Throwable> gVar = f127586a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                C(th3);
            }
        }
        th2.printStackTrace();
        C(th2);
    }

    public static t t(t tVar) {
        o<? super t, ? extends t> oVar = f127594i;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static Runnable u(Runnable runnable) {
        Nu.b.e(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f127587b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    public static t v(t tVar) {
        o<? super t, ? extends t> oVar = f127593h;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static io.reactivex.c w(b bVar, io.reactivex.c cVar) {
        c<? super b, ? super io.reactivex.c, ? extends io.reactivex.c> cVar2 = f127605t;
        return cVar2 != null ? (io.reactivex.c) a(cVar2, bVar, cVar) : cVar;
    }

    public static <T> i<? super T> x(h<T> hVar, i<? super T> iVar) {
        c<? super h, ? super i, ? extends i> cVar = f127602q;
        return cVar != null ? (i) a(cVar, hVar, iVar) : iVar;
    }

    public static <T> s<? super T> y(l<T> lVar, s<? super T> sVar) {
        c<? super l, ? super s, ? extends s> cVar = f127603r;
        return cVar != null ? (s) a(cVar, lVar, sVar) : sVar;
    }

    public static <T> w<? super T> z(u<T> uVar, w<? super T> wVar) {
        c<? super u, ? super w, ? extends w> cVar = f127604s;
        return cVar != null ? (w) a(cVar, uVar, wVar) : wVar;
    }

    static void C(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t10, U u10) {
        try {
            return cVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw j.d(th2);
        }
    }

    static <T, R> R b(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw j.d(th2);
        }
    }

    static t c(o<? super Callable<t>, ? extends t> oVar, Callable<t> callable) {
        return (t) Nu.b.e(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    static t d(Callable<t> callable) {
        try {
            return (t) Nu.b.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw j.d(th2);
        }
    }
}
