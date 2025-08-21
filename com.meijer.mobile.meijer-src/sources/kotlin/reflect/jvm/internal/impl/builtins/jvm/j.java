package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes14.dex */
class j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final Name f144481a;

    public j(Name name) {
        this.f144481a = name;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.x(this.f144481a, (MemberScope) obj);
    }
}
