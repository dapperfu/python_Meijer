package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class i implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentMap f138842b = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a, reason: collision with root package name */
    public final FormatStyle f138843a;

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        a(wVar.f138893b.f138815b, Chronology.q(wVar.f138892a)).b().C(wVar, sb2);
        return true;
    }

    public i(FormatStyle formatStyle) {
        this.f138843a = formatStyle;
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        return a(vVar.f138887a.f138815b, vVar.d()).b().H(vVar, charSequence, i10);
    }

    public final DateTimeFormatter a(Locale locale, Chronology chronology) {
        String id2 = chronology.getId();
        String string = locale.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id2);
        sb2.append("|");
        sb2.append(string);
        sb2.append("|null");
        FormatStyle formatStyle = this.f138843a;
        sb2.append(formatStyle);
        String string2 = sb2.toString();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f138842b;
        DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) concurrentHashMap.get(string2);
        if (dateTimeFormatter != null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().appendPattern(DateTimeFormatterBuilder.getLocalizedDateTimePattern(null, formatStyle, chronology, locale)).toFormatter(locale);
        DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) concurrentHashMap.putIfAbsent(string2, formatter);
        return dateTimeFormatter2 != null ? dateTimeFormatter2 : formatter;
    }

    public final String toString() {
        return "Localized(" + ((Object) "") + "," + this.f138843a + ")";
    }
}
