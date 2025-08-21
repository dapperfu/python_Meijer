package Dv;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LDv/G;", "LDv/M;", "LBv/f;", "keyDesc", "valueDesc", "<init>", "(LBv/f;LBv/f;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class G extends M {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Bv.f keyDesc, Bv.f valueDesc) {
        super("kotlin.collections.LinkedHashMap", keyDesc, valueDesc, null);
        Intrinsics.j(keyDesc, "keyDesc");
        Intrinsics.j(valueDesc, "valueDesc");
    }
}
