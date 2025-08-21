package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class t implements e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile Map.Entry f139468c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f139469d;

    /* renamed from: a, reason: collision with root package name */
    public final TemporalQuery f139470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139471b;

    public n a(v vVar) {
        Set<String> set = j$.time.zone.i.f139599d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = vVar.f139478b ? f139468c : f139469d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.f139478b ? f139468c : f139469d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        n nVar = vVar.f139478b ? new n("", null, null) : new m("", null, null);
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, nVar);
                        if (vVar.f139478b) {
                            f139468c = simpleImmutableEntry;
                        } else {
                            f139469d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    public t(TemporalQuery temporalQuery, String str) {
        this.f139470a = temporalQuery;
        this.f139471b = str;
    }

    @Override // j$.time.format.e
    public boolean C(w wVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) wVar.b(this.f139470a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(vVar, charSequence, i10, i10, k.f139441e);
        }
        int i12 = i10 + 2;
        if (length >= i12) {
            char cCharAt2 = charSequence.charAt(i10 + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i13 = i10 + 3;
                if (length >= i13 && vVar.a(charSequence.charAt(i12), 'C')) {
                    return b(vVar, charSequence, i10, i13, k.f139442f);
                }
                return b(vVar, charSequence, i10, i12, k.f139442f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i11 = i10 + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i12), 'T')) {
                int i14 = i10 + 4;
                if (length >= i14 && vVar.a(charSequence.charAt(i11), '0')) {
                    vVar.f(ZoneId.of("GMT0"));
                    return i14;
                }
                return b(vVar, charSequence, i10, i11, k.f139442f);
            }
        }
        n nVarA = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i10);
        String strC = nVarA.c(charSequence, parsePosition);
        if (strC == null) {
            if (!vVar.a(cCharAt, 'Z')) {
                return ~i10;
            }
            vVar.f(ZoneOffset.UTC);
            return i10 + 1;
        }
        vVar.f(ZoneId.of(strC));
        return parsePosition.getIndex();
    }

    public static int b(v vVar, CharSequence charSequence, int i10, int i11, k kVar) {
        String upperCase = charSequence.subSequence(i10, i11).toString().toUpperCase();
        if (i11 >= charSequence.length()) {
            vVar.f(ZoneId.of(upperCase));
            return i11;
        }
        if (charSequence.charAt(i11) != '0' && !vVar.a(charSequence.charAt(i11), 'Z')) {
            v vVar2 = new v(vVar.f139477a);
            vVar2.f139478b = vVar.f139478b;
            vVar2.f139479c = vVar.f139479c;
            int iH = kVar.H(vVar2, charSequence, i11);
            try {
                if (iH < 0) {
                    if (kVar == k.f139441e) {
                        return ~i10;
                    }
                    vVar.f(ZoneId.of(upperCase));
                    return i11;
                }
                vVar.f(ZoneId.Q(upperCase, ZoneOffset.ofTotalSeconds((int) vVar2.e(ChronoField.OFFSET_SECONDS).longValue())));
                return iH;
            } catch (DateTimeException unused) {
                return ~i10;
            }
        }
        vVar.f(ZoneId.of(upperCase));
        return i11;
    }

    public final String toString() {
        return this.f139471b;
    }
}
