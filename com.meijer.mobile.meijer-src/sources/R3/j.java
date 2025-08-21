package R3;

import Ee.L;
import a3.t;
import a3.y;
import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import d3.D;
import x3.B;

/* loaded from: classes4.dex */
final class j {
    public static e3.b a(y yVar, String str) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            y.a aVarD = yVar.d(i10);
            if (aVarD instanceof e3.b) {
                e3.b bVar = (e3.b) aVarD;
                if (bVar.f129406a.equals(str)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    private static L3.i h(D d10, int i10) {
        String strC = null;
        String strC2 = null;
        int i11 = -1;
        int i12 = -1;
        while (d10.f() < i10) {
            int iF = d10.f();
            int iQ = d10.q();
            int iQ2 = d10.q();
            d10.X(4);
            if (iQ2 == 1835360622) {
                strC = d10.C(iQ - 12);
            } else if (iQ2 == 1851878757) {
                strC2 = d10.C(iQ - 12);
            } else {
                if (iQ2 == 1684108385) {
                    i11 = iF;
                    i12 = iQ;
                }
                d10.X(iQ - 12);
            }
        }
        if (strC == null || strC2 == null || i11 == -1) {
            return null;
        }
        d10.W(i11);
        d10.X(16);
        return new L3.k(strC, strC2, d10.C(i12 - 16));
    }

    public static void l(int i10, B b10, t.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.Z(b10.f170130a).a0(b10.f170131b);
        }
    }

    public static void m(int i10, y yVar, t.b bVar, y... yVarArr) {
        y yVar2 = new y(new y.a[0]);
        if (yVar != null) {
            for (int i11 = 0; i11 < yVar.e(); i11++) {
                y.a aVarD = yVar.d(i11);
                if (aVarD instanceof e3.b) {
                    e3.b bVar2 = (e3.b) aVarD;
                    if (!bVar2.f129406a.equals("com.android.capture.fps")) {
                        yVar2 = yVar2.a(bVar2);
                    } else if (i10 == 2) {
                        yVar2 = yVar2.a(bVar2);
                    }
                }
            }
        }
        for (y yVar3 : yVarArr) {
            yVar2 = yVar2.b(yVar3);
        }
        if (yVar2.e() > 0) {
            bVar.n0(yVar2);
        }
    }

    private static L3.e b(int i10, D d10) {
        int iQ = d10.q();
        if (d10.q() == 1684108385) {
            d10.X(8);
            String strC = d10.C(iQ - 16);
            return new L3.e("und", strC, strC);
        }
        d3.r.i("MetadataUtil", "Failed to parse comment attribute: " + e3.c.a(i10));
        return null;
    }

    private static L3.a c(D d10) {
        String str;
        int iQ = d10.q();
        if (d10.q() == 1684108385) {
            int iM = b.m(d10.q());
            if (iM == 13) {
                str = "image/jpeg";
            } else if (iM == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                d3.r.i("MetadataUtil", "Unrecognized cover art flags: " + iM);
                return null;
            }
            d10.X(4);
            int i10 = iQ - 16;
            byte[] bArr = new byte[i10];
            d10.l(bArr, 0, i10);
            return new L3.a(str, null, 3, bArr);
        }
        d3.r.i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static y.a d(D d10) {
        int iF = d10.f() + d10.q();
        int iQ = d10.q();
        int i10 = (iQ >> 24) & l3.f93323c;
        try {
            if (i10 != 169 && i10 != 253) {
                if (iQ == 1735291493) {
                    return j(d10);
                }
                if (iQ == 1684632427) {
                    return e(iQ, "TPOS", d10);
                }
                if (iQ == 1953655662) {
                    return e(iQ, "TRCK", d10);
                }
                if (iQ == 1953329263) {
                    return g(iQ, "TBPM", d10, true, false);
                }
                if (iQ == 1668311404) {
                    return g(iQ, "TCMP", d10, true, true);
                }
                if (iQ == 1668249202) {
                    return c(d10);
                }
                if (iQ == 1631670868) {
                    return k(iQ, "TPE2", d10);
                }
                if (iQ == 1936682605) {
                    return k(iQ, "TSOT", d10);
                }
                if (iQ == 1936679276) {
                    return k(iQ, "TSOA", d10);
                }
                if (iQ == 1936679282) {
                    return k(iQ, "TSOP", d10);
                }
                if (iQ == 1936679265) {
                    return k(iQ, "TSO2", d10);
                }
                if (iQ == 1936679791) {
                    return k(iQ, "TSOC", d10);
                }
                if (iQ == 1920233063) {
                    return g(iQ, "ITUNESADVISORY", d10, false, false);
                }
                if (iQ == 1885823344) {
                    return g(iQ, "ITUNESGAPLESS", d10, false, true);
                }
                if (iQ == 1936683886) {
                    return k(iQ, "TVSHOWSORT", d10);
                }
                if (iQ == 1953919848) {
                    return k(iQ, "TVSHOW", d10);
                }
                if (iQ == 757935405) {
                    return h(d10, iF);
                }
            } else {
                int i11 = 16777215 & iQ;
                if (i11 == 6516084) {
                    return b(iQ, d10);
                }
                if (i11 != 7233901 && i11 != 7631467) {
                    if (i11 != 6516589 && i11 != 7828084) {
                        if (i11 == 6578553) {
                            return k(iQ, "TDRC", d10);
                        }
                        if (i11 == 4280916) {
                            return k(iQ, "TPE1", d10);
                        }
                        if (i11 == 7630703) {
                            return k(iQ, "TSSE", d10);
                        }
                        if (i11 == 6384738) {
                            return k(iQ, "TALB", d10);
                        }
                        if (i11 == 7108978) {
                            return k(iQ, "USLT", d10);
                        }
                        if (i11 == 6776174) {
                            return k(iQ, "TCON", d10);
                        }
                        if (i11 == 6779504) {
                            return k(iQ, "TIT1", d10);
                        }
                    } else {
                        return k(iQ, "TCOM", d10);
                    }
                } else {
                    return k(iQ, "TIT2", d10);
                }
            }
            d3.r.b("MetadataUtil", "Skipped unknown metadata entry: " + e3.c.a(iQ));
            d10.W(iF);
            return null;
        } finally {
            d10.W(iF);
        }
    }

    private static L3.n e(int i10, String str, D d10) {
        int iQ = d10.q();
        if (d10.q() == 1684108385 && iQ >= 22) {
            d10.X(10);
            int iP = d10.P();
            if (iP > 0) {
                String str2 = "" + iP;
                int iP2 = d10.P();
                if (iP2 > 0) {
                    str2 = str2 + q2.f93563c + iP2;
                }
                return new L3.n(str, null, L.y(str2));
            }
        }
        d3.r.i("MetadataUtil", "Failed to parse index/count attribute: " + e3.c.a(i10));
        return null;
    }

    private static int f(D d10) {
        int iQ = d10.q();
        if (d10.q() == 1684108385) {
            d10.X(8);
            int i10 = iQ - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (d10.j() & 128) == 0) {
                            return d10.L();
                        }
                    } else {
                        return d10.K();
                    }
                } else {
                    return d10.P();
                }
            } else {
                return d10.H();
            }
        }
        d3.r.i("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static L3.i g(int i10, String str, D d10, boolean z10, boolean z11) {
        int iF = f(d10);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            if (z10) {
                return new L3.n(str, null, L.y(Integer.toString(iF)));
            }
            return new L3.e("und", str, Integer.toString(iF));
        }
        d3.r.i("MetadataUtil", "Failed to parse uint8 attribute: " + e3.c.a(i10));
        return null;
    }

    public static e3.b i(D d10, int i10, String str) {
        while (true) {
            int iF = d10.f();
            if (iF < i10) {
                int iQ = d10.q();
                if (d10.q() == 1684108385) {
                    int iQ2 = d10.q();
                    int iQ3 = d10.q();
                    int i11 = iQ - 16;
                    byte[] bArr = new byte[i11];
                    d10.l(bArr, 0, i11);
                    return new e3.b(str, bArr, iQ3, iQ2);
                }
                d10.W(iF + iQ);
            } else {
                return null;
            }
        }
    }

    private static L3.n j(D d10) {
        String strA = L3.j.a(f(d10) - 1);
        if (strA != null) {
            return new L3.n("TCON", null, L.y(strA));
        }
        d3.r.i("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static L3.n k(int i10, String str, D d10) {
        int iQ = d10.q();
        if (d10.q() == 1684108385) {
            d10.X(8);
            return new L3.n(str, null, L.y(d10.C(iQ - 16)));
        }
        d3.r.i("MetadataUtil", "Failed to parse text attribute: " + e3.c.a(i10));
        return null;
    }
}
