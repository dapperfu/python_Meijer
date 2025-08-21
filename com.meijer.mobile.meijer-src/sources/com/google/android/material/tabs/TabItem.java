package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.M;
import ce.l;

/* loaded from: classes4.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f88425a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f88426b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88427c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        M mU = M.u(context, attributeSet, l.f62147b8);
        this.f88425a = mU.p(l.f62183e8);
        this.f88426b = mU.g(l.f62159c8);
        this.f88427c = mU.n(l.f62171d8, 0);
        mU.x();
    }
}
