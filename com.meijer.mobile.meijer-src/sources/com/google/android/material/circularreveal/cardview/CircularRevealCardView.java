package com.google.android.material.circularreveal.cardview;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.c;

/* loaded from: classes4.dex */
public class CircularRevealCardView extends MaterialCardView implements c, FSDraw {
    @Override // com.google.android.material.circularreveal.c
    public void a() {
        throw null;
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        throw null;
    }

    public void fsSuperDraw_1e7c6877c41adc3722604d6be86140ff(Canvas canvas) {
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
    public void draw(Canvas canvas) {
        fsSuperDraw_1e7c6877c41adc3722604d6be86140ff(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        return super.isOpaque();
    }
}
