package com.scandit.datacapture.barcode.internal.module.find.ui.camera;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.internal.module.find.ui.camera.e;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f122192g = Color.parseColor("#59595966");

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f122193h = LazyKt.b(a.f122188a);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f122194i = LazyKt.b(b.f122189a);

    /* renamed from: a, reason: collision with root package name */
    public List f122195a;

    /* renamed from: b, reason: collision with root package name */
    public float f122196b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f122197c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122198d;

    /* renamed from: e, reason: collision with root package name */
    public final c f122199e;

    /* renamed from: f, reason: collision with root package name */
    public final d f122200f;

    public final void a() {
        setHorizontalGravity(17);
        setVerticalGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (this.f122198d) {
            gradientDrawable.setColor(0);
        } else {
            gradientDrawable.setColor(f122192g);
        }
        gradientDrawable.setCornerRadius(90.0f);
        setBackground(gradientDrawable);
        setShowDividers(2);
        setContentDescription(getContext().getString(R.string.sc_barcode_find_zoom_content_description));
        if (this.f122198d) {
            a(this.f122196b);
        } else {
            a(this.f122195a, this.f122196b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        this.f122195a = CollectionsKt.m();
        a();
        this.f122199e = new c(this);
        this.f122200f = new d(this);
    }

    public static final void b(Function1 tmp0, View view) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        List<Float> zoomLevels;
        Intrinsics.j(state, "state");
        Bundle bundle = (Bundle) state;
        if (Build.VERSION.SDK_INT >= 33) {
            super.onRestoreInstanceState((Parcelable) bundle.getParcelable("superState", Parcelable.class));
        } else {
            super.onRestoreInstanceState(bundle.getParcelable("superState"));
        }
        float[] floatArray = bundle.getFloatArray("zoomLevels");
        if (floatArray != null) {
            Intrinsics.g(floatArray);
            zoomLevels = ArraysKt.f1(floatArray);
        } else {
            zoomLevels = null;
        }
        float f10 = bundle.getFloat("currentZoomLevel");
        if (zoomLevels != null) {
            Intrinsics.j(zoomLevels, "zoomLevels");
            this.f122195a = CollectionsKt.Y0(CollectionsKt.i0(zoomLevels));
            if (this.f122196b == f10) {
                return;
            }
            this.f122196b = f10;
            a();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloatArray("zoomLevels", CollectionsKt.g1(this.f122195a));
        bundle.putFloat("currentZoomLevel", this.f122196b);
        return bundle;
    }

    public final void a(float f10) {
        removeAllViews();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        i iVar = new i(context);
        addView(iVar, new LinearLayout.LayoutParams(0, 0));
        final c cVar = this.f122199e;
        iVar.setOnClickListener(new View.OnClickListener() { // from class: Qt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a(cVar, view);
            }
        });
        iVar.f122209b = f10;
        iVar.a(f10);
        iVar.setSelected(true);
        if (this.f122196b == f10) {
            return;
        }
        this.f122196b = f10;
        a();
    }

    public static final void a(Function1 tmp0, View view) {
        Intrinsics.j(tmp0, "$tmp0");
        tmp0.invoke(view);
    }

    public final void a(List list, float f10) {
        int iIntValue;
        removeAllViews();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            float fFloatValue = ((Number) it.next()).floatValue();
            Context context = getContext();
            Intrinsics.i(context, "getContext(...)");
            i iVar = new i(context);
            addView(iVar, new LinearLayout.LayoutParams(0, 0));
            final d dVar = this.f122200f;
            iVar.setOnClickListener(new View.OnClickListener() { // from class: Qt.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.b(dVar, view);
                }
            });
            iVar.f122209b = fFloatValue;
            iVar.a(fFloatValue);
            boolean z10 = Math.abs(fFloatValue - f10) < 0.001f;
            iVar.setSelected(z10);
            if (z10 && this.f122196b != fFloatValue) {
                this.f122196b = fFloatValue;
                a();
            }
        }
        if (list.size() == 2) {
            iIntValue = ((Number) f122193h.getValue()).intValue();
        } else {
            iIntValue = ((Number) f122194i.getValue()).intValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setAlpha(0);
        shapeDrawable.setIntrinsicWidth(iIntValue);
        shapeDrawable.setIntrinsicHeight(iIntValue);
        setDividerDrawable(shapeDrawable);
    }
}
