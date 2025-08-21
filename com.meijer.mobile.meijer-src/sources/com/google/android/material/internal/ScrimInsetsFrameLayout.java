package com.google.android.material.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import p2.G;

/* loaded from: classes4.dex */
public class ScrimInsetsFrameLayout extends FrameLayout implements FSDraw {

    /* renamed from: a, reason: collision with root package name */
    Drawable f87940a;

    /* renamed from: b, reason: collision with root package name */
    Rect f87941b;

    /* renamed from: c, reason: collision with root package name */
    private Rect f87942c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f87943d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f87944e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87945f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f87946g;

    class a implements G {
        a() {
        }

        @Override // p2.G
        public androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f87941b == null) {
                scrimInsetsFrameLayout.f87941b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f87941b.set(jVar.k(), jVar.m(), jVar.l(), jVar.j());
            ScrimInsetsFrameLayout.this.e(jVar);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!jVar.p() || ScrimInsetsFrameLayout.this.f87940a == null);
            ViewCompat.d0(ScrimInsetsFrameLayout.this);
            return jVar.c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    protected void e(androidx.core.view.j jVar) {
    }

    public void fsSuperDraw_a616fdbcde8593f0f2fa5b9a012936f3(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87942c = new Rect();
        this.f87943d = true;
        this.f87944e = true;
        this.f87945f = true;
        this.f87946g = true;
        TypedArray typedArrayI = s.i(context, attributeSet, ce.l.f62397w6, i10, ce.k.f61814o, new int[0]);
        this.f87940a = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayI, ce.l.f62409x6);
        typedArrayI.recycle();
        setWillNotDraw(true);
        ViewCompat.A0(this, new a());
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f87944e = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f87945f = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.f87946g = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f87943d = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f87940a = drawable;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_a616fdbcde8593f0f2fa5b9a012936f3(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f87941b != null && this.f87940a != null) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            if (this.f87943d) {
                this.f87942c.set(0, 0, width, this.f87941b.top);
                this.f87940a.setBounds(this.f87942c);
                this.f87940a.draw(canvas);
            }
            if (this.f87944e) {
                this.f87942c.set(0, height - this.f87941b.bottom, width, height);
                this.f87940a.setBounds(this.f87942c);
                this.f87940a.draw(canvas);
            }
            if (this.f87945f) {
                Rect rect = this.f87942c;
                Rect rect2 = this.f87941b;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f87940a.setBounds(this.f87942c);
                this.f87940a.draw(canvas);
            }
            if (this.f87946g) {
                Rect rect3 = this.f87942c;
                Rect rect4 = this.f87941b;
                rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
                this.f87940a.setBounds(this.f87942c);
                this.f87940a.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f87940a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f87940a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
