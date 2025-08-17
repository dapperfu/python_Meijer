package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f146308a;

    public b(Function0 function0) {
        this.f146308a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyScopeAdapter.k(this.f146308a);
    }
}
