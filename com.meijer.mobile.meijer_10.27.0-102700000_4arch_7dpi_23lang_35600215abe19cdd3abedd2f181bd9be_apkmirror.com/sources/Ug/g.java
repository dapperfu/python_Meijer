package Ug;

import java.util.Formatter;

/* loaded from: classes7.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final c f36034a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f36035b;

    final c a() {
        return this.f36034a;
    }

    final d b(int i10) {
        return this.f36035b[e(i10)];
    }

    final d[] d() {
        return this.f36035b;
    }

    final int e(int i10) {
        return i10 - this.f36034a.g();
    }

    final void f(int i10, d dVar) {
        this.f36035b[e(i10)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (d dVar : this.f36035b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                    i10++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    formatter.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    g(c cVar) {
        this.f36034a = new c(cVar);
        this.f36035b = new d[(cVar.e() - cVar.g()) + 1];
    }

    final d c(int i10) {
        d dVar;
        d dVar2;
        d dVarB = b(i10);
        if (dVarB != null) {
            return dVarB;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int iE = e(i10) - i11;
            if (iE >= 0 && (dVar2 = this.f36035b[iE]) != null) {
                return dVar2;
            }
            int iE2 = e(i10) + i11;
            d[] dVarArr = this.f36035b;
            if (iE2 < dVarArr.length && (dVar = dVarArr[iE2]) != null) {
                return dVar;
            }
        }
        return null;
    }
}
