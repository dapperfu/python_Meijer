package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public abstract class ConstantValue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f146174a;

    public abstract KotlinType a(ModuleDescriptor moduleDescriptor);

    public T b() {
        return this.f146174a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tB = b();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.e(tB, constantValue != null ? constantValue.b() : null);
    }

    public ConstantValue(T t10) {
        this.f146174a = t10;
    }

    public int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
