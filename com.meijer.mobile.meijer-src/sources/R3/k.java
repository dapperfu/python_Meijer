package R3;

import a3.z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
final class k {
    public static String a(a3.t tVar) {
        String str = tVar.f44767o;
        return z.q(str) ? "video/mp4" : z.n(str) ? "audio/mp4" : z.o(str) ? Objects.equals(str, "image/heic") ? "image/heif" : Objects.equals(str, "image/avif") ? "image/avif" : "application/mp4" : "application/mp4";
    }

    public static String b(List<w> list) {
        Iterator<w> it = list.iterator();
        boolean z10 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = it.next().f31852a.f31823g.f44767o;
            if (z.q(str2)) {
                return "video/mp4";
            }
            if (z.n(str2)) {
                z10 = true;
            } else if (z.o(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }
}
