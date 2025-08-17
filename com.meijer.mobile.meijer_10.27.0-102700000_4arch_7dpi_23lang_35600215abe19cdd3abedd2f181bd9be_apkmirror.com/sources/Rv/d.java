package Rv;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okhttp3.c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001b\u0010\u0015\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a%\u0010\u0019\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokhttp3/c;", "", "i", "(Lokhttp3/c;)Ljava/lang/String;", "", "", "b", "(J)I", "Lokhttp3/c$b;", "d", "(Lokhttp3/c$b;)Lokhttp3/c;", "c", "Lokhttp3/c$a;", "a", "(Lokhttp3/c$a;)Lokhttp3/c;", "e", "(Lokhttp3/c$a;)Lokhttp3/c$a;", "f", "g", "Lokhttp3/Headers;", "headers", "h", "(Lokhttp3/c$b;Lokhttp3/Headers;)Lokhttp3/c;", "characters", "startIndex", "j", "(Ljava/lang/String;Ljava/lang/String;I)I", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {
    public static final okhttp3.c a(c.a aVar) {
        Intrinsics.j(aVar, "<this>");
        return new okhttp3.c(aVar.getNoCache(), aVar.getNoStore(), aVar.getMaxAgeSeconds(), -1, false, false, false, aVar.getMaxStaleSeconds(), aVar.getMinFreshSeconds(), aVar.getOnlyIfCached(), aVar.getNoTransform(), aVar.getImmutable(), null);
    }

    public static final okhttp3.c c(c.Companion companion) {
        Intrinsics.j(companion, "<this>");
        c.a aVarM = new c.a().m();
        Duration.Companion companion2 = Duration.INSTANCE;
        return aVarM.j(DurationKt.s(a.e.API_PRIORITY_OTHER, DurationUnit.f147509e)).a();
    }

    public static final okhttp3.c d(c.Companion companion) {
        Intrinsics.j(companion, "<this>");
        return new c.a().k().a();
    }

    public static final c.a e(c.a aVar) {
        Intrinsics.j(aVar, "<this>");
        aVar.n(true);
        return aVar;
    }

    public static final c.a f(c.a aVar) {
        Intrinsics.j(aVar, "<this>");
        aVar.o(true);
        return aVar;
    }

    public static final c.a g(c.a aVar) {
        Intrinsics.j(aVar, "<this>");
        aVar.p(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okhttp3.c h(okhttp3.c.Companion r30, okhttp3.Headers r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rv.d.h(okhttp3.c$b, okhttp3.Headers):okhttp3.c");
    }

    public static final String i(okhttp3.c cVar) {
        Intrinsics.j(cVar, "<this>");
        String headerValue = cVar.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb2 = new StringBuilder();
        if (cVar.getNoCache()) {
            sb2.append("no-cache, ");
        }
        if (cVar.getNoStore()) {
            sb2.append("no-store, ");
        }
        if (cVar.getMaxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(cVar.getMaxAgeSeconds());
            sb2.append(", ");
        }
        if (cVar.getSMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(cVar.getSMaxAgeSeconds());
            sb2.append(", ");
        }
        if (cVar.getIsPrivate()) {
            sb2.append("private, ");
        }
        if (cVar.getIsPublic()) {
            sb2.append("public, ");
        }
        if (cVar.getMustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (cVar.getMaxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(cVar.getMaxStaleSeconds());
            sb2.append(", ");
        }
        if (cVar.getMinFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(cVar.getMinFreshSeconds());
            sb2.append(", ");
        }
        if (cVar.getOnlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (cVar.getNoTransform()) {
            sb2.append("no-transform, ");
        }
        if (cVar.getImmutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        Intrinsics.i(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        cVar.n(string);
        return string;
    }

    public static final int b(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        return (int) j10;
    }

    private static final int j(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (StringsKt.b0(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
