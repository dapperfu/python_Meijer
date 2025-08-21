package lc;

import Xb.h;
import Xb.l;
import java.util.Arrays;
import java.util.Date;
import kc.C15116a;

/* renamed from: lc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15482d implements InterfaceC15479a {
    @Override // lc.InterfaceC15479a
    public final C15116a a(l lVar, int i10) {
        String strA = h.a(Ub.a.a(lVar.f41817a));
        C15116a c15116a = new C15116a();
        c15116a.E(0L);
        c15116a.J((byte) 0);
        c15116a.F(strA);
        c15116a.C(i10);
        byte[] bArr = lVar.f41818b.f41837b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, 5);
        byte b10 = (byte) (((byte) (bArr[5] & 255)) - 70);
        byte b11 = (byte) ((bArr[6] & 255) >> 6);
        c15116a.G(b10);
        c15116a.q(b11);
        c15116a.A(Ub.a.a(bArrCopyOfRange));
        c15116a.r(new Date());
        c15116a.y((byte) 2);
        return c15116a;
    }
}
