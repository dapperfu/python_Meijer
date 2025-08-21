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
    public final TemporalField f139462a;

    /* renamed from: b, reason: collision with root package name */
    public final TextStyle f139463b;

    /* renamed from: c, reason: collision with root package name */
    public final z f139464c;

    /* renamed from: d, reason: collision with root package name */
    public volatile j f139465d;

    public r(TemporalField temporalField, TextStyle textStyle, z zVar) {
        this.f139462a = temporalField;
        this.f139463b = textStyle;
        this.f139464c = zVar;
    }

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        String strC;
        Long lA = wVar.a(this.f139462a);
        DateTimeFormatter dateTimeFormatter = wVar.f139483b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.f139482a.d(j$.time.temporal.n.f139547b);
        if (chronology == null || chronology == IsoChronology.INSTANCE) {
            strC = this.f139464c.c(this.f139462a, lA.longValue(), this.f139463b, dateTimeFormatter.f139405b);
        } else {
            strC = this.f139464c.b(chronology, this.f139462a, lA.longValue(), this.f139463b, dateTimeFormatter.f139405b);
        }
        if (strC != null) {
            sb2.append(strC);
            return true;
        }
        if (this.f139465d == null) {
            this.f139465d = new j(this.f139462a, 1, 19, SignStyle.NORMAL);
        }
        return this.f139465d.C(wVar, sb2);
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        Iterator itE;
        z zVar = this.f139464c;
        TemporalField temporalField = this.f139462a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z10 = vVar.f139479c;
            DateTimeFormatter dateTimeFormatter = vVar.f139477a;
            TextStyle textStyle = z10 ? this.f139463b : null;
            Chronology chronologyD = vVar.d();
            if (chronologyD == null || chronologyD == IsoChronology.INSTANCE) {
                itE = zVar.e(temporalField, textStyle, dateTimeFormatter.f139405b);
            } else {
                itE = zVar.d(chronologyD, temporalField, textStyle, dateTimeFormatter.f139405b);
            }
            Iterator it = itE;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.h(str, 0, charSequence, i10, str.length())) {
                        return vVar.g(this.f139462a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (temporalField == ChronoField.ERA && !vVar.f139479c) {
                    Iterator it2 = chronologyD.G().iterator();
                    while (it2.hasNext()) {
                        String string = ((j$.time.chrono.j) it2.next()).toString();
                        if (vVar.h(string, 0, charSequence, i10, string.length())) {
                            return vVar.g(this.f139462a, r7.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (vVar.f139479c) {
                    return ~i10;
                }
            }
            if (this.f139465d == null) {
                this.f139465d = new j(this.f139462a, 1, 19, SignStyle.NORMAL);
            }
            return this.f139465d.H(vVar, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TemporalField temporalField = this.f139462a;
        TextStyle textStyle2 = this.f139463b;
        if (textStyle2 == textStyle) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + textStyle2 + ")";
    }
}
