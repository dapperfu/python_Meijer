package V1;

import V1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: i1, reason: collision with root package name */
    private e[] f36724i1;

    /* renamed from: L0, reason: collision with root package name */
    private int f36701L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    private int f36702M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    private int f36703N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    private int f36704O0 = -1;

    /* renamed from: P0, reason: collision with root package name */
    private int f36705P0 = -1;

    /* renamed from: Q0, reason: collision with root package name */
    private int f36706Q0 = -1;

    /* renamed from: R0, reason: collision with root package name */
    private float f36707R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    private float f36708S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    private float f36709T0 = 0.5f;

    /* renamed from: U0, reason: collision with root package name */
    private float f36710U0 = 0.5f;

    /* renamed from: V0, reason: collision with root package name */
    private float f36711V0 = 0.5f;

    /* renamed from: W0, reason: collision with root package name */
    private float f36712W0 = 0.5f;

    /* renamed from: X0, reason: collision with root package name */
    private int f36713X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    private int f36714Y0 = 0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f36715Z0 = 2;

    /* renamed from: a1, reason: collision with root package name */
    private int f36716a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    private int f36717b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    private int f36718c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    private int f36719d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    private ArrayList<a> f36720e1 = new ArrayList<>();

    /* renamed from: f1, reason: collision with root package name */
    private e[] f36721f1 = null;

    /* renamed from: g1, reason: collision with root package name */
    private e[] f36722g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    private int[] f36723h1 = null;

    /* renamed from: j1, reason: collision with root package name */
    private int f36725j1 = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f36726a;

        /* renamed from: d, reason: collision with root package name */
        private d f36729d;

        /* renamed from: e, reason: collision with root package name */
        private d f36730e;

        /* renamed from: f, reason: collision with root package name */
        private d f36731f;

        /* renamed from: g, reason: collision with root package name */
        private d f36732g;

        /* renamed from: h, reason: collision with root package name */
        private int f36733h;

        /* renamed from: i, reason: collision with root package name */
        private int f36734i;

        /* renamed from: j, reason: collision with root package name */
        private int f36735j;

        /* renamed from: k, reason: collision with root package name */
        private int f36736k;

        /* renamed from: q, reason: collision with root package name */
        private int f36742q;

        /* renamed from: b, reason: collision with root package name */
        private e f36727b = null;

        /* renamed from: c, reason: collision with root package name */
        int f36728c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f36737l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f36738m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f36739n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f36740o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f36741p = 0;

        private void h() {
            this.f36737l = 0;
            this.f36738m = 0;
            this.f36727b = null;
            this.f36728c = 0;
            int i10 = this.f36740o;
            for (int i11 = 0; i11 < i10 && this.f36739n + i11 < g.this.f36725j1; i11++) {
                e eVar = g.this.f36724i1[this.f36739n + i11];
                if (this.f36726a == 0) {
                    int iP = eVar.P();
                    int i12 = g.this.f36713X0;
                    if (eVar.O() == 8) {
                        i12 = 0;
                    }
                    this.f36737l += iP + i12;
                    int iA1 = g.this.A1(eVar, this.f36742q);
                    if (this.f36727b == null || this.f36728c < iA1) {
                        this.f36727b = eVar;
                        this.f36728c = iA1;
                        this.f36738m = iA1;
                    }
                } else {
                    int iB1 = g.this.B1(eVar, this.f36742q);
                    int iA12 = g.this.A1(eVar, this.f36742q);
                    int i13 = g.this.f36714Y0;
                    if (eVar.O() == 8) {
                        i13 = 0;
                    }
                    this.f36738m += iA12 + i13;
                    if (this.f36727b == null || this.f36728c < iB1) {
                        this.f36727b = eVar;
                        this.f36728c = iB1;
                        this.f36737l = iB1;
                    }
                }
            }
        }

        public void c() {
            this.f36728c = 0;
            this.f36727b = null;
            this.f36737l = 0;
            this.f36738m = 0;
            this.f36739n = 0;
            this.f36740o = 0;
            this.f36741p = 0;
        }

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f36733h = 0;
            this.f36734i = 0;
            this.f36735j = 0;
            this.f36736k = 0;
            this.f36742q = 0;
            this.f36726a = i10;
            this.f36729d = dVar;
            this.f36730e = dVar2;
            this.f36731f = dVar3;
            this.f36732g = dVar4;
            this.f36733h = g.this.P0();
            this.f36734i = g.this.R0();
            this.f36735j = g.this.Q0();
            this.f36736k = g.this.O0();
            this.f36742q = i11;
        }

        public void b(e eVar) {
            if (this.f36726a == 0) {
                int iB1 = g.this.B1(eVar, this.f36742q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f36741p++;
                    iB1 = 0;
                }
                this.f36737l += iB1 + (eVar.O() != 8 ? g.this.f36713X0 : 0);
                int iA1 = g.this.A1(eVar, this.f36742q);
                if (this.f36727b == null || this.f36728c < iA1) {
                    this.f36727b = eVar;
                    this.f36728c = iA1;
                    this.f36738m = iA1;
                }
            } else {
                int iB12 = g.this.B1(eVar, this.f36742q);
                int iA12 = g.this.A1(eVar, this.f36742q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f36741p++;
                    iA12 = 0;
                }
                this.f36738m += iA12 + (eVar.O() != 8 ? g.this.f36714Y0 : 0);
                if (this.f36727b == null || this.f36728c < iB12) {
                    this.f36727b = eVar;
                    this.f36728c = iB12;
                    this.f36737l = iB12;
                }
            }
            this.f36740o++;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            int i12 = this.f36740o;
            for (int i13 = 0; i13 < i12 && this.f36739n + i13 < g.this.f36725j1; i13++) {
                e eVar2 = g.this.f36724i1[this.f36739n + i13];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i12 == 0 || this.f36727b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f36739n + i17 >= g.this.f36725j1) {
                    break;
                }
                if (g.this.f36724i1[this.f36739n + i17].O() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar3 = null;
            if (this.f36726a != 0) {
                e eVar4 = this.f36727b;
                eVar4.j0(g.this.f36701L0);
                int i18 = this.f36733h;
                if (i10 > 0) {
                    i18 += g.this.f36713X0;
                }
                if (z10) {
                    eVar4.f36601D.a(this.f36731f, i18);
                    if (z11) {
                        eVar4.f36599B.a(this.f36729d, this.f36735j);
                    }
                    if (i10 > 0) {
                        this.f36731f.f36580b.f36599B.a(eVar4.f36601D, 0);
                    }
                } else {
                    eVar4.f36599B.a(this.f36729d, i18);
                    if (z11) {
                        eVar4.f36601D.a(this.f36731f, this.f36735j);
                    }
                    if (i10 > 0) {
                        this.f36729d.f36580b.f36601D.a(eVar4.f36599B, 0);
                    }
                }
                int i19 = 0;
                while (i19 < i12 && this.f36739n + i19 < g.this.f36725j1) {
                    e eVar5 = g.this.f36724i1[this.f36739n + i19];
                    if (i19 == 0) {
                        eVar5.j(eVar5.f36600C, this.f36730e, this.f36734i);
                        int i20 = g.this.f36702M0;
                        float f10 = g.this.f36708S0;
                        if (this.f36739n == 0 && g.this.f36704O0 != -1) {
                            i20 = g.this.f36704O0;
                            f10 = g.this.f36710U0;
                        } else if (z11 && g.this.f36706Q0 != -1) {
                            i20 = g.this.f36706Q0;
                            f10 = g.this.f36712W0;
                        }
                        eVar5.y0(i20);
                        eVar5.x0(f10);
                    }
                    if (i19 == i12 - 1) {
                        eVar5.j(eVar5.f36602E, this.f36732g, this.f36736k);
                    }
                    if (eVar3 != null) {
                        eVar5.f36600C.a(eVar3.f36602E, g.this.f36714Y0);
                        if (i19 == i14) {
                            eVar5.f36600C.n(this.f36734i);
                        }
                        eVar3.f36602E.a(eVar5.f36600C, 0);
                        if (i19 == i15 + 1) {
                            eVar3.f36602E.n(this.f36736k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z10) {
                            int i21 = g.this.f36715Z0;
                            if (i21 == 0) {
                                eVar5.f36601D.a(eVar4.f36601D, 0);
                            } else if (i21 == 1) {
                                eVar5.f36599B.a(eVar4.f36599B, 0);
                            } else if (i21 == 2) {
                                eVar5.f36599B.a(eVar4.f36599B, 0);
                                eVar5.f36601D.a(eVar4.f36601D, 0);
                            }
                        } else {
                            int i22 = g.this.f36715Z0;
                            if (i22 == 0) {
                                eVar5.f36599B.a(eVar4.f36599B, 0);
                            } else if (i22 == 1) {
                                eVar5.f36601D.a(eVar4.f36601D, 0);
                            } else if (i22 == 2) {
                                if (z12) {
                                    eVar5.f36599B.a(this.f36729d, this.f36733h);
                                    eVar5.f36601D.a(this.f36731f, this.f36735j);
                                } else {
                                    eVar5.f36599B.a(eVar4.f36599B, 0);
                                    eVar5.f36601D.a(eVar4.f36601D, 0);
                                }
                            }
                        }
                    }
                    i19++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f36727b;
            eVar6.y0(g.this.f36702M0);
            int i23 = this.f36734i;
            if (i10 > 0) {
                i23 += g.this.f36714Y0;
            }
            eVar6.f36600C.a(this.f36730e, i23);
            if (z11) {
                eVar6.f36602E.a(this.f36732g, this.f36736k);
            }
            if (i10 > 0) {
                this.f36730e.f36580b.f36602E.a(eVar6.f36600C, 0);
            }
            if (g.this.f36716a1 != 3 || eVar6.S()) {
                eVar = eVar6;
            } else {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f36739n + i25 >= g.this.f36725j1) {
                        break;
                    }
                    eVar = g.this.f36724i1[this.f36739n + i25];
                    if (eVar.S()) {
                        break;
                    }
                }
                eVar = eVar6;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f36739n + i27 >= g.this.f36725j1) {
                    return;
                }
                e eVar7 = g.this.f36724i1[this.f36739n + i27];
                if (i26 == 0) {
                    i11 = 1;
                    eVar7.j(eVar7.f36599B, this.f36729d, this.f36733h);
                } else {
                    i11 = 1;
                }
                if (i27 == 0) {
                    int i28 = g.this.f36701L0;
                    float f11 = g.this.f36707R0;
                    if (this.f36739n == 0 && g.this.f36703N0 != -1) {
                        i28 = g.this.f36703N0;
                        f11 = g.this.f36709T0;
                    } else if (z11 && g.this.f36705P0 != -1) {
                        i28 = g.this.f36705P0;
                        f11 = g.this.f36711V0;
                    }
                    eVar7.j0(i28);
                    eVar7.i0(f11);
                }
                if (i26 == i12 - 1) {
                    eVar7.j(eVar7.f36601D, this.f36731f, this.f36735j);
                }
                if (eVar3 != null) {
                    eVar7.f36599B.a(eVar3.f36601D, g.this.f36713X0);
                    if (i26 == i14) {
                        eVar7.f36599B.n(this.f36733h);
                    }
                    eVar3.f36601D.a(eVar7.f36599B, 0);
                    if (i26 == i15 + 1) {
                        eVar3.f36601D.n(this.f36735j);
                    }
                }
                if (eVar7 != eVar6) {
                    c10 = 3;
                    if (g.this.f36716a1 == 3 && eVar.S() && eVar7 != eVar && eVar7.S()) {
                        eVar7.f36603F.a(eVar.f36603F, 0);
                    } else {
                        int i29 = g.this.f36716a1;
                        if (i29 == 0) {
                            eVar7.f36600C.a(eVar6.f36600C, 0);
                        } else if (i29 == i11) {
                            eVar7.f36602E.a(eVar6.f36602E, 0);
                        } else if (z12) {
                            eVar7.f36600C.a(this.f36730e, this.f36734i);
                            eVar7.f36602E.a(this.f36732g, this.f36736k);
                        } else {
                            eVar7.f36600C.a(eVar6.f36600C, 0);
                            eVar7.f36602E.a(eVar6.f36602E, 0);
                        }
                    }
                } else {
                    c10 = 3;
                }
                i26++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f36726a == 1 ? this.f36738m - g.this.f36714Y0 : this.f36738m;
        }

        public int f() {
            return this.f36726a == 0 ? this.f36737l - g.this.f36713X0 : this.f36737l;
        }

        public void g(int i10) {
            int i11 = this.f36741p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f36740o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f36739n + i14 < g.this.f36725j1; i14++) {
                e eVar = g.this.f36724i1[this.f36739n + i14];
                if (this.f36726a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f36646l == 0) {
                        g.this.T0(eVar, e.b.FIXED, i13, eVar.M(), eVar.v());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f36648m == 0) {
                    int i15 = i13;
                    g.this.T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f36739n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f36726a = i10;
            this.f36729d = dVar;
            this.f36730e = dVar2;
            this.f36731f = dVar3;
            this.f36732g = dVar4;
            this.f36733h = i11;
            this.f36734i = i12;
            this.f36735j = i13;
            this.f36736k = i14;
            this.f36742q = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f36648m;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f36662t * i10);
                if (i12 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.v();
            }
            if (i11 == 3) {
                return (int) ((eVar2.P() * eVar2.f36614Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B1(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f36646l;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f36656q * i10);
                if (i12 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i12, eVar.M(), eVar.v());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.P();
            }
            if (i11 == 3) {
                return (int) ((eVar2.v() * eVar2.f36614Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void C1(V1.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.g.C1(V1.e[], int, int, int, int[]):void");
    }

    private void D1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f36720e1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.f36599B, gVar2.f36600C, gVar2.f36601D, gVar2.f36602E, i16);
        gVar2.f36720e1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int iB1 = gVar2.B1(eVar, i16);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f36713X0 + i17) + iB1 > i16) && aVar.f36727b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f36718c1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.f36599B, gVar2.f36600C, gVar2.f36601D, gVar2.f36602E, i16);
                    aVar.i(i18);
                    gVar2.f36720e1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += gVar2.f36713X0 + iB1;
                    }
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = iB1;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int iA1 = gVar2.A1(eVar2, i16);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f36714Y0 + i20) + iA1 > i16) && aVar.f36727b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f36718c1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.f36599B, gVar2.f36600C, gVar2.f36601D, gVar2.f36602E, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f36720e1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f36714Y0 + iA1;
                    }
                    aVar.b(eVar2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    gVar2 = gVar;
                }
                i20 = iA1;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f36720e1.size();
        d dVar2 = gVar3.f36599B;
        d dVar3 = gVar3.f36600C;
        d dVar4 = gVar3.f36601D;
        d dVar5 = gVar3.f36602E;
        int iP0 = gVar3.P0();
        int iR0 = gVar3.R0();
        int iQ0 = gVar3.Q0();
        int iO0 = gVar3.O0();
        e.b bVarY = gVar3.y();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z12 = bVarY == bVar || gVar3.M() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = gVar3.f36720e1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int iO02 = iO0;
        int i24 = 0;
        int iQ02 = iQ0;
        int i25 = iR0;
        int i26 = iP0;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = gVar3.f36720e1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = gVar3.f36720e1.get(i28 + 1).f36727b.f36600C;
                    iO02 = 0;
                } else {
                    dVar7 = gVar3.f36602E;
                    iO02 = gVar3.O0();
                }
                d dVar10 = aVar3.f36727b.f36602E;
                int i29 = i27;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ02, iO02, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += gVar3.f36714Y0;
                }
                i27 = iE;
                i24 = iMax;
                dVar9 = dVar10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    dVar = gVar3.f36720e1.get(i28 + 1).f36727b.f36599B;
                    iQ02 = 0;
                } else {
                    dVar = gVar3.f36601D;
                    iQ02 = gVar3.Q0();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f36727b.f36601D;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i26, i25, iQ02, iO02, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += gVar3.f36713X0;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void E1(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f36720e1.size() == 0) {
            aVar = new a(i11, this.f36599B, this.f36600C, this.f36601D, this.f36602E, i12);
            this.f36720e1.add(aVar);
        } else {
            a aVar2 = this.f36720e1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f36599B, this.f36600C, this.f36601D, this.f36602E, P0(), R0(), Q0(), O0(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    private void z1(boolean z10) {
        e eVar;
        if (this.f36723h1 == null || this.f36722g1 == null || this.f36721f1 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f36725j1; i10++) {
            this.f36724i1[i10].Z();
        }
        int[] iArr = this.f36723h1;
        int i11 = iArr[0];
        int i12 = iArr[1];
        e eVar2 = null;
        for (int i13 = 0; i13 < i11; i13++) {
            e eVar3 = this.f36722g1[z10 ? (i11 - i13) - 1 : i13];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i13 == 0) {
                    eVar3.j(eVar3.f36599B, this.f36599B, P0());
                    eVar3.j0(this.f36701L0);
                    eVar3.i0(this.f36707R0);
                }
                if (i13 == i11 - 1) {
                    eVar3.j(eVar3.f36601D, this.f36601D, Q0());
                }
                if (i13 > 0) {
                    eVar3.j(eVar3.f36599B, eVar2.f36601D, this.f36713X0);
                    eVar2.j(eVar2.f36601D, eVar3.f36599B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i14 = 0; i14 < i12; i14++) {
            e eVar4 = this.f36721f1[i14];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i14 == 0) {
                    eVar4.j(eVar4.f36600C, this.f36600C, R0());
                    eVar4.y0(this.f36702M0);
                    eVar4.x0(this.f36708S0);
                }
                if (i14 == i12 - 1) {
                    eVar4.j(eVar4.f36602E, this.f36602E, O0());
                }
                if (i14 > 0) {
                    eVar4.j(eVar4.f36600C, eVar2.f36602E, this.f36714Y0);
                    eVar2.j(eVar2.f36602E, eVar4.f36600C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = (i16 * i11) + i15;
                if (this.f36719d1 == 1) {
                    i17 = (i15 * i12) + i16;
                }
                e[] eVarArr = this.f36724i1;
                if (i17 < eVarArr.length && (eVar = eVarArr[i17]) != null && eVar.O() != 8) {
                    e eVar5 = this.f36722g1[i15];
                    e eVar6 = this.f36721f1[i16];
                    if (eVar != eVar5) {
                        eVar.j(eVar.f36599B, eVar5.f36599B, 0);
                        eVar.j(eVar.f36601D, eVar5.f36601D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.f36600C, eVar6.f36600C, 0);
                        eVar.j(eVar.f36602E, eVar6.f36602E, 0);
                    }
                }
            }
        }
    }

    public void F1(float f10) {
        this.f36709T0 = f10;
    }

    public void G1(int i10) {
        this.f36703N0 = i10;
    }

    public void H1(float f10) {
        this.f36710U0 = f10;
    }

    public void I1(int i10) {
        this.f36704O0 = i10;
    }

    public void J1(int i10) {
        this.f36715Z0 = i10;
    }

    public void K1(float f10) {
        this.f36707R0 = f10;
    }

    public void L1(int i10) {
        this.f36713X0 = i10;
    }

    public void M1(int i10) {
        this.f36701L0 = i10;
    }

    public void N1(float f10) {
        this.f36711V0 = f10;
    }

    public void O1(int i10) {
        this.f36705P0 = i10;
    }

    public void P1(float f10) {
        this.f36712W0 = f10;
    }

    public void Q1(int i10) {
        this.f36706Q0 = i10;
    }

    public void R1(int i10) {
        this.f36718c1 = i10;
    }

    @Override // V1.l
    public void S0(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.f36752x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int iP0 = P0();
        int iQ0 = Q0();
        int iR0 = R0();
        int iO0 = O0();
        int[] iArr = new int[2];
        int i15 = (i11 - iP0) - iQ0;
        int i16 = this.f36719d1;
        if (i16 == 1) {
            i15 = (i13 - iR0) - iO0;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f36701L0 == -1) {
                this.f36701L0 = 0;
            }
            if (this.f36702M0 == -1) {
                this.f36702M0 = 0;
            }
        } else {
            if (this.f36701L0 == -1) {
                this.f36701L0 = 0;
            }
            if (this.f36702M0 == -1) {
                this.f36702M0 = 0;
            }
        }
        e[] eVarArr2 = this.f36751w0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f36752x0;
            if (i18 >= i14) {
                break;
            }
            if (this.f36751w0[i18].O() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f36752x0) {
                e eVar = this.f36751w0[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.O() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.f36724i1 = eVarArr;
        this.f36725j1 = i21;
        int i22 = this.f36717b1;
        if (i22 == 0) {
            E1(eVarArr, i21, this.f36719d1, i17, iArr);
        } else if (i22 == 1) {
            D1(eVarArr, i21, this.f36719d1, i17, iArr);
        } else if (i22 == 2) {
            C1(eVarArr, i21, this.f36719d1, i17, iArr);
        }
        int iMin = iArr[0] + iP0 + iQ0;
        int iMin2 = iArr[1] + iR0 + iO0;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        X0(iMin, iMin2);
        E0(iMin);
        h0(iMin2);
        W0(this.f36752x0 > 0);
    }

    public void S1(int i10) {
        this.f36719d1 = i10;
    }

    public void T1(int i10) {
        this.f36716a1 = i10;
    }

    public void U1(float f10) {
        this.f36708S0 = f10;
    }

    public void V1(int i10) {
        this.f36714Y0 = i10;
    }

    public void W1(int i10) {
        this.f36702M0 = i10;
    }

    public void X1(int i10) {
        this.f36717b1 = i10;
    }

    @Override // V1.e
    public void f(U1.d dVar) {
        boolean zA1;
        boolean z10;
        super.f(dVar);
        if (G() != null) {
            zA1 = ((f) G()).a1();
        } else {
            zA1 = false;
        }
        int i10 = this.f36717b1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    z1(zA1);
                }
            } else {
                int size = this.f36720e1.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar = this.f36720e1.get(i11);
                    if (i11 == size - 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    aVar.d(zA1, i11, z10);
                }
            }
        } else if (this.f36720e1.size() > 0) {
            this.f36720e1.get(0).d(zA1, 0, true);
        }
        W0(false);
    }
}
