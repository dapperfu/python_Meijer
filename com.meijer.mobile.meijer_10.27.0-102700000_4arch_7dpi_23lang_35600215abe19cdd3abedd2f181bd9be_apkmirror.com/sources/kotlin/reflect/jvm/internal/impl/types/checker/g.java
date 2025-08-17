package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f146857a;

    public g(Set set) {
        this.f146857a = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeIntersector.f(this.f146857a);
    }
}
