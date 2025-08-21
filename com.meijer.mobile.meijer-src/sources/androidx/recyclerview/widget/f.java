package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final b f58321a;

    /* renamed from: e, reason: collision with root package name */
    private View f58325e;

    /* renamed from: d, reason: collision with root package name */
    private int f58324d = 0;

    /* renamed from: b, reason: collision with root package name */
    final a f58322b = new a();

    /* renamed from: c, reason: collision with root package name */
    final List<View> f58323c = new ArrayList();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        long f58326a = 0;

        /* renamed from: b, reason: collision with root package name */
        a f58327b;

        private void c() {
            if (this.f58327b == null) {
                this.f58327b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f58326a &= ~(1 << i10);
                return;
            }
            a aVar = this.f58327b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        int b(int i10) {
            a aVar = this.f58327b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f58326a) : Long.bitCount(this.f58326a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f58326a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f58326a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f58326a & (1 << i10)) != 0;
            }
            c();
            return this.f58327b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f58327b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f58326a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f58326a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f58327b != null) {
                c();
                this.f58327b.e(0, z11);
            }
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f58327b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f58326a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f58326a = j12;
            long j13 = j10 - 1;
            this.f58326a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f58327b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f58327b.f(0);
            }
            return z10;
        }

        void g() {
            this.f58326a = 0L;
            a aVar = this.f58327b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f58326a |= 1 << i10;
            } else {
                c();
                this.f58327b.h(i10 - 64);
            }
        }

        public String toString() {
            if (this.f58327b == null) {
                return Long.toBinaryString(this.f58326a);
            }
            return this.f58327b.toString() + "xx" + Long.toBinaryString(this.f58326a);
        }

        a() {
        }
    }

    interface b {
        View a(int i10);

        void b(View view);

        int c();

        RecyclerView.F d(View view);

        void e(int i10);

        void f(View view, int i10);

        void g();

        int h(View view);

        void i(View view);

        void j(int i10);

        void k(View view, int i10, ViewGroup.LayoutParams layoutParams);
    }

    private int h(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int iC = this.f58321a.c();
        int i11 = i10;
        while (i11 < iC) {
            int iB = i10 - (i11 - this.f58322b.b(i11));
            if (iB == 0) {
                while (this.f58322b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    private void l(View view) {
        this.f58323c.add(view);
        this.f58321a.b(view);
    }

    private boolean t(View view) {
        if (!this.f58323c.remove(view)) {
            return false;
        }
        this.f58321a.i(view);
        return true;
    }

    void a(View view, int i10, boolean z10) {
        int iC = i10 < 0 ? this.f58321a.c() : h(i10);
        this.f58322b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f58321a.f(view, iC);
    }

    void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int iC = i10 < 0 ? this.f58321a.c() : h(i10);
        this.f58322b.e(iC, z10);
        if (z10) {
            l(view);
        }
        this.f58321a.k(view, iC, layoutParams);
    }

    View e(int i10) {
        int size = this.f58323c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f58323c.get(i11);
            RecyclerView.F fD = this.f58321a.d(view);
            if (fD.getLayoutPosition() == i10 && !fD.isInvalid() && !fD.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    int g() {
        return this.f58321a.c() - this.f58323c.size();
    }

    View i(int i10) {
        return this.f58321a.a(i10);
    }

    int j() {
        return this.f58321a.c();
    }

    void k(View view) {
        int iH = this.f58321a.h(view);
        if (iH >= 0) {
            this.f58322b.h(iH);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iH = this.f58321a.h(view);
        if (iH == -1 || this.f58322b.d(iH)) {
            return -1;
        }
        return iH - this.f58322b.b(iH);
    }

    boolean n(View view) {
        return this.f58323c.contains(view);
    }

    void o() {
        this.f58322b.g();
        for (int size = this.f58323c.size() - 1; size >= 0; size--) {
            this.f58321a.i(this.f58323c.get(size));
            this.f58323c.remove(size);
        }
        this.f58321a.g();
    }

    void p(View view) {
        int i10 = this.f58324d;
        if (i10 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f58324d = 1;
            this.f58325e = view;
            int iH = this.f58321a.h(view);
            if (iH >= 0) {
                if (this.f58322b.f(iH)) {
                    t(view);
                }
                this.f58321a.j(iH);
            }
            this.f58324d = 0;
            this.f58325e = null;
        } catch (Throwable th2) {
            this.f58324d = 0;
            this.f58325e = null;
            throw th2;
        }
    }

    void q(int i10) {
        int i11 = this.f58324d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iH = h(i10);
            View viewA = this.f58321a.a(iH);
            if (viewA != null) {
                this.f58324d = 1;
                this.f58325e = viewA;
                if (this.f58322b.f(iH)) {
                    t(viewA);
                }
                this.f58321a.j(iH);
            }
            this.f58324d = 0;
            this.f58325e = null;
        } catch (Throwable th2) {
            this.f58324d = 0;
            this.f58325e = null;
            throw th2;
        }
    }

    boolean r(View view) {
        int i10 = this.f58324d;
        if (i10 == 1) {
            if (this.f58325e == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i10 == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f58324d = 2;
            int iH = this.f58321a.h(view);
            if (iH == -1) {
                t(view);
                return true;
            }
            if (!this.f58322b.d(iH)) {
                return false;
            }
            this.f58322b.f(iH);
            t(view);
            this.f58321a.j(iH);
            return true;
        } finally {
            this.f58324d = 0;
        }
    }

    void s(View view) {
        int iH = this.f58321a.h(view);
        if (iH < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f58322b.d(iH)) {
            this.f58322b.a(iH);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f58322b.toString() + ", hidden list:" + this.f58323c.size();
    }

    f(b bVar) {
        this.f58321a = bVar;
    }

    void d(int i10) {
        int iH = h(i10);
        this.f58322b.f(iH);
        this.f58321a.e(iH);
    }

    View f(int i10) {
        return this.f58321a.a(h(i10));
    }
}
