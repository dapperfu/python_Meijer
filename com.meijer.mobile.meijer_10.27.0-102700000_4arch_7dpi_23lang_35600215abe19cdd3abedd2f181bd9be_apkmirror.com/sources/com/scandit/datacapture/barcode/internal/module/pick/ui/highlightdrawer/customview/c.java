package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Size2 f122606a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122607b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f122608c;

    /* renamed from: d, reason: collision with root package name */
    public final BarcodePickViewSettings f122609d;

    public c(Size2 minSize, boolean z10, com.scandit.datacapture.barcode.internal.module.pick.ui.pickviewfactories.f quadrilateralMapper, BarcodePickViewSettings viewSettings) {
        Intrinsics.j(minSize, "minSize");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(viewSettings, "viewSettings");
        this.f122606a = minSize;
        this.f122607b = z10;
        this.f122608c = quadrilateralMapper;
        this.f122609d = viewSettings;
    }
}
