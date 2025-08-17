package Q6;

import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LQ6/d;", "", "<init>", "()V", "Ljava/util/Date;", "date", "", "c", "(Ljava/util/Date;)Ljava/lang/String;", "a", "(Ljava/lang/String;)Ljava/util/Date;", "Q6/d$a", "LQ6/d$a;", "iso8601Holder", "Ljava/text/DateFormat;", "b", "()Ljava/text/DateFormat;", "iso8601Format", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f29852b = new d();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final a iso8601Holder = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Q6/d$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "()Ljava/text/DateFormat;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class a extends ThreadLocal<DateFormat> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }

        a() {
        }
    }

    @JvmStatic
    public static final Date a(String date) throws ParseException {
        try {
            Date date2 = f29852b.b().parse(date);
            if (date2 != null) {
                return date2;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e10) {
            throw new IllegalArgumentException("Failed to parse timestamp", e10);
        }
    }

    private final DateFormat b() {
        DateFormat dateFormat = iso8601Holder.get();
        if (dateFormat != null) {
            return dateFormat;
        }
        throw new IllegalArgumentException("Unable to find valid dateformatter");
    }

    @JvmStatic
    public static final String c(Date date) {
        String str = f29852b.b().format(date);
        Intrinsics.f(str, "iso8601Format.format(date)");
        return str;
    }

    private d() {
    }
}
