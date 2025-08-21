package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final GivenFunctionsMemberScope f147214a;

    public a(GivenFunctionsMemberScope givenFunctionsMemberScope) {
        this.f147214a = givenFunctionsMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return GivenFunctionsMemberScope.i(this.f147214a);
    }
}
