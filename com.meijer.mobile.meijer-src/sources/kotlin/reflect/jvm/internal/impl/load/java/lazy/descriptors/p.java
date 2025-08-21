package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleFunctionDescriptor f145470a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145471b;

    public p(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145470a = simpleFunctionDescriptor;
        this.f145471b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.g1(this.f145470a, this.f145471b, (Name) obj);
    }
}
