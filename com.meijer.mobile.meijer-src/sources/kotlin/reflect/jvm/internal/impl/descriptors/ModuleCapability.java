package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ModuleCapability<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f144532a;

    public ModuleCapability(String name) {
        Intrinsics.j(name, "name");
        this.f144532a = name;
    }

    public String toString() {
        return this.f144532a;
    }
}
