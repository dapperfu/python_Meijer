package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
class O implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final O f145451a = new O();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return LazyJavaStaticClassScope.r0((KotlinType) obj);
    }
}
