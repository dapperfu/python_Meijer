package Sg;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* loaded from: classes7.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final Gg.a f33638a;

    /* renamed from: b, reason: collision with root package name */
    private final m f33639b = new m();

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f33640c = new StringBuilder();

    private n b(int i10) {
        char c10;
        int iF = f(i10, 5);
        if (iF == 15) {
            return new n(i10 + 5, '$');
        }
        if (iF >= 5 && iF < 15) {
            return new n(i10 + 5, (char) (iF + 43));
        }
        int iF2 = f(i10, 6);
        if (iF2 >= 32 && iF2 < 58) {
            return new n(i10 + 6, (char) (iF2 + 33));
        }
        switch (iF2) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + iF2);
        }
        return new n(i10 + 6, c10);
    }

    private n d(int i10) throws FormatException {
        int iF = f(i10, 5);
        if (iF == 15) {
            return new n(i10 + 5, '$');
        }
        char c10 = '+';
        if (iF >= 5 && iF < 15) {
            return new n(i10 + 5, (char) (iF + 43));
        }
        int iF2 = f(i10, 7);
        if (iF2 >= 64 && iF2 < 90) {
            return new n(i10 + 7, (char) (iF2 + 1));
        }
        if (iF2 >= 90 && iF2 < 116) {
            return new n(i10 + 7, (char) (iF2 + 7));
        }
        switch (f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw FormatException.a();
        }
        return new n(i10 + 8, c10);
    }

    static int g(Gg.a aVar, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (aVar.g(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    String a(StringBuilder sb2, int i10) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            o oVarC = c(i10, str);
            String strA = r.a(oVarC.b());
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = oVarC.d() ? String.valueOf(oVarC.c()) : null;
            if (i10 == oVarC.a()) {
                return sb2.toString();
            }
            i10 = oVarC.a();
            str = strValueOf;
        }
    }

    private p e(int i10) throws FormatException {
        int i11 = i10 + 7;
        if (i11 > this.f33638a.l()) {
            int iF = f(i10, 4);
            return iF == 0 ? new p(this.f33638a.l(), 10, 10) : new p(this.f33638a.l(), iF - 1, 10);
        }
        int iF2 = f(i10, 7) - 8;
        return new p(i11, iF2 / 11, iF2 % 11);
    }

    private boolean h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f33638a.l()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f33638a.g(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private boolean i(int i10) {
        int i11;
        if (i10 + 1 > this.f33638a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f33638a.l(); i12++) {
            if (i12 == 2) {
                if (!this.f33638a.g(i10 + 2)) {
                    return false;
                }
            } else if (this.f33638a.g(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean j(int i10) {
        int i11;
        if (i10 + 1 > this.f33638a.l()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f33638a.l(); i12++) {
            if (this.f33638a.g(i11)) {
                return false;
            }
        }
        return true;
    }

    private boolean k(int i10) {
        int iF;
        if (i10 + 5 > this.f33638a.l()) {
            return false;
        }
        int iF2 = f(i10, 5);
        if (iF2 < 5 || iF2 >= 16) {
            return i10 + 6 <= this.f33638a.l() && (iF = f(i10, 6)) >= 16 && iF < 63;
        }
        return true;
    }

    private boolean l(int i10) {
        int iF;
        if (i10 + 5 > this.f33638a.l()) {
            return false;
        }
        int iF2 = f(i10, 5);
        if (iF2 >= 5 && iF2 < 16) {
            return true;
        }
        if (i10 + 7 > this.f33638a.l()) {
            return false;
        }
        int iF3 = f(i10, 7);
        if (iF3 < 64 || iF3 >= 116) {
            return i10 + 8 <= this.f33638a.l() && (iF = f(i10, 8)) >= 232 && iF < 253;
        }
        return true;
    }

    private boolean m(int i10) {
        if (i10 + 7 > this.f33638a.l()) {
            return i10 + 4 <= this.f33638a.l();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f33638a.g(i12);
            }
            if (this.f33638a.g(i11)) {
                return true;
            }
            i11++;
        }
    }

    private l n() {
        while (k(this.f33639b.a())) {
            n nVarB = b(this.f33639b.a());
            this.f33639b.h(nVarB.a());
            if (nVarB.c()) {
                return new l(new o(this.f33639b.a(), this.f33640c.toString()), true);
            }
            this.f33640c.append(nVarB.b());
        }
        if (h(this.f33639b.a())) {
            this.f33639b.b(3);
            this.f33639b.g();
        } else if (i(this.f33639b.a())) {
            if (this.f33639b.a() + 5 < this.f33638a.l()) {
                this.f33639b.b(5);
            } else {
                this.f33639b.h(this.f33638a.l());
            }
            this.f33639b.f();
        }
        return new l();
    }

    private o o() throws FormatException {
        l lVarQ;
        boolean zB;
        do {
            int iA = this.f33639b.a();
            if (this.f33639b.c()) {
                lVarQ = n();
                zB = lVarQ.b();
            } else if (this.f33639b.d()) {
                lVarQ = p();
                zB = lVarQ.b();
            } else {
                lVarQ = q();
                zB = lVarQ.b();
            }
            if (iA == this.f33639b.a() && !zB) {
                break;
            }
        } while (!zB);
        return lVarQ.a();
    }

    private l p() throws FormatException {
        while (l(this.f33639b.a())) {
            n nVarD = d(this.f33639b.a());
            this.f33639b.h(nVarD.a());
            if (nVarD.c()) {
                return new l(new o(this.f33639b.a(), this.f33640c.toString()), true);
            }
            this.f33640c.append(nVarD.b());
        }
        if (h(this.f33639b.a())) {
            this.f33639b.b(3);
            this.f33639b.g();
        } else if (i(this.f33639b.a())) {
            if (this.f33639b.a() + 5 < this.f33638a.l()) {
                this.f33639b.b(5);
            } else {
                this.f33639b.h(this.f33638a.l());
            }
            this.f33639b.e();
        }
        return new l();
    }

    private l q() throws FormatException {
        while (m(this.f33639b.a())) {
            p pVarE = e(this.f33639b.a());
            this.f33639b.h(pVarE.a());
            if (pVarE.d()) {
                return new l(pVarE.e() ? new o(this.f33639b.a(), this.f33640c.toString()) : new o(this.f33639b.a(), this.f33640c.toString(), pVarE.c()), true);
            }
            this.f33640c.append(pVarE.b());
            if (pVarE.e()) {
                return new l(new o(this.f33639b.a(), this.f33640c.toString()), true);
            }
            this.f33640c.append(pVarE.c());
        }
        if (j(this.f33639b.a())) {
            this.f33639b.e();
            this.f33639b.b(4);
        }
        return new l();
    }

    o c(int i10, String str) throws FormatException {
        this.f33640c.setLength(0);
        if (str != null) {
            this.f33640c.append(str);
        }
        this.f33639b.h(i10);
        o oVarO = o();
        return (oVarO == null || !oVarO.d()) ? new o(this.f33639b.a(), this.f33640c.toString()) : new o(this.f33639b.a(), this.f33640c.toString(), oVarO.c());
    }

    int f(int i10, int i11) {
        return g(this.f33638a, i10, i11);
    }

    s(Gg.a aVar) {
        this.f33638a = aVar;
    }
}
