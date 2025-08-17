package com.google.firebase.remoteconfig.internal;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5226d;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import Td.InterfaceC5231i;
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

/* loaded from: classes7.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, f> f89213d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Executor f89214e = new androidx.privacysandbox.ads.adservices.measurement.k();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f89215a;

    /* renamed from: b, reason: collision with root package name */
    private final u f89216b;

    /* renamed from: c, reason: collision with root package name */
    private AbstractC5232j<g> f89217c = null;

    private static class b<TResult> implements InterfaceC5229g<TResult>, InterfaceC5228f, InterfaceC5226d {

        /* renamed from: a, reason: collision with root package name */
        private final CountDownLatch f89218a;

        private b() {
            this.f89218a = new CountDownLatch(1);
        }

        public boolean a(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f89218a.await(j10, timeUnit);
        }

        @Override // Td.InterfaceC5226d
        public void onCanceled() {
            this.f89218a.countDown();
        }

        @Override // Td.InterfaceC5228f
        public void onFailure(Exception exc) {
            this.f89218a.countDown();
        }

        @Override // Td.InterfaceC5229g
        public void onSuccess(TResult tresult) {
            this.f89218a.countDown();
        }
    }

    private synchronized void k(g gVar) {
        this.f89217c = C5235m.f(gVar);
    }

    public void d() {
        synchronized (this) {
            this.f89217c = C5235m.f(null);
        }
        this.f89216b.a();
    }

    public synchronized AbstractC5232j<g> e() {
        try {
            AbstractC5232j<g> abstractC5232j = this.f89217c;
            if (abstractC5232j == null || (abstractC5232j.q() && !this.f89217c.r())) {
                Executor executor = this.f89215a;
                final u uVar = this.f89216b;
                Objects.requireNonNull(uVar);
                this.f89217c = C5235m.c(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return uVar.d();
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f89217c;
    }

    g g(long j10) {
        synchronized (this) {
            try {
                AbstractC5232j<g> abstractC5232j = this.f89217c;
                if (abstractC5232j != null && abstractC5232j.r()) {
                    return this.f89217c.n();
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

    public AbstractC5232j<g> i(g gVar) {
        return j(gVar, true);
    }

    public static /* synthetic */ AbstractC5232j a(f fVar, boolean z10, g gVar, Void r32) {
        if (z10) {
            fVar.k(gVar);
        } else {
            fVar.getClass();
        }
        return C5235m.f(gVar);
    }

    private static <TResult> TResult c(AbstractC5232j<TResult> abstractC5232j, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f89214e;
        abstractC5232j.h(executor, bVar);
        abstractC5232j.f(executor, bVar);
        abstractC5232j.b(executor, bVar);
        if (!bVar.a(j10, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (abstractC5232j.r()) {
            return abstractC5232j.n();
        }
        throw new ExecutionException(abstractC5232j.m());
    }

    public static synchronized f h(Executor executor, u uVar) {
        String strB;
        Map<String, f> map;
        try {
            strB = uVar.b();
            map = f89213d;
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

    public AbstractC5232j<g> j(final g gVar, final boolean z10) {
        return C5235m.c(this.f89215a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89208a.f89216b.e(gVar);
            }
        }).t(this.f89215a, new InterfaceC5231i() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // Td.InterfaceC5231i
            public final AbstractC5232j then(Object obj) {
                return f.a(this.f89210a, z10, gVar, (Void) obj);
            }
        });
    }

    private f(Executor executor, u uVar) {
        this.f89215a = executor;
        this.f89216b = uVar;
    }
}
