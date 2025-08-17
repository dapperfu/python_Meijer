package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f143452n = new Companion(null);

    /* renamed from: o, reason: collision with root package name */
    private static final ClassId f143453o;

    /* renamed from: p, reason: collision with root package name */
    private static final ClassId f143454p;

    /* renamed from: f, reason: collision with root package name */
    private final StorageManager f143455f;

    /* renamed from: g, reason: collision with root package name */
    private final PackageFragmentDescriptor f143456g;

    /* renamed from: h, reason: collision with root package name */
    private final FunctionTypeKind f143457h;

    /* renamed from: i, reason: collision with root package name */
    private final int f143458i;

    /* renamed from: j, reason: collision with root package name */
    private final a f143459j;

    /* renamed from: k, reason: collision with root package name */
    private final FunctionClassScope f143460k;

    /* renamed from: l, reason: collision with root package name */
    private final List<TypeParameterDescriptor> f143461l;

    /* renamed from: m, reason: collision with root package name */
    private final FunctionClassKind f143462m;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @SourceDebugExtension
    private final class a extends AbstractClassTypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return true;
        }

        public a() {
            super(FunctionClassDescriptor.this.f143455f);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public FunctionClassDescriptor d() {
            return FunctionClassDescriptor.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.f143461l;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> r() {
            List listP;
            FunctionTypeKind functionTypeKindR0 = FunctionClassDescriptor.this.R0();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.f143478f;
            if (Intrinsics.e(functionTypeKindR0, function)) {
                listP = CollectionsKt.e(FunctionClassDescriptor.f143453o);
            } else if (Intrinsics.e(functionTypeKindR0, FunctionTypeKind.KFunction.f143479f)) {
                listP = CollectionsKt.p(FunctionClassDescriptor.f143454p, new ClassId(StandardNames.f143284A, function.c(FunctionClassDescriptor.this.N0())));
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.f143481f;
                if (Intrinsics.e(functionTypeKindR0, suspendFunction)) {
                    listP = CollectionsKt.e(FunctionClassDescriptor.f143453o);
                } else {
                    if (!Intrinsics.e(functionTypeKindR0, FunctionTypeKind.KSuspendFunction.f143480f)) {
                        AddToStdlibKt.b(null, 1, null);
                        throw new KotlinNothingValueException();
                    }
                    listP = CollectionsKt.p(FunctionClassDescriptor.f143454p, new ClassId(StandardNames.f143312s, suspendFunction.c(FunctionClassDescriptor.this.N0())));
                }
            }
            ModuleDescriptor moduleDescriptorB = FunctionClassDescriptor.this.f143456g.b();
            List<ClassId> list = listP;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorB = FindClassInModuleKt.b(moduleDescriptorB, classId);
                if (classDescriptorB == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listC1 = CollectionsKt.c1(getParameters(), classDescriptorB.i().getParameters().size());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listC1, 10));
                Iterator it = listC1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).o()));
                }
                arrayList.add(KotlinTypeFactory.h(TypeAttributes.f146740b.k(), classDescriptorB, arrayList2));
            }
            return CollectionsKt.j1(arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker v() {
            return SupertypeLoopChecker.EMPTY.f143649a;
        }

        public String toString() {
            return d().toString();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean F0() {
        return false;
    }

    public Void O0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> S() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return false;
    }

    public Void V0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean b0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean r() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        return false;
    }

    static {
        FqName fqName = StandardNames.f143284A;
        Name nameO = Name.o("Function");
        Intrinsics.i(nameO, "identifier(...)");
        f143453o = new ClassId(fqName, nameO);
        FqName fqName2 = StandardNames.f143317x;
        Name nameO2 = Name.o("KFunction");
        Intrinsics.i(nameO2, "identifier(...)");
        f143454p = new ClassId(fqName2, nameO2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(StorageManager storageManager, PackageFragmentDescriptor containingDeclaration, FunctionTypeKind functionTypeKind, int i10) {
        super(storageManager, functionTypeKind.c(i10));
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(functionTypeKind, "functionTypeKind");
        this.f143455f = storageManager;
        this.f143456g = containingDeclaration;
        this.f143457h = functionTypeKind;
        this.f143458i = i10;
        this.f143459j = new a();
        this.f143460k = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i10);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            Variance variance = Variance.f146797f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            H0(arrayList, this, variance, sb2.toString());
            arrayList2.add(Unit.f142422a);
        }
        H0(arrayList, this, Variance.f146798g, "R");
        this.f143461l = CollectionsKt.j1(arrayList);
        this.f143462m = FunctionClassKind.f143464a.a(this.f143457h);
    }

    private static final void H0(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.O0(functionClassDescriptor, Annotations.f143689s3.b(), false, variance, Name.o(str), arrayList.size(), functionClassDescriptor.f143455f));
    }

    public final int N0() {
        return this.f143458i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public PackageFragmentDescriptor b() {
        return this.f143456g;
    }

    public final FunctionTypeKind R0() {
        return this.f143457h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public MemberScope.Empty j0() {
        return MemberScope.Empty.f146293b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public FunctionClassScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f143460k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        return ClassKind.f143586c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement NO_SOURCE = SourceElement.f143647a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.f143689s3.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility PUBLIC = DescriptorVisibilities.f143600e;
        Intrinsics.i(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        return this.f143459j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        return this.f143461l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        return Modality.f143622e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor C() {
        return (ClassConstructorDescriptor) V0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public List<ClassConstructorDescriptor> j() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public List<ClassDescriptor> w() {
        return CollectionsKt.m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public /* bridge */ /* synthetic */ ClassDescriptor k0() {
        return (ClassDescriptor) O0();
    }

    public String toString() {
        String strB = getName().b();
        Intrinsics.i(strB, "asString(...)");
        return strB;
    }
}
