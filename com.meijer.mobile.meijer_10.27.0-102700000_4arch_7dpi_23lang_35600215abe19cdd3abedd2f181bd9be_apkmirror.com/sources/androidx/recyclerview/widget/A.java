package androidx.recyclerview.widget;

import Z.C;
import Z.n0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
class A {

    /* renamed from: a, reason: collision with root package name */
    final n0<RecyclerView.F, a> f57841a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    final C<RecyclerView.F> f57842b = new C<>();

    static class a {

        /* renamed from: d, reason: collision with root package name */
        static o2.f<a> f57843d = new o2.g(20);

        /* renamed from: a, reason: collision with root package name */
        int f57844a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView.m.c f57845b;

        /* renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f57846c;

        static void c(a aVar) {
            aVar.f57844a = 0;
            aVar.f57845b = null;
            aVar.f57846c = null;
            f57843d.a(aVar);
        }

        static void a() {
            while (f57843d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f57843d.b();
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
        int iD = this.f57841a.d(f10);
        if (iD >= 0 && (aVarK = this.f57841a.k(iD)) != null) {
            int i11 = aVarK.f57844a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVarK.f57844a = i12;
                if (i10 == 4) {
                    cVar = aVarK.f57845b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarK.f57846c;
                }
                if ((i12 & 12) == 0) {
                    this.f57841a.i(iD);
                    a.c(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f57841a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f57841a.put(f10, aVarB);
        }
        aVarB.f57844a |= 2;
        aVarB.f57845b = cVar;
    }

    void b(RecyclerView.F f10) {
        a aVarB = this.f57841a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f57841a.put(f10, aVarB);
        }
        aVarB.f57844a |= 1;
    }

    void c(long j10, RecyclerView.F f10) {
        this.f57842b.i(j10, f10);
    }

    void d(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f57841a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f57841a.put(f10, aVarB);
        }
        aVarB.f57846c = cVar;
        aVarB.f57844a |= 8;
    }

    void e(RecyclerView.F f10, RecyclerView.m.c cVar) {
        a aVarB = this.f57841a.get(f10);
        if (aVarB == null) {
            aVarB = a.b();
            this.f57841a.put(f10, aVarB);
        }
        aVarB.f57845b = cVar;
        aVarB.f57844a |= 4;
    }

    void f() {
        this.f57841a.clear();
        this.f57842b.a();
    }

    RecyclerView.F g(long j10) {
        return this.f57842b.d(j10);
    }

    boolean h(RecyclerView.F f10) {
        a aVar = this.f57841a.get(f10);
        return (aVar == null || (aVar.f57844a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.F f10) {
        a aVar = this.f57841a.get(f10);
        return (aVar == null || (aVar.f57844a & 4) == 0) ? false : true;
    }

    RecyclerView.m.c m(RecyclerView.F f10) {
        return l(f10, 8);
    }

    void o(b bVar) {
        for (int size = this.f57841a.getSize() - 1; size >= 0; size--) {
            RecyclerView.F fG = this.f57841a.g(size);
            a aVarI = this.f57841a.i(size);
            int i10 = aVarI.f57844a;
            if ((i10 & 3) == 3) {
                bVar.b(fG);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = aVarI.f57845b;
                if (cVar == null) {
                    bVar.b(fG);
                } else {
                    bVar.c(fG, cVar, aVarI.f57846c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(fG, aVarI.f57845b, aVarI.f57846c);
            } else if ((i10 & 12) == 12) {
                bVar.d(fG, aVarI.f57845b, aVarI.f57846c);
            } else if ((i10 & 4) != 0) {
                bVar.c(fG, aVarI.f57845b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(fG, aVarI.f57845b, aVarI.f57846c);
            }
            a.c(aVarI);
        }
    }

    void p(RecyclerView.F f10) {
        a aVar = this.f57841a.get(f10);
        if (aVar == null) {
            return;
        }
        aVar.f57844a &= -2;
    }

    void q(RecyclerView.F f10) {
        int iM = this.f57842b.m() - 1;
        while (true) {
            if (iM < 0) {
                break;
            }
            if (f10 == this.f57842b.n(iM)) {
                this.f57842b.l(iM);
                break;
            }
            iM--;
        }
        a aVarRemove = this.f57841a.remove(f10);
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
