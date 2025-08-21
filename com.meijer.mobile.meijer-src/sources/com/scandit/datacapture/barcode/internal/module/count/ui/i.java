package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public float f122633a;

    /* renamed from: b, reason: collision with root package name */
    public float f122634b;

    /* renamed from: c, reason: collision with root package name */
    public a f122635c;

    /* renamed from: d, reason: collision with root package name */
    public float f122636d;

    /* renamed from: e, reason: collision with root package name */
    public float f122637e;

    /* renamed from: f, reason: collision with root package name */
    public long f122638f;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX;
        if (view == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f122638f = System.currentTimeMillis();
            this.f122633a = view.getX() - motionEvent.getRawX();
            this.f122634b = view.getY() - motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawY = 0.0f;
                if (motionEvent.getRawX() + this.f122633a < 0.0f) {
                    rawX = 0.0f;
                } else {
                    float rawX2 = motionEvent.getRawX() + this.f122633a + view.getWidth();
                    Object parent = view.getParent();
                    Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
                    rawX = rawX2 > ((float) ((View) parent).getWidth()) ? this.f122636d : motionEvent.getRawX() + this.f122633a;
                }
                this.f122636d = rawX;
                if (motionEvent.getRawY() + this.f122634b >= 0.0f) {
                    float rawY2 = motionEvent.getRawY() + this.f122634b + view.getHeight();
                    Object parent2 = view.getParent();
                    Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.View");
                    rawY = rawY2 > ((float) ((View) parent2).getHeight()) ? this.f122637e : motionEvent.getRawY() + this.f122634b;
                }
                this.f122637e = rawY;
                view.setX(this.f122636d);
                view.setY(this.f122637e);
            }
        } else if (System.currentTimeMillis() - this.f122638f < 200) {
            view.performClick();
        } else {
            a aVar = this.f122635c;
            if (aVar != null) {
                aVar.f122296e.edit().putFloat("barcode-count-floating-shutter-x-location", this.f122636d).apply();
            }
            a aVar2 = this.f122635c;
            if (aVar2 != null) {
                aVar2.f122296e.edit().putFloat("barcode-count-floating-shutter-y-location", this.f122637e).apply();
            }
        }
        return true;
    }

    public i() {
        float fA;
        a aVar = this.f122635c;
        if (aVar != null) {
            fA = aVar.a();
        } else {
            fA = 0.0f;
        }
        this.f122636d = fA;
        a aVar2 = this.f122635c;
        this.f122637e = aVar2 != null ? aVar2.b() : 0.0f;
    }
}
