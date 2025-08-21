package com.google.android.material.snackbar;

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
import ce.C6503b;
import ce.f;
import de.C13661a;
import ke.C15121a;
import pe.i;

/* loaded from: classes4.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    private TextView f88404a;

    /* renamed from: b, reason: collision with root package name */
    private Button f88405b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f88406c;

    /* renamed from: d, reason: collision with root package name */
    private int f88407d;

    @Override // com.google.android.material.snackbar.a
    public void a(int i10, int i11) {
        this.f88404a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f88404a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f88406c).setStartDelay(j11).start();
        if (this.f88405b.getVisibility() == 0) {
            this.f88405b.setAlpha(0.0f);
            this.f88405b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f88406c).setStartDelay(j11).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i10, int i11) {
        this.f88404a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f88404a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f88406c).setStartDelay(j11).start();
        if (this.f88405b.getVisibility() == 0) {
            this.f88405b.setAlpha(1.0f);
            this.f88405b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f88406c).setStartDelay(j11).start();
        }
    }

    void c(float f10) {
        if (f10 != 1.0f) {
            this.f88405b.setTextColor(C15121a.j(C15121a.d(this, C6503b.f61556s), this.f88405b.getCurrentTextColor(), f10));
        }
    }

    public Button getActionView() {
        return this.f88405b;
    }

    public TextView getMessageView() {
        return this.f88404a;
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f88407d = i10;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f88406c = i.g(context, C6503b.f61512S, C13661a.f128351b);
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
        if (this.f88404a.getPaddingTop() == i11 && this.f88404a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f88404a, i11, i12);
        return true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f88404a = (TextView) findViewById(f.f61685P);
        this.f88405b = (Button) findViewById(f.f61684O);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) throws Resources.NotFoundException {
        boolean z10;
        super.onMeasure(i10, i11);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(ce.d.f61620h);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(ce.d.f61618g);
            Layout layout = this.f88404a.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f88407d > 0 && this.f88405b.getMeasuredWidth() > this.f88407d) {
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
