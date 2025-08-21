package yk;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "a", "(Ljava/lang/String;)Z", "isDigitsOnly", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yk.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C18327c {
    public static final boolean a(String str) {
        if (str == null || StringsKt.s0(str)) {
            str = null;
        }
        return str != null && new Regex("^\\d+$").j(str);
    }
}
