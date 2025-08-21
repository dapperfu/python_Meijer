package com.google.android.material.circularreveal;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.circularreveal.c;

/* loaded from: classes4.dex */
public class CircularRevealFrameLayout extends FrameLayout implements c, FSDraw {
    @Override // com.google.android.material.circularreveal.c
    public void a() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        throw null;
    }

    public void fsSuperDraw_64adced02967f149f515f9f1af00dd69(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public c.e getRevealInfo() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(int i10) {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(c.e eVar) {
        throw null;
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        fsSuperDraw_64adced02967f149f515f9f1af00dd69(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return super.isOpaque();
    }
}
