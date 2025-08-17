package es;

import j$.time.LocalTime;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vk.C17590a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"j$/time/LocalTime", "", "a", "(Lj$/time/LocalTime;)Ljava/lang/String;", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class L {
    public static final String a(LocalTime localTime) {
        if (localTime == null) {
            return "";
        }
        String str = localTime.format(localTime.getMinute() == 0 ? C17590a.f164803a.C() : C17590a.f164803a.q());
        Intrinsics.i(str, "format(...)");
        Locale US = Locale.US;
        Intrinsics.i(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
