package com.google.android.material.floatingactionbutton;

import ae.k;
import ae.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import be.C6237h;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

/* loaded from: classes4.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: r, reason: collision with root package name */
    private final int f86945r;

    /* renamed from: s, reason: collision with root package name */
    private int f86946s;

    /* renamed from: t, reason: collision with root package name */
    private int f86947t;

    /* renamed from: u, reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f86948u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f86949v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f86950w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f86951x;

    /* renamed from: y, reason: collision with root package name */
    protected ColorStateList f86952y;

    /* renamed from: z, reason: collision with root package name */
    private static final int f86944z = k.f44777E;

    /* renamed from: A, reason: collision with root package name */
    static final Property<View, Float> f86940A = new a(Float.class, "width");

    /* renamed from: B, reason: collision with root package name */
    static final Property<View, Float> f86941B = new b(Float.class, "height");

    /* renamed from: C, reason: collision with root package name */
    static final Property<View, Float> f86942C = new c(Float.class, "paddingStart");

    /* renamed from: D, reason: collision with root package name */
    static final Property<View, Float> f86943D = new d(Float.class, "paddingEnd");

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a, reason: collision with root package name */
        private Rect f86953a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f86954b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f86955c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f86954b = false;
            this.f86955c = true;
        }

        protected void I(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f86955c ? 3 : 0, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!K(view)) {
                return false;
            }
            Q(view, extendedFloatingActionButton);
            return false;
        }

        protected void O(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.k(this.f86955c ? 2 : 1, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout.f fVar) {
            if (fVar.f53638h == 0) {
                fVar.f53638h = 80;
            }
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f86954b && !this.f86955c) || fVar.e() != view.getId()) {
                return false;
            }
            return true;
        }

        private boolean P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f86953a == null) {
                this.f86953a = new Rect();
            }
            Rect rect = this.f86953a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        private boolean Q(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                O(extendedFloatingActionButton);
                return true;
            }
            I(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean f(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> listS = coordinatorLayout.s(extendedFloatingActionButton);
            int size = listS.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listS.get(i11);
                if (view instanceof AppBarLayout) {
                    if (P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(view) && Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(extendedFloatingActionButton, i10);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f44910I2);
            this.f86954b = typedArrayObtainStyledAttributes.getBoolean(l.f44922J2, false);
            this.f86955c = typedArrayObtainStyledAttributes.getBoolean(l.f44934K2, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static abstract class e {
    }

    public C6237h getExtendMotionSpec() {
        throw null;
    }

    public C6237h getHideMotionSpec() {
        throw null;
    }

    public C6237h getShowMotionSpec() {
        throw null;
    }

    public C6237h getShrinkMotionSpec() {
        throw null;
    }

    public void setExtendMotionSpec(C6237h c6237h) {
        throw null;
    }

    public void setHideMotionSpec(C6237h c6237h) {
        throw null;
    }

    public void setShowMotionSpec(C6237h c6237h) {
        throw null;
    }

    public void setShrinkMotionSpec(C6237h c6237h) {
        throw null;
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        l();
    }

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(ViewCompat.E(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            ViewCompat.B0(view, f10.intValue(), view.getPaddingTop(), ViewCompat.D(view), view.getPaddingBottom());
        }
    }

    class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(ViewCompat.D(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            ViewCompat.B0(view, ViewCompat.E(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10, e eVar) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f86948u;
    }

    int getCollapsedSize() {
        int i10 = this.f86945r;
        return i10 < 0 ? (Math.min(ViewCompat.E(this), ViewCompat.D(this)) * 2) + getIconSize() : i10;
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f86951x = z10;
    }

    public void setExtended(boolean z10) {
        if (this.f86949v != z10) {
            throw null;
        }
    }

    private void l() {
        this.f86952y = getTextColors();
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f86949v && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f86949v = false;
            throw null;
        }
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(C6237h.c(getContext(), i10));
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C6237h.c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.f86949v && !this.f86950w) {
            this.f86946s = ViewCompat.E(this);
            this.f86947t = ViewCompat.D(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.f86949v && !this.f86950w) {
            this.f86946s = i10;
            this.f86947t = i12;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C6237h.c(getContext(), i10));
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(C6237h.c(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        l();
    }
}
