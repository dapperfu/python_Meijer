package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes14.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    private final String f148052a;

    public static final class AtLeast extends ValueParameterCountCheck {

        /* renamed from: b, reason: collision with root package name */
        private final int f148053b;

        public AtLeast(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : "");
            super(sb2.toString(), null);
            this.f148053b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() >= this.f148053b;
        }
    }

    public static final class Equals extends ValueParameterCountCheck {

        /* renamed from: b, reason: collision with root package name */
        private final int f148054b;

        public Equals(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f148054b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() == this.f148054b;
        }
    }

    public static final class NoValueParameters extends ValueParameterCountCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final NoValueParameters f148055b = new NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().isEmpty();
        }
    }

    public static final class SingleValueParameter extends ValueParameterCountCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final SingleValueParameter f148056b = new SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() == 1;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private ValueParameterCountCheck(String str) {
        this.f148052a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f148052a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}
