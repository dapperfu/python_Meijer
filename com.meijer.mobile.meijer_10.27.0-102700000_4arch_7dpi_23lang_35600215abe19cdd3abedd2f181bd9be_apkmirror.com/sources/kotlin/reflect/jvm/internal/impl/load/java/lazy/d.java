package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;

/* loaded from: classes13.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragmentProvider f144432a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaPackage f144433b;

    public d(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.f144432a = lazyJavaPackageFragmentProvider;
        this.f144433b = javaPackage;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragmentProvider.f(this.f144432a, this.f144433b);
    }
}
