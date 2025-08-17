package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Quadrilateral f121195a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f121196b;

    /* renamed from: c, reason: collision with root package name */
    public final TrackedBarcode f121197c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodeArAugmentation$Highlight f121198d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodeArAugmentation$Annotation f121199e;

    public a(Quadrilateral locationIgnoringLicense, Quadrilateral locationConsideringLicense, TrackedBarcode track, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        Intrinsics.j(locationIgnoringLicense, "locationIgnoringLicense");
        Intrinsics.j(locationConsideringLicense, "locationConsideringLicense");
        Intrinsics.j(track, "track");
        this.f121195a = locationIgnoringLicense;
        this.f121196b = locationConsideringLicense;
        this.f121197c = track;
        this.f121198d = barcodeArAugmentation$Highlight;
        this.f121199e = barcodeArAugmentation$Annotation;
    }

    public final Quadrilateral a() {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = this.f121199e;
        return Intrinsics.e(barcodeArAugmentation$Annotation != null ? Boolean.valueOf(barcodeArAugmentation$Annotation.c()) : null, Boolean.TRUE) ? this.f121195a : this.f121196b;
    }

    public final Quadrilateral b() {
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = this.f121198d;
        return Intrinsics.e(barcodeArAugmentation$Highlight != null ? Boolean.valueOf(barcodeArAugmentation$Highlight.d()) : null, Boolean.TRUE) ? this.f121195a : this.f121196b;
    }
}
