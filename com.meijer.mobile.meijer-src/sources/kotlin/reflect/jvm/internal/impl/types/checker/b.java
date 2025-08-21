package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f147758a;

    public b(List list) {
        this.f147758a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.f(this.f147758a);
    }
}
