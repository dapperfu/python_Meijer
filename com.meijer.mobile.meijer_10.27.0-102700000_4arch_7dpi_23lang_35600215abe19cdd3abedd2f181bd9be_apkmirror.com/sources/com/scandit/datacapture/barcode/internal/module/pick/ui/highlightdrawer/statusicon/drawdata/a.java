package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f122682a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f122683b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodePickState f122684c;

    public a(int i10, Quadrilateral referenceQuad, BarcodePickState pickState) {
        Intrinsics.j(referenceQuad, "referenceQuad");
        Intrinsics.j(pickState, "pickState");
        this.f122682a = i10;
        this.f122683b = referenceQuad;
        this.f122684c = pickState;
    }
}
