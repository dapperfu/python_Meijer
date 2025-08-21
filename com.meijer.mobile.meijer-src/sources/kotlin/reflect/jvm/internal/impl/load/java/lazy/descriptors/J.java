package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* loaded from: classes14.dex */
class J implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final J f145359a = new J();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaScope.f0((SimpleFunctionDescriptor) obj);
    }
}
