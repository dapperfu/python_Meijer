package com.scandit.datacapture.core.internal.module.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class u extends w {

    /* renamed from: a, reason: collision with root package name */
    public final String f126234a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeHintStyle f126235b;

    public u(String hint, NativeHintStyle style) {
        Intrinsics.j(hint, "hint");
        Intrinsics.j(style, "style");
        this.f126234a = hint;
        this.f126235b = style;
    }
}
