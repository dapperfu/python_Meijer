package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f123595a;

    /* renamed from: b, reason: collision with root package name */
    public final f f123596b;

    public c(Function1 quadrilateralMapper, f drawSettings) {
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        this.f123595a = quadrilateralMapper;
        this.f123596b = drawSettings;
    }
}
