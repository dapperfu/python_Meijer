package Dv;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LBv/f;", "", "typeParams", "", "a", "(LBv/f;[LBv/f;)I", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Dv.f0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3138f0 {
    public static final int a(Bv.f fVar, Bv.f[] typeParams) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(typeParams, "typeParams");
        int iHashCode = (fVar.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<Bv.f> iterableA = Bv.j.a(fVar);
        Iterator<Bv.f> it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String serialName = it.next().getSerialName();
            if (serialName != null) {
                iHashCode3 = serialName.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator<Bv.f> it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            Bv.m mVarF = it2.next().f();
            iHashCode2 = i12 + (mVarF != null ? mVarF.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
