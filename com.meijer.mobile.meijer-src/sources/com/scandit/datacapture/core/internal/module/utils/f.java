package com.scandit.datacapture.core.internal.module.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f126279a;

    /* renamed from: b, reason: collision with root package name */
    public final c f126280b;

    /* renamed from: c, reason: collision with root package name */
    public final c f126281c;

    /* renamed from: d, reason: collision with root package name */
    public final d f126282d;

    /* renamed from: e, reason: collision with root package name */
    public long f126283e;

    public final void a() {
        synchronized (this) {
            try {
                c cVar = this.f126280b;
                if (cVar.f126274d) {
                    c cVar2 = this.f126281c;
                    if (cVar2.f126274d) {
                        d dVar = this.f126282d;
                        long j10 = ((long) cVar.f126273c) - ((long) cVar2.f126273c);
                        if (dVar.f126277c) {
                            double d10 = dVar.f126276b;
                            double d11 = dVar.f126275a;
                            dVar.f126276b = ((1.0d - d11) * j10) + (d10 * d11);
                        } else {
                            dVar.f126276b = j10;
                            dVar.f126277c = true;
                        }
                        long j11 = (long) dVar.f126276b;
                        if (this.f126283e != j11) {
                            this.f126283e = j11;
                            this.f126279a.invoke(Long.valueOf(j11));
                        }
                        Unit unit = Unit.f143329a;
                    }
                }
            } finally {
            }
        }
    }

    public f() {
        b onDelayUpdated = b.f126270a;
        Intrinsics.j(onDelayUpdated, "onDelayUpdated");
        this.f126279a = onDelayUpdated;
        this.f126280b = new c(0.95d);
        this.f126281c = new c(0.95d);
        this.f126282d = new d(0.95d);
    }
}
