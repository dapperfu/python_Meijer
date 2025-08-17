package B2;

import android.os.Build;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "toFile", "", "a", "(Ljava/io/File;Ljava/io/File;)Z", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2947l {
    public static final boolean a(File file, File toFile) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? C2936a.f1763a.a(file, toFile) : file.renameTo(toFile);
    }
}
