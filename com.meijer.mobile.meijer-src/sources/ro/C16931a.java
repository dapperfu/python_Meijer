package ro;

import j$.time.ZonedDateTime;
import kotlin.Metadata;
import wk.C17898a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"j$/time/ZonedDateTime", "", "a", "(Lj$/time/ZonedDateTime;)Ljava/lang/String;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ro.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16931a {
    public static final String a(ZonedDateTime zonedDateTime) {
        String str = zonedDateTime != null ? zonedDateTime.format(C17898a.DATE_SLASHES_SHORT) : null;
        return str == null ? "" : str;
    }
}
