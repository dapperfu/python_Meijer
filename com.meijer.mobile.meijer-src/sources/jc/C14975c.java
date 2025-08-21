package jc;

import ic.f;

/* renamed from: jc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14975c implements InterfaceC14974b {
    @Override // jc.InterfaceC14974b
    public f parse(String str) {
        InterfaceC14974b[] interfaceC14974bArr = {new C14973a(), new C14976d()};
        f fVar = null;
        for (int i10 = 0; i10 < 2; i10++) {
            fVar = interfaceC14974bArr[i10].parse(str);
            if (fVar != null) {
                break;
            }
        }
        return fVar;
    }
}
