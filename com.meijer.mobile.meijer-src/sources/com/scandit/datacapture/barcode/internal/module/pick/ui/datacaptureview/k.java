package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Control f123462a;

    /* renamed from: b, reason: collision with root package name */
    public final Anchor f123463b;

    /* renamed from: c, reason: collision with root package name */
    public final PointWithUnit f123464c;

    public k(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        this.f123462a = control;
        this.f123463b = anchor;
        this.f123464c = offset;
    }
}
