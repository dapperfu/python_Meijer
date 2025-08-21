package kotlin.reflect;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Lkotlin/reflect/KClass;", "value", "a", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KClasses {
    /* JADX WARN: Multi-variable type inference failed */
    @LowPriorityInOverloadResolution
    @SinceKotlin
    public static final <T> T a(KClass<T> kClass, Object obj) {
        Intrinsics.j(kClass, "<this>");
        if (kClass.s(obj)) {
            Intrinsics.h(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + kClass.t());
    }
}
