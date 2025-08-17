package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* loaded from: classes13.dex */
public final class MultiFieldValueClassRepresentation<Type extends RigidTypeMarker> extends ValueClassRepresentation<Type> {

    /* renamed from: a, reason: collision with root package name */
    private final List<Pair<Name, Type>> f143626a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Name, Type> f143627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiFieldValueClassRepresentation(List<? extends Pair<Name, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        Intrinsics.j(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f143626a = underlyingPropertyNamesToTypes;
        this.f143627b = MapsKt.y(c());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation
    public boolean a(Name name) {
        Intrinsics.j(name, "name");
        return this.f143627b.containsKey(name);
    }

    public List<Pair<Name, Type>> c() {
        return this.f143626a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
