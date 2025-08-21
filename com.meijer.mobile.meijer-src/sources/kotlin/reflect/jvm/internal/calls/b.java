package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f144113a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f144114b;

    public b(Class cls, Map map) {
        this.f144113a = cls;
        this.f144114b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return AnnotationConstructorCallerKt.l(this.f144113a, this.f144114b);
    }
}
