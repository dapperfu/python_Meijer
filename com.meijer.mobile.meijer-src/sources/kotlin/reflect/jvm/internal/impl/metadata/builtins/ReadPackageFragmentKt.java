package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ReadPackageFragmentKt {
    public static final Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> a(InputStream inputStream) {
        ProtoBuf.PackageFragment packageFragmentX;
        Intrinsics.j(inputStream, "<this>");
        try {
            BuiltInsBinaryVersion builtInsBinaryVersionA = BuiltInsBinaryVersion.f146383g.a(inputStream);
            if (builtInsBinaryVersionA.h()) {
                ExtensionRegistryLite extensionRegistryLiteD = ExtensionRegistryLite.d();
                BuiltInsProtoBuf.a(extensionRegistryLiteD);
                packageFragmentX = ProtoBuf.PackageFragment.X(inputStream, extensionRegistryLiteD);
            } else {
                packageFragmentX = null;
            }
            Pair<ProtoBuf.PackageFragment, BuiltInsBinaryVersion> pairA = TuplesKt.a(packageFragmentX, builtInsBinaryVersionA);
            CloseableKt.a(inputStream, null);
            return pairA;
        } finally {
        }
    }
}
