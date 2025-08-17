package Pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class d extends s {

    private enum b {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private int[][] f25359a;

        /* renamed from: b, reason: collision with root package name */
        private b[][] f25360b;

        private enum a {
            A,
            B,
            C,
            NONE
        }

        private enum b {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        private static void b(Collection<int[]> collection, int i10, int[] iArr, int[] iArr2, int i11) {
            collection.add(Pg.c.f25351a[i10]);
            if (i11 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i10 * iArr2[0]);
        }

        private int d(CharSequence charSequence, a aVar, int i10) {
            int iD;
            int iD2;
            int i11 = this.f25359a[aVar.ordinal()][i10];
            if (i11 > 0) {
                return i11;
            }
            b bVar = b.NONE;
            int i12 = i10 + 1;
            int i13 = 0;
            boolean z10 = i12 >= charSequence.length();
            a[] aVarArr = {a.A, a.B};
            int i14 = Integer.MAX_VALUE;
            while (true) {
                if (i13 > 1) {
                    break;
                }
                if (c(charSequence, aVarArr[i13], i10)) {
                    b bVarValueOf = b.NONE;
                    a aVar2 = aVarArr[i13];
                    if (aVar != aVar2) {
                        bVarValueOf = b.valueOf(aVar2.toString());
                        iD2 = 2;
                    } else {
                        iD2 = 1;
                    }
                    if (!z10) {
                        iD2 += d(charSequence, aVarArr[i13], i12);
                    }
                    if (iD2 < i14) {
                        bVar = bVarValueOf;
                        i14 = iD2;
                    }
                    if (aVar == aVarArr[(i13 + 1) % 2]) {
                        b bVar2 = b.SHIFT;
                        int iD3 = z10 ? 2 : 2 + d(charSequence, aVar, i12);
                        if (iD3 < i14) {
                            i14 = iD3;
                            bVar = bVar2;
                        }
                    }
                }
                i13++;
            }
            a aVar3 = a.C;
            if (c(charSequence, aVar3, i10)) {
                b bVar3 = b.NONE;
                if (aVar != aVar3) {
                    bVar3 = b.C;
                    iD = 2;
                } else {
                    iD = 1;
                }
                int i15 = (charSequence.charAt(i10) != 241 ? 2 : 1) + i10;
                if (i15 < charSequence.length()) {
                    iD += d(charSequence, aVar3, i15);
                }
                if (iD < i14) {
                    bVar = bVar3;
                    i14 = iD;
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                this.f25359a[aVar.ordinal()][i10] = i14;
                this.f25360b[aVar.ordinal()][i10] = bVar;
                return i14;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) charSequence.charAt(i10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean[] e(java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Pg.d.c.e(java.lang.String):boolean[]");
        }

        private static boolean f(char c10) {
            return c10 >= '0' && c10 <= '9';
        }

        private boolean c(CharSequence charSequence, a aVar, int i10) {
            int i11;
            char cCharAt = charSequence.charAt(i10);
            int i12 = a.f25353b[aVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return false;
                    }
                    if (cCharAt != 241 && ((i11 = i10 + 1) >= charSequence.length() || !f(cCharAt) || !f(charSequence.charAt(i11)))) {
                        return false;
                    }
                    return true;
                }
                if (cCharAt != 241 && cCharAt != 242 && cCharAt != 243 && cCharAt != 244 && " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007fÿ".indexOf(cCharAt) < 0) {
                    return false;
                }
                return true;
            }
            if (cCharAt != 241 && cCharAt != 242 && cCharAt != 243 && cCharAt != 244 && " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ".indexOf(cCharAt) < 0) {
                return false;
            }
            return true;
        }
    }

    private static int i(String str, Map<com.google.zxing.f, ?> map) {
        String string;
        if (map != null) {
            com.google.zxing.f fVar = com.google.zxing.f.FORCE_CODE_SET;
            if (map.containsKey(fVar)) {
                string = map.get(fVar).toString();
                string.getClass();
                switch (string) {
                    case "A":
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported code set hint: " + string);
                }
            }
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ASCII value=" + ((int) cCharAt));
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Pg.d.i(java.lang.String, java.util.Map):int");
        }

        @Override // Pg.s
        public boolean[] d(String str) {
            return e(str, null);
        }

        static /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ int[] f25352a;

            /* renamed from: b, reason: collision with root package name */
            static final /* synthetic */ int[] f25353b;

            static {
                int[] iArr = new int[c.a.values().length];
                f25353b = iArr;
                try {
                    iArr[c.a.A.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    f25353b[c.a.B.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    f25353b[c.a.C.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                int[] iArr2 = new int[c.b.values().length];
                f25352a = iArr2;
                try {
                    iArr2[c.b.A.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    f25352a[c.b.B.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    f25352a[c.b.C.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    f25352a[c.b.SHIFT.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
            }
        }

        static boolean[] m(Collection<int[]> collection, int i10) {
            int i11 = i10 % 103;
            if (i11 < 0) {
                throw new IllegalArgumentException("Unable to compute a valid input checksum");
            }
            int[][] iArr = Pg.c.f25351a;
            collection.add(iArr[i11]);
            collection.add(iArr[106]);
            int iB = 0;
            int i12 = 0;
            for (int[] iArr2 : collection) {
                for (int i13 : iArr2) {
                    i12 += i13;
                }
            }
            boolean[] zArr = new boolean[i12];
            Iterator<int[]> it = collection.iterator();
            while (it.hasNext()) {
                iB += s.b(zArr, iB, it.next(), true);
            }
            return zArr;
        }

        @Override // Pg.s
        protected Collection<com.google.zxing.a> g() {
            return Collections.singleton(com.google.zxing.a.CODE_128);
        }

        private static int j(CharSequence charSequence, int i10, int i11) {
            b bVarL;
            b bVarL2;
            char cCharAt;
            b bVarL3 = l(charSequence, i10);
            b bVar = b.ONE_DIGIT;
            if (bVarL3 == bVar) {
                if (i11 == 101) {
                    return 101;
                }
                return 100;
            }
            b bVar2 = b.UNCODABLE;
            if (bVarL3 == bVar2) {
                if (i10 < charSequence.length() && ((cCharAt = charSequence.charAt(i10)) < ' ' || (i11 == 101 && (cCharAt < '`' || (cCharAt >= 241 && cCharAt <= 244))))) {
                    return 101;
                }
                return 100;
            }
            if (i11 == 101 && bVarL3 == b.FNC_1) {
                return 101;
            }
            if (i11 == 99) {
                return 99;
            }
            if (i11 == 100) {
                b bVar3 = b.FNC_1;
                if (bVarL3 == bVar3 || (bVarL = l(charSequence, i10 + 2)) == bVar2 || bVarL == bVar) {
                    return 100;
                }
                if (bVarL == bVar3) {
                    if (l(charSequence, i10 + 3) != b.TWO_DIGITS) {
                        return 100;
                    }
                    return 99;
                }
                int i12 = i10 + 4;
                while (true) {
                    bVarL2 = l(charSequence, i12);
                    if (bVarL2 != b.TWO_DIGITS) {
                        break;
                    }
                    i12 += 2;
                }
                if (bVarL2 == b.ONE_DIGIT) {
                    return 100;
                }
                return 99;
            }
            if (bVarL3 == b.FNC_1) {
                bVarL3 = l(charSequence, i10 + 1);
            }
            if (bVarL3 != b.TWO_DIGITS) {
                return 100;
            }
            return 99;
        }

        private static boolean[] k(String str, int i10) throws NumberFormatException {
            int iJ;
            int i11;
            int length = str.length();
            ArrayList arrayList = new ArrayList();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 1;
            while (i12 < length) {
                if (i10 == -1) {
                    iJ = j(str, i12, i14);
                } else {
                    iJ = i10;
                }
                int iCharAt = 100;
                if (iJ == i14) {
                    switch (str.charAt(i12)) {
                        case 241:
                            iCharAt = 102;
                            break;
                        case 242:
                            iCharAt = 97;
                            break;
                        case 243:
                            iCharAt = 96;
                            break;
                        case 244:
                            if (i14 == 101) {
                                iCharAt = 101;
                                break;
                            }
                            break;
                        default:
                            if (i14 != 100) {
                                if (i14 != 101) {
                                    int i16 = i12 + 1;
                                    if (i16 != length) {
                                        iCharAt = Integer.parseInt(str.substring(i12, i12 + 2));
                                        i12 = i16;
                                        break;
                                    } else {
                                        throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                    }
                                } else {
                                    char cCharAt = str.charAt(i12);
                                    iCharAt = cCharAt - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt + '@';
                                        break;
                                    }
                                }
                            } else {
                                iCharAt = str.charAt(i12) - ' ';
                                break;
                            }
                            break;
                    }
                    i12++;
                } else {
                    if (i14 == 0) {
                        if (iJ != 100) {
                            if (iJ != 101) {
                                i11 = 105;
                            } else {
                                i11 = 103;
                            }
                        } else {
                            i11 = 104;
                        }
                        iCharAt = i11;
                    } else {
                        iCharAt = iJ;
                    }
                    i14 = iJ;
                }
                arrayList.add(Pg.c.f25351a[iCharAt]);
                i13 += iCharAt * i15;
                if (i12 != 0) {
                    i15++;
                }
            }
            return m(arrayList, i13);
        }

        private static b l(CharSequence charSequence, int i10) {
            int length = charSequence.length();
            if (i10 >= length) {
                return b.UNCODABLE;
            }
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == 241) {
                return b.FNC_1;
            }
            if (cCharAt >= '0' && cCharAt <= '9') {
                int i11 = i10 + 1;
                if (i11 >= length) {
                    return b.ONE_DIGIT;
                }
                char cCharAt2 = charSequence.charAt(i11);
                if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                    return b.TWO_DIGITS;
                }
                return b.ONE_DIGIT;
            }
            return b.UNCODABLE;
        }

        @Override // Pg.s
        public boolean[] e(String str, Map<com.google.zxing.f, ?> map) {
            int i10 = i(str, map);
            if (map != null) {
                com.google.zxing.f fVar = com.google.zxing.f.CODE128_COMPACT;
                if (map.containsKey(fVar) && Boolean.parseBoolean(map.get(fVar).toString())) {
                    return new c(null).e(str);
                }
            }
            return k(str, i10);
        }
    }
