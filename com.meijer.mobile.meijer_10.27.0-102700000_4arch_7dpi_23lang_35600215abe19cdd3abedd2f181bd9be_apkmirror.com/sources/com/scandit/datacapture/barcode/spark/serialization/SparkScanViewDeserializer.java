package com.scandit.datacapture.barcode.spark.serialization;

import android.graphics.Bitmap;
import android.view.View;
import com.scandit.datacapture.barcode.internal.module.spark.serialization.SparkScanViewSettingsDeserializer;
import com.scandit.datacapture.barcode.spark.capture.SparkScan;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/scandit/datacapture/barcode/spark/serialization/SparkScanViewDeserializer;", "", "Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanViewSettingsDeserializer;", "viewSettingsDeserializer", "Lkotlin/Function0;", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanViewSettings;", "settingsFactory", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/spark/serialization/SparkScanViewSettingsDeserializer;Lkotlin/jvm/functions/Function0;)V", "()V", "Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "view", "", "jsonData", "updateViewFromJson", "(Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;", "mode", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "json", "viewFrom", "(Landroid/view/View;Lcom/scandit/datacapture/barcode/spark/capture/SparkScan;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/spark/ui/SparkScanView;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SparkScanViewDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final SparkScanViewSettingsDeserializer f123917a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f123918b;

    public SparkScanViewDeserializer(SparkScanViewSettingsDeserializer viewSettingsDeserializer, Function0<SparkScanViewSettings> settingsFactory) {
        Intrinsics.j(viewSettingsDeserializer, "viewSettingsDeserializer");
        Intrinsics.j(settingsFactory, "settingsFactory");
        this.f123917a = viewSettingsDeserializer;
        this.f123918b = settingsFactory;
    }

    public final SparkScanView updateViewFromJson(SparkScanView view, String jsonData) {
        Intrinsics.j(view, "view");
        Intrinsics.j(jsonData, "jsonData");
        JsonValue jsonValue = new JsonValue(jsonData);
        if (jsonValue.contains("scanningBehaviorButtonVisible")) {
            view.setScanningBehaviorButtonVisible(jsonValue.requireByKeyAsBoolean("scanningBehaviorButtonVisible"));
        }
        if (jsonValue.contains("triggerButtonCollapsedColor")) {
            view.setTriggerButtonCollapsedColor(Integer.valueOf(jsonValue.requireByKeyAsColor("triggerButtonCollapsedColor")));
        }
        if (jsonValue.contains("triggerButtonExpandedColor")) {
            view.setTriggerButtonExpandedColor(Integer.valueOf(jsonValue.requireByKeyAsColor("triggerButtonExpandedColor")));
        }
        if (jsonValue.contains("triggerButtonTintColor")) {
            view.setTriggerButtonTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("triggerButtonTintColor")));
        }
        if (jsonValue.contains("triggerButtonAnimationColor")) {
            view.setTriggerButtonAnimationColor(Integer.valueOf(jsonValue.requireByKeyAsColor("triggerButtonAnimationColor")));
        }
        if (jsonValue.contains("toolbarBackgroundColor")) {
            view.setToolbarBackgroundColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarBackgroundColor")));
        }
        if (jsonValue.contains("barcodeCountButtonVisible")) {
            view.setBarcodeCountButtonVisible(jsonValue.requireByKeyAsBoolean("barcodeCountButtonVisible"));
        }
        if (jsonValue.contains("barcodeFindButtonVisible")) {
            view.setBarcodeFindButtonVisible(jsonValue.requireByKeyAsBoolean("barcodeFindButtonVisible"));
        }
        if (jsonValue.contains("labelCaptureButtonVisible")) {
            view.setLabelCaptureButtonVisible(jsonValue.requireByKeyAsBoolean("labelCaptureButtonVisible"));
        }
        if (jsonValue.contains("targetModeButtonVisible")) {
            view.setTargetModeButtonVisible(jsonValue.requireByKeyAsBoolean("targetModeButtonVisible"));
        }
        if (jsonValue.contains("toolbarIconActiveTintColor")) {
            view.setToolbarIconActiveTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarIconActiveTintColor")));
        }
        if (jsonValue.contains("toolbarIconInactiveTintColor")) {
            view.setToolbarIconInactiveTintColor(Integer.valueOf(jsonValue.requireByKeyAsColor("toolbarIconInactiveTintColor")));
        }
        if (jsonValue.contains("zoomSwitchControlVisible")) {
            view.setZoomSwitchControlVisible(jsonValue.requireByKeyAsBoolean("zoomSwitchControlVisible"));
        }
        if (jsonValue.contains("previewSizeControlVisible")) {
            view.setPreviewSizeControlVisible(jsonValue.requireByKeyAsBoolean("previewSizeControlVisible"));
        }
        if (jsonValue.contains("previewCloseControlVisible")) {
            view.setPreviewCloseControlVisible(jsonValue.requireByKeyAsBoolean("previewCloseControlVisible"));
        }
        if (jsonValue.contains("torchControlVisible")) {
            view.setTorchControlVisible(jsonValue.requireByKeyAsBoolean("torchControlVisible"));
        }
        if (jsonValue.contains("cameraSwitchButtonVisible")) {
            view.setCameraSwitchButtonVisible(jsonValue.requireByKeyAsBoolean("cameraSwitchButtonVisible"));
        }
        if (jsonValue.contains("triggerButtonVisible")) {
            view.setTriggerButtonVisible(jsonValue.requireByKeyAsBoolean("triggerButtonVisible"));
        }
        if (jsonValue.contains("triggerButtonImage")) {
            view.setTriggerButtonImage(BitmapExtensionsKt.bitmapFromBase64(jsonValue.requireByKeyAsString("triggerButtonImage")));
            return view;
        }
        if (jsonValue.containsNull("triggerButtonImage")) {
            view.setTriggerButtonImage((Bitmap) null);
        }
        return view;
    }

    public final SparkScanView viewFrom(View parentView, SparkScan mode, DataCaptureContext context, String json) {
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(context, "context");
        Intrinsics.j(json, "json");
        JsonValue jsonValue = new JsonValue(json);
        SparkScanViewSettings sparkScanViewSettings = (SparkScanViewSettings) this.f123918b.invoke();
        if (jsonValue.contains("viewSettings")) {
            this.f123917a.a(sparkScanViewSettings, jsonValue.requireByKeyAsObject("viewSettings"));
        }
        return updateViewFromJson(SparkScanView.INSTANCE.newInstance(parentView, context, mode, sparkScanViewSettings), json);
    }

    public SparkScanViewDeserializer() {
        this(new com.scandit.datacapture.barcode.internal.module.spark.serialization.c(), c.f123921a);
    }
}
