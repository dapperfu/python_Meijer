package fsimpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes14.dex */
public class fB {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f132203a;

    /* renamed from: b, reason: collision with root package name */
    private static final DateFormat f132204b;

    /* renamed from: c, reason: collision with root package name */
    private static final Date f132205c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f132203a = timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f132204b = simpleDateFormat;
        f132205c = new Date(0L);
        simpleDateFormat.setTimeZone(timeZone);
    }

    public static String a(Date date) {
        return date == null ? "1970-01-01T00:00:00.000Z" : f132204b.format(date);
    }
}
