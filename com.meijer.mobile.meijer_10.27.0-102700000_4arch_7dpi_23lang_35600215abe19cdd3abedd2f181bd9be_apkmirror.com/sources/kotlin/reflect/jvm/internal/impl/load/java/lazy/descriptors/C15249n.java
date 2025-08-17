package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15249n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f144560a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaResolverContext f144561b;

    public C15249n(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f144560a = lazyJavaClassMemberScope;
        this.f144561b = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.i1(this.f144560a, this.f144561b, (Name) obj);
    }
}
