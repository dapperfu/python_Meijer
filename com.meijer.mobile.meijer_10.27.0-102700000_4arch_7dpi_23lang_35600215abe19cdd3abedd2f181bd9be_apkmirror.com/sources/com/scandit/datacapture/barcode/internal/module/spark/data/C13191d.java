package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13191d implements com.scandit.datacapture.barcode.internal.module.spark.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.spark.internal.g f122895a;

    public C13191d(com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar) {
        this.f122895a = gVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object value) throws JSONException {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f122895a;
        String json = CameraPositionSerializer.toJson((CameraPosition) value);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", gVar.f122939a);
        jSONObject.put("value", json);
        gVar.a(jSONObject);
    }
}
