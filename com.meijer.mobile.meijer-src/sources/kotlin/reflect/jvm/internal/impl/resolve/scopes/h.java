package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;

/* loaded from: classes14.dex */
class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f147221a = new h();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return TypeIntersectionScope.o((SimpleFunctionDescriptor) obj);
    }
}
