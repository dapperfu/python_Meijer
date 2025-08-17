package com.scandit.datacapture.barcode.internal.module.find.serialization;

import com.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer;
import com.scandit.datacapture.barcode.find.ui.BarcodeFindViewSettings;
import com.scandit.datacapture.barcode.find.ui.ScreenSizeCategory;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeColorExtensionsKt;
import com.scandit.datacapture.core.json.JsonValue;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f122150a = new ArrayList();

    public final BarcodeFindViewSettings a(JsonValue json) {
        Intrinsics.j(json, "json");
        this.f122150a.clear();
        BarcodeFindViewSettings barcodeFindViewSettings = new BarcodeFindViewSettings(0, 0, false, false, 15, (DefaultConstructorMarker) null);
        int inListItemColor = barcodeFindViewSettings.getInListItemColor();
        Intrinsics.j(json, "<this>");
        Intrinsics.j("inListItemColor", "key");
        NativeColor colorForKeyOrDefault = json.getF125830a().getColorForKeyOrDefault("inListItemColor", NativeColorExtensionsKt.toNativeColor(inListItemColor));
        Intrinsics.i(colorForKeyOrDefault, "getColorForKeyOrDefault(...)");
        int i10 = NativeColorExtensionsKt.toInt(colorForKeyOrDefault);
        int notInListItemColor = barcodeFindViewSettings.getNotInListItemColor();
        Intrinsics.j(json, "<this>");
        Intrinsics.j("notInListItemColor", "key");
        NativeColor colorForKeyOrDefault2 = json.getF125830a().getColorForKeyOrDefault("notInListItemColor", NativeColorExtensionsKt.toNativeColor(notInListItemColor));
        Intrinsics.i(colorForKeyOrDefault2, "getColorForKeyOrDefault(...)");
        int i11 = NativeColorExtensionsKt.toInt(colorForKeyOrDefault2);
        int progressBarStartColor = barcodeFindViewSettings.getProgressBarStartColor();
        Intrinsics.j(json, "<this>");
        Intrinsics.j("progressBarStartColor", "key");
        NativeColor colorForKeyOrDefault3 = json.getF125830a().getColorForKeyOrDefault("progressBarStartColor", NativeColorExtensionsKt.toNativeColor(progressBarStartColor));
        Intrinsics.i(colorForKeyOrDefault3, "getColorForKeyOrDefault(...)");
        int i12 = NativeColorExtensionsKt.toInt(colorForKeyOrDefault3);
        int progressBarFinishColor = barcodeFindViewSettings.getProgressBarFinishColor();
        Intrinsics.j(json, "<this>");
        Intrinsics.j("progressBarFinishColor", "key");
        NativeColor colorForKeyOrDefault4 = json.getF125830a().getColorForKeyOrDefault("progressBarFinishColor", NativeColorExtensionsKt.toNativeColor(progressBarFinishColor));
        Intrinsics.i(colorForKeyOrDefault4, "getColorForKeyOrDefault(...)");
        int i13 = NativeColorExtensionsKt.toInt(colorForKeyOrDefault4);
        boolean byKeyAsBoolean = json.getByKeyAsBoolean("soundEnabled", barcodeFindViewSettings.getSoundEnabled());
        boolean byKeyAsBoolean2 = json.getByKeyAsBoolean("hapticEnabled", barcodeFindViewSettings.getHapticEnabled());
        boolean byKeyAsBoolean3 = json.getByKeyAsBoolean(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED, barcodeFindViewSettings.getCom.scandit.datacapture.barcode.count.serialization.BarcodeCountViewDeserializer.KEY_HW_TRIGGER_ENABLED java.lang.String());
        Integer numValueOf = json.contains(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE) ? Integer.valueOf(json.getByKeyAsInt(BarcodeCountViewDeserializer.KEY_HW_TRIGGER_KEY_CODE, 0)) : null;
        ScreenSizeCategory screenSizeCategoryFromJson = json.contains("screenCategory") ? ScreenSizeCategory.INSTANCE.fromJson(json.requireByKeyAsString("screenCategory")) : null;
        BarcodeFindViewSettings barcodeFindViewSettings2 = new BarcodeFindViewSettings(i10, i11, i12, i13, byKeyAsBoolean, byKeyAsBoolean2, byKeyAsBoolean3, numValueOf);
        if (screenSizeCategoryFromJson != null) {
            barcodeFindViewSettings2._setProperty("screenCategory", screenSizeCategoryFromJson.getF121004a());
        }
        this.f122150a.addAll(json._getWarnings());
        return barcodeFindViewSettings2;
    }
}
