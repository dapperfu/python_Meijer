package lc;

import Xb.h;
import Xb.l;
import eb.C13784a;
import eb.C13785b;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import kc.C15116a;

/* loaded from: classes4.dex */
public class g implements InterfaceC15479a {

    /* renamed from: a, reason: collision with root package name */
    private final C13784a f149577a = C13785b.a(g.class.getSimpleName());

    @Override // lc.InterfaceC15479a
    public final C15116a a(l lVar, int i10) {
        byte[] bArr = lVar.f41817a;
        byte[] bArr2 = lVar.f41818b.f41838c;
        if (bArr == null || bArr.length != 2 || bArr2 == null || bArr2.length != 25) {
            throw new com.gimbal.proximity.core.b.b(com.gimbal.proximity.core.b.a.PROXIMITY_INTERNAL_BLE_ADV_INVALID);
        }
        Ub.a.a(bArr2);
        String strA = h.a(Ub.a.a(bArr));
        String strA2 = Ub.a.a(Arrays.copyOfRange(bArr2, 3, 19));
        String strA3 = Ub.a.a(Arrays.copyOfRange(bArr2, 2, 3));
        String strA4 = Ub.a.a(Arrays.copyOfRange(bArr2, 19, 25));
        C15116a c15116a = new C15116a();
        c15116a.A(strA2);
        c15116a.F(strA);
        c15116a.r(new Date());
        c15116a.C(i10);
        c15116a.I(TimeZone.getDefault().getID());
        c15116a.y((byte) 4);
        c15116a.v(strA3);
        c15116a.t(strA4);
        return c15116a;
    }
}
