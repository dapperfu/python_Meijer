package fsimpl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes15.dex */
public class fB {

    /* renamed from: a, reason: collision with root package name */
    private static final TimeZone f133453a;

    /* renamed from: b, reason: collision with root package name */
    private static final DateFormat f133454b;

    /* renamed from: c, reason: collision with root package name */
    private static final Date f133455c;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        f133453a = timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f133454b = simpleDateFormat;
        f133455c = new Date(0L);
        simpleDateFormat.setTimeZone(timeZone);
    }

    public static String a(Date date) {
        return date == null ? "1970-01-01T00:00:00.000Z" : f133454b.format(date);
    }
}
