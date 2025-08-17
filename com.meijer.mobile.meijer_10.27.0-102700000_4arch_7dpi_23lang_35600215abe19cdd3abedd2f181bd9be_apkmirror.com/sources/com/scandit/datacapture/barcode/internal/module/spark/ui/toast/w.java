package com.scandit.datacapture.barcode.internal.module.spark.ui.toast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.spark.ui.E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class w extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f123281a;

    public final void a(String text, int i10, int i11) {
        Intrinsics.j(text, "text");
        this.f123281a.setText(text);
        Drawable background = getBackground();
        Intrinsics.h(background, "null cannot be cast to non-null type android.graphics.drawable.ShapeDrawable");
        ((ShapeDrawable) background).getPaint().setColor(i10);
        this.f123281a.setTextColor(i11);
        if (getVisibility() == 4) {
            setAlpha(0.0f);
            setVisibility(0);
            a(1.0f, new v(this));
        } else {
            animate().cancel();
            setAlpha(1.0f);
            setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        View.inflate(context, R.layout.sc_spark_scan_toast_view, this);
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = ((Number) E.f122996z.getValue()).intValue();
        }
        setBackground(new ShapeDrawable(new RoundRectShape(fArr, null, null)));
        setVisibility(4);
        View viewFindViewById = findViewById(R.id.toastText);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f123281a = (TextView) viewFindViewById;
    }

    public final void a(float f10, Function0 function0) {
        animate().alpha(f10).setListener(new t(function0));
    }
}
