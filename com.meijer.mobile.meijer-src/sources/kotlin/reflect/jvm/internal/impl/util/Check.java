package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* loaded from: classes14.dex */
public interface Check {

    public static final class DefaultImpls {
        public static String a(Check check, FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            if (check.b(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }

    String a(FunctionDescriptor functionDescriptor);

    boolean b(FunctionDescriptor functionDescriptor);

    String getDescription();
}
