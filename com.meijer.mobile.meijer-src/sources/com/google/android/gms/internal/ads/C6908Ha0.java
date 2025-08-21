package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ha0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6908Ha0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC7315Ta0 f68305a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7315Ta0 f68306b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f68307c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC7044La0 f68308d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC7145Oa0 f68309e;

    public static C6908Ha0 a(EnumC7044La0 enumC7044La0, EnumC7145Oa0 enumC7145Oa0, EnumC7315Ta0 enumC7315Ta0, EnumC7315Ta0 enumC7315Ta02, boolean z10) {
        C6774Db0.c(enumC7044La0, "CreativeType is null");
        C6774Db0.c(enumC7145Oa0, "ImpressionType is null");
        C6774Db0.c(enumC7315Ta0, "Impression owner is null");
        if (enumC7315Ta0 == EnumC7315Ta0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC7044La0 == EnumC7044La0.DEFINED_BY_JAVASCRIPT && enumC7315Ta0 == EnumC7315Ta0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC7145Oa0 == EnumC7145Oa0.DEFINED_BY_JAVASCRIPT && enumC7315Ta0 == EnumC7315Ta0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C6908Ha0(enumC7044La0, enumC7145Oa0, enumC7315Ta0, enumC7315Ta02, z10);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C10274zb0.e(jSONObject, "impressionOwner", this.f68305a);
        C10274zb0.e(jSONObject, "mediaEventsOwner", this.f68306b);
        C10274zb0.e(jSONObject, "creativeType", this.f68308d);
        C10274zb0.e(jSONObject, "impressionType", this.f68309e);
        C10274zb0.e(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f68307c));
        return jSONObject;
    }

    private C6908Ha0(EnumC7044La0 enumC7044La0, EnumC7145Oa0 enumC7145Oa0, EnumC7315Ta0 enumC7315Ta0, EnumC7315Ta0 enumC7315Ta02, boolean z10) {
        this.f68308d = enumC7044La0;
        this.f68309e = enumC7145Oa0;
        this.f68305a = enumC7315Ta0;
        if (enumC7315Ta02 == null) {
            this.f68306b = EnumC7315Ta0.NONE;
        } else {
            this.f68306b = enumC7315Ta02;
        }
        this.f68307c = z10;
    }
}
