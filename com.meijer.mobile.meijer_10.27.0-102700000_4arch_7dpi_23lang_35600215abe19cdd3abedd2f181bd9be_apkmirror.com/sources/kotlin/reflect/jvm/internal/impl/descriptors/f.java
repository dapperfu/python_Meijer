package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final FqName f143783a;

    public f(FqName fqName) {
        this.f143783a = fqName;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(PackageFragmentProviderImpl.g(this.f143783a, (FqName) obj));
    }
}
