package hc;

import gc.f;

/* renamed from: hc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14397c implements InterfaceC14396b {
    @Override // hc.InterfaceC14396b
    public f parse(String str) {
        InterfaceC14396b[] interfaceC14396bArr = {new C14395a(), new C14398d()};
        f fVar = null;
        for (int i10 = 0; i10 < 2; i10++) {
            fVar = interfaceC14396bArr[i10].parse(str);
            if (fVar != null) {
                break;
            }
        }
        return fVar;
    }
}
