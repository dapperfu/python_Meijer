package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.ui.control.Control;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Control f122483a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122484b;

    /* renamed from: c, reason: collision with root package name */
    public final Anchor f122485c;

    public a(Control control, boolean z10, Anchor anchor) {
        Intrinsics.j(control, "control");
        Intrinsics.j(anchor, "anchor");
        this.f122483a = control;
        this.f122484b = z10;
        this.f122485c = anchor;
    }
}
