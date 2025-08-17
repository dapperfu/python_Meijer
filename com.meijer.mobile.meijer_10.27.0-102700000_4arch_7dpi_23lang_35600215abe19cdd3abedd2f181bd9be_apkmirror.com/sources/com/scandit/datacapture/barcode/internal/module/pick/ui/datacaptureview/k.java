package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Control f122510a;

    /* renamed from: b, reason: collision with root package name */
    public final Anchor f122511b;

    /* renamed from: c, reason: collision with root package name */
    public final PointWithUnit f122512c;

    public k(Control control, Anchor anchor, PointWithUnit offset) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        this.f122510a = control;
        this.f122511b = anchor;
        this.f122512c = offset;
    }
}
