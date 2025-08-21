package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes14.dex */
class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f144112a;

    public a(Map map) {
        this.f144112a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Integer.valueOf(AnnotationConstructorCallerKt.j(this.f144112a));
    }
}
