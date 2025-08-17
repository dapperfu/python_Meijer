package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public final class DeserializedPropertyDescriptor extends PropertyDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: C, reason: collision with root package name */
    private final ProtoBuf.Property f146542C;

    /* renamed from: D, reason: collision with root package name */
    private final NameResolver f146543D;

    /* renamed from: E, reason: collision with root package name */
    private final TypeTable f146544E;

    /* renamed from: F, reason: collision with root package name */
    private final VersionRequirementTable f146545F;

    /* renamed from: G, reason: collision with root package name */
    private final DeserializedContainerSource f146546G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPropertyDescriptor(DeclarationDescriptor containingDeclaration, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility visibility, boolean z10, Name name, CallableMemberDescriptor.Kind kind, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource) {
        super(containingDeclaration, propertyDescriptor, annotations, modality, visibility, z10, name, kind, SourceElement.f143647a, z11, z12, z15, false, z13, z14);
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(modality, "modality");
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(name, "name");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        this.f146542C = proto;
        this.f146543D = nameResolver;
        this.f146544E = typeTable;
        this.f146545F = versionRequirementTable;
        this.f146546G = deserializedContainerSource;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable D() {
        return this.f146544E;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver G() {
        return this.f146543D;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource H() {
        return this.f146546G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    protected PropertyDescriptorImpl N0(DeclarationDescriptor newOwner, Modality newModality, DescriptorVisibility newVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name newName, SourceElement source) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(newModality, "newModality");
        Intrinsics.j(newVisibility, "newVisibility");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(newName, "newName");
        Intrinsics.j(source, "source");
        return new DeserializedPropertyDescriptor(newOwner, propertyDescriptor, getAnnotations(), newModality, newVisibility, L(), newName, kind, v0(), isConst(), isExternal(), A(), h0(), c0(), G(), D(), e1(), H());
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Property c0() {
        return this.f146542C;
    }

    public VersionRequirementTable e1() {
        return this.f146545F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        Boolean boolD = Flags.f145501E.d(c0().f0());
        Intrinsics.i(boolD, "get(...)");
        return boolD.booleanValue();
    }
}
