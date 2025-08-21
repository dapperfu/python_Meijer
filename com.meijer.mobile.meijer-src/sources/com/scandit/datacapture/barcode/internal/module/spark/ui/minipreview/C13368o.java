package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.C13368o;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13368o {

    /* renamed from: a, reason: collision with root package name */
    public x f124159a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f124160b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f124161c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f124162d;

    /* renamed from: e, reason: collision with root package name */
    public final C13366m f124163e;

    public static final void a(C13368o this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        x xVar = this$0.f124159a;
        if (xVar != null) {
            ((SparkScanViewPresenter) xVar).u();
        }
    }

    public C13368o(ViewGroup container, H toolbarInfo) {
        Intrinsics.j(container, "container");
        Intrinsics.j(toolbarInfo, "toolbarInfo");
        this.f124160b = new WeakReference(container);
        this.f124161c = new WeakReference(toolbarInfo);
        this.f124162d = new WeakReference(null);
        Context context = container.getContext();
        Intrinsics.i(context, "getContext(...)");
        C13366m c13366m = new C13366m(context);
        c13366m.setOnClickListener(new View.OnClickListener() { // from class: Ut.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13368o.a(this.f37743a, view);
            }
        });
        this.f124163e = c13366m;
    }

    public static Pair a(ViewGroup viewGroup, boolean z10) {
        Size correctedViewSize = ViewExtensionsKt.getCorrectedViewSize(viewGroup, z10);
        int width = correctedViewSize.getWidth();
        int height = correctedViewSize.getHeight();
        if (z10) {
            int iIntValue = (height / 2) - ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123930h.getValue()).intValue();
            int iIntValue2 = width - (((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123931i.getValue()).intValue() * 2);
            Lazy lazy = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123929g;
            return TuplesKt.a(Integer.valueOf(RangesKt.k(iIntValue2, ((Number) lazy.getValue()).intValue())), Integer.valueOf(RangesKt.k(iIntValue, ((Number) lazy.getValue()).intValue())));
        }
        Lazy lazy2 = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123929g;
        int iMin = Integer.min(height, ((Number) lazy2.getValue()).intValue());
        Lazy lazy3 = com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123931i;
        return TuplesKt.a(Integer.valueOf(Integer.min(width / 2, ((Number) lazy2.getValue()).intValue()) - (((Number) lazy3.getValue()).intValue() * 2)), Integer.valueOf(iMin - (((Number) lazy3.getValue()).intValue() * 2)));
    }

    public final Pair b(ViewGroup viewGroup, boolean z10) {
        float f10;
        int iMin = Integer.min(viewGroup.getWidth(), viewGroup.getHeight());
        int iMax = Math.max(viewGroup.getWidth(), viewGroup.getHeight());
        float f11 = iMin;
        H h10 = (H) this.f124161c.get();
        if (h10 != null && h10.x()) {
            f10 = 0.6f;
        } else {
            f10 = 0.5f;
        }
        int i10 = (int) (f11 * f10);
        int iIntValue = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123928f.getValue()).intValue();
        int iIntValue2 = ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123927e.getValue()).intValue();
        if (i10 <= 0) {
            return TuplesKt.a(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
        }
        if (z10) {
            return TuplesKt.a(Integer.valueOf(RangesKt.o(i10 - ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123931i.getValue()).intValue(), iIntValue2, iIntValue)), Integer.valueOf(RangesKt.o(i10 - ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123930h.getValue()).intValue(), iIntValue2, iIntValue)));
        }
        int iO = RangesKt.o(i10, iIntValue2, RangesKt.f(Integer.min((iMax / 2) - ((Number) com.scandit.datacapture.barcode.internal.module.spark.ui.E.f123930h.getValue()).intValue(), iIntValue), iIntValue2));
        return TuplesKt.a(Integer.valueOf(iO), Integer.valueOf(iO));
    }
}
