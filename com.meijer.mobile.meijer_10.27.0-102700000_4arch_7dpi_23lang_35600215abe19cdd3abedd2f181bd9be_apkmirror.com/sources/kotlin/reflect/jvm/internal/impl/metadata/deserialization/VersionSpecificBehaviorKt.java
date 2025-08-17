package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean a(BinaryVersion version) {
        Intrinsics.j(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(BinaryVersion version) {
        Intrinsics.j(version, "version");
        return a(version);
    }
}
