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
/* loaded from: classes13.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* renamed from: h, reason: collision with root package name */
    private final BinaryVersion f146404h;

    /* renamed from: i, reason: collision with root package name */
    private final DeserializedContainerSource f146405i;

    /* renamed from: j, reason: collision with root package name */
    private final NameResolverImpl f146406j;

    /* renamed from: k, reason: collision with root package name */
    private final ProtoBasedClassDataFinder f146407k;

    /* renamed from: l, reason: collision with root package name */
    private ProtoBuf.PackageFragment f146408l;

    /* renamed from: m, reason: collision with root package name */
    private MemberScope f146409m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, StorageManager storageManager, ModuleDescriptor module, ProtoBuf.PackageFragment proto, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        super(fqName, storageManager, module);
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(module, "module");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(metadataVersion, "metadataVersion");
        this.f146404h = metadataVersion;
        this.f146405i = deserializedContainerSource;
        ProtoBuf.StringTable stringTableP = proto.P();
        Intrinsics.i(stringTableP, "getStrings(...)");
        ProtoBuf.QualifiedNameTable qualifiedNameTableO = proto.O();
        Intrinsics.i(qualifiedNameTableO, "getQualifiedNames(...)");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTableP, qualifiedNameTableO);
        this.f146406j = nameResolverImpl;
        this.f146407k = new ProtoBasedClassDataFinder(proto, nameResolverImpl, metadataVersion, new c(this));
        this.f146408l = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SourceElement L0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl, ClassId it) {
        Intrinsics.j(it, "it");
        DeserializedContainerSource deserializedContainerSource = deserializedPackageFragmentImpl.f146405i;
        if (deserializedContainerSource != null) {
            return deserializedContainerSource;
        }
        SourceElement NO_SOURCE = SourceElement.f143647a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    public void I0(DeserializationComponents components) {
        Intrinsics.j(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f146408l;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f146408l = null;
        ProtoBuf.Package packageN = packageFragment.N();
        Intrinsics.i(packageN, "getPackage(...)");
        this.f146409m = new DeserializedPackageMemberScope(this, packageN, this.f146406j, this.f146404h, this.f146405i, components, "scope of " + this, new d(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public ProtoBasedClassDataFinder D0() {
        return this.f146407k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    public MemberScope n() {
        MemberScope memberScope = this.f146409m;
        if (memberScope != null) {
            return memberScope;
        }
        Intrinsics.y("_memberScope");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection N0(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        Collection<ClassId> collectionB = deserializedPackageFragmentImpl.D0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            ClassId classId = (ClassId) obj;
            if (!classId.j() && !ClassDeserializer.f146362c.a().contains(classId)) {
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
