package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private int f87109a;

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        a(i10, true);
    }

    public final int getUserSetVisibility() {
        return this.f87109a;
    }

    public final void a(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f87109a = i10;
        }
    }
}
