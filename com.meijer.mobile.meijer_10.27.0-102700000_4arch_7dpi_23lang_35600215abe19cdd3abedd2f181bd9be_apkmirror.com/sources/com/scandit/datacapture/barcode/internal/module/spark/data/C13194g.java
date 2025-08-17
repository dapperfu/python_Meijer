package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13194g implements SparkScanAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f122898a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.spark.internal.c f122899b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122900c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122901d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122902e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122903f;

    /* renamed from: g, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122904g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f122905h;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a() {
        synchronized (this) {
            com.scandit.datacapture.barcode.internal.module.spark.internal.c cVar = new com.scandit.datacapture.barcode.internal.module.spark.internal.c();
            this.f122899b = cVar;
            com.scandit.datacapture.barcode.internal.module.spark.internal.d[] newDisposables = {this.f122898a.e().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13192e(this.f122902e)), this.f122898a.t().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13193f(this.f122901d)), this.f122898a.v().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13189b(this.f122900c)), this.f122898a.r().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13190c(this.f122904g)), this.f122898a.b().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13191d(this.f122905h))};
            Intrinsics.j(newDisposables, "newDisposables");
            cVar.f122935a.addAll(ArraysKt.c0(newDisposables));
            Unit unit = Unit.f142422a;
        }
    }

    public C13194g(SparkScanStateManager stateManager) {
        Intrinsics.j(stateManager, "stateManager");
        this.f122898a = stateManager;
        this.f122899b = new com.scandit.datacapture.barcode.internal.module.spark.internal.c();
        this.f122900c = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("torch_state", TorchStateSerializer.toJson(stateManager.u()));
        this.f122901d = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("sound_enabled", String.valueOf(stateManager.s()));
        this.f122902e = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("haptic_enabled", String.valueOf(stateManager.d()));
        this.f122903f = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("session_stop_reason", null);
        this.f122904g = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("scanning_mode", SparkScanScanningModeSerializer.toJson(stateManager.p(), true));
        this.f122905h = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("camera_position", CameraPositionSerializer.toJson(stateManager.a()));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a(EnumC13188a stopReason) {
        Intrinsics.j(stopReason, "stopReason");
        synchronized (this) {
            com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f122903f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "session_stop_reason");
            jSONObject.put("value", stopReason.f122892a);
            gVar.a(jSONObject);
            Unit unit = Unit.f142422a;
        }
        this.f122899b.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g a(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1773044719:
                if (str.equals("sound_enabled")) {
                    return this.f122901d;
                }
                return null;
            case -1404158567:
                if (str.equals("haptic_enabled")) {
                    return this.f122902e;
                }
                return null;
            case -1137308018:
                if (str.equals("torch_state")) {
                    return this.f122900c;
                }
                return null;
            case -77151997:
                if (str.equals("camera_position")) {
                    return this.f122905h;
                }
                return null;
            case 1101455473:
                if (str.equals("scanning_mode")) {
                    return this.f122904g;
                }
                return null;
            case 1563988216:
                if (str.equals("session_stop_reason")) {
                    return this.f122903f;
                }
                return null;
            default:
                return null;
        }
    }
}
