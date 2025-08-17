package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.MemberKindCheck;
import kotlin.reflect.jvm.internal.impl.util.ReturnsCheck;
import kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OperatorChecks extends AbstractModifierChecks {

    /* renamed from: a, reason: collision with root package name */
    public static final OperatorChecks f147076a = new OperatorChecks();

    /* renamed from: b, reason: collision with root package name */
    private static final List<Checks> f147077b;

    static {
        Name name = OperatorNameConventions.f147121k;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.f147070b;
        Checks checks = new Checks(name, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(1)}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks2 = new Checks(OperatorNameConventions.f147122l, new Check[]{memberOrExtension, new ValueParameterCountCheck.AtLeast(2)}, c.f147154a);
        Name name2 = OperatorNameConventions.f147106b;
        b bVar = b.f147152a;
        ValueParameterCountCheck.AtLeast atLeast = new ValueParameterCountCheck.AtLeast(2);
        a aVar = a.f147150a;
        Checks checks3 = new Checks(name2, new Check[]{memberOrExtension, bVar, atLeast, aVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks4 = new Checks(OperatorNameConventions.f147108c, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.AtLeast(3), aVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks5 = new Checks(OperatorNameConventions.f147110d, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.Equals(2), aVar}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Checks checks6 = new Checks(OperatorNameConventions.f147119i, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name3 = OperatorNameConventions.f147118h;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.f147149b;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.f147140d;
        Checks checks7 = new Checks(name3, new Check[]{memberOrExtension, singleValueParameter, bVar, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null);
        Name name4 = OperatorNameConventions.f147120j;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.f147148b;
        f147077b = CollectionsKt.p(checks, checks2, checks3, checks4, checks5, checks6, checks7, new Checks(name4, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147123m, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147124n, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147085H, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147086I, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147112e, new Check[]{MemberKindCheck.Member.f147069b}, d.f147155a), new Checks(OperatorNameConventions.f147116g, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.f147141d, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147101X, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147100W, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt.p(OperatorNameConventions.f147134x, OperatorNameConventions.f147135y), new Check[]{memberOrExtension}, e.f147156a), new Checks(OperatorNameConventions.f147109c0, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.f147142d, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.f147126p, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(FunctionDescriptor Checks) {
        Intrinsics.j(Checks, "$this$Checks");
        List<ValueParameterDescriptor> listH = Checks.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.F0(listH);
        boolean z10 = false;
        if (valueParameterDescriptor != null && !DescriptorUtilsKt.f(valueParameterDescriptor) && valueParameterDescriptor.s0() == null) {
            z10 = true;
        }
        if (z10) {
            return null;
        }
        return "last parameter should not have a default value or be a vararg";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[EDGE_INSN: B:27:0x0050->B:17:0x0050 BREAK  A[LOOP:0: B:8:0x002d->B:28:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String g(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3) {
        /*
            java.lang.String r0 = "$this$Checks"
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r3.b()
            java.lang.String r1 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            boolean r0 = h(r0)
            if (r0 != 0) goto L50
            java.util.Collection r0 = r3.d()
            java.lang.String r2 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L29
            goto L47
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.b()
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            boolean r2 = h(r2)
            if (r2 == 0) goto L2d
            goto L50
        L47:
            boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.c(r3)
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            r0 = 0
            goto L51
        L50:
            r0 = 1
        L51:
            if (r0 != 0) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "must override ''equals()'' in Any"
            r0.append(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r3.b()
            kotlin.jvm.internal.Intrinsics.i(r2, r1)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.g(r2)
            if (r1 == 0) goto La1
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer r1 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.f145994j
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r3.b()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.Intrinsics.h(r3, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.types.SimpleType r3 = r3.o()
            java.lang.String r2 = "getDefaultType(...)"
            kotlin.jvm.internal.Intrinsics.i(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.D(r3)
            java.lang.String r3 = r1.T(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " or define ''equals(other: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "): Boolean''"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
        La1:
            java.lang.String r3 = r0.toString()
            return r3
        La6:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks.g(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
    }

    private static final boolean h(DeclarationDescriptor declarationDescriptor) {
        return (declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.b0((ClassDescriptor) declarationDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String i(FunctionDescriptor Checks) {
        boolean zW;
        Intrinsics.j(Checks, "$this$Checks");
        ReceiverParameterDescriptor receiverParameterDescriptorJ = Checks.J();
        if (receiverParameterDescriptorJ == null) {
            receiverParameterDescriptorJ = Checks.N();
        }
        OperatorChecks operatorChecks = f147076a;
        boolean z10 = false;
        if (receiverParameterDescriptorJ != null) {
            KotlinType returnType = Checks.getReturnType();
            if (returnType != null) {
                KotlinType type = receiverParameterDescriptorJ.getType();
                Intrinsics.i(type, "getType(...)");
                zW = TypeUtilsKt.w(returnType, type);
            } else {
                zW = false;
            }
            if (zW || operatorChecks.j(Checks, receiverParameterDescriptorJ)) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return "receiver must be a supertype of the return type";
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    public List<Checks> b() {
        return f147077b;
    }

    private OperatorChecks() {
    }

    private final boolean j(FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classIdN;
        TypeAliasDescriptor typeAliasDescriptor;
        KotlinType returnType;
        ReceiverValue value = receiverParameterDescriptor.getValue();
        Intrinsics.i(value, "getValue(...)");
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptorS = ((ImplicitClassReceiver) value).s();
        if (!classDescriptorS.h0() || (classIdN = DescriptorUtilsKt.n(classDescriptorS)) == null) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorC = FindClassInModuleKt.c(DescriptorUtilsKt.s(classDescriptorS), classIdN);
        if (classifierDescriptorC instanceof TypeAliasDescriptor) {
            typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorC;
        } else {
            typeAliasDescriptor = null;
        }
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.w(returnType, typeAliasDescriptor.F());
    }
}
