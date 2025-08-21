package com.google.android.gms.measurement.internal;

import Vd.InterfaceC5512f;
import android.content.Context;
import com.google.android.gms.common.internal.C6659p;
import com.google.android.gms.common.internal.C6664v;
import com.google.android.gms.common.internal.C6665w;
import com.google.android.gms.common.internal.C6667y;
import com.google.android.gms.common.internal.InterfaceC6666x;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11315m2 {

    /* renamed from: d, reason: collision with root package name */
    private static C11315m2 f86522d;

    /* renamed from: a, reason: collision with root package name */
    private final X2 f86523a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6666x f86524b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f86525c = new AtomicLong(-1);

    static C11315m2 a(X2 x22) {
        if (f86522d == null) {
            f86522d = new C11315m2(x22.zzaY(), x22);
        }
        return f86522d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f86523a.zzaZ().c();
        AtomicLong atomicLong = this.f86525c;
        if (atomicLong.get() != -1 && jC - atomicLong.get() <= 1800000) {
            return;
        }
        this.f86524b.c(new C6664v(0, Arrays.asList(new C6659p(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new InterfaceC5512f() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // Vd.InterfaceC5512f
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f86508a.c(jC, exc);
            }
        });
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f86525c.set(j10);
    }

    private C11315m2(Context context, X2 x22) {
        this.f86524b = C6665w.b(context, C6667y.c().b("measurement:api").a());
        this.f86523a = x22;
    }
}
