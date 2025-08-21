package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Quadrilateral f122147a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f122148b;

    /* renamed from: c, reason: collision with root package name */
    public final TrackedBarcode f122149c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodeArAugmentation$Highlight f122150d;

    /* renamed from: e, reason: collision with root package name */
    public final BarcodeArAugmentation$Annotation f122151e;

    public a(Quadrilateral locationIgnoringLicense, Quadrilateral locationConsideringLicense, TrackedBarcode track, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation) {
        Intrinsics.j(locationIgnoringLicense, "locationIgnoringLicense");
        Intrinsics.j(locationConsideringLicense, "locationConsideringLicense");
        Intrinsics.j(track, "track");
        this.f122147a = locationIgnoringLicense;
        this.f122148b = locationConsideringLicense;
        this.f122149c = track;
        this.f122150d = barcodeArAugmentation$Highlight;
        this.f122151e = barcodeArAugmentation$Annotation;
    }

    public final Quadrilateral a() {
        BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = this.f122151e;
        return Intrinsics.e(barcodeArAugmentation$Annotation != null ? Boolean.valueOf(barcodeArAugmentation$Annotation.c()) : null, Boolean.TRUE) ? this.f122147a : this.f122148b;
    }

    public final Quadrilateral b() {
        BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight = this.f122150d;
        return Intrinsics.e(barcodeArAugmentation$Highlight != null ? Boolean.valueOf(barcodeArAugmentation$Highlight.d()) : null, Boolean.TRUE) ? this.f122147a : this.f122148b;
    }
}
