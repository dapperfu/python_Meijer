package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover;

import com.scandit.datacapture.barcode.ar.ui.BarcodeArViewDefaults;
import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.barcode.internal.module.ui.popover.C13260m;
import com.scandit.datacapture.barcode.internal.module.ui.popover.InterfaceC13261n;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13261n f121139a;

    /* renamed from: b, reason: collision with root package name */
    public Quadrilateral f121140b;

    /* renamed from: c, reason: collision with root package name */
    public BarcodeArPopoverAnnotationAnchor f121141c;

    /* renamed from: d, reason: collision with root package name */
    public Size2 f121142d;

    /* renamed from: e, reason: collision with root package name */
    public final com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b f121143e;

    public e(C13260m popover) {
        Intrinsics.j(popover, "popover");
        this.f121139a = popover;
        this.f121141c = BarcodeArViewDefaults.getDefaultPopoverAnnotationAnchor();
        b referenceQuadGetter = new b(this);
        c anchorGetter = new c(this);
        d sizeGetter = new d(this);
        Intrinsics.j(com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.c.f123427a, "<this>");
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f121143e = new com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.b(referenceQuadGetter, anchorGetter, sizeGetter);
    }
}
