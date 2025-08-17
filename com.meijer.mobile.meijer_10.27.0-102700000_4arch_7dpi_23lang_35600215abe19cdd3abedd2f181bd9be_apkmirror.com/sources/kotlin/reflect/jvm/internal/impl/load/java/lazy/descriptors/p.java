package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
class p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final SimpleFunctionDescriptor f144563a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144564b;

    public p(SimpleFunctionDescriptor simpleFunctionDescriptor, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f144563a = simpleFunctionDescriptor;
        this.f144564b = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.g1(this.f144563a, this.f144564b, (Name) obj);
    }
}
