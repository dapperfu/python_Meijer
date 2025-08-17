package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* loaded from: classes7.dex */
class n0 extends l0<m0, m0> {
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    boolean q(e0 e0Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m0 m0Var, int i10, int i11) {
        m0Var.n(q0.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m0 m0Var, int i10, long j10) {
        m0Var.n(q0.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m0 m0Var, int i10, m0 m0Var2) {
        m0Var.n(q0.c(i10, 3), m0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m0 m0Var, int i10, AbstractC11312h abstractC11312h) {
        m0Var.n(q0.c(i10, 2), abstractC11312h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m0 m0Var, int i10, long j10) {
        m0Var.n(q0.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m0 g(Object obj) {
        return ((AbstractC11327x) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m0 m0Var) {
        ((AbstractC11327x) obj).unknownFields = m0Var;
    }

    n0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m0 m0Var) {
        return m0Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m0 m0Var) {
        return m0Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m0 k(m0 m0Var, m0 m0Var2) {
        if (m0.c().equals(m0Var2)) {
            return m0Var;
        }
        if (m0.c().equals(m0Var)) {
            return m0.j(m0Var, m0Var2);
        }
        return m0Var.i(m0Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m0 n() {
        return m0.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m0 r(m0 m0Var) {
        m0Var.h();
        return m0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m0 m0Var, r0 r0Var) throws IOException {
        m0Var.p(r0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m0 m0Var, r0 r0Var) throws IOException {
        m0Var.r(r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.l0
    void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.l0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m0 f(Object obj) {
        m0 m0VarG = g(obj);
        if (m0VarG == m0.c()) {
            m0 m0VarK = m0.k();
            p(obj, m0VarK);
            return m0VarK;
        }
        return m0VarG;
    }
}
