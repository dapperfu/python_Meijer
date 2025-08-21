package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.tip;

import android.view.ViewGroup;
import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class c {
    public static final /* synthetic */ void a(a aVar, Anchor anchor) {
        float f10;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(anchor, "anchor");
        int i10 = b.f122133a[anchor.ordinal()];
        if (i10 == 1) {
            f10 = 180.0f;
        } else if (i10 == 2) {
            f10 = 0.0f;
        } else if (i10 == 3) {
            f10 = 90.0f;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor);
            }
            f10 = 270.0f;
        }
        aVar.setRotation(f10);
    }

    public static final /* synthetic */ void b(a aVar, Anchor anchor) {
        int i10;
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(anchor, "anchor");
        int i12 = b.f122133a[anchor.ordinal()];
        int i13 = 0;
        int i14 = 1;
        if (i12 == 1) {
            i10 = 0;
            i11 = 0;
        } else if (i12 != 2) {
            if (i12 == 3) {
                i10 = 0;
                i11 = 0;
                i13 = 1;
            } else {
                if (i12 != 4) {
                    throw new IllegalArgumentException("Unsupported anchor: " + anchor);
                }
                i11 = 0;
                i10 = 1;
            }
            i14 = i11;
        } else {
            i10 = 0;
            i11 = 1;
            i14 = 0;
        }
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(i13, i14, i10, i11);
            aVar.setLayoutParams(marginLayoutParams);
        }
    }
}
