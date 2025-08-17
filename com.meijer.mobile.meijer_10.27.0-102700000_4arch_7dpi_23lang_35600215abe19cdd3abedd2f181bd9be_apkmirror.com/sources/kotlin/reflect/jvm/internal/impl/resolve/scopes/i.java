package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes13.dex */
class i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f146315a = new i();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.p((PropertyDescriptor) obj);
    }
}
