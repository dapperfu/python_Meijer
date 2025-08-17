package Ak;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "", "d", "(D)Z", "", "e", "(D)Ljava/lang/String;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    public static final boolean d(double d10) {
        return Double.valueOf(d10 % 1).equals(Double.valueOf(0.0d));
    }

    public static final String b(List<?> list) {
        Intrinsics.j(list, "<this>");
        return CollectionsKt.B0(list, "|", null, null, 0, null, new Function1() { // from class: Ak.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.c(obj);
            }
        }, 30, null);
    }

    public static final String f(String str) {
        Intrinsics.j(str, "<this>");
        if (StringsKt.W(str, "https://", false, 2, null)) {
            return str;
        }
        return "https:" + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(Object obj) {
        return String.valueOf(obj);
    }

    public static final String e(double d10) {
        if (d(d10)) {
            return String.valueOf((int) d10);
        }
        return String.valueOf(d10);
    }
}
