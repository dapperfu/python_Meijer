package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import i.C14578a;
import i.C14587j;
import p2.InterfaceC16357g0;

/* loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final a f46583a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f46584b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f46585c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuPresenter f46586d;

    /* renamed from: e, reason: collision with root package name */
    protected int f46587e;

    /* renamed from: f, reason: collision with root package name */
    protected androidx.core.view.h f46588f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46589g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46590h;

    protected class a implements InterfaceC16357g0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46591a = false;

        /* renamed from: b, reason: collision with root package name */
        int f46592b;

        @Override // p2.InterfaceC16357g0
        public void a(View view) {
            this.f46591a = true;
        }

        protected a() {
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            if (this.f46591a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f46588f = null;
            AbsActionBarView.super.setVisibility(this.f46592b);
        }

        @Override // p2.InterfaceC16357g0
        public void c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f46591a = false;
        }

        public a d(androidx.core.view.h hVar, int i10) {
            AbsActionBarView.this.f46588f = hVar;
            this.f46592b = i10;
            return this;
        }
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46583a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C14578a.f136279a, typedValue, true) || typedValue.resourceId == 0) {
            this.f46584b = context;
        } else {
            this.f46584b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public androidx.core.view.h f(int i10, long j10) {
        androidx.core.view.h hVar = this.f46588f;
        if (hVar != null) {
            hVar.c();
        }
        if (i10 != 0) {
            androidx.core.view.h hVarB = ViewCompat.f(this).b(0.0f);
            hVarB.e(j10);
            hVarB.g(this.f46583a.d(hVarB, i10));
            return hVarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.h hVarB2 = ViewCompat.f(this).b(1.0f);
        hVarB2.e(j10);
        hVarB2.g(this.f46583a.d(hVarB2, i10));
        return hVarB2;
    }

    public int getAnimatedVisibility() {
        return this.f46588f != null ? this.f46583a.f46592b : getVisibility();
    }

    public int getContentHeight() {
        return this.f46587e;
    }

    public void setContentHeight(int i10) {
        this.f46587e = i10;
        requestLayout();
    }

    protected int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C14587j.f136556a, C14578a.f136281c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C14587j.f136601j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f46586d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f46590h = false;
        }
        if (!this.f46590h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f46590h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f46590h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f46589g = false;
        }
        if (!this.f46589g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f46589g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f46589g = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.h hVar = this.f46588f;
            if (hVar != null) {
                hVar.c();
            }
            super.setVisibility(i10);
        }
    }
}
