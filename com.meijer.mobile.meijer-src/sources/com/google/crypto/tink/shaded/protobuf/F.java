package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C11454z;
import java.util.List;

/* loaded from: classes8.dex */
final class F implements E {
    F() {
    }

    static <E> C11454z.i<E> d(Object obj, long j10) {
        return (C11454z.i) o0.C(obj, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public void a(Object obj, long j10) {
        d(obj, j10).d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public <E> void b(Object obj, Object obj2, long j10) {
        C11454z.i iVarD = d(obj, j10);
        C11454z.i iVarD2 = d(obj2, j10);
        int size = iVarD.size();
        int size2 = iVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!iVarD.j()) {
                iVarD = iVarD.b(size2 + size);
            }
            iVarD.addAll(iVarD2);
        }
        if (size > 0) {
            iVarD2 = iVarD;
        }
        o0.R(obj, j10, iVarD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public <L> List<L> c(Object obj, long j10) {
        int i10;
        C11454z.i iVarD = d(obj, j10);
        if (!iVarD.j()) {
            int size = iVarD.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            C11454z.i iVarB = iVarD.b(i10);
            o0.R(obj, j10, iVarB);
            return iVarB;
        }
        return iVarD;
    }
}
