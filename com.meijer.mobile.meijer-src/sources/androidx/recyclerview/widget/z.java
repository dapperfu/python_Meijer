package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes4.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    final b f58540a;

    /* renamed from: b, reason: collision with root package name */
    a f58541b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f58542a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f58543b;

        /* renamed from: c, reason: collision with root package name */
        int f58544c;

        /* renamed from: d, reason: collision with root package name */
        int f58545d;

        /* renamed from: e, reason: collision with root package name */
        int f58546e;

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f58542a = 0;
        }

        void a(int i10) {
            this.f58542a = i10 | this.f58542a;
        }

        boolean b() {
            int i10 = this.f58542a;
            if ((i10 & 7) != 0 && (i10 & c(this.f58545d, this.f58543b)) == 0) {
                return false;
            }
            int i11 = this.f58542a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f58545d, this.f58544c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f58542a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f58546e, this.f58543b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f58542a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f58546e, this.f58544c) << 12)) != 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f58543b = i10;
            this.f58544c = i11;
            this.f58545d = i12;
            this.f58546e = i13;
        }

        a() {
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    View a(int i10, int i11, int i12, int i13) {
        int iC = this.f58540a.c();
        int iD = this.f58540a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f58540a.a(i10);
            this.f58541b.e(iC, iD, this.f58540a.b(viewA), this.f58540a.e(viewA));
            if (i12 != 0) {
                this.f58541b.d();
                this.f58541b.a(i12);
                if (this.f58541b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f58541b.d();
                this.f58541b.a(i13);
                if (this.f58541b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f58541b.e(this.f58540a.c(), this.f58540a.d(), this.f58540a.b(view), this.f58540a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f58541b.d();
        this.f58541b.a(i10);
        return this.f58541b.b();
    }

    z(b bVar) {
        this.f58540a = bVar;
    }
}
