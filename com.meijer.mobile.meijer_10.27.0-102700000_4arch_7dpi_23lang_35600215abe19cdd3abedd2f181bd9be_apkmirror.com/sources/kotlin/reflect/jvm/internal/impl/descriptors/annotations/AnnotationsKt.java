package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class AnnotationsKt {
    public static final Annotations a(Annotations first, Annotations second) {
        Intrinsics.j(first, "first");
        Intrinsics.j(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
