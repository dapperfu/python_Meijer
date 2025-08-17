package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* loaded from: classes13.dex */
public class JvmDescriptorTypeWriter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final JvmTypeFactory<T> f144795a;

    /* renamed from: b, reason: collision with root package name */
    private int f144796b;

    /* renamed from: c, reason: collision with root package name */
    private T f144797c;

    public void a() {
    }

    public void b() {
        if (this.f144797c == null) {
            this.f144796b++;
        }
    }

    public void c(T objectType) {
        Intrinsics.j(objectType, "objectType");
        d(objectType);
    }

    protected final void d(T type) {
        Intrinsics.j(type, "type");
        if (this.f144797c == null) {
            if (this.f144796b > 0) {
                type = this.f144795a.a(StringsKt.M("[", this.f144796b) + this.f144795a.d(type));
            }
            this.f144797c = type;
        }
    }

    public void e(Name name, T type) {
        Intrinsics.j(name, "name");
        Intrinsics.j(type, "type");
        d(type);
    }
}
