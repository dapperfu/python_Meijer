package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.C11393x4;
import com.google.android.gms.measurement.internal.X2;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final X2 f85697a;

    /* renamed from: b, reason: collision with root package name */
    private final C11393x4 f85698b;

    public a(X2 x22) {
        super(null);
        r.l(x22);
        this.f85697a = x22;
        this.f85698b = x22.z();
    }

    @Override // Qd.E
    public final void B(String str) throws IllegalStateException {
        X2 x22 = this.f85697a;
        x22.K().g(str, x22.zzaZ().c());
    }

    @Override // Qd.E
    public final List K0(String str, String str2) {
        return this.f85698b.N(str, str2);
    }

    @Override // Qd.E
    public final Map L0(String str, String str2, boolean z10) {
        return this.f85698b.A(str, str2, z10);
    }

    @Override // Qd.E
    public final void M0(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f85697a.z().M(str, str2, bundle);
    }

    @Override // Qd.E
    public final void W(Bundle bundle) throws IllegalStateException {
        this.f85698b.K(bundle);
    }

    @Override // Qd.E
    public final void X(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f85698b.n(str, str2, bundle);
    }

    @Override // Qd.E
    public final int m0(String str) {
        this.f85698b.J(str);
        return 25;
    }

    @Override // Qd.E
    public final void z(String str) throws IllegalStateException {
        X2 x22 = this.f85697a;
        x22.K().h(str, x22.zzaZ().c());
    }

    @Override // Qd.E
    public final String zzh() {
        return this.f85698b.O();
    }

    @Override // Qd.E
    public final String zzi() {
        return this.f85698b.P();
    }

    @Override // Qd.E
    public final String zzj() {
        return this.f85698b.B();
    }

    @Override // Qd.E
    public final String zzk() {
        return this.f85698b.Q();
    }

    @Override // Qd.E
    public final long zzl() {
        return this.f85697a.A().n0();
    }
}
