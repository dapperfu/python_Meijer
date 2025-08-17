package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C6114a implements s.a {

    /* renamed from: a, reason: collision with root package name */
    private o2.f<b> f58054a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f58055b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f58056c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC1135a f58057d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f58058e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f58059f;

    /* renamed from: g, reason: collision with root package name */
    final s f58060g;

    /* renamed from: h, reason: collision with root package name */
    private int f58061h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC1135a {
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
        int f58062a;

        /* renamed from: b, reason: collision with root package name */
        int f58063b;

        /* renamed from: c, reason: collision with root package name */
        Object f58064c;

        /* renamed from: d, reason: collision with root package name */
        int f58065d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f58062a;
            if (i10 != bVar.f58062a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f58065d - this.f58063b) == 1 && this.f58065d == bVar.f58063b && this.f58063b == bVar.f58065d) {
                return true;
            }
            if (this.f58065d != bVar.f58065d || this.f58063b != bVar.f58063b) {
                return false;
            }
            Object obj2 = this.f58064c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f58064c)) {
                    return false;
                }
            } else if (bVar.f58064c != null) {
                return false;
            }
            return true;
        }

        String a() {
            int i10 = this.f58062a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public int hashCode() {
            return (((this.f58062a * 31) + this.f58063b) * 31) + this.f58065d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f58063b + "c:" + this.f58065d + ",p:" + this.f58064c + "]";
        }

        b(int i10, int i11, int i12, Object obj) {
            this.f58062a = i10;
            this.f58063b = i11;
            this.f58065d = i12;
            this.f58064c = obj;
        }
    }

    C6114a(InterfaceC1135a interfaceC1135a) {
        this(interfaceC1135a, false);
    }

    int m(int i10) {
        return n(i10, 0);
    }

    boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f58055b.add(a(4, i10, i11, obj));
        this.f58061h |= 4;
        return this.f58055b.size() == 1;
    }

    boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f58055b.add(a(1, i10, i11, null));
        this.f58061h |= 1;
        return this.f58055b.size() == 1;
    }

    boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f58055b.add(a(8, i10, i11, null));
        this.f58061h |= 8;
        return this.f58055b.size() == 1;
    }

    boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f58055b.add(a(2, i10, i11, null));
        this.f58061h |= 2;
        return this.f58055b.size() == 1;
    }

    C6114a(InterfaceC1135a interfaceC1135a, boolean z10) {
        this.f58054a = new o2.g(30);
        this.f58055b = new ArrayList<>();
        this.f58056c = new ArrayList<>();
        this.f58061h = 0;
        this.f58057d = interfaceC1135a;
        this.f58059f = z10;
        this.f58060g = new s(this);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f58063b;
        int i11 = bVar.f58065d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f58057d.f(i12) != null || h(i12)) {
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
        if (i13 != bVar.f58065d) {
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
        int i10 = bVar.f58063b;
        int i11 = bVar.f58065d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f58057d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f58064c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f58064c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f58065d) {
            Object obj = bVar.f58064c;
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
        int size = this.f58056c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f58056c.get(i11);
            int i12 = bVar.f58062a;
            if (i12 == 8) {
                if (n(bVar.f58065d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f58063b;
                int i14 = bVar.f58065d + i13;
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
        int i11 = bVar.f58062a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f58063b, i11);
        int i12 = bVar.f58063b;
        int i13 = bVar.f58062a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f58065d; i15++) {
            int iZ2 = z(bVar.f58063b + (i10 * i15), bVar.f58062a);
            int i16 = bVar.f58062a;
            if (i16 == 2 ? iZ2 != iZ : !(i16 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i16, iZ, i14, bVar.f58064c);
                l(bVarA, i12);
                b(bVarA);
                if (bVar.f58062a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iZ = iZ2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f58064c;
        b(bVar);
        if (i14 > 0) {
            b bVarA2 = a(bVar.f58062a, iZ, i14, obj);
            l(bVarA2, i12);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f58056c.add(bVar);
        int i10 = bVar.f58062a;
        if (i10 == 1) {
            this.f58057d.g(bVar.f58063b, bVar.f58065d);
            return;
        }
        if (i10 == 2) {
            this.f58057d.d(bVar.f58063b, bVar.f58065d);
            return;
        }
        if (i10 == 4) {
            this.f58057d.e(bVar.f58063b, bVar.f58065d, bVar.f58064c);
        } else {
            if (i10 == 8) {
                this.f58057d.a(bVar.f58063b, bVar.f58065d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f58056c.size() - 1; size >= 0; size--) {
            b bVar = this.f58056c.get(size);
            int i14 = bVar.f58062a;
            if (i14 == 8) {
                int i15 = bVar.f58063b;
                int i16 = bVar.f58065d;
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
                            bVar.f58063b = i15 + 1;
                            bVar.f58065d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f58063b = i15 - 1;
                            bVar.f58065d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f58065d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f58065d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f58063b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f58063b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f58063b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f58065d;
                    } else if (i14 == 2) {
                        i10 += bVar.f58065d;
                    }
                } else if (i11 == 1) {
                    bVar.f58063b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f58063b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f58056c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f58056c.get(size2);
            if (bVar2.f58062a == 8) {
                int i18 = bVar2.f58065d;
                if (i18 == bVar2.f58063b || i18 < 0) {
                    this.f58056c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f58065d <= 0) {
                this.f58056c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.s.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVarB = this.f58054a.b();
        if (bVarB == null) {
            return new b(i10, i11, i12, obj);
        }
        bVarB.f58062a = i10;
        bVarB.f58063b = i11;
        bVarB.f58065d = i12;
        bVarB.f58064c = obj;
        return bVarB;
    }

    @Override // androidx.recyclerview.widget.s.a
    public void b(b bVar) {
        if (this.f58059f) {
            return;
        }
        bVar.f58064c = null;
        this.f58054a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f58055b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f58055b.get(i11);
            int i12 = bVar.f58062a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f58063b;
                    if (i13 <= i10) {
                        int i14 = bVar.f58065d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f58063b;
                    if (i15 == i10) {
                        i10 = bVar.f58065d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f58065d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f58063b <= i10) {
                i10 += bVar.f58065d;
            }
        }
        return i10;
    }

    void i() {
        int size = this.f58056c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f58057d.c(this.f58056c.get(i10));
        }
        x(this.f58056c);
        this.f58061h = 0;
    }

    void l(b bVar, int i10) {
        this.f58057d.b(bVar);
        int i11 = bVar.f58062a;
        if (i11 == 2) {
            this.f58057d.h(i10, bVar.f58065d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f58057d.e(i10, bVar.f58065d, bVar.f58064c);
        }
    }

    int n(int i10, int i11) {
        int size = this.f58056c.size();
        while (i11 < size) {
            b bVar = this.f58056c.get(i11);
            int i12 = bVar.f58062a;
            if (i12 == 8) {
                int i13 = bVar.f58063b;
                if (i13 == i10) {
                    i10 = bVar.f58065d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f58065d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f58063b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f58065d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f58065d;
                }
            }
            i11++;
        }
        return i10;
    }

    boolean o(int i10) {
        return (i10 & this.f58061h) != 0;
    }

    boolean p() {
        return this.f58055b.size() > 0;
    }

    boolean q() {
        return (this.f58056c.isEmpty() || this.f58055b.isEmpty()) ? false : true;
    }

    void w() {
        this.f58060g.b(this.f58055b);
        int size = this.f58055b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f58055b.get(i10);
            int i11 = bVar.f58062a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f58058e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f58055b.clear();
    }

    void y() {
        x(this.f58055b);
        x(this.f58056c);
        this.f58061h = 0;
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    void j() {
        i();
        int size = this.f58055b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f58055b.get(i10);
            int i11 = bVar.f58062a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            this.f58057d.c(bVar);
                            this.f58057d.a(bVar.f58063b, bVar.f58065d);
                        }
                    } else {
                        this.f58057d.c(bVar);
                        this.f58057d.e(bVar.f58063b, bVar.f58065d, bVar.f58064c);
                    }
                } else {
                    this.f58057d.c(bVar);
                    this.f58057d.h(bVar.f58063b, bVar.f58065d);
                }
            } else {
                this.f58057d.c(bVar);
                this.f58057d.g(bVar.f58063b, bVar.f58065d);
            }
            Runnable runnable = this.f58058e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f58055b);
        this.f58061h = 0;
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }
}
