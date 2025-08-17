package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;
import i.C14575a;
import i.C14584j;
import j.C14791a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p2.C16244x;
import p2.InterfaceC16238u;
import p2.InterfaceC16247z;
import w2.AbstractC17751a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC16238u {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f46864A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f46865B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f46866C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList<View> f46867D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<View> f46868E;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f46869F;

    /* renamed from: G, reason: collision with root package name */
    final C16244x f46870G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<MenuItem> f46871H;

    /* renamed from: I, reason: collision with root package name */
    h f46872I;

    /* renamed from: J, reason: collision with root package name */
    private final ActionMenuView.e f46873J;

    /* renamed from: K, reason: collision with root package name */
    private Q f46874K;

    /* renamed from: L, reason: collision with root package name */
    private ActionMenuPresenter f46875L;

    /* renamed from: M, reason: collision with root package name */
    private f f46876M;

    /* renamed from: N, reason: collision with root package name */
    private j.a f46877N;

    /* renamed from: O, reason: collision with root package name */
    f.a f46878O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f46879P;

    /* renamed from: Q, reason: collision with root package name */
    private OnBackInvokedCallback f46880Q;

    /* renamed from: R, reason: collision with root package name */
    private OnBackInvokedDispatcher f46881R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f46882S;

    /* renamed from: T, reason: collision with root package name */
    private final Runnable f46883T;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f46884a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f46885b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f46886c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f46887d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f46888e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46889f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f46890g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f46891h;

    /* renamed from: i, reason: collision with root package name */
    View f46892i;

    /* renamed from: j, reason: collision with root package name */
    private Context f46893j;

    /* renamed from: k, reason: collision with root package name */
    private int f46894k;

    /* renamed from: l, reason: collision with root package name */
    private int f46895l;

    /* renamed from: m, reason: collision with root package name */
    private int f46896m;

    /* renamed from: n, reason: collision with root package name */
    int f46897n;

    /* renamed from: o, reason: collision with root package name */
    private int f46898o;

    /* renamed from: p, reason: collision with root package name */
    private int f46899p;

    /* renamed from: q, reason: collision with root package name */
    private int f46900q;

    /* renamed from: r, reason: collision with root package name */
    private int f46901r;

    /* renamed from: s, reason: collision with root package name */
    private int f46902s;

    /* renamed from: t, reason: collision with root package name */
    private F f46903t;

    /* renamed from: u, reason: collision with root package name */
    private int f46904u;

    /* renamed from: v, reason: collision with root package name */
    private int f46905v;

    /* renamed from: w, reason: collision with root package name */
    private int f46906w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f46907x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f46908y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f46909z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f46870G.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f46872I;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    class c implements f.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            f.a aVar = Toolbar.this.f46878O;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            if (!Toolbar.this.f46884a.H()) {
                Toolbar.this.f46870G.i(fVar);
            }
            f.a aVar = Toolbar.this.f46878O;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new P(runnable);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* renamed from: a, reason: collision with root package name */
        androidx.appcompat.view.menu.f f46914a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.h f46915b;

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.n nVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public Parcelable h() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j() {
            return false;
        }

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean d(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f46891h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f46891h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f46891h);
            }
            Toolbar.this.f46892i = hVar.getActionView();
            this.f46915b = hVar;
            ViewParent parent2 = Toolbar.this.f46892i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f46892i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f45937a = (toolbar4.f46897n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f46917b = 2;
                toolbar4.f46892i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f46892i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            hVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f46892i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z10) {
            if (this.f46915b != null) {
                androidx.appcompat.view.menu.f fVar = this.f46914a;
                if (fVar != null) {
                    int size = fVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f46914a.getItem(i10) == this.f46915b) {
                            return;
                        }
                    }
                }
                k(this.f46914a, this.f46915b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            KeyEvent.Callback callback = Toolbar.this.f46892i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f46892i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f46891h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f46892i = null;
            toolbar3.a();
            this.f46915b = null;
            Toolbar.this.requestLayout();
            hVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f46914a;
            if (fVar2 != null && (hVar = this.f46915b) != null) {
                fVar2.f(hVar);
            }
            this.f46914a = fVar;
        }
    }

    public static class g extends a.C0955a {

        /* renamed from: b, reason: collision with root package name */
        int f46917b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f46917b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f46917b = 0;
            this.f45937a = 8388627;
        }

        public g(g gVar) {
            super((a.C0955a) gVar);
            this.f46917b = 0;
            this.f46917b = gVar.f46917b;
        }

        public g(a.C0955a c0955a) {
            super(c0955a);
            this.f46917b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f46917b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f46917b = 0;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136521R);
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(C14791a.b(getContext(), i10));
    }

    public void setLogo(int i10) {
        setLogo(C14791a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C14791a.b(getContext(), i10));
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public static class i extends AbstractC17751a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f46918c;

        /* renamed from: d, reason: collision with root package name */
        boolean f46919d;

        class a implements Parcelable.ClassLoaderCreator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }

            a() {
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f46918c = parcel.readInt();
            this.f46919d = parcel.readInt() != 0;
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f46918c);
            parcel.writeInt(this.f46919d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f46906w = 8388627;
        this.f46867D = new ArrayList<>();
        this.f46868E = new ArrayList<>();
        this.f46869F = new int[2];
        this.f46870G = new C16244x(new Runnable() { // from class: androidx.appcompat.widget.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f46712a.y();
            }
        });
        this.f46871H = new ArrayList<>();
        this.f46873J = new a();
        this.f46883T = new b();
        M mV = M.v(getContext(), attributeSet, C14584j.f136778U2, i10, 0);
        ViewCompat.k0(this, context, C14584j.f136778U2, attributeSet, mV.r(), i10, 0);
        this.f46895l = mV.n(C14584j.f136913w3, 0);
        this.f46896m = mV.n(C14584j.f136868n3, 0);
        this.f46906w = mV.l(C14584j.f136782V2, this.f46906w);
        this.f46897n = mV.l(C14584j.f136786W2, 48);
        int iE = mV.e(C14584j.f136883q3, 0);
        iE = mV.s(C14584j.f136908v3) ? mV.e(C14584j.f136908v3, iE) : iE;
        this.f46902s = iE;
        this.f46901r = iE;
        this.f46900q = iE;
        this.f46899p = iE;
        int iE2 = mV.e(C14584j.f136898t3, -1);
        if (iE2 >= 0) {
            this.f46899p = iE2;
        }
        int iE3 = mV.e(C14584j.f136893s3, -1);
        if (iE3 >= 0) {
            this.f46900q = iE3;
        }
        int iE4 = mV.e(C14584j.f136903u3, -1);
        if (iE4 >= 0) {
            this.f46901r = iE4;
        }
        int iE5 = mV.e(C14584j.f136888r3, -1);
        if (iE5 >= 0) {
            this.f46902s = iE5;
        }
        this.f46898o = mV.f(C14584j.f136838h3, -1);
        int iE6 = mV.e(C14584j.f136818d3, Integer.MIN_VALUE);
        int iE7 = mV.e(C14584j.f136798Z2, Integer.MIN_VALUE);
        int iF = mV.f(C14584j.f136808b3, 0);
        int iF2 = mV.f(C14584j.f136813c3, 0);
        h();
        this.f46903t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f46903t.g(iE6, iE7);
        }
        this.f46904u = mV.e(C14584j.f136823e3, Integer.MIN_VALUE);
        this.f46905v = mV.e(C14584j.f136803a3, Integer.MIN_VALUE);
        this.f46889f = mV.g(C14584j.f136794Y2);
        this.f46890g = mV.p(C14584j.f136790X2);
        CharSequence charSequenceP = mV.p(C14584j.f136878p3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = mV.p(C14584j.f136863m3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f46893j = getContext();
        setPopupTheme(mV.n(C14584j.f136858l3, 0));
        Drawable drawableG = mV.g(C14584j.f136853k3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = mV.p(C14584j.f136848j3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = mV.g(C14584j.f136828f3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = mV.p(C14584j.f136833g3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (mV.s(C14584j.f136918x3)) {
            setTitleTextColor(mV.c(C14584j.f136918x3));
        }
        if (mV.s(C14584j.f136873o3)) {
            setSubtitleTextColor(mV.c(C14584j.f136873o3));
        }
        if (mV.s(C14584j.f136843i3)) {
            x(mV.n(C14584j.f136843i3, 0));
        }
        mV.x();
    }

    private void H() {
        removeCallbacks(this.f46883T);
        post(this.f46883T);
    }

    private boolean O() {
        if (!this.f46879P) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.f46903t == null) {
            this.f46903t = new F();
        }
    }

    private void i() {
        if (this.f46888e == null) {
            this.f46888e = new AppCompatImageView(getContext());
        }
    }

    private void k() {
        if (this.f46884a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f46884a = actionMenuView;
            actionMenuView.setPopupTheme(this.f46894k);
            this.f46884a.setOnMenuItemClickListener(this.f46873J);
            this.f46884a.M(this.f46877N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f45937a = (this.f46897n & 112) | 8388613;
            this.f46884a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f46884a, false);
        }
    }

    private void l() {
        if (this.f46887d == null) {
            this.f46887d = new AppCompatImageButton(getContext(), null, C14575a.f136520Q);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f45937a = (this.f46897n & 112) | 8388611;
            this.f46887d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f46906w & 112;
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f46884a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f46884a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void K(androidx.appcompat.view.menu.f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar == null && this.f46884a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.f fVarL = this.f46884a.L();
        if (fVarL == fVar) {
            return;
        }
        if (fVarL != null) {
            fVarL.R(this.f46875L);
            fVarL.R(this.f46876M);
        }
        if (this.f46876M == null) {
            this.f46876M = new f();
        }
        actionMenuPresenter.I(true);
        if (fVar != null) {
            fVar.c(actionMenuPresenter, this.f46893j);
            fVar.c(this.f46876M, this.f46893j);
        } else {
            actionMenuPresenter.l(this.f46893j, null);
            this.f46876M.l(this.f46893j, null);
            actionMenuPresenter.i(true);
            this.f46876M.i(true);
        }
        this.f46884a.setPopupTheme(this.f46894k);
        this.f46884a.setPresenter(actionMenuPresenter);
        this.f46875L = actionMenuPresenter;
        R();
    }

    public void L(j.a aVar, f.a aVar2) {
        this.f46877N = aVar;
        this.f46878O = aVar2;
        ActionMenuView actionMenuView = this.f46884a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f46896m = i10;
        TextView textView = this.f46886c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f46895l = i10;
        TextView textView = this.f46885b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f46884a;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f46882S;
            if (z10 && this.f46881R == null) {
                if (this.f46880Q == null) {
                    this.f46880Q = e.b(new Runnable() { // from class: androidx.appcompat.widget.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f46711a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f46880Q);
                this.f46881R = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f46881R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f46880Q);
            this.f46881R = null;
        }
    }

    void a() {
        for (int size = this.f46868E.size() - 1; size >= 0; size--) {
            addView(this.f46868E.get(size));
        }
        this.f46868E.clear();
    }

    @Override // p2.InterfaceC16238u
    public void addMenuProvider(InterfaceC16247z interfaceC16247z) {
        this.f46870G.c(interfaceC16247z);
    }

    public void e() {
        f fVar = this.f46876M;
        androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f46915b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f46884a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f46891h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C14575a.f136520Q);
            this.f46891h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f46889f);
            this.f46891h.setContentDescription(this.f46890g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f45937a = (this.f46897n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f46917b = 2;
            this.f46891h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f46891h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f46891h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f46891h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        F f10 = this.f46903t;
        if (f10 != null) {
            return f10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f46905v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        F f10 = this.f46903t;
        if (f10 != null) {
            return f10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        F f10 = this.f46903t;
        if (f10 != null) {
            return f10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        F f10 = this.f46903t;
        if (f10 != null) {
            return f10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f46904u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVarL;
        ActionMenuView actionMenuView = this.f46884a;
        return (actionMenuView == null || (fVarL = actionMenuView.L()) == null || !fVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f46905v, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.f46888e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f46888e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    View getNavButtonView() {
        return this.f46887d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f46887d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f46887d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f46875L;
    }

    Context getPopupContext() {
        return this.f46893j;
    }

    public int getPopupTheme() {
        return this.f46894k;
    }

    public CharSequence getSubtitle() {
        return this.f46908y;
    }

    final TextView getSubtitleTextView() {
        return this.f46886c;
    }

    public CharSequence getTitle() {
        return this.f46907x;
    }

    public int getTitleMarginBottom() {
        return this.f46902s;
    }

    public int getTitleMarginEnd() {
        return this.f46900q;
    }

    public int getTitleMarginStart() {
        return this.f46899p;
    }

    public int getTitleMarginTop() {
        return this.f46901r;
    }

    final TextView getTitleTextView() {
        return this.f46885b;
    }

    public InterfaceC5643t getWrapper() {
        if (this.f46874K == null) {
            this.f46874K = new Q(this, true);
        }
        return this.f46874K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0955a ? new g((a.C0955a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f46869F;
        boolean zB = Y.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f46887d)) {
            F(this.f46887d, i10, 0, i11, 0, this.f46898o);
            measuredWidth = this.f46887d.getMeasuredWidth() + s(this.f46887d);
            iMax = Math.max(0, this.f46887d.getMeasuredHeight() + t(this.f46887d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f46887d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f46891h)) {
            F(this.f46891h, i10, 0, i11, 0, this.f46898o);
            measuredWidth = this.f46891h.getMeasuredWidth() + s(this.f46891h);
            iMax = Math.max(iMax, this.f46891h.getMeasuredHeight() + t(this.f46891h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f46891h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f46884a)) {
            F(this.f46884a, i10, iMax3, i11, 0, this.f46898o);
            measuredWidth2 = this.f46884a.getMeasuredWidth() + s(this.f46884a);
            iMax = Math.max(iMax, this.f46884a.getMeasuredHeight() + t(this.f46884a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f46884a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f46892i)) {
            iArr = iArr2;
            iMax4 += E(this.f46892i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f46892i.getMeasuredHeight() + t(this.f46892i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f46892i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f46888e)) {
            iMax4 += E(this.f46888e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f46888e.getMeasuredHeight() + t(this.f46888e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f46888e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f46917b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f46901r + this.f46902s;
        int i16 = this.f46899p + this.f46900q;
        if (P(this.f46885b)) {
            E(this.f46885b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f46885b.getMeasuredWidth() + s(this.f46885b);
            int measuredHeight2 = this.f46885b.getMeasuredHeight() + t(this.f46885b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f46885b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f46886c)) {
            iMax2 = Math.max(iMax2, E(this.f46886c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f46886c.getMeasuredHeight() + t(this.f46886c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f46886c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), O() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f46884a;
        androidx.appcompat.view.menu.f fVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f46918c;
        if (i10 != 0 && this.f46876M != null && fVarL != null && (menuItemFindItem = fVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f46919d) {
            H();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f46876M;
        if (fVar != null && (hVar = fVar.f46915b) != null) {
            iVar.f46918c = hVar.getItemId();
        }
        iVar.f46919d = B();
        return iVar;
    }

    @Override // p2.InterfaceC16238u
    public void removeMenuProvider(InterfaceC16247z interfaceC16247z) {
        this.f46870G.j(interfaceC16247z);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f46882S != z10) {
            this.f46882S = z10;
            R();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f46891h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f46891h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f46891h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f46889f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f46879P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f46905v) {
            this.f46905v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f46904u) {
            this.f46904u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f46888e)) {
                c(this.f46888e, true);
            }
        } else {
            ImageView imageView = this.f46888e;
            if (imageView != null && z(imageView)) {
                removeView(this.f46888e);
                this.f46868E.remove(this.f46888e);
            }
        }
        ImageView imageView2 = this.f46888e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f46888e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f46887d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            S.a(this.f46887d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f46887d)) {
                c(this.f46887d, true);
            }
        } else {
            ImageButton imageButton = this.f46887d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f46887d);
                this.f46868E.remove(this.f46887d);
            }
        }
        ImageButton imageButton2 = this.f46887d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f46872I = hVar;
    }

    public void setPopupTheme(int i10) {
        if (this.f46894k != i10) {
            this.f46894k = i10;
            if (i10 == 0) {
                this.f46893j = getContext();
            } else {
                this.f46893j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f46886c;
            if (textView != null && z(textView)) {
                removeView(this.f46886c);
                this.f46868E.remove(this.f46886c);
            }
        } else {
            if (this.f46886c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f46886c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f46886c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f46896m;
                if (i10 != 0) {
                    this.f46886c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f46864A;
                if (colorStateList != null) {
                    this.f46886c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f46886c)) {
                c(this.f46886c, true);
            }
        }
        TextView textView2 = this.f46886c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f46908y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f46864A = colorStateList;
        TextView textView = this.f46886c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f46885b;
            if (textView != null && z(textView)) {
                removeView(this.f46885b);
                this.f46868E.remove(this.f46885b);
            }
        } else {
            if (this.f46885b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f46885b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f46885b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f46895l;
                if (i10 != 0) {
                    this.f46885b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f46909z;
                if (colorStateList != null) {
                    this.f46885b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f46885b)) {
                c(this.f46885b, true);
            }
        }
        TextView textView2 = this.f46885b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f46907x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f46902s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f46900q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f46899p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f46901r = i10;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f46909z = colorStateList;
        TextView textView = this.f46885b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f fVar = this.f46876M;
        return (fVar == null || fVar.f46915b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f46884a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void y() {
        Iterator<MenuItem> it = this.f46871H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iQ = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f46870G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f46871H = currentMenuItems2;
    }

    private void b(List<View> list, int i10) {
        boolean z10;
        if (getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int iB = p2.r.b(i10, getLayoutDirection());
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f46917b == 0 && P(childAt) && p(gVar.f45937a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f46917b == 0 && P(childAt2) && p(gVar2.f45937a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVarGenerateLayoutParams = generateLayoutParams(layoutParams);
        } else {
            gVarGenerateLayoutParams = (g) layoutParams;
        }
        gVarGenerateLayoutParams.f46917b = 1;
        if (z10 && this.f46892i != null) {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f46868E.add(view);
        } else {
            addView(view, gVarGenerateLayoutParams);
        }
    }

    private void j() {
        k();
        if (this.f46884a.L() == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) this.f46884a.getMenu();
            if (this.f46876M == null) {
                this.f46876M = new f();
            }
            this.f46884a.setExpandedActionViewsExclusive(true);
            fVar.c(this.f46876M, this.f46893j);
            R();
        }
    }

    private int p(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = p2.r.b(i10, layoutDirection) & 7;
        if (iB != 1 && iB != 3 && iB != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return iB;
    }

    private int q(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int iR = r(gVar.f45937a);
        if (iR != 48) {
            if (iR != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (iMax < i12) {
                    iMax = i12;
                } else {
                    int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
                    int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i13 < i14) {
                        iMax = Math.max(0, iMax - (i14 - i13));
                    }
                }
                return paddingTop + iMax;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private boolean z(View view) {
        if (view.getParent() != this && !this.f46868E.contains(view)) {
            return false;
        }
        return true;
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f46917b != 2 && childAt != this.f46884a) {
                removeViewAt(childCount);
                this.f46868E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f46903t.g(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f46884a) != null && actionMenuView.I()) {
            return true;
        }
        return false;
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f46904u, 0));
        }
        return getContentInsetStart();
    }

    public Menu getMenu() {
        j();
        return this.f46884a.getMenu();
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f46884a.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f46883T);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f46866C = false;
        }
        if (!this.f46866C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f46866C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f46866C = false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        F f10 = this.f46903t;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        f10.f(z10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f46865B = false;
        }
        if (!this.f46865B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f46865B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f46865B = false;
        }
        return true;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f46887d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f46884a.setOverflowIcon(drawable);
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }
}
