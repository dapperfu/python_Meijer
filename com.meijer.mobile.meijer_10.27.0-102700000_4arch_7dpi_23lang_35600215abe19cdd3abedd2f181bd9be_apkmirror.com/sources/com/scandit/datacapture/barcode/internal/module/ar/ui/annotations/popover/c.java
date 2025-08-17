package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.popover;

import com.scandit.datacapture.barcode.ar.ui.annotations.popover.BarcodeArPopoverAnnotationAnchor;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f121137a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(0);
        this.f121137a = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BarcodeArPopoverAnnotationAnchor barcodeArPopoverAnnotationAnchor = this.f121137a.f121141c;
        Intrinsics.j(barcodeArPopoverAnnotationAnchor, "<this>");
        int i10 = com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.a.f121082c[barcodeArPopoverAnnotationAnchor.ordinal()];
        if (i10 == 1) {
            return Anchor.TOP_CENTER;
        }
        if (i10 == 2) {
            return Anchor.BOTTOM_CENTER;
        }
        if (i10 == 3) {
            return Anchor.CENTER_LEFT;
        }
        if (i10 == 4) {
            return Anchor.CENTER_RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
