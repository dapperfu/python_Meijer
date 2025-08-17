package jc;

import Vb.h;
import Vb.l;
import cb.C6380a;
import cb.C6381b;
import ic.C14713a;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class g implements InterfaceC14880a {

    /* renamed from: a, reason: collision with root package name */
    private final C6380a f139563a = C6381b.a(g.class.getSimpleName());

    @Override // jc.InterfaceC14880a
    public final C14713a a(l lVar, int i10) {
        byte[] bArr = lVar.f37105a;
        byte[] bArr2 = lVar.f37106b.f37126c;
        if (bArr == null || bArr.length != 2 || bArr2 == null || bArr2.length != 25) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        Sb.a.a(bArr2);
        String strA = h.a(Sb.a.a(bArr));
        String strA2 = Sb.a.a(Arrays.copyOfRange(bArr2, 3, 19));
        String strA3 = Sb.a.a(Arrays.copyOfRange(bArr2, 2, 3));
        String strA4 = Sb.a.a(Arrays.copyOfRange(bArr2, 19, 25));
        C14713a c14713a = new C14713a();
        c14713a.A(strA2);
        c14713a.F(strA);
        c14713a.r(new Date());
        c14713a.C(i10);
        c14713a.I(TimeZone.getDefault().getID());
        c14713a.y((byte) 4);
        c14713a.v(strA3);
        c14713a.t(strA4);
        return c14713a;
    }
}
