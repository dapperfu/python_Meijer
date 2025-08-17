package jc;

import Vb.h;
import Vb.l;
import ic.C14713a;
import java.util.Arrays;
import java.util.Date;

/* renamed from: jc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14883d implements InterfaceC14880a {
    @Override // jc.InterfaceC14880a
    public final C14713a a(l lVar, int i10) {
        String strA = h.a(Sb.a.a(lVar.f37105a));
        C14713a c14713a = new C14713a();
        c14713a.E(0L);
        c14713a.J((byte) 0);
        c14713a.F(strA);
        c14713a.C(i10);
        byte[] bArr = lVar.f37106b.f37125b;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, 5);
        byte b10 = (byte) (((byte) (bArr[5] & 255)) - 70);
        byte b11 = (byte) ((bArr[6] & 255) >> 6);
        c14713a.G(b10);
        c14713a.q(b11);
        c14713a.A(Sb.a.a(bArrCopyOfRange));
        c14713a.r(new Date());
        c14713a.y((byte) 2);
        return c14713a;
    }
}
