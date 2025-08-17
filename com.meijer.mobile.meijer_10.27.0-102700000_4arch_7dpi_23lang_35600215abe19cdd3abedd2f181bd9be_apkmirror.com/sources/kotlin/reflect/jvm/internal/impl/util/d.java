package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes13.dex */
class d implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f147155a = new d();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return OperatorChecks.g((FunctionDescriptor) obj);
    }
}
