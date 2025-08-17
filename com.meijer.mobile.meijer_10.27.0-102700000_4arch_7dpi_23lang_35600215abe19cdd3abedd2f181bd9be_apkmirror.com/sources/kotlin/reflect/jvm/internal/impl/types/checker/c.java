package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f146852a;

    public c(List list) {
        this.f146852a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.p(this.f146852a);
    }
}
