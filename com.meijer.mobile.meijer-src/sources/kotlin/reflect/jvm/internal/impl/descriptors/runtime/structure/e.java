package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final ReflectJavaClass f145020a;

    public e(ReflectJavaClass reflectJavaClass) {
        this.f145020a = reflectJavaClass;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.S(this.f145020a, (Method) obj));
    }
}
