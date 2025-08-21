package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover;

import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13393m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13394n;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13394n f122091a;

    /* renamed from: b, reason: collision with root package name */
    public Quadrilateral f122092b;

    /* renamed from: c, reason: collision with root package name */
    public BarcodeArPopoverAnnotationAnchor f122093c;

    /* renamed from: d, reason: collision with root package name */
    public Size2 f122094d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b f122095e;

    public e(C13393m popover) {
        Intrinsics.j(popover, "popover");
        this.f122091a = popover;
        this.f122093c = BarcodeArViewDefaults.getDefaultPopoverAnnotationAnchor();
        b referenceQuadGetter = new b(this);
        c anchorGetter = new c(this);
        d sizeGetter = new d(this);
        Intrinsics.j(com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f124379a, "<this>");
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f122095e = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b(referenceQuadGetter, anchorGetter, sizeGetter);
    }
}
