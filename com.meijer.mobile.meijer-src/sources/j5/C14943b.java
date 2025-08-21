package j5;

import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import m5.C15673l;
import r5.C16846j;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj5/b;", "Lj5/d;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "data", "", "b", "(Landroid/net/Uri;)Z", "Lm5/l;", "options", "c", "(Landroid/net/Uri;Lm5/l;)Ljava/io/File;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14943b implements InterfaceC14945d<Uri, File> {
    private final boolean b(Uri data) {
        String scheme;
        if (!C16846j.r(data) && ((scheme = data.getScheme()) == null || Intrinsics.e(scheme, "file"))) {
            String path = data.getPath();
            if (path == null) {
                path = "";
            }
            if (StringsKt.h1(path, '/', false, 2, null) && C16846j.i(data) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // j5.InterfaceC14945d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public File a(Uri data, C15673l options) {
        if (!b(data)) {
            return null;
        }
        if (Intrinsics.e(data.getScheme(), "file")) {
            String path = data.getPath();
            if (path == null) {
                return null;
            }
            return new File(path);
        }
        return new File(data.toString());
    }
}
