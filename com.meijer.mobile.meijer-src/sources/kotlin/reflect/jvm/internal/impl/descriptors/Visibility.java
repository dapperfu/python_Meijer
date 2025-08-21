package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class Visibility {

    /* renamed from: a, reason: collision with root package name */
    private final String f144569a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f144570b;

    public Visibility d() {
        return this;
    }

    protected Visibility(String name, boolean z10) {
        Intrinsics.j(name, "name");
        this.f144569a = name;
        this.f144570b = z10;
    }

    public Integer a(Visibility visibility) {
        Intrinsics.j(visibility, "visibility");
        return Visibilities.f144557a.a(this, visibility);
    }

    public String b() {
        return this.f144569a;
    }

    public final boolean c() {
        return this.f144570b;
    }

    public final String toString() {
        return b();
    }
}
