package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import i.C14578a;
import i.C14583f;
import i.C14584g;
import i.C14587j;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: i, reason: collision with root package name */
    private CharSequence f46604i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f46605j;

    /* renamed from: k, reason: collision with root package name */
    private View f46606k;

    /* renamed from: l, reason: collision with root package name */
    private View f46607l;

    /* renamed from: m, reason: collision with root package name */
    private View f46608m;

    /* renamed from: n, reason: collision with root package name */
    private LinearLayout f46609n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f46610o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f46611p;

    /* renamed from: q, reason: collision with root package name */
    private int f46612q;

    /* renamed from: r, reason: collision with root package name */
    private int f46613r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46614s;

    /* renamed from: t, reason: collision with root package name */
    private int f46615t;

    class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f46616a;

        a(androidx.appcompat.view.b bVar) {
            this.f46616a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f46616a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136288j);
    }

    private void i() {
        if (this.f46609n == null) {
            LayoutInflater.from(getContext()).inflate(C14584g.f136405a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f46609n = linearLayout;
            this.f46610o = (TextView) linearLayout.findViewById(C14583f.f136383e);
            this.f46611p = (TextView) this.f46609n.findViewById(C14583f.f136382d);
            if (this.f46612q != 0) {
                this.f46610o.setTextAppearance(getContext(), this.f46612q);
            }
            if (this.f46613r != 0) {
                this.f46611p.setTextAppearance(getContext(), this.f46613r);
            }
        }
        this.f46610o.setText(this.f46604i);
        this.f46611p.setText(this.f46605j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f46604i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f46605j);
        this.f46611p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f46609n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f46609n.getParent() == null) {
            addView(this.f46609n);
        }
    }

    public void g() {
        if (this.f46606k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.f46605j;
    }

    public CharSequence getTitle() {
        return this.f46604i;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f46606k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f46615t, (ViewGroup) this, false);
            this.f46606k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f46606k);
        }
        View viewFindViewById = this.f46606k.findViewById(C14583f.f136387i);
        this.f46607l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f46586d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f46586d = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVar.c(this.f46586d, this.f46584b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f46586d.q(this);
        this.f46585c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f46585c, layoutParams);
    }

    public boolean j() {
        return this.f46614s;
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f46586d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i10) {
        this.f46587e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f46608m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f46608m = view;
        if (view != null && (linearLayout = this.f46609n) != null) {
            removeView(linearLayout);
            this.f46609n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f46605j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f46604i = charSequence;
        i();
        ViewCompat.p0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f46614s) {
            requestLayout();
        }
        this.f46614s = z10;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        M mV = M.v(context, attributeSet, C14587j.f136676y, i10, 0);
        setBackground(mV.g(C14587j.f136681z));
        this.f46612q = mV.n(C14587j.f136458D, 0);
        this.f46613r = mV.n(C14587j.f136453C, 0);
        this.f46587e = mV.m(C14587j.f136448B, 0);
        this.f46615t = mV.n(C14587j.f136443A, C14584g.f136408d);
        mV.x();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.h f(int i10, long j10) {
        return super.f(i10, j10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public void k() {
        removeAllViews();
        this.f46608m = null;
        this.f46585c = null;
        this.f46586d = null;
        View view = this.f46607l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f46586d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f46586d.E();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        boolean zB = Y.b(this);
        if (zB) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f46606k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46606k.getLayoutParams();
            if (zB) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (zB) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            int i16 = i15;
            int iD = AbsActionBarView.d(paddingLeft, i14, zB);
            paddingLeft = AbsActionBarView.d(iD + e(this.f46606k, iD, paddingTop, paddingTop2, zB), i16, zB);
        }
        int iE = paddingLeft;
        LinearLayout linearLayout = this.f46609n;
        if (linearLayout != null && this.f46608m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f46609n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f46608m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        if (zB) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        int i17 = paddingRight;
        ActionMenuView actionMenuView = this.f46585c;
        if (actionMenuView != null) {
            e(actionMenuView, i17, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int size2 = this.f46587e;
                if (size2 <= 0) {
                    size2 = View.MeasureSpec.getSize(i11);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int iMin = size2 - paddingTop;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                View view = this.f46606k;
                if (view != null) {
                    int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f46606k.getLayoutParams();
                    paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f46585c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f46585c, paddingLeft, iMakeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f46609n;
                if (linearLayout != null && this.f46608m == null) {
                    if (this.f46614s) {
                        this.f46609n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                        int measuredWidth = this.f46609n.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f46609n;
                        if (z10) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
                    }
                }
                View view2 = this.f46608m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i15 = layoutParams.width;
                    if (i15 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i15 >= 0) {
                        paddingLeft = Math.min(i15, paddingLeft);
                    }
                    int i16 = layoutParams.height;
                    if (i16 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i16 >= 0) {
                        iMin = Math.min(i16, iMin);
                    }
                    this.f46608m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
                }
                if (this.f46587e <= 0) {
                    int childCount = getChildCount();
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i17) {
                            i17 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i17);
                    return;
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
