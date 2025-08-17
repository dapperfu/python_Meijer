package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes13.dex */
public final class PossiblyInnerType {

    /* renamed from: a, reason: collision with root package name */
    private final ClassifierDescriptorWithTypeParameters f143638a;

    /* renamed from: b, reason: collision with root package name */
    private final List<TypeProjection> f143639b;

    /* renamed from: c, reason: collision with root package name */
    private final PossiblyInnerType f143640c;

    /* JADX WARN: Multi-variable type inference failed */
    public PossiblyInnerType(ClassifierDescriptorWithTypeParameters classifierDescriptor, List<? extends TypeProjection> arguments, PossiblyInnerType possiblyInnerType) {
        Intrinsics.j(classifierDescriptor, "classifierDescriptor");
        Intrinsics.j(arguments, "arguments");
        this.f143638a = classifierDescriptor;
        this.f143639b = arguments;
        this.f143640c = possiblyInnerType;
    }

    public final List<TypeProjection> a() {
        return this.f143639b;
    }

    public final ClassifierDescriptorWithTypeParameters b() {
        return this.f143638a;
    }

    public final PossiblyInnerType c() {
        return this.f143640c;
    }
}
