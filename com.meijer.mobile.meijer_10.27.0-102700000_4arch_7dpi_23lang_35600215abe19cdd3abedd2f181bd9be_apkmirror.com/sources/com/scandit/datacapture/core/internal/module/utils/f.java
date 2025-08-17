package com.scandit.datacapture.core.internal.module.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f125327a;

    /* renamed from: b, reason: collision with root package name */
    public final c f125328b;

    /* renamed from: c, reason: collision with root package name */
    public final c f125329c;

    /* renamed from: d, reason: collision with root package name */
    public final d f125330d;

    /* renamed from: e, reason: collision with root package name */
    public long f125331e;

    public final void a() {
        synchronized (this) {
            try {
                c cVar = this.f125328b;
                if (cVar.f125322d) {
                    c cVar2 = this.f125329c;
                    if (cVar2.f125322d) {
                        d dVar = this.f125330d;
                        long j10 = ((long) cVar.f125321c) - ((long) cVar2.f125321c);
                        if (dVar.f125325c) {
                            double d10 = dVar.f125324b;
                            double d11 = dVar.f125323a;
                            dVar.f125324b = ((1.0d - d11) * j10) + (d10 * d11);
                        } else {
                            dVar.f125324b = j10;
                            dVar.f125325c = true;
                        }
                        long j11 = (long) dVar.f125324b;
                        if (this.f125331e != j11) {
                            this.f125331e = j11;
                            this.f125327a.invoke(Long.valueOf(j11));
                        }
                        Unit unit = Unit.f142422a;
                    }
                }
            } finally {
            }
        }
    }

    public f() {
        b onDelayUpdated = b.f125318a;
        Intrinsics.j(onDelayUpdated, "onDelayUpdated");
        this.f125327a = onDelayUpdated;
        this.f125328b = new c(0.95d);
        this.f125329c = new c(0.95d);
        this.f125330d = new d(0.95d);
    }
}
