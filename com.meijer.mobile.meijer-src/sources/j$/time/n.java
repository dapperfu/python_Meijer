package j$.time;

import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class n implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f139502a;

    /* renamed from: b, reason: collision with root package name */
    public Object f139503b;

    public n() {
    }

    public n(byte b10, Object obj) {
        this.f139502a = b10;
        this.f139503b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b10 = this.f139502a;
        Object obj = this.f139503b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f139278a);
                objectOutput.writeInt(duration.f139279b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f139282a);
                objectOutput.writeInt(instant.f139283b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.f139286a);
                objectOutput.writeByte(localDate.f139287b);
                objectOutput.writeByte(localDate.f139288c);
                return;
            case 4:
                ((LocalTime) obj).r0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.f139290a;
                objectOutput.writeInt(localDate2.f139286a);
                objectOutput.writeByte(localDate2.f139287b);
                objectOutput.writeByte(localDate2.f139288c);
                localDateTime.f139291b.r0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f139319a;
                LocalDate localDate3 = localDateTime2.f139290a;
                objectOutput.writeInt(localDate3.f139286a);
                objectOutput.writeByte(localDate3.f139287b);
                objectOutput.writeByte(localDate3.f139288c);
                localDateTime2.f139291b.r0(objectOutput);
                zonedDateTime.f139320b.n0(objectOutput);
                zonedDateTime.f139321c.f0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((q) obj).f139509b);
                return;
            case 8:
                ((ZoneOffset) obj).n0(objectOutput);
                return;
            case 9:
                m mVar = (m) obj;
                mVar.f139500a.r0(objectOutput);
                mVar.f139501b.n0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f139301a;
                LocalDate localDate4 = localDateTime3.f139290a;
                objectOutput.writeInt(localDate4.f139286a);
                objectOutput.writeByte(localDate4.f139287b);
                objectOutput.writeByte(localDate4.f139288c);
                localDateTime3.f139291b.r0(objectOutput);
                offsetDateTime.f139302b.n0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((Year) obj).f139308a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.f139310a);
                objectOutput.writeByte(yearMonth.f139311b);
                return;
            case 13:
                j jVar = (j) obj;
                objectOutput.writeByte(jVar.f139495a);
                objectOutput.writeByte(jVar.f139496b);
                return;
            case 14:
                Period period = (Period) obj;
                objectOutput.writeInt(period.f139304a);
                objectOutput.writeInt(period.f139305b);
                objectOutput.writeInt(period.f139306c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte b10 = objectInput.readByte();
        this.f139502a = b10;
        this.f139503b = a(b10, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) throws IOException {
        switch (b10) {
            case 1:
                Duration duration = Duration.f139276c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f139280c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.f139284d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.m0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.f139284d;
                return LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.MIN;
                LocalDate localDate3 = LocalDate.f139284d;
                LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m0(objectInput));
                ZoneOffset zoneOffsetM0 = ZoneOffset.m0(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeOf, "localDateTime");
                Objects.requireNonNull(zoneOffsetM0, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetM0.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeOf, zoneId, zoneOffsetM0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i10 = q.f139508d;
                return ZoneId.O(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.m0(objectInput);
            case 9:
                int i11 = m.f139499c;
                return new m(LocalTime.m0(objectInput), ZoneOffset.m0(objectInput));
            case 10:
                int i12 = OffsetDateTime.f139300c;
                LocalDate localDate4 = LocalDate.f139284d;
                return new OffsetDateTime(LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.m0(objectInput)), ZoneOffset.m0(objectInput));
            case 11:
                int i13 = Year.f139307b;
                return Year.of(objectInput.readInt());
            case 12:
                int i14 = YearMonth.f139309c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i15 = j.f139494c;
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                Month monthO = Month.O(b11);
                Objects.requireNonNull(monthO, "month");
                ChronoField.DAY_OF_MONTH.i0(b12);
                if (b12 <= monthO.maxLength()) {
                    return new j(monthO.getValue(), b12);
                }
                throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) b12) + " is not valid for month " + monthO.name());
            case 14:
                Period period = Period.f139303d;
                return Period.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f139503b;
    }
}
