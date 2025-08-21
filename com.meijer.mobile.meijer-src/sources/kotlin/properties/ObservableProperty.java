package kotlin.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u000fJ)\u0010\u0010\u001a\u00020\u00112\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00028\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J,\u0010\u0016\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\u0007\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u001a"}, d2 = {"Lkotlin/properties/ObservableProperty;", "V", "Lkotlin/properties/ReadWriteProperty;", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "value", "Ljava/lang/Object;", "beforeChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "afterChange", "", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "getValue", "thisRef", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {
    private V value;

    protected void afterChange(KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.j(property, "property");
    }

    protected boolean beforeChange(KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.j(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.j(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(Object thisRef, KProperty<?> property, V value) {
        Intrinsics.j(property, "property");
        V v10 = this.value;
        if (beforeChange(property, v10, value)) {
            this.value = value;
            afterChange(property, v10, value);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }

    public ObservableProperty(V v10) {
        this.value = v10;
    }
}
