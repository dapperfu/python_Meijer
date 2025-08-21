package Og;

/* loaded from: classes8.dex */
final class a implements g {
    public int c() {
        return 0;
    }

    a() {
    }

    private static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // Og.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f23733f) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f23733f), hVar.d().charAt(hVar.f23733f + 1)));
            hVar.f23733f += 2;
            return;
        }
        char c10 = hVar.c();
        int iN = j.n(hVar.d(), hVar.f23733f, c());
        if (iN != c()) {
            if (iN != 1) {
                if (iN != 2) {
                    if (iN != 3) {
                        if (iN != 4) {
                            if (iN == 5) {
                                hVar.r((char) 231);
                                hVar.o(5);
                                return;
                            } else {
                                throw new IllegalStateException("Illegal mode: " + iN);
                            }
                        }
                        hVar.r((char) 240);
                        hVar.o(4);
                        return;
                    }
                    hVar.r((char) 238);
                    hVar.o(3);
                    return;
                }
                hVar.r((char) 239);
                hVar.o(2);
                return;
            }
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (j.g(c10)) {
            hVar.r((char) 235);
            hVar.r((char) (c10 - 127));
            hVar.f23733f++;
        } else {
            hVar.r((char) (c10 + 1));
            hVar.f23733f++;
        }
    }
}
