package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13190c implements com.scandit.datacapture.barcode.internal.module.spark.internal.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.scandit.datacapture.barcode.internal.module.spark.internal.g f122894a;

    public C13190c(com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar) {
        this.f122894a = gVar;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object value) throws JSONException {
        Intrinsics.j(value, "value");
        com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f122894a;
        JSONObject jSONObject = new JSONObject(SparkScanScanningModeSerializer.toJson((SparkScanScanningMode) value, true));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("key", gVar.f122939a);
        jSONObject2.put("value", jSONObject);
        gVar.a(jSONObject2);
    }
}
