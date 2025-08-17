package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check;

@SourceDebugExtension
/* loaded from: classes13.dex */
final class b implements Check {

    /* renamed from: a, reason: collision with root package name */
    public static final b f147152a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f147153b = "should not have varargs or parameters with default values";

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean b(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        List<ValueParameterDescriptor> listH = functionDescriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            Intrinsics.g(valueParameterDescriptor);
            if (DescriptorUtilsKt.f(valueParameterDescriptor) || valueParameterDescriptor.s0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return f147153b;
    }

    private b() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}
