package jc;

import cb.C6380a;
import cb.C6381b;
import com.medallia.digital.mobilesdk.l3;
import ic.C14713a;

/* loaded from: classes4.dex */
public class f implements InterfaceC14881b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f139562a = C6381b.a(f.class.getName());

    @Override // jc.InterfaceC14881b
    public final void a(C14713a c14713a, byte[] bArr) {
        try {
            String strB = c14713a.b();
            if ("01".equals(c14713a.c()) && strB != null && bArr != null) {
                byte[] bArrB = Sb.a.b(strB);
                if (bArrB.length == bArr.length) {
                    int i10 = ((bArr[0] ^ bArrB[0]) & l3.f92484c) - 70;
                    int i11 = ((bArr[1] ^ bArrB[1]) & 224) >> 5;
                    c14713a.G(i10);
                    c14713a.q(i11 / 2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
