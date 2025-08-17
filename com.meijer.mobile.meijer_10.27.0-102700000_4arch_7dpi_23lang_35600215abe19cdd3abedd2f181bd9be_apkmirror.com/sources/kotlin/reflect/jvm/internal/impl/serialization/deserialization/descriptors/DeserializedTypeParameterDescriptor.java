package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: k, reason: collision with root package name */
    private final DeserializationContext f146561k;

    /* renamed from: l, reason: collision with root package name */
    private final ProtoBuf.TypeParameter f146562l;

    /* renamed from: m, reason: collision with root package name */
    private final DeserializedAnnotations f146563m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext c10, ProtoBuf.TypeParameter proto, int i10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(proto, "proto");
        StorageManager storageManagerH = c10.h();
        DeclarationDescriptor declarationDescriptorE = c10.e();
        Annotations annotationsB = Annotations.f143689s3.b();
        Name nameB = NameResolverUtilKt.b(c10.g(), proto.O());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f146437a;
        ProtoBuf.TypeParameter.Variance varianceU = proto.U();
        Intrinsics.i(varianceU, "getVariance(...)");
        super(storageManagerH, declarationDescriptorE, annotationsB, nameB, protoEnumFlags.d(varianceU), proto.P(), i10, SourceElement.f143647a, SupertypeLoopChecker.EMPTY.f143649a);
        this.f146561k = c10;
        this.f146562l = proto;
        this.f146563m = new DeserializedAnnotations(c10.h(), new E(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return CollectionsKt.j1(deserializedTypeParameterDescriptor.f146561k.c().d().g(deserializedTypeParameterDescriptor.f146562l, deserializedTypeParameterDescriptor.f146561k.g()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> I0() {
        List<ProtoBuf.Type> listS = ProtoTypeTableUtilKt.s(this.f146562l, this.f146561k.j());
        if (listS.isEmpty()) {
            return CollectionsKt.e(DescriptorUtilsKt.m(this).z());
        }
        List<ProtoBuf.Type> list = listS;
        TypeDeserializer typeDeserializerI = this.f146561k.i();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(typeDeserializerI.u((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public DeserializedAnnotations getAnnotations() {
        return this.f146563m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Void H0(KotlinType type) {
        Intrinsics.j(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
