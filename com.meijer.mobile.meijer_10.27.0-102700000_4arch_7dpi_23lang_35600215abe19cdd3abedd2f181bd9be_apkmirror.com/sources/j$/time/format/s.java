package j$.time.format;

import j$.time.DayOfWeek;
import j$.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class s extends j {

    /* renamed from: g, reason: collision with root package name */
    public final char f138876g;

    /* renamed from: h, reason: collision with root package name */
    public final int f138877h;

    @Override // j$.time.format.j, j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        return f(vVar.f138887a.f138815b).H(vVar, charSequence, i10);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        return f(wVar.f138893b.f138815b).C(wVar, sb2);
    }

    public s(char c10, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, SignStyle.NOT_NEGATIVE, i13);
        this.f138876g = c10;
        this.f138877h = i10;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f138849e == -1) {
            return this;
        }
        return new s(this.f138876g, this.f138877h, this.f138846b, this.f138847c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i10) {
        return new s(this.f138876g, this.f138877h, this.f138846b, this.f138847c, this.f138849e + i10);
    }

    public final j f(Locale locale) {
        j$.time.temporal.q qVar;
        ConcurrentMap concurrentMap = WeekFields.f138929h;
        Objects.requireNonNull(locale, "locale");
        WeekFields weekFieldsA = WeekFields.a(DayOfWeek.f138685a[((((int) ((r7.getFirstDayOfWeek() - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c10 = this.f138876g;
        if (c10 == 'W') {
            qVar = weekFieldsA.f138934d;
        } else {
            if (c10 == 'Y') {
                j$.time.temporal.q qVar2 = weekFieldsA.f138937g;
                int i10 = this.f138877h;
                if (i10 == 2) {
                    return new p(qVar2, 2, 2, p.f138869h, this.f138849e);
                }
                return new j(qVar2, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.f138849e);
            }
            if (c10 == 'c' || c10 == 'e') {
                qVar = weekFieldsA.f138933c;
            } else {
                if (c10 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                qVar = weekFieldsA.f138936f;
            }
        }
        return new j(qVar, this.f138846b, this.f138847c, SignStyle.NOT_NEGATIVE, this.f138849e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f138877h;
        char c10 = this.f138876g;
        if (c10 != 'Y') {
            if (c10 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c10 == 'c' || c10 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c10 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(i10);
        } else if (i10 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i10 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i10);
            sb2.append(",19,");
            sb2.append(i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
