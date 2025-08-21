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
import i.C14578a;
import i.C14587j;
import j.C14879a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p2.C16389x;
import p2.InterfaceC16383u;
import p2.InterfaceC16392z;
import w2.AbstractC17821a;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC16383u {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f47088A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f47089B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f47090C;

    /* renamed from: D, reason: collision with root package name */
    private final ArrayList<View> f47091D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<View> f47092E;

    /* renamed from: F, reason: collision with root package name */
    private final int[] f47093F;

    /* renamed from: G, reason: collision with root package name */
    final C16389x f47094G;

    /* renamed from: H, reason: collision with root package name */
    private ArrayList<MenuItem> f47095H;

    /* renamed from: I, reason: collision with root package name */
    h f47096I;

    /* renamed from: J, reason: collision with root package name */
    private final ActionMenuView.e f47097J;

    /* renamed from: K, reason: collision with root package name */
    private Q f47098K;

    /* renamed from: L, reason: collision with root package name */
    private ActionMenuPresenter f47099L;

    /* renamed from: M, reason: collision with root package name */
    private f f47100M;

    /* renamed from: N, reason: collision with root package name */
    private j.a f47101N;

    /* renamed from: O, reason: collision with root package name */
    f.a f47102O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f47103P;

    /* renamed from: Q, reason: collision with root package name */
    private OnBackInvokedCallback f47104Q;

    /* renamed from: R, reason: collision with root package name */
    private OnBackInvokedDispatcher f47105R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f47106S;

    /* renamed from: T, reason: collision with root package name */
    private final Runnable f47107T;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f47108a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f47109b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f47110c;

    /* renamed from: d, reason: collision with root package name */
    private ImageButton f47111d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f47112e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f47113f;

    /* renamed from: g, reason: collision with root package name */
    private CharSequence f47114g;

    /* renamed from: h, reason: collision with root package name */
    ImageButton f47115h;

    /* renamed from: i, reason: collision with root package name */
    View f47116i;

    /* renamed from: j, reason: collision with root package name */
    private Context f47117j;

    /* renamed from: k, reason: collision with root package name */
    private int f47118k;

    /* renamed from: l, reason: collision with root package name */
    private int f47119l;

    /* renamed from: m, reason: collision with root package name */
    private int f47120m;

    /* renamed from: n, reason: collision with root package name */
    int f47121n;

    /* renamed from: o, reason: collision with root package name */
    private int f47122o;

    /* renamed from: p, reason: collision with root package name */
    private int f47123p;

    /* renamed from: q, reason: collision with root package name */
    private int f47124q;

    /* renamed from: r, reason: collision with root package name */
    private int f47125r;

    /* renamed from: s, reason: collision with root package name */
    private int f47126s;

    /* renamed from: t, reason: collision with root package name */
    private F f47127t;

    /* renamed from: u, reason: collision with root package name */
    private int f47128u;

    /* renamed from: v, reason: collision with root package name */
    private int f47129v;

    /* renamed from: w, reason: collision with root package name */
    private int f47130w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f47131x;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f47132y;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f47133z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f47094G.h(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f47096I;
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
            f.a aVar = Toolbar.this.f47102O;
            return aVar != null && aVar.a(fVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            if (!Toolbar.this.f47108a.H()) {
                Toolbar.this.f47094G.i(fVar);
            }
            f.a aVar = Toolbar.this.f47102O;
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
        androidx.appcompat.view.menu.f f47138a;

        /* renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.h f47139b;

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
            ViewParent parent = Toolbar.this.f47115h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f47115h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f47115h);
            }
            Toolbar.this.f47116i = hVar.getActionView();
            this.f47139b = hVar;
            ViewParent parent2 = Toolbar.this.f47116i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f47116i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f46161a = (toolbar4.f47121n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f47141b = 2;
                toolbar4.f47116i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f47116i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            hVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f47116i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(boolean z10) {
            if (this.f47139b != null) {
                androidx.appcompat.view.menu.f fVar = this.f47138a;
                if (fVar != null) {
                    int size = fVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f47138a.getItem(i10) == this.f47139b) {
                            return;
                        }
                    }
                }
                k(this.f47138a, this.f47139b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.f fVar, androidx.appcompat.view.menu.h hVar) {
            KeyEvent.Callback callback = Toolbar.this.f47116i;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f47116i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f47115h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f47116i = null;
            toolbar3.a();
            this.f47139b = null;
            Toolbar.this.requestLayout();
            hVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void l(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f47138a;
            if (fVar2 != null && (hVar = this.f47139b) != null) {
                fVar2.f(hVar);
            }
            this.f47138a = fVar;
        }
    }

    public static class g extends a.C0968a {

        /* renamed from: b, reason: collision with root package name */
        int f47141b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f47141b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f47141b = 0;
            this.f46161a = 8388627;
        }

        public g(g gVar) {
            super((a.C0968a) gVar);
            this.f47141b = 0;
            this.f47141b = gVar.f47141b;
        }

        public g(a.C0968a c0968a) {
            super(c0968a);
            this.f47141b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f47141b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f47141b = 0;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136278R);
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
        setCollapseIcon(C14879a.b(getContext(), i10));
    }

    public void setLogo(int i10) {
        setLogo(C14879a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(C14879a.b(getContext(), i10));
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

    public static class i extends AbstractC17821a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f47142c;

        /* renamed from: d, reason: collision with root package name */
        boolean f47143d;

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
            this.f47142c = parcel.readInt();
            this.f47143d = parcel.readInt() != 0;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f47142c);
            parcel.writeInt(this.f47143d ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47130w = 8388627;
        this.f47091D = new ArrayList<>();
        this.f47092E = new ArrayList<>();
        this.f47093F = new int[2];
        this.f47094G = new C16389x(new Runnable() { // from class: androidx.appcompat.widget.O
            @Override // java.lang.Runnable
            public final void run() {
                this.f46936a.y();
            }
        });
        this.f47095H = new ArrayList<>();
        this.f47097J = new a();
        this.f47107T = new b();
        M mV = M.v(getContext(), attributeSet, C14587j.f136535U2, i10, 0);
        ViewCompat.k0(this, context, C14587j.f136535U2, attributeSet, mV.r(), i10, 0);
        this.f47119l = mV.n(C14587j.f136670w3, 0);
        this.f47120m = mV.n(C14587j.f136625n3, 0);
        this.f47130w = mV.l(C14587j.f136539V2, this.f47130w);
        this.f47121n = mV.l(C14587j.f136543W2, 48);
        int iE = mV.e(C14587j.f136640q3, 0);
        iE = mV.s(C14587j.f136665v3) ? mV.e(C14587j.f136665v3, iE) : iE;
        this.f47126s = iE;
        this.f47125r = iE;
        this.f47124q = iE;
        this.f47123p = iE;
        int iE2 = mV.e(C14587j.f136655t3, -1);
        if (iE2 >= 0) {
            this.f47123p = iE2;
        }
        int iE3 = mV.e(C14587j.f136650s3, -1);
        if (iE3 >= 0) {
            this.f47124q = iE3;
        }
        int iE4 = mV.e(C14587j.f136660u3, -1);
        if (iE4 >= 0) {
            this.f47125r = iE4;
        }
        int iE5 = mV.e(C14587j.f136645r3, -1);
        if (iE5 >= 0) {
            this.f47126s = iE5;
        }
        this.f47122o = mV.f(C14587j.f136595h3, -1);
        int iE6 = mV.e(C14587j.f136575d3, Integer.MIN_VALUE);
        int iE7 = mV.e(C14587j.f136555Z2, Integer.MIN_VALUE);
        int iF = mV.f(C14587j.f136565b3, 0);
        int iF2 = mV.f(C14587j.f136570c3, 0);
        h();
        this.f47127t.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f47127t.g(iE6, iE7);
        }
        this.f47128u = mV.e(C14587j.f136580e3, Integer.MIN_VALUE);
        this.f47129v = mV.e(C14587j.f136560a3, Integer.MIN_VALUE);
        this.f47113f = mV.g(C14587j.f136551Y2);
        this.f47114g = mV.p(C14587j.f136547X2);
        CharSequence charSequenceP = mV.p(C14587j.f136635p3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = mV.p(C14587j.f136620m3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f47117j = getContext();
        setPopupTheme(mV.n(C14587j.f136615l3, 0));
        Drawable drawableG = mV.g(C14587j.f136610k3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = mV.p(C14587j.f136605j3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = mV.g(C14587j.f136585f3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = mV.p(C14587j.f136590g3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        if (mV.s(C14587j.f136675x3)) {
            setTitleTextColor(mV.c(C14587j.f136675x3));
        }
        if (mV.s(C14587j.f136630o3)) {
            setSubtitleTextColor(mV.c(C14587j.f136630o3));
        }
        if (mV.s(C14587j.f136600i3)) {
            x(mV.n(C14587j.f136600i3, 0));
        }
        mV.x();
    }

    private void H() {
        removeCallbacks(this.f47107T);
        post(this.f47107T);
    }

    private boolean O() {
        if (!this.f47103P) {
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
        if (this.f47127t == null) {
            this.f47127t = new F();
        }
    }

    private void i() {
        if (this.f47112e == null) {
            this.f47112e = new AppCompatImageView(getContext());
        }
    }

    private void k() {
        if (this.f47108a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f47108a = actionMenuView;
            actionMenuView.setPopupTheme(this.f47118k);
            this.f47108a.setOnMenuItemClickListener(this.f47097J);
            this.f47108a.M(this.f47101N, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f46161a = (this.f47121n & 112) | 8388613;
            this.f47108a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f47108a, false);
        }
    }

    private void l() {
        if (this.f47111d == null) {
            this.f47111d = new AppCompatImageButton(getContext(), null, C14578a.f136277Q);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f46161a = (this.f47121n & 112) | 8388611;
            this.f47111d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f47130w & 112;
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f47108a;
        return actionMenuView != null && actionMenuView.G();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f47108a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void K(androidx.appcompat.view.menu.f fVar, ActionMenuPresenter actionMenuPresenter) {
        if (fVar == null && this.f47108a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.f fVarL = this.f47108a.L();
        if (fVarL == fVar) {
            return;
        }
        if (fVarL != null) {
            fVarL.R(this.f47099L);
            fVarL.R(this.f47100M);
        }
        if (this.f47100M == null) {
            this.f47100M = new f();
        }
        actionMenuPresenter.I(true);
        if (fVar != null) {
            fVar.c(actionMenuPresenter, this.f47117j);
            fVar.c(this.f47100M, this.f47117j);
        } else {
            actionMenuPresenter.l(this.f47117j, null);
            this.f47100M.l(this.f47117j, null);
            actionMenuPresenter.i(true);
            this.f47100M.i(true);
        }
        this.f47108a.setPopupTheme(this.f47118k);
        this.f47108a.setPresenter(actionMenuPresenter);
        this.f47099L = actionMenuPresenter;
        R();
    }

    public void L(j.a aVar, f.a aVar2) {
        this.f47101N = aVar;
        this.f47102O = aVar2;
        ActionMenuView actionMenuView = this.f47108a;
        if (actionMenuView != null) {
            actionMenuView.M(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f47120m = i10;
        TextView textView = this.f47110c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f47119l = i10;
        TextView textView = this.f47109b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f47108a;
        return actionMenuView != null && actionMenuView.N();
    }

    void R() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z10 = v() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f47106S;
            if (z10 && this.f47105R == null) {
                if (this.f47104Q == null) {
                    this.f47104Q = e.b(new Runnable() { // from class: androidx.appcompat.widget.N
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f46935a.e();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f47104Q);
                this.f47105R = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f47105R) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f47104Q);
            this.f47105R = null;
        }
    }

    void a() {
        for (int size = this.f47092E.size() - 1; size >= 0; size--) {
            addView(this.f47092E.get(size));
        }
        this.f47092E.clear();
    }

    @Override // p2.InterfaceC16383u
    public void addMenuProvider(InterfaceC16392z interfaceC16392z) {
        this.f47094G.c(interfaceC16392z);
    }

    public void e() {
        f fVar = this.f47100M;
        androidx.appcompat.view.menu.h hVar = fVar == null ? null : fVar.f47139b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f47108a;
        if (actionMenuView != null) {
            actionMenuView.z();
        }
    }

    void g() {
        if (this.f47115h == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C14578a.f136277Q);
            this.f47115h = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f47113f);
            this.f47115h.setContentDescription(this.f47114g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f46161a = (this.f47121n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f47141b = 2;
            this.f47115h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f47115h.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f47115h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f47115h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        F f10 = this.f47127t;
        if (f10 != null) {
            return f10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f47129v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        F f10 = this.f47127t;
        if (f10 != null) {
            return f10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        F f10 = this.f47127t;
        if (f10 != null) {
            return f10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        F f10 = this.f47127t;
        if (f10 != null) {
            return f10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f47128u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.f fVarL;
        ActionMenuView actionMenuView = this.f47108a;
        return (actionMenuView == null || (fVarL = actionMenuView.L()) == null || !fVarL.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f47129v, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.f47112e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f47112e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    View getNavButtonView() {
        return this.f47111d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f47111d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f47111d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f47099L;
    }

    Context getPopupContext() {
        return this.f47117j;
    }

    public int getPopupTheme() {
        return this.f47118k;
    }

    public CharSequence getSubtitle() {
        return this.f47132y;
    }

    final TextView getSubtitleTextView() {
        return this.f47110c;
    }

    public CharSequence getTitle() {
        return this.f47131x;
    }

    public int getTitleMarginBottom() {
        return this.f47126s;
    }

    public int getTitleMarginEnd() {
        return this.f47124q;
    }

    public int getTitleMarginStart() {
        return this.f47123p;
    }

    public int getTitleMarginTop() {
        return this.f47125r;
    }

    final TextView getTitleTextView() {
        return this.f47109b;
    }

    public InterfaceC5785t getWrapper() {
        if (this.f47098K == null) {
            this.f47098K = new Q(this, true);
        }
        return this.f47098K;
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
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof a.C0968a ? new g((a.C0968a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
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
        int[] iArr2 = this.f47093F;
        boolean zB = Y.b(this);
        int i12 = !zB ? 1 : 0;
        if (P(this.f47111d)) {
            F(this.f47111d, i10, 0, i11, 0, this.f47122o);
            measuredWidth = this.f47111d.getMeasuredWidth() + s(this.f47111d);
            iMax = Math.max(0, this.f47111d.getMeasuredHeight() + t(this.f47111d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f47111d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (P(this.f47115h)) {
            F(this.f47115h, i10, 0, i11, 0, this.f47122o);
            measuredWidth = this.f47115h.getMeasuredWidth() + s(this.f47115h);
            iMax = Math.max(iMax, this.f47115h.getMeasuredHeight() + t(this.f47115h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f47115h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (P(this.f47108a)) {
            F(this.f47108a, i10, iMax3, i11, 0, this.f47122o);
            measuredWidth2 = this.f47108a.getMeasuredWidth() + s(this.f47108a);
            iMax = Math.max(iMax, this.f47108a.getMeasuredHeight() + t(this.f47108a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f47108a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (P(this.f47116i)) {
            iArr = iArr2;
            iMax4 += E(this.f47116i, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f47116i.getMeasuredHeight() + t(this.f47116i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f47116i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (P(this.f47112e)) {
            iMax4 += E(this.f47112e, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f47112e.getMeasuredHeight() + t(this.f47112e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f47112e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f47141b == 0 && P(childAt)) {
                iMax4 += E(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f47125r + this.f47126s;
        int i16 = this.f47123p + this.f47124q;
        if (P(this.f47109b)) {
            E(this.f47109b, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f47109b.getMeasuredWidth() + s(this.f47109b);
            int measuredHeight2 = this.f47109b.getMeasuredHeight() + t(this.f47109b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f47109b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (P(this.f47110c)) {
            iMax2 = Math.max(iMax2, E(this.f47110c, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f47110c.getMeasuredHeight() + t(this.f47110c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f47110c.getMeasuredState());
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
        ActionMenuView actionMenuView = this.f47108a;
        androidx.appcompat.view.menu.f fVarL = actionMenuView != null ? actionMenuView.L() : null;
        int i10 = iVar.f47142c;
        if (i10 != 0 && this.f47100M != null && fVarL != null && (menuItemFindItem = fVarL.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f47143d) {
            H();
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.h hVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f47100M;
        if (fVar != null && (hVar = fVar.f47139b) != null) {
            iVar.f47142c = hVar.getItemId();
        }
        iVar.f47143d = B();
        return iVar;
    }

    @Override // p2.InterfaceC16383u
    public void removeMenuProvider(InterfaceC16392z interfaceC16392z) {
        this.f47094G.j(interfaceC16392z);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f47106S != z10) {
            this.f47106S = z10;
            R();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f47115h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f47115h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f47115h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f47113f);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.f47103P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f47129v) {
            this.f47129v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f47128u) {
            this.f47128u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f47112e)) {
                c(this.f47112e, true);
            }
        } else {
            ImageView imageView = this.f47112e;
            if (imageView != null && z(imageView)) {
                removeView(this.f47112e);
                this.f47092E.remove(this.f47112e);
            }
        }
        ImageView imageView2 = this.f47112e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f47112e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f47111d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            S.a(this.f47111d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f47111d)) {
                c(this.f47111d, true);
            }
        } else {
            ImageButton imageButton = this.f47111d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f47111d);
                this.f47092E.remove(this.f47111d);
            }
        }
        ImageButton imageButton2 = this.f47111d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f47096I = hVar;
    }

    public void setPopupTheme(int i10) {
        if (this.f47118k != i10) {
            this.f47118k = i10;
            if (i10 == 0) {
                this.f47117j = getContext();
            } else {
                this.f47117j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f47110c;
            if (textView != null && z(textView)) {
                removeView(this.f47110c);
                this.f47092E.remove(this.f47110c);
            }
        } else {
            if (this.f47110c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f47110c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f47110c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f47120m;
                if (i10 != 0) {
                    this.f47110c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f47088A;
                if (colorStateList != null) {
                    this.f47110c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f47110c)) {
                c(this.f47110c, true);
            }
        }
        TextView textView2 = this.f47110c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f47132y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f47088A = colorStateList;
        TextView textView = this.f47110c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f47109b;
            if (textView != null && z(textView)) {
                removeView(this.f47109b);
                this.f47092E.remove(this.f47109b);
            }
        } else {
            if (this.f47109b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f47109b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f47109b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f47119l;
                if (i10 != 0) {
                    this.f47109b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f47133z;
                if (colorStateList != null) {
                    this.f47109b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f47109b)) {
                c(this.f47109b, true);
            }
        }
        TextView textView2 = this.f47109b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f47131x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f47126s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f47124q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f47123p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f47125r = i10;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f47133z = colorStateList;
        TextView textView = this.f47109b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        f fVar = this.f47100M;
        return (fVar == null || fVar.f47139b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f47108a;
        return actionMenuView != null && actionMenuView.F();
    }

    public void y() {
        Iterator<MenuItem> it = this.f47095H.iterator();
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
        this.f47094G.f(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f47095H = currentMenuItems2;
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
                if (gVar.f47141b == 0 && P(childAt) && p(gVar.f46161a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f47141b == 0 && P(childAt2) && p(gVar2.f46161a) == iB) {
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
        gVarGenerateLayoutParams.f47141b = 1;
        if (z10 && this.f47116i != null) {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f47092E.add(view);
        } else {
            addView(view, gVarGenerateLayoutParams);
        }
    }

    private void j() {
        k();
        if (this.f47108a.L() == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) this.f47108a.getMenu();
            if (this.f47100M == null) {
                this.f47100M = new f();
            }
            this.f47108a.setExpandedActionViewsExclusive(true);
            fVar.c(this.f47100M, this.f47117j);
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
        int iR = r(gVar.f46161a);
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
        if (view.getParent() != this && !this.f47092E.contains(view)) {
            return false;
        }
        return true;
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f47141b != 2 && childAt != this.f47108a) {
                removeViewAt(childCount);
                this.f47092E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f47127t.g(i10, i11);
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
        if (getVisibility() == 0 && (actionMenuView = this.f47108a) != null && actionMenuView.I()) {
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
            return Math.max(getContentInsetStart(), Math.max(this.f47128u, 0));
        }
        return getContentInsetStart();
    }

    public Menu getMenu() {
        j();
        return this.f47108a.getMenu();
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f47108a.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f47107T);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f47090C = false;
        }
        if (!this.f47090C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f47090C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f47090C = false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        F f10 = this.f47127t;
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
            this.f47089B = false;
        }
        if (!this.f47089B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f47089B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f47089B = false;
        }
        return true;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f47111d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f47108a.setOverflowIcon(drawable);
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }
}
