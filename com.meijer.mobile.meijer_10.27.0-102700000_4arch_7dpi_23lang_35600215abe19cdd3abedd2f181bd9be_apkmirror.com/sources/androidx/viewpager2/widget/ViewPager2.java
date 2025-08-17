package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import q2.InterfaceC16438B;
import q2.y;

/* loaded from: classes4.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    static boolean f59019u = true;

    /* renamed from: a, reason: collision with root package name */
    private final Rect f59020a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f59021b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f59022c;

    /* renamed from: d, reason: collision with root package name */
    int f59023d;

    /* renamed from: e, reason: collision with root package name */
    boolean f59024e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f59025f;

    /* renamed from: g, reason: collision with root package name */
    LinearLayoutManager f59026g;

    /* renamed from: h, reason: collision with root package name */
    private int f59027h;

    /* renamed from: i, reason: collision with root package name */
    private Parcelable f59028i;

    /* renamed from: j, reason: collision with root package name */
    RecyclerView f59029j;

    /* renamed from: k, reason: collision with root package name */
    private u f59030k;

    /* renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.e f59031l;

    /* renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f59032m;

    /* renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.c f59033n;

    /* renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.d f59034o;

    /* renamed from: p, reason: collision with root package name */
    private RecyclerView.m f59035p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f59036q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f59037r;

    /* renamed from: s, reason: collision with root package name */
    private int f59038s;

    /* renamed from: t, reason: collision with root package name */
    e f59039t;

    private class RecyclerViewImpl extends RecyclerView {
        RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f59039t.d() ? ViewPager2.this.f59039t.o() : super.getAccessibilityClassName();
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f59023d);
            accessibilityEvent.setToIndex(ViewPager2.this.f59023d);
            ViewPager2.this.f59039t.p(accessibilityEvent);
        }
    }

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f59024e = true;
            viewPager2.f59031l.j();
        }
    }

    class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                ViewPager2.this.o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f59023d != i10) {
                viewPager2.f59023d = i10;
                viewPager2.f59039t.r();
            }
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f59029j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
        }

        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width == -1 && ((ViewGroup.MarginLayoutParams) qVar).height == -1) {
            } else {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(y yVar) {
        }

        void k(View view, y yVar) {
        }

        void n() {
        }

        void p(AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }
    }

    class f extends e {
        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(y yVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            yVar.g0(y.a.f156737r);
            yVar.g0(y.a.f156736q);
            yVar.R0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }
    }

    private class h extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean J1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }

        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void e2(RecyclerView.B b10, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.e2(b10, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void f1(RecyclerView.w wVar, RecyclerView.B b10, View view, y yVar) {
            ViewPager2.this.f59039t.k(view, yVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean x1(RecyclerView.w wVar, RecyclerView.B b10, int i10, Bundle bundle) {
            return ViewPager2.this.f59039t.b(i10) ? ViewPager2.this.f59039t.l(i10) : super.x1(wVar, b10, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void c1(RecyclerView.w wVar, RecyclerView.B b10, y yVar) {
            super.c1(wVar, b10, yVar);
            ViewPager2.this.f59039t.j(yVar);
        }
    }

    public static abstract class i {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageScrolled(int i10, float f10, int i11) {
        }

        public void onPageSelected(int i10) {
        }
    }

    class j extends e {

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC16438B f59048b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC16438B f59049c;

        /* renamed from: d, reason: collision with root package name */
        private RecyclerView.j f59050d;

        class a implements InterfaceC16438B {
            a() {
            }

            @Override // q2.InterfaceC16438B
            public boolean a(View view, InterfaceC16438B.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements InterfaceC16438B {
            b() {
            }

            @Override // q2.InterfaceC16438B
            public boolean a(View view, InterfaceC16438B.a aVar) {
                j.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.y();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            recyclerView.setImportantForAccessibility(2);
            this.f59050d = new c();
            if (ViewPager2.this.getImportantForAccessibility() == 0) {
                ViewPager2.this.setImportantForAccessibility(1);
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f59048b = new a();
            this.f59049c = new b();
        }

        private void u(y yVar) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            yVar.r0(y.e.b(itemCount2, itemCount, false, 0));
        }

        private void v(View view, y yVar) {
            yVar.s0(y.f.a(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f59026g.v0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f59026g.v0(view) : 0, 1, false, false));
        }

        private void w(y yVar) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f59023d > 0) {
                yVar.a(8192);
            }
            if (ViewPager2.this.f59023d < itemCount - 1) {
                yVar.a(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            yVar.R0(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f59050d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        void x(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            ViewCompat.g0(viewPager2, R.id.accessibilityActionPageLeft);
            ViewCompat.g0(viewPager2, R.id.accessibilityActionPageRight);
            ViewCompat.g0(viewPager2, R.id.accessibilityActionPageUp);
            ViewCompat.g0(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() != 0) {
                if (ViewPager2.this.f59023d < itemCount - 1) {
                    ViewCompat.i0(viewPager2, new y.a(R.id.accessibilityActionPageDown, null), null, this.f59048b);
                }
                if (ViewPager2.this.f59023d > 0) {
                    ViewCompat.i0(viewPager2, new y.a(R.id.accessibilityActionPageUp, null), null, this.f59049c);
                    return;
                }
                return;
            }
            boolean zD = ViewPager2.this.d();
            int i11 = zD ? 16908360 : 16908361;
            if (zD) {
                i10 = 16908361;
            }
            if (ViewPager2.this.f59023d < itemCount - 1) {
                ViewCompat.i0(viewPager2, new y.a(i11, null), null, this.f59048b);
            }
            if (ViewPager2.this.f59023d > 0) {
                ViewCompat.i0(viewPager2, new y.a(i10, null), null, this.f59049c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f59050d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            y yVarG1 = y.g1(accessibilityNodeInfo);
            u(yVarG1);
            w(yVarG1);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(View view, y yVar) {
            v(view, yVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            int currentItem;
            if (c(i10, bundle)) {
                if (i10 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                x(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }
    }

    public interface k {
    }

    private class l extends u {
        l() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.y
        public View f(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    private static class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final int f59059a;

        /* renamed from: b, reason: collision with root package name */
        private final RecyclerView f59060b;

        @Override // java.lang.Runnable
        public void run() {
            this.f59060b.smoothScrollToPosition(this.f59059a);
        }

        n(int i10, RecyclerView recyclerView) {
            this.f59059a = i10;
            this.f59060b = recyclerView;
        }
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f59038s = i10;
        this.f59029j.requestLayout();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f59036q) {
                this.f59035p = this.f59029j.getItemAnimator();
                this.f59036q = true;
            }
            this.f59029j.setItemAnimator(null);
        } else if (this.f59036q) {
            this.f59029j.setItemAnimator(this.f59035p);
            this.f59035p = null;
            this.f59036q = false;
        }
        this.f59034o.a();
        if (kVar == null) {
            return;
        }
        this.f59034o.b(kVar);
        h();
    }

    static class m extends View.BaseSavedState {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f59056a;

        /* renamed from: b, reason: collision with root package name */
        int f59057b;

        /* renamed from: c, reason: collision with root package name */
        Parcelable f59058c;

        class a implements Parcelable.ClassLoaderCreator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i10) {
                return new m[i10];
            }

            a() {
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        m(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f59056a = parcel.readInt();
            this.f59057b = parcel.readInt();
            this.f59058c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f59056a);
            parcel.writeInt(this.f59057b);
            parcel.writeParcelable(this.f59058c, i10);
        }
    }

    private RecyclerView.r a() {
        return new d();
    }

    private void b(Context context, AttributeSet attributeSet) throws IllegalStateException {
        this.f59039t = f59019u ? new j() : new f();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.f59029j = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.f59029j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f59026g = hVar;
        this.f59029j.setLayoutManager(hVar);
        this.f59029j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f59029j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f59029j.addOnChildAttachStateChangeListener(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f59031l = eVar;
        this.f59033n = new androidx.viewpager2.widget.c(this, eVar, this.f59029j);
        l lVar = new l();
        this.f59030k = lVar;
        lVar.b(this.f59029j);
        this.f59029j.addOnScrollListener(this.f59031l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f59032m = bVar;
        this.f59031l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f59032m.a(bVar2);
        this.f59032m.a(cVar);
        this.f59039t.h(this.f59032m, this.f59029j);
        this.f59032m.a(this.f59022c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f59026g);
        this.f59034o = dVar;
        this.f59032m.a(dVar);
        RecyclerView recyclerView = this.f59029j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f59025f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        RecyclerView.h adapter;
        if (this.f59027h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f59028i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.c) {
                ((androidx.viewpager2.adapter.c) adapter).restoreState(parcelable);
            }
            this.f59028i = null;
        }
        int iMax = Math.max(0, Math.min(this.f59027h, adapter.getItemCount() - 1));
        this.f59023d = iMax;
        this.f59027h = -1;
        this.f59029j.scrollToPosition(iMax);
        this.f59039t.n();
    }

    private void l(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K4.a.f16297a);
        ViewCompat.k0(this, context, K4.a.f16297a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(K4.a.f16298b, 0));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f59025f);
        }
    }

    public boolean c() {
        return this.f59033n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f59029j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f59029j.canScrollVertically(i10);
    }

    boolean d() {
        return this.f59026g.r0() == 1;
    }

    public boolean e() {
        return this.f59037r;
    }

    public void g(i iVar) {
        this.f59022c.a(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f59039t.a() ? this.f59039t.g() : super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f59029j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f59023d;
    }

    public int getItemDecorationCount() {
        return this.f59029j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f59038s;
    }

    public int getOrientation() {
        return this.f59026g.F2() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f59029j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f59031l.f();
    }

    public void h() {
        this.f59034o.a();
    }

    public void n(i iVar) {
        this.f59022c.b(iVar);
    }

    void o() {
        u uVar = this.f59030k;
        if (uVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = uVar.f(this.f59026g);
        if (viewF == null) {
            return;
        }
        int iV0 = this.f59026g.v0(viewF);
        if (iV0 != this.f59023d && getScrollState() == 0) {
            this.f59032m.onPageSelected(iV0);
        }
        this.f59024e = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f59029j.getMeasuredWidth();
        int measuredHeight = this.f59029j.getMeasuredHeight();
        this.f59020a.left = getPaddingLeft();
        this.f59020a.right = (i12 - i10) - getPaddingRight();
        this.f59020a.top = getPaddingTop();
        this.f59020a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f59020a, this.f59021b);
        RecyclerView recyclerView = this.f59029j;
        Rect rect = this.f59021b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f59024e) {
            o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f59029j, i10, i11);
        int measuredWidth = this.f59029j.getMeasuredWidth();
        int measuredHeight = this.f59029j.getMeasuredHeight();
        int measuredState = this.f59029j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f59027h = mVar.f59057b;
        this.f59028i = mVar.f59058c;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f59039t.c(i10, bundle) ? this.f59039t.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f59029j.getAdapter();
        this.f59039t.f(adapter);
        m(adapter);
        this.f59029j.setAdapter(hVar);
        this.f59023d = 0;
        i();
        this.f59039t.e(hVar);
        f(hVar);
    }

    public void setOrientation(int i10) {
        this.f59026g.U2(i10);
        this.f59039t.s();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f59037r = z10;
        this.f59039t.t();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) throws IllegalStateException {
        super(context, attributeSet);
        this.f59020a = new Rect();
        this.f59021b = new Rect();
        this.f59022c = new androidx.viewpager2.widget.b(3);
        this.f59024e = false;
        this.f59025f = new a();
        this.f59027h = -1;
        this.f59035p = null;
        this.f59036q = false;
        this.f59037r = true;
        this.f59038s = -1;
        b(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof m) {
            int i10 = ((m) parcelable).f59056a;
            sparseArray.put(this.f59029j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    void k(int i10, boolean z10) {
        int i11;
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f59027h != -1) {
                this.f59027h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() > 0) {
            int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
            if (iMin != this.f59023d || !this.f59031l.h()) {
                int i12 = this.f59023d;
                if (iMin == i12 && z10) {
                    return;
                }
                double dE = i12;
                this.f59023d = iMin;
                this.f59039t.r();
                if (!this.f59031l.h()) {
                    dE = this.f59031l.e();
                }
                this.f59031l.k(iMin, z10);
                if (!z10) {
                    this.f59029j.scrollToPosition(iMin);
                    return;
                }
                double d10 = iMin;
                if (Math.abs(d10 - dE) > 3.0d) {
                    RecyclerView recyclerView = this.f59029j;
                    if (d10 > dE) {
                        i11 = iMin - 3;
                    } else {
                        i11 = iMin + 3;
                    }
                    recyclerView.scrollToPosition(i11);
                    RecyclerView recyclerView2 = this.f59029j;
                    recyclerView2.post(new n(iMin, recyclerView2));
                    return;
                }
                this.f59029j.smoothScrollToPosition(iMin);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f59039t.i(accessibilityNodeInfo);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f59056a = this.f59029j.getId();
        int i10 = this.f59027h;
        if (i10 == -1) {
            i10 = this.f59023d;
        }
        mVar.f59057b = i10;
        Parcelable parcelable = this.f59028i;
        if (parcelable != null) {
            mVar.f59058c = parcelable;
            return mVar;
        }
        Object adapter = this.f59029j.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.c) {
            mVar.f59058c = ((androidx.viewpager2.adapter.c) adapter).saveState();
        }
        return mVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f59039t.q();
    }
}
