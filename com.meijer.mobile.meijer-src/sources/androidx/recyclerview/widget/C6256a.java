package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6256a implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private o2.f<b> f58278a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f58279b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f58280c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1148a f58281d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f58282e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f58283f;

    /* renamed from: g, reason: collision with root package name */
    final s f58284g;

    /* renamed from: h, reason: collision with root package name */
    private int f58285h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC1148a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.F f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f58286a;

        /* renamed from: b, reason: collision with root package name */
        int f58287b;

        /* renamed from: c, reason: collision with root package name */
        Object f58288c;

        /* renamed from: d, reason: collision with root package name */
        int f58289d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f58286a;
            if (i10 != bVar.f58286a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f58289d - this.f58287b) == 1 && this.f58289d == bVar.f58287b && this.f58287b == bVar.f58289d) {
                return true;
            }
            if (this.f58289d != bVar.f58289d || this.f58287b != bVar.f58287b) {
                return false;
            }
            Object obj2 = this.f58288c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f58288c)) {
                    return false;
                }
            } else if (bVar.f58288c != null) {
                return false;
            }
            return true;
        }

        String a() {
            int i10 = this.f58286a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public int hashCode() {
            return (((this.f58286a * 31) + this.f58287b) * 31) + this.f58289d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f58287b + "c:" + this.f58289d + ",p:" + this.f58288c + "]";
        }

        b(int i10, int i11, int i12, Object obj) {
            this.f58286a = i10;
            this.f58287b = i11;
            this.f58289d = i12;
            this.f58288c = obj;
        }
    }

    C6256a(InterfaceC1148a interfaceC1148a) {
        this(interfaceC1148a, false);
    }

    int m(int i10) {
        return n(i10, 0);
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f58279b.add(a(4, i10, i11, obj));
        this.f58285h |= 4;
        return this.f58279b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f58279b.add(a(1, i10, i11, null));
        this.f58285h |= 1;
        return this.f58279b.size() == 1;
    }

    boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f58279b.add(a(8, i10, i11, null));
        this.f58285h |= 8;
        return this.f58279b.size() == 1;
    }

    boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f58279b.add(a(2, i10, i11, null));
        this.f58285h |= 2;
        return this.f58279b.size() == 1;
    }

    C6256a(InterfaceC1148a interfaceC1148a, boolean z10) {
        this.f58278a = new o2.g(30);
        this.f58279b = new ArrayList<>();
        this.f58280c = new ArrayList<>();
        this.f58285h = 0;
        this.f58281d = interfaceC1148a;
        this.f58283f = z10;
        this.f58284g = new s(this);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f58287b;
        int i11 = bVar.f58289d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f58281d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f58289d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f58287b;
        int i11 = bVar.f58289d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f58281d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f58288c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f58288c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f58289d) {
            Object obj = bVar.f58288c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (z10) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f58280c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f58280c.get(i11);
            int i12 = bVar.f58286a;
            if (i12 == 8) {
                if (n(bVar.f58289d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f58287b;
                int i14 = bVar.f58289d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f58286a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f58287b, i11);
        int i12 = bVar.f58287b;
        int i13 = bVar.f58286a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f58289d; i15++) {
            int iZ2 = z(bVar.f58287b + (i10 * i15), bVar.f58286a);
            int i16 = bVar.f58286a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f58288c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f58286a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f58288c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f58286a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f58280c.add(bVar);
        int i10 = bVar.f58286a;
        if (i10 == 1) {
            this.f58281d.g(bVar.f58287b, bVar.f58289d);
            return;
        }
        if (i10 == 2) {
            this.f58281d.d(bVar.f58287b, bVar.f58289d);
            return;
        }
        if (i10 == 4) {
            this.f58281d.e(bVar.f58287b, bVar.f58289d, bVar.f58288c);
        } else {
            if (i10 == 8) {
                this.f58281d.a(bVar.f58287b, bVar.f58289d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f58280c.size() - 1; size >= 0; size--) {
            b bVar = this.f58280c.get(size);
            int i14 = bVar.f58286a;
            if (i14 == 8) {
                int i15 = bVar.f58287b;
                int i16 = bVar.f58289d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f58287b = i15 + 1;
                            bVar.f58289d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f58287b = i15 - 1;
                            bVar.f58289d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f58289d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f58289d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f58287b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f58287b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f58287b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f58289d;
                    } else if (i14 == 2) {
                        i10 += bVar.f58289d;
                    }
                } else if (i11 == 1) {
                    bVar.f58287b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f58287b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f58280c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f58280c.get(size2);
            if (bVar2.f58286a == 8) {
                int i18 = bVar2.f58289d;
                if (i18 == bVar2.f58287b || i18 < 0) {
                    this.f58280c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f58289d <= 0) {
                this.f58280c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.s.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f58278a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f58286a = i10;
        bVarB.f58287b = i11;
        bVarB.f58289d = i12;
        bVarB.f58288c = obj;
        return bVarB;
    }

    @Override // androidx.recyclerview.widget.s.a
    public void b(b bVar) {
        if (this.f58283f) {
            return;
        }
        bVar.f58288c = null;
        this.f58278a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f58279b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f58279b.get(i11);
            int i12 = bVar.f58286a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f58287b;
                    if (i13 <= i10) {
                        int i14 = bVar.f58289d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f58287b;
                    if (i15 == i10) {
                        i10 = bVar.f58289d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f58289d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f58287b <= i10) {
                i10 += bVar.f58289d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f58280c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f58281d.c(this.f58280c.get(i10));
        }
        x(this.f58280c);
        this.f58285h = 0;
    }

    void l(b bVar, int i10) {
        this.f58281d.b(bVar);
        int i11 = bVar.f58286a;
        if (i11 == 2) {
            this.f58281d.h(i10, bVar.f58289d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f58281d.e(i10, bVar.f58289d, bVar.f58288c);
        }
    }

    int n(int i10, int i11) {
        int size = this.f58280c.size();
        while (i11 < size) {
            b bVar = this.f58280c.get(i11);
            int i12 = bVar.f58286a;
            if (i12 == 8) {
                int i13 = bVar.f58287b;
                if (i13 == i10) {
                    i10 = bVar.f58289d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f58289d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f58287b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f58289d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f58289d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f58285h) != 0;
    }

    boolean p() {
        return this.f58279b.size() > 0;
    }

    boolean q() {
        return (this.f58280c.isEmpty() || this.f58279b.isEmpty()) ? false : true;
    }

    void w() {
        this.f58284g.b(this.f58279b);
        int size = this.f58279b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f58279b.get(i10);
            int i11 = bVar.f58286a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f58282e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f58279b.clear();
    }

    void y() {
        x(this.f58279b);
        x(this.f58280c);
        this.f58285h = 0;
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    void j() {
        i();
        int size = this.f58279b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f58279b.get(i10);
            int i11 = bVar.f58286a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            this.f58281d.c(bVar);
                            this.f58281d.a(bVar.f58287b, bVar.f58289d);
                        }
                    } else {
                        this.f58281d.c(bVar);
                        this.f58281d.e(bVar.f58287b, bVar.f58289d, bVar.f58288c);
                    }
                } else {
                    this.f58281d.c(bVar);
                    this.f58281d.h(bVar.f58287b, bVar.f58289d);
                }
            } else {
                this.f58281d.c(bVar);
                this.f58281d.g(bVar.f58287b, bVar.f58289d);
            }
            Runnable runnable = this.f58282e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f58279b);
        this.f58285h = 0;
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }
}
