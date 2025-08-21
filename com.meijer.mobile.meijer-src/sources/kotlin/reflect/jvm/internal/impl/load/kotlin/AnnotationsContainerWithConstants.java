package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;

/* loaded from: classes14.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<MemberSignature, List<A>> f145661a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<MemberSignature, C> f145662b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<MemberSignature, C> f145663c;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(Map<MemberSignature, ? extends List<? extends A>> memberAnnotations, Map<MemberSignature, ? extends C> propertyConstants, Map<MemberSignature, ? extends C> annotationParametersDefaultValues) {
        Intrinsics.j(memberAnnotations, "memberAnnotations");
        Intrinsics.j(propertyConstants, "propertyConstants");
        Intrinsics.j(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f145661a = memberAnnotations;
        this.f145662b = propertyConstants;
        this.f145663c = annotationParametersDefaultValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public Map<MemberSignature, List<A>> a() {
        return this.f145661a;
    }

    public final Map<MemberSignature, C> b() {
        return this.f145663c;
    }

    public final Map<MemberSignature, C> c() {
        return this.f145662b;
    }
}
