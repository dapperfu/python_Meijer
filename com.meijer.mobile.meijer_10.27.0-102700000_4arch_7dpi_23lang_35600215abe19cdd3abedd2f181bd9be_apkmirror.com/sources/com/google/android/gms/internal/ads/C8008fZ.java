package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8008fZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f74114a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f74115b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f74116c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f74117d;

    /* renamed from: e, reason: collision with root package name */
    private final T10 f74118e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74119f;

    /* renamed from: g, reason: collision with root package name */
    private final C9812wN f74120g;

    final /* synthetic */ void b() {
        this.f74114a.set(new C7901eZ(this.f74118e.zzb(), this.f74119f, this.f74116c));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return this.f74118e.zza();
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C7901eZ c7901eZ;
        if (((Boolean) Mc.A.c().a(C8659lf.f75982Gb)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f75968Fb)).booleanValue() && !((Boolean) this.f74115b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = C6908Kq.f68177d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.cZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8008fZ c8008fZ = this.f73196a;
                        c8008fZ.f74117d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c8008fZ.b();
                            }
                        });
                    }
                };
                long j10 = this.f74119f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    c7901eZ = (C7901eZ) this.f74114a.get();
                    if (c7901eZ == null) {
                        C7901eZ c7901eZ2 = new C7901eZ(this.f74118e.zzb(), this.f74119f, this.f74116c);
                        this.f74114a.set(c7901eZ2);
                        return c7901eZ2.f73901a;
                    }
                    if (!((Boolean) this.f74115b.get()).booleanValue() && c7901eZ.a()) {
                        com.google.common.util.concurrent.q qVar = c7901eZ.f73901a;
                        T10 t10 = this.f74118e;
                        C7901eZ c7901eZ3 = new C7901eZ(t10.zzb(), this.f74119f, this.f74116c);
                        this.f74114a.set(c7901eZ3);
                        if (((Boolean) Mc.A.c().a(C8659lf.f75996Hb)).booleanValue()) {
                            if (((Boolean) Mc.A.c().a(C8659lf.f76010Ib)).booleanValue()) {
                                C9705vN c9705vNA = this.f74120g.a();
                                c9705vNA.b("action", "scs");
                                c9705vNA.b("sid", String.valueOf(this.f74118e.zza()));
                                c9705vNA.g();
                            }
                            return qVar;
                        }
                        c7901eZ = c7901eZ3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            c7901eZ = (C7901eZ) this.f74114a.get();
            if (c7901eZ == null || c7901eZ.a()) {
                T10 t102 = this.f74118e;
                C7901eZ c7901eZ4 = new C7901eZ(t102.zzb(), this.f74119f, this.f74116c);
                this.f74114a.set(c7901eZ4);
                c7901eZ = c7901eZ4;
            }
        }
        return c7901eZ.f73901a;
    }

    public C8008fZ(T10 t10, long j10, com.google.android.gms.common.util.f fVar, Executor executor, C9812wN c9812wN) {
        this.f74116c = fVar;
        this.f74118e = t10;
        this.f74119f = j10;
        this.f74117d = executor;
        this.f74120g = c9812wN;
    }
}
