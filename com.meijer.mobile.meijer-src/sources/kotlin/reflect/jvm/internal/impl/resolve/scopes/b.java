package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f147215a;

    public b(Function0 function0) {
        this.f147215a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return LazyScopeAdapter.k(this.f147215a);
    }
}
