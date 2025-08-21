package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
class M implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Name f145449a;

    public M(Name name) {
        this.f145449a = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaStaticClassScope.n0(this.f145449a, (MemberScope) obj);
    }
}
