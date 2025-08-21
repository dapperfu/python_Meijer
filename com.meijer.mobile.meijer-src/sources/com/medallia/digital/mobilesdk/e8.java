package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
abstract class e8<T> implements x0 {

    /* renamed from: d, reason: collision with root package name */
    private static final String f92755d = "mdCParamNull";

    /* renamed from: e, reason: collision with root package name */
    private static final int f92756e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f92757f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f92758g = 1;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<c0> f92759a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<c0> f92760b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<g6> f92761c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92762a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92763b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f92764c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f92765d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f92766e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f92767f;

        static {
            int[] iArr = new int[u1.i.values().length];
            f92767f = iArr;
            try {
                iArr[u1.i.VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92767f[u1.i.TIMESTAMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[u1.h.values().length];
            f92766e = iArr2;
            try {
                iArr2[u1.h.TIME_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[u1.j.values().length];
            f92765d = iArr3;
            try {
                iArr3[u1.j.OS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92765d[u1.j.CUSTOM_PARAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92765d[u1.j.USER_JOURNEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92765d[u1.j.OCQ_RULE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[u1.g.values().length];
            f92764c = iArr4;
            try {
                iArr4[u1.g.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f92764c[u1.g.MULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f92764c[u1.g.DIVIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f92764c[u1.g.SUBSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f92764c[u1.g.LOWER_CASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f92764c[u1.g.UPPER_CASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f92764c[u1.g.ABS.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[u1.e.values().length];
            f92763b = iArr5;
            try {
                iArr5[u1.e.MATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f92763b[u1.e.EQUALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f92763b[u1.e.DOES_NOT_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f92763b[u1.e.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f92763b[u1.e.ENDS_WITH.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f92763b[u1.e.HAS_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f92763b[u1.e.STARTS_WITH.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f92763b[u1.e.GREATER_THAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f92763b[u1.e.DOES_NOT_CONTAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f92763b[u1.e.SMALLER_THAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f92763b[u1.e.DIFF.ordinal()] = 11;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr6 = new int[u1.k.values().length];
            f92762a = iArr6;
            try {
                iArr6[u1.k.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f92762a[u1.k.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f92762a[u1.k.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f92762a[u1.k.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    e8() {
    }

    private c0 a(String str) {
        if (this.f92759a != null && str != null) {
            a4.b("TREV2 getEvent uj: " + this.f92759a);
            Iterator<c0> it = this.f92759a.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                if (next.getName().equals(str)) {
                    a4.b("TREV2 getEvent event name, value: " + next.getName() + " , " + next.i());
                    return next;
                }
            }
        }
        return null;
    }

    private String b(String str) {
        ArrayList<g6> arrayList;
        if (str != null && (arrayList = this.f92761c) != null) {
            Iterator<g6> it = arrayList.iterator();
            while (it.hasNext()) {
                g6 next = it.next();
                if (str.equals(next.f92941a)) {
                    return String.valueOf(next.f92943c);
                }
            }
        }
        return null;
    }

    private String c(String str) {
        u1.h hVarA;
        if (str == null || (hVarA = u1.h.a(str)) == null || a.f92766e[hVarA.ordinal()] != 1) {
            return null;
        }
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        return null;
    }

    private String b(String str, u1.k kVar) {
        if (this.f92760b != null && str != null && kVar != null) {
            Pattern patternCompile = Pattern.compile("Name:\\s(.*)\\sValue:\\s(.*)");
            Iterator<c0> it = this.f92760b.iterator();
            while (it.hasNext()) {
                c0 next = it.next();
                if (next.i() != null && patternCompile.matcher(next.i().toString()).matches() && next.i().toString().replaceAll("Name:\\s", "").replaceAll("\\sValue:\\s(.*)", "").equals(str)) {
                    u1.k kVarA = u1.k.a(next.j());
                    if (kVarA == null) {
                        return f92755d;
                    }
                    u1.k kVar2 = u1.k.STRING;
                    if (kVar == kVar2 && kVarA != kVar2) {
                        return f92755d;
                    }
                    u1.k kVar3 = u1.k.BOOLEAN;
                    if (kVar == kVar3 && kVarA != kVar3) {
                        return f92755d;
                    }
                    u1.k kVar4 = u1.k.DOUBLE;
                    return (kVar != kVar4 || kVarA == kVar4 || kVarA == u1.k.INTEGER) ? next.i().toString().replaceAll("Name:\\s(.*)\\sValue:\\s", "") : f92755d;
                }
            }
        }
        return f92755d;
    }

    protected <K> K a(Object obj, Class<K> cls) {
        try {
            return cls.cast(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a A[PHI: r7
      0x007a: PHI (r7v11 ??) = (r7v9 ??), (r7v76 ??), (r7v78 ??), (r7v82 ??), (r7v82 ??), (r7v88 ??), (r7v88 ??) binds: [B:73:0x00bb, B:55:0x008c, B:47:0x0073, B:44:0x006b, B:42:0x0068, B:25:0x003f, B:23:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ca  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v76 */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v82 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r7v97 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.Object a(java.lang.String r7, java.lang.String r8, com.medallia.digital.mobilesdk.u1.k r9, com.medallia.digital.mobilesdk.u1.e r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.e8.a(java.lang.String, java.lang.String, com.medallia.digital.mobilesdk.u1$k, com.medallia.digital.mobilesdk.u1$e):java.lang.Object");
    }

    protected T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        this.f92759a = arrayList;
        this.f92760b = arrayList2;
        this.f92761c = arrayList3;
        return null;
    }

    private String a(c0 c0Var, String str) {
        u1.i iVarA;
        if (str == null || c0Var == null || (iVarA = u1.i.a(str)) == null) {
            return null;
        }
        int i10 = a.f92767f[iVarA.ordinal()];
        if (i10 == 1) {
            return c0Var.i().toString();
        }
        if (i10 != 2) {
            return null;
        }
        return String.valueOf(c0Var.h());
    }

    private String a(u1.g gVar, String str, String str2) {
        long jAbs;
        if (gVar != null) {
            switch (a.f92764c[gVar.ordinal()]) {
                case 1:
                    if (str != null && str2 != null) {
                        jAbs = Long.parseLong(str) + Long.parseLong(str2);
                        return String.valueOf(jAbs);
                    }
                    break;
                case 2:
                    if (str != null && str2 != null) {
                        jAbs = Long.parseLong(str) * Long.parseLong(str2);
                        return String.valueOf(jAbs);
                    }
                    break;
                case 3:
                    if (str != null && str2 != null) {
                        jAbs = Long.parseLong(str) / Long.parseLong(str2);
                        return String.valueOf(jAbs);
                    }
                    break;
                case 4:
                    if (str != null && str2 != null) {
                        jAbs = Long.parseLong(str) - Long.parseLong(str2);
                        return String.valueOf(jAbs);
                    }
                    break;
                case 5:
                    if (str != null) {
                        return str.toLowerCase();
                    }
                    break;
                case 6:
                    if (str != null) {
                        return str.toUpperCase();
                    }
                    break;
                case 7:
                    if (str != null) {
                        jAbs = Math.abs(Long.parseLong(str));
                        return String.valueOf(jAbs);
                    }
                    break;
                default:
                    return null;
            }
        }
        return str;
    }

    protected String a(String str, u1.k kVar) {
        String str2;
        u1.j jVarA;
        if (str == null) {
            return null;
        }
        if (!str.startsWith("$")) {
            return str;
        }
        String[] strArrSplit = (str.startsWith("$CUSTOM_PARAM.") || str.startsWith("$OCQ_RULE.")) ? str.replace("$", "").split("\\.", 2) : str.replace("$", "").split("\\.");
        if (strArrSplit.length == 0 || (str2 = strArrSplit[0]) == null || strArrSplit[1] == null || (jVarA = u1.j.a(str2)) == null) {
            return null;
        }
        int i10 = a.f92765d[jVarA.ordinal()];
        if (i10 == 1) {
            return c(strArrSplit[1]);
        }
        if (i10 == 2) {
            return b(strArrSplit[1], kVar);
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return null;
            }
            return b(strArrSplit[1]);
        }
        if (strArrSplit.length != 3) {
            return null;
        }
        String str3 = strArrSplit[1];
        String str4 = strArrSplit[2];
        c0 c0VarA = a(str3);
        a4.b("TREV2 getValueFrom: " + a(c0VarA, str4));
        return a(c0VarA, str4);
    }

    protected String a(ArrayList<p6> arrayList, String str, u1.k kVar) {
        if (arrayList != null && str != null) {
            Iterator<p6> it = arrayList.iterator();
            while (it.hasNext()) {
                p6 next = it.next();
                str = a(next.a(), str, a(next.b(), kVar));
            }
        }
        return str;
    }
}
