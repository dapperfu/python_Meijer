package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final NullabilityAnnotationStatesImpl f144380a;

    public h(NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl) {
        this.f144380a = nullabilityAnnotationStatesImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return NullabilityAnnotationStatesImpl.c(this.f144380a, (FqName) obj);
    }
}
