package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes13.dex */
class z0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f147230a = new z0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.i((ValueParameterDescriptor) obj);
    }
}
