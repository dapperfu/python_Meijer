package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* renamed from: a, reason: collision with root package name */
    public final Month f138985a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f138986b;

    /* renamed from: c, reason: collision with root package name */
    public final DayOfWeek f138987c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalTime f138988d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f138989e;

    /* renamed from: f, reason: collision with root package name */
    public final d f138990f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffset f138991g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f138992h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f138993i;

    public e(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f138985a = month;
        this.f138986b = (byte) i10;
        this.f138987c = dayOfWeek;
        this.f138988d = localTime;
        this.f138989e = z10;
        this.f138990f = dVar;
        this.f138991g = zoneOffset;
        this.f138992h = zoneOffset2;
        this.f138993i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iO0 = this.f138989e ? 86400 : this.f138988d.o0();
        int i10 = this.f138991g.f138727b;
        int i11 = this.f138992h.f138727b - i10;
        int i12 = this.f138993i.f138727b - i10;
        int hour = iO0 % 3600 == 0 ? this.f138989e ? 24 : this.f138988d.getHour() : 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f138987c;
        dataOutput.writeInt((this.f138985a.getValue() << 28) + ((this.f138986b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f138990f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (hour == 31) {
            dataOutput.writeInt(iO0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f138992h.f138727b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f138993i.f138727b);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        LocalTime localTimeOf;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        Month monthO = Month.O(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        DayOfWeek dayOfWeekC = i14 == 0 ? null : DayOfWeek.C(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar2 = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j10 = dataInput.readInt();
            LocalTime localTime = LocalTime.MIN;
            ChronoField.SECOND_OF_DAY.i0(j10);
            int i19 = (int) (j10 / 3600);
            long j11 = j10 - (i19 * 3600);
            dVar = dVar2;
            localTimeOf = LocalTime.C(i19, (int) (j11 / 60), (int) (j11 - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            localTimeOf = LocalTime.of(i15 % 24, 0);
        }
        ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetOfTotalSeconds.f138727b;
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetOfTotalSeconds.f138727b;
        }
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i11);
        boolean z10 = i15 == 24;
        Objects.requireNonNull(monthO, "month");
        Objects.requireNonNull(localTimeOf, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds, "standardOffset");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetOfTotalSeconds3, "offsetAfter");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !localTimeOf.equals(LocalTime.MIDNIGHT)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeOf.f138707d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthO, i13, dayOfWeekC, localTimeOf, z10, dVar3, zoneOffsetOfTotalSeconds, zoneOffsetOfTotalSeconds2, zoneOffsetOfTotalSeconds3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f138985a == eVar.f138985a && this.f138986b == eVar.f138986b && this.f138987c == eVar.f138987c && this.f138990f == eVar.f138990f && this.f138988d.equals(eVar.f138988d) && this.f138989e == eVar.f138989e && this.f138991g.equals(eVar.f138991g) && this.f138992h.equals(eVar.f138992h) && this.f138993i.equals(eVar.f138993i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO0 = ((this.f138988d.o0() + (this.f138989e ? 1 : 0)) << 15) + (this.f138985a.ordinal() << 11) + ((this.f138986b + 32) << 5);
        DayOfWeek dayOfWeek = this.f138987c;
        return ((this.f138991g.f138727b ^ (this.f138990f.ordinal() + (iO0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f138992h.f138727b) ^ this.f138993i.f138727b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f138993i.f138727b - this.f138992h.f138727b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f138992h);
        sb2.append(" to ");
        sb2.append(this.f138993i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.f138987c;
        if (dayOfWeek != null) {
            byte b10 = this.f138986b;
            if (b10 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f138985a.name());
            } else if (b10 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f138986b) - 1);
                sb2.append(" of ");
                sb2.append(this.f138985a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.f138985a.name());
                sb2.append(' ');
                sb2.append((int) this.f138986b);
            }
        } else {
            sb2.append(this.f138985a.name());
            sb2.append(' ');
            sb2.append((int) this.f138986b);
        }
        sb2.append(" at ");
        sb2.append(this.f138989e ? "24:00" : this.f138988d.toString());
        sb2.append(" ");
        sb2.append(this.f138990f);
        sb2.append(", standard offset ");
        sb2.append(this.f138991g);
        sb2.append(']');
        return sb2.toString();
    }
}
