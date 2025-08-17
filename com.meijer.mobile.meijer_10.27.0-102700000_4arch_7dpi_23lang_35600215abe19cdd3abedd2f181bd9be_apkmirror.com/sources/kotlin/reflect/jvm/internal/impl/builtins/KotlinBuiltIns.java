package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public abstract class KotlinBuiltIns {

    /* renamed from: g, reason: collision with root package name */
    public static final Name f143240g = Name.u("<built-ins module>");

    /* renamed from: a, reason: collision with root package name */
    private ModuleDescriptorImpl f143241a;

    /* renamed from: b, reason: collision with root package name */
    private NotNullLazyValue<ModuleDescriptorImpl> f143242b;

    /* renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue<e> f143243c;

    /* renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<Collection<PackageViewDescriptor>> f143244d;

    /* renamed from: e, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<Name, ClassDescriptor> f143245e;

    /* renamed from: f, reason: collision with root package name */
    private final StorageManager f143246f;

    class a implements Function0<Collection<PackageViewDescriptor>> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<PackageViewDescriptor> invoke() {
            return Arrays.asList(KotlinBuiltIns.this.s().i0(StandardNames.f143284A), KotlinBuiltIns.this.s().i0(StandardNames.f143286C), KotlinBuiltIns.this.s().i0(StandardNames.f143287D), KotlinBuiltIns.this.s().i0(StandardNames.f143285B));
        }
    }

    class b implements Function0<e> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                SimpleType simpleTypeR = KotlinBuiltIns.this.r(primitiveType.t().b());
                SimpleType simpleTypeR2 = KotlinBuiltIns.this.r(primitiveType.o().b());
                enumMap.put((EnumMap) primitiveType, (PrimitiveType) simpleTypeR2);
                map.put(simpleTypeR, simpleTypeR2);
                map2.put(simpleTypeR2, simpleTypeR);
            }
            return new e(enumMap, map, map2, null);
        }
    }

    class c implements Function1<Name, ClassDescriptor> {
        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ClassDescriptor invoke(Name name) {
            ClassifierDescriptor classifierDescriptorF = KotlinBuiltIns.this.t().f(name, NoLookupLocation.f144118d);
            if (classifierDescriptorF == null) {
                throw new AssertionError("Built-in class " + StandardNames.f143284A.b(name) + " is not found");
            }
            if (classifierDescriptorF instanceof ClassDescriptor) {
                return (ClassDescriptor) classifierDescriptorF;
            }
            throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorF);
        }
    }

    class d implements Function0<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ModuleDescriptorImpl f143250a;

        d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f143250a = moduleDescriptorImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (KotlinBuiltIns.this.f143241a == null) {
                KotlinBuiltIns.this.f143241a = this.f143250a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + KotlinBuiltIns.this.f143241a + " (attempting to reset to " + this.f143250a + ")");
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Map<PrimitiveType, SimpleType> f143252a;

        /* renamed from: b, reason: collision with root package name */
        public final Map<KotlinType, SimpleType> f143253b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<SimpleType, SimpleType> f143254c;

        /* synthetic */ e(Map map, Map map2, Map map3, a aVar) {
            this(map, map2, map3);
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i10 != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private e(Map<PrimitiveType, SimpleType> map, Map<KotlinType, SimpleType> map2, Map<SimpleType, SimpleType> map3) {
            if (map == null) {
                a(0);
            }
            if (map2 == null) {
                a(1);
            }
            if (map3 == null) {
                a(2);
            }
            this.f143252a = map;
            this.f143253b = map2;
            this.f143254c = map3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.a(int):void");
    }

    protected KotlinBuiltIns(StorageManager storageManager) {
        if (storageManager == null) {
            a(0);
        }
        this.f143246f = storageManager;
        this.f143244d = storageManager.c(new a());
        this.f143243c = storageManager.c(new b());
        this.f143245e = storageManager.i(new c());
    }

    public static boolean A0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(131);
        }
        return j0(kotlinType, StandardNames.FqNames.f143341K0.i());
    }

    private static KotlinType B(KotlinType kotlinType, ModuleDescriptor moduleDescriptor) {
        ClassId classIdN;
        ClassId classIdA;
        ClassDescriptor classDescriptorB;
        if (kotlinType == null) {
            a(71);
        }
        if (moduleDescriptor == null) {
            a(72);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD == null) {
            return null;
        }
        UnsignedTypes unsignedTypes = UnsignedTypes.f143438a;
        if (!unsignedTypes.b(classifierDescriptorD.getName()) || (classIdN = DescriptorUtilsKt.n(classifierDescriptorD)) == null || (classIdA = unsignedTypes.a(classIdN)) == null || (classDescriptorB = FindClassInModuleKt.b(moduleDescriptor, classIdA)) == null) {
            return null;
        }
        return classDescriptorB.o();
    }

    public static boolean B0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(129);
        }
        return j0(kotlinType, StandardNames.FqNames.f143337I0.i());
    }

    public static boolean C0(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(10);
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).e().h(StandardNames.f143319z);
            }
            declarationDescriptor = declarationDescriptor.b();
        }
        return false;
    }

    public static boolean D0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(142);
        }
        return n0(kotlinType, StandardNames.FqNames.f143378f);
    }

    public static boolean E0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(132);
        }
        return y0(kotlinType) || B0(kotlinType) || z0(kotlinType) || A0(kotlinType);
    }

    public static PrimitiveType O(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(92);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        if (classifierDescriptorD == null) {
            return null;
        }
        return Q(classifierDescriptorD);
    }

    public static PrimitiveType Q(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(77);
        }
        if (StandardNames.FqNames.f143359T0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f143363V0.get(DescriptorUtils.m(declarationDescriptor));
        }
        return null;
    }

    private ClassDescriptor R(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(16);
        }
        return q(primitiveType.t().b());
    }

    public static PrimitiveType T(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(76);
        }
        if (StandardNames.FqNames.f143357S0.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.f143361U0.get(DescriptorUtils.m(declarationDescriptor));
        }
        return null;
    }

    public static boolean b0(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(108);
        }
        return e(classDescriptor, StandardNames.FqNames.f143370b);
    }

    public static boolean c0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(139);
        }
        return i0(kotlinType, StandardNames.FqNames.f143370b);
    }

    public static boolean d0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(88);
        }
        return i0(kotlinType, StandardNames.FqNames.f143384i);
    }

    private static boolean e(ClassifierDescriptor classifierDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classifierDescriptor == null) {
            a(103);
        }
        if (fqNameUnsafe == null) {
            a(104);
        }
        return classifierDescriptor.getName().equals(fqNameUnsafe.j()) && fqNameUnsafe.equals(DescriptorUtils.m(classifierDescriptor));
    }

    public static boolean e0(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(89);
        }
        return e(classDescriptor, StandardNames.FqNames.f143384i) || Q(classDescriptor) != null;
    }

    public static boolean f0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(90);
        }
        return d0(kotlinType) || r0(kotlinType);
    }

    public static boolean g0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(110);
        }
        return j0(kotlinType, StandardNames.FqNames.f143386j);
    }

    public static boolean h0(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(9);
        }
        return DescriptorUtils.r(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
    }

    private static boolean i0(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(97);
        }
        if (fqNameUnsafe == null) {
            a(98);
        }
        return x0(kotlinType.K0(), fqNameUnsafe);
    }

    private static boolean j0(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(134);
        }
        if (fqNameUnsafe == null) {
            a(135);
        }
        return i0(kotlinType, fqNameUnsafe) && !kotlinType.L0();
    }

    public static boolean k0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(141);
        }
        return q0(kotlinType);
    }

    public static boolean l0(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(160);
        }
        if (declarationDescriptor.H0().getAnnotations().p3(StandardNames.FqNames.f143416y)) {
            return true;
        }
        if (declarationDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
            boolean zL = propertyDescriptor.L();
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (getter != null && l0(getter) && (!zL || (setter != null && l0(setter)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(158);
        }
        return e(classDescriptor, StandardNames.FqNames.f143391l0);
    }

    private static boolean n0(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(105);
        }
        if (fqNameUnsafe == null) {
            a(106);
        }
        return !kotlinType.L0() && i0(kotlinType, fqNameUnsafe);
    }

    public static boolean o0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(136);
        }
        return p0(kotlinType) && !TypeUtils.l(kotlinType);
    }

    public static boolean p0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(138);
        }
        return i0(kotlinType, StandardNames.FqNames.f143372c);
    }

    private ClassDescriptor q(String str) {
        if (str == null) {
            a(14);
        }
        ClassDescriptor classDescriptorInvoke = this.f143245e.invoke(Name.o(str));
        if (classDescriptorInvoke == null) {
            a(15);
        }
        return classDescriptorInvoke;
    }

    public static boolean q0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(140);
        }
        return c0(kotlinType) && kotlinType.L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleType r(String str) {
        if (str == null) {
            a(47);
        }
        SimpleType simpleTypeO = q(str).o();
        if (simpleTypeO == null) {
            a(48);
        }
        return simpleTypeO;
    }

    public static boolean r0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(91);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return (classifierDescriptorD == null || Q(classifierDescriptorD) == null) ? false : true;
    }

    public static boolean s0(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(96);
        }
        return T(classDescriptor) != null;
    }

    public static boolean t0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(94);
        }
        return !kotlinType.L0() && u0(kotlinType);
    }

    public static boolean u0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(95);
        }
        ClassifierDescriptor classifierDescriptorD = kotlinType.K0().d();
        return (classifierDescriptorD instanceof ClassDescriptor) && s0((ClassDescriptor) classifierDescriptorD);
    }

    public static boolean v0(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(107);
        }
        return e(classDescriptor, StandardNames.FqNames.f143370b) || e(classDescriptor, StandardNames.FqNames.f143372c);
    }

    public static boolean w0(KotlinType kotlinType) {
        return kotlinType != null && n0(kotlinType, StandardNames.FqNames.f143382h);
    }

    public static boolean x0(TypeConstructor typeConstructor, FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            a(101);
        }
        if (fqNameUnsafe == null) {
            a(102);
        }
        ClassifierDescriptor classifierDescriptorD = typeConstructor.d();
        return (classifierDescriptorD instanceof ClassDescriptor) && e(classifierDescriptorD, fqNameUnsafe);
    }

    public static boolean y0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(128);
        }
        return j0(kotlinType, StandardNames.FqNames.f143335H0.i());
    }

    public static boolean z0(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(130);
        }
        return j0(kotlinType, StandardNames.FqNames.f143339J0.i());
    }

    public SimpleType A() {
        SimpleType simpleTypeS = S(PrimitiveType.f143264n);
        if (simpleTypeS == null) {
            a(62);
        }
        return simpleTypeS;
    }

    public SimpleType C() {
        SimpleType simpleTypeS = S(PrimitiveType.f143262l);
        if (simpleTypeS == null) {
            a(61);
        }
        return simpleTypeS;
    }

    public SimpleType E() {
        SimpleType simpleTypeS = S(PrimitiveType.f143261k);
        if (simpleTypeS == null) {
            a(59);
        }
        return simpleTypeS;
    }

    public ClassDescriptor F() {
        ClassDescriptor classDescriptorP = p(StandardNames.FqNames.f143391l0.m());
        if (classDescriptorP == null) {
            a(21);
        }
        return classDescriptorP;
    }

    public void F0(ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            a(1);
        }
        this.f143246f.d(new d(moduleDescriptorImpl));
    }

    public SimpleType G() {
        SimpleType simpleTypeS = S(PrimitiveType.f143263m);
        if (simpleTypeS == null) {
            a(60);
        }
        return simpleTypeS;
    }

    public ClassDescriptor H() {
        return q("Nothing");
    }

    public ClassDescriptor L() {
        return q("Number");
    }

    protected PlatformDependentDeclarationFilter N() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.f143780a;
        if (noPlatformDependent == null) {
            a(4);
        }
        return noPlatformDependent;
    }

    public SimpleType P(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
        }
        SimpleType simpleType = this.f143243c.invoke().f143252a.get(primitiveType);
        if (simpleType == null) {
            a(74);
        }
        return simpleType;
    }

    public SimpleType S(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
        }
        SimpleType simpleTypeO = R(primitiveType).o();
        if (simpleTypeO == null) {
            a(55);
        }
        return simpleTypeO;
    }

    public SimpleType U() {
        SimpleType simpleTypeS = S(PrimitiveType.f143260j);
        if (simpleTypeS == null) {
            a(58);
        }
        return simpleTypeS;
    }

    protected StorageManager V() {
        StorageManager storageManager = this.f143246f;
        if (storageManager == null) {
            a(6);
        }
        return storageManager;
    }

    public ClassDescriptor W() {
        return q("String");
    }

    public ClassDescriptor Y(int i10) {
        ClassDescriptor classDescriptorP = p(StandardNames.f143312s.b(Name.o(StandardNames.d(i10))));
        if (classDescriptorP == null) {
            a(18);
        }
        return classDescriptorP;
    }

    public ClassDescriptor Z() {
        return q("Unit");
    }

    protected void f(boolean z10) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f143240g, this.f143246f, this, null);
        this.f143241a = moduleDescriptorImpl;
        moduleDescriptorImpl.L0(BuiltInsLoader.f143233a.c().a(this.f143246f, this.f143241a, w(), N(), g(), z10));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f143241a;
        moduleDescriptorImpl2.T0(moduleDescriptorImpl2);
    }

    protected AdditionalClassPartsProvider g() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.f143778a;
        if (none == null) {
            a(3);
        }
        return none;
    }

    public ClassDescriptor h() {
        return q("Any");
    }

    public ClassDescriptor j() {
        return q("Array");
    }

    public KotlinType k(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(68);
        }
        KotlinType kotlinTypeL = l(kotlinType);
        if (kotlinTypeL != null) {
            return kotlinTypeL;
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    public KotlinType l(KotlinType kotlinType) {
        KotlinType kotlinTypeB;
        if (kotlinType == null) {
            a(70);
        }
        if (d0(kotlinType)) {
            if (kotlinType.I0().size() != 1) {
                return null;
            }
            return kotlinType.I0().get(0).getType();
        }
        KotlinType kotlinTypeN = TypeUtils.n(kotlinType);
        SimpleType simpleType = this.f143243c.invoke().f143254c.get(kotlinTypeN);
        if (simpleType != null) {
            return simpleType;
        }
        ModuleDescriptor moduleDescriptorI = DescriptorUtils.i(kotlinTypeN);
        if (moduleDescriptorI == null || (kotlinTypeB = B(kotlinTypeN, moduleDescriptorI)) == null) {
            return null;
        }
        return kotlinTypeB;
    }

    public SimpleType m(Variance variance, KotlinType kotlinType) {
        if (variance == null) {
            a(82);
        }
        if (kotlinType == null) {
            a(83);
        }
        SimpleType simpleTypeN = n(variance, kotlinType, Annotations.f143689s3.b());
        if (simpleTypeN == null) {
            a(84);
        }
        return simpleTypeN;
    }

    public SimpleType n(Variance variance, KotlinType kotlinType, Annotations annotations) {
        if (variance == null) {
            a(78);
        }
        if (kotlinType == null) {
            a(79);
        }
        if (annotations == null) {
            a(80);
        }
        SimpleType simpleTypeH = KotlinTypeFactory.h(TypeAttributesKt.b(annotations), j(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeH == null) {
            a(81);
        }
        return simpleTypeH;
    }

    public SimpleType o() {
        SimpleType simpleTypeS = S(PrimitiveType.f143257g);
        if (simpleTypeS == null) {
            a(64);
        }
        return simpleTypeS;
    }

    public ClassDescriptor p(FqName fqName) {
        if (fqName == null) {
            a(12);
        }
        ClassDescriptor classDescriptorD = DescriptorUtilKt.d(s(), fqName, NoLookupLocation.f144118d);
        if (classDescriptorD == null) {
            a(13);
        }
        return classDescriptorD;
    }

    public ModuleDescriptorImpl s() {
        if (this.f143241a == null) {
            this.f143241a = this.f143242b.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f143241a;
        if (moduleDescriptorImpl == null) {
            a(7);
        }
        return moduleDescriptorImpl;
    }

    public SimpleType u() {
        SimpleType simpleTypeS = S(PrimitiveType.f143259i);
        if (simpleTypeS == null) {
            a(57);
        }
        return simpleTypeS;
    }

    public SimpleType v() {
        SimpleType simpleTypeS = S(PrimitiveType.f143258h);
        if (simpleTypeS == null) {
            a(63);
        }
        return simpleTypeS;
    }

    protected Iterable<ClassDescriptorFactory> w() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f143246f, s()));
        if (listSingletonList == null) {
            a(5);
        }
        return listSingletonList;
    }

    public ClassDescriptor x() {
        ClassDescriptor classDescriptorP = p(StandardNames.FqNames.f143365X);
        if (classDescriptorP == null) {
            a(35);
        }
        return classDescriptorP;
    }

    public ClassDescriptor y() {
        return q("Comparable");
    }

    public ClassDescriptor D(int i10) {
        return q(StandardNames.b(i10));
    }

    public SimpleType I() {
        SimpleType simpleTypeO = H().o();
        if (simpleTypeO == null) {
            a(49);
        }
        return simpleTypeO;
    }

    public SimpleType J() {
        SimpleType simpleTypeR0 = i().R0(true);
        if (simpleTypeR0 == null) {
            a(52);
        }
        return simpleTypeR0;
    }

    public SimpleType K() {
        SimpleType simpleTypeR0 = I().R0(true);
        if (simpleTypeR0 == null) {
            a(50);
        }
        return simpleTypeR0;
    }

    public SimpleType M() {
        SimpleType simpleTypeO = L().o();
        if (simpleTypeO == null) {
            a(56);
        }
        return simpleTypeO;
    }

    public SimpleType X() {
        SimpleType simpleTypeO = W().o();
        if (simpleTypeO == null) {
            a(66);
        }
        return simpleTypeO;
    }

    public SimpleType a0() {
        SimpleType simpleTypeO = Z().o();
        if (simpleTypeO == null) {
            a(65);
        }
        return simpleTypeO;
    }

    public SimpleType i() {
        SimpleType simpleTypeO = h().o();
        if (simpleTypeO == null) {
            a(51);
        }
        return simpleTypeO;
    }

    public MemberScope t() {
        MemberScope memberScopeN = s().i0(StandardNames.f143284A).n();
        if (memberScopeN == null) {
            a(11);
        }
        return memberScopeN;
    }

    public SimpleType z() {
        SimpleType simpleTypeJ = J();
        if (simpleTypeJ == null) {
            a(53);
        }
        return simpleTypeJ;
    }
}
