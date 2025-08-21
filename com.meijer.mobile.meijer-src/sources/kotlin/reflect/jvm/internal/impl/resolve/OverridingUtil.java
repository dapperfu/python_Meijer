package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes14.dex */
public class OverridingUtil {

    /* renamed from: e, reason: collision with root package name */
    private static final List<ExternalOverridabilityCondition> f147038e = CollectionsKt.j1(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final OverridingUtil f147039f;

    /* renamed from: g, reason: collision with root package name */
    private static final KotlinTypeChecker.TypeConstructorEquality f147040g;

    /* renamed from: a, reason: collision with root package name */
    private final KotlinTypeRefiner f147041a;

    /* renamed from: b, reason: collision with root package name */
    private final KotlinTypePreparator f147042b;

    /* renamed from: c, reason: collision with root package name */
    private final KotlinTypeChecker.TypeConstructorEquality f147043c;

    /* renamed from: d, reason: collision with root package name */
    private final Function2<KotlinType, KotlinType, Boolean> f147044d;

    public static class OverrideCompatibilityInfo {

        /* renamed from: c, reason: collision with root package name */
        private static final OverrideCompatibilityInfo f147045c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        private final Result f147046a;

        /* renamed from: b, reason: collision with root package name */
        private final String f147047b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f147046a = result;
            this.f147047b = str;
        }

        public static OverrideCompatibilityInfo b(String str) {
            if (str == null) {
                a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo d(String str) {
            if (str == null) {
                a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public static OverrideCompatibilityInfo e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f147045c;
            if (overrideCompatibilityInfo == null) {
                a(0);
            }
            return overrideCompatibilityInfo;
        }

        public Result c() {
            Result result = this.f147046a;
            if (result == null) {
                a(5);
            }
            return result;
        }

        public String toString() {
            return this.f147046a + ": " + this.f147047b;
        }
    }

    static class a implements KotlinTypeChecker.TypeConstructorEquality {
        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                b(0);
            }
            if (typeConstructor2 == null) {
                b(1);
            }
            return typeConstructor.equals(typeConstructor2);
        }

        a() {
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    static class b<D> implements Function2<D, D, Pair<CallableDescriptor, CallableDescriptor>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;>; */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Pair invoke(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            return new Pair(callableDescriptor, callableDescriptor2);
        }

        b() {
        }
    }

    static class c implements Function1<CallableMemberDescriptor, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeclarationDescriptor f147052a;

        c(DeclarationDescriptor declarationDescriptor) {
            this.f147052a = declarationDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z10;
            if (callableMemberDescriptor.b() == this.f147052a) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    static class e implements Function1<CallableMemberDescriptor, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassDescriptor f147053a;

        e(ClassDescriptor classDescriptor) {
            this.f147053a = classDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z10 = false;
            if (!DescriptorVisibilities.g(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.h(callableMemberDescriptor, this.f147053a, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    static class g implements Function1<CallableMemberDescriptor, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OverridingStrategy f147054a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CallableMemberDescriptor f147055b;

        g(OverridingStrategy overridingStrategy, CallableMemberDescriptor callableMemberDescriptor) {
            this.f147054a = overridingStrategy;
            this.f147055b = callableMemberDescriptor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f147054a.b(this.f147055b, callableMemberDescriptor);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(int):void");
    }

    static class d implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }

        d() {
        }
    }

    static class f implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }

        f() {
        }
    }

    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f147056a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f147057b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f147058c;

        static {
            int[] iArr = new int[Modality.values().length];
            f147058c = iArr;
            try {
                iArr[Modality.f144526b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f147058c[Modality.f144527c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f147058c[Modality.f144528d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f147058c[Modality.f144529e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f147057b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f147057b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f147057b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f147056a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f147056a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f147056a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        a aVar = new a();
        f147040g = aVar;
        f147039f = new OverridingUtil(aVar, KotlinTypeRefiner.Default.f147725a, KotlinTypePreparator.Default.f147724a, null);
    }

    private OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator kotlinTypePreparator, Function2<KotlinType, KotlinType, Boolean> function2) {
        if (typeConstructorEquality == null) {
            a(5);
        }
        if (kotlinTypeRefiner == null) {
            a(6);
        }
        if (kotlinTypePreparator == null) {
            a(7);
        }
        this.f147043c = typeConstructorEquality;
        this.f147041a = kotlinTypeRefiner;
        this.f147042b = kotlinTypePreparator;
        this.f147044d = function2;
    }

    private static boolean A(PropertyAccessorDescriptor propertyAccessorDescriptor, PropertyAccessorDescriptor propertyAccessorDescriptor2) {
        if (propertyAccessorDescriptor == null || propertyAccessorDescriptor2 == null) {
            return true;
        }
        return H(propertyAccessorDescriptor, propertyAccessorDescriptor2);
    }

    public static boolean B(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(65);
        }
        if (callableDescriptor2 == null) {
            a(66);
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!H(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateL = f147039f.l(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateL);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        if (A(propertyDescriptor.getSetter(), propertyDescriptor2.getSetter())) {
            return (propertyDescriptor.L() && propertyDescriptor2.L()) ? AbstractTypeChecker.f147577a.m(typeCheckerStateL, returnType.N0(), returnType2.N0()) : (propertyDescriptor.L() || !propertyDescriptor2.L()) && G(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateL);
        }
        return false;
    }

    private static boolean C(CallableDescriptor callableDescriptor, Collection<CallableDescriptor> collection) {
        if (callableDescriptor == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator<CallableDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(callableDescriptor, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            a(71);
        }
        if (kotlinType == null) {
            a(72);
        }
        if (callableDescriptor2 == null) {
            a(73);
        }
        if (kotlinType2 == null) {
            a(74);
        }
        if (typeCheckerState == null) {
            a(75);
        }
        return AbstractTypeChecker.f147577a.t(typeCheckerState, kotlinType.N0(), kotlinType2.N0());
    }

    private static boolean H(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            a(67);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            a(68);
        }
        Integer numD = DescriptorVisibilities.d(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(MemberDescriptor memberDescriptor, MemberDescriptor memberDescriptor2, boolean z10) {
        if (memberDescriptor == null) {
            a(55);
        }
        if (memberDescriptor2 == null) {
            a(56);
        }
        return !DescriptorVisibilities.g(memberDescriptor2.getVisibility()) && DescriptorVisibilities.h(memberDescriptor2, memberDescriptor, z10);
    }

    public static <D extends CallableDescriptor> boolean J(D d10, D d11, boolean z10, boolean z11) {
        if (d10 == null) {
            a(13);
        }
        if (d11 == null) {
            a(14);
        }
        if (!d10.equals(d11) && DescriptorEquivalenceForOverrides.f147023a.k(d10.a(), d11.a(), z10, z11)) {
            return true;
        }
        CallableDescriptor callableDescriptorA = d11.a();
        Iterator it = DescriptorUtils.d(d10).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.f147023a.k(callableDescriptorA, (CallableDescriptor) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            a(105);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.d()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.f144509g) {
                K(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.f144509g) {
            return;
        }
        DescriptorVisibility descriptorVisibilityH = h(callableMemberDescriptor);
        if (descriptorVisibilityH == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility = DescriptorVisibilities.f144507e;
        } else {
            descriptorVisibility = descriptorVisibilityH;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            ((PropertyDescriptorImpl) callableMemberDescriptor).a1(descriptorVisibility);
            Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).u().iterator();
            while (it.hasNext()) {
                K(it.next(), descriptorVisibilityH == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            ((FunctionDescriptorImpl) callableMemberDescriptor).g1(descriptorVisibility);
            return;
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.L0(descriptorVisibility);
        if (descriptorVisibility != propertyAccessorDescriptorImpl.T().getVisibility()) {
            propertyAccessorDescriptorImpl.J0(false);
        }
    }

    public static <H> H L(Collection<H> collection, Function1<H, CallableDescriptor> function1) {
        H h10;
        if (collection == null) {
            a(76);
        }
        if (function1 == null) {
            a(77);
        }
        if (collection.size() == 1) {
            H h11 = (H) CollectionsKt.r0(collection);
            if (h11 == null) {
                a(78);
            }
            return h11;
        }
        ArrayList arrayList = new ArrayList(2);
        List listG0 = CollectionsKt.G0(collection, function1);
        H h12 = (H) CollectionsKt.r0(collection);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h12);
        for (H h13 : collection) {
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(h13);
            if (C(callableDescriptorInvoke2, listG0)) {
                arrayList.add(h13);
            }
            if (B(callableDescriptorInvoke2, callableDescriptorInvoke) && !B(callableDescriptorInvoke, callableDescriptorInvoke2)) {
                h12 = h13;
            }
        }
        if (arrayList.isEmpty()) {
            if (h12 == null) {
                a(79);
            }
            return h12;
        }
        if (arrayList.size() == 1) {
            H h14 = (H) CollectionsKt.r0(arrayList);
            if (h14 == null) {
                a(80);
            }
            return h14;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h10 = null;
                break;
            }
            h10 = (H) it.next();
            if (!FlexibleTypesKt.b(function1.invoke(h10).getReturnType())) {
                break;
            }
        }
        if (h10 != null) {
            return h10;
        }
        H h15 = (H) CollectionsKt.r0(arrayList);
        if (h15 == null) {
            a(82);
        }
        return h15;
    }

    private static boolean b(Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt.d0(collection, new c(collection.iterator().next().b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.c(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState):boolean");
    }

    private static boolean d(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(44);
        }
        if (kotlinType2 == null) {
            a(45);
        }
        if (typeCheckerState == null) {
            a(46);
        }
        if (KotlinTypeKt.a(kotlinType) && KotlinTypeKt.a(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.f147577a.m(typeCheckerState, kotlinType.N0(), kotlinType2.N0());
    }

    private static void f(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (callableMemberDescriptor.f().a()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.d().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.d().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static DescriptorVisibility h(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(106);
        }
        Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
        DescriptorVisibility descriptorVisibilityU = u(collectionD);
        if (descriptorVisibilityU == null) {
            return null;
        }
        if (callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return descriptorVisibilityU.f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionD) {
            if (callableMemberDescriptor2.q() != Modality.f144529e && !callableMemberDescriptor2.getVisibility().equals(descriptorVisibilityU)) {
                return null;
            }
        }
        return descriptorVisibilityU;
    }

    public static OverridingUtil i(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            a(3);
        }
        if (typeConstructorEquality == null) {
            a(4);
        }
        return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.f147724a, null);
    }

    private static void j(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (collection == null) {
            a(83);
        }
        if (classDescriptor == null) {
            a(84);
        }
        if (overridingStrategy == null) {
            a(85);
        }
        Collection<CallableMemberDescriptor> collectionT = t(classDescriptor, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        CallableMemberDescriptor callableMemberDescriptorM = ((CallableMemberDescriptor) L(collection, new d())).M(classDescriptor, n(collection, classDescriptor), zIsEmpty ? DescriptorVisibilities.f144510h : DescriptorVisibilities.f144509g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.d(callableMemberDescriptorM, collection);
        overridingStrategy.a(callableMemberDescriptorM);
    }

    private static void k(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection, OverridingStrategy overridingStrategy) {
        if (classDescriptor == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (overridingStrategy == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator<CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), classDescriptor, overridingStrategy);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(VisibilityUtilKt.a(linkedList), linkedList, overridingStrategy), classDescriptor, overridingStrategy);
            }
        }
    }

    private TypeCheckerState l(List<TypeParameterDescriptor> list, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerStateH0 = new OverridingUtilTypeSystemContext(null, this.f147043c, this.f147041a, this.f147042b, this.f147044d).H0(true, true, false);
            if (typeCheckerStateH0 == null) {
                a(42);
            }
            return typeCheckerStateH0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(list.get(i10).i(), list2.get(i10).i());
        }
        TypeCheckerState typeCheckerStateH02 = new OverridingUtilTypeSystemContext(map, this.f147043c, this.f147041a, this.f147042b, this.f147044d).H0(true, true, false);
        if (typeCheckerStateH02 == null) {
            a(43);
        }
        return typeCheckerStateH02;
    }

    public static OverridingUtil m(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            a(0);
        }
        return new OverridingUtil(f147040g, kotlinTypeRefiner, KotlinTypePreparator.Default.f147724a, null);
    }

    private static Modality n(Collection<CallableMemberDescriptor> collection, ClassDescriptor classDescriptor) {
        if (collection == null) {
            a(86);
        }
        if (classDescriptor == null) {
            a(87);
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            int i10 = h.f147058c[callableMemberDescriptor.q().ordinal()];
            if (i10 == 1) {
                Modality modality = Modality.f144526b;
                if (modality == null) {
                    a(88);
                }
                return modality;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (classDescriptor.h0() && classDescriptor.q() != Modality.f144529e && classDescriptor.q() != Modality.f144527c) {
            z10 = true;
        }
        if (z11 && !z12) {
            Modality modality2 = Modality.f144528d;
            if (modality2 == null) {
                a(89);
            }
            return modality2;
        }
        if (!z11 && z12) {
            Modality modalityQ = z10 ? classDescriptor.q() : Modality.f144529e;
            if (modalityQ == null) {
                a(90);
            }
            return modalityQ;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z10, classDescriptor.q());
    }

    private Collection<CallableMemberDescriptor> o(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (classDescriptor == null) {
            a(59);
        }
        if (overridingStrategy == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        SmartSet smartSetF = SmartSet.f();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result resultC = D(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).c();
            boolean zI = I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i10 = h.f147057b[resultC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    smartSetF.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i10 == 2) {
                if (zI) {
                    overridingStrategy.c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        overridingStrategy.d(callableMemberDescriptor, smartSetF);
        return arrayList;
    }

    public static <H> Collection<H> p(H h10, Collection<H> collection, Function1<H, CallableDescriptor> function1, Function1<H, Unit> function12) {
        if (h10 == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (function1 == null) {
            a(99);
        }
        if (function12 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        CallableDescriptor callableDescriptorInvoke = function1.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptorInvoke2 = function1.invoke(next);
            if (h10 == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultX = x(callableDescriptorInvoke, callableDescriptorInvoke2);
                if (resultX == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultX == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection<CallableMemberDescriptor> q(CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, OverridingStrategy overridingStrategy) {
        if (callableMemberDescriptor == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (overridingStrategy == null) {
            a(104);
        }
        return p(callableMemberDescriptor, queue, new f(), new g(overridingStrategy, callableMemberDescriptor));
    }

    public static <D extends CallableDescriptor> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && DescriptorUtilsKt.y(DescriptorUtilsKt.s(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z10, Function0<?> function0, Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            a(9);
        }
        if (function2 == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<CallableDescriptor, CallableDescriptor> pairInvoke = function2.invoke(obj, (Object) it.next());
                CallableDescriptor callableDescriptorA = pairInvoke.a();
                CallableDescriptor callableDescriptorB = pairInvoke.b();
                if (!J(callableDescriptorA, callableDescriptorB, z10, true)) {
                    if (J(callableDescriptorB, callableDescriptorA, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<CallableMemberDescriptor> t(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listO0 = CollectionsKt.o0(collection, new e(classDescriptor));
        if (listO0 == null) {
            a(96);
        }
        return listO0;
    }

    public static DescriptorVisibility u(Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.f144514l;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (it.hasNext()) {
                DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer numD = DescriptorVisibilities.d(visibility, descriptorVisibility);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = DescriptorVisibilities.d(descriptorVisibility, it2.next().getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    public static OverrideCompatibilityInfo w(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z10;
        if (callableDescriptor == null) {
            a(38);
        }
        if (callableDescriptor2 == null) {
            a(39);
        }
        boolean z11 = callableDescriptor instanceof FunctionDescriptor;
        if ((z11 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z10 = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = e(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoE != null) {
            return overrideCompatibilityInfoE;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result x(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = f147039f;
        OverrideCompatibilityInfo.Result resultC = overridingUtil.D(callableDescriptor2, callableDescriptor, null).c();
        OverrideCompatibilityInfo.Result resultC2 = overridingUtil.D(callableDescriptor, callableDescriptor2, null).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultC == result && resultC2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (resultC == result2 || resultC2 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    private static Modality y(Collection<CallableMemberDescriptor> collection, boolean z10, Modality modality) {
        if (collection == null) {
            a(91);
        }
        if (modality == null) {
            a(92);
        }
        Modality modality2 = Modality.f144529e;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Modality modalityQ = (z10 && callableMemberDescriptor.q() == Modality.f144529e) ? modality : callableMemberDescriptor.q();
            if (modalityQ.compareTo(modality2) < 0) {
                modality2 = modalityQ;
            }
        }
        if (modality2 == null) {
            a(93);
        }
        return modality2;
    }

    public static Set<CallableMemberDescriptor> z(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    public OverrideCompatibilityInfo D(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            a(19);
        }
        if (callableDescriptor2 == null) {
            a(20);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = E(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (overrideCompatibilityInfoE == null) {
            a(21);
        }
        return overrideCompatibilityInfoE;
    }

    public OverrideCompatibilityInfo E(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z10) {
        if (callableDescriptor == null) {
            a(22);
        }
        if (callableDescriptor2 == null) {
            a(23);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoF = F(callableDescriptor, callableDescriptor2, z10);
        boolean z11 = overrideCompatibilityInfoF.c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f147038e) {
            if (externalOverridabilityCondition.a() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z11 || externalOverridabilityCondition.a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i10 = h.f147056a[externalOverridabilityCondition.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoD = OverrideCompatibilityInfo.d("External condition");
                    if (overrideCompatibilityInfoD == null) {
                        a(24);
                    }
                    return overrideCompatibilityInfoD;
                }
            }
        }
        if (!z11) {
            return overrideCompatibilityInfoF;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f147038e) {
            if (externalOverridabilityCondition2.a() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i11 = h.f147056a[externalOverridabilityCondition2.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoD2 = OverrideCompatibilityInfo.d("External condition");
                    if (overrideCompatibilityInfoD2 == null) {
                        a(26);
                    }
                    return overrideCompatibilityInfoD2;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = OverrideCompatibilityInfo.e();
        if (overrideCompatibilityInfoE == null) {
            a(27);
        }
        return overrideCompatibilityInfoE;
    }

    public OverrideCompatibilityInfo F(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z10) {
        if (callableDescriptor == null) {
            a(28);
        }
        if (callableDescriptor2 == null) {
            a(29);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoW = w(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoW != null) {
            return overrideCompatibilityInfoW;
        }
        List<KotlinType> listG = g(callableDescriptor);
        List<KotlinType> listG2 = g(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!KotlinTypeChecker.f147723a.b(listG.get(i10), listG2.get(i10))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoD = OverrideCompatibilityInfo.d("Type parameter number mismatch");
                    if (overrideCompatibilityInfoD == null) {
                        a(31);
                    }
                    return overrideCompatibilityInfoD;
                }
                i10++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoB = OverrideCompatibilityInfo.b("Type parameter number mismatch");
            if (overrideCompatibilityInfoB == null) {
                a(32);
            }
            return overrideCompatibilityInfoB;
        }
        TypeCheckerState typeCheckerStateL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c(typeParameters.get(i11), typeParameters2.get(i11), typeCheckerStateL)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoD2 = OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoD2 == null) {
                    a(33);
                }
                return overrideCompatibilityInfoD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d(listG.get(i10), listG2.get(i10), typeCheckerStateL)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoD3 = OverrideCompatibilityInfo.d("Value parameter type mismatch");
                if (overrideCompatibilityInfoD3 == null) {
                    a(34);
                }
                return overrideCompatibilityInfoD3;
            }
            i10++;
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            OverrideCompatibilityInfo overrideCompatibilityInfoB2 = OverrideCompatibilityInfo.b("Incompatible suspendability");
            if (overrideCompatibilityInfoB2 == null) {
                a(35);
            }
            return overrideCompatibilityInfoB2;
        }
        if (z10) {
            KotlinType returnType = callableDescriptor.getReturnType();
            KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!KotlinTypeKt.a(returnType2) || !KotlinTypeKt.a(returnType)) && !AbstractTypeChecker.f147577a.t(typeCheckerStateL, returnType2.N0(), returnType.N0()))) {
                OverrideCompatibilityInfo overrideCompatibilityInfoB3 = OverrideCompatibilityInfo.b("Return type mismatch");
                if (overrideCompatibilityInfoB3 == null) {
                    a(36);
                }
                return overrideCompatibilityInfoB3;
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoE = OverrideCompatibilityInfo.e();
        if (overrideCompatibilityInfoE == null) {
            a(37);
        }
        return overrideCompatibilityInfoE;
    }

    public void v(Name name, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (name == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (classDescriptor == null) {
            a(53);
        }
        if (overridingStrategy == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, classDescriptor, overridingStrategy));
        }
        k(classDescriptor, linkedHashSet, overridingStrategy);
    }

    private static OverrideCompatibilityInfo e(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z10;
        boolean z11 = false;
        if (callableDescriptor.N() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (callableDescriptor2.N() == null) {
            z11 = true;
        }
        if (z10 != z11) {
            return OverrideCompatibilityInfo.d("Receiver presence mismatch");
        }
        if (callableDescriptor.h().size() != callableDescriptor2.h().size()) {
            return OverrideCompatibilityInfo.d("Value parameter number mismatch");
        }
        return null;
    }

    private static List<KotlinType> g(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorN = callableDescriptor.N();
        ArrayList arrayList = new ArrayList();
        if (receiverParameterDescriptorN != null) {
            arrayList.add(receiverParameterDescriptorN.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.h().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }
}
