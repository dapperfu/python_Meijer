package com.scandit.datacapture.barcode.ar.serialization;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArView;
import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewSettings;
import com.scandit.datacapture.barcode.internal.module.ar.serialization.BarcodeArViewSettingsDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.BarcodeCameraSettingsDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fB\t\b\u0016¢\u0006\u0004\b\u000b\u0010\rJ-\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/scandit/datacapture/barcode/ar/serialization/BarcodeArViewDeserializer;", "", "Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArViewSettingsDeserializer;", "viewSettingsDeserializer", "Lcom/scandit/datacapture/barcode/internal/module/serialization/BarcodeCameraSettingsDeserializer;", "cameraSettingsDeserializer", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArViewSettings;", "settingsFactory", "Lcom/scandit/datacapture/core/source/CameraSettings;", "cameraSettingsFactory", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/ar/serialization/BarcodeArViewSettingsDeserializer;Lcom/scandit/datacapture/barcode/internal/module/serialization/BarcodeCameraSettingsDeserializer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "()V", "Landroid/view/ViewGroup;", "parentView", "Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;", "mode", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "", "json", "Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArView;", "viewFromJson", "(Landroid/view/ViewGroup;Lcom/scandit/datacapture/barcode/ar/capture/BarcodeAr;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArView;", "view", "", "updateViewFromJson", "(Lcom/scandit/datacapture/barcode/ar/ui/BarcodeArView;Ljava/lang/String;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArViewDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeArViewSettingsDeserializer f121069a;

    /* renamed from: b, reason: collision with root package name */
    private final BarcodeCameraSettingsDeserializer f121070b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f121071c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f121072d;

    public BarcodeArViewDeserializer(BarcodeArViewSettingsDeserializer viewSettingsDeserializer, BarcodeCameraSettingsDeserializer cameraSettingsDeserializer, Function0<BarcodeArViewSettings> settingsFactory, Function0<CameraSettings> cameraSettingsFactory) {
        Intrinsics.j(viewSettingsDeserializer, "viewSettingsDeserializer");
        Intrinsics.j(cameraSettingsDeserializer, "cameraSettingsDeserializer");
        Intrinsics.j(settingsFactory, "settingsFactory");
        Intrinsics.j(cameraSettingsFactory, "cameraSettingsFactory");
        this.f121069a = viewSettingsDeserializer;
        this.f121070b = cameraSettingsDeserializer;
        this.f121071c = settingsFactory;
        this.f121072d = cameraSettingsFactory;
    }

    public final void updateViewFromJson(BarcodeArView view, String json) {
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        view._updateFromJson$scandit_barcode_capture(new JsonValue(json));
    }

    public final BarcodeArView viewFromJson(ViewGroup parentView, BarcodeAr mode, DataCaptureContext context, String json) {
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        BarcodeArViewSettings barcodeArViewSettings = (BarcodeArViewSettings) this.f121071c.invoke();
        CameraSettings cameraSettingsA = (CameraSettings) this.f121072d.invoke();
        if (jsonValue.contains("viewSettings")) {
            this.f121069a.a(barcodeArViewSettings, jsonValue.requireByKeyAsObject("viewSettings"));
        }
        if (jsonValue.contains("cameraSettings")) {
            cameraSettingsA = this.f121070b.a(jsonValue.requireByKeyAsObject("cameraSettings"));
        }
        BarcodeArView barcodeArView = new BarcodeArView(parentView, mode, context, barcodeArViewSettings, cameraSettingsA);
        updateViewFromJson(barcodeArView, json);
        return barcodeArView;
    }

    public BarcodeArViewDeserializer() {
        this(new com.scandit.datacapture.barcode.internal.module.ar.serialization.f(), new BarcodeCameraSettingsDeserializer(BarcodeAr.INSTANCE.createRecommendedCameraSettings()), k.f121083a, l.f121084a);
    }
}
