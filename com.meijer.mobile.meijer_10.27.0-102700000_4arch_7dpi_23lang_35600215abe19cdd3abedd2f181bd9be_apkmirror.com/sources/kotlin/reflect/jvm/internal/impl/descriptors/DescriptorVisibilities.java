package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes13.dex */
public class DescriptorVisibilities {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorVisibility f143596a;

    /* renamed from: b, reason: collision with root package name */
    public static final DescriptorVisibility f143597b;

    /* renamed from: c, reason: collision with root package name */
    public static final DescriptorVisibility f143598c;

    /* renamed from: d, reason: collision with root package name */
    public static final DescriptorVisibility f143599d;

    /* renamed from: e, reason: collision with root package name */
    public static final DescriptorVisibility f143600e;

    /* renamed from: f, reason: collision with root package name */
    public static final DescriptorVisibility f143601f;

    /* renamed from: g, reason: collision with root package name */
    public static final DescriptorVisibility f143602g;

    /* renamed from: h, reason: collision with root package name */
    public static final DescriptorVisibility f143603h;

    /* renamed from: i, reason: collision with root package name */
    public static final DescriptorVisibility f143604i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<DescriptorVisibility> f143605j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<DescriptorVisibility, Integer> f143606k;

    /* renamed from: l, reason: collision with root package name */
    public static final DescriptorVisibility f143607l;

    /* renamed from: m, reason: collision with root package name */
    private static final ReceiverValue f143608m;

    /* renamed from: n, reason: collision with root package name */
    public static final ReceiverValue f143609n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final ReceiverValue f143610o;

    /* renamed from: p, reason: collision with root package name */
    private static final ModuleVisibilityHelper f143611p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<Visibility, DescriptorVisibility> f143612q;

    static class a implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }

        a() {
        }
    }

    static class b implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }

        b() {
        }
    }

    static class c implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }

        c() {
        }
    }

    static class f extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.q(declarationDescriptorWithVisibility, ClassDescriptor.class);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.r(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 == null) {
                return false;
            }
            if (classDescriptor2 != null && DescriptorUtils.x(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.q(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.H(classDescriptor3, classDescriptor)) {
                return true;
            }
            DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM = DescriptorUtils.M(declarationDescriptorWithVisibility);
            ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.q(declarationDescriptorWithVisibilityM, ClassDescriptor.class);
            if (classDescriptor4 == null) {
                return false;
            }
            if (DescriptorUtils.H(classDescriptor3, classDescriptor4) && h(receiverValue, declarationDescriptorWithVisibilityM, classDescriptor3)) {
                return true;
            }
            return e(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.b(), z10);
        }

        private boolean h(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, ClassDescriptor classDescriptor) {
            if (declarationDescriptorWithVisibility == null) {
                g(2);
            }
            if (classDescriptor == null) {
                g(3);
            }
            if (receiverValue == DescriptorVisibilities.f143610o) {
                return false;
            }
            if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.f143609n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f143608m || receiverValue == null) {
                return false;
            }
            KotlinType kotlinTypeB = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).b() : receiverValue.getType();
            return DescriptorUtils.I(kotlinTypeB, classDescriptor) || DynamicTypesKt.a(kotlinTypeB);
        }

        f(Visibility visibility) {
            super(visibility);
        }
    }

    static class i extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }

        i(Visibility visibility) {
            super(visibility);
        }
    }

    static class j extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }

        j(Visibility visibility) {
            super(visibility);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.a(int):void");
    }

    static class d extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                g(0);
            }
            return DescriptorUtils.j(declarationDescriptor) != SourceFile.f143648a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == 0) {
                g(1);
            }
            if (declarationDescriptor == null) {
                g(2);
            }
            if (DescriptorUtils.J(declarationDescriptorWithVisibility) && h(declarationDescriptor)) {
                return DescriptorVisibilities.f(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParametersB = ((ConstructorDescriptor) declarationDescriptorWithVisibility).b();
                if (z10 && DescriptorUtils.G(classifierDescriptorWithTypeParametersB) && DescriptorUtils.J(classifierDescriptorWithTypeParametersB) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.J(declarationDescriptor.b()) && DescriptorVisibilities.f(declarationDescriptorWithVisibility, declarationDescriptor)) {
                    return true;
                }
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.b();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.x(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.e().equals(((PackageFragmentDescriptor) declarationDescriptor).e()) && DescriptorUtils.b(declarationDescriptor, declarationDescriptorWithVisibility);
                }
                declarationDescriptor = declarationDescriptor.b();
            }
            return false;
        }

        d(Visibility visibility) {
            super(visibility);
        }
    }

    static class e extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            DeclarationDescriptor declarationDescriptorQ;
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            if (DescriptorVisibilities.f143596a.e(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z10)) {
                if (receiverValue == DescriptorVisibilities.f143609n) {
                    return true;
                }
                if (receiverValue != DescriptorVisibilities.f143608m && (declarationDescriptorQ = DescriptorUtils.q(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                    return ((ThisClassReceiver) receiverValue).s().a().equals(declarationDescriptorQ.a());
                }
            }
            return false;
        }

        e(Visibility visibility) {
            super(visibility);
        }
    }

    static class g extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            if (DescriptorUtils.g(declarationDescriptor).I(DescriptorUtils.g(declarationDescriptorWithVisibility))) {
                return DescriptorVisibilities.f143611p.a(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            return false;
        }

        g(Visibility visibility) {
            super(visibility);
        }
    }

    static class h extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            return true;
        }

        h(Visibility visibility) {
            super(visibility);
        }
    }

    static class k extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            return false;
        }

        k(Visibility visibility) {
            super(visibility);
        }
    }

    static class l extends DelegatedDescriptorVisibility {
        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        public boolean e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
            if (declarationDescriptorWithVisibility == null) {
                g(0);
            }
            if (declarationDescriptor == null) {
                g(1);
            }
            return false;
        }

        l(Visibility visibility) {
            super(visibility);
        }
    }

    static {
        d dVar = new d(Visibilities.Private.f143657c);
        f143596a = dVar;
        e eVar = new e(Visibilities.PrivateToThis.f143658c);
        f143597b = eVar;
        f fVar = new f(Visibilities.Protected.f143659c);
        f143598c = fVar;
        g gVar = new g(Visibilities.Internal.f143654c);
        f143599d = gVar;
        h hVar = new h(Visibilities.Public.f143660c);
        f143600e = hVar;
        i iVar = new i(Visibilities.Local.f143656c);
        f143601f = iVar;
        j jVar = new j(Visibilities.Inherited.f143653c);
        f143602g = jVar;
        k kVar = new k(Visibilities.InvisibleFake.f143655c);
        f143603h = kVar;
        l lVar = new l(Visibilities.Unknown.f143661c);
        f143604i = lVar;
        f143605j = Collections.unmodifiableSet(SetsKt.i(dVar, eVar, gVar, iVar));
        HashMap mapE = CollectionsKt.e(4);
        mapE.put(eVar, 0);
        mapE.put(dVar, 0);
        mapE.put(gVar, 1);
        mapE.put(fVar, 1);
        mapE.put(hVar, 2);
        f143606k = Collections.unmodifiableMap(mapE);
        f143607l = hVar;
        f143608m = new a();
        f143609n = new b();
        f143610o = new c();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f143611p = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.f147071a;
        f143612q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    public static Integer d(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            a(12);
        }
        if (descriptorVisibility2 == null) {
            a(13);
        }
        Integer numA = descriptorVisibility.a(descriptorVisibility2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = descriptorVisibility2.a(descriptorVisibility);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility e(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityE;
        if (declarationDescriptorWithVisibility == null) {
            a(8);
        }
        if (declarationDescriptor == null) {
            a(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.a(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != f143601f; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.q(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().e(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z10)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityE = e(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).Q(), declarationDescriptor, z10)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityE;
    }

    public static boolean f(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            a(6);
        }
        if (declarationDescriptor2 == null) {
            a(7);
        }
        SourceFile sourceFileJ = DescriptorUtils.j(declarationDescriptor2);
        if (sourceFileJ != SourceFile.f143648a) {
            return sourceFileJ.equals(DescriptorUtils.j(declarationDescriptor));
        }
        return false;
    }

    public static boolean g(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            a(14);
        }
        return descriptorVisibility == f143596a || descriptorVisibility == f143597b;
    }

    public static boolean h(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z10) {
        if (declarationDescriptorWithVisibility == null) {
            a(2);
        }
        if (declarationDescriptor == null) {
            a(3);
        }
        return e(f143609n, declarationDescriptorWithVisibility, declarationDescriptor, z10) == null;
    }

    private static void i(DescriptorVisibility descriptorVisibility) {
        f143612q.put(descriptorVisibility.b(), descriptorVisibility);
    }

    public static DescriptorVisibility j(Visibility visibility) {
        if (visibility == null) {
            a(15);
        }
        DescriptorVisibility descriptorVisibility = f143612q.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
