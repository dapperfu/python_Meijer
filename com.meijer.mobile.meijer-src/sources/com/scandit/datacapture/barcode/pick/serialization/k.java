package com.scandit.datacapture.barcode.pick.serialization;

import android.graphics.Bitmap;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleCustomView;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDot;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleDotWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangular;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightStyleRectangularWithIcons;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightType;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyle;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.icon.ScanditIcon;
import com.scandit.datacapture.core.ui.icon.ScanditIconDeserializer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k implements BarcodePickDeserializerHelper, DataCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    public BarcodePickSettings f124580a;

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePick mode, JsonValue json) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(json, "json");
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureDeserializerHelper
    public final void clear() {
        this.f124580a = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePick a(DataCaptureContext dataCaptureContext, BarcodePickProductProvider provider) {
        Intrinsics.j(dataCaptureContext, "dataCaptureContext");
        Intrinsics.j(provider, "provider");
        BarcodePickSettings barcodePickSettings = new BarcodePickSettings();
        this.f124580a = barcodePickSettings;
        return new BarcodePick(dataCaptureContext, barcodePickSettings, provider);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickSettings createSettings() {
        BarcodePickSettings barcodePickSettings = this.f124580a;
        if (barcodePickSettings != null) {
            return barcodePickSettings;
        }
        BarcodePickSettings barcodePickSettings2 = new BarcodePickSettings();
        this.f124580a = barcodePickSettings2;
        return barcodePickSettings2;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePickSettings settings, JsonValue json) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(json, "json");
        settings._updateFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePick mode, BarcodePickSettings settings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(settings, "settings");
        BarcodePick._applySettings$scandit_barcode_capture$default(mode, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickBasicOverlay a(BarcodePick mode, BarcodePickViewSettings viewSettings) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(viewSettings, "viewSettings");
        return new BarcodePickBasicOverlay(AppAndroidEnvironment.INSTANCE.getApplicationContext(), mode, viewSettings);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final BarcodePickViewSettings a() {
        return new BarcodePickViewSettings();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper
    public final void a(BarcodePickViewSettings viewSettings, JsonValue json) {
        BarcodePickViewHighlightStyle rectangular;
        BarcodePickViewHighlightStyle rectangularWithIcons;
        Intrinsics.j(viewSettings, "viewSettings");
        Intrinsics.j(json, "json");
        JsonValue byKeyAsObject = json.getByKeyAsObject("highlightStyle", null);
        if (byKeyAsObject == null) {
            return;
        }
        NativeBarcodePickViewHighlightType highlightStyleType = viewSettings.getF124673a().getHighlightStyleType();
        Intrinsics.g(highlightStyleType);
        int i10 = BarcodePickDeserializer$Helper$WhenMappings.$EnumSwitchMapping$0[highlightStyleType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                NativeBarcodePickViewHighlightStyleRectangularWithIcons highlightStyleAsRectangularWithIcons = viewSettings.getF124673a().getHighlightStyleAsRectangularWithIcons();
                Intrinsics.i(highlightStyleAsRectangularWithIcons, "getHighlightStyleAsRectangularWithIcons(...)");
                rectangularWithIcons = new BarcodePickViewHighlightStyle.RectangularWithIcons(highlightStyleAsRectangularWithIcons, null, 2, null);
                a(rectangularWithIcons, byKeyAsObject, BarcodePickDeserializer.FIELD_ICONS_FOR_STATE, c.f124572a, d.f124573a, e.f124574a, f.f124575a);
                a(rectangularWithIcons, byKeyAsObject, BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE, g.f124576a, h.f124577a, i.f124578a, j.f124579a);
            } else if (i10 == 3) {
                NativeBarcodePickViewHighlightStyleDot highlightStyleAsDot = viewSettings.getF124673a().getHighlightStyleAsDot();
                Intrinsics.i(highlightStyleAsDot, "getHighlightStyleAsDot(...)");
                rectangular = new BarcodePickViewHighlightStyle.Dot(highlightStyleAsDot);
            } else if (i10 == 4) {
                NativeBarcodePickViewHighlightStyleDotWithIcons highlightStyleAsDotWithIcons = viewSettings.getF124673a().getHighlightStyleAsDotWithIcons();
                Intrinsics.i(highlightStyleAsDotWithIcons, "getHighlightStyleAsDotWithIcons(...)");
                rectangularWithIcons = new BarcodePickViewHighlightStyle.DotWithIcons(highlightStyleAsDotWithIcons, null, 2, null);
                a(rectangularWithIcons, byKeyAsObject, BarcodePickDeserializer.FIELD_ICONS_FOR_STATE, c.f124572a, d.f124573a, e.f124574a, f.f124575a);
                a(rectangularWithIcons, byKeyAsObject, BarcodePickDeserializer.FIELD_SELECTED_ICONS_FOR_STATE, g.f124576a, h.f124577a, i.f124578a, j.f124579a);
            } else if (i10 == 5) {
                NativeBarcodePickViewHighlightStyleCustomView highlightStyleAsCustomView = viewSettings.getF124673a().getHighlightStyleAsCustomView();
                Intrinsics.i(highlightStyleAsCustomView, "getHighlightStyleAsCustomView(...)");
                rectangular = new BarcodePickViewHighlightStyle.CustomView(highlightStyleAsCustomView);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            rectangular = rectangularWithIcons;
        } else {
            NativeBarcodePickViewHighlightStyleRectangular highlightStyleAsRectangular = viewSettings.getF124673a().getHighlightStyleAsRectangular();
            Intrinsics.i(highlightStyleAsRectangular, "getHighlightStyleAsRectangular(...)");
            rectangular = new BarcodePickViewHighlightStyle.Rectangular(highlightStyleAsRectangular);
        }
        viewSettings.setHighlightStyle(rectangular);
    }

    public static void a(BarcodePickViewHighlightStyle barcodePickViewHighlightStyle, JsonValue jsonValue, String str, Function3 function3, Function3 function32, Function3 function33, Function3 function34) {
        Object objB;
        if (jsonValue.contains(str)) {
            JsonValue jsonValueRequireByKeyAsArray = jsonValue.requireByKeyAsArray(str);
            int size = (int) jsonValueRequireByKeyAsArray.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                JsonValue jsonValueRequireByIndex = jsonValueRequireByKeyAsArray.requireByIndex(i10);
                BarcodePickState barcodePickStateFromJsonString = BarcodePickState.INSTANCE.fromJsonString(jsonValueRequireByIndex.requireByKeyAsString(BarcodePickDeserializer.FIELD_BARCODE_PICK_STATE));
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JsonValue byKeyAsObject = jsonValueRequireByIndex.getByKeyAsObject(BarcodePickDeserializer.FIELD_ICON, null);
                    Intrinsics.g(byKeyAsObject);
                    objB = Result.b(ScanditIconDeserializer.fromJson(byKeyAsObject.jsonString()));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(th2));
                }
                if (Result.h(objB)) {
                    ScanditIcon scanditIcon = (ScanditIcon) objB;
                    if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
                        function32.invoke(barcodePickViewHighlightStyle, scanditIcon, barcodePickStateFromJsonString);
                    } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
                        function34.invoke(barcodePickViewHighlightStyle, scanditIcon, barcodePickStateFromJsonString);
                    }
                }
                if (Result.e(objB) != null) {
                    Bitmap bitmapBitmapFromBase64 = BitmapExtensionsKt.bitmapFromBase64(jsonValueRequireByIndex.requireByKeyAsString(BarcodePickDeserializer.FIELD_ICON));
                    if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.RectangularWithIcons) {
                        function3.invoke(barcodePickViewHighlightStyle, bitmapBitmapFromBase64, barcodePickStateFromJsonString);
                    } else if (barcodePickViewHighlightStyle instanceof BarcodePickViewHighlightStyle.DotWithIcons) {
                        function33.invoke(barcodePickViewHighlightStyle, bitmapBitmapFromBase64, barcodePickStateFromJsonString);
                    }
                }
            }
        }
    }
}
