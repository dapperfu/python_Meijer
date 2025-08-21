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
    public final Month f139575a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f139576b;

    /* renamed from: c, reason: collision with root package name */
    public final DayOfWeek f139577c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalTime f139578d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139579e;

    /* renamed from: f, reason: collision with root package name */
    public final d f139580f;

    /* renamed from: g, reason: collision with root package name */
    public final ZoneOffset f139581g;

    /* renamed from: h, reason: collision with root package name */
    public final ZoneOffset f139582h;

    /* renamed from: i, reason: collision with root package name */
    public final ZoneOffset f139583i;

    public e(Month month, int i10, DayOfWeek dayOfWeek, LocalTime localTime, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f139575a = month;
        this.f139576b = (byte) i10;
        this.f139577c = dayOfWeek;
        this.f139578d = localTime;
        this.f139579e = z10;
        this.f139580f = dVar;
        this.f139581g = zoneOffset;
        this.f139582h = zoneOffset2;
        this.f139583i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iO0 = this.f139579e ? 86400 : this.f139578d.o0();
        int i10 = this.f139581g.f139317b;
        int i11 = this.f139582h.f139317b - i10;
        int i12 = this.f139583i.f139317b - i10;
        int hour = iO0 % 3600 == 0 ? this.f139579e ? 24 : this.f139578d.getHour() : 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        DayOfWeek dayOfWeek = this.f139577c;
        dataOutput.writeInt((this.f139575a.getValue() << 28) + ((this.f139576b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (hour << 14) + (this.f139580f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (hour == 31) {
            dataOutput.writeInt(iO0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f139582h.f139317b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f139583i.f139317b);
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
            i10 = (i17 * 1800) + zoneOffsetOfTotalSeconds.f139317b;
        }
        ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetOfTotalSeconds.f139317b;
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
        if (z10 && !localTimeOf.equals(LocalTime.f139292e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeOf.f139297d != 0) {
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
            if (this.f139575a == eVar.f139575a && this.f139576b == eVar.f139576b && this.f139577c == eVar.f139577c && this.f139580f == eVar.f139580f && this.f139578d.equals(eVar.f139578d) && this.f139579e == eVar.f139579e && this.f139581g.equals(eVar.f139581g) && this.f139582h.equals(eVar.f139582h) && this.f139583i.equals(eVar.f139583i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iO0 = ((this.f139578d.o0() + (this.f139579e ? 1 : 0)) << 15) + (this.f139575a.ordinal() << 11) + ((this.f139576b + 32) << 5);
        DayOfWeek dayOfWeek = this.f139577c;
        return ((this.f139581g.f139317b ^ (this.f139580f.ordinal() + (iO0 + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.f139582h.f139317b) ^ this.f139583i.f139317b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f139583i.f139317b - this.f139582h.f139317b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f139582h);
        sb2.append(" to ");
        sb2.append(this.f139583i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.f139577c;
        if (dayOfWeek != null) {
            byte b10 = this.f139576b;
            if (b10 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f139575a.name());
            } else if (b10 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f139576b) - 1);
                sb2.append(" of ");
                sb2.append(this.f139575a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.f139575a.name());
                sb2.append(' ');
                sb2.append((int) this.f139576b);
            }
        } else {
            sb2.append(this.f139575a.name());
            sb2.append(' ');
            sb2.append((int) this.f139576b);
        }
        sb2.append(" at ");
        sb2.append(this.f139579e ? "24:00" : this.f139578d.toString());
        sb2.append(" ");
        sb2.append(this.f139580f);
        sb2.append(", standard offset ");
        sb2.append(this.f139581g);
        sb2.append(']');
        return sb2.toString();
    }
}
