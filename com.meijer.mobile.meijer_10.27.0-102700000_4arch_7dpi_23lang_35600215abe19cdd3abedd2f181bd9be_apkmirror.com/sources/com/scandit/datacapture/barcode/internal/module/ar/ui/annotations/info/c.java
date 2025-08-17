package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArBodyElementDataHolder;
import com.scandit.datacapture.barcode.ar.ui.annotations.BarcodeArBodyElementRowDataHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class c extends LinearLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        setId(View.generateViewId());
        setOrientation(1);
        setShowDividers(2);
    }

    public final void a(BarcodeArBodyElementDataHolder newData) {
        Intrinsics.j(newData, "newData");
        setBackgroundColor(newData.getBackgroundColor());
        List<BarcodeArBodyElementRowDataHolder> bodyElements = newData.getBodyElements();
        if (bodyElements.isEmpty()) {
            setPadding(0, 0, 0, 0);
        } else {
            int paddingAndCornerRadius$scandit_barcode_capture = (int) newData.getWidth().toPaddingAndCornerRadius$scandit_barcode_capture();
            setPadding(0, paddingAndCornerRadius$scandit_barcode_capture, 0, paddingAndCornerRadius$scandit_barcode_capture);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setAlpha(0);
        shapeDrawable.setIntrinsicHeight((int) newData.getWidth().toPaddingAndCornerRadius$scandit_barcode_capture());
        setDividerDrawable(shapeDrawable);
        int childCount = getChildCount() - bodyElements.size();
        if (childCount > 0) {
            removeViews(0, childCount);
        }
        IntRange intRangeX = RangesKt.x(0, getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeX.iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((IntIterator) it).nextInt());
            Intrinsics.h(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info.BarcodeArInfoAnnotationBodyRowView");
            arrayList.add((i) childAt);
        }
        Iterator it2 = arrayList.iterator();
        int i10 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            i iVar = (i) next;
            BarcodeArBodyElementRowDataHolder barcodeArBodyElementRowDataHolder = bodyElements.get(i10);
            iVar.getClass();
            Intrinsics.j(barcodeArBodyElementRowDataHolder, "<set-?>");
            iVar.f121094a.setValue(iVar, i.f121091f[0], barcodeArBodyElementRowDataHolder);
            i10 = i11;
        }
        if (childCount < 0) {
            int size = bodyElements.size();
            for (int childCount2 = getChildCount(); childCount2 < size; childCount2++) {
                Context context = getContext();
                Intrinsics.i(context, "getContext(...)");
                addView(new i(context, bodyElements.get(childCount2)));
            }
        }
    }
}
