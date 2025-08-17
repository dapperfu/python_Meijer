package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f143213a = new d();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AnnotationConstructorCallerKt.m((Map.Entry) obj);
    }
}
