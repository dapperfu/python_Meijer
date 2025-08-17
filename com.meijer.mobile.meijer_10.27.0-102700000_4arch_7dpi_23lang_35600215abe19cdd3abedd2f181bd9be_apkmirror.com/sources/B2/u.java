package B2;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "file", "LB2/s;", "a", "(Ljava/io/File;)LB2/s;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {
    public static final s a(File file) {
        Intrinsics.j(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.i(absolutePath, "file.canonicalFile.absolutePath");
        return t.a(absolutePath);
    }
}
