package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9246r5 implements InterfaceC8288i6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f77930a;

    public C9246r5(int i10, List list) {
        this.f77930a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8288i6
    public final InterfaceC8500k6 a(int i10, C8181h6 c8181h6) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new P5(new G5(c8181h6.f74601b, c8181h6.a()));
            }
            if (i10 == 21) {
                return new P5(new E5());
            }
            if (i10 == 27) {
                return new P5(new B5(b(c8181h6), false, false));
            }
            if (i10 == 36) {
                return new P5(new D5(b(c8181h6)));
            }
            if (i10 == 45) {
                return new P5(new H5());
            }
            if (i10 == 89) {
                return new P5(new C9460t5(c8181h6.f74603d));
            }
            if (i10 == 172) {
                return new P5(new C8926o5(c8181h6.f74601b, c8181h6.a()));
            }
            if (i10 == 257) {
                return new X5(new O5("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 == 139) {
                            return new P5(new C9353s5(c8181h6.f74601b, c8181h6.a(), 5408));
                        }
                        switch (i10) {
                            case 15:
                                return new P5(new C9140q5(false, c8181h6.f74601b, c8181h6.a()));
                            case 16:
                                return new P5(new C10102z5(c(c8181h6)));
                            case 17:
                                return new P5(new F5(c8181h6.f74601b, c8181h6.a()));
                            default:
                                switch (i10) {
                                    case 134:
                                        return new X5(new O5("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new P5(new C9353s5(c8181h6.f74601b, c8181h6.a(), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT));
                }
                return new P5(new C8712m5(c8181h6.f74601b, c8181h6.a()));
            }
        }
        return new P5(new C9781w5(c(c8181h6)));
    }

    private final Z5 b(C8181h6 c8181h6) {
        return new Z5(d(c8181h6));
    }

    private final C8821n6 c(C8181h6 c8181h6) {
        return new C8821n6(d(c8181h6));
    }

    private final List d(C8181h6 c8181h6) {
        String str;
        int i10;
        List listSingletonList;
        GQ gq2 = new GQ(c8181h6.f74604e);
        List arrayList = this.f77930a;
        while (gq2.r() > 0) {
            int iC = gq2.C();
            int iT = gq2.t() + gq2.C();
            if (iC == 134) {
                arrayList = new ArrayList();
                int iC2 = gq2.C() & 31;
                for (int i11 = 0; i11 < iC2; i11++) {
                    String strB = gq2.b(3, StandardCharsets.UTF_8);
                    int iC3 = gq2.C();
                    boolean z10 = (iC3 & 128) != 0;
                    if (z10) {
                        i10 = iC3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bC = (byte) gq2.C();
                    gq2.m(1);
                    if (z10) {
                        int i12 = bC & 64;
                        int i13 = C8302iD.f74917d;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C9592uH0 c9592uH0 = new C9592uH0();
                    c9592uH0.B(str);
                    c9592uH0.q(strB);
                    c9592uH0.p0(i10);
                    c9592uH0.n(listSingletonList);
                    arrayList.add(c9592uH0.H());
                }
            }
            gq2.l(iT);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8288i6
    public final SparseArray zza() {
        return new SparseArray();
    }
}
