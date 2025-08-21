package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* loaded from: classes14.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* renamed from: b, reason: collision with root package name */
    private final KotlinJvmBinaryClass f145729b;

    /* renamed from: c, reason: collision with root package name */
    private final IncompatibleVersionErrorData<MetadataVersion> f145730c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f145731d;

    /* renamed from: e, reason: collision with root package name */
    private final DeserializedContainerAbiStability f145732e;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass binaryClass, IncompatibleVersionErrorData<MetadataVersion> incompatibleVersionErrorData, boolean z10, DeserializedContainerAbiStability abiStability) {
        Intrinsics.j(binaryClass, "binaryClass");
        Intrinsics.j(abiStability, "abiStability");
        this.f145729b = binaryClass;
        this.f145730c = incompatibleVersionErrorData;
        this.f145731d = z10;
        this.f145732e = abiStability;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource
    public String a() {
        return "Class '" + this.f145729b.f().a().a() + '\'';
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f144555a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final KotlinJvmBinaryClass d() {
        return this.f145729b;
    }

    public String toString() {
        return KotlinJvmBinarySourceElement.class.getSimpleName() + ": " + this.f145729b;
    }
}
