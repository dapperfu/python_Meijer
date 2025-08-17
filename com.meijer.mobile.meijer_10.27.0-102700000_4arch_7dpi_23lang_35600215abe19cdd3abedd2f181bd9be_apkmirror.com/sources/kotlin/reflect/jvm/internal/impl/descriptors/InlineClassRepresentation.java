package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class InlineClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* renamed from: a, reason: collision with root package name */
    private final Name f143615a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f143616b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineClassRepresentation(Name underlyingPropertyName, Type underlyingType) {
        super(null);
        Intrinsics.j(underlyingPropertyName, "underlyingPropertyName");
        Intrinsics.j(underlyingType, "underlyingType");
        this.f143615a = underlyingPropertyName;
        this.f143616b = underlyingType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean a(Name name) {
        Intrinsics.j(name, "name");
        return Intrinsics.e(this.f143615a, name);
    }

    public final Name c() {
        return this.f143615a;
    }

    public final Type d() {
        return this.f143616b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f143615a + ", underlyingType=" + this.f143616b + ')';
    }
}
