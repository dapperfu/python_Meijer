package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public final class DeserializedTypeAliasDescriptor extends AbstractTypeAliasDescriptor implements DeserializedMemberDescriptor {

    /* renamed from: k, reason: collision with root package name */
    private final ProtoBuf.TypeAlias f146552k;

    /* renamed from: l, reason: collision with root package name */
    private final NameResolver f146553l;

    /* renamed from: m, reason: collision with root package name */
    private final TypeTable f146554m;

    /* renamed from: n, reason: collision with root package name */
    private final VersionRequirementTable f146555n;

    /* renamed from: o, reason: collision with root package name */
    private final DeserializedContainerSource f146556o;

    /* renamed from: p, reason: collision with root package name */
    private SimpleType f146557p;

    /* renamed from: q, reason: collision with root package name */
    private SimpleType f146558q;

    /* renamed from: r, reason: collision with root package name */
    private List<? extends TypeParameterDescriptor> f146559r;

    /* renamed from: s, reason: collision with root package name */
    private SimpleType f146560s;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, DescriptorVisibility visibility, ProtoBuf.TypeAlias proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(name, "name");
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        SourceElement NO_SOURCE = SourceElement.f143647a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        super(storageManager, containingDeclaration, annotations, name, NO_SOURCE, visibility);
        this.f146552k = proto;
        this.f146553l = nameResolver;
        this.f146554m = typeTable;
        this.f146555n = versionRequirementTable;
        this.f146556o = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable D() {
        return this.f146554m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType F() {
        SimpleType simpleType = this.f146558q;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.y("expandedType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver G() {
        return this.f146553l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource H() {
        return this.f146556o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor
    protected List<TypeParameterDescriptor> O0() {
        List list = this.f146559r;
        if (list != null) {
            return list;
        }
        Intrinsics.y("typeConstructorParameters");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: R0, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias c0() {
        return this.f146552k;
    }

    public VersionRequirementTable S0() {
        return this.f146555n;
    }

    public final void T0(List<? extends TypeParameterDescriptor> declaredTypeParameters, SimpleType underlyingType, SimpleType expandedType) {
        Intrinsics.j(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.j(underlyingType, "underlyingType");
        Intrinsics.j(expandedType, "expandedType");
        P0(declaredTypeParameters);
        this.f146557p = underlyingType;
        this.f146558q = expandedType;
        this.f146559r = TypeParameterUtilsKt.g(this);
        this.f146560s = J0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public TypeAliasDescriptor c(TypeSubstitutor substitutor) {
        Intrinsics.j(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        StorageManager storageManagerK = K();
        DeclarationDescriptor declarationDescriptorB = b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        Annotations annotations = getAnnotations();
        Intrinsics.i(annotations, "<get-annotations>(...)");
        Name name = getName();
        Intrinsics.i(name, "getName(...)");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(storageManagerK, declarationDescriptorB, annotations, name, getVisibility(), c0(), G(), D(), S0(), H());
        List<TypeParameterDescriptor> listP = p();
        SimpleType simpleTypeQ0 = q0();
        Variance variance = Variance.f146796e;
        KotlinType kotlinTypeN = substitutor.n(simpleTypeQ0, variance);
        Intrinsics.i(kotlinTypeN, "safeSubstitute(...)");
        SimpleType simpleTypeA = TypeSubstitutionKt.a(kotlinTypeN);
        KotlinType kotlinTypeN2 = substitutor.n(F(), variance);
        Intrinsics.i(kotlinTypeN2, "safeSubstitute(...)");
        deserializedTypeAliasDescriptor.T0(listP, simpleTypeA, TypeSubstitutionKt.a(kotlinTypeN2));
        return deserializedTypeAliasDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType o() {
        SimpleType simpleType = this.f146560s;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.y("defaultTypeImpl");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public SimpleType q0() {
        SimpleType simpleType = this.f146557p;
        if (simpleType != null) {
            return simpleType;
        }
        Intrinsics.y("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor
    public ClassDescriptor s() {
        if (KotlinTypeKt.a(F())) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorD = F().K0().d();
        if (!(classifierDescriptorD instanceof ClassDescriptor)) {
            return null;
        }
        return (ClassDescriptor) classifierDescriptorD;
    }
}
