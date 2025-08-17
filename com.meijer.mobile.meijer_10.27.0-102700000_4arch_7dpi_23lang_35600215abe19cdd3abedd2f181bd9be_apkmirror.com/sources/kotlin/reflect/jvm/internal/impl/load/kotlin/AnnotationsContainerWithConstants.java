package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;

/* loaded from: classes13.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<MemberSignature, List<A>> f144754a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<MemberSignature, C> f144755b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<MemberSignature, C> f144756c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(Map<MemberSignature, ? extends List<? extends A>> memberAnnotations, Map<MemberSignature, ? extends C> propertyConstants, Map<MemberSignature, ? extends C> annotationParametersDefaultValues) {
        Intrinsics.j(memberAnnotations, "memberAnnotations");
        Intrinsics.j(propertyConstants, "propertyConstants");
        Intrinsics.j(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f144754a = memberAnnotations;
        this.f144755b = propertyConstants;
        this.f144756c = annotationParametersDefaultValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public Map<MemberSignature, List<A>> a() {
        return this.f144754a;
    }

    public final Map<MemberSignature, C> b() {
        return this.f144756c;
    }

    public final Map<MemberSignature, C> c() {
        return this.f144755b;
    }
}
