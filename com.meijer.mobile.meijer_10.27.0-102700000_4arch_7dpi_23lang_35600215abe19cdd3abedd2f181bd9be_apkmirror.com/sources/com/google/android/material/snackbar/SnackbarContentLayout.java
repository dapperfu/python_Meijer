package com.google.android.material.snackbar;

import ae.C5597b;
import ae.f;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import be.C6230a;
import ie.C14718a;
import ne.i;

/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f87564a;

    /* renamed from: b, reason: collision with root package name */
    private Button f87565b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f87566c;

    /* renamed from: d, reason: collision with root package name */
    private int f87567d;

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f87564a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f87564a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f87566c).setStartDelay(j11).start();
        if (this.f87565b.getVisibility() == 0) {
            this.f87565b.setAlpha(0.0f);
            this.f87565b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f87566c).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f87564a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f87564a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f87566c).setStartDelay(j11).start();
        if (this.f87565b.getVisibility() == 0) {
            this.f87565b.setAlpha(1.0f);
            this.f87565b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f87566c).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f87565b.setTextColor(C14718a.j(C14718a.d(this, C5597b.f44541s), this.f87565b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f87565b;
    }

    public TextView getMessageView() {
        return this.f87564a;
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f87567d = i10;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87566c = i.g(context, C5597b.f44497S, C6230a.f60116b);
    }

    private static void d(View view, int i10, int i11) {
        if (ViewCompat.U(view)) {
            ViewCompat.B0(view, ViewCompat.E(view), i10, ViewCompat.D(view), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    private boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f87564a.getPaddingTop() == i11 && this.f87564a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f87564a, i11, i12);
        return true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f87564a = (TextView) findViewById(f.f44670P);
        this.f87565b = (Button) findViewById(f.f44669O);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        boolean z10;
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(ae.d.f44605h);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(ae.d.f44603g);
            Layout layout = this.f87564a.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f87567d > 0 && this.f87565b.getMeasuredWidth() > this.f87567d) {
                if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z10) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i10, i11);
        }
    }
}
