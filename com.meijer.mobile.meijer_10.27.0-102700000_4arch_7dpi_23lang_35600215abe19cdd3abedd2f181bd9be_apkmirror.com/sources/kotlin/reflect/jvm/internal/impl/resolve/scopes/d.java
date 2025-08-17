package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class d implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final StaticScopeForKotlinEnum f146310a;

    public d(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.f146310a = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return StaticScopeForKotlinEnum.j(this.f146310a);
    }
}
