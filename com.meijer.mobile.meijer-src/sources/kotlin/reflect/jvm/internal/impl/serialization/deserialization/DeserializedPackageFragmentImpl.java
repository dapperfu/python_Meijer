package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* renamed from: h, reason: collision with root package name */
    private final BinaryVersion f147311h;

    /* renamed from: i, reason: collision with root package name */
    private final DeserializedContainerSource f147312i;

    /* renamed from: j, reason: collision with root package name */
    private final NameResolverImpl f147313j;

    /* renamed from: k, reason: collision with root package name */
    private final ProtoBasedClassDataFinder f147314k;

    /* renamed from: l, reason: collision with root package name */
    private ProtoBuf.PackageFragment f147315l;

    /* renamed from: m, reason: collision with root package name */
    private MemberScope f147316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor module, ProtoBuf.PackageFragment proto, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(module, "module");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(metadataVersion, "metadataVersion");
        this.f147311h = metadataVersion;
        this.f147312i = deserializedContainerSource;
        ProtoBuf.StringTable stringTableP = proto.P();
        Intrinsics.i(stringTableP, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNameTableO = proto.O();
        Intrinsics.i(qualifiedNameTableO, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTableP, qualifiedNameTableO);
        this.f147313j = nameResolverImpl;
        this.f147314k = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new c(this));
        this.f147315l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SourceElement L0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, ClassId it) {
        Intrinsics.j(it, "it");
        DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.f147312i;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement NO_SOURCE = SourceElement.f144554a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void I0(DeserializationComponents components) {
        Intrinsics.j(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f147315l;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f147315l = null;
        ProtoBuf.Package packageN = packageFragment.N();
        Intrinsics.i(packageN, "getPackage(...)");
        this.f147316m = new DeserializedPackageMemberScope(this, packageN, this.f147313j, this.f147311h, this.f147312i, components, "scope of " + this, new d(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public ProtoBasedClassDataFinder D0() {
        return this.f147314k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope n() {
        MemberScope memberScope = this.f147316m;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.x("_memberScope");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection N0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        Collection<ClassId> collectionB = deserializedPackageFragmentImpl.D0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            ClassId classId = (ClassId) obj;
            if (!classId.j() && !ClassDeserializer.f147269c.a().contains(classId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ClassId) it.next()).h());
        }
        return arrayList2;
    }
}
