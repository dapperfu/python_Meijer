package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C10483a3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class m6 {

    /* renamed from: a, reason: collision with root package name */
    C10483a3 f86533a;

    /* renamed from: b, reason: collision with root package name */
    List f86534b;

    /* renamed from: c, reason: collision with root package name */
    List f86535c;

    /* renamed from: d, reason: collision with root package name */
    long f86536d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q6 f86537e;

    /* synthetic */ m6(q6 q6Var, byte[] bArr) {
        Objects.requireNonNull(q6Var);
        this.f86537e = q6Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.O2 o22) {
        return ((o22.J() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.O2 o22) {
        com.google.android.gms.common.internal.r.l(o22);
        if (this.f86535c == null) {
            this.f86535c = new ArrayList();
        }
        if (this.f86534b == null) {
            this.f86534b = new ArrayList();
        }
        if (!this.f86535c.isEmpty() && b((com.google.android.gms.internal.measurement.O2) this.f86535c.get(0)) != b(o22)) {
            return false;
        }
        long jA = this.f86536d + o22.a();
        q6 q6Var = this.f86537e;
        if (q6Var.z0().F(null, C11245d2.f86304e1)) {
            if (!this.f86535c.isEmpty()) {
                q6Var.z0();
                if (jA >= C11312m.m()) {
                    return false;
                }
            }
        } else {
            q6Var.z0();
            if (jA >= C11312m.m()) {
                return false;
            }
        }
        this.f86536d = jA;
        this.f86535c.add(o22);
        this.f86534b.add(Long.valueOf(j10));
        int size = this.f86535c.size();
        q6Var.z0();
        if (size >= Math.max(1, ((Integer) C11245d2.f86320k.b(null)).intValue())) {
            return false;
        }
        return true;
    }
}
