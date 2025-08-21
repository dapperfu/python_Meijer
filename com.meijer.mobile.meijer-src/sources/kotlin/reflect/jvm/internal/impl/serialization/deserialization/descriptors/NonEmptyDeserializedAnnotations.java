package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class NonEmptyDeserializedAnnotations extends DeserializedAnnotations {
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(StorageManager storageManager, Function0<? extends List<? extends AnnotationDescriptor>> compute) {
        super(storageManager, compute);
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(compute, "compute");
    }
}
