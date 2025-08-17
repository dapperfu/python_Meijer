package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.C11268x4;
import com.google.android.gms.measurement.internal.X2;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final X2 f84857a;

    /* renamed from: b, reason: collision with root package name */
    private final C11268x4 f84858b;

    public a(X2 x22) {
        super(null);
        r.l(x22);
        this.f84857a = x22;
        this.f84858b = x22.z();
    }

    @Override // Od.E
    public final void B(String str) throws IllegalStateException {
        X2 x22 = this.f84857a;
        x22.K().g(str, x22.zzaZ().c());
    }

    @Override // Od.E
    public final List I0(String str, String str2) {
        return this.f84858b.N(str, str2);
    }

    @Override // Od.E
    public final Map J0(String str, String str2, boolean z10) {
        return this.f84858b.A(str, str2, z10);
    }

    @Override // Od.E
    public final void K0(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f84857a.z().M(str, str2, bundle);
    }

    @Override // Od.E
    public final void V(Bundle bundle) throws IllegalStateException {
        this.f84858b.K(bundle);
    }

    @Override // Od.E
    public final void W(String str, String str2, Bundle bundle) throws IllegalStateException {
        this.f84858b.n(str, str2, bundle);
    }

    @Override // Od.E
    public final int j0(String str) {
        this.f84858b.J(str);
        return 25;
    }

    @Override // Od.E
    public final void z(String str) throws IllegalStateException {
        X2 x22 = this.f84857a;
        x22.K().h(str, x22.zzaZ().c());
    }

    @Override // Od.E
    public final String zzh() {
        return this.f84858b.O();
    }

    @Override // Od.E
    public final String zzi() {
        return this.f84858b.P();
    }

    @Override // Od.E
    public final String zzj() {
        return this.f84858b.B();
    }

    @Override // Od.E
    public final String zzk() {
        return this.f84858b.Q();
    }

    @Override // Od.E
    public final long zzl() {
        return this.f84857a.A().n0();
    }
}
