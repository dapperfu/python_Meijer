package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class G {
    public static final boolean a(ViewGroup viewGroup, View child) {
        Intrinsics.j(viewGroup, "<this>");
        Intrinsics.j(child, "child");
        return viewGroup.indexOfChild(child) > -1;
    }
}
