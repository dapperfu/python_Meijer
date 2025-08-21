package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Size f124331a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f124332b;

    public P(Size horizontal, Size vertical) {
        Intrinsics.j(horizontal, "horizontal");
        Intrinsics.j(vertical, "vertical");
        this.f124331a = horizontal;
        this.f124332b = vertical;
    }
}
