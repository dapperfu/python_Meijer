package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* loaded from: classes14.dex */
class y0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f148135a = new y0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectionObjectRenderer.g((ValueParameterDescriptor) obj);
    }
}
