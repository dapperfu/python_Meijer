package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
class p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KotlinTypeRefiner f147935a;

    /* renamed from: b, reason: collision with root package name */
    private final LazyWrappedType f147936b;

    public p(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        this.f147935a = kotlinTypeRefiner;
        this.f147936b = lazyWrappedType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyWrappedType.S0(this.f147935a, this.f147936b);
    }
}
