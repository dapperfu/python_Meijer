package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f144690a;

    public f(FqName fqName) {
        this.f144690a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(PackageFragmentProviderImpl.g(this.f144690a, (FqName) obj));
    }
}
