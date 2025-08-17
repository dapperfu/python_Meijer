package gv;

import Pu.c;
import Pu.g;
import Pu.o;
import ev.j;
import fv.AbstractC14143a;
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

/* renamed from: gv.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14313a {

    /* renamed from: a, reason: collision with root package name */
    static volatile g<? super Throwable> f134108a;

    /* renamed from: b, reason: collision with root package name */
    static volatile o<? super Runnable, ? extends Runnable> f134109b;

    /* renamed from: c, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f134110c;

    /* renamed from: d, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f134111d;

    /* renamed from: e, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f134112e;

    /* renamed from: f, reason: collision with root package name */
    static volatile o<? super Callable<t>, ? extends t> f134113f;

    /* renamed from: g, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f134114g;

    /* renamed from: h, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f134115h;

    /* renamed from: i, reason: collision with root package name */
    static volatile o<? super t, ? extends t> f134116i;

    /* renamed from: j, reason: collision with root package name */
    static volatile o<? super f, ? extends f> f134117j;

    /* renamed from: k, reason: collision with root package name */
    static volatile o<? super l, ? extends l> f134118k;

    /* renamed from: l, reason: collision with root package name */
    static volatile o<? super AbstractC14143a, ? extends AbstractC14143a> f134119l;

    /* renamed from: m, reason: collision with root package name */
    static volatile o<? super h, ? extends h> f134120m;

    /* renamed from: n, reason: collision with root package name */
    static volatile o<? super u, ? extends u> f134121n;

    /* renamed from: o, reason: collision with root package name */
    static volatile o<? super b, ? extends b> f134122o;

    /* renamed from: p, reason: collision with root package name */
    static volatile c<? super f, ? super pw.b, ? extends pw.b> f134123p;

    /* renamed from: q, reason: collision with root package name */
    static volatile c<? super h, ? super i, ? extends i> f134124q;

    /* renamed from: r, reason: collision with root package name */
    static volatile c<? super l, ? super s, ? extends s> f134125r;

    /* renamed from: s, reason: collision with root package name */
    static volatile c<? super u, ? super w, ? extends w> f134126s;

    /* renamed from: t, reason: collision with root package name */
    static volatile c<? super b, ? super io.reactivex.c, ? extends io.reactivex.c> f134127t;

    /* renamed from: u, reason: collision with root package name */
    static volatile boolean f134128u;

    /* renamed from: v, reason: collision with root package name */
    static volatile boolean f134129v;

    public static boolean q() {
        return false;
    }

    public static <T> pw.b<? super T> A(f<T> fVar, pw.b<? super T> bVar) {
        c<? super f, ? super pw.b, ? extends pw.b> cVar = f134123p;
        return cVar != null ? (pw.b) a(cVar, fVar, bVar) : bVar;
    }

    public static void B(g<? super Throwable> gVar) {
        if (f134128u) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f134108a = gVar;
    }

    public static t e(Callable<t> callable) {
        Ru.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f134110c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t f(Callable<t> callable) {
        Ru.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f134112e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t g(Callable<t> callable) {
        Ru.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f134113f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static t h(Callable<t> callable) {
        Ru.b.e(callable, "Scheduler Callable can't be null");
        o<? super Callable<t>, ? extends t> oVar = f134111d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f134129v;
    }

    public static <T> AbstractC14143a<T> k(AbstractC14143a<T> abstractC14143a) {
        o<? super AbstractC14143a, ? extends AbstractC14143a> oVar = f134119l;
        return oVar != null ? (AbstractC14143a) b(oVar, abstractC14143a) : abstractC14143a;
    }

    public static b l(b bVar) {
        o<? super b, ? extends b> oVar = f134122o;
        return oVar != null ? (b) b(oVar, bVar) : bVar;
    }

    public static <T> f<T> m(f<T> fVar) {
        o<? super f, ? extends f> oVar = f134117j;
        return oVar != null ? (f) b(oVar, fVar) : fVar;
    }

    public static <T> h<T> n(h<T> hVar) {
        o<? super h, ? extends h> oVar = f134120m;
        return oVar != null ? (h) b(oVar, hVar) : hVar;
    }

    public static <T> l<T> o(l<T> lVar) {
        o<? super l, ? extends l> oVar = f134118k;
        return oVar != null ? (l) b(oVar, lVar) : lVar;
    }

    public static <T> u<T> p(u<T> uVar) {
        o<? super u, ? extends u> oVar = f134121n;
        return oVar != null ? (u) b(oVar, uVar) : uVar;
    }

    public static t r(t tVar) {
        o<? super t, ? extends t> oVar = f134114g;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static void s(Throwable th2) {
        g<? super Throwable> gVar = f134108a;
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
        o<? super t, ? extends t> oVar = f134116i;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static Runnable u(Runnable runnable) {
        Ru.b.e(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f134109b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    public static t v(t tVar) {
        o<? super t, ? extends t> oVar = f134115h;
        return oVar == null ? tVar : (t) b(oVar, tVar);
    }

    public static io.reactivex.c w(b bVar, io.reactivex.c cVar) {
        c<? super b, ? super io.reactivex.c, ? extends io.reactivex.c> cVar2 = f134127t;
        return cVar2 != null ? (io.reactivex.c) a(cVar2, bVar, cVar) : cVar;
    }

    public static <T> i<? super T> x(h<T> hVar, i<? super T> iVar) {
        c<? super h, ? super i, ? extends i> cVar = f134124q;
        return cVar != null ? (i) a(cVar, hVar, iVar) : iVar;
    }

    public static <T> s<? super T> y(l<T> lVar, s<? super T> sVar) {
        c<? super l, ? super s, ? extends s> cVar = f134125r;
        return cVar != null ? (s) a(cVar, lVar, sVar) : sVar;
    }

    public static <T> w<? super T> z(u<T> uVar, w<? super T> wVar) {
        c<? super u, ? super w, ? extends w> cVar = f134126s;
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
        return (t) Ru.b.e(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    static t d(Callable<t> callable) {
        try {
            return (t) Ru.b.e(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw j.d(th2);
        }
    }
}
