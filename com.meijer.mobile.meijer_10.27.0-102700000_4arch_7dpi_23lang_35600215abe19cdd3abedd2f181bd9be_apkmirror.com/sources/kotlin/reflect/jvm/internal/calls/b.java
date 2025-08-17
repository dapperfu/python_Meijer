package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f143206a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f143207b;

    public b(Class cls, Map map) {
        this.f143206a = cls;
        this.f143207b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AnnotationConstructorCallerKt.l(this.f143206a, this.f143207b);
    }
}
