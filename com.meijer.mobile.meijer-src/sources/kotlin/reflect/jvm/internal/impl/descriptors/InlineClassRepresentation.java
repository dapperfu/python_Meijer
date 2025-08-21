package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* renamed from: a, reason: collision with root package name */
    private final Name f144522a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f144523b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(Name underlyingPropertyName, Type underlyingType) {
        super(null);
        Intrinsics.j(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.j(underlyingType, "underlyingType");
        this.f144522a = underlyingPropertyName;
        this.f144523b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean a(Name name) {
        Intrinsics.j(name, "name");
        return Intrinsics.e(this.f144522a, name);
    }

    public final Name c() {
        return this.f144522a;
    }

    public final Type d() {
        return this.f144523b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f144522a + ", underlyingType=" + this.f144523b + ')';
    }
}
