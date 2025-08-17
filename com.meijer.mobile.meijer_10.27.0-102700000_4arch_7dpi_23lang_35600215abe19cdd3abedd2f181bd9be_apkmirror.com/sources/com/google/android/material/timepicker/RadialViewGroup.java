package com.google.android.material.timepicker;

import ae.f;
import ae.h;
import ae.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import re.C16760h;
import re.C16763k;

/* loaded from: classes4.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f87959x;

    /* renamed from: y, reason: collision with root package name */
    private int f87960y;

    /* renamed from: z, reason: collision with root package name */
    private C16760h f87961z;

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    int D(int i10) {
        return i10 == 2 ? Math.round(this.f87960y * 0.66f) : this.f87960y;
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f44730p, this);
        ViewCompat.q0(this, C());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f45310q6, i10, 0);
        this.f87960y = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45322r6, 0);
        this.f87959x = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                this.f87974a.H();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable C() {
        C16760h c16760h = new C16760h();
        this.f87961z = c16760h;
        c16760h.Z(new C16763k(0.5f));
        this.f87961z.b0(ColorStateList.valueOf(-1));
        return this.f87961z;
    }

    private static boolean G(View view) {
        return "skip".equals(view.getTag());
    }

    public int E() {
        return this.f87960y;
    }

    public void F(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f87960y = i10;
        H();
    }

    protected void H() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != f.f44686e && !G(childAt)) {
                int i11 = (Integer) childAt.getTag(f.f44696o);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            B((List) entry.getValue(), cVar, D(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f87961z.b0(ColorStateList.valueOf(i10));
    }

    private void B(List<View> list, androidx.constraintlayout.widget.c cVar, int i10) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.j(it.next().getId(), f.f44686e, i10, size);
            size += 360.0f / list.size();
        }
    }

    private void I() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f87959x);
            handler.post(this.f87959x);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.l());
        }
        I();
    }

    @Override // android.view.View
    protected void onFinishInflate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onFinishInflate();
        H();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        I();
    }
}
