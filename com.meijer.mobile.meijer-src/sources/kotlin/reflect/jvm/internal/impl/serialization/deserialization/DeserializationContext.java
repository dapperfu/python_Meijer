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

/* loaded from: classes14.dex */
public final class DeserializationContext {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f147300a;

    /* renamed from: b, reason: collision with root package name */
    private final NameResolver f147301b;

    /* renamed from: c, reason: collision with root package name */
    private final DeclarationDescriptor f147302c;

    /* renamed from: d, reason: collision with root package name */
    private final TypeTable f147303d;

    /* renamed from: e, reason: collision with root package name */
    private final VersionRequirementTable f147304e;

    /* renamed from: f, reason: collision with root package name */
    private final BinaryVersion f147305f;

    /* renamed from: g, reason: collision with root package name */
    private final DeserializedContainerSource f147306g;

    /* renamed from: h, reason: collision with root package name */
    private final TypeDeserializer f147307h;

    /* renamed from: i, reason: collision with root package name */
    private final MemberDeserializer f147308i;

    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, TypeDeserializer typeDeserializer, List<ProtoBuf.TypeParameter> typeParameters) {
        String strA;
        Intrinsics.j(components, "components");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(typeTable, "typeTable");
        Intrinsics.j(versionRequirementTable, "versionRequirementTable");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(typeParameters, "typeParameters");
        this.f147300a = components;
        this.f147301b = nameResolver;
        this.f147302c = containingDeclaration;
        this.f147303d = typeTable;
        this.f147304e = versionRequirementTable;
        this.f147305f = metadataVersion;
        this.f147306g = deserializedContainerSource;
        this.f147307h = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (deserializedContainerSource == null || (strA = deserializedContainerSource.a()) == null) ? "[container not found]" : strA);
        this.f147308i = new MemberDeserializer(this);
    }

    public static /* synthetic */ DeserializationContext b(DeserializationContext deserializationContext, DeclarationDescriptor declarationDescriptor, List list, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion binaryVersion, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            nameResolver = deserializationContext.f147301b;
        }
        NameResolver nameResolver2 = nameResolver;
        if ((i10 & 8) != 0) {
            typeTable = deserializationContext.f147303d;
        }
        TypeTable typeTable2 = typeTable;
        if ((i10 & 16) != 0) {
            versionRequirementTable = deserializationContext.f147304e;
        }
        VersionRequirementTable versionRequirementTable2 = versionRequirementTable;
        if ((i10 & 32) != 0) {
            binaryVersion = deserializationContext.f147305f;
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
        return new DeserializationContext(this.f147300a, nameResolver, descriptor, typeTable, VersionSpecificBehaviorKt.b(metadataVersion) ? versionRequirementTable : this.f147304e, metadataVersion, this.f147306g, this.f147307h, typeParameterProtos);
    }

    public final DeserializationComponents c() {
        return this.f147300a;
    }

    public final DeserializedContainerSource d() {
        return this.f147306g;
    }

    public final DeclarationDescriptor e() {
        return this.f147302c;
    }

    public final MemberDeserializer f() {
        return this.f147308i;
    }

    public final NameResolver g() {
        return this.f147301b;
    }

    public final StorageManager h() {
        return this.f147300a.u();
    }

    public final TypeDeserializer i() {
        return this.f147307h;
    }

    public final TypeTable j() {
        return this.f147303d;
    }

    public final VersionRequirementTable k() {
        return this.f147304e;
    }
}
