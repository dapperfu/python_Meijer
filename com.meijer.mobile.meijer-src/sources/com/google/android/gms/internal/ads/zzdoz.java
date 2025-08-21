package com.google.android.gms.internal.ads;

import Rc.C5212v;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class zzdoz extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final C5212v f81538a;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f81538a.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt != null && (childAt instanceof InterfaceC9133ot)) {
                arrayList.add((InterfaceC9133ot) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((InterfaceC9133ot) arrayList.get(i11)).destroy();
        }
    }

    public zzdoz(Context context, View view, C5212v c5212v) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f81538a = c5212v;
    }
}
