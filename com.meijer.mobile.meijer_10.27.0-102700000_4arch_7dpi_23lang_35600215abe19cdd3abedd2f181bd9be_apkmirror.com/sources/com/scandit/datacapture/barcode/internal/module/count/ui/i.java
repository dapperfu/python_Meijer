package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public float f121681a;

    /* renamed from: b, reason: collision with root package name */
    public float f121682b;

    /* renamed from: c, reason: collision with root package name */
    public a f121683c;

    /* renamed from: d, reason: collision with root package name */
    public float f121684d;

    /* renamed from: e, reason: collision with root package name */
    public float f121685e;

    /* renamed from: f, reason: collision with root package name */
    public long f121686f;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX;
        if (view == null || motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f121686f = System.currentTimeMillis();
            this.f121681a = view.getX() - motionEvent.getRawX();
            this.f121682b = view.getY() - motionEvent.getRawY();
            motionEvent.getRawX();
            motionEvent.getRawY();
        } else if (action != 1) {
            if (action == 2) {
                float rawY = 0.0f;
                if (motionEvent.getRawX() + this.f121681a < 0.0f) {
                    rawX = 0.0f;
                } else {
                    float rawX2 = motionEvent.getRawX() + this.f121681a + view.getWidth();
                    Object parent = view.getParent();
                    Intrinsics.h(parent, "null cannot be cast to non-null type android.view.View");
                    rawX = rawX2 > ((float) ((View) parent).getWidth()) ? this.f121684d : motionEvent.getRawX() + this.f121681a;
                }
                this.f121684d = rawX;
                if (motionEvent.getRawY() + this.f121682b >= 0.0f) {
                    float rawY2 = motionEvent.getRawY() + this.f121682b + view.getHeight();
                    Object parent2 = view.getParent();
                    Intrinsics.h(parent2, "null cannot be cast to non-null type android.view.View");
                    rawY = rawY2 > ((float) ((View) parent2).getHeight()) ? this.f121685e : motionEvent.getRawY() + this.f121682b;
                }
                this.f121685e = rawY;
                view.setX(this.f121684d);
                view.setY(this.f121685e);
            }
        } else if (System.currentTimeMillis() - this.f121686f < 200) {
            view.performClick();
        } else {
            a aVar = this.f121683c;
            if (aVar != null) {
                aVar.f121344e.edit().putFloat("barcode-count-floating-shutter-x-location", this.f121684d).apply();
            }
            a aVar2 = this.f121683c;
            if (aVar2 != null) {
                aVar2.f121344e.edit().putFloat("barcode-count-floating-shutter-y-location", this.f121685e).apply();
            }
        }
        return true;
    }

    public i() {
        float fA;
        a aVar = this.f121683c;
        if (aVar != null) {
            fA = aVar.a();
        } else {
            fA = 0.0f;
        }
        this.f121684d = fA;
        a aVar2 = this.f121683c;
        this.f121685e = aVar2 != null ? aVar2.b() : 0.0f;
    }
}
