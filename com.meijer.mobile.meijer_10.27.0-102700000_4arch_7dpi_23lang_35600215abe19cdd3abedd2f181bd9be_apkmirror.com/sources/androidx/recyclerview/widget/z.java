package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes4.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    final b f58316a;

    /* renamed from: b, reason: collision with root package name */
    a f58317b = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        int f58318a = 0;

        /* renamed from: b, reason: collision with root package name */
        int f58319b;

        /* renamed from: c, reason: collision with root package name */
        int f58320c;

        /* renamed from: d, reason: collision with root package name */
        int f58321d;

        /* renamed from: e, reason: collision with root package name */
        int f58322e;

        int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        void d() {
            this.f58318a = 0;
        }

        void a(int i10) {
            this.f58318a = i10 | this.f58318a;
        }

        boolean b() {
            int i10 = this.f58318a;
            if ((i10 & 7) != 0 && (i10 & c(this.f58321d, this.f58319b)) == 0) {
                return false;
            }
            int i11 = this.f58318a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f58321d, this.f58320c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f58318a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f58322e, this.f58319b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f58318a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f58322e, this.f58320c) << 12)) != 0;
        }

        void e(int i10, int i11, int i12, int i13) {
            this.f58319b = i10;
            this.f58320c = i11;
            this.f58321d = i12;
            this.f58322e = i13;
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
        int iC = this.f58316a.c();
        int iD = this.f58316a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewA = this.f58316a.a(i10);
            this.f58317b.e(iC, iD, this.f58316a.b(viewA), this.f58316a.e(viewA));
            if (i12 != 0) {
                this.f58317b.d();
                this.f58317b.a(i12);
                if (this.f58317b.b()) {
                    return viewA;
                }
            }
            if (i13 != 0) {
                this.f58317b.d();
                this.f58317b.a(i13);
                if (this.f58317b.b()) {
                    view = viewA;
                }
            }
            i10 += i14;
        }
        return view;
    }

    boolean b(View view, int i10) {
        this.f58317b.e(this.f58316a.c(), this.f58316a.d(), this.f58316a.b(view), this.f58316a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f58317b.d();
        this.f58317b.a(i10);
        return this.f58317b.b();
    }

    z(b bVar) {
        this.f58316a = bVar;
    }
}
