package W1;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: k, reason: collision with root package name */
    ArrayList<m> f40634k;

    /* renamed from: l, reason: collision with root package name */
    private int f40635l;

    private V1.e r() {
        for (int i10 = 0; i10 < this.f40634k.size(); i10++) {
            m mVar = this.f40634k.get(i10);
            if (mVar.f40681b.O() != 8) {
                return mVar.f40681b;
            }
        }
        return null;
    }

    @Override // W1.m
    public void e() {
        for (int i10 = 0; i10 < this.f40634k.size(); i10++) {
            this.f40634k.get(i10).e();
        }
    }

    @Override // W1.m
    void f() {
        this.f40682c = null;
        Iterator<m> it = this.f40634k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    private void q() {
        V1.e eVar;
        V1.e eVar2 = this.f40681b;
        V1.e eVarH = eVar2.H(this.f40685f);
        while (true) {
            V1.e eVar3 = eVarH;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                eVarH = eVar2.H(this.f40685f);
            }
        }
        this.f40681b = eVar;
        this.f40634k.add(eVar.J(this.f40685f));
        V1.e eVarF = eVar.F(this.f40685f);
        while (eVarF != null) {
            this.f40634k.add(eVarF.J(this.f40685f));
            eVarF = eVarF.F(this.f40685f);
        }
        Iterator<m> it = this.f40634k.iterator();
        while (it.hasNext()) {
            m next = it.next();
            int i10 = this.f40685f;
            if (i10 == 0) {
                next.f40681b.f39488c = this;
            } else if (i10 == 1) {
                next.f40681b.f39490d = this;
            }
        }
        if (this.f40685f == 0 && ((V1.f) this.f40681b.G()).a1() && this.f40634k.size() > 1) {
            ArrayList<m> arrayList = this.f40634k;
            this.f40681b = arrayList.get(arrayList.size() - 1).f40681b;
        }
        this.f40635l = this.f40685f == 0 ? this.f40681b.x() : this.f40681b.L();
    }

    private V1.e s() {
        for (int size = this.f40634k.size() - 1; size >= 0; size--) {
            m mVar = this.f40634k.get(size);
            if (mVar.f40681b.O() != 8) {
                return mVar.f40681b;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e0 A[PHI: r2 r23 r24 r25
      0x01e0: PHI (r2v29 int) = (r2v25 int), (r2v34 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r23v1 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r24v1 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e0: PHI (r25v2 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e4 A[PHI: r23 r24 r25
      0x01e4: PHI (r23v3 int) = (r23v0 int), (r23v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r24v3 int) = (r24v0 int), (r24v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01e4: PHI (r25v3 int) = (r25v1 int), (r25v4 int) binds: [B:120:0x01de, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    @Override // W1.m, W1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(W1.d r27) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.c.a(W1.d):void");
    }

    @Override // W1.m
    void d() {
        Iterator<m> it = this.f40634k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f40634k.size();
        if (size < 1) {
            return;
        }
        V1.e eVar = this.f40634k.get(0).f40681b;
        V1.e eVar2 = this.f40634k.get(size - 1).f40681b;
        if (this.f40685f == 0) {
            V1.d dVar = eVar.f39459B;
            V1.d dVar2 = eVar2.f39461D;
            f fVarI = i(dVar, 0);
            int iC = dVar.c();
            V1.e eVarR = r();
            if (eVarR != null) {
                iC = eVarR.f39459B.c();
            }
            if (fVarI != null) {
                b(this.f40687h, fVarI, iC);
            }
            f fVarI2 = i(dVar2, 0);
            int iC2 = dVar2.c();
            V1.e eVarS = s();
            if (eVarS != null) {
                iC2 = eVarS.f39461D.c();
            }
            if (fVarI2 != null) {
                b(this.f40688i, fVarI2, -iC2);
            }
        } else {
            V1.d dVar3 = eVar.f39460C;
            V1.d dVar4 = eVar2.f39462E;
            f fVarI3 = i(dVar3, 1);
            int iC3 = dVar3.c();
            V1.e eVarR2 = r();
            if (eVarR2 != null) {
                iC3 = eVarR2.f39460C.c();
            }
            if (fVarI3 != null) {
                b(this.f40687h, fVarI3, iC3);
            }
            f fVarI4 = i(dVar4, 1);
            int iC4 = dVar4.c();
            V1.e eVarS2 = s();
            if (eVarS2 != null) {
                iC4 = eVarS2.f39462E.c();
            }
            if (fVarI4 != null) {
                b(this.f40688i, fVarI4, -iC4);
            }
        }
        this.f40687h.f40645a = this;
        this.f40688i.f40645a = this;
    }

    @Override // W1.m
    public long j() {
        int size = this.f40634k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = j10 + r4.f40687h.f40650f + this.f40634k.get(i10).j() + r4.f40688i.f40650f;
        }
        return j10;
    }

    @Override // W1.m
    boolean m() {
        int size = this.f40634k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f40634k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChainRun ");
        sb2.append(this.f40685f == 0 ? "horizontal : " : "vertical : ");
        String string = sb2.toString();
        Iterator<m> it = this.f40634k.iterator();
        while (it.hasNext()) {
            String str = string + "<";
            string = (str + it.next()) + "> ";
        }
        return string;
    }

    public c(V1.e eVar, int i10) {
        super(eVar);
        this.f40634k = new ArrayList<>();
        this.f40685f = i10;
        q();
    }
}
