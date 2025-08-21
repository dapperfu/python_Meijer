package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes14.dex */
class e implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f148063a = new e();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return OperatorChecks.i((FunctionDescriptor) obj);
    }
}
