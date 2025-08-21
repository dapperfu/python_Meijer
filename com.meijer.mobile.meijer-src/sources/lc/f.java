package lc;

import com.medallia.digital.mobilesdk.l3;
import eb.C13784a;
import eb.C13785b;
import kc.C15116a;

/* loaded from: classes4.dex */
public class f implements InterfaceC15480b {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f149576a = C13785b.a(f.class.getName());

    @Override // lc.InterfaceC15480b
    public final void a(C15116a c15116a, byte[] bArr) {
        try {
            String strB = c15116a.b();
            if ("01".equals(c15116a.c()) && strB != null && bArr != null) {
                byte[] bArrB = Ub.a.b(strB);
                if (bArrB.length == bArr.length) {
                    int i10 = ((bArr[0] ^ bArrB[0]) & l3.f93323c) - 70;
                    int i11 = ((bArr[1] ^ bArrB[1]) & 224) >> 5;
                    c15116a.G(i10);
                    c15116a.q(i11 / 2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
