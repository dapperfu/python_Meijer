package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
class q implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145472a;

    public q(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145472a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.A0(this.f145472a, (Name) obj);
    }
}
