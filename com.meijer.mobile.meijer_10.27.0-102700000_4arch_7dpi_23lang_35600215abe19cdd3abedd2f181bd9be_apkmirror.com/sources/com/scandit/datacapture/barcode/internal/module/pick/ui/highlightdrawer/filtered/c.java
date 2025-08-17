package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.filtered;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f122643a;

    /* renamed from: b, reason: collision with root package name */
    public final f f122644b;

    public c(Function1 quadrilateralMapper, f drawSettings) {
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        Intrinsics.j(drawSettings, "drawSettings");
        this.f122643a = quadrilateralMapper;
        this.f122644b = drawSettings;
    }
}
