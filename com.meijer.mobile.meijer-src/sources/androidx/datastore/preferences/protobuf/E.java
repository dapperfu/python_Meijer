package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C6100y;
import java.util.List;

/* loaded from: classes.dex */
final class E implements D {
    E() {
    }

    static <E> C6100y.i<E> d(Object obj, long j10) {
        return (C6100y.i) o0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void a(Object obj, long j10) {
        d(obj, j10).d();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public <E> void b(Object obj, Object obj2, long j10) {
        C6100y.i iVarD = d(obj, j10);
        C6100y.i iVarD2 = d(obj2, j10);
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
        o0.O(obj, j10, iVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public <L> List<L> c(Object obj, long j10) {
        int i10;
        C6100y.i iVarD = d(obj, j10);
        if (!iVarD.j()) {
            int size = iVarD.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            C6100y.i iVarB = iVarD.b(i10);
            o0.O(obj, j10, iVarB);
            return iVarB;
        }
        return iVarD;
    }
}
