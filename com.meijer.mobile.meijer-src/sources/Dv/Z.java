package Dv;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.MissingFieldException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "seen", "goldenMask", "LBv/f;", "descriptor", "", "a", "(IILBv/f;)V", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Z {
    public static final void a(int i10, int i11, Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(descriptor.j(i13));
            }
            i12 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.m());
    }
}
