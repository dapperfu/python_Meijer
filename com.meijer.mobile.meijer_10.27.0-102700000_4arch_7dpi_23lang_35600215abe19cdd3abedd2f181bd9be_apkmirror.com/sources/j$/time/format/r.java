package j$.time.format;

import j$.time.chrono.Chronology;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r implements e {

    /* renamed from: a, reason: collision with root package name */
    public final TemporalField f138872a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f138873b;

    /* renamed from: c, reason: collision with root package name */
    public final z f138874c;

    /* renamed from: d, reason: collision with root package name */
    public volatile j f138875d;

    public r(TemporalField temporalField, TextStyle textStyle, z zVar) {
        this.f138872a = temporalField;
        this.f138873b = textStyle;
        this.f138874c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        String strC;
        Long lA = wVar.a(this.f138872a);
        DateTimeFormatter dateTimeFormatter = wVar.f138893b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.f138892a.d(j$.time.temporal.n.f138957b);
        if (chronology == null || chronology == IsoChronology.INSTANCE) {
            strC = this.f138874c.c(this.f138872a, lA.longValue(), this.f138873b, dateTimeFormatter.f138815b);
        } else {
            strC = this.f138874c.b(chronology, this.f138872a, lA.longValue(), this.f138873b, dateTimeFormatter.f138815b);
        }
        if (strC != null) {
            sb2.append(strC);
            return true;
        }
        if (this.f138875d == null) {
            this.f138875d = new j(this.f138872a, 1, 19, SignStyle.NORMAL);
        }
        return this.f138875d.C(wVar, sb2);
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        Iterator itE;
        z zVar = this.f138874c;
        TemporalField temporalField = this.f138872a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z10 = vVar.f138889c;
            DateTimeFormatter dateTimeFormatter = vVar.f138887a;
            TextStyle textStyle = z10 ? this.f138873b : null;
            Chronology chronologyD = vVar.d();
            if (chronologyD == null || chronologyD == IsoChronology.INSTANCE) {
                itE = zVar.e(temporalField, textStyle, dateTimeFormatter.f138815b);
            } else {
                itE = zVar.d(chronologyD, temporalField, textStyle, dateTimeFormatter.f138815b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.h(str, 0, charSequence, i10, str.length())) {
                        return vVar.g(this.f138872a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (temporalField == ChronoField.ERA && !vVar.f138889c) {
                    Iterator it2 = chronologyD.G().iterator();
                    while (it2.hasNext()) {
                        String string = ((j$.time.chrono.j) it2.next()).toString();
                        if (vVar.h(string, 0, charSequence, i10, string.length())) {
                            return vVar.g(this.f138872a, r7.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (vVar.f138889c) {
                    return ~i10;
                }
            }
            if (this.f138875d == null) {
                this.f138875d = new j(this.f138872a, 1, 19, SignStyle.NORMAL);
            }
            return this.f138875d.H(vVar, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f138872a;
        TextStyle textStyle2 = this.f138873b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
