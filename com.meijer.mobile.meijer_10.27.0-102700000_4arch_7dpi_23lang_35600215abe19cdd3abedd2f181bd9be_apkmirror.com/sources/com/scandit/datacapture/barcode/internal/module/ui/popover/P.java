package com.scandit.datacapture.barcode.internal.module.ui.popover;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Size f123379a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f123380b;

    public P(Size horizontal, Size vertical) {
        Intrinsics.j(horizontal, "horizontal");
        Intrinsics.j(vertical, "vertical");
        this.f123379a = horizontal;
        this.f123380b = vertical;
    }
}
