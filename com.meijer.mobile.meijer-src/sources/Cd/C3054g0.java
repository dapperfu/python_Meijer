package Cd;

import com.medallia.digital.mobilesdk.l8;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: Cd.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3054g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f4248a;

    /* renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f4249b;

    /* renamed from: c, reason: collision with root package name */
    private static final StringBuilder f4250c;

    static {
        Locale locale = Locale.ROOT;
        f4248a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f4249b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f4250c = new StringBuilder(33);
    }

    public static String a(long j10) {
        return j10 >= 0 ? f4248a.format(new Date(j10)) : Long.toString(j10);
    }

    public static String b(long j10) {
        String string;
        StringBuilder sb2 = f4250c;
        synchronized (sb2) {
            sb2.setLength(0);
            c(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder c(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j10 >= l8.b.f93366d) {
            sb2.append(j10 / l8.b.f93366d);
            sb2.append("d");
            j10 %= l8.b.f93366d;
        }
        if (true == z10) {
            j10 = 25975808;
        }
        if (j10 >= l8.b.f93365c) {
            sb2.append(j10 / l8.b.f93365c);
            sb2.append("h");
            j10 %= l8.b.f93365c;
        }
        if (j10 >= l8.b.f93364b) {
            sb2.append(j10 / l8.b.f93364b);
            sb2.append("m");
            j10 %= l8.b.f93364b;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
        return sb2;
    }
}
