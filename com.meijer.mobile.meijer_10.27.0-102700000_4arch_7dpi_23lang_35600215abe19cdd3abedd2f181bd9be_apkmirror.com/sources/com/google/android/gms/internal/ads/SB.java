package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class SB extends Mc.T0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70047a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70048b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70049c;

    /* renamed from: d, reason: collision with root package name */
    private final String f70050d;

    /* renamed from: e, reason: collision with root package name */
    private final List f70051e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70052f;

    /* renamed from: g, reason: collision with root package name */
    private final String f70053g;

    /* renamed from: h, reason: collision with root package name */
    private final C8856nT f70054h;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f70055i;

    public final long zzc() {
        return this.f70052f;
    }

    public final String zzd() {
        return this.f70053g;
    }

    @Override // Mc.U0
    public final Bundle zze() {
        return this.f70055i;
    }

    @Override // Mc.U0
    public final String zzg() {
        return this.f70047a;
    }

    @Override // Mc.U0
    public final String zzh() {
        return this.f70049c;
    }

    @Override // Mc.U0
    public final String zzi() {
        return this.f70048b;
    }

    @Override // Mc.U0
    public final List zzj() {
        return this.f70051e;
    }

    public final String zzk() {
        return this.f70050d;
    }

    @Override // Mc.U0
    public final Mc.h2 zzf() {
        C8856nT c8856nT = this.f70054h;
        if (c8856nT != null) {
            return c8856nT.a();
        }
        return null;
    }

    public SB(Z50 z50, String str, C8856nT c8856nT, C7648c60 c7648c60, String str2) throws JSONException {
        String str3;
        String str4;
        String str5;
        String string = null;
        if (z50 == null) {
            str3 = null;
        } else {
            str3 = z50.f72024b0;
        }
        this.f70048b = str3;
        this.f70049c = str2;
        if (c7648c60 == null) {
            str4 = null;
        } else {
            str4 = c7648c60.f73103b;
        }
        this.f70050d = str4;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && z50 != null) {
            try {
                string = z50.f72063v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f70047a = string != null ? string : str;
        this.f70051e = c8856nT.c();
        this.f70054h = c8856nT;
        this.f70052f = Lc.v.c().a() / 1000;
        if (((Boolean) Mc.A.c().a(C8659lf.f75949E6)).booleanValue() && c7648c60 != null) {
            this.f70055i = c7648c60.f73112k;
        } else {
            this.f70055i = new Bundle();
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76329f9)).booleanValue() && c7648c60 != null && !TextUtils.isEmpty(c7648c60.f73110i)) {
            str5 = c7648c60.f73110i;
        } else {
            str5 = "";
        }
        this.f70053g = str5;
    }
}
