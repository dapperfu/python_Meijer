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
/* loaded from: classes14.dex */
public final class DeserializedTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: k, reason: collision with root package name */
    private final DeserializationContext f147468k;

    /* renamed from: l, reason: collision with root package name */
    private final ProtoBuf.TypeParameter f147469l;

    /* renamed from: m, reason: collision with root package name */
    private final DeserializedAnnotations f147470m;

    /* JADX WARN: Illegal instructions before constructor call */
    public DeserializedTypeParameterDescriptor(DeserializationContext c10, ProtoBuf.TypeParameter proto, int i10) {
        Intrinsics.j(c10, "c");
        Intrinsics.j(proto, "proto");
        StorageManager storageManagerH = c10.h();
        DeclarationDescriptor declarationDescriptorE = c10.e();
        Annotations annotationsB = Annotations.f144596s3.b();
        Name nameB = NameResolverUtilKt.b(c10.g(), proto.O());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.f147344a;
        ProtoBuf.TypeParameter.Variance varianceU = proto.U();
        Intrinsics.i(varianceU, "getVariance(...)");
        super(storageManagerH, declarationDescriptorE, annotationsB, nameB, protoEnumFlags.d(varianceU), proto.P(), i10, SourceElement.f144554a, SupertypeLoopChecker.EMPTY.f144556a);
        this.f147468k = c10;
        this.f147469l = proto;
        this.f147470m = new DeserializedAnnotations(c10.h(), new E(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List K0(DeserializedTypeParameterDescriptor deserializedTypeParameterDescriptor) {
        return CollectionsKt.j1(deserializedTypeParameterDescriptor.f147468k.c().d().g(deserializedTypeParameterDescriptor.f147469l, deserializedTypeParameterDescriptor.f147468k.g()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> I0() {
        List<ProtoBuf.Type> listS = ProtoTypeTableUtilKt.s(this.f147469l, this.f147468k.j());
        if (listS.isEmpty()) {
            return CollectionsKt.e(DescriptorUtilsKt.m(this).z());
        }
        List<ProtoBuf.Type> list = listS;
        TypeDeserializer typeDeserializerI = this.f147468k.i();
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
        return this.f147470m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public Void H0(KotlinType type) {
        Intrinsics.j(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
