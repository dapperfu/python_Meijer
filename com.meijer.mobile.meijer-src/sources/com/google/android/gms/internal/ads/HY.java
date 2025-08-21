package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes6.dex */
public final class HY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f68295a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f68296b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68297c;

    /* renamed from: d, reason: collision with root package name */
    private final String f68298d;

    /* renamed from: e, reason: collision with root package name */
    private final Rc.r0 f68299e;

    /* renamed from: f, reason: collision with root package name */
    private final String f68300f;

    /* renamed from: g, reason: collision with root package name */
    private final GA f68301g;

    private final void a(Bundle bundle) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76732A5)).booleanValue()) {
            try {
                Nc.v.t();
                bundle.putString("_app_id", Rc.D0.V(this.f68295a));
            } catch (RemoteException | RuntimeException e10) {
                Nc.v.s().x(e10, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65929b.putBundle("quality_signals", this.f68296b);
        a(ab2.f65929b);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65928a;
        bundle.putBundle("quality_signals", this.f68296b);
        bundle.putString("seq_num", this.f68297c);
        if (!this.f68299e.zzN()) {
            bundle.putString(PreferencesHelper.SESSION_ID, this.f68298d);
        }
        bundle.putBoolean("client_purpose_one", !this.f68299e.zzN());
        a(bundle);
        if (this.f68300f != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.f68301g.b(this.f68300f));
            bundle2.putInt("pcc", this.f68301g.a(this.f68300f));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) Oc.A.c().a(C8784lf.f76792E9)).booleanValue() || Nc.v.s().b() <= 0) {
            return;
        }
        bundle.putInt("nrwv", Nc.v.s().b());
    }

    public HY(Context context, Bundle bundle, String str, String str2, Rc.r0 r0Var, String str3, GA ga2) {
        this.f68295a = context;
        this.f68296b = bundle;
        this.f68297c = str;
        this.f68298d = str2;
        this.f68299e = r0Var;
        this.f68300f = str3;
        this.f68301g = ga2;
    }
}
