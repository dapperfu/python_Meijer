package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class SG0 extends WG0 {
    protected abstract Pair k(RG0 rg0, int[][][] iArr, int[] iArr2, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl) throws zzib;

    @Override // com.google.android.gms.internal.ads.WG0
    public final XG0 f(IA0[] ia0Arr, C7900dG0 c7900dG0, C7578aF0 c7578aF0, AbstractC7432Wl abstractC7432Wl) throws zzib {
        boolean z10;
        int[] iArr;
        int[] iArr2 = new int[3];
        C9867vm[][] c9867vmArr = new C9867vm[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = c7900dG0.f74225a;
            c9867vmArr[i10] = new C9867vm[i11];
            iArr3[i10] = new int[i11][];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = ia0Arr[i13].zze();
        }
        int i14 = 0;
        while (i14 < c7900dG0.f74225a) {
            C9867vm c9867vmB = c7900dG0.b(i14);
            int i15 = c9867vmB.f79963c;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z11 = true;
            while (i17 < i12) {
                IA0 ia0 = ia0Arr[i17];
                int iMax = 0;
                for (int i19 = 0; i19 < c9867vmB.f79961a; i19++) {
                    iMax = Math.max(iMax, ia0.g(c9867vmB.b(i19)) & 7);
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
                iArr = new int[c9867vmB.f79961a];
            } else {
                IA0 ia02 = ia0Arr[i16];
                int[] iArr5 = new int[c9867vmB.f79961a];
                for (int i20 = 0; i20 < c9867vmB.f79961a; i20++) {
                    iArr5[i20] = ia02.g(c9867vmB.b(i20));
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i16];
            c9867vmArr[i16][i21] = c9867vmB;
            iArr3[i16][i21] = iArr;
            iArr2[i16] = i21 + 1;
            i14++;
            i12 = 2;
        }
        C7900dG0[] c7900dG0Arr = new C7900dG0[i12];
        String[] strArr = new String[i12];
        int[] iArr6 = new int[i12];
        int i22 = 0;
        while (i22 < i12) {
            int i23 = iArr2[i22];
            c7900dG0Arr[i22] = new C7900dG0((C9867vm[]) OV.n(c9867vmArr[i22], i23));
            iArr3[i22] = (int[][]) OV.n(iArr3[i22], i23);
            strArr[i22] = ia0Arr[i22].b();
            iArr6[i22] = ia0Arr[i22].zzb();
            i22++;
            i12 = 2;
        }
        int i24 = i12;
        RG0 rg0 = new RG0(strArr, iArr6, c7900dG0Arr, iArr4, iArr3, new C7900dG0((C9867vm[]) OV.n(c9867vmArr[i24], iArr2[i24])));
        Pair pairK = k(rg0, iArr3, iArr4, c7578aF0, abstractC7432Wl);
        TG0[] tg0Arr = (TG0[]) pairK.second;
        List[] listArr = new List[tg0Arr.length];
        for (int i25 = 0; i25 < tg0Arr.length; i25++) {
            TG0 tg0 = tg0Arr[i25];
            listArr[i25] = tg0 != null ? AbstractC8042eh0.u(tg0) : AbstractC8042eh0.t();
        }
        C7723bh0 c7723bh0 = new C7723bh0();
        for (int i26 = 0; i26 < 2; i26++) {
            C7900dG0 c7900dG0D = rg0.d(i26);
            List list = listArr[i26];
            for (int i27 = 0; i27 < c7900dG0D.f74225a; i27++) {
                C9867vm c9867vmB2 = c7900dG0D.b(i27);
                boolean z13 = rg0.a(i26, i27, false) != 0;
                int i28 = c9867vmB2.f79961a;
                int[] iArr7 = new int[i28];
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 < c9867vmB2.f79961a; i29++) {
                    iArr7[i29] = rg0.b(i26, i27, i29) & 7;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        TG0 tg02 = (TG0) list.get(i30);
                        if (tg02.zzg().equals(c9867vmB2) && tg02.zzc(i29) != -1) {
                            z10 = true;
                            break;
                        }
                        i30++;
                    }
                    zArr[i29] = z10;
                }
                c7723bh0.g(new C9018np(c9867vmB2, z13, iArr7, zArr));
            }
        }
        C7900dG0 c7900dG0E = rg0.e();
        for (int i31 = 0; i31 < c7900dG0E.f74225a; i31++) {
            C9867vm c9867vmB3 = c7900dG0E.b(i31);
            int[] iArr8 = new int[c9867vmB3.f79961a];
            Arrays.fill(iArr8, 0);
            c7723bh0.g(new C9018np(c9867vmB3, false, iArr8, new boolean[c9867vmB3.f79961a]));
        }
        return new XG0((JA0[]) pairK.first, (PG0[]) pairK.second, new C7133Np(c7723bh0.j()), rg0);
    }

    @Override // com.google.android.gms.internal.ads.WG0
    public final void g(Object obj) {
    }
}
