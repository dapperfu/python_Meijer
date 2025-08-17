package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f138897a = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final x f138898b = new x();

    /* renamed from: c, reason: collision with root package name */
    public static final z f138899c = new z();

    public String c(TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
        Object objA = a(temporalField, locale);
        if (objA instanceof y) {
            return ((y) objA).a(j10, textStyle);
        }
        return null;
    }

    public String b(Chronology chronology, TemporalField temporalField, long j10, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return c(temporalField, j10, textStyle, locale);
        }
        return null;
    }

    public Iterator e(TemporalField temporalField, TextStyle textStyle, Locale locale) {
        List list;
        Object objA = a(temporalField, locale);
        if (!(objA instanceof y) || (list = (List) ((HashMap) ((y) objA).f138896b).get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    public Iterator d(Chronology chronology, TemporalField temporalField, TextStyle textStyle, Locale locale) {
        if (chronology == IsoChronology.INSTANCE || !(temporalField instanceof ChronoField)) {
            return e(temporalField, textStyle, locale);
        }
        return null;
    }

    public static Object a(TemporalField temporalField, Locale locale) {
        Object yVar;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(temporalField, locale);
        Object obj = ((ConcurrentHashMap) f138897a).get(simpleImmutableEntry);
        if (obj != null) {
            return obj;
        }
        HashMap map = new HashMap();
        if (temporalField == ChronoField.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i10 = 0; i10 < eras.length; i10++) {
                if (!eras[i10].isEmpty()) {
                    long j10 = i10;
                    map2.put(Long.valueOf(j10), eras[i10]);
                    Long lValueOf = Long.valueOf(j10);
                    String str = eras[i10];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(TextStyle.FULL, map2);
                map.put(TextStyle.SHORT, map2);
                map.put(TextStyle.NARROW, map3);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.MONTH_OF_YEAR) {
            int length = DateFormatSymbols.getInstance(locale).getMonths().length;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (long j11 = 1; j11 <= length; j11++) {
                String strB = j$.desugar.sun.nio.fs.g.b(j11, "LLLL", locale);
                linkedHashMap.put(Long.valueOf(j11), strB);
                linkedHashMap2.put(Long.valueOf(j11), strB.substring(0, Character.charCount(strB.codePointAt(0))));
                linkedHashMap3.put(Long.valueOf(j11), j$.desugar.sun.nio.fs.g.b(j11, "LLL", locale));
            }
            if (length > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap2);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap3);
                map.put(TextStyle.FULL, linkedHashMap);
                map.put(TextStyle.NARROW, linkedHashMap2);
                map.put(TextStyle.SHORT, linkedHashMap3);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.DAY_OF_WEEK) {
            int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            boolean z10 = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
            for (long j12 = 1; j12 <= length2; j12++) {
                String strA = j$.desugar.sun.nio.fs.g.a(j12, "cccc", locale);
                linkedHashMap4.put(Long.valueOf(j12), strA);
                Long lValueOf2 = Long.valueOf(j12);
                if (!z10) {
                    strSubstring = strA.substring(0, Character.charCount(strA.codePointAt(0)));
                } else {
                    strSubstring = new StringBuilder().appendCodePoint(strA.codePointBefore(strA.length())).toString();
                }
                linkedHashMap5.put(lValueOf2, strSubstring);
                linkedHashMap6.put(Long.valueOf(j12), j$.desugar.sun.nio.fs.g.a(j12, "ccc", locale));
            }
            if (length2 > 0) {
                map.put(TextStyle.FULL_STANDALONE, linkedHashMap4);
                map.put(TextStyle.NARROW_STANDALONE, linkedHashMap5);
                map.put(TextStyle.SHORT_STANDALONE, linkedHashMap6);
                map.put(TextStyle.FULL, linkedHashMap4);
                map.put(TextStyle.NARROW, linkedHashMap5);
                map.put(TextStyle.SHORT, linkedHashMap6);
            }
            yVar = new y(map);
        } else if (temporalField == ChronoField.AMPM_OF_DAY) {
            DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
            for (int i11 = 0; i11 < amPmStrings.length; i11++) {
                if (!amPmStrings[i11].isEmpty()) {
                    long j13 = i11;
                    map4.put(Long.valueOf(j13), amPmStrings[i11]);
                    Long lValueOf3 = Long.valueOf(j13);
                    String str2 = amPmStrings[i11];
                    map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                }
            }
            if (!map4.isEmpty()) {
                map.put(TextStyle.FULL, map4);
                map.put(TextStyle.SHORT, map4);
                map.put(TextStyle.NARROW, map5);
            }
            yVar = new y(map);
        } else {
            yVar = "";
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f138897a;
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, yVar);
        return concurrentHashMap.get(simpleImmutableEntry);
    }
}
