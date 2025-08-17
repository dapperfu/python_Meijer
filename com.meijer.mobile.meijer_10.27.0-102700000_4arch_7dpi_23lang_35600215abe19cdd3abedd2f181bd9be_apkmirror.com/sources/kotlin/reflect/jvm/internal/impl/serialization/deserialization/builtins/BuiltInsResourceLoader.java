package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BuiltInsResourceLoader {
    public final InputStream a(String path) {
        Intrinsics.j(path, "path");
        ClassLoader classLoader = BuiltInsResourceLoader.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(resource.openConnection()));
        uRLConnection.setUseCaches(false);
        return uRLConnection.getInputStream();
    }
}
