package com.google.firebase.analytics;

import Qd.E;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C10669v1;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class a implements E {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10669v1 f89449a;

    a(C10669v1 c10669v1) {
        this.f89449a = c10669v1;
    }

    @Override // Qd.E
    public final void B(String str) {
        this.f89449a.D(str);
    }

    @Override // Qd.E
    public final List K0(String str, String str2) {
        return this.f89449a.A(str, str2);
    }

    @Override // Qd.E
    public final Map L0(String str, String str2, boolean z10) {
        return this.f89449a.c(str, str2, z10);
    }

    @Override // Qd.E
    public final void M0(String str, String str2, Bundle bundle) {
        this.f89449a.z(str, str2, bundle);
    }

    @Override // Qd.E
    public final void W(Bundle bundle) {
        this.f89449a.y(bundle);
    }

    @Override // Qd.E
    public final void X(String str, String str2, Bundle bundle) {
        this.f89449a.w(str, str2, bundle);
    }

    @Override // Qd.E
    public final int m0(String str) {
        return this.f89449a.f(str);
    }

    @Override // Qd.E
    public final void z(String str) {
        this.f89449a.E(str);
    }

    @Override // Qd.E
    public final String zzh() {
        return this.f89449a.a();
    }

    @Override // Qd.E
    public final String zzi() {
        return this.f89449a.b();
    }

    @Override // Qd.E
    public final String zzj() {
        return this.f89449a.H();
    }

    @Override // Qd.E
    public final String zzk() {
        return this.f89449a.G();
    }

    @Override // Qd.E
    public final long zzl() {
        return this.f89449a.I();
    }
}
