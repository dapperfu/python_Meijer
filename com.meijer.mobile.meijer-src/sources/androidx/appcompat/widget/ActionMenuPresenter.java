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
import d2.C13595a;
import i.C14578a;
import i.C14584g;
import java.util.ArrayList;
import p2.AbstractC16344a;

/* loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements AbstractC16344a.InterfaceC2415a {

    /* renamed from: A, reason: collision with root package name */
    c f46656A;

    /* renamed from: B, reason: collision with root package name */
    private b f46657B;

    /* renamed from: C, reason: collision with root package name */
    final e f46658C;

    /* renamed from: D, reason: collision with root package name */
    int f46659D;

    /* renamed from: k, reason: collision with root package name */
    OverflowMenuButton f46660k;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f46661l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f46662m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46663n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f46664o;

    /* renamed from: p, reason: collision with root package name */
    private int f46665p;

    /* renamed from: q, reason: collision with root package name */
    private int f46666q;

    /* renamed from: r, reason: collision with root package name */
    private int f46667r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46668s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f46669t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f46670u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f46671v;

    /* renamed from: w, reason: collision with root package name */
    private int f46672w;

    /* renamed from: x, reason: collision with root package name */
    private final SparseBooleanArray f46673x;

    /* renamed from: y, reason: collision with root package name */
    d f46674y;

    /* renamed from: z, reason: collision with root package name */
    a f46675z;

    private class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.a {

        class a extends A {

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ActionMenuPresenter f46677j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f46677j = actionMenuPresenter;
            }

            @Override // androidx.appcompat.widget.A
            public ShowableListMenu d() {
                d dVar = ActionMenuPresenter.this.f46674y;
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
                if (actionMenuPresenter.f46656A != null) {
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
            super(context, null, C14578a.f136289k);
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
                C13595a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    private class a extends MenuPopupHelper {
        public a(Context context, androidx.appcompat.view.menu.n nVar, View view) {
            super(context, nVar, view, false, C14578a.f136290l);
            if (!((androidx.appcompat.view.menu.h) nVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.f46660k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46421i : view2);
            }
            j(ActionMenuPresenter.this.f46658C);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f46675z = null;
            actionMenuPresenter.f46659D = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public ShowableListMenu a() {
            a aVar = ActionMenuPresenter.this.f46675z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    private class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private d f46681a;

        public c(d dVar) {
            this.f46681a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46415c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46415c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46421i;
            if (view != null && view.getWindowToken() != null && this.f46681a.m()) {
                ActionMenuPresenter.this.f46674y = this.f46681a;
            }
            ActionMenuPresenter.this.f46656A = null;
        }
    }

    private class d extends MenuPopupHelper {
        public d(Context context, androidx.appcompat.view.menu.f fVar, View view, boolean z10) {
            super(context, fVar, view, z10, C14578a.f136290l);
            h(8388613);
            j(ActionMenuPresenter.this.f46658C);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void e() {
            if (((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46415c != null) {
                ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46415c.close();
            }
            ActionMenuPresenter.this.f46674y = null;
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
            if (fVar == ((androidx.appcompat.view.menu.a) ActionMenuPresenter.this).f46415c) {
                return false;
            }
            ActionMenuPresenter.this.f46659D = ((androidx.appcompat.view.menu.n) fVar).getItem().getItemId();
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
        public int f46685a;

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
            this.f46685a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f46685a);
        }
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.h hVar, k.a aVar) {
        aVar.b(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f46421i);
        if (this.f46657B == null) {
            this.f46657B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f46657B);
    }

    public ActionMenuPresenter(Context context) {
        super(context, C14584g.f136407c, C14584g.f136406b);
        this.f46673x = new SparseBooleanArray();
        this.f46658C = new e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f46421i;
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
        OverflowMenuButton overflowMenuButton = this.f46660k;
        if (overflowMenuButton != null) {
            return overflowMenuButton.getDrawable();
        }
        if (this.f46662m) {
            return this.f46661l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        c cVar = this.f46656A;
        if (cVar != null && (obj = this.f46421i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f46656A = null;
            return true;
        }
        d dVar = this.f46674y;
        if (dVar == null) {
            return false;
        }
        dVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f46675z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f46656A != null || G();
    }

    public boolean G() {
        d dVar = this.f46674y;
        return dVar != null && dVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f46668s) {
            this.f46667r = androidx.appcompat.view.a.b(this.f46414b).d();
        }
        androidx.appcompat.view.menu.f fVar = this.f46415c;
        if (fVar != null) {
            fVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f46671v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f46421i = actionMenuView;
        actionMenuView.a(this.f46415c);
    }

    public void K(Drawable drawable) {
        OverflowMenuButton overflowMenuButton = this.f46660k;
        if (overflowMenuButton != null) {
            overflowMenuButton.setImageDrawable(drawable);
        } else {
            this.f46662m = true;
            this.f46661l = drawable;
        }
    }

    public void L(boolean z10) {
        this.f46663n = z10;
        this.f46664o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.f fVar;
        if (!this.f46663n || G() || (fVar = this.f46415c) == null || this.f46421i == null || this.f46656A != null || fVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new d(this.f46414b, this.f46415c, this.f46660k, true));
        this.f46656A = cVar;
        ((View) this.f46421i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof f) && (i10 = ((f) parcelable).f46685a) > 0 && (menuItemFindItem = this.f46415c.findItem(i10)) != null) {
            g((androidx.appcompat.view.menu.n) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        f fVar = new f();
        fVar.f46685a = this.f46659D;
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
        androidx.appcompat.view.menu.f fVar = actionMenuPresenter.f46415c;
        View view = null;
        ?? r32 = 0;
        if (fVar != null) {
            arrayListG = fVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = actionMenuPresenter.f46667r;
        int i13 = actionMenuPresenter.f46666q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f46421i;
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
            if (actionMenuPresenter.f46671v && hVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (actionMenuPresenter.f46663n && (z11 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f46673x;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f46669t) {
            int i18 = actionMenuPresenter.f46672w;
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
                if (actionMenuPresenter.f46669t) {
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
                boolean z13 = (i17 > 0 || z12) && i13 > 0 && (!actionMenuPresenter.f46669t || iJ > 0);
                boolean z14 = z13;
                i11 = size;
                if (z13) {
                    View viewP2 = actionMenuPresenter.p(hVar2, null, viewGroup);
                    if (actionMenuPresenter.f46669t) {
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
                    z13 = z15 & (!actionMenuPresenter.f46669t ? i13 + i20 <= 0 : i13 < 0);
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
        androidx.appcompat.view.menu.k kVar = this.f46421i;
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
        while (nVar2.j0() != this.f46415c) {
            nVar2 = (androidx.appcompat.view.menu.n) nVar2.j0();
        }
        View viewB = B(nVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.f46659D = nVar.getItem().getItemId();
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
        a aVar = new a(this.f46414b, nVar, viewB);
        this.f46675z = aVar;
        aVar.g(z10);
        this.f46675z.k();
        super.g(nVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        ArrayList<androidx.appcompat.view.menu.h> arrayListB;
        super.i(z10);
        ((View) this.f46421i).requestLayout();
        androidx.appcompat.view.menu.f fVar = this.f46415c;
        boolean z11 = false;
        if (fVar != null) {
            ArrayList<androidx.appcompat.view.menu.h> arrayListU = fVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC16344a abstractC16344aB = arrayListU.get(i10).b();
                if (abstractC16344aB != null) {
                    abstractC16344aB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.f fVar2 = this.f46415c;
        if (fVar2 != null) {
            arrayListB = fVar2.B();
        } else {
            arrayListB = null;
        }
        if (this.f46663n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !arrayListB.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f46660k == null) {
                this.f46660k = new OverflowMenuButton(this.f46413a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f46660k.getParent();
            if (viewGroup != this.f46421i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f46660k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f46421i;
                actionMenuView.addView(this.f46660k, actionMenuView.D());
            }
        } else {
            OverflowMenuButton overflowMenuButton = this.f46660k;
            if (overflowMenuButton != null) {
                Object parent = overflowMenuButton.getParent();
                Object obj = this.f46421i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f46660k);
                }
            }
        }
        ((ActionMenuView) this.f46421i).setOverflowReserved(this.f46663n);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.f fVar) {
        super.l(context, fVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f46664o) {
            this.f46663n = aVarB.h();
        }
        if (!this.f46670u) {
            this.f46665p = aVarB.c();
        }
        if (!this.f46668s) {
            this.f46667r = aVarB.d();
        }
        int measuredWidth = this.f46665p;
        if (this.f46663n) {
            if (this.f46660k == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.f46413a);
                this.f46660k = overflowMenuButton;
                if (this.f46662m) {
                    overflowMenuButton.setImageDrawable(this.f46661l);
                    this.f46661l = null;
                    this.f46662m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f46660k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f46660k.getMeasuredWidth();
        } else {
            this.f46660k = null;
        }
        this.f46666q = measuredWidth;
        this.f46672w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f46660k) {
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
