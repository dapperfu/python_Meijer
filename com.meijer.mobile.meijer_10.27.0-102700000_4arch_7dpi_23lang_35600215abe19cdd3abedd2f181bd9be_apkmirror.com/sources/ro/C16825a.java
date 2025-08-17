package ro;

import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ro.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16825a {
    public static final String a(String str) {
        ZonedDateTime zonedDateTimeN;
        Intrinsics.j(str, "<this>");
        LocalDateTime localDateTime = (LocalDateTime) vk.d.b(str, C17590a.f164803a.s(), new j());
        String str2 = (localDateTime == null || (zonedDateTimeN = localDateTime.N(ZoneId.systemDefault())) == null) ? null : zonedDateTimeN.format(C17590a.DATE_SLASHES_SHORT);
        return str2 == null ? "" : str2;
    }
}
