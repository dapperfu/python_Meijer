package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.aY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7599aY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Oc.d2 f73275a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73276b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73277c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73278d;

    /* renamed from: e, reason: collision with root package name */
    public final float f73279e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73280f;

    /* renamed from: g, reason: collision with root package name */
    public final int f73281g;

    /* renamed from: h, reason: collision with root package name */
    public final String f73282h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f73283i;

    private final void a(Bundle bundle) {
        H60.f(bundle, "smart_w", "full", this.f73275a.f23404e == -1);
        H60.f(bundle, "smart_h", CameraSettings.FOCUS_STRATEGY_AUTO, this.f73275a.f23401b == -2);
        H60.g(bundle, "ene", true, this.f73275a.f23409j);
        H60.f(bundle, "rafmt", "102", this.f73275a.f23412m);
        H60.f(bundle, "rafmt", "103", this.f73275a.f23413n);
        H60.f(bundle, "rafmt", "105", this.f73275a.f23414o);
        H60.g(bundle, "inline_adaptive_slot", true, this.f73283i);
        H60.g(bundle, "interscroller_slot", true, this.f73275a.f23414o);
        H60.c(bundle, "format", this.f73276b);
        H60.f(bundle, "fluid", "height", this.f73277c);
        H60.f(bundle, "sz", this.f73278d, !TextUtils.isEmpty(this.f73278d));
        bundle.putFloat("u_sd", this.f73279e);
        bundle.putInt("sw", this.f73280f);
        bundle.putInt("sh", this.f73281g);
        H60.f(bundle, "sc", this.f73282h, !TextUtils.isEmpty(this.f73282h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Oc.d2[] d2VarArr = this.f73275a.f23406g;
        if (d2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f73275a.f23401b);
            bundle2.putInt("width", this.f73275a.f23404e);
            bundle2.putBoolean("is_fluid_height", this.f73275a.f23408i);
            arrayList.add(bundle2);
        } else {
            for (Oc.d2 d2Var : d2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", d2Var.f23408i);
                bundle3.putInt("height", d2Var.f23401b);
                bundle3.putInt("width", d2Var.f23404e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
        a(((AB) obj).f65929b);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zzb(Object obj) {
        a(((AB) obj).f65928a);
    }

    public C7599aY(Oc.d2 d2Var, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        com.google.android.gms.common.internal.r.m(d2Var, "the adSize must not be null");
        this.f73275a = d2Var;
        this.f73276b = str;
        this.f73277c = z10;
        this.f73278d = str2;
        this.f73279e = f10;
        this.f73280f = i10;
        this.f73281g = i11;
        this.f73282h = str3;
        this.f73283i = z11;
    }
}
