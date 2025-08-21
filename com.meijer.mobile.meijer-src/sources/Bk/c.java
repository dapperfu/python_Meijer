package Bk;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LBk/c;", "", "", "versionString", "a", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class c {
    public static String a(String versionString) {
        Intrinsics.j(versionString, "versionString");
        return versionString;
    }

    public static String d(String str) {
        return "SemanticVersion(versionString=" + str + ')';
    }

    public static final boolean b(String str, String str2) {
        return Intrinsics.e(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }
}
