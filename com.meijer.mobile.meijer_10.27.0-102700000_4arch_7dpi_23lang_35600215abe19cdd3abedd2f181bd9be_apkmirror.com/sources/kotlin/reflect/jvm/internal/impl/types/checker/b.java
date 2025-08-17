package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f146851a;

    public b(List list) {
        this.f146851a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return NewCapturedTypeConstructor.f(this.f146851a);
    }
}
