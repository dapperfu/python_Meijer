package yk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "", "", "permissions", "", "a", "(Landroid/content/Context;[Ljava/lang/String;)Z", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yk.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18326b {
    public static final boolean a(Context context, String... permissions) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(permissions, "permissions");
        for (String str : permissions) {
            if (Z1.b.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
