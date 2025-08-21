package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* loaded from: classes14.dex */
public class JvmDescriptorTypeWriter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final JvmTypeFactory<T> f145702a;

    /* renamed from: b, reason: collision with root package name */
    private int f145703b;

    /* renamed from: c, reason: collision with root package name */
    private T f145704c;

    public void a() {
    }

    public void b() {
        if (this.f145704c == null) {
            this.f145703b++;
        }
    }

    public void c(T objectType) {
        Intrinsics.j(objectType, "objectType");
        d(objectType);
    }

    protected final void d(T type) {
        Intrinsics.j(type, "type");
        if (this.f145704c == null) {
            if (this.f145703b > 0) {
                type = this.f145702a.a(StringsKt.M("[", this.f145703b) + this.f145702a.d(type));
            }
            this.f145704c = type;
        }
    }

    public void e(Name name, T type) {
        Intrinsics.j(name, "name");
        Intrinsics.j(type, "type");
        d(type);
    }
}
