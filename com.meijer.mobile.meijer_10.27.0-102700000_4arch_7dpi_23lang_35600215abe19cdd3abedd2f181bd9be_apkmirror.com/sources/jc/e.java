package jc;

import Vb.h;
import Vb.l;
import ic.C14713a;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class e implements InterfaceC14880a {
    @Override // jc.InterfaceC14880a
    public final C14713a a(l lVar, int i10) {
        byte[] bArr = lVar.f37105a;
        byte[] bArr2 = lVar.f37106b.f37126c;
        if (bArr == null || bArr.length != 16 || bArr2 == null || bArr2.length != 11) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        String strA = h.a(Sb.a.a(bArr));
        String strA2 = Sb.a.a(bArr2);
        C14713a c14713a = new C14713a();
        c14713a.A(strA2);
        c14713a.F(strA);
        c14713a.r(new Date());
        c14713a.C(i10);
        c14713a.I(TimeZone.getDefault().getID());
        c14713a.q(Sb.d.b(strA).intValue());
        c14713a.G(Sb.d.a(strA).intValue());
        c14713a.y((byte) 3);
        return c14713a;
    }
}
