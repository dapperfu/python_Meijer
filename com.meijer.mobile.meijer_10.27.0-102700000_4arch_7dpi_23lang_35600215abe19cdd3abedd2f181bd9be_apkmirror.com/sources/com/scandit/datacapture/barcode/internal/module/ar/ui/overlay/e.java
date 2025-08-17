package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f121202a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f121203b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f121204c;

    public e(com.scandit.datacapture.barcode.ar.ui.l highlightRequestor, com.scandit.datacapture.barcode.ar.ui.m annotationRequestor, com.scandit.datacapture.barcode.ar.ui.n quadrilateralMapper) {
        Intrinsics.j(highlightRequestor, "highlightRequestor");
        Intrinsics.j(annotationRequestor, "annotationRequestor");
        Intrinsics.j(quadrilateralMapper, "quadrilateralMapper");
        this.f121202a = highlightRequestor;
        this.f121203b = annotationRequestor;
        this.f121204c = quadrilateralMapper;
    }
}
