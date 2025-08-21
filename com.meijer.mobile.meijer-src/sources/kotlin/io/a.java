package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "", "b", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension
/* loaded from: classes10.dex */
class a {
    private static final int a(String str) {
        int iP0;
        char c10 = File.separatorChar;
        int iP02 = StringsKt.p0(str, c10, 0, false, 4, null);
        if (iP02 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iP0 = StringsKt.p0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iP03 = StringsKt.p0(str, c10, iP0 + 1, false, 4, null);
            return iP03 >= 0 ? iP03 + 1 : str.length();
        }
        if (iP02 > 0 && str.charAt(iP02 - 1) == ':') {
            return iP02 + 1;
        }
        if (iP02 == -1 && StringsKt.g0(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(File file) {
        Intrinsics.j(file, "<this>");
        String path = file.getPath();
        Intrinsics.i(path, "getPath(...)");
        return a(path) > 0;
    }
}
