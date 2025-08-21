package Vp;

import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest;
import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequestEventData;
import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequestHeader;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LVp/f;", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "a", "(LVp/f;)Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "j$/time/OffsetDateTime", "", "b", "(Lj$/time/OffsetDateTime;)Ljava/lang/String;", "c", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {
    public static final StartTripRequest a(StartTripRequest startTripRequest) {
        Intrinsics.j(startTripRequest, "<this>");
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        Intrinsics.i(offsetDateTimeNow, "now(...)");
        return new StartTripRequest("START_TRANSACTION", new StartTripRequestHeader(b(offsetDateTimeNow), c(offsetDateTimeNow), startTripRequest.getStore().getId(), b(offsetDateTimeNow), c(offsetDateTimeNow), startTripRequest.getDeviceId(), "Android", startTripRequest.getMmaAppVersion(), startTripRequest.getOsVersion()), new StartTripRequestEventData("PDF_417", startTripRequest.getMPerksBarcode(), false, false, 12, null));
    }

    public static final String b(OffsetDateTime offsetDateTime) {
        Intrinsics.j(offsetDateTime, "<this>");
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        Intrinsics.i(dateTimeFormatterOfPattern, "ofPattern(...)");
        String str = offsetDateTime.format(dateTimeFormatterOfPattern);
        Intrinsics.i(str, "format(...)");
        return str;
    }

    public static final String c(OffsetDateTime offsetDateTime) {
        Intrinsics.j(offsetDateTime, "<this>");
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        Intrinsics.i(dateTimeFormatterOfPattern, "ofPattern(...)");
        String str = offsetDateTime.format(dateTimeFormatterOfPattern);
        Intrinsics.i(str, "format(...)");
        return str;
    }
}
