package com.google.firebase.remoteconfig.internal;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5510d;
import Vd.InterfaceC5512f;
import Vd.InterfaceC5513g;
import Vd.InterfaceC5515i;
import com.fullstory.FS;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, f> f90055d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f90056e = new androidx.privacysandbox.ads.adservices.measurement.k();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f90057a;

    /* renamed from: b, reason: collision with root package name */
    private final u f90058b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5516j<g> f90059c = null;

    private static class b<TResult> implements InterfaceC5513g<TResult>, InterfaceC5512f, InterfaceC5510d {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f90060a;

        private b() {
            this.f90060a = new CountDownLatch(1);
        }

        public boolean a(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f90060a.await(j10, timeUnit);
        }

        @Override // Vd.InterfaceC5510d
        public void onCanceled() {
            this.f90060a.countDown();
        }

        @Override // Vd.InterfaceC5512f
        public void onFailure(Exception exc) {
            this.f90060a.countDown();
        }

        @Override // Vd.InterfaceC5513g
        public void onSuccess(TResult tresult) {
            this.f90060a.countDown();
        }
    }

    private synchronized void k(g gVar) {
        this.f90059c = C5519m.f(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f90059c = C5519m.f(null);
        }
        this.f90058b.a();
    }

    public synchronized AbstractC5516j<g> e() {
        try {
            AbstractC5516j<g> abstractC5516j = this.f90059c;
            if (abstractC5516j == null || (abstractC5516j.q() && !this.f90059c.r())) {
                Executor executor = this.f90057a;
                final u uVar = this.f90058b;
                Objects.requireNonNull(uVar);
                this.f90059c = C5519m.c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f90059c;
    }

    g g(long j10) {
        synchronized (this) {
            try {
                AbstractC5516j<g> abstractC5516j = this.f90059c;
                if (abstractC5516j != null && abstractC5516j.r()) {
                    return this.f90059c.n();
                }
                try {
                    return (g) c(e(), j10, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                    FS.log_d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractC5516j<g> i(g gVar) {
        return j(gVar, true);
    }

    public static /* synthetic */ AbstractC5516j a(f fVar, boolean z10, g gVar, Void r32) {
        if (z10) {
            fVar.k(gVar);
        } else {
            fVar.getClass();
        }
        return C5519m.f(gVar);
    }

    private static <TResult> TResult c(AbstractC5516j<TResult> abstractC5516j, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f90056e;
        abstractC5516j.h(executor, bVar);
        abstractC5516j.f(executor, bVar);
        abstractC5516j.b(executor, bVar);
        if (!bVar.a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC5516j.r()) {
            return abstractC5516j.n();
        }
        throw new ExecutionException(abstractC5516j.m());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map<String, f> map;
        try {
            strB = uVar.b();
            map = f90055d;
            if (!map.containsKey(strB)) {
                map.put(strB, new f(executor, uVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map.get(strB);
    }

    public g f() {
        return g(5L);
    }

    public AbstractC5516j<g> j(final g gVar, final boolean z10) {
        return C5519m.c(this.f90057a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f90050a.f90058b.e(gVar);
            }
        }).t(this.f90057a, new InterfaceC5515i() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // Vd.InterfaceC5515i
            public final AbstractC5516j then(Object obj) {
                return f.a(this.f90052a, z10, gVar, (Void) obj);
            }
        });
    }

    private f(Executor executor, u uVar) {
        this.f90057a = executor;
        this.f90058b = uVar;
    }
}
