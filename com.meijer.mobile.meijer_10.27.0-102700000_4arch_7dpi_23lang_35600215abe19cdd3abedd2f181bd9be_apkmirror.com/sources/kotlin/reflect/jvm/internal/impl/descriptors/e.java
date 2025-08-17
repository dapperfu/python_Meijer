package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f143782a = new e();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return PackageFragmentProviderImpl.f((PackageFragmentDescriptor) obj);
    }
}
