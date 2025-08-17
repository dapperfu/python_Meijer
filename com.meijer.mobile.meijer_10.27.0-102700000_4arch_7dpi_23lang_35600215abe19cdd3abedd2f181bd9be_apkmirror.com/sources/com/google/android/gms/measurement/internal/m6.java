package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C10358a3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class m6 {

    /* renamed from: a, reason: collision with root package name */
    C10358a3 f85693a;

    /* renamed from: b, reason: collision with root package name */
    List f85694b;

    /* renamed from: c, reason: collision with root package name */
    List f85695c;

    /* renamed from: d, reason: collision with root package name */
    long f85696d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q6 f85697e;

    /* synthetic */ m6(q6 q6Var, byte[] bArr) {
        Objects.requireNonNull(q6Var);
        this.f85697e = q6Var;
    }

    private static final long b(com.google.android.gms.internal.measurement.O2 o22) {
        return ((o22.J() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.O2 o22) {
        com.google.android.gms.common.internal.r.l(o22);
        if (this.f85695c == null) {
            this.f85695c = new ArrayList();
        }
        if (this.f85694b == null) {
            this.f85694b = new ArrayList();
        }
        if (!this.f85695c.isEmpty() && b((com.google.android.gms.internal.measurement.O2) this.f85695c.get(0)) != b(o22)) {
            return false;
        }
        long jA = this.f85696d + o22.a();
        q6 q6Var = this.f85697e;
        if (q6Var.z0().F(null, C11120d2.f85464e1)) {
            if (!this.f85695c.isEmpty()) {
                q6Var.z0();
                if (jA >= C11187m.m()) {
                    return false;
                }
            }
        } else {
            q6Var.z0();
            if (jA >= C11187m.m()) {
                return false;
            }
        }
        this.f85696d = jA;
        this.f85695c.add(o22);
        this.f85694b.add(Long.valueOf(j10));
        int size = this.f85695c.size();
        q6Var.z0();
        if (size >= Math.max(1, ((Integer) C11120d2.f85480k.b(null)).intValue())) {
            return false;
        }
        return true;
    }
}
