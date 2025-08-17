package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13065e {

    /* renamed from: a, reason: collision with root package name */
    public final TrackedBarcode f121436a;

    /* renamed from: b, reason: collision with root package name */
    public final V f121437b;

    /* renamed from: c, reason: collision with root package name */
    public final float f121438c;

    public C13065e(TrackedBarcode barcode, V overlayInfo, float f10) {
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(overlayInfo, "overlayInfo");
        this.f121436a = barcode;
        this.f121437b = overlayInfo;
        this.f121438c = f10;
    }
}
