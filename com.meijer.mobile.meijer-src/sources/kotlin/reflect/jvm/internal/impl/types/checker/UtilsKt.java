package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class UtilsKt {
    private static final String b(TypeConstructor typeConstructor) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + typeConstructor, sb2);
        c("hashCode: " + typeConstructor.hashCode(), sb2);
        c("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb2);
        for (DeclarationDescriptor declarationDescriptorD = typeConstructor.d(); declarationDescriptorD != null; declarationDescriptorD = declarationDescriptorD.b()) {
            c("fqName: " + DescriptorRenderer.f146899h.N(declarationDescriptorD), sb2);
            c("javaClass: " + declarationDescriptorD.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        Intrinsics.j(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    public static final KotlinType d(KotlinType subtype, KotlinType supertype, TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        Intrinsics.j(subtype, "subtype");
        Intrinsics.j(supertype, "supertype");
        Intrinsics.j(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new e(subtype, null));
        TypeConstructor typeConstructorK0 = supertype.K0();
        while (!arrayDeque.isEmpty()) {
            e eVar = (e) arrayDeque.poll();
            KotlinType kotlinTypeB = eVar.b();
            TypeConstructor typeConstructorK02 = kotlinTypeB.K0();
            if (typeCheckingProcedureCallbacks.a(typeConstructorK02, typeConstructorK0)) {
                boolean zL0 = kotlinTypeB.L0();
                for (e eVarA = eVar.a(); eVarA != null; eVarA = eVarA.a()) {
                    KotlinType kotlinTypeB2 = eVarA.b();
                    List<TypeProjection> listI0 = kotlinTypeB2.I0();
                    if ((listI0 instanceof Collection) && listI0.isEmpty()) {
                        kotlinTypeB = TypeConstructorSubstitution.f147669c.a(kotlinTypeB2).c().n(kotlinTypeB, Variance.f147703e);
                        Intrinsics.g(kotlinTypeB);
                    } else {
                        Iterator<T> it = listI0.iterator();
                        while (it.hasNext()) {
                            Variance varianceC = ((TypeProjection) it.next()).c();
                            Variance variance = Variance.f147703e;
                            if (varianceC != variance) {
                                KotlinType kotlinTypeN = CapturedTypeConstructorKt.h(TypeConstructorSubstitution.f147669c.a(kotlinTypeB2), false, 1, null).c().n(kotlinTypeB, variance);
                                Intrinsics.i(kotlinTypeN, "safeSubstitute(...)");
                                kotlinTypeB = a(kotlinTypeN);
                                break;
                            }
                        }
                        kotlinTypeB = TypeConstructorSubstitution.f147669c.a(kotlinTypeB2).c().n(kotlinTypeB, Variance.f147703e);
                        Intrinsics.g(kotlinTypeB);
                    }
                    zL0 = zL0 || kotlinTypeB2.L0();
                }
                TypeConstructor typeConstructorK03 = kotlinTypeB.K0();
                if (typeCheckingProcedureCallbacks.a(typeConstructorK03, typeConstructorK0)) {
                    return TypeUtils.p(kotlinTypeB, zL0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(typeConstructorK03) + ", \n\nsupertype: " + b(typeConstructorK0) + " \n" + typeCheckingProcedureCallbacks.a(typeConstructorK03, typeConstructorK0));
            }
            for (KotlinType kotlinType : typeConstructorK02.a()) {
                Intrinsics.g(kotlinType);
                arrayDeque.add(new e(kotlinType, eVar));
            }
        }
        return null;
    }

    private static final KotlinType a(KotlinType kotlinType) {
        return CapturedTypeApproximationKt.b(kotlinType).d();
    }
}
