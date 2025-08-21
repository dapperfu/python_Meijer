package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13325e implements com.scandit.datacapture.barcode.internal.module.spark.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.spark.internal.g f123848a;

    public C13325e(com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar) {
        this.f123848a = gVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object value) throws JSONException {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f123848a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", gVar.f123891a);
        jSONObject.put("value", value);
        gVar.a(jSONObject);
    }
}
