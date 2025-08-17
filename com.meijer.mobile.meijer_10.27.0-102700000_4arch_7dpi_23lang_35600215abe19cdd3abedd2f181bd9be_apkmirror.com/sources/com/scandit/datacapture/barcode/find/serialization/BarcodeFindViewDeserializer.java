package com.scandit.datacapture.barcode.find.serialization;

import android.view.View;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindView;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.o;
import com.scandit.datacapture.barcode.internal.module.serialization.BarcodeCameraSettingsDeserializer;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.AnchorDeserializer;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/barcode/find/serialization/BarcodeFindViewDeserializer;", "", "<init>", "()V", "Landroid/view/View;", "parentView", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;", "barcodeFind", "", "json", "Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "viewFromJson", "(Landroid/view/View;Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/find/capture/BarcodeFind;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;", "view", "", "updateViewFromJson", "(Lcom/scandit/datacapture/barcode/find/ui/BarcodeFindView;Ljava/lang/String;)V", "", "getWarnings", "()Ljava/util/List;", "warnings", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class BarcodeFindViewDeserializer {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f120971a = new ArrayList();

    private static void a(BarcodeFindView barcodeFindView, JsonValue jsonValue) {
        Object objFromJson;
        Boolean bool;
        Object objFromJson2;
        Boolean bool2;
        Object objFromJson3;
        Boolean bool3;
        Object objFromJson4;
        Boolean bool4;
        Object objFromJson5;
        Boolean bool5;
        Object objFromJson6;
        Boolean bool6;
        Object objFromJson7;
        Boolean bool7;
        Object objFromJson8;
        Anchor anchor;
        Object objFromJson9;
        Boolean bool8;
        Object objFromJson10;
        String str;
        Object objFromJson11;
        String str2;
        Object objFromJson12;
        String str3;
        Object objFromJson13;
        String str4;
        Object objFromJson14;
        String str5;
        Object objFromJson15;
        String str6;
        Object objFromJson16;
        String str7;
        Object objFromJson17;
        boolean zContains = jsonValue.contains("shouldShowUserGuidanceView");
        Class cls = Boolean.TYPE;
        String str8 = null;
        if (zContains) {
            KClass kClassB = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson = new o().a(jsonValue.requireByKeyAsObject("shouldShowUserGuidanceView"));
            } else if (Intrinsics.e(kClassB, Reflection.b(cls))) {
                objFromJson = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowUserGuidanceView"));
            } else if (Intrinsics.e(kClassB, Reflection.b(String.class))) {
                objFromJson = jsonValue.requireByKeyAsString("shouldShowUserGuidanceView");
            } else if (Intrinsics.e(kClassB, Reflection.b(CameraSettings.class))) {
                objFromJson = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowUserGuidanceView"));
            } else {
                if (!Intrinsics.e(kClassB, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowUserGuidanceView"));
            }
            if (objFromJson == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool = (Boolean) objFromJson;
        } else {
            bool = null;
        }
        if (bool != null) {
            barcodeFindView.setShouldShowUserGuidanceView(bool.booleanValue());
            Unit unit = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowHints")) {
            KClass kClassB2 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB2, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson2 = new o().a(jsonValue.requireByKeyAsObject("shouldShowHints"));
            } else if (Intrinsics.e(kClassB2, Reflection.b(cls))) {
                objFromJson2 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowHints"));
            } else if (Intrinsics.e(kClassB2, Reflection.b(String.class))) {
                objFromJson2 = jsonValue.requireByKeyAsString("shouldShowHints");
            } else if (Intrinsics.e(kClassB2, Reflection.b(CameraSettings.class))) {
                objFromJson2 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowHints"));
            } else {
                if (!Intrinsics.e(kClassB2, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson2 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowHints"));
            }
            if (objFromJson2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool2 = (Boolean) objFromJson2;
        } else {
            bool2 = null;
        }
        if (bool2 != null) {
            barcodeFindView.setShouldShowHints(bool2.booleanValue());
            Unit unit2 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowCarousel")) {
            KClass kClassB3 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB3, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson3 = new o().a(jsonValue.requireByKeyAsObject("shouldShowCarousel"));
            } else if (Intrinsics.e(kClassB3, Reflection.b(cls))) {
                objFromJson3 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowCarousel"));
            } else if (Intrinsics.e(kClassB3, Reflection.b(String.class))) {
                objFromJson3 = jsonValue.requireByKeyAsString("shouldShowCarousel");
            } else if (Intrinsics.e(kClassB3, Reflection.b(CameraSettings.class))) {
                objFromJson3 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowCarousel"));
            } else {
                if (!Intrinsics.e(kClassB3, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson3 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowCarousel"));
            }
            if (objFromJson3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool3 = (Boolean) objFromJson3;
        } else {
            bool3 = null;
        }
        if (bool3 != null) {
            barcodeFindView.setShouldShowCarousel(bool3.booleanValue());
            Unit unit3 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowPauseButton")) {
            KClass kClassB4 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB4, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson4 = new o().a(jsonValue.requireByKeyAsObject("shouldShowPauseButton"));
            } else if (Intrinsics.e(kClassB4, Reflection.b(cls))) {
                objFromJson4 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowPauseButton"));
            } else if (Intrinsics.e(kClassB4, Reflection.b(String.class))) {
                objFromJson4 = jsonValue.requireByKeyAsString("shouldShowPauseButton");
            } else if (Intrinsics.e(kClassB4, Reflection.b(CameraSettings.class))) {
                objFromJson4 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowPauseButton"));
            } else {
                if (!Intrinsics.e(kClassB4, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson4 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowPauseButton"));
            }
            if (objFromJson4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool4 = (Boolean) objFromJson4;
        } else {
            bool4 = null;
        }
        if (bool4 != null) {
            barcodeFindView.setShouldShowPauseButton(bool4.booleanValue());
            Unit unit4 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowFinishButton")) {
            KClass kClassB5 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB5, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson5 = new o().a(jsonValue.requireByKeyAsObject("shouldShowFinishButton"));
            } else if (Intrinsics.e(kClassB5, Reflection.b(cls))) {
                objFromJson5 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowFinishButton"));
            } else if (Intrinsics.e(kClassB5, Reflection.b(String.class))) {
                objFromJson5 = jsonValue.requireByKeyAsString("shouldShowFinishButton");
            } else if (Intrinsics.e(kClassB5, Reflection.b(CameraSettings.class))) {
                objFromJson5 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowFinishButton"));
            } else {
                if (!Intrinsics.e(kClassB5, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson5 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowFinishButton"));
            }
            if (objFromJson5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool5 = (Boolean) objFromJson5;
        } else {
            bool5 = null;
        }
        if (bool5 != null) {
            barcodeFindView.setShouldShowFinishButton(bool5.booleanValue());
            Unit unit5 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowProgressBar")) {
            KClass kClassB6 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB6, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson6 = new o().a(jsonValue.requireByKeyAsObject("shouldShowProgressBar"));
            } else if (Intrinsics.e(kClassB6, Reflection.b(cls))) {
                objFromJson6 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowProgressBar"));
            } else if (Intrinsics.e(kClassB6, Reflection.b(String.class))) {
                objFromJson6 = jsonValue.requireByKeyAsString("shouldShowProgressBar");
            } else if (Intrinsics.e(kClassB6, Reflection.b(CameraSettings.class))) {
                objFromJson6 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowProgressBar"));
            } else {
                if (!Intrinsics.e(kClassB6, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson6 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowProgressBar"));
            }
            if (objFromJson6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool6 = (Boolean) objFromJson6;
        } else {
            bool6 = null;
        }
        if (bool6 != null) {
            barcodeFindView.setShouldShowProgressBar(bool6.booleanValue());
            Unit unit6 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowTorchControl")) {
            KClass kClassB7 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB7, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson7 = new o().a(jsonValue.requireByKeyAsObject("shouldShowTorchControl"));
            } else if (Intrinsics.e(kClassB7, Reflection.b(cls))) {
                objFromJson7 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowTorchControl"));
            } else if (Intrinsics.e(kClassB7, Reflection.b(String.class))) {
                objFromJson7 = jsonValue.requireByKeyAsString("shouldShowTorchControl");
            } else if (Intrinsics.e(kClassB7, Reflection.b(CameraSettings.class))) {
                objFromJson7 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowTorchControl"));
            } else {
                if (!Intrinsics.e(kClassB7, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson7 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowTorchControl"));
            }
            if (objFromJson7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool7 = (Boolean) objFromJson7;
        } else {
            bool7 = null;
        }
        if (bool7 != null) {
            barcodeFindView.setShouldShowTorchControl(bool7.booleanValue());
            Unit unit7 = Unit.f142422a;
        }
        if (jsonValue.contains("torchControlPosition")) {
            KClass kClassB8 = Reflection.b(Anchor.class);
            if (Intrinsics.e(kClassB8, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson8 = new o().a(jsonValue.requireByKeyAsObject("torchControlPosition"));
            } else if (Intrinsics.e(kClassB8, Reflection.b(cls))) {
                objFromJson8 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("torchControlPosition"));
            } else if (Intrinsics.e(kClassB8, Reflection.b(String.class))) {
                objFromJson8 = jsonValue.requireByKeyAsString("torchControlPosition");
            } else if (Intrinsics.e(kClassB8, Reflection.b(CameraSettings.class))) {
                objFromJson8 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("torchControlPosition"));
            } else {
                if (!Intrinsics.e(kClassB8, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson8 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("torchControlPosition"));
            }
            if (objFromJson8 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.core.common.geometry.Anchor");
            }
            anchor = (Anchor) objFromJson8;
        } else {
            anchor = null;
        }
        if (anchor != null) {
            barcodeFindView.setTorchControlPosition(anchor);
            Unit unit8 = Unit.f142422a;
        }
        if (jsonValue.contains("shouldShowZoomControl")) {
            KClass kClassB9 = Reflection.b(Boolean.class);
            if (Intrinsics.e(kClassB9, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson9 = new o().a(jsonValue.requireByKeyAsObject("shouldShowZoomControl"));
            } else if (Intrinsics.e(kClassB9, Reflection.b(cls))) {
                objFromJson9 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("shouldShowZoomControl"));
            } else if (Intrinsics.e(kClassB9, Reflection.b(String.class))) {
                objFromJson9 = jsonValue.requireByKeyAsString("shouldShowZoomControl");
            } else if (Intrinsics.e(kClassB9, Reflection.b(CameraSettings.class))) {
                objFromJson9 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("shouldShowZoomControl"));
            } else {
                if (!Intrinsics.e(kClassB9, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson9 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("shouldShowZoomControl"));
            }
            if (objFromJson9 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            bool8 = (Boolean) objFromJson9;
        } else {
            bool8 = null;
        }
        if (bool8 != null) {
            barcodeFindView.setShouldShowZoomControl(bool8.booleanValue());
            Unit unit9 = Unit.f142422a;
        }
        if (jsonValue.contains("textForCollapseCardsButton")) {
            KClass kClassB10 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB10, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson10 = new o().a(jsonValue.requireByKeyAsObject("textForCollapseCardsButton"));
            } else if (Intrinsics.e(kClassB10, Reflection.b(cls))) {
                objFromJson10 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForCollapseCardsButton"));
            } else if (Intrinsics.e(kClassB10, Reflection.b(String.class))) {
                objFromJson10 = jsonValue.requireByKeyAsString("textForCollapseCardsButton");
            } else if (Intrinsics.e(kClassB10, Reflection.b(CameraSettings.class))) {
                objFromJson10 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForCollapseCardsButton"));
            } else {
                if (!Intrinsics.e(kClassB10, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson10 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForCollapseCardsButton"));
            }
            if (objFromJson10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str = (String) objFromJson10;
        } else {
            str = null;
        }
        if (str != null) {
            barcodeFindView.setTextForCollapseCardsButton(str);
            Unit unit10 = Unit.f142422a;
        }
        if (jsonValue.contains("textForAllItemsFoundSuccessfullyHint")) {
            KClass kClassB11 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB11, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson11 = new o().a(jsonValue.requireByKeyAsObject("textForAllItemsFoundSuccessfullyHint"));
            } else if (Intrinsics.e(kClassB11, Reflection.b(cls))) {
                objFromJson11 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForAllItemsFoundSuccessfullyHint"));
            } else if (Intrinsics.e(kClassB11, Reflection.b(String.class))) {
                objFromJson11 = jsonValue.requireByKeyAsString("textForAllItemsFoundSuccessfullyHint");
            } else if (Intrinsics.e(kClassB11, Reflection.b(CameraSettings.class))) {
                objFromJson11 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForAllItemsFoundSuccessfullyHint"));
            } else {
                if (!Intrinsics.e(kClassB11, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson11 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForAllItemsFoundSuccessfullyHint"));
            }
            if (objFromJson11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str2 = (String) objFromJson11;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            barcodeFindView.setTextForAllItemsFoundSuccessfullyHint(str2);
            Unit unit11 = Unit.f142422a;
        }
        if (jsonValue.contains("textForPointAtBarcodesToSearchHint")) {
            KClass kClassB12 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB12, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson12 = new o().a(jsonValue.requireByKeyAsObject("textForPointAtBarcodesToSearchHint"));
            } else if (Intrinsics.e(kClassB12, Reflection.b(cls))) {
                objFromJson12 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForPointAtBarcodesToSearchHint"));
            } else if (Intrinsics.e(kClassB12, Reflection.b(String.class))) {
                objFromJson12 = jsonValue.requireByKeyAsString("textForPointAtBarcodesToSearchHint");
            } else if (Intrinsics.e(kClassB12, Reflection.b(CameraSettings.class))) {
                objFromJson12 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForPointAtBarcodesToSearchHint"));
            } else {
                if (!Intrinsics.e(kClassB12, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson12 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForPointAtBarcodesToSearchHint"));
            }
            if (objFromJson12 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str3 = (String) objFromJson12;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            barcodeFindView.setTextForPointAtBarcodesToSearchHint(str3);
            Unit unit12 = Unit.f142422a;
        }
        if (jsonValue.contains("textForMoveCloserToBarcodesHint")) {
            KClass kClassB13 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB13, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson13 = new o().a(jsonValue.requireByKeyAsObject("textForMoveCloserToBarcodesHint"));
            } else if (Intrinsics.e(kClassB13, Reflection.b(cls))) {
                objFromJson13 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForMoveCloserToBarcodesHint"));
            } else if (Intrinsics.e(kClassB13, Reflection.b(String.class))) {
                objFromJson13 = jsonValue.requireByKeyAsString("textForMoveCloserToBarcodesHint");
            } else if (Intrinsics.e(kClassB13, Reflection.b(CameraSettings.class))) {
                objFromJson13 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForMoveCloserToBarcodesHint"));
            } else {
                if (!Intrinsics.e(kClassB13, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson13 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForMoveCloserToBarcodesHint"));
            }
            if (objFromJson13 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str4 = (String) objFromJson13;
        } else {
            str4 = null;
        }
        if (str4 != null) {
            barcodeFindView.setTextForMoveCloserToBarcodesHint(str4);
            Unit unit13 = Unit.f142422a;
        }
        if (jsonValue.contains("textForTapShutterToPauseScreenHint")) {
            KClass kClassB14 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB14, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson14 = new o().a(jsonValue.requireByKeyAsObject("textForTapShutterToPauseScreenHint"));
            } else if (Intrinsics.e(kClassB14, Reflection.b(cls))) {
                objFromJson14 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForTapShutterToPauseScreenHint"));
            } else if (Intrinsics.e(kClassB14, Reflection.b(String.class))) {
                objFromJson14 = jsonValue.requireByKeyAsString("textForTapShutterToPauseScreenHint");
            } else if (Intrinsics.e(kClassB14, Reflection.b(CameraSettings.class))) {
                objFromJson14 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForTapShutterToPauseScreenHint"));
            } else {
                if (!Intrinsics.e(kClassB14, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson14 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForTapShutterToPauseScreenHint"));
            }
            if (objFromJson14 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str5 = (String) objFromJson14;
        } else {
            str5 = null;
        }
        if (str5 != null) {
            barcodeFindView.setTextForTapShutterToPauseScreenHint(str5);
            Unit unit14 = Unit.f142422a;
        }
        if (jsonValue.contains("textForTapShutterToResumeSearchHint")) {
            KClass kClassB15 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB15, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson15 = new o().a(jsonValue.requireByKeyAsObject("textForTapShutterToResumeSearchHint"));
            } else if (Intrinsics.e(kClassB15, Reflection.b(cls))) {
                objFromJson15 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForTapShutterToResumeSearchHint"));
            } else if (Intrinsics.e(kClassB15, Reflection.b(String.class))) {
                objFromJson15 = jsonValue.requireByKeyAsString("textForTapShutterToResumeSearchHint");
            } else if (Intrinsics.e(kClassB15, Reflection.b(CameraSettings.class))) {
                objFromJson15 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForTapShutterToResumeSearchHint"));
            } else {
                if (!Intrinsics.e(kClassB15, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson15 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForTapShutterToResumeSearchHint"));
            }
            if (objFromJson15 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str6 = (String) objFromJson15;
        } else {
            str6 = null;
        }
        if (str6 != null) {
            barcodeFindView.setTextForTapShutterToResumeSearchHint(str6);
            Unit unit15 = Unit.f142422a;
        }
        if (jsonValue.contains("textForItemListUpdatedHint")) {
            KClass kClassB16 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB16, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson16 = new o().a(jsonValue.requireByKeyAsObject("textForItemListUpdatedHint"));
            } else if (Intrinsics.e(kClassB16, Reflection.b(cls))) {
                objFromJson16 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForItemListUpdatedHint"));
            } else if (Intrinsics.e(kClassB16, Reflection.b(String.class))) {
                objFromJson16 = jsonValue.requireByKeyAsString("textForItemListUpdatedHint");
            } else if (Intrinsics.e(kClassB16, Reflection.b(CameraSettings.class))) {
                objFromJson16 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForItemListUpdatedHint"));
            } else {
                if (!Intrinsics.e(kClassB16, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson16 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForItemListUpdatedHint"));
            }
            if (objFromJson16 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str7 = (String) objFromJson16;
        } else {
            str7 = null;
        }
        if (str7 != null) {
            barcodeFindView.setTextForItemListUpdatedHint(str7);
            Unit unit16 = Unit.f142422a;
        }
        if (jsonValue.contains("textForItemListUpdatedWhenPausedHint")) {
            KClass kClassB17 = Reflection.b(String.class);
            if (Intrinsics.e(kClassB17, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson17 = new o().a(jsonValue.requireByKeyAsObject("textForItemListUpdatedWhenPausedHint"));
            } else if (Intrinsics.e(kClassB17, Reflection.b(cls))) {
                objFromJson17 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("textForItemListUpdatedWhenPausedHint"));
            } else if (Intrinsics.e(kClassB17, Reflection.b(String.class))) {
                objFromJson17 = jsonValue.requireByKeyAsString("textForItemListUpdatedWhenPausedHint");
            } else if (Intrinsics.e(kClassB17, Reflection.b(CameraSettings.class))) {
                objFromJson17 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("textForItemListUpdatedWhenPausedHint"));
            } else {
                if (!Intrinsics.e(kClassB17, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson17 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("textForItemListUpdatedWhenPausedHint"));
            }
            if (objFromJson17 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            str8 = (String) objFromJson17;
        }
        if (str8 != null) {
            barcodeFindView.setTextForItemListUpdatedWhenPausedHint(str8);
            Unit unit17 = Unit.f142422a;
        }
    }

    public final List<String> getWarnings() {
        return this.f120971a;
    }

    public final void updateViewFromJson(BarcodeFindView view, String json) {
        Intrinsics.j(view, "view");
        Intrinsics.j(json, "json");
        this.f120971a.clear();
        JsonValue jsonValue = new JsonValue(json);
        a(view, jsonValue);
        this.f120971a.addAll(jsonValue._getWarnings());
    }

    public final BarcodeFindView viewFromJson(View parentView, DataCaptureContext dataCaptureContext, BarcodeFind barcodeFind, String json) {
        Object objFromJson;
        BarcodeFindViewSettings barcodeFindViewSettings;
        Object objFromJson2;
        Intrinsics.j(parentView, "parentView");
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(barcodeFind, "barcodeFind");
        Intrinsics.j(json, "json");
        this.f120971a.clear();
        JsonValue jsonValue = new JsonValue(json);
        boolean zContains = jsonValue.contains("viewSettings");
        Class cls = Boolean.TYPE;
        CameraSettings recommendedCameraSettings = null;
        if (zContains) {
            KClass kClassB = Reflection.b(BarcodeFindViewSettings.class);
            if (Intrinsics.e(kClassB, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson = new o().a(jsonValue.requireByKeyAsObject("viewSettings"));
            } else if (Intrinsics.e(kClassB, Reflection.b(cls))) {
                objFromJson = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("viewSettings"));
            } else if (Intrinsics.e(kClassB, Reflection.b(String.class))) {
                objFromJson = jsonValue.requireByKeyAsString("viewSettings");
            } else if (Intrinsics.e(kClassB, Reflection.b(CameraSettings.class))) {
                objFromJson = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("viewSettings"));
            } else {
                if (!Intrinsics.e(kClassB, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("viewSettings"));
            }
            if (objFromJson == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings");
            }
            barcodeFindViewSettings = (BarcodeFindViewSettings) objFromJson;
        } else {
            barcodeFindViewSettings = null;
        }
        if (barcodeFindViewSettings == null) {
            barcodeFindViewSettings = new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null);
        }
        if (jsonValue.contains("cameraSettings")) {
            KClass kClassB2 = Reflection.b(CameraSettings.class);
            if (Intrinsics.e(kClassB2, Reflection.b(BarcodeFindViewSettings.class))) {
                objFromJson2 = new o().a(jsonValue.requireByKeyAsObject("cameraSettings"));
            } else if (Intrinsics.e(kClassB2, Reflection.b(cls))) {
                objFromJson2 = Boolean.valueOf(jsonValue.requireByKeyAsBoolean("cameraSettings"));
            } else if (Intrinsics.e(kClassB2, Reflection.b(String.class))) {
                objFromJson2 = jsonValue.requireByKeyAsString("cameraSettings");
            } else if (Intrinsics.e(kClassB2, Reflection.b(CameraSettings.class))) {
                objFromJson2 = new BarcodeCameraSettingsDeserializer(BarcodeFind.INSTANCE.getRecommendedCameraSettings()).a(jsonValue.requireByKeyAsObject("cameraSettings"));
            } else {
                if (!Intrinsics.e(kClassB2, Reflection.b(Anchor.class))) {
                    throw new UnsupportedOperationException("Unsupported");
                }
                objFromJson2 = AnchorDeserializer.fromJson(jsonValue.requireByKeyAsString("cameraSettings"));
            }
            if (objFromJson2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.scandit.datacapture.core.source.CameraSettings");
            }
            recommendedCameraSettings = (CameraSettings) objFromJson2;
        }
        if (recommendedCameraSettings == null) {
            recommendedCameraSettings = BarcodeFind.INSTANCE.getRecommendedCameraSettings();
        }
        BarcodeFindView barcodeFindViewNewInstance = BarcodeFindView.INSTANCE.newInstance(parentView, dataCaptureContext, barcodeFind, barcodeFindViewSettings, recommendedCameraSettings);
        a(barcodeFindViewNewInstance, jsonValue);
        this.f120971a.addAll(jsonValue._getWarnings());
        return barcodeFindViewNewInstance;
    }
}
