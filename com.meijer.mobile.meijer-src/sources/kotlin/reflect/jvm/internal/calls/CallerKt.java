package kotlin.reflect.jvm.internal.calls;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u001c\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/Caller;", "", "a", "(Lkotlin/reflect/jvm/internal/calls/Caller;)I", "arity", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallerKt {
    public static final int a(Caller<?> caller) {
        Intrinsics.j(caller, "<this>");
        return caller.a().size();
    }
}
