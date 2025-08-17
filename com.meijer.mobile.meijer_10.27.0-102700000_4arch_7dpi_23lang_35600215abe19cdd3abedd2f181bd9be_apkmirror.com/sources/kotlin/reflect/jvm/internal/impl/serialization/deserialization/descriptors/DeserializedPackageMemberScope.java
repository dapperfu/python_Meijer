package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

@SourceDebugExtension
/* loaded from: classes13.dex */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {

    /* renamed from: g, reason: collision with root package name */
    private final PackageFragmentDescriptor f146539g;

    /* renamed from: h, reason: collision with root package name */
    private final String f146540h;

    /* renamed from: i, reason: collision with root package name */
    private final FqName f146541i;

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected void j(Collection<DeclarationDescriptor> result, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(result, "result");
        Intrinsics.j(nameFilter, "nameFilter");
    }

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageDescriptor, ProtoBuf.Package proto, NameResolver nameResolver, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource, DeserializationComponents components, String debugName, Function0<? extends Collection<Name>> classNames) {
        Intrinsics.j(packageDescriptor, "packageDescriptor");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(components, "components");
        Intrinsics.j(debugName, "debugName");
        Intrinsics.j(classNames, "classNames");
        ProtoBuf.TypeTable typeTableW = proto.W();
        Intrinsics.i(typeTableW, "getTypeTable(...)");
        TypeTable typeTable = new TypeTable(typeTableW);
        VersionRequirementTable.Companion companion = VersionRequirementTable.f145550b;
        ProtoBuf.VersionRequirementTable versionRequirementTableX = proto.X();
        Intrinsics.i(versionRequirementTableX, "getVersionRequirementTable(...)");
        DeserializationContext deserializationContextA = components.a(packageDescriptor, nameResolver, typeTable, companion.a(versionRequirementTableX), metadataVersion, deserializedContainerSource);
        List<ProtoBuf.Function> listP = proto.P();
        Intrinsics.i(listP, "getFunctionList(...)");
        List<ProtoBuf.Property> listS = proto.S();
        Intrinsics.i(listS, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> listV = proto.V();
        Intrinsics.i(listV, "getTypeAliasList(...)");
        super(deserializationContextA, listP, listS, listV, classNames);
        this.f146539g = packageDescriptor;
        this.f146540h = debugName;
        this.f146541i = packageDescriptor.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<DeclarationDescriptor> g(DescriptorKindFilter kindFilter, Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.j(kindFilter, "kindFilter");
        Intrinsics.j(nameFilter, "nameFilter");
        Collection<DeclarationDescriptor> collectionM = m(kindFilter, nameFilter, NoLookupLocation.f144127m);
        Iterable<ClassDescriptorFactory> iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<ClassDescriptorFactory> it = iterableL.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, it.next().a(this.f146541i));
        }
        return CollectionsKt.P0(collectionM, arrayList);
    }

    public void C(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        UtilsKt.b(s().c().p(), location, this.f146539g, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public ClassifierDescriptor f(Name name, LookupLocation location) {
        Intrinsics.j(name, "name");
        Intrinsics.j(location, "location");
        C(name, location);
        return super.f(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected ClassId p(Name name) {
        Intrinsics.j(name, "name");
        return new ClassId(this.f146541i, name);
    }

    public String toString() {
        return this.f146540h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected boolean z(Name name) {
        Intrinsics.j(name, "name");
        if (super.z(name)) {
            return true;
        }
        Iterable<ClassDescriptorFactory> iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator<ClassDescriptorFactory> it = iterableL.iterator();
        while (it.hasNext()) {
            if (it.next().b(this.f146541i, name)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> v() {
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> w() {
        return SetsKt.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    protected Set<Name> x() {
        return SetsKt.e();
    }
}
