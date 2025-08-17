package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class Visibility {

    /* renamed from: a, reason: collision with root package name */
    private final String f143662a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f143663b;

    public Visibility d() {
        return this;
    }

    protected Visibility(String name, boolean z10) {
        Intrinsics.j(name, "name");
        this.f143662a = name;
        this.f143663b = z10;
    }

    public Integer a(Visibility visibility) {
        Intrinsics.j(visibility, "visibility");
        return Visibilities.f143650a.a(this, visibility);
    }

    public String b() {
        return this.f143662a;
    }

    public final boolean c() {
        return this.f143663b;
    }

    public final String toString() {
        return b();
    }
}
