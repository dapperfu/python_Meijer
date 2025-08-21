package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class SB extends Oc.T0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f70887a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70888b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70889c;

    /* renamed from: d, reason: collision with root package name */
    private final String f70890d;

    /* renamed from: e, reason: collision with root package name */
    private final List f70891e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70892f;

    /* renamed from: g, reason: collision with root package name */
    private final String f70893g;

    /* renamed from: h, reason: collision with root package name */
    private final C8981nT f70894h;

    /* renamed from: i, reason: collision with root package name */
    private final Bundle f70895i;

    public final long zzc() {
        return this.f70892f;
    }

    public final String zzd() {
        return this.f70893g;
    }

    @Override // Oc.U0
    public final Bundle zze() {
        return this.f70895i;
    }

    @Override // Oc.U0
    public final String zzg() {
        return this.f70887a;
    }

    @Override // Oc.U0
    public final String zzh() {
        return this.f70889c;
    }

    @Override // Oc.U0
    public final String zzi() {
        return this.f70888b;
    }

    @Override // Oc.U0
    public final List zzj() {
        return this.f70891e;
    }

    public final String zzk() {
        return this.f70890d;
    }

    @Override // Oc.U0
    public final Oc.h2 zzf() {
        C8981nT c8981nT = this.f70894h;
        if (c8981nT != null) {
            return c8981nT.a();
        }
        return null;
    }

    public SB(Z50 z50, String str, C8981nT c8981nT, C7773c60 c7773c60, String str2) throws JSONException {
        String str3;
        String str4;
        String str5;
        String string = null;
        if (z50 == null) {
            str3 = null;
        } else {
            str3 = z50.f72864b0;
        }
        this.f70888b = str3;
        this.f70889c = str2;
        if (c7773c60 == null) {
            str4 = null;
        } else {
            str4 = c7773c60.f73943b;
        }
        this.f70890d = str4;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && z50 != null) {
            try {
                string = z50.f72903v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f70887a = string != null ? string : str;
        this.f70891e = c8981nT.c();
        this.f70894h = c8981nT;
        this.f70892f = Nc.v.c().a() / 1000;
        if (((Boolean) Oc.A.c().a(C8784lf.f76789E6)).booleanValue() && c7773c60 != null) {
            this.f70895i = c7773c60.f73952k;
        } else {
            this.f70895i = new Bundle();
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77169f9)).booleanValue() && c7773c60 != null && !TextUtils.isEmpty(c7773c60.f73950i)) {
            str5 = c7773c60.f73950i;
        } else {
            str5 = "";
        }
        this.f70893g = str5;
    }
}
