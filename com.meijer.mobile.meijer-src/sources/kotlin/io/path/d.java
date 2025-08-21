package kotlin.io.path;

import j$.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"j$/nio/file/Path", "", "b", "(Lj$/nio/file/Path;)Ljava/lang/String;", "getName$annotations", "(Lj$/nio/file/Path;)V", "name", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
/* loaded from: classes12.dex */
class d extends PathsKt__PathRecursiveFunctionsKt {
    public static final String b(Path path) {
        Intrinsics.j(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }
}
