package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class ModuleCapability<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f143625a;

    public ModuleCapability(String name) {
        Intrinsics.j(name, "name");
        this.f143625a = name;
    }

    public String toString() {
        return this.f143625a;
    }
}
