package com.radiusnetworks.flybuy.sdk.data.room.domain;

import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.sdk.util.MonthDayDateFormatter;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"toApiString", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/PickupWindow;", "toFormattedString", "locale", "Ljava/util/Locale;", "toPickupWindow", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PickupWindowKt {
    public static final String toApiString(PickupWindow pickupWindow) {
        if (pickupWindow == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(pickupWindow.getStart());
        sb2.append('/');
        sb2.append(pickupWindow.getEnd());
        return sb2.toString();
    }

    public static final String toFormattedString(PickupWindow pickupWindow, Locale locale) {
        Intrinsics.j(locale, "locale");
        if (pickupWindow == null) {
            return "";
        }
        DateTimeFormatter dateTimeFormatterOfLocalizedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        MonthDayDateFormatter monthDayDateFormatter = new MonthDayDateFormatter(locale);
        StringBuilder sb2 = new StringBuilder();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(pickupWindow.getStart(), ZoneId.systemDefault());
        LocalDateTime localDateTimeOfInstant2 = LocalDateTime.ofInstant(pickupWindow.getEnd(), ZoneId.systemDefault());
        if (!localDateTimeOfInstant.l().isEqual(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).l()) || !localDateTimeOfInstant.l().isEqual(localDateTimeOfInstant2.l())) {
            Intrinsics.g(localDateTimeOfInstant);
            sb2.append(monthDayDateFormatter.format(localDateTimeOfInstant));
            sb2.append(", ");
        }
        sb2.append(dateTimeFormatterOfLocalizedTime.format(localDateTimeOfInstant));
        if (!localDateTimeOfInstant.isEqual(localDateTimeOfInstant2)) {
            sb2.append(" - ");
            if (!localDateTimeOfInstant.l().isEqual(localDateTimeOfInstant2.l())) {
                Intrinsics.g(localDateTimeOfInstant2);
                sb2.append(monthDayDateFormatter.format(localDateTimeOfInstant2));
                sb2.append(", ");
            }
            sb2.append(dateTimeFormatterOfLocalizedTime.format(localDateTimeOfInstant2));
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public static final PickupWindow toPickupWindow(String str) {
        Intrinsics.j(str, "<this>");
        try {
            List listB1 = StringsKt.b1(str, new String[]{q2.f93563c}, false, 0, 6, null);
            if (listB1.size() != 2) {
                return null;
            }
            Instant instant = Instant.parse((CharSequence) listB1.get(0));
            Intrinsics.i(instant, "parse(...)");
            Instant instant2 = Instant.parse((CharSequence) listB1.get(1));
            Intrinsics.i(instant2, "parse(...)");
            return new PickupWindow(instant, instant2);
        } catch (Exception unused) {
            return null;
        }
    }
}
