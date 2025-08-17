package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\u0006\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/C1;", "Landroidx/compose/runtime/n1;", "", "<init>", "()V", "a", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C1 implements n1<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1 f49894a = new C1();

    public String toString() {
        return "StructuralEqualityPolicy";
    }

    private C1() {
    }

    @Override // androidx.compose.runtime.n1
    public boolean b(Object a10, Object b10) {
        return Intrinsics.e(a10, b10);
    }
}
