package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f123689a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f123690b;

    public j(Function1 brushGetter, Function1 selectedBrushGetter) {
        Intrinsics.j(brushGetter, "brushGetter");
        Intrinsics.j(selectedBrushGetter, "selectedBrushGetter");
        this.f123689a = brushGetter;
        this.f123690b = selectedBrushGetter;
    }

    public final BarcodePickBrush a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        Brush brush = (Brush) this.f123689a.invoke(state);
        if (brush == null) {
            return k.f123731b;
        }
        Intrinsics.j(brush, "brush");
        return new p(brush);
    }
}
