package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13193f implements com.scandit.datacapture.barcode.internal.module.spark.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.spark.internal.g f122897a;

    public C13193f(com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar) {
        this.f122897a = gVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object value) throws JSONException {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f122897a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", gVar.f122939a);
        jSONObject.put("value", value);
        gVar.a(jSONObject);
    }
}
