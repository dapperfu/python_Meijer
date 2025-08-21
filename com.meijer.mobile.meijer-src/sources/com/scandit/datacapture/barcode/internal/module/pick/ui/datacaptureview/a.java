package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Control f123435a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123436b;

    /* renamed from: c, reason: collision with root package name */
    public final Anchor f123437c;

    public a(Control control, boolean z10, Anchor anchor) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        this.f123435a = control;
        this.f123436b = z10;
        this.f123437c = anchor;
    }
}
