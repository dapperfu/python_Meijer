package lc;

import Xb.h;
import Xb.l;
import java.util.Date;
import java.util.TimeZone;
import kc.C15116a;

/* loaded from: classes4.dex */
public final class e implements InterfaceC15479a {
    @Override // lc.InterfaceC15479a
    public final C15116a a(l lVar, int i10) {
        byte[] bArr = lVar.f41817a;
        byte[] bArr2 = lVar.f41818b.f41838c;
        if (bArr == null || bArr.length != 16 || bArr2 == null || bArr2.length != 11) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        String strA = h.a(Ub.a.a(bArr));
        String strA2 = Ub.a.a(bArr2);
        C15116a c15116a = new C15116a();
        c15116a.A(strA2);
        c15116a.F(strA);
        c15116a.r(new Date());
        c15116a.C(i10);
        c15116a.I(TimeZone.getDefault().getID());
        c15116a.q(Ub.d.b(strA).intValue());
        c15116a.G(Ub.d.a(strA).intValue());
        c15116a.y((byte) 3);
        return c15116a;
    }
}
