package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9371r5 implements InterfaceC8413i6 {

    /* renamed from: a, reason: collision with root package name */
    private final List f78770a;

    public C9371r5(int i10, List list) {
        this.f78770a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8413i6
    public final InterfaceC8625k6 a(int i10, C8306h6 c8306h6) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new P5(new G5(c8306h6.f75441b, c8306h6.a()));
            }
            if (i10 == 21) {
                return new P5(new E5());
            }
            if (i10 == 27) {
                return new P5(new B5(b(c8306h6), false, false));
            }
            if (i10 == 36) {
                return new P5(new D5(b(c8306h6)));
            }
            if (i10 == 45) {
                return new P5(new H5());
            }
            if (i10 == 89) {
                return new P5(new C9585t5(c8306h6.f75443d));
            }
            if (i10 == 172) {
                return new P5(new C9051o5(c8306h6.f75441b, c8306h6.a()));
            }
            if (i10 == 257) {
                return new X5(new O5("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 != 138) {
                        if (i10 == 139) {
                            return new P5(new C9478s5(c8306h6.f75441b, c8306h6.a(), 5408));
                        }
                        switch (i10) {
                            case 15:
                                return new P5(new C9265q5(false, c8306h6.f75441b, c8306h6.a()));
                            case 16:
                                return new P5(new C10227z5(c(c8306h6)));
                            case 17:
                                return new P5(new F5(c8306h6.f75441b, c8306h6.a()));
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
                    return new P5(new C9478s5(c8306h6.f75441b, c8306h6.a(), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT));
                }
                return new P5(new C8837m5(c8306h6.f75441b, c8306h6.a()));
            }
        }
        return new P5(new C9906w5(c(c8306h6)));
    }

    private final Z5 b(C8306h6 c8306h6) {
        return new Z5(d(c8306h6));
    }

    private final C8946n6 c(C8306h6 c8306h6) {
        return new C8946n6(d(c8306h6));
    }

    private final List d(C8306h6 c8306h6) {
        String str;
        int i10;
        List listSingletonList;
        GQ gq2 = new GQ(c8306h6.f75444e);
        List arrayList = this.f78770a;
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
                        int i13 = C8427iD.f75757d;
                        listSingletonList = Collections.singletonList(i12 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C9717uH0 c9717uH0 = new C9717uH0();
                    c9717uH0.B(str);
                    c9717uH0.q(strB);
                    c9717uH0.p0(i10);
                    c9717uH0.n(listSingletonList);
                    arrayList.add(c9717uH0.H());
                }
            }
            gq2.l(iT);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8413i6
    public final SparseArray zza() {
        return new SparseArray();
    }
}
