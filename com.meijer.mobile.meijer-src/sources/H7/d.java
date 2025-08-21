package H7;

import G7.RetryInfo;
import Y7.EndPointInfo;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/HttpUrl$a;", "LY7/a;", "endPointInfo", "", "version", "", "revision", "a", "(Lokhttp3/HttpUrl$a;LY7/a;Ljava/lang/String;J)Lokhttp3/HttpUrl$a;", "LG7/a;", "retryInfo", "c", "(Lokhttp3/HttpUrl$a;LG7/a;)Lokhttp3/HttpUrl$a;", "", "body", "LH7/a;", "compression", "priority", "Lkotlin/Function0;", "timeStampGenerator", "b", "(Lokhttp3/HttpUrl$a;[BLH7/a;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lokhttp3/HttpUrl$a;", "", "serverId", "d", "(Lokhttp3/HttpUrl$a;Ljava/lang/Integer;)Lokhttp3/HttpUrl$a;", "Lokhttp3/HttpUrl;", "e", "(Lokhttp3/HttpUrl$a;)Lokhttp3/HttpUrl;", "f", "([B)Ljava/lang/String;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final HttpUrl.a a(HttpUrl.a aVar, EndPointInfo endPointInfo, String version, long j10) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(endPointInfo, "endPointInfo");
        Intrinsics.j(version, "version");
        aVar.f("ty", "mb");
        aVar.f("pv", "4");
        aVar.f("tt", "android");
        aVar.f("av", version);
        aVar.f("ai", endPointInfo.getApplicationId());
        aVar.f("cr", String.valueOf(j10));
        return aVar;
    }

    public static final HttpUrl.a b(HttpUrl.a aVar, byte[] body, a compression, String str, Function0<Long> timeStampGenerator) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(body, "body");
        Intrinsics.j(compression, "compression");
        Intrinsics.j(timeStampGenerator, "timeStampGenerator");
        aVar.f("cy", "event");
        if (str != null) {
            aVar.f("pr", str);
        }
        aVar.f("bc", f(body));
        if (compression != a.f13425b) {
            aVar.f("co", compression.getDescription());
        }
        aVar.f("st", String.valueOf(timeStampGenerator.invoke().longValue()));
        return aVar;
    }

    public static final HttpUrl.a c(HttpUrl.a aVar, RetryInfo retryInfo) {
        Intrinsics.j(aVar, "<this>");
        if (retryInfo == null) {
            return aVar;
        }
        aVar.f("rc", String.valueOf(retryInfo.getCount()));
        if (retryInfo.getReason() != null) {
            aVar.f("rr", retryInfo.getReason());
        }
        return aVar;
    }

    public static final HttpUrl.a d(HttpUrl.a aVar, Integer num) {
        Intrinsics.j(aVar, "<this>");
        if (num != null) {
            aVar.f("si", String.valueOf(num.intValue()));
        }
        return aVar;
    }

    public static final HttpUrl e(HttpUrl.a aVar) {
        byte[] bArrE;
        Intrinsics.j(aVar, "<this>");
        HttpUrl httpUrlG = aVar.g();
        String strE = httpUrlG.e();
        return httpUrlG.k().f("qc", (strE == null || (bArrE = StringsKt.E(strE)) == null) ? null : f(bArrE)).f("end", "1").g();
    }

    public static final String f(byte[] bArr) {
        Intrinsics.j(bArr, "<this>");
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return String.valueOf(crc32.getValue());
    }
}
