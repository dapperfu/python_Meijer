package f6;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lf6/j;", "", "<init>", "()V", "", "h", "()J", "Ljava/util/Date;", "date", "", "c", "(Ljava/util/Date;)Ljava/lang/String;", "e", "rfc2822Date", "Ljava/util/TimeZone;", "timeZone", "Ljava/util/Locale;", "locale", "i", "(Ljava/lang/String;Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Date;", "epoch", "g", "(JLjava/util/TimeZone;Ljava/util/Locale;)Ljava/lang/String;", "pattern", "a", "(Ljava/util/Date;Ljava/lang/String;Ljava/util/TimeZone;)Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f130811a = new j();

    private final String a(Date date, String pattern, TimeZone timeZone) {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale(locale.getLanguage(), locale.getCountry(), "POSIX"));
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat.format(date);
    }

    static /* synthetic */ String b(j jVar, Date date, String str, TimeZone timeZone, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            timeZone = null;
        }
        return jVar.a(date, str, timeZone);
    }

    @JvmStatic
    @JvmOverloads
    public static final String c(Date date) {
        Intrinsics.j(date, "date");
        String strB = b(f130811a, date, "yyyy-MM-dd'T'HH:mm:ssXX", null, 4, null);
        return strB == null ? "" : strB;
    }

    public static /* synthetic */ String d(Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = new Date();
        }
        return c(date);
    }

    @JvmStatic
    @JvmOverloads
    public static final String e(Date date) {
        Intrinsics.j(date, "date");
        String strA = f130811a.a(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", DesugarTimeZone.getTimeZone("GMT"));
        return strA == null ? "" : strA;
    }

    public static /* synthetic */ String f(Date date, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            date = new Date();
        }
        return e(date);
    }

    @JvmStatic
    public static final String g(long epoch, TimeZone timeZone, Locale locale) {
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(locale, "locale");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(Long.valueOf(epoch));
        Intrinsics.i(str, "rfc2822formatter.format(epoch)");
        return str;
    }

    @JvmStatic
    public static final Date i(String rfc2822Date, TimeZone timeZone, Locale locale) throws ParseException {
        Intrinsics.j(timeZone, "timeZone");
        Intrinsics.j(locale, "locale");
        if (rfc2822Date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", locale);
        simpleDateFormat.setTimeZone(timeZone);
        try {
            Date date = simpleDateFormat.parse(rfc2822Date);
            return date == null ? new Date() : date;
        } catch (Exception unused) {
            return null;
        }
    }

    private j() {
    }

    @JvmStatic
    public static final long h() {
        return System.currentTimeMillis() / 1000;
    }
}
