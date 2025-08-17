package Hv;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"LFv/f;", "", "", "a", "(LFv/f;)Ljava/util/Set;", "", "", "b", "(Ljava/util/List;)[LFv/f;", "[LFv/f;", "EMPTY_DESCRIPTOR_ARRAY", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Fv.f[] f13309a = new Fv.f[0];

    public static final Fv.f[] b(List<? extends Fv.f> list) {
        Fv.f[] fVarArr;
        List<? extends Fv.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (Fv.f[]) list.toArray(new Fv.f[0])) == null) ? f13309a : fVarArr;
    }

    public static final Set<String> a(Fv.f fVar) {
        Intrinsics.j(fVar, "<this>");
        if (fVar instanceof InterfaceC3705l) {
            return ((InterfaceC3705l) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.i());
        int i10 = fVar.i();
        for (int i11 = 0; i11 < i10; i11++) {
            hashSet.add(fVar.j(i11));
        }
        return hashSet;
    }
}
