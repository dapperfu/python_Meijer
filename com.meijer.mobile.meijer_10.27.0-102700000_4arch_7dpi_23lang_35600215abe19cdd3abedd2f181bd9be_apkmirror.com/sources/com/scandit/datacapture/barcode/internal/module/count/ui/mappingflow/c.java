package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.graphics.Rect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f121710a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f121711b;

    public c(List anchors, Rect margins) {
        Intrinsics.j(anchors, "anchors");
        Intrinsics.j(margins, "margins");
        this.f121710a = anchors;
        this.f121711b = margins;
    }
}
