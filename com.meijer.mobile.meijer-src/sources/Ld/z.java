package Ld;

import Cd.C3054g0;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import g2.C14321a;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final DecimalFormat f18196a;

    /* renamed from: b, reason: collision with root package name */
    private static final DecimalFormat f18197b;

    /* renamed from: c, reason: collision with root package name */
    private static final StringBuilder f18198c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18199d = 0;

    static {
        Locale locale = Locale.ROOT;
        f18196a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f18197b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f18198c = new StringBuilder();
    }

    public static StringBuilder a(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (C14321a.i(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = f18196a;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(f18197b.format(location.getAccuracy()));
            sb2.append("m");
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = f18197b;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (C14321a.h(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format(C14321a.e(location)));
            }
            sb2.append("m");
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = f18197b;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (C14321a.g(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format(C14321a.d(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = f18197b;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (C14321a.f(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format(C14321a.b(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(C3054g0.a(C14321a.c(location) + jCurrentTimeMillis));
        sb2.append('}');
        return sb2;
    }
}
