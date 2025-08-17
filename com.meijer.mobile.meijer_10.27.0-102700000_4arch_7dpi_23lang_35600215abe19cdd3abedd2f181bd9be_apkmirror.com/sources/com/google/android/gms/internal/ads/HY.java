package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes6.dex */
public final class HY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f67455a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f67456b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67457c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67458d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.r0 f67459e;

    /* renamed from: f, reason: collision with root package name */
    private final String f67460f;

    /* renamed from: g, reason: collision with root package name */
    private final GA f67461g;

    private final void a(Bundle bundle) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75892A5)).booleanValue()) {
            try {
                Lc.v.t();
                bundle.putString("_app_id", Pc.D0.V(this.f67455a));
            } catch (RemoteException | RuntimeException e10) {
                Lc.v.s().x(e10, "AppStatsSignal_AppId");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        AB ab2 = (AB) obj;
        ab2.f65089b.putBundle("quality_signals", this.f67456b);
        a(ab2.f65089b);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((AB) obj).f65088a;
        bundle.putBundle("quality_signals", this.f67456b);
        bundle.putString("seq_num", this.f67457c);
        if (!this.f67459e.zzN()) {
            bundle.putString(PreferencesHelper.SESSION_ID, this.f67458d);
        }
        bundle.putBoolean("client_purpose_one", !this.f67459e.zzN());
        a(bundle);
        if (this.f67460f != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.f67461g.b(this.f67460f));
            bundle2.putInt("pcc", this.f67461g.a(this.f67460f));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (!((Boolean) Mc.A.c().a(C8659lf.f75952E9)).booleanValue() || Lc.v.s().b() <= 0) {
            return;
        }
        bundle.putInt("nrwv", Lc.v.s().b());
    }

    public HY(Context context, Bundle bundle, String str, String str2, Pc.r0 r0Var, String str3, GA ga2) {
        this.f67455a = context;
        this.f67456b = bundle;
        this.f67457c = str;
        this.f67458d = str2;
        this.f67459e = r0Var;
        this.f67460f = str3;
        this.f67461g = ga2;
    }
}
