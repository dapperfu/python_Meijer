package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes14.dex */
public abstract class MemberKindCheck implements Check {

    /* renamed from: a, reason: collision with root package name */
    private final String f147975a;

    public static final class Member extends MemberKindCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final Member f147976b = new Member();

        private Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return functionDescriptor.J() != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {

        /* renamed from: b, reason: collision with root package name */
        public static final MemberOrExtension f147977b = new MemberOrExtension();

        private MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean b(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.J() == null && functionDescriptor.N() == null) ? false : true;
        }
    }

    public /* synthetic */ MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private MemberKindCheck(String str) {
        this.f147975a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.f147975a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String a(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.a(this, functionDescriptor);
    }
}
