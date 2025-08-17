package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ha0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6783Ha0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC7190Ta0 f67465a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC7190Ta0 f67466b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f67467c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC6919La0 f67468d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumC7020Oa0 f67469e;

    public static C6783Ha0 a(EnumC6919La0 enumC6919La0, EnumC7020Oa0 enumC7020Oa0, EnumC7190Ta0 enumC7190Ta0, EnumC7190Ta0 enumC7190Ta02, boolean z10) {
        C6649Db0.c(enumC6919La0, "CreativeType is null");
        C6649Db0.c(enumC7020Oa0, "ImpressionType is null");
        C6649Db0.c(enumC7190Ta0, "Impression owner is null");
        if (enumC7190Ta0 == EnumC7190Ta0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC6919La0 == EnumC6919La0.DEFINED_BY_JAVASCRIPT && enumC7190Ta0 == EnumC7190Ta0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC7020Oa0 == EnumC7020Oa0.DEFINED_BY_JAVASCRIPT && enumC7190Ta0 == EnumC7190Ta0.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new C6783Ha0(enumC6919La0, enumC7020Oa0, enumC7190Ta0, enumC7190Ta02, z10);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C10149zb0.e(jSONObject, "impressionOwner", this.f67465a);
        C10149zb0.e(jSONObject, "mediaEventsOwner", this.f67466b);
        C10149zb0.e(jSONObject, "creativeType", this.f67468d);
        C10149zb0.e(jSONObject, "impressionType", this.f67469e);
        C10149zb0.e(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f67467c));
        return jSONObject;
    }

    private C6783Ha0(EnumC6919La0 enumC6919La0, EnumC7020Oa0 enumC7020Oa0, EnumC7190Ta0 enumC7190Ta0, EnumC7190Ta0 enumC7190Ta02, boolean z10) {
        this.f67468d = enumC6919La0;
        this.f67469e = enumC7020Oa0;
        this.f67465a = enumC7190Ta0;
        if (enumC7190Ta02 == null) {
            this.f67466b = EnumC7190Ta0.NONE;
        } else {
            this.f67466b = enumC7190Ta02;
        }
        this.f67467c = z10;
    }
}
