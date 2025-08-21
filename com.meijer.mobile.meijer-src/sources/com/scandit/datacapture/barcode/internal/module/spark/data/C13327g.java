package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.spark.serialization.SparkScanScanningModeSerializer;
import com.scandit.datacapture.core.source.CameraPositionSerializer;
import com.scandit.datacapture.core.source.TorchStateSerializer;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13327g implements SparkScanAnalyticsManager {

    /* renamed from: a, reason: collision with root package name */
    public final SparkScanStateManager f123850a;

    /* renamed from: b, reason: collision with root package name */
    public com.scandit.datacapture.barcode.internal.module.spark.internal.c f123851b;

    /* renamed from: c, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123852c;

    /* renamed from: d, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123853d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123854e;

    /* renamed from: f, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123855f;

    /* renamed from: g, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123856g;

    /* renamed from: h, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g f123857h;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a() {
        synchronized (this) {
            com.scandit.datacapture.barcode.internal.module.spark.internal.c cVar = new com.scandit.datacapture.barcode.internal.module.spark.internal.c();
            this.f123851b = cVar;
            com.scandit.datacapture.barcode.internal.module.spark.internal.d[] newDisposables = {this.f123850a.e().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13325e(this.f123854e)), this.f123850a.t().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13326f(this.f123853d)), this.f123850a.v().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13322b(this.f123852c)), this.f123850a.r().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13323c(this.f123856g)), this.f123850a.b().a((com.scandit.datacapture.barcode.internal.module.spark.internal.x) new C13324d(this.f123857h))};
            Intrinsics.j(newDisposables, "newDisposables");
            cVar.f123887a.addAll(ArraysKt.c0(newDisposables));
            Unit unit = Unit.f143329a;
        }
    }

    public C13327g(SparkScanStateManager stateManager) {
        Intrinsics.j(stateManager, "stateManager");
        this.f123850a = stateManager;
        this.f123851b = new com.scandit.datacapture.barcode.internal.module.spark.internal.c();
        this.f123852c = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("torch_state", TorchStateSerializer.toJson(stateManager.u()));
        this.f123853d = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("sound_enabled", String.valueOf(stateManager.s()));
        this.f123854e = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("haptic_enabled", String.valueOf(stateManager.d()));
        this.f123855f = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("session_stop_reason", null);
        this.f123856g = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("scanning_mode", SparkScanScanningModeSerializer.toJson(stateManager.p(), true));
        this.f123857h = new com.scandit.datacapture.barcode.internal.module.spark.internal.g("camera_position", CameraPositionSerializer.toJson(stateManager.a()));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final void a(EnumC13321a stopReason) {
        Intrinsics.j(stopReason, "stopReason");
        synchronized (this) {
            com.scandit.datacapture.barcode.internal.module.spark.internal.g gVar = this.f123855f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "session_stop_reason");
            jSONObject.put("value", stopReason.f123844a);
            gVar.a(jSONObject);
            Unit unit = Unit.f143329a;
        }
        this.f123851b.a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanAnalyticsManager
    public final com.scandit.datacapture.barcode.internal.module.spark.internal.g a(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1773044719:
                if (str.equals("sound_enabled")) {
                    return this.f123853d;
                }
                return null;
            case -1404158567:
                if (str.equals("haptic_enabled")) {
                    return this.f123854e;
                }
                return null;
            case -1137308018:
                if (str.equals("torch_state")) {
                    return this.f123852c;
                }
                return null;
            case -77151997:
                if (str.equals("camera_position")) {
                    return this.f123857h;
                }
                return null;
            case 1101455473:
                if (str.equals("scanning_mode")) {
                    return this.f123856g;
                }
                return null;
            case 1563988216:
                if (str.equals("session_stop_reason")) {
                    return this.f123855f;
                }
                return null;
            default:
                return null;
        }
    }
}
