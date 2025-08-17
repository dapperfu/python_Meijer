package com.google.android.gms.measurement.internal;

import Td.InterfaceC5228f;
import android.content.Context;
import com.google.android.gms.common.internal.C6534p;
import com.google.android.gms.common.internal.C6539v;
import com.google.android.gms.common.internal.C6540w;
import com.google.android.gms.common.internal.C6542y;
import com.google.android.gms.common.internal.InterfaceC6541x;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11190m2 {

    /* renamed from: d, reason: collision with root package name */
    private static C11190m2 f85682d;

    /* renamed from: a, reason: collision with root package name */
    private final X2 f85683a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6541x f85684b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f85685c = new AtomicLong(-1);

    static C11190m2 a(X2 x22) {
        if (f85682d == null) {
            f85682d = new C11190m2(x22.zzaY(), x22);
        }
        return f85682d;
    }

    public final synchronized void b(int i10, int i11, long j10, long j11, int i12) {
        final long jC = this.f85683a.zzaZ().c();
        AtomicLong atomicLong = this.f85685c;
        if (atomicLong.get() != -1 && jC - atomicLong.get() <= 1800000) {
            return;
        }
        this.f85684b.b(new C6539v(0, Arrays.asList(new C6534p(36301, i11, 0, j10, j11, null, null, 0, i12)))).e(new InterfaceC5228f() { // from class: com.google.android.gms.measurement.internal.l2
            @Override // Td.InterfaceC5228f
            public final /* synthetic */ void onFailure(Exception exc) {
                this.f85668a.c(jC, exc);
            }
        });
    }

    final /* synthetic */ void c(long j10, Exception exc) {
        this.f85685c.set(j10);
    }

    private C11190m2(Context context, X2 x22) {
        this.f85684b = C6540w.b(context, C6542y.c().b("measurement:api").a());
        this.f85683a = x22;
    }
}
