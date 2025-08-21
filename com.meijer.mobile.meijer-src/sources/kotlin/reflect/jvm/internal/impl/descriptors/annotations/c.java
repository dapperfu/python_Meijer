package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f144680a;

    public c(FqName fqName) {
        this.f144680a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return CompositeAnnotations.h(this.f144680a, (Annotations) obj);
    }
}
