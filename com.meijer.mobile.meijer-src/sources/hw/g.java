package hw;

import gw.I;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "value", "fromIndex", "toIndex", "a", "([IIII)I", "Lgw/I;", "pos", "b", "(Lgw/I;I)I", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class g {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        Intrinsics.j(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(I i10, int i11) {
        Intrinsics.j(i10, "<this>");
        int iA = a(i10.getDirectory(), i11 + 1, 0, i10.getSegments().length);
        return iA >= 0 ? iA : ~iA;
    }
}
