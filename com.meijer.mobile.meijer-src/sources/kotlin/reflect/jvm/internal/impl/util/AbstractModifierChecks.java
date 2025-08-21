package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;

/* loaded from: classes14.dex */
public abstract class AbstractModifierChecks {
    public abstract List<Checks> b();

    public final CheckResult a(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        for (Checks checks : b()) {
            if (checks.b(functionDescriptor)) {
                return checks.a(functionDescriptor);
            }
        }
        return CheckResult.IllegalFunctionName.f147963b;
    }
}
