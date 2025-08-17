package Fk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFk/a;", "", "<init>", "()V", "", "unformattedPhoneNumber", "a", "(Ljava/lang/String;)Ljava/lang/String;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10894a = new a();

    public final String a(String unformattedPhoneNumber) {
        if (unformattedPhoneNumber == null) {
            uw.a.INSTANCE.s("Phone number was null", new Object[0]);
            return "";
        }
        String strQ = StringsKt.Q(StringsKt.Q(StringsKt.Q(StringsKt.Q(unformattedPhoneNumber, " ", "", false, 4, null), "-", "", false, 4, null), "(", "", false, 4, null), ")", "", false, 4, null);
        try {
            String strSubstring = strQ.substring(0, 3);
            Intrinsics.i(strSubstring, "substring(...)");
            String strSubstring2 = strQ.substring(3, 6);
            Intrinsics.i(strSubstring2, "substring(...)");
            String strSubstring3 = strQ.substring(6, 10);
            Intrinsics.i(strSubstring3, "substring(...)");
            return '(' + strSubstring + ") " + strSubstring2 + '-' + strSubstring3;
        } catch (IndexOutOfBoundsException e10) {
            uw.a.INSTANCE.f(e10, "Phone number doesn't have enough digits: %s", strQ);
            return strQ;
        }
    }

    private a() {
    }
}
