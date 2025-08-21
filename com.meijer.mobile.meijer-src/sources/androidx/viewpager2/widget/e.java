package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* loaded from: classes4.dex */
final class e extends RecyclerView.u {

    /* renamed from: a, reason: collision with root package name */
    private ViewPager2.i f59255a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager2 f59256b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView f59257c;

    /* renamed from: d, reason: collision with root package name */
    private final LinearLayoutManager f59258d;

    /* renamed from: e, reason: collision with root package name */
    private int f59259e;

    /* renamed from: f, reason: collision with root package name */
    private int f59260f;

    /* renamed from: g, reason: collision with root package name */
    private a f59261g;

    /* renamed from: h, reason: collision with root package name */
    private int f59262h;

    /* renamed from: i, reason: collision with root package name */
    private int f59263i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f59264j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f59265k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f59266l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f59267m;

    private void l() {
        this.f59259e = 0;
        this.f59260f = 0;
        this.f59261g.a();
        this.f59262h = -1;
        this.f59263i = -1;
        this.f59264j = false;
        this.f59265k = false;
        this.f59267m = false;
        this.f59266l = false;
    }

    void j() {
        this.f59266l = true;
    }

    void k(int i10, boolean z10) {
        this.f59259e = z10 ? 2 : 3;
        this.f59267m = false;
        boolean z11 = this.f59263i != i10;
        this.f59263i = i10;
        c(2);
        if (z11) {
            b(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f59265k = r4
            r3.o()
            boolean r0 = r3.f59264j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.f59264j = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f59256b
            boolean r6 = r6.d()
            if (r5 != r6) goto L29
        L1f:
            androidx.viewpager2.widget.e$a r5 = r3.f59261g
            int r6 = r5.f59270c
            if (r6 == 0) goto L29
            int r5 = r5.f59268a
            int r5 = r5 + r4
            goto L2d
        L29:
            androidx.viewpager2.widget.e$a r5 = r3.f59261g
            int r5 = r5.f59268a
        L2d:
            r3.f59263i = r5
            int r6 = r3.f59262h
            if (r6 == r5) goto L45
            r3.b(r5)
            goto L45
        L37:
            int r5 = r3.f59259e
            if (r5 != 0) goto L45
            androidx.viewpager2.widget.e$a r5 = r3.f59261g
            int r5 = r5.f59268a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.b(r5)
        L45:
            androidx.viewpager2.widget.e$a r5 = r3.f59261g
            int r6 = r5.f59268a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.f59269b
            int r5 = r5.f59270c
            r3.a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f59261g
            int r6 = r5.f59268a
            int r0 = r3.f59263i
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.f59270c
            if (r5 != 0) goto L6b
            int r5 = r3.f59260f
            if (r5 == r4) goto L6b
            r3.c(r2)
            r3.l()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f59268a;

        /* renamed from: b, reason: collision with root package name */
        float f59269b;

        /* renamed from: c, reason: collision with root package name */
        int f59270c;

        void a() {
            this.f59268a = -1;
            this.f59269b = 0.0f;
            this.f59270c = 0;
        }

        a() {
        }
    }

    private void a(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f59255a;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
    }

    private void b(int i10) {
        ViewPager2.i iVar = this.f59255a;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
    }

    private void c(int i10) {
        if ((this.f59259e == 3 && this.f59260f == 0) || this.f59260f == i10) {
            return;
        }
        this.f59260f = i10;
        ViewPager2.i iVar = this.f59255a;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
    }

    private int d() {
        return this.f59258d.r2();
    }

    private boolean i() {
        int i10 = this.f59259e;
        return i10 == 1 || i10 == 4;
    }

    private void n(boolean z10) {
        this.f59267m = z10;
        this.f59259e = z10 ? 4 : 1;
        int i10 = this.f59263i;
        if (i10 != -1) {
            this.f59262h = i10;
            this.f59263i = -1;
        } else if (this.f59262h == -1) {
            this.f59262h = d();
        }
        c(1);
    }

    private void o() {
        int top;
        a aVar = this.f59261g;
        int iR2 = this.f59258d.r2();
        aVar.f59268a = iR2;
        if (iR2 == -1) {
            aVar.a();
            return;
        }
        View viewU = this.f59258d.U(iR2);
        if (viewU == null) {
            aVar.a();
            return;
        }
        int iS0 = this.f59258d.s0(viewU);
        int iX0 = this.f59258d.x0(viewU);
        int iA0 = this.f59258d.A0(viewU);
        int iZ = this.f59258d.Z(viewU);
        ViewGroup.LayoutParams layoutParams = viewU.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iS0 += marginLayoutParams.leftMargin;
            iX0 += marginLayoutParams.rightMargin;
            iA0 += marginLayoutParams.topMargin;
            iZ += marginLayoutParams.bottomMargin;
        }
        int height = viewU.getHeight() + iA0 + iZ;
        int width = viewU.getWidth() + iS0 + iX0;
        if (this.f59258d.F2() == 0) {
            top = (viewU.getLeft() - iS0) - this.f59257c.getPaddingLeft();
            if (this.f59256b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewU.getTop() - iA0) - this.f59257c.getPaddingTop();
        }
        int i10 = -top;
        aVar.f59270c = i10;
        if (i10 >= 0) {
            aVar.f59269b = height == 0 ? 0.0f : i10 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f59258d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f59270c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    int f() {
        return this.f59260f;
    }

    boolean g() {
        return this.f59267m;
    }

    boolean h() {
        return this.f59260f == 0;
    }

    void m(ViewPager2.i iVar) {
        this.f59255a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        if (!(this.f59259e == 1 && this.f59260f == 1) && i10 == 1) {
            n(false);
            return;
        }
        if (i() && i10 == 2) {
            if (this.f59265k) {
                c(2);
                this.f59264j = true;
                return;
            }
            return;
        }
        if (i() && i10 == 0) {
            o();
            if (this.f59265k) {
                a aVar = this.f59261g;
                if (aVar.f59270c == 0) {
                    int i11 = this.f59262h;
                    int i12 = aVar.f59268a;
                    if (i11 != i12) {
                        b(i12);
                    }
                }
            } else {
                int i13 = this.f59261g.f59268a;
                if (i13 != -1) {
                    a(i13, 0.0f, 0);
                }
            }
            c(0);
            l();
        }
        if (this.f59259e == 2 && i10 == 0 && this.f59266l) {
            o();
            a aVar2 = this.f59261g;
            if (aVar2.f59270c == 0) {
                int i14 = this.f59263i;
                int i15 = aVar2.f59268a;
                if (i14 != i15) {
                    if (i15 == -1) {
                        i15 = 0;
                    }
                    b(i15);
                }
                c(0);
                l();
            }
        }
    }

    e(ViewPager2 viewPager2) {
        this.f59256b = viewPager2;
        RecyclerView recyclerView = viewPager2.f59215j;
        this.f59257c = recyclerView;
        this.f59258d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f59261g = new a();
        l();
    }

    double e() {
        o();
        a aVar = this.f59261g;
        return aVar.f59268a + aVar.f59269b;
    }
}
