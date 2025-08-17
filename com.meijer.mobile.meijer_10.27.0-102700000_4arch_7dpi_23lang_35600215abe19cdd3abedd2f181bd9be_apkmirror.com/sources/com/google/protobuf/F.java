package com.google.protobuf;

import com.google.protobuf.C11538y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
abstract class F {

    /* renamed from: a, reason: collision with root package name */
    private static final F f90432a;

    /* renamed from: b, reason: collision with root package name */
    private static final F f90433b;

    private static final class b extends F {

        /* renamed from: c, reason: collision with root package name */
        private static final Class<?> f90434c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        @Override // com.google.protobuf.F
        <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) p0.C(obj, j10);
        }

        private static <L> List<L> g(Object obj, long j10, int i10) {
            List<L> arrayList;
            List<L> listF = f(obj, j10);
            if (listF.isEmpty()) {
                if (listF instanceof E) {
                    arrayList = new D(i10);
                } else if ((listF instanceof Z) && (listF instanceof C11538y.i)) {
                    arrayList = ((C11538y.i) listF).b2(i10);
                } else {
                    arrayList = new ArrayList<>(i10);
                }
                p0.R(obj, j10, arrayList);
                return arrayList;
            }
            if (f90434c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList2 = new ArrayList(listF.size() + i10);
                arrayList2.addAll(listF);
                p0.R(obj, j10, arrayList2);
                return arrayList2;
            }
            if (listF instanceof o0) {
                D d10 = new D(listF.size() + i10);
                d10.addAll((o0) listF);
                p0.R(obj, j10, d10);
                return d10;
            }
            if ((listF instanceof Z) && (listF instanceof C11538y.i)) {
                C11538y.i iVar = (C11538y.i) listF;
                if (!iVar.j()) {
                    C11538y.i iVarB2 = iVar.b2(listF.size() + i10);
                    p0.R(obj, j10, iVarB2);
                    return iVarB2;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.F
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) p0.C(obj, j10);
            if (list instanceof E) {
                objUnmodifiableList = ((E) list).J();
            } else if (!f90434c.isAssignableFrom(list.getClass())) {
                if ((list instanceof Z) && (list instanceof C11538y.i)) {
                    C11538y.i iVar = (C11538y.i) list;
                    if (iVar.j()) {
                        iVar.d();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            } else {
                return;
            }
            p0.R(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.F
        <E> void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            p0.R(obj, j10, listF);
        }
    }

    abstract void c(Object obj, long j10);

    abstract <L> void d(Object obj, Object obj2, long j10);

    abstract <L> List<L> e(Object obj, long j10);

    private static final class c extends F {
        private c() {
            super();
        }

        static <E> C11538y.i<E> f(Object obj, long j10) {
            return (C11538y.i) p0.C(obj, j10);
        }

        @Override // com.google.protobuf.F
        void c(Object obj, long j10) {
            f(obj, j10).d();
        }

        @Override // com.google.protobuf.F
        <E> void d(Object obj, Object obj2, long j10) {
            C11538y.i iVarF = f(obj, j10);
            C11538y.i iVarF2 = f(obj2, j10);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.j()) {
                    iVarF = iVarF.b2(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            p0.R(obj, j10, iVarF2);
        }

        @Override // com.google.protobuf.F
        <L> List<L> e(Object obj, long j10) {
            int i10;
            C11538y.i iVarF = f(obj, j10);
            if (!iVarF.j()) {
                int size = iVarF.size();
                if (size == 0) {
                    i10 = 10;
                } else {
                    i10 = size * 2;
                }
                C11538y.i iVarB2 = iVarF.b2(i10);
                p0.R(obj, j10, iVarB2);
                return iVarB2;
            }
            return iVarF;
        }
    }

    static {
        f90432a = new b();
        f90433b = new c();
    }

    private F() {
    }

    static F a() {
        return f90432a;
    }

    static F b() {
        return f90433b;
    }
}
