package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* loaded from: classes14.dex */
class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeSubstitutor f147219a;

    public f(TypeSubstitutor typeSubstitutor) {
        this.f147219a = typeSubstitutor;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return SubstitutingScope.n(this.f147219a);
    }
}
