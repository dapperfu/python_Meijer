package com.scandit.datacapture.barcode.internal.sdk.ar.capture;

import com.scandit.datacapture.barcode.ar.capture.BarcodeArSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/sdk/ar/capture/BarcodeArDefaults;", "", "", "a", "Z", "getExpectsUniqueBarcodes", "()Z", "getExpectsUniqueBarcodes$annotations", "()V", "expectsUniqueBarcodes", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeArDefaults {
    public static final BarcodeArDefaults INSTANCE = new BarcodeArDefaults();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final boolean expectsUniqueBarcodes = new BarcodeArSettings().getExpectsOnlyUniqueBarcodes();

    @JvmStatic
    public static /* synthetic */ void getExpectsUniqueBarcodes$annotations() {
    }

    public static final boolean getExpectsUniqueBarcodes() {
        return expectsUniqueBarcodes;
    }

    private BarcodeArDefaults() {
    }
}
