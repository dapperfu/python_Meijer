package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes14.dex */
public final class PossiblyInnerType {

    /* renamed from: a, reason: collision with root package name */
    private final ClassifierDescriptorWithTypeParameters f144545a;

    /* renamed from: b, reason: collision with root package name */
    private final List<TypeProjection> f144546b;

    /* renamed from: c, reason: collision with root package name */
    private final PossiblyInnerType f144547c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List<? extends TypeProjection> arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.j(classifierDescriptor, "classifierDescriptor");
        Intrinsics.j(arguments, "arguments");
        this.f144545a = classifierDescriptor;
        this.f144546b = arguments;
        this.f144547c = possiblyInnerType;
    }

    public final List<TypeProjection> a() {
        return this.f144546b;
    }

    public final ClassifierDescriptorWithTypeParameters b() {
        return this.f144545a;
    }

    public final PossiblyInnerType c() {
        return this.f144547c;
    }
}
