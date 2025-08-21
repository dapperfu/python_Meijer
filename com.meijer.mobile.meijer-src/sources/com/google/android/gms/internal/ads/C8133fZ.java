package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.fZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8133fZ implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f74954a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f74955b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f74956c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f74957d;

    /* renamed from: e, reason: collision with root package name */
    private final T10 f74958e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74959f;

    /* renamed from: g, reason: collision with root package name */
    private final C9937wN f74960g;

    final /* synthetic */ void b() {
        this.f74954a.set(new C8026eZ(this.f74958e.zzb(), this.f74959f, this.f74956c));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return this.f74958e.zza();
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        C8026eZ c8026eZ;
        if (((Boolean) Oc.A.c().a(C8784lf.f76822Gb)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f76808Fb)).booleanValue() && !((Boolean) this.f74955b.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = C7033Kq.f69017d;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.cZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8133fZ c8133fZ = this.f74036a;
                        c8133fZ.f74957d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dZ
                            @Override // java.lang.Runnable
                            public final void run() {
                                c8133fZ.b();
                            }
                        });
                    }
                };
                long j10 = this.f74959f;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j10, j10, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    c8026eZ = (C8026eZ) this.f74954a.get();
                    if (c8026eZ == null) {
                        C8026eZ c8026eZ2 = new C8026eZ(this.f74958e.zzb(), this.f74959f, this.f74956c);
                        this.f74954a.set(c8026eZ2);
                        return c8026eZ2.f74741a;
                    }
                    if (!((Boolean) this.f74955b.get()).booleanValue() && c8026eZ.a()) {
                        com.google.common.util.concurrent.q qVar = c8026eZ.f74741a;
                        T10 t10 = this.f74958e;
                        C8026eZ c8026eZ3 = new C8026eZ(t10.zzb(), this.f74959f, this.f74956c);
                        this.f74954a.set(c8026eZ3);
                        if (((Boolean) Oc.A.c().a(C8784lf.f76836Hb)).booleanValue()) {
                            if (((Boolean) Oc.A.c().a(C8784lf.f76850Ib)).booleanValue()) {
                                C9830vN c9830vNA = this.f74960g.a();
                                c9830vNA.b("action", "scs");
                                c9830vNA.b("sid", String.valueOf(this.f74958e.zza()));
                                c9830vNA.g();
                            }
                            return qVar;
                        }
                        c8026eZ = c8026eZ3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            c8026eZ = (C8026eZ) this.f74954a.get();
            if (c8026eZ == null || c8026eZ.a()) {
                T10 t102 = this.f74958e;
                C8026eZ c8026eZ4 = new C8026eZ(t102.zzb(), this.f74959f, this.f74956c);
                this.f74954a.set(c8026eZ4);
                c8026eZ = c8026eZ4;
            }
        }
        return c8026eZ.f74741a;
    }

    public C8133fZ(T10 t10, long j10, com.google.android.gms.common.util.f fVar, Executor executor, C9937wN c9937wN) {
        this.f74956c = fVar;
        this.f74958e = t10;
        this.f74959f = j10;
        this.f74957d = executor;
        this.f74960g = c9937wN;
    }
}
