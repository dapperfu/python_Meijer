package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionSpecificBehaviorKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes13.dex */
public final class DeserializationContext {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f146393a;

    /* renamed from: b, reason: collision with root package name */
    private final NameResolver f146394b;

    /* renamed from: c, reason: collision with root package name */
    private final DeclarationDescriptor f146395c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeTable f146396d;

    /* renamed from: e, reason: collision with root package name */
    private final VersionRequirementTable f146397e;

    /* renamed from: f, reason: collision with root package name */
    private final BinaryVersion f146398f;

    /* renamed from: g, reason: collision with root package name */
    private final DeserializedContainerSource f146399g;

    /* renamed from: h, reason: collision with root package name */
    private final TypeDeserializer f146400h;

    /* renamed from: i, reason: collision with root package name */
    private final MemberDeserializer f146401i;

    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameters) {
        String strA;
        Intrinsics.j(components, "components");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(typeParameters, "typeParameters");
        this.f146393a = components;
        this.f146394b = nameResolver;
        this.f146395c = containingDeclaration;
        this.f146396d = typeTable;
        this.f146397e = versionRequirementTable;
        this.f146398f = metadataVersion;
        this.f146399g = deserializedContainerSource;
        this.f146400h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (deserializedContainerSource == null || (strA = deserializedContainerSource.a()) == null) ? "[container not found]" : strA);
        this.f146401i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext b(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            nameResolver = deserializationContext.f146394b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i10 & 8) != 0) {
            typeTable = deserializationContext.f146396d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i10 & 16) != 0) {
            versionRequirementTable = deserializationContext.f146397e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i10 & 32) != 0) {
            binaryVersion = deserializationContext.f146398f;
        }
        return deserializationContext.a(declarationDescriptor, list, nameResolver2, typeTable2, versionRequirementTable2, binaryVersion);
    }

    public final DeserializationContext a(DeclarationDescriptor descriptor, List<ProtoBuf.TypeParameter> typeParameterProtos, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(typeParameterProtos, "typeParameterProtos");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        Intrinsics.j(metadataVersion, "metadataVersion");
        return new DeserializationContext(this.f146393a, nameResolver, descriptor, typeTable, VersionSpecificBehaviorKt.b(metadataVersion) ? versionRequirementTable : this.f146397e, metadataVersion, this.f146399g, this.f146400h, typeParameterProtos);
    }

    public final DeserializationComponents c() {
        return this.f146393a;
    }

    public final DeserializedContainerSource d() {
        return this.f146399g;
    }

    public final DeclarationDescriptor e() {
        return this.f146395c;
    }

    public final MemberDeserializer f() {
        return this.f146401i;
    }

    public final NameResolver g() {
        return this.f146394b;
    }

    public final StorageManager h() {
        return this.f146393a.u();
    }

    public final TypeDeserializer i() {
        return this.f146400h;
    }

    public final TypeTable j() {
        return this.f146396d;
    }

    public final VersionRequirementTable k() {
        return this.f146397e;
    }
}
