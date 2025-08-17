package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SG0 extends WG0 {
    protected abstract Pair k(RG0 rg0, int[][][] iArr, int[] iArr2, C7453aF0 c7453aF0, AbstractC7307Wl abstractC7307Wl) throws zzib;

    @Override // com.google.android.gms.internal.ads.WG0
    public final XG0 f(IA0[] ia0Arr, C7775dG0 c7775dG0, C7453aF0 c7453aF0, AbstractC7307Wl abstractC7307Wl) throws zzib {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        C9742vm[][] c9742vmArr = new C9742vm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = c7775dG0.f73385a;
            c9742vmArr[i10] = new C9742vm[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = ia0Arr[i13].zze();
        }
        int i14 = 0;
        while (i14 < c7775dG0.f73385a) {
            C9742vm c9742vmB = c7775dG0.b(i14);
            int i15 = c9742vmB.f79123c;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                IA0 ia0 = ia0Arr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < c9742vmB.f79121a; i19++) {
                    iMax = Math.max(iMax, ia0.f(c9742vmB.b(i19)) & 7);
                }
                boolean z12 = iArr2[i17] == 0;
                if (iMax > i18) {
                    z11 = z12;
                    i16 = i17;
                    i18 = iMax;
                } else if (iMax == i18 && i15 == 5 && !z11 && z12) {
                    i16 = i17;
                    i18 = iMax;
                    z11 = true;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[c9742vmB.f79121a];
            } else {
                IA0 ia02 = ia0Arr[i16];
                int[] iArr5 = new int[c9742vmB.f79121a];
                for (int i20 = 0; i20 < c9742vmB.f79121a; i20++) {
                    iArr5[i20] = ia02.f(c9742vmB.b(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i16];
            c9742vmArr[i16][i21] = c9742vmB;
            iArr3[i16][i21] = iArr;
            iArr2[i16] = i21 + 1;
            i14++;
            i12 = 2;
        }
        C7775dG0[] c7775dG0Arr = new C7775dG0[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i22 = 0;
        while (i22 < i12) {
            int i23 = iArr2[i22];
            c7775dG0Arr[i22] = new C7775dG0((C9742vm[]) OV.n(c9742vmArr[i22], i23));
            iArr3[i22] = (int[][]) OV.n(iArr3[i22], i23);
            strArr[i22] = ia0Arr[i22].b();
            iArr6[i22] = ia0Arr[i22].zzb();
            i22++;
            i12 = 2;
        }
        int i24 = i12;
        RG0 rg0 = new RG0(strArr, iArr6, c7775dG0Arr, iArr4, iArr3, new C7775dG0((C9742vm[]) OV.n(c9742vmArr[i24], iArr2[i24])));
        Pair pairK = k(rg0, iArr3, iArr4, c7453aF0, abstractC7307Wl);
        TG0[] tg0Arr = (TG0[]) pairK.second;
        List[] listArr = new List[tg0Arr.length];
        for (int i25 = 0; i25 < tg0Arr.length; i25++) {
            TG0 tg0 = tg0Arr[i25];
            listArr[i25] = tg0 != null ? AbstractC7917eh0.u(tg0) : AbstractC7917eh0.t();
        }
        C7598bh0 c7598bh0 = new C7598bh0();
        for (int i26 = 0; i26 < 2; i26++) {
            C7775dG0 c7775dG0D = rg0.d(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < c7775dG0D.f73385a; i27++) {
                C9742vm c9742vmB2 = c7775dG0D.b(i27);
                boolean z13 = rg0.a(i26, i27, false) != 0;
                int i28 = c9742vmB2.f79121a;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < c9742vmB2.f79121a; i29++) {
                    iArr7[i29] = rg0.b(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        TG0 tg02 = (TG0) list.get(i30);
                        if (tg02.zzg().equals(c9742vmB2) && tg02.zzc(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                c7598bh0.g(new C8893np(c9742vmB2, z13, iArr7, zArr));
            }
        }
        C7775dG0 c7775dG0E = rg0.e();
        for (int i31 = 0; i31 < c7775dG0E.f73385a; i31++) {
            C9742vm c9742vmB3 = c7775dG0E.b(i31);
            int[] iArr8 = new int[c9742vmB3.f79121a];
            Arrays.fill(iArr8, 0);
            c7598bh0.g(new C8893np(c9742vmB3, false, iArr8, new boolean[c9742vmB3.f79121a]));
        }
        return new XG0((JA0[]) pairK.first, (PG0[]) pairK.second, new C7008Np(c7598bh0.j()), rg0);
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final void g(Object obj) {
    }
}
