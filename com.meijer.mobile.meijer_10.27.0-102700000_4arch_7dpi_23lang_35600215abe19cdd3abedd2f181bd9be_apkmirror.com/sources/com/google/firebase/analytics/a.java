package com.google.firebase.analytics;

import Od.E;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C10544v1;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
final class a implements E {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10544v1 f88609a;

    a(C10544v1 c10544v1) {
        this.f88609a = c10544v1;
    }

    @Override // Od.E
    public final void B(String str) {
        this.f88609a.D(str);
    }

    @Override // Od.E
    public final List I0(String str, String str2) {
        return this.f88609a.A(str, str2);
    }

    @Override // Od.E
    public final Map J0(String str, String str2, boolean z10) {
        return this.f88609a.c(str, str2, z10);
    }

    @Override // Od.E
    public final void K0(String str, String str2, Bundle bundle) {
        this.f88609a.z(str, str2, bundle);
    }

    @Override // Od.E
    public final void V(Bundle bundle) {
        this.f88609a.y(bundle);
    }

    @Override // Od.E
    public final void W(String str, String str2, Bundle bundle) {
        this.f88609a.w(str, str2, bundle);
    }

    @Override // Od.E
    public final int j0(String str) {
        return this.f88609a.f(str);
    }

    @Override // Od.E
    public final void z(String str) {
        this.f88609a.E(str);
    }

    @Override // Od.E
    public final String zzh() {
        return this.f88609a.a();
    }

    @Override // Od.E
    public final String zzi() {
        return this.f88609a.b();
    }

    @Override // Od.E
    public final String zzj() {
        return this.f88609a.H();
    }

    @Override // Od.E
    public final String zzk() {
        return this.f88609a.G();
    }

    @Override // Od.E
    public final long zzl() {
        return this.f88609a.I();
    }
}
