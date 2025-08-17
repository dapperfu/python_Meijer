package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* loaded from: classes13.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {

    /* renamed from: b, reason: collision with root package name */
    private final LazyJavaPackageFragment f144821b;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment packageFragment) {
        Intrinsics.j(packageFragment, "packageFragment");
        this.f144821b = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f143648a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return this.f144821b + ": " + this.f144821b.L0().keySet();
    }
}
