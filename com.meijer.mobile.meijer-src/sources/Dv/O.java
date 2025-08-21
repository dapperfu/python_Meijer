package Dv;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LDv/O;", "LDv/u0;", "", "<init>", "()V", "LBv/f;", "", "index", "e0", "(LBv/f;I)Ljava/lang/String;", "nestedName", "f0", "(Ljava/lang/String;)Ljava/lang/String;", "descriptor", "d0", "parentName", "childName", "c0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "g0", "()Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class O extends u0<String> {
    protected abstract String c0(String parentName, String childName);

    protected String d0(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return descriptor.j(index);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.u0
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final String X(Bv.f fVar, int i10) {
        Intrinsics.j(fVar, "<this>");
        return f0(d0(fVar, i10));
    }

    protected final String f0(String nestedName) {
        Intrinsics.j(nestedName, "nestedName");
        String strW = W();
        if (strW == null) {
            strW = "";
        }
        return c0(strW, nestedName);
    }

    protected final String g0() {
        if (Y().isEmpty()) {
            return "$";
        }
        return CollectionsKt.B0(Y(), ".", "$.", null, 0, null, null, 60, null);
    }
}
