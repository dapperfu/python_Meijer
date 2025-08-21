package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.statusicon.drawdata;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f123634a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f123635b;

    /* renamed from: c, reason: collision with root package name */
    public final BarcodePickState f123636c;

    public a(int i10, Quadrilateral referenceQuad, BarcodePickState pickState) {
        Intrinsics.j(referenceQuad, "referenceQuad");
        Intrinsics.j(pickState, "pickState");
        this.f123634a = i10;
        this.f123635b = referenceQuad;
        this.f123636c = pickState;
    }
}
