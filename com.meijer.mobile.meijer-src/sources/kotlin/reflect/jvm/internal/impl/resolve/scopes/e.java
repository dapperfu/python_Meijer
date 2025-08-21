package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final StaticScopeForKotlinEnum f147218a;

    public e(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.f147218a = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return StaticScopeForKotlinEnum.p(this.f147218a);
    }
}
