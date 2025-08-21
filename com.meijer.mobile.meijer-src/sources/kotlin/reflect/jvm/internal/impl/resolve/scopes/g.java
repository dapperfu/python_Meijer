package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final SubstitutingScope f147220a;

    public g(SubstitutingScope substitutingScope) {
        this.f147220a = substitutingScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.h(this.f147220a);
    }
}
