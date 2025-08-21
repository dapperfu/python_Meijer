package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;

/* loaded from: classes14.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaPackageFragmentProvider f145339a;

    /* renamed from: b, reason: collision with root package name */
    private final JavaPackage f145340b;

    public d(LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, JavaPackage javaPackage) {
        this.f145339a = lazyJavaPackageFragmentProvider;
        this.f145340b = javaPackage;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyJavaPackageFragmentProvider.f(this.f145339a, this.f145340b);
    }
}
