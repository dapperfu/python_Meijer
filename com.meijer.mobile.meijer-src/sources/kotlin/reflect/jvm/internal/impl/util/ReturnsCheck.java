package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes14.dex */
public abstract class ReturnsCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    private final String f148044a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<KotlinBuiltIns, KotlinType> f148045b;

    /* renamed from: c, reason: collision with root package name */
    private final String f148046c;

    public static final class ReturnsBoolean extends ReturnsCheck {

        /* renamed from: d, reason: collision with root package name */
        public static final ReturnsBoolean f148047d = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", f.f148064a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType c(KotlinBuiltIns kotlinBuiltIns) {
            Intrinsics.j(kotlinBuiltIns, "<this>");
            SimpleType simpleTypeO = kotlinBuiltIns.o();
            Intrinsics.i(simpleTypeO, "getBooleanType(...)");
            return simpleTypeO;
        }
    }

    public static final class ReturnsInt extends ReturnsCheck {

        /* renamed from: d, reason: collision with root package name */
        public static final ReturnsInt f148048d = new ReturnsInt();

        private ReturnsInt() {
            super("Int", g.f148065a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType c(KotlinBuiltIns kotlinBuiltIns) {
            Intrinsics.j(kotlinBuiltIns, "<this>");
            SimpleType simpleTypeE = kotlinBuiltIns.E();
            Intrinsics.i(simpleTypeE, "getIntType(...)");
            return simpleTypeE;
        }
    }

    public static final class ReturnsUnit extends ReturnsCheck {

        /* renamed from: d, reason: collision with root package name */
        public static final ReturnsUnit f148049d = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", h.f148066a, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KotlinType c(KotlinBuiltIns kotlinBuiltIns) {
            Intrinsics.j(kotlinBuiltIns, "<this>");
            SimpleType simpleTypeA0 = kotlinBuiltIns.a0();
            Intrinsics.i(simpleTypeA0, "getUnitType(...)");
            return simpleTypeA0;
        }
    }

    public /* synthetic */ ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(String str, Function1<? super KotlinBuiltIns, ? extends KotlinType> function1) {
        this.f148044a = str;
        this.f148045b = function1;
        this.f148046c = "must return " + str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean b(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        return Intrinsics.e(functionDescriptor.getReturnType(), this.f148045b.invoke(DescriptorUtilsKt.m(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f148046c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}
