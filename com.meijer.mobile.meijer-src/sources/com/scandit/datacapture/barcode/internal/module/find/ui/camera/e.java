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

/* loaded from: classes12.dex */
public final class e extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final int f123144g = Color.parseColor("#59595966");

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f123145h = LazyKt.b(a.f123140a);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f123146i = LazyKt.b(b.f123141a);

    /* renamed from: a, reason: collision with root package name */
    public List f123147a;

    /* renamed from: b, reason: collision with root package name */
    public float f123148b;

    /* renamed from: c, reason: collision with root package name */
    public Function1 f123149c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f123150d;

    /* renamed from: e, reason: collision with root package name */
    public final c f123151e;

    /* renamed from: f, reason: collision with root package name */
    public final d f123152f;

    public final void a() {
        setHorizontalGravity(17);
        setVerticalGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (this.f123150d) {
            gradientDrawable.setColor(0);
        } else {
            gradientDrawable.setColor(f123144g);
        }
        gradientDrawable.setCornerRadius(90.0f);
        setBackground(gradientDrawable);
        setShowDividers(2);
        setContentDescription(getContext().getString(R.string.sc_barcode_find_zoom_content_description));
        if (this.f123150d) {
            a(this.f123148b);
        } else {
            a(this.f123147a, this.f123148b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context, null, 0);
        Intrinsics.j(context, "context");
        this.f123147a = CollectionsKt.m();
        a();
        this.f123151e = new c(this);
        this.f123152f = new d(this);
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
            zoomLevels = ArraysKt.e1(floatArray);
        } else {
            zoomLevels = null;
        }
        float f10 = bundle.getFloat("currentZoomLevel");
        if (zoomLevels != null) {
            Intrinsics.j(zoomLevels, "zoomLevels");
            this.f123147a = CollectionsKt.Y0(CollectionsKt.i0(zoomLevels));
            if (this.f123148b == f10) {
                return;
            }
            this.f123148b = f10;
            a();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloatArray("zoomLevels", CollectionsKt.g1(this.f123147a));
        bundle.putFloat("currentZoomLevel", this.f123148b);
        return bundle;
    }

    public final void a(float f10) {
        removeAllViews();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        i iVar = new i(context);
        addView(iVar, new LinearLayout.LayoutParams(0, 0));
        final c cVar = this.f123151e;
        iVar.setOnClickListener(new View.OnClickListener() { // from class: Qt.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.a(cVar, view);
            }
        });
        iVar.f123161b = f10;
        iVar.a(f10);
        iVar.setSelected(true);
        if (this.f123148b == f10) {
            return;
        }
        this.f123148b = f10;
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
            final d dVar = this.f123152f;
            iVar.setOnClickListener(new View.OnClickListener() { // from class: Qt.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.b(dVar, view);
                }
            });
            iVar.f123161b = fFloatValue;
            iVar.a(fFloatValue);
            boolean z10 = Math.abs(fFloatValue - f10) < 0.001f;
            iVar.setSelected(z10);
            if (z10 && this.f123148b != fFloatValue) {
                this.f123148b = fFloatValue;
                a();
            }
        }
        if (list.size() == 2) {
            iIntValue = ((Number) f123145h.getValue()).intValue();
        } else {
            iIntValue = ((Number) f123146i.getValue()).intValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setAlpha(0);
        shapeDrawable.setIntrinsicWidth(iIntValue);
        shapeDrawable.setIntrinsicHeight(iIntValue);
        setDividerDrawable(shapeDrawable);
    }
}
