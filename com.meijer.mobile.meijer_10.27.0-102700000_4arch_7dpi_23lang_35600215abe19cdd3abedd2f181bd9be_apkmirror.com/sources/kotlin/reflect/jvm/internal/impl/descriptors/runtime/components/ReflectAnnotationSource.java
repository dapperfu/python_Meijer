package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

/* loaded from: classes13.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* renamed from: b, reason: collision with root package name */
    private final Annotation f144038b;

    public ReflectAnnotationSource(Annotation annotation) {
        Intrinsics.j(annotation, "annotation");
        this.f144038b = annotation;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile b() {
        SourceFile NO_SOURCE_FILE = SourceFile.f143648a;
        Intrinsics.i(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final Annotation d() {
        return this.f144038b;
    }
}
