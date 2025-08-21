package androidx.recyclerview.widget;

import Z.C;
import Z.n0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    final n0<RecyclerView.F, a> f58065a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    final C<RecyclerView.F> f58066b = new C<>();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static o2.f<a> f58067d = new o2.g(20);

        /* renamed from: a, reason: collision with root package name */
        int f58068a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.c f58069b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f58070c;

        static void c(a aVar) {
            aVar.f58068a = 0;
            aVar.f58069b = null;
            aVar.f58070c = null;
            f58067d.a(aVar);
        }

        static void a() {
            while (f58067d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f58067d.b();
            return aVarB == null ? new a() : aVarB;
        }

        private a() {
        }
    }

    interface b {
        void a(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.F f10);

        void c(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.F f10, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    RecyclerView.m.c n(RecyclerView.F f10) {
        return l(f10, 4);
    }

    private RecyclerView.m.c l(RecyclerView.F f10, int i10) {
        a aVarK;
        RecyclerView.m.c cVar;
        int iD = this.f58065a.d(f10);
        if (iD >= 0 && (aVarK = this.f58065a.k(iD)) != null) {
            int i11 = aVarK.f58068a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarK.f58068a = i12;
                if (i10 == 4) {
                    cVar = aVarK.f58069b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarK.f58070c;
                }
                if ((i12 & 12) == 0) {
                    this.f58065a.i(iD);
                    a.c(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f58065a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f58065a.put(f10, aVarB);
        }
        aVarB.f58068a |= 2;
        aVarB.f58069b = cVar;
    }

    void b(RecyclerView.F f10) {
        a aVarB = this.f58065a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f58065a.put(f10, aVarB);
        }
        aVarB.f58068a |= 1;
    }

    void c(long j10, RecyclerView.F f10) {
        this.f58066b.i(j10, f10);
    }

    void d(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f58065a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f58065a.put(f10, aVarB);
        }
        aVarB.f58070c = cVar;
        aVarB.f58068a |= 8;
    }

    void e(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f58065a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f58065a.put(f10, aVarB);
        }
        aVarB.f58069b = cVar;
        aVarB.f58068a |= 4;
    }

    void f() {
        this.f58065a.clear();
        this.f58066b.a();
    }

    RecyclerView.F g(long j10) {
        return this.f58066b.d(j10);
    }

    boolean h(RecyclerView.F f10) {
        a aVar = this.f58065a.get(f10);
        return (aVar == null || (aVar.f58068a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.F f10) {
        a aVar = this.f58065a.get(f10);
        return (aVar == null || (aVar.f58068a & 4) == 0) ? false : true;
    }

    RecyclerView.m.c m(RecyclerView.F f10) {
        return l(f10, 8);
    }

    void o(b bVar) {
        for (int size = this.f58065a.getSize() - 1; size >= 0; size--) {
            RecyclerView.F fG = this.f58065a.g(size);
            a aVarI = this.f58065a.i(size);
            int i10 = aVarI.f58068a;
            if ((i10 & 3) == 3) {
                bVar.b(fG);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = aVarI.f58069b;
                if (cVar == null) {
                    bVar.b(fG);
                } else {
                    bVar.c(fG, cVar, aVarI.f58070c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(fG, aVarI.f58069b, aVarI.f58070c);
            } else if ((i10 & 12) == 12) {
                bVar.d(fG, aVarI.f58069b, aVarI.f58070c);
            } else if ((i10 & 4) != 0) {
                bVar.c(fG, aVarI.f58069b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(fG, aVarI.f58069b, aVarI.f58070c);
            }
            a.c(aVarI);
        }
    }

    void p(RecyclerView.F f10) {
        a aVar = this.f58065a.get(f10);
        if (aVar == null) {
            return;
        }
        aVar.f58068a &= -2;
    }

    void q(RecyclerView.F f10) {
        int iM = this.f58066b.m() - 1;
        while (true) {
            if (iM < 0) {
                break;
            }
            if (f10 == this.f58066b.n(iM)) {
                this.f58066b.l(iM);
                break;
            }
            iM--;
        }
        a aVarRemove = this.f58065a.remove(f10);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }

    A() {
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.F f10) {
        p(f10);
    }
}
