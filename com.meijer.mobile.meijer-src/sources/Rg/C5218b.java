package Rg;

import java.util.Collection;
import java.util.Collections;

/* renamed from: Rg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5218b extends s {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f32561b;

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f32562c = {'T', 'N', '*', 'E'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f32563d = {'/', ':', '+', '.'};

    /* renamed from: e, reason: collision with root package name */
    private static final char f32564e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f32561b = cArr;
        f32564e = cArr[0];
    }

    @Override // Rg.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.CODABAR);
    }

    @Override // Rg.s
    public boolean[] d(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c10 = f32564e;
            sb2.append(c10);
            sb2.append(str);
            sb2.append(c10);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f32561b;
            boolean zH = C5217a.h(cArr, upperCase);
            boolean zH2 = C5217a.h(cArr, upperCase2);
            char[] cArr2 = f32562c;
            boolean zH3 = C5217a.h(cArr2, upperCase);
            boolean zH4 = C5217a.h(cArr2, upperCase2);
            if (zH) {
                if (!zH2) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (zH3) {
                if (!zH4) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (!zH2 && !zH4) {
                StringBuilder sb3 = new StringBuilder();
                char c11 = f32564e;
                sb3.append(c11);
                sb3.append(str);
                sb3.append(c11);
                str = sb3.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (!Character.isDigit(str.charAt(i12)) && str.charAt(i12) != '-' && str.charAt(i12) != '$') {
                if (C5217a.h(f32563d, str.charAt(i12))) {
                    i11 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
            } else {
                i11 += 9;
            }
        }
        boolean[] zArr = new boolean[i11 + (str.length() - 1)];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = C5217a.f32555d;
                if (i15 < cArr3.length) {
                    if (upperCase3 == cArr3[i15]) {
                        i10 = C5217a.f32556e[i15];
                        break;
                    }
                    i15++;
                } else {
                    i10 = 0;
                    break;
                }
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) != 0 && i17 != 1) {
                    i17++;
                } else {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
