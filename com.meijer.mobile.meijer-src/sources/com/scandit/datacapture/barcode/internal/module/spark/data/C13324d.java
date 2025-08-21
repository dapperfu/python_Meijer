package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13324d implements com.scandit.datacapture.barcode.internal.module.spark.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.spark.internal.g f123847a;

    public C13324d(com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar) {
        this.f123847a = gVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object value) throws JSONException {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f123847a;
        String json = CameraPositionSerializer.toJson((CameraPosition) value);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", gVar.f123891a);
        jSONObject.put("value", json);
        gVar.a(jSONObject);
    }
}
