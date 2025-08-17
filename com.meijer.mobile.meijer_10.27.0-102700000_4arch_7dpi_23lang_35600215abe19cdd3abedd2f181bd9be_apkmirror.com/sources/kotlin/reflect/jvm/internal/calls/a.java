package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f143205a;

    public a(Map map) {
        this.f143205a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Integer.valueOf(AnnotationConstructorCallerKt.j(this.f143205a));
    }
}
