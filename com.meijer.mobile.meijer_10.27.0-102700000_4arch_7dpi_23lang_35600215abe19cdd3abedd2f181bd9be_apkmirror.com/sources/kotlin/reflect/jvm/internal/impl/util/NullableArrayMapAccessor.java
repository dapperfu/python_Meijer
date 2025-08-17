package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner;

/* loaded from: classes13.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty<AbstractArrayMapOwner<K, V>, V> {
    @Override // kotlin.properties.ReadOnlyProperty
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T getValue(AbstractArrayMapOwner<K, V> thisRef, KProperty<?> property) {
        Intrinsics.j(thisRef, "thisRef");
        Intrinsics.j(property, "property");
        return a(thisRef);
    }

    public NullableArrayMapAccessor(int i10) {
        super(i10);
    }
}
