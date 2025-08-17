package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import android.graphics.Paint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f122660a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f122661b;

    /* renamed from: c, reason: collision with root package name */
    public final List f122662c;

    public m(Paint fill, Paint stroke, List shadows) {
        Intrinsics.j(fill, "fill");
        Intrinsics.j(stroke, "stroke");
        Intrinsics.j(shadows, "shadows");
        this.f122660a = fill;
        this.f122661b = stroke;
        this.f122662c = shadows;
    }
}
