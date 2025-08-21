package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Set f147764a;

    public g(Set set) {
        this.f147764a = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return TypeIntersector.f(this.f147764a);
    }
}
