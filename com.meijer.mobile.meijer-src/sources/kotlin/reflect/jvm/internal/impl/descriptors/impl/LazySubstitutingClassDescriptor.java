package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {

    /* renamed from: b, reason: collision with root package name */
    private final ModuleAwareClassDescriptor f144817b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeSubstitutor f144818c;

    /* renamed from: d, reason: collision with root package name */
    private TypeSubstitutor f144819d;

    /* renamed from: e, reason: collision with root package name */
    private List<TypeParameterDescriptor> f144820e;

    /* renamed from: f, reason: collision with root package name */
    private List<TypeParameterDescriptor> f144821f;

    /* renamed from: g, reason: collision with root package name */
    private TypeConstructor f144822g;

    class a implements Function1<TypeParameterDescriptor, Boolean> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
            return Boolean.valueOf(!typeParameterDescriptor.P());
        }
    }

    class b implements Function1<SimpleType, SimpleType> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke(SimpleType simpleType) {
            return LazySubstitutingClassDescriptor.this.J0(simpleType);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void B0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazySubstitutingClassDescriptor.B0(int):void");
    }

    private TypeSubstitutor H0() {
        if (this.f144819d == null) {
            if (this.f144818c.k()) {
                this.f144819d = this.f144818c;
            } else {
                List<TypeParameterDescriptor> parameters = this.f144817b.i().getParameters();
                this.f144820e = new ArrayList(parameters.size());
                this.f144819d = DescriptorSubstitutor.b(parameters, this.f144818c.j(), this, this.f144820e);
                this.f144821f = CollectionsKt.o0(this.f144820e, new a());
            }
        }
        return this.f144819d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleType J0(SimpleType simpleType) {
        return (simpleType == null || this.f144818c.k()) ? simpleType : (SimpleType) H0().p(simpleType, Variance.f147703e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassConstructorDescriptor C() {
        return this.f144817b.C();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean F0() {
        return this.f144817b.F0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor G0() {
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            B0(23);
        }
        return typeSubstitutor.k() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.h(typeSubstitutor.j(), H0().j()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope R() {
        MemberScope memberScopeR = this.f144817b.R();
        if (memberScopeR == null) {
            B0(28);
        }
        return memberScopeR;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> S() {
        ValueClassRepresentation<SimpleType> valueClassRepresentationS = this.f144817b.S();
        if (valueClassRepresentationS == null) {
            return null;
        }
        return valueClassRepresentationS.b(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope U() {
        MemberScope memberScopeG0 = g0(DescriptorUtilsKt.r(DescriptorUtils.g(this.f144817b)));
        if (memberScopeG0 == null) {
            B0(12);
        }
        return memberScopeG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return this.f144817b.V();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> W() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(17);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean Z() {
        return this.f144817b.Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        DeclarationDescriptor declarationDescriptorB = this.f144817b.b();
        if (declarationDescriptorB == null) {
            B0(22);
        }
        return declarationDescriptorB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean b0() {
        return this.f144817b.b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope e0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            B0(5);
        }
        if (kotlinTypeRefiner == null) {
            B0(6);
        }
        MemberScope memberScopeE0 = this.f144817b.e0(typeSubstitution, kotlinTypeRefiner);
        if (!this.f144818c.k()) {
            return new SubstitutingScope(memberScopeE0, H0());
        }
        if (memberScopeE0 == null) {
            B0(7);
        }
        return memberScopeE0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind f() {
        ClassKind classKindF = this.f144817b.f();
        if (classKindF == null) {
            B0(25);
        }
        return classKindF;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement sourceElement = SourceElement.f144554a;
        if (sourceElement == null) {
            B0(29);
        }
        return sourceElement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope g0(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            B0(13);
        }
        MemberScope memberScopeG0 = this.f144817b.g0(kotlinTypeRefiner);
        if (!this.f144818c.k()) {
            return new SubstitutingScope(memberScopeG0, H0());
        }
        if (memberScopeG0 == null) {
            B0(14);
        }
        return memberScopeG0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f144817b.getAnnotations();
        if (annotations == null) {
            B0(19);
        }
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f144817b.getName();
        if (name == null) {
            B0(20);
        }
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f144817b.getVisibility();
        if (visibility == null) {
            B0(27);
        }
        return visibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return this.f144817b.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        TypeConstructor typeConstructorI = this.f144817b.i();
        if (this.f144818c.k()) {
            if (typeConstructorI == null) {
                B0(0);
            }
            return typeConstructorI;
        }
        if (this.f144822g == null) {
            TypeSubstitutor typeSubstitutorH0 = H0();
            Collection<KotlinType> collectionA = typeConstructorI.a();
            ArrayList arrayList = new ArrayList(collectionA.size());
            Iterator<KotlinType> it = collectionA.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorH0.p(it.next(), Variance.f147703e));
            }
            this.f144822g = new ClassTypeConstructorImpl(this, this.f144820e, arrayList, LockBasedStorageManager.f147540e);
        }
        TypeConstructor typeConstructor = this.f144822g;
        if (typeConstructor == null) {
            B0(1);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f144817b.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f144817b.isInline();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> j() {
        Collection<ClassConstructorDescriptor> collectionJ = this.f144817b.j();
        ArrayList arrayList = new ArrayList(collectionJ.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : collectionJ) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.t().n(classConstructorDescriptor.H0()).k(classConstructorDescriptor.q()).h(classConstructorDescriptor.getVisibility()).r(classConstructorDescriptor.f()).o(false).build()).c(H0()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope j0() {
        MemberScope memberScopeJ0 = this.f144817b.j0();
        if (memberScopeJ0 == null) {
            B0(15);
        }
        return memberScopeJ0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassDescriptor k0() {
        return this.f144817b.k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope n0(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            B0(10);
        }
        MemberScope memberScopeE0 = e0(typeSubstitution, DescriptorUtilsKt.r(DescriptorUtils.g(this)));
        if (memberScopeE0 == null) {
            B0(11);
        }
        return memberScopeE0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modalityQ = this.f144817b.q();
        if (modalityQ == null) {
            B0(26);
        }
        return modalityQ;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean r() {
        return this.f144817b.r();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> w() {
        Collection<ClassDescriptor> collectionW = this.f144817b.w();
        if (collectionW == null) {
            B0(31);
        }
        return collectionW;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean y() {
        return this.f144817b.y();
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f144817b = moduleAwareClassDescriptor;
        this.f144818c = typeSubstitutor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* renamed from: a */
    public ClassDescriptor H0() {
        ClassDescriptor classDescriptorA = this.f144817b.H0();
        if (classDescriptorA == null) {
            B0(21);
        }
        return classDescriptorA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType o() {
        SimpleType simpleTypeM = KotlinTypeFactory.m(DefaultTypeAttributeTranslator.f147593a.a(getAnnotations(), null, null), i(), TypeUtils.g(i().getParameters()), false, U());
        if (simpleTypeM == null) {
            B0(16);
        }
        return simpleTypeM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> p() {
        H0();
        List<TypeParameterDescriptor> list = this.f144821f;
        if (list == null) {
            B0(30);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.a(this, d10);
    }
}
