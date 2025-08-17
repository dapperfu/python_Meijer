package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewHighlightType;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* synthetic */ class BarcodePickDeserializer$Helper$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NativeBarcodePickViewHighlightType.values().length];
        try {
            iArr[NativeBarcodePickViewHighlightType.RECTANGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NativeBarcodePickViewHighlightType.RECTANGULAR_WITH_ICONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NativeBarcodePickViewHighlightType.DOT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NativeBarcodePickViewHighlightType.DOT_WITH_ICONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NativeBarcodePickViewHighlightType.CUSTOM_VIEW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
