package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import i.C14583f;
import i.C14587j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f46594a;

    /* renamed from: b, reason: collision with root package name */
    private View f46595b;

    /* renamed from: c, reason: collision with root package name */
    private View f46596c;

    /* renamed from: d, reason: collision with root package name */
    private View f46597d;

    /* renamed from: e, reason: collision with root package name */
    Drawable f46598e;

    /* renamed from: f, reason: collision with root package name */
    Drawable f46599f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f46600g;

    /* renamed from: h, reason: collision with root package name */
    boolean f46601h;

    /* renamed from: i, reason: collision with root package name */
    boolean f46602i;

    /* renamed from: j, reason: collision with root package name */
    private int f46603j;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    private static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public View getTabContainer() {
        return this.f46595b;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f46594a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f46596c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f46603j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f46596c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f46595b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f46596c) ? a(this.f46596c) : !b(this.f46597d) ? a(this.f46597d) : 0) + a(this.f46595b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : a.e.API_PRIORITY_OTHER));
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f46598e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f46598e);
        }
        this.f46598e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f46596c;
            if (view != null) {
                this.f46598e.setBounds(view.getLeft(), this.f46596c.getTop(), this.f46596c.getRight(), this.f46596c.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f46601h ? !(this.f46598e != null || this.f46599f != null) : this.f46600g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f46600g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f46600g);
        }
        this.f46600g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f46601h && (drawable2 = this.f46600g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f46601h ? !(this.f46598e != null || this.f46599f != null) : this.f46600g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f46599f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f46599f);
        }
        this.f46599f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f46602i && (drawable2 = this.f46599f) != null) {
                drawable2.setBounds(this.f46595b.getLeft(), this.f46595b.getTop(), this.f46595b.getRight(), this.f46595b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f46601h ? !(this.f46598e != null || this.f46599f != null) : this.f46600g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f46595b;
        if (view != null) {
            removeView(view);
        }
        this.f46595b = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f46594a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f46598e && !this.f46601h) {
            return true;
        }
        if (drawable == this.f46599f && this.f46602i) {
            return true;
        }
        return (drawable == this.f46600g && this.f46601h) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C5767a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136556a);
        this.f46598e = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C14587j.f136561b);
        this.f46599f = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C14587j.f136571d);
        this.f46603j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C14587j.f136601j, -1);
        boolean z10 = true;
        if (getId() == C14583f.f136404z) {
            this.f46601h = true;
            this.f46600g = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C14587j.f136566c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f46601h ? this.f46598e != null || this.f46599f != null : this.f46600g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f46598e;
        if (drawable != null && drawable.isStateful()) {
            this.f46598e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f46599f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f46599f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f46600g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f46600g.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f46598e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f46599f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f46600g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f46596c = findViewById(C14583f.f136379a);
        this.f46597d = findViewById(C14583f.f136384f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            android.view.View r8 = r6.f46595b
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f46601h
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f46600g
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f46598e
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f46596c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f46598e
            android.view.View r9 = r6.f46596c
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f46596c
            int r10 = r10.getTop()
            android.view.View r1 = r6.f46596c
            int r1 = r1.getRight()
            android.view.View r3 = r6.f46596c
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f46597d
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f46598e
            android.view.View r9 = r6.f46597d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f46597d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f46597d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f46597d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f46598e
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f46602i = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f46599f
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f46598e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f46599f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f46600g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }
}
