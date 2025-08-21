package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* loaded from: classes14.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageFragment f145728b;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment packageFragment) {
        Intrinsics.j(packageFragment, "packageFragment");
        this.f145728b = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f144555a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f145728b + ": " + this.f145728b.L0().keySet();
    }
}
