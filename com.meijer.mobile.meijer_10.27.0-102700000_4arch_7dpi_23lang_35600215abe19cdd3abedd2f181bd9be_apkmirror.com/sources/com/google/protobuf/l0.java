package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes7.dex */
abstract class l0<T, B> {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f90571a = 100;

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, AbstractC11521g abstractC11521g);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(e0 e0Var);

    abstract T r(B b10);

    abstract void s(T t10, s0 s0Var) throws IOException;

    abstract void t(T t10, s0 s0Var) throws IOException;

    l0() {
    }

    private final void l(B b10, e0 e0Var, int i10) throws IOException {
        while (e0Var.A() != Integer.MAX_VALUE && m(b10, e0Var, i10)) {
        }
    }

    final boolean m(B b10, e0 e0Var, int i10) throws IOException {
        int iA = e0Var.a();
        int iA2 = r0.a(iA);
        int iB = r0.b(iA);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB != 4) {
                            if (iB == 5) {
                                a(b10, iA2, e0Var.u());
                                return true;
                            }
                            throw InvalidProtocolBufferException.e();
                        }
                        return false;
                    }
                    B bN = n();
                    int iC = r0.c(iA2, 4);
                    int i11 = i10 + 1;
                    if (i11 < f90571a) {
                        l(bN, e0Var, i11);
                        if (iC == e0Var.a()) {
                            c(b10, iA2, r(bN));
                            return true;
                        }
                        throw InvalidProtocolBufferException.b();
                    }
                    throw InvalidProtocolBufferException.i();
                }
                d(b10, iA2, e0Var.o());
                return true;
            }
            b(b10, iA2, e0Var.b());
            return true;
        }
        e(b10, iA2, e0Var.H());
        return true;
    }
}
