package com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow;

import android.content.Context;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class m extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f122686c = LazyKt.b(l.f122685a);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f122687d = LazyKt.b(k.f122684a);

    /* renamed from: a, reason: collision with root package name */
    public final View f122688a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f122689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        setBackgroundColor(Integer.MIN_VALUE);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sc_barcode_count_grid_step_back_guidance, (ViewGroup) this, false);
        addView(viewInflate, new FrameLayout.LayoutParams(((Number) f122686c.getValue()).intValue(), ((Number) f122687d.getValue()).intValue()));
        this.f122688a = viewInflate;
        this.f122689b = (TextView) findViewById(R.id.sc_textview);
    }

    public final void a(Size previewSize, int i10) {
        Intrinsics.j(previewSize, "previewSize");
        View view = this.f122688a;
        Intrinsics.i(view, "subview");
        Size viewDesiredSize = new Size(((Number) f122686c.getValue()).intValue(), ((Number) f122687d.getValue()).intValue());
        Intrinsics.j(view, "view");
        Intrinsics.j(viewDesiredSize, "viewDesiredSize");
        Intrinsics.j(previewSize, "previewSize");
        float fN = RangesKt.n(i10 / viewDesiredSize.getHeight(), 0.0f, 1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(fN);
        view.setScaleY(fN);
        view.setY(((previewSize.getHeight() - (viewDesiredSize.getHeight() * fN)) / 2.0f) + (-RangesKt.e((previewSize.getHeight() - i10) / 2.0f, 0.0f)));
        view.setX((previewSize.getWidth() - (viewDesiredSize.getWidth() * fN)) / 2.0f);
    }
}
