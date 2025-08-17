package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.ui.style.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f121494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121495b;

    /* renamed from: c, reason: collision with root package name */
    public final List f121496c;

    /* renamed from: d, reason: collision with root package name */
    public final Quadrilateral f121497d;

    /* renamed from: e, reason: collision with root package name */
    public final Brush f121498e;

    /* renamed from: f, reason: collision with root package name */
    public final float f121499f;

    /* renamed from: g, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayStyle f121500g;

    /* renamed from: h, reason: collision with root package name */
    public final NativeBarcodeCountBasicOverlayColorScheme f121501h;

    /* renamed from: i, reason: collision with root package name */
    public final String f121502i;

    /* renamed from: j, reason: collision with root package name */
    public final W f121503j;

    public z(int i10, int i11, ArrayList trackedBarcodeIdentifiers, Quadrilateral mappedLocation, Brush brush, float f10, NativeBarcodeCountBasicOverlayStyle style, NativeBarcodeCountBasicOverlayColorScheme colorScheme, String data, W status) {
        Intrinsics.j(trackedBarcodeIdentifiers, "trackedBarcodeIdentifiers");
        Intrinsics.j(mappedLocation, "mappedLocation");
        Intrinsics.j(brush, "brush");
        Intrinsics.j(style, "style");
        Intrinsics.j(colorScheme, "colorScheme");
        Intrinsics.j(data, "data");
        Intrinsics.j(status, "status");
        this.f121494a = i10;
        this.f121495b = i11;
        this.f121496c = trackedBarcodeIdentifiers;
        this.f121497d = mappedLocation;
        this.f121498e = brush;
        this.f121499f = f10;
        this.f121500g = style;
        this.f121501h = colorScheme;
        this.f121502i = data;
        this.f121503j = status;
    }
}
