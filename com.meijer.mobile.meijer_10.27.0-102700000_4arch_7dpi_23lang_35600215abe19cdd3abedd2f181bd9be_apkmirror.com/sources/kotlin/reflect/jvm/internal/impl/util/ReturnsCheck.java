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

/* loaded from: classes13.dex */
public abstract class ReturnsCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    private final String f147137a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<KotlinBuiltIns, KotlinType> f147138b;

    /* renamed from: c, reason: collision with root package name */
    private final String f147139c;

    public static final class ReturnsBoolean extends ReturnsCheck {

        /* renamed from: d, reason: collision with root package name */
        public static final ReturnsBoolean f147140d = new ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", f.f147157a, null);
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
        public static final ReturnsInt f147141d = new ReturnsInt();

        private ReturnsInt() {
            super("Int", g.f147158a, null);
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
        public static final ReturnsUnit f147142d = new ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", h.f147159a, null);
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
        this.f147137a = str;
        this.f147138b = function1;
        this.f147139c = "must return " + str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean b(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        return Intrinsics.e(functionDescriptor.getReturnType(), this.f147138b.invoke(DescriptorUtilsKt.m(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f147139c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}
