package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import d2.C13462a;
import i.C14575a;
import i.C14581g;
import java.util.ArrayList;
import p2.AbstractC16199a;

/* loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC16199a.InterfaceC2411a {

    /* renamed from: A, reason: collision with root package name */
    c f46432A;

    /* renamed from: B, reason: collision with root package name */
    private b f46433B;

    /* renamed from: C, reason: collision with root package name */
    final e f46434C;

    /* renamed from: D, reason: collision with root package name */
    int f46435D;

    /* renamed from: k, reason: collision with root package name */
    OverflowMenuButton f46436k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f46437l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f46438m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46439n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f46440o;

    /* renamed from: p, reason: collision with root package name */
    private int f46441p;

    /* renamed from: q, reason: collision with root package name */
    private int f46442q;

    /* renamed from: r, reason: collision with root package name */
    private int f46443r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46444s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f46445t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f46446u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46447v;

    /* renamed from: w, reason: collision with root package name */
    private int f46448w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f46449x;

    /* renamed from: y, reason: collision with root package name */
    d f46450y;

    /* renamed from: z, reason: collision with root package name */
    a f46451z;

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.a {

        class a extends A {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f46453j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f46453j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.A
            public ShowableListMenu d() {
                d dVar = ActionMenuPresenter.this.f46450y;
                if (dVar == null) {
                    return null;
                }
                return dVar.c();
            }

            @Override // androidx.appcompat.widget.A
            public boolean e() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.A
            public boolean f() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f46432A != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean f() {
            return false;
        }

        public OverflowMenuButton(Context context) {
            super(context, null, C14575a.f136532k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            S.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C13462a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class a extends MenuPopupHelper {
        public a(Context context, androidx.appcompat.view.menu.n nVar, View view) {
            super(context, nVar, view, false, C14575a.f136533l);
            if (!((androidx.appcompat.view.menu.h) nVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f46436k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46197i : view2);
            }
            j(ActionMenuPresenter.this.f46434C);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f46451z = null;
            actionMenuPresenter.f46435D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public ShowableListMenu a() {
            a aVar = ActionMenuPresenter.this.f46451z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private d f46457a;

        public c(d dVar) {
            this.f46457a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46191c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46191c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46197i;
            if (view != null && view.getWindowToken() != null && this.f46457a.m()) {
                ActionMenuPresenter.this.f46450y = this.f46457a;
            }
            ActionMenuPresenter.this.f46432A = null;
        }
    }

    private class d extends MenuPopupHelper {
        public d(Context context, androidx.appcompat.view.menu.f fVar, View view, boolean z10) {
            super(context, fVar, view, z10, C14575a.f136533l);
            h(8388613);
            j(ActionMenuPresenter.this.f46434C);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void e() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46191c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46191c.close();
            }
            ActionMenuPresenter.this.f46450y = null;
            super.e();
        }
    }

    private class e implements j.a {
        e() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof androidx.appcompat.view.menu.n) {
                fVar.F().e(false);
            }
            j.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                aVarO.c(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.f fVar) {
            if (fVar == ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46191c) {
                return false;
            }
            ActionMenuPresenter.this.f46435D = ((androidx.appcompat.view.menu.n) fVar).getItem().getItemId();
            j.a aVarO = ActionMenuPresenter.this.o();
            if (aVarO != null) {
                return aVarO.d(fVar);
            }
            return false;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    private static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f46461a;

        class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }

            a() {
            }
        }

        f() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        f(Parcel parcel) {
            this.f46461a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f46461a);
        }
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.h hVar, k.a aVar) {
        aVar.b(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f46197i);
        if (this.f46433B == null) {
            this.f46433B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f46433B);
    }

    public ActionMenuPresenter(Context context) {
        super(context, C14581g.f136650c, C14581g.f136649b);
        this.f46449x = new SparseBooleanArray();
        this.f46434C = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f46197i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        OverflowMenuButton overflowMenuButton = this.f46436k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f46438m) {
            return this.f46437l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.f46432A;
        if (cVar != null && (obj = this.f46197i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f46432A = null;
            return true;
        }
        d dVar = this.f46450y;
        if (dVar == null) {
            return false;
        }
        dVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f46451z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f46432A != null || G();
    }

    public boolean G() {
        d dVar = this.f46450y;
        return dVar != null && dVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f46444s) {
            this.f46443r = androidx.appcompat.view.a.b(this.f46190b).d();
        }
        androidx.appcompat.view.menu.f fVar = this.f46191c;
        if (fVar != null) {
            fVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f46447v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f46197i = actionMenuView;
        actionMenuView.a(this.f46191c);
    }

    public void K(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f46436k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.f46438m = true;
            this.f46437l = drawable;
        }
    }

    public void L(boolean z10) {
        this.f46439n = z10;
        this.f46440o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f46439n || G() || (fVar = this.f46191c) == null || this.f46197i == null || this.f46432A != null || fVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new d(this.f46190b, this.f46191c, this.f46436k, true));
        this.f46432A = cVar;
        ((View) this.f46197i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof f) && (i10 = ((f) parcelable).f46461a) > 0 && (menuItemFindItem = this.f46191c.findItem(i10)) != null) {
            g((androidx.appcompat.view.menu.n) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        f fVar = new f();
        fVar.f46461a = this.f46435D;
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        ArrayList<androidx.appcompat.view.menu.h> arrayListG;
        int size;
        int i10;
        int iJ;
        boolean z10;
        int i11;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f46191c;
        View view = null;
        ?? r32 = 0;
        if (fVar != null) {
            arrayListG = fVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = actionMenuPresenter.f46443r;
        int i13 = actionMenuPresenter.f46442q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f46197i;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.h hVar = arrayListG.get(i16);
            if (hVar.o()) {
                i14++;
            } else if (hVar.n()) {
                i15++;
            } else {
                z11 = true;
            }
            if (actionMenuPresenter.f46447v && hVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (actionMenuPresenter.f46439n && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f46449x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f46445t) {
            int i18 = actionMenuPresenter.f46448w;
            iJ = i13 / i18;
            i10 = i18 + ((i13 % i18) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < size) {
            androidx.appcompat.view.menu.h hVar2 = arrayListG.get(i19);
            if (hVar2.o()) {
                View viewP = actionMenuPresenter.p(hVar2, view, viewGroup);
                if (actionMenuPresenter.f46445t) {
                    iJ -= ActionMenuView.J(viewP, i10, iJ, iMakeMeasureSpec, r32);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.u(true);
                z10 = r32;
                i11 = size;
            } else if (hVar2.n()) {
                int groupId2 = hVar2.getGroupId();
                boolean z12 = sparseBooleanArray.get(groupId2);
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!actionMenuPresenter.f46445t || iJ > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewP2 = actionMenuPresenter.p(hVar2, null, viewGroup);
                    if (actionMenuPresenter.f46445t) {
                        int iJ2 = ActionMenuView.J(viewP2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z14 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 = z15 & (!actionMenuPresenter.f46445t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z13 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z12) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.h hVar3 = arrayListG.get(i21);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.l()) {
                                i17++;
                            }
                            hVar3.u(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                hVar2.u(z13);
                z10 = false;
            } else {
                z10 = r32;
                i11 = size;
                hVar2.u(z10);
            }
            i19++;
            r32 = z10;
            size = i11;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f46197i;
        androidx.appcompat.view.menu.k kVarQ = super.q(viewGroup);
        if (kVar != kVarQ) {
            ((ActionMenuView) kVarQ).setPresenter(this);
        }
        return kVarQ;
    }

    public boolean A() {
        return D() | E();
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        A();
        super.c(fVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.n nVar) {
        boolean z10 = false;
        if (!nVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.n nVar2 = nVar;
        while (nVar2.j0() != this.f46191c) {
            nVar2 = (androidx.appcompat.view.menu.n) nVar2.j0();
        }
        View viewB = B(nVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.f46435D = nVar.getItem().getItemId();
        int size = nVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = nVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f46190b, nVar, viewB);
        this.f46451z = aVar;
        aVar.g(z10);
        this.f46451z.k();
        super.g(nVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ArrayList<androidx.appcompat.view.menu.h> arrayListB;
        super.i(z10);
        ((View) this.f46197i).requestLayout();
        androidx.appcompat.view.menu.f fVar = this.f46191c;
        boolean z11 = false;
        if (fVar != null) {
            ArrayList<androidx.appcompat.view.menu.h> arrayListU = fVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC16199a abstractC16199aB = arrayListU.get(i10).b();
                if (abstractC16199aB != null) {
                    abstractC16199aB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.f fVar2 = this.f46191c;
        if (fVar2 != null) {
            arrayListB = fVar2.B();
        } else {
            arrayListB = null;
        }
        if (this.f46439n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !arrayListB.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f46436k == null) {
                this.f46436k = new OverflowMenuButton(this.f46189a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f46436k.getParent();
            if (viewGroup != this.f46197i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f46436k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f46197i;
                actionMenuView.addView(this.f46436k, actionMenuView.D());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.f46436k;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.f46197i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f46436k);
                }
            }
        }
        ((ActionMenuView) this.f46197i).setOverflowReserved(this.f46439n);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        super.l(context, fVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f46440o) {
            this.f46439n = aVarB.h();
        }
        if (!this.f46446u) {
            this.f46441p = aVarB.c();
        }
        if (!this.f46444s) {
            this.f46443r = aVarB.d();
        }
        int measuredWidth = this.f46441p;
        if (this.f46439n) {
            if (this.f46436k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f46189a);
                this.f46436k = overflowMenuButton;
                if (this.f46438m) {
                    overflowMenuButton.setImageDrawable(this.f46437l);
                    this.f46437l = null;
                    this.f46438m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f46436k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f46436k.getMeasuredWidth();
        } else {
            this.f46436k = null;
        }
        this.f46442q = measuredWidth;
        this.f46448w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f46436k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        int i10;
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.j()) {
            actionView = super.p(hVar, view, viewGroup);
        }
        if (hVar.isActionViewExpanded()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.h hVar) {
        return hVar.l();
    }
}
