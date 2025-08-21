package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f122446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122447b;

    /* renamed from: c, reason: collision with root package name */
    public final List f122448c;

    /* renamed from: d, reason: collision with root package name */
    public final Quadrilateral f122449d;

    /* renamed from: e, reason: collision with root package name */
    public final Brush f122450e;

    /* renamed from: f, reason: collision with root package name */
    public final float f122451f;

    /* renamed from: g, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayStyle f122452g;

    /* renamed from: h, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayColorScheme f122453h;

    /* renamed from: i, reason: collision with root package name */
    public final String f122454i;

    /* renamed from: j, reason: collision with root package name */
    public final W f122455j;

    public z(int i10, int i11, ArrayList trackedBarcodeIdentifiers, Quadrilateral mappedLocation, Brush brush, float f10, NativeBarcodeCountBasicOverlayStyle style, NativeBarcodeCountBasicOverlayColorScheme colorScheme, String data, W status) {
        Intrinsics.j(trackedBarcodeIdentifiers, "trackedBarcodeIdentifiers");
        Intrinsics.j(mappedLocation, "mappedLocation");
        Intrinsics.j(brush, "brush");
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        Intrinsics.j(data, "data");
        Intrinsics.j(status, "status");
        this.f122446a = i10;
        this.f122447b = i11;
        this.f122448c = trackedBarcodeIdentifiers;
        this.f122449d = mappedLocation;
        this.f122450e = brush;
        this.f122451f = f10;
        this.f122452g = style;
        this.f122453h = colorScheme;
        this.f122454i = data;
        this.f122455j = status;
    }
}
