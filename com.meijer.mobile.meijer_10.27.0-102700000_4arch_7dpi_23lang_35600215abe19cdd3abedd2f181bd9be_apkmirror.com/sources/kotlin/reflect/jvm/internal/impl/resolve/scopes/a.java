package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final GivenFunctionsMemberScope f146307a;

    public a(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f146307a = givenFunctionsMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return GivenFunctionsMemberScope.i(this.f146307a);
    }
}
