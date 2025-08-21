package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public final class F00 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67531a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f67532b;

    F00(Context context, Intent intent) {
        this.f67531a = context;
        this.f67532b = intent;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        Rc.p0.k("HsdpMigrationSignal.produce");
        if (!((Boolean) Oc.A.c().a(C8784lf.f76837Hc)).booleanValue()) {
            return Mj0.h(new G00(null));
        }
        boolean z10 = false;
        try {
            if (this.f67532b.resolveActivity(this.f67531a.getPackageManager()) != null) {
                Rc.p0.k("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e10) {
            Nc.v.s().x(e10, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return Mj0.h(new G00(Boolean.valueOf(z10)));
    }
}
