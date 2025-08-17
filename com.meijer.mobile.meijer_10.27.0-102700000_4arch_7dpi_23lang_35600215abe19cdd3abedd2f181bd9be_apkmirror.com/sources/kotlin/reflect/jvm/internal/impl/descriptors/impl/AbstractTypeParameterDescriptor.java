package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* loaded from: classes13.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* renamed from: e, reason: collision with root package name */
    private final Variance f143803e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f143804f;

    /* renamed from: g, reason: collision with root package name */
    private final int f143805g;

    /* renamed from: h, reason: collision with root package name */
    private final NotNullLazyValue<TypeConstructor> f143806h;

    /* renamed from: i, reason: collision with root package name */
    private final NotNullLazyValue<SimpleType> f143807i;

    /* renamed from: j, reason: collision with root package name */
    private final StorageManager f143808j;

    class a implements Function0<TypeConstructor> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StorageManager f143809a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SupertypeLoopChecker f143810b;

        a(StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            this.f143809a = storageManager;
            this.f143810b = supertypeLoopChecker;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TypeConstructor invoke() {
            return new c(AbstractTypeParameterDescriptor.this, this.f143809a, this.f143810b);
        }
    }

    class b implements Function0<SimpleType> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Name f143812a;

        class a implements Function0<MemberScope> {
            a() {
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberScope invoke() {
                return TypeIntersectionScope.m("Scope for type parameter " + b.this.f143812a.b(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            }
        }

        b(Name name) {
            this.f143812a = name;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            return KotlinTypeFactory.m(TypeAttributes.f146740b.k(), AbstractTypeParameterDescriptor.this.i(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new a()));
        }
    }

    private class c extends AbstractTypeConstructor {

        /* renamed from: d, reason: collision with root package name */
        private final SupertypeLoopChecker f143815d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractTypeParameterDescriptor f143816e;

        private static /* synthetic */ void H(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean e() {
            return true;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                H(0);
            }
            this.f143816e = abstractTypeParameterDescriptor;
            this.f143815d = supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public ClassifierDescriptor d() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f143816e;
            if (abstractTypeParameterDescriptor == null) {
                H(3);
            }
            return abstractTypeParameterDescriptor;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
            if (list == null) {
                H(2);
            }
            return list;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        protected boolean h(ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor == null) {
                H(9);
            }
            return (classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.f146116a.m(this.f143816e, (TypeParameterDescriptor) classifierDescriptor, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns l() {
            KotlinBuiltIns kotlinBuiltInsM = DescriptorUtilsKt.m(this.f143816e);
            if (kotlinBuiltInsM == null) {
                H(4);
            }
            return kotlinBuiltInsM;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> r() {
            List<KotlinType> listI0 = this.f143816e.I0();
            if (listI0 == null) {
                H(1);
            }
            return listI0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected KotlinType s() {
            return ErrorUtils.d(ErrorTypeKind.f146976u, new String[0]);
        }

        public String toString() {
            return this.f143816e.getName().toString();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker v() {
            SupertypeLoopChecker supertypeLoopChecker = this.f143815d;
            if (supertypeLoopChecker == null) {
                H(5);
            }
            return supertypeLoopChecker;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected List<KotlinType> x(List<KotlinType> list) {
            if (list == null) {
                H(7);
            }
            List<KotlinType> listD0 = this.f143816e.D0(list);
            if (listD0 == null) {
                H(8);
            }
            return listD0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected void z(KotlinType kotlinType) {
            if (kotlinType == null) {
                H(6);
            }
            this.f143816e.H0(kotlinType);
        }
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected abstract void H0(KotlinType kotlinType);

    protected abstract List<KotlinType> I0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean P() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractTypeParameterDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Variance variance, boolean z10, int i10, SourceElement sourceElement, SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            e0(0);
        }
        if (declarationDescriptor == null) {
            e0(1);
        }
        if (annotations == null) {
            e0(2);
        }
        if (name == null) {
            e0(3);
        }
        if (variance == null) {
            e0(4);
        }
        if (sourceElement == null) {
            e0(5);
        }
        if (supertypeLoopChecker == null) {
            e0(6);
        }
        this.f143803e = variance;
        this.f143804f = z10;
        this.f143805g = i10;
        this.f143806h = storageManager.c(new a(storageManager, supertypeLoopChecker));
        this.f143807i = storageManager.c(new b(name));
        this.f143808j = storageManager;
    }

    protected List<KotlinType> D0(List<KotlinType> list) {
        if (list == null) {
            e0(12);
        }
        if (list == null) {
            e0(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager K() {
        StorageManager storageManager = this.f143808j;
        if (storageManager == null) {
            e0(14);
        }
        return storageManager;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f143805g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor i() {
        TypeConstructor typeConstructorInvoke = this.f143806h.invoke();
        if (typeConstructorInvoke == null) {
            e0(9);
        }
        return typeConstructorInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance k() {
        Variance variance = this.f143803e;
        if (variance == null) {
            e0(7);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType o() {
        SimpleType simpleTypeInvoke = this.f143807i.invoke();
        if (simpleTypeInvoke == null) {
            e0(10);
        }
        return simpleTypeInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean v() {
        return this.f143804f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public TypeParameterDescriptor H0() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.H0();
        if (typeParameterDescriptor == null) {
            e0(11);
        }
        return typeParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> listA = ((c) i()).a();
        if (listA == null) {
            e0(8);
        }
        return listA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.m(this, d10);
    }
}
