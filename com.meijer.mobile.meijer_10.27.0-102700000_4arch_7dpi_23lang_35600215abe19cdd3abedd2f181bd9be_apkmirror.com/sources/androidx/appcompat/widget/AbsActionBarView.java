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
import i.C14575a;
import i.C14584j;
import p2.InterfaceC16212g0;

/* loaded from: classes.dex */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    protected final a f46359a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f46360b;

    /* renamed from: c, reason: collision with root package name */
    protected ActionMenuView f46361c;

    /* renamed from: d, reason: collision with root package name */
    protected ActionMenuPresenter f46362d;

    /* renamed from: e, reason: collision with root package name */
    protected int f46363e;

    /* renamed from: f, reason: collision with root package name */
    protected androidx.core.view.h f46364f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46365g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46366h;

    protected class a implements InterfaceC16212g0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46367a = false;

        /* renamed from: b, reason: collision with root package name */
        int f46368b;

        @Override // p2.InterfaceC16212g0
        public void a(View view) {
            this.f46367a = true;
        }

        protected a() {
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            if (this.f46367a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f46364f = null;
            AbsActionBarView.super.setVisibility(this.f46368b);
        }

        @Override // p2.InterfaceC16212g0
        public void c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f46367a = false;
        }

        public a d(androidx.core.view.h hVar, int i10) {
            AbsActionBarView.this.f46364f = hVar;
            this.f46368b = i10;
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
        this.f46359a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C14575a.f136522a, typedValue, true) || typedValue.resourceId == 0) {
            this.f46360b = context;
        } else {
            this.f46360b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public androidx.core.view.h f(int i10, long j10) {
        androidx.core.view.h hVar = this.f46364f;
        if (hVar != null) {
            hVar.c();
        }
        if (i10 != 0) {
            androidx.core.view.h hVarB = ViewCompat.f(this).b(0.0f);
            hVarB.e(j10);
            hVarB.g(this.f46359a.d(hVarB, i10));
            return hVarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.h hVarB2 = ViewCompat.f(this).b(1.0f);
        hVarB2.e(j10);
        hVarB2.g(this.f46359a.d(hVarB2, i10));
        return hVarB2;
    }

    public int getAnimatedVisibility() {
        return this.f46364f != null ? this.f46359a.f46368b : getVisibility();
    }

    public int getContentHeight() {
        return this.f46363e;
    }

    public void setContentHeight(int i10) {
        this.f46363e = i10;
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
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C14584j.f136799a, C14575a.f136524c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C14584j.f136844j, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f46362d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f46366h = false;
        }
        if (!this.f46366h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f46366h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f46366h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f46365g = false;
        }
        if (!this.f46365g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f46365g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f46365g = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.h hVar = this.f46364f;
            if (hVar != null) {
                hVar.c();
            }
            super.setVisibility(i10);
        }
    }
}
