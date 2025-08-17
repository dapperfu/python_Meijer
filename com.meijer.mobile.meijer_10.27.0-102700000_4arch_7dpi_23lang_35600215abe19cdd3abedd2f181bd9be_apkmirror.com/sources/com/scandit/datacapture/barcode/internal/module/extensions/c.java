package com.scandit.datacapture.barcode.internal.module.extensions;

import android.util.SparseArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class c {
    public static final void a(SparseArray sparseArray, Function1 action) {
        Intrinsics.j(sparseArray, "<this>");
        Intrinsics.j(action, "action");
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objValueAt = sparseArray.valueAt(i10);
            if (objValueAt != null) {
                action.invoke(objValueAt);
            }
        }
    }
}
