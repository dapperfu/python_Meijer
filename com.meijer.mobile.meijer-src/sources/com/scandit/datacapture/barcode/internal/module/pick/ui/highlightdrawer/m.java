package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer;

import android.graphics.Paint;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f123612a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f123613b;

    /* renamed from: c, reason: collision with root package name */
    public final List f123614c;

    public m(Paint fill, Paint stroke, List shadows) {
        Intrinsics.j(fill, "fill");
        Intrinsics.j(stroke, "stroke");
        Intrinsics.j(shadows, "shadows");
        this.f123612a = fill;
        this.f123613b = stroke;
        this.f123614c = shadows;
    }
}
