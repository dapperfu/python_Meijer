package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;

/* loaded from: classes13.dex */
public abstract class TypeAttribute<T extends TypeAttribute<? extends T>> {
    public abstract T a(T t10);

    public abstract KClass<? extends T> b();

    public abstract T c(T t10);
}
