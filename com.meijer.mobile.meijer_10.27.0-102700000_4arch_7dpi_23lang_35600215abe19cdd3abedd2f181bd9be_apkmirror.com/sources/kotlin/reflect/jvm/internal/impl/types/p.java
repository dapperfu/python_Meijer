package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinTypeRefiner f147028a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyWrappedType f147029b;

    public p(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        this.f147028a = kotlinTypeRefiner;
        this.f147029b = lazyWrappedType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyWrappedType.S0(this.f147028a, this.f147029b);
    }
}
