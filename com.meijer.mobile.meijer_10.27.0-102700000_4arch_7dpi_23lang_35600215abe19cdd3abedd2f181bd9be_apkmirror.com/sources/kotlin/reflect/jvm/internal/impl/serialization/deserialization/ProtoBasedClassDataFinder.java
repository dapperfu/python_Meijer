package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* renamed from: a, reason: collision with root package name */
    private final NameResolver f146423a;

    /* renamed from: b, reason: collision with root package name */
    private final BinaryVersion f146424b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<ClassId, SourceElement> f146425c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<ClassId, ProtoBuf.Class> f146426d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(ProtoBuf.PackageFragment proto, NameResolver nameResolver, BinaryVersion metadataVersion, Function1<? super ClassId, ? extends SourceElement> classSource) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(classSource, "classSource");
        this.f146423a = nameResolver;
        this.f146424b = metadataVersion;
        this.f146425c = classSource;
        List<ProtoBuf.Class> listK = proto.K();
        Intrinsics.i(listK, "getClass_List(...)");
        List<ProtoBuf.Class> list = listK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.a(this.f146423a, ((ProtoBuf.Class) obj).K0()), obj);
        }
        this.f146426d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public ClassData a(ClassId classId) {
        Intrinsics.j(classId, "classId");
        ProtoBuf.Class r02 = this.f146426d.get(classId);
        if (r02 == null) {
            return null;
        }
        return new ClassData(this.f146423a, r02, this.f146424b, this.f146425c.invoke(classId));
    }

    public final Collection<ClassId> b() {
        return this.f146426d.keySet();
    }
}
