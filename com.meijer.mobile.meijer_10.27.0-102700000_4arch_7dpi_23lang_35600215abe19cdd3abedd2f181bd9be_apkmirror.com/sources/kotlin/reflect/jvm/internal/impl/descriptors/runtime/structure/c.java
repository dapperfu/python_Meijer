package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.jvm.functions.Function1;

/* loaded from: classes13.dex */
class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f144111a = new c();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(ReflectJavaClass.Q((Class) obj));
    }
}
