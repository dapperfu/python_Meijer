package aw;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "", "index", "a", "(Ljava/lang/String;I)I", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {
    public static final int a(String str, int i10) {
        Intrinsics.j(str, "<this>");
        char cCharAt = str.charAt(i10);
        return (cCharAt << 7) + str.charAt(i10 + 1);
    }
}
