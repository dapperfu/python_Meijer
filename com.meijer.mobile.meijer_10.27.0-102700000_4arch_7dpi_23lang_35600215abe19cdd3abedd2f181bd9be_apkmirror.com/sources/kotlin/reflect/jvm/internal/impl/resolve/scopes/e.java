package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class e implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final StaticScopeForKotlinEnum f146311a;

    public e(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.f146311a = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return StaticScopeForKotlinEnum.p(this.f146311a);
    }
}
