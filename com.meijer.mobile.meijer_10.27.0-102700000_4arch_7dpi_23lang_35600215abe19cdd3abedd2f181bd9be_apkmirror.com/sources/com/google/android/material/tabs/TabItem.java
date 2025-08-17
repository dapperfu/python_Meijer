package com.google.android.material.tabs;

import ae.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.M;

/* loaded from: classes4.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f87585a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f87586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f87587c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        M mU = M.u(context, attributeSet, l.f45132b8);
        this.f87585a = mU.p(l.f45168e8);
        this.f87586b = mU.g(l.f45144c8);
        this.f87587c = mU.n(l.f45156d8, 0);
        mU.x();
    }
}
