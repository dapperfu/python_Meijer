package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a@\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018¢\u0006\u0002\b\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a=\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010!*\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010'\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010)\u001a\u00020\t*\u0006\u0012\u0002\b\u00030&2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010(\u001a\u0019\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010&*\u0004\u0018\u00010,H\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u00100\u001a\u0004\u0018\u00010/*\u0004\u0018\u00010/2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101\"\u001a\u00104\u001a\u0004\u0018\u00010\u001c*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "u", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/util/List;", "n", "(Lkotlin/reflect/jvm/internal/impl/types/SimpleType;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "expectedArgsSize", "", "isDefault", "", "g", "(Lkotlin/reflect/jvm/internal/calls/Caller;ILkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/ExtensionFunctionType;", "isSpecificClass", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Ljava/lang/reflect/Member;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", "i", "(Lkotlin/reflect/jvm/internal/calls/Caller;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/reflect/Method;", "k", "t", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "s", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ValueClassAwareCallerKt {
    public static final Object h(Object obj, CallableMemberDescriptor descriptor) {
        KotlinType kotlinTypeL;
        Class<?> clsT;
        Method methodM;
        Intrinsics.j(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.e((VariableDescriptor) descriptor)) || (kotlinTypeL = l(descriptor)) == null || (clsT = t(kotlinTypeL)) == null || (methodM = m(clsT, descriptor)) == null) ? obj : methodM.invoke(obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <M extends java.lang.reflect.Member> kotlin.reflect.jvm.internal.calls.Caller<M> i(kotlin.reflect.jvm.internal.calls.Caller<? extends M> r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4, boolean r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.a(r4)
            if (r0 != 0) goto L96
            java.util.List r0 = r4.u0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L2b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L49
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.h(r1)
            if (r1 == 0) goto L2f
            goto L96
        L49:
            java.util.List r0 = r4.h()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L62
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L62
            goto L80
        L62:
            java.util.Iterator r0 = r0.iterator()
        L66:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.i(r1, r2)
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.h(r1)
            if (r1 == 0) goto L66
            goto L96
        L80:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r4.getReturnType()
            if (r0 == 0) goto L8e
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.c(r0)
            r1 = 1
            if (r0 != r1) goto L8e
            goto L96
        L8e:
            boolean r0 = q(r4)
            if (r0 == 0) goto L95
            goto L96
        L95:
            return r3
        L96:
            kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller r0 = new kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller
            r0.<init>(r4, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.i(kotlin.reflect.jvm.internal.calls.Caller, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    public static /* synthetic */ Caller j(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(caller, callableMemberDescriptor, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Method k(Class<?> cls, CallableMemberDescriptor callableMemberDescriptor) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", m(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.g(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    public static final Method m(Class<?> cls, CallableMemberDescriptor descriptor) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(cls, "<this>");
        Intrinsics.j(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            Intrinsics.g(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final List<Method> n(SimpleType type) {
        Intrinsics.j(type, "type");
        List<String> listO = o(TypeSubstitutionKt.a(type));
        if (listO == null) {
            return null;
        }
        List<String> list = listO;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorD = type.K0().d();
        Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> clsQ = UtilKt.q((ClassDescriptor) classifierDescriptorD);
        Intrinsics.g(clsQ);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsQ.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KotlinType> r(CallableMemberDescriptor callableMemberDescriptor, Member member, Function1<? super ClassDescriptor, Boolean> function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor receiverParameterDescriptorN = callableMemberDescriptor.N();
        KotlinType type = receiverParameterDescriptorN != null ? receiverParameterDescriptorN.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor classDescriptorA0 = ((ConstructorDescriptor) callableMemberDescriptor).a0();
            Intrinsics.i(classDescriptorA0, "getConstructedClass(...)");
            if (classDescriptorA0.y()) {
                DeclarationDescriptor declarationDescriptorB = classDescriptorA0.b();
                Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((ClassDescriptor) declarationDescriptorB).o());
            }
        } else {
            DeclarationDescriptor declarationDescriptorB2 = callableMemberDescriptor.b();
            Intrinsics.i(declarationDescriptorB2, "getContainingDeclaration(...)");
            if ((declarationDescriptorB2 instanceof ClassDescriptor) && function1.invoke(declarationDescriptorB2).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((ClassDescriptor) declarationDescriptorB2).o());
                } else {
                    SimpleType simpleTypeO = ((ClassDescriptor) declarationDescriptorB2).o();
                    Intrinsics.i(simpleTypeO, "getDefaultType(...)");
                    arrayList.add(TypeUtilsKt.B(simpleTypeO));
                }
            }
        }
        List<ValueParameterDescriptor> listH = callableMemberDescriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        Iterator<T> it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    public static final Class<?> s(DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.b(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> clsQ = UtilKt.q(classDescriptor);
        if (clsQ != null) {
            return clsQ;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.n((ClassifierDescriptor) declarationDescriptor) + ')');
    }

    public static final String u(ClassifierDescriptor classifierDescriptor) {
        Intrinsics.j(classifierDescriptor, "<this>");
        ClassId classIdN = DescriptorUtilsKt.n(classifierDescriptor);
        Intrinsics.g(classIdN);
        return ClassMapperLite.b(classIdN.b());
    }

    private static final boolean a(Member member) {
        if (member.getDeclaringClass() == null) {
            return false;
        }
        return !JvmClassMappingKt.e(r0).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Caller<?> caller, int i10, CallableMemberDescriptor callableMemberDescriptor, boolean z10) {
        if (CallerKt.a(caller) == i10) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.a(caller) + " != " + i10 + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + caller.a() + ")\nDefault: " + z10);
    }

    private static final KotlinType l(CallableMemberDescriptor callableMemberDescriptor) {
        ClassDescriptor classDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptorN = callableMemberDescriptor.N();
        ReceiverParameterDescriptor receiverParameterDescriptorJ = callableMemberDescriptor.J();
        if (receiverParameterDescriptorN != null) {
            return receiverParameterDescriptorN.getType();
        }
        if (receiverParameterDescriptorJ == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            return receiverParameterDescriptorJ.getType();
        }
        DeclarationDescriptor declarationDescriptorB = callableMemberDescriptor.b();
        if (declarationDescriptorB instanceof ClassDescriptor) {
            classDescriptor = (ClassDescriptor) declarationDescriptorB;
        } else {
            classDescriptor = null;
        }
        if (classDescriptor == null) {
            return null;
        }
        return classDescriptor.o();
    }

    private static final List<String> o(SimpleType simpleType) {
        Collection collectionE;
        if (InlineClassesUtilsKt.i(simpleType)) {
            ClassifierDescriptor classifierDescriptorD = simpleType.K0().d();
            Intrinsics.h(classifierDescriptorD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentationT = DescriptorUtilsKt.t((ClassDescriptor) classifierDescriptorD);
            Intrinsics.g(multiFieldValueClassRepresentationT);
            Iterable<Pair> iterableC = multiFieldValueClassRepresentationT.c();
            ArrayList arrayList = new ArrayList();
            for (Pair pair : iterableC) {
                Name name = (Name) pair.a();
                List<String> listO = o((SimpleType) pair.b());
                if (listO != null) {
                    List<String> list = listO;
                    collectionE = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        collectionE.add(name.l() + '-' + ((String) it.next()));
                    }
                } else {
                    collectionE = CollectionsKt.e(name.l());
                }
                CollectionsKt.C(arrayList, collectionE);
            }
            return arrayList;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Method> p(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method methodM;
        List<Method> listN = n(simpleType);
        if (listN == null) {
            Class<?> clsT = t(simpleType);
            if (clsT != null && (methodM = m(clsT, callableMemberDescriptor)) != null) {
                return CollectionsKt.e(methodM);
            }
            return null;
        }
        return listN;
    }

    private static final boolean q(CallableMemberDescriptor callableMemberDescriptor) {
        KotlinType kotlinTypeL = l(callableMemberDescriptor);
        if (kotlinTypeL == null || !InlineClassesUtilsKt.h(kotlinTypeL)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> t(KotlinType kotlinType) {
        KotlinType kotlinTypeK;
        Class<?> clsS = s(kotlinType.K0().d());
        if (clsS == null) {
            return null;
        }
        if (TypeUtils.l(kotlinType) && ((kotlinTypeK = InlineClassesUtilsKt.k(kotlinType)) == null || TypeUtils.l(kotlinTypeK) || KotlinBuiltIns.t0(kotlinTypeK))) {
            return null;
        }
        return clsS;
    }
}
