package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityAnnotationStatesImpl f145287a;

    public h(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        this.f145287a = nullabilityAnnotationStatesImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NullabilityAnnotationStatesImpl.c(this.f145287a, (FqName) obj);
    }
}
