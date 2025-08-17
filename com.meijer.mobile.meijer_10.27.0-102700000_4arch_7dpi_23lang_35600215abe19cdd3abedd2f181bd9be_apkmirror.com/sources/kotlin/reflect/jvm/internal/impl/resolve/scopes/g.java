package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final SubstitutingScope f146313a;

    public g(SubstitutingScope substitutingScope) {
        this.f146313a = substitutingScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.h(this.f146313a);
    }
}
