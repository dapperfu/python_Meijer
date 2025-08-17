package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.aY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7474aY implements S10 {

    /* renamed from: a, reason: collision with root package name */
    public final Mc.d2 f72435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72437c;

    /* renamed from: d, reason: collision with root package name */
    public final String f72438d;

    /* renamed from: e, reason: collision with root package name */
    public final float f72439e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72440f;

    /* renamed from: g, reason: collision with root package name */
    public final int f72441g;

    /* renamed from: h, reason: collision with root package name */
    public final String f72442h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f72443i;

    private final void a(Bundle bundle) {
        H60.f(bundle, "smart_w", "full", this.f72435a.f19217e == -1);
        H60.f(bundle, "smart_h", CameraSettings.FOCUS_STRATEGY_AUTO, this.f72435a.f19214b == -2);
        H60.g(bundle, "ene", true, this.f72435a.f19222j);
        H60.f(bundle, "rafmt", "102", this.f72435a.f19225m);
        H60.f(bundle, "rafmt", "103", this.f72435a.f19226n);
        H60.f(bundle, "rafmt", "105", this.f72435a.f19227o);
        H60.g(bundle, "inline_adaptive_slot", true, this.f72443i);
        H60.g(bundle, "interscroller_slot", true, this.f72435a.f19227o);
        H60.c(bundle, "format", this.f72436b);
        H60.f(bundle, "fluid", "height", this.f72437c);
        H60.f(bundle, "sz", this.f72438d, !TextUtils.isEmpty(this.f72438d));
        bundle.putFloat("u_sd", this.f72439e);
        bundle.putInt("sw", this.f72440f);
        bundle.putInt("sh", this.f72441g);
        H60.f(bundle, "sc", this.f72442h, !TextUtils.isEmpty(this.f72442h));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Mc.d2[] d2VarArr = this.f72435a.f19219g;
        if (d2VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.f72435a.f19214b);
            bundle2.putInt("width", this.f72435a.f19217e);
            bundle2.putBoolean("is_fluid_height", this.f72435a.f19221i);
            arrayList.add(bundle2);
        } else {
            for (Mc.d2 d2Var : d2VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", d2Var.f19221i);
                bundle3.putInt("height", d2Var.f19214b);
                bundle3.putInt("width", d2Var.f19217e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zza(Object obj) {
        a(((AB) obj).f65089b);
    }

    @Override // com.google.android.gms.internal.ads.S10
    public final /* synthetic */ void zzb(Object obj) {
        a(((AB) obj).f65088a);
    }

    public C7474aY(Mc.d2 d2Var, String str, boolean z10, String str2, float f10, int i10, int i11, String str3, boolean z11) {
        com.google.android.gms.common.internal.r.m(d2Var, "the adSize must not be null");
        this.f72435a = d2Var;
        this.f72436b = str;
        this.f72437c = z10;
        this.f72438d = str2;
        this.f72439e = f10;
        this.f72440f = i10;
        this.f72441g = i11;
        this.f72442h = str3;
        this.f72443i = z11;
    }
}
