package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f145017a = new b();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return ReflectClassUtilKt.b((ParameterizedType) obj);
    }
}
