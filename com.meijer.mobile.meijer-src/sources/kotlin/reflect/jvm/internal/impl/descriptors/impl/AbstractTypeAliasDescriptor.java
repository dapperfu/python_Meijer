package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* renamed from: j, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f144703j = {Reflection.j(new PropertyReference1Impl(AbstractTypeAliasDescriptor.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* renamed from: e, reason: collision with root package name */
    private final StorageManager f144704e;

    /* renamed from: f, reason: collision with root package name */
    private final DescriptorVisibility f144705f;

    /* renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f144706g;

    /* renamed from: h, reason: collision with root package name */
    private List<? extends TypeParameterDescriptor> f144707h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor$typeConstructor$1 f144708i;

    protected abstract List<TypeParameterDescriptor> O0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, SourceElement sourceElement, DescriptorVisibility visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(name, "name");
        Intrinsics.j(sourceElement, "sourceElement");
        Intrinsics.j(visibilityImpl, "visibilityImpl");
        this.f144704e = storageManager;
        this.f144705f = visibilityImpl;
        this.f144706g = storageManager.c(new a(this));
        this.f144708i = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public TypeConstructor b(KotlinTypeRefiner kotlinTypeRefiner) {
                Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean e() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TypeAliasDescriptor d() {
                return this.f144709a;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.f144709a.O0();
            }

            public String toString() {
                return "[typealias " + d().getName().b() + ']';
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public Collection<KotlinType> a() {
                Collection<KotlinType> collectionA = d().q0().K0().a();
                Intrinsics.i(collectionA, "getSupertypes(...)");
                return collectionA;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public KotlinBuiltIns l() {
                return DescriptorUtilsKt.m(d());
            }
        };
    }

    protected final StorageManager K() {
        return this.f144704e;
    }

    public final void P0(List<? extends TypeParameterDescriptor> declaredTypeParameters) {
        Intrinsics.j(declaredTypeParameters, "declaredTypeParameters");
        this.f144707h = declaredTypeParameters;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f144705f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        return this.f144708i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        List list = this.f144707h;
        if (list != null) {
            return list;
        }
        Intrinsics.x("declaredTypeParametersImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "typealias " + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.j(visitor, "visitor");
        return visitor.d(this, d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType K0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorF = kotlinTypeRefiner.f(abstractTypeAliasDescriptor);
        if (classifierDescriptorF != null) {
            return classifierDescriptorF.o();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection L0(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        return abstractTypeAliasDescriptor.N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean Q0(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor r1, kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2) {
        /*
            kotlin.jvm.internal.Intrinsics.g(r2)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.a(r2)
            if (r0 != 0) goto L23
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r2 = r2.K0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r2 = r2.d()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
            if (r0 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.b()
            boolean r1 = kotlin.jvm.internal.Intrinsics.e(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor.Q0(kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor, kotlin.reflect.jvm.internal.impl.types.UnwrappedType):java.lang.Boolean");
    }

    protected final SimpleType J0() {
        MemberScope memberScopeU;
        ClassDescriptor classDescriptorS = s();
        if (classDescriptorS == null || (memberScopeU = classDescriptorS.U()) == null) {
            memberScopeU = MemberScope.Empty.f147200b;
        }
        SimpleType simpleTypeU = TypeUtils.u(this, memberScopeU, new c(this));
        Intrinsics.i(simpleTypeU, "makeUnsubstitutedType(...)");
        return simpleTypeU;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor a() {
        DeclarationDescriptorWithSource declarationDescriptorWithSourceA = super.a();
        Intrinsics.h(declarationDescriptorWithSourceA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (TypeAliasDescriptor) declarationDescriptorWithSourceA;
    }

    public final Collection<TypeAliasConstructorDescriptor> N0() {
        ClassDescriptor classDescriptorS = s();
        if (classDescriptorS == null) {
            return CollectionsKt.m();
        }
        Collection<ClassConstructorDescriptor> collectionJ = classDescriptorS.j();
        Intrinsics.i(collectionJ, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : collectionJ) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.f144904I;
            StorageManager storageManager = this.f144704e;
            Intrinsics.g(classConstructorDescriptor);
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorB = companion.b(storageManager, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorB != null) {
                arrayList.add(typeAliasConstructorDescriptorB);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        return TypeUtils.c(q0(), new b(this));
    }
}
