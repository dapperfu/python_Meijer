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
    public static volatile Map.Entry f138878c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile Map.Entry f138879d;

    /* renamed from: a, reason: collision with root package name */
    public final TemporalQuery f138880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f138881b;

    public n a(v vVar) {
        Set<String> set = j$.time.zone.i.f139009d;
        int size = set.size();
        Map.Entry simpleImmutableEntry = vVar.f138888b ? f138878c : f138879d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = vVar.f138888b ? f138878c : f138879d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        Integer numValueOf = Integer.valueOf(size);
                        n nVar = vVar.f138888b ? new n("", null, null) : new m("", null, null);
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, nVar);
                        if (vVar.f138888b) {
                            f138878c = simpleImmutableEntry;
                        } else {
                            f138879d = simpleImmutableEntry;
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
        this.f138880a = temporalQuery;
        this.f138881b = str;
    }

    @Override // j$.time.format.e
    public boolean C(w wVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) wVar.b(this.f138880a);
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
            return b(vVar, charSequence, i10, i10, k.f138851e);
        }
        int i12 = i10 + 2;
        if (length >= i12) {
            char cCharAt2 = charSequence.charAt(i10 + 1);
            if (vVar.a(cCharAt, 'U') && vVar.a(cCharAt2, 'T')) {
                int i13 = i10 + 3;
                if (length >= i13 && vVar.a(charSequence.charAt(i12), 'C')) {
                    return b(vVar, charSequence, i10, i13, k.f138852f);
                }
                return b(vVar, charSequence, i10, i12, k.f138852f);
            }
            if (vVar.a(cCharAt, 'G') && length >= (i11 = i10 + 3) && vVar.a(cCharAt2, 'M') && vVar.a(charSequence.charAt(i12), 'T')) {
                int i14 = i10 + 4;
                if (length >= i14 && vVar.a(charSequence.charAt(i11), '0')) {
                    vVar.f(ZoneId.of("GMT0"));
                    return i14;
                }
                return b(vVar, charSequence, i10, i11, k.f138852f);
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
            v vVar2 = new v(vVar.f138887a);
            vVar2.f138888b = vVar.f138888b;
            vVar2.f138889c = vVar.f138889c;
            int iH = kVar.H(vVar2, charSequence, i11);
            try {
                if (iH < 0) {
                    if (kVar == k.f138851e) {
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
        return this.f138881b;
    }
}
