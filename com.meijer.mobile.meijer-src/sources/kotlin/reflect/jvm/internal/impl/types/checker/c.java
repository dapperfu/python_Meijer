package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f147759a;

    public c(List list) {
        this.f147759a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.p(this.f147759a);
    }
}
