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
    public final char f139466g;

    /* renamed from: h, reason: collision with root package name */
    public final int f139467h;

    @Override // j$.time.format.j, j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        return f(vVar.f139477a.f139405b).H(vVar, charSequence, i10);
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        return f(wVar.f139483b.f139405b).C(wVar, sb2);
    }

    public s(char c10, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, SignStyle.NOT_NEGATIVE, i13);
        this.f139466g = c10;
        this.f139467h = i10;
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f139439e == -1) {
            return this;
        }
        return new s(this.f139466g, this.f139467h, this.f139436b, this.f139437c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i10) {
        return new s(this.f139466g, this.f139467h, this.f139436b, this.f139437c, this.f139439e + i10);
    }

    public final j f(Locale locale) {
        j$.time.temporal.q qVar;
        ConcurrentMap concurrentMap = WeekFields.f139519h;
        Objects.requireNonNull(locale, "locale");
        WeekFields weekFieldsA = WeekFields.a(DayOfWeek.f139274a[((((int) ((r7.getFirstDayOfWeek() - 1) % 7)) + 7) + DayOfWeek.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c10 = this.f139466g;
        if (c10 == 'W') {
            qVar = weekFieldsA.f139524d;
        } else {
            if (c10 == 'Y') {
                j$.time.temporal.q qVar2 = weekFieldsA.f139527g;
                int i10 = this.f139467h;
                if (i10 == 2) {
                    return new p(qVar2, 2, 2, p.f139459h, this.f139439e);
                }
                return new j(qVar2, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.f139439e);
            }
            if (c10 == 'c' || c10 == 'e') {
                qVar = weekFieldsA.f139523c;
            } else {
                if (c10 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                qVar = weekFieldsA.f139526f;
            }
        }
        return new j(qVar, this.f139436b, this.f139437c, SignStyle.NOT_NEGATIVE, this.f139439e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f139467h;
        char c10 = this.f139466g;
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
