package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* loaded from: classes13.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* renamed from: a, reason: collision with root package name */
    private final Annotations f146679a;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public KClass<? extends AnnotationsTypeAttribute> b() {
        return Reflection.b(AnnotationsTypeAttribute.class);
    }

    public AnnotationsTypeAttribute(Annotations annotations) {
        Intrinsics.j(annotations, "annotations");
        this.f146679a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute a(AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.a(this.f146679a, annotationsTypeAttribute.f146679a));
    }

    public final Annotations e() {
        return this.f146679a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return Intrinsics.e(((AnnotationsTypeAttribute) obj).f146679a, this.f146679a);
        }
        return false;
    }

    public int hashCode() {
        return this.f146679a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AnnotationsTypeAttribute c(AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (Intrinsics.e(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
