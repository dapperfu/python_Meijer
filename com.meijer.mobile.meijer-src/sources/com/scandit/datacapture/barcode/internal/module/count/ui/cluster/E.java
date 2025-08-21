package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class E implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {
    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        FrameLayout parent = (FrameLayout) viewGroup;
        Intrinsics.j(view, "view");
        Intrinsics.j(parent, "parent");
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
