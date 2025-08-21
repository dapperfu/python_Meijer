package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
class r implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final LazyJavaClassMemberScope f145473a;

    public r(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f145473a = lazyJavaClassMemberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaClassMemberScope.B0(this.f145473a, (Name) obj);
    }
}
