package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public final class BinaryClassAnnotationAndConstantLoaderImplKt {
    public static final BinaryClassAnnotationAndConstantLoaderImpl a(ModuleDescriptor module, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder, MetadataVersion metadataVersion) {
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        Intrinsics.j(storageManager, "storageManager");
        Intrinsics.j(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.j(metadataVersion, "metadataVersion");
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(module, notFoundClasses, storageManager, kotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.S(metadataVersion);
        return binaryClassAnnotationAndConstantLoaderImpl;
    }
}
