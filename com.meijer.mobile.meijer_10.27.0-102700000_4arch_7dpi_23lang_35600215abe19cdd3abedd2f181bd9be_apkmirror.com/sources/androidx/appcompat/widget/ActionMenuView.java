package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, androidx.appcompat.view.menu.k {

    /* renamed from: A, reason: collision with root package name */
    e f46462A;

    /* renamed from: p, reason: collision with root package name */
    private androidx.appcompat.view.menu.f f46463p;

    /* renamed from: q, reason: collision with root package name */
    private Context f46464q;

    /* renamed from: r, reason: collision with root package name */
    private int f46465r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46466s;

    /* renamed from: t, reason: collision with root package name */
    private ActionMenuPresenter f46467t;

    /* renamed from: u, reason: collision with root package name */
    private j.a f46468u;

    /* renamed from: v, reason: collision with root package name */
    f.a f46469v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f46470w;

    /* renamed from: x, reason: collision with root package name */
    private int f46471x;

    /* renamed from: y, reason: collision with root package name */
    private int f46472y;

    /* renamed from: z, reason: collision with root package name */
    private int f46473z;

    public interface a {
        boolean d();

        boolean f();
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f46474a;

        /* renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f46475b;

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f46476c;

        /* renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f46477d;

        /* renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f46478e;

        /* renamed from: f, reason: collision with root package name */
        boolean f46479f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f46474a = cVar.f46474a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f46474a = false;
        }
    }

    private class d implements f.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f46462A;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            f.a aVar = ActionMenuView.this.f46469v;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    protected boolean E(int i10) {
        boolean zD = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zD = ((a) childAt).d();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zD : ((a) childAt2).f() | zD;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    private static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.f fVar) {
            return false;
        }

        b() {
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f46472y = (int) (56.0f * f10);
        this.f46473z = (int) (f10 * 4.0f);
        this.f46464q = context;
        this.f46465r = 0;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void K(int i10, int i11) {
        long j10;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        ?? r32;
        int i14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.f46472y;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i20 = 0;
        boolean z12 = false;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        long j11 = 0;
        while (i20 < childCount) {
            View childAt = getChildAt(i20);
            int i23 = size2;
            if (childAt.getVisibility() == 8) {
                i14 = i19;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z13) {
                    int i24 = this.f46473z;
                    z11 = z13;
                    r32 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    z11 = z13;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f46479f = r32;
                cVar.f46476c = r32;
                cVar.f46475b = r32;
                cVar.f46477d = r32;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r32;
                cVar.f46478e = z11 && ((ActionMenuItemView) childAt).t();
                int iJ = J(childAt, i19, cVar.f46474a ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iJ);
                i14 = i19;
                if (cVar.f46477d) {
                    i22++;
                }
                if (cVar.f46474a) {
                    z12 = true;
                }
                i17 -= iJ;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iJ == 1) {
                    j11 |= 1 << i20;
                }
            }
            i20++;
            size2 = i23;
            i19 = i14;
        }
        int i25 = size2;
        int i26 = i19;
        char c10 = 2;
        boolean z14 = z12 && i21 == 2;
        boolean z15 = false;
        while (i22 > 0 && i17 > 0) {
            int i27 = a.e.API_PRIORITY_OTHER;
            long j12 = 0;
            char c11 = c10;
            int i28 = 0;
            int i29 = 0;
            j10 = 1;
            while (i29 < childCount) {
                c cVar2 = (c) getChildAt(i29).getLayoutParams();
                boolean z16 = z14;
                if (cVar2.f46477d) {
                    int i30 = cVar2.f46475b;
                    if (i30 < i27) {
                        j12 = 1 << i29;
                        i27 = i30;
                        i28 = 1;
                    } else if (i30 == i27) {
                        j12 |= 1 << i29;
                        i28++;
                    }
                }
                i29++;
                z14 = z16;
            }
            boolean z17 = z14;
            j11 |= j12;
            if (i28 > i17) {
                break;
            }
            int i31 = i27 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j13 = 1 << i32;
                if ((j12 & j13) == 0) {
                    if (cVar3.f46475b == i31) {
                        j11 |= j13;
                    }
                    i13 = i32;
                } else {
                    if (!z17 || !cVar3.f46478e) {
                        i13 = i32;
                        z10 = true;
                    } else if (i17 == 1) {
                        int i33 = this.f46473z;
                        z10 = true;
                        i13 = i32;
                        childAt2.setPadding(i33 + i26, 0, i33, 0);
                    } else {
                        i13 = i32;
                        z10 = true;
                    }
                    cVar3.f46475b++;
                    cVar3.f46479f = z10;
                    i17--;
                }
                i32 = i13 + 1;
            }
            c10 = c11;
            z14 = z17;
            z15 = true;
        }
        j10 = 1;
        boolean z18 = !z12 && i21 == 1;
        if (i17 <= 0 || j11 == 0 || (i17 >= i21 - 1 && !z18 && iMax2 <= 1)) {
            i12 = 0;
        } else {
            float fBitCount = Long.bitCount(j11);
            if (z18) {
                i12 = 0;
            } else {
                if ((j11 & j10) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f46478e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i34 = childCount - 1;
                if ((j11 & (1 << i34)) != 0 && !((c) getChildAt(i34).getLayoutParams()).f46478e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i17 * i26) / fBitCount) : i12;
            boolean z19 = z15;
            for (int i36 = i12; i36 < childCount; i36++) {
                if ((j11 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f46476c = i35;
                        cVar4.f46479f = true;
                        if (i36 == 0 && !cVar4.f46478e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i35) / 2;
                        }
                        z19 = true;
                    } else if (cVar4.f46474a) {
                        cVar4.f46476c = i35;
                        cVar4.f46479f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i35) / 2;
                        z19 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i35 / 2;
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i37 = i12; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f46479f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f46475b * i26) + cVar5.f46476c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i15, mode != 1073741824 ? iMax : i25);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public boolean F() {
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        return actionMenuPresenter != null && actionMenuPresenter.D();
    }

    public boolean G() {
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        return actionMenuPresenter != null && actionMenuPresenter.F();
    }

    public boolean H() {
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean I() {
        return this.f46466s;
    }

    public androidx.appcompat.view.menu.f L() {
        return this.f46463p;
    }

    public void M(j.a aVar, f.a aVar2) {
        this.f46468u = aVar;
        this.f46469v = aVar2;
    }

    public boolean N() {
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        return actionMenuPresenter != null && actionMenuPresenter.M();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.f fVar) {
        this.f46463p = fVar;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public boolean c(androidx.appcompat.view.menu.h hVar) {
        return this.f46463p.O(hVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public Menu getMenu() {
        if (this.f46463p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.f46463p = fVar;
            fVar.W(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f46467t = actionMenuPresenter;
            actionMenuPresenter.L(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f46467t;
            j.a bVar = this.f46468u;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.e(bVar);
            this.f46463p.c(this.f46467t, this.f46464q);
            this.f46467t.J(this);
        }
        return this.f46463p;
    }

    public int getPopupTheme() {
        return this.f46465r;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f46470w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = Y.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f46474a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (E(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    E(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f46474a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f46474a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.f fVar;
        boolean z10 = this.f46470w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f46470w = z11;
        if (z10 != z11) {
            this.f46471x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f46470w && (fVar = this.f46463p) != null && size != this.f46471x) {
            this.f46471x = size;
            fVar.N(true);
        }
        int childCount = getChildCount();
        if (this.f46470w && childCount > 0) {
            K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f46467t.I(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f46462A = eVar;
    }

    public void setOverflowReserved(boolean z10) {
        this.f46466s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f46465r != i10) {
            this.f46465r = i10;
            if (i10 == 0) {
                this.f46464q = getContext();
            } else {
                this.f46464q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f46467t = actionMenuPresenter;
        actionMenuPresenter.J(this);
    }

    public void z() {
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int J(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.t()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f46474a
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f46477d = r1
            r0.f46475b = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.J(android.view.View, int, int, int, int):int");
    }

    public c D() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f46474a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f46467t.C();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f46467t;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.i(false);
            if (this.f46467t.G()) {
                this.f46467t.D();
                this.f46467t.M();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f46467t.K(drawable);
    }
}
