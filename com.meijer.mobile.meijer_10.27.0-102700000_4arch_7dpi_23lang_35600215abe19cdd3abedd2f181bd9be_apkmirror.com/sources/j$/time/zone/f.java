package j$.time.zone;

import j$.time.Clock;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.IsoChronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class f implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final long[] f138994i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public static final e[] f138995j = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f138996k = new LocalDateTime[0];

    /* renamed from: l, reason: collision with root package name */
    public static final b[] f138997l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* renamed from: a, reason: collision with root package name */
    public final long[] f138998a;

    /* renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f138999b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f139000c;

    /* renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f139001d;

    /* renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f139002e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f139003f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeZone f139004g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f139005h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f138980b;
        if (bVar.C()) {
            if (localDateTime.isBefore(localDateTime2)) {
                return bVar.f138981c;
            }
            if (!localDateTime.isBefore(bVar.f138980b.Q(bVar.f138982d.f138727b - bVar.f138981c.f138727b))) {
                return bVar.f138982d;
            }
        } else {
            if (!localDateTime.isBefore(localDateTime2)) {
                return bVar.f138982d;
            }
            if (localDateTime.isBefore(bVar.f138980b.Q(bVar.f138982d.f138727b - bVar.f138981c.f138727b))) {
                return bVar.f138981c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f138998a = jArr;
        this.f138999b = zoneOffsetArr;
        this.f139000c = jArr2;
        this.f139002e = zoneOffsetArr2;
        this.f139003f = eVarArr;
        if (jArr2.length == 0) {
            this.f139001d = f138996k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.C()) {
                    arrayList.add(bVar.f138980b);
                    arrayList.add(bVar.f138980b.Q(bVar.f138982d.f138727b - bVar.f138981c.f138727b));
                } else {
                    arrayList.add(bVar.f138980b.Q(bVar.f138982d.f138727b - bVar.f138981c.f138727b));
                    arrayList.add(bVar.f138980b);
                }
                i10 = i11;
            }
            this.f139001d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f139004g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f138999b = zoneOffsetArr;
        long[] jArr = f138994i;
        this.f138998a = jArr;
        this.f139000c = jArr;
        this.f139001d = f138996k;
        this.f139002e = zoneOffsetArr;
        this.f139003f = f138995j;
        this.f139004g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f138999b = zoneOffsetArr;
        long[] jArr = f138994i;
        this.f138998a = jArr;
        this.f139000c = jArr;
        this.f139001d = f138996k;
        this.f139002e = zoneOffsetArr;
        this.f139003f = f138995j;
        this.f139004g = timeZone;
    }

    public static ZoneOffset i(int i10) {
        return ZoneOffset.ofTotalSeconds(i10 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f139004g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return LocalDate.l0(Math.floorDiv(j10 + zoneOffset.f138727b, 86400)).getYear();
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.f139004g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || this.f139004g.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            b bVar2 = null;
            if (this.f139004g != null) {
                long epochSecond = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                    epochSecond++;
                }
                int iC = c(epochSecond, d(instantNow));
                b[] bVarArrB = b(iC);
                int length = bVarArrB.length - 1;
                while (true) {
                    if (length >= 0) {
                        bVar = bVarArrB[length];
                        if (epochSecond > bVar.f138979a) {
                            break;
                        }
                        length--;
                    } else if (iC > 1800) {
                        b[] bVarArrB2 = b(iC - 1);
                        for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                            bVar = bVarArrB2[length2];
                            if (epochSecond <= bVar.f138979a) {
                            }
                        }
                        long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().b() / 1000) + 31968000);
                        int offset = this.f139004g.getOffset((epochSecond - 1) * 1000);
                        long jS = LocalDate.of(1800, 1, 1).S() * 86400;
                        while (true) {
                            if (jS > jMin) {
                                break;
                            }
                            int offset2 = this.f139004g.getOffset(jMin * 1000);
                            if (offset != offset2) {
                                int iC2 = c(jMin, i(offset2));
                                b[] bVarArrB3 = b(iC2 + 1);
                                int length3 = bVarArrB3.length - 1;
                                while (true) {
                                    if (length3 < 0) {
                                        b[] bVarArrB4 = b(iC2);
                                        bVar2 = bVarArrB4[bVarArrB4.length - 1];
                                        break;
                                    }
                                    bVar2 = bVarArrB3[length3];
                                    if (epochSecond > bVar2.f138979a) {
                                        break;
                                    }
                                    length3--;
                                }
                            } else {
                                jMin -= 7776000;
                            }
                        }
                    }
                }
                bVar2 = bVar;
            } else if (this.f139000c.length != 0) {
                long epochSecond2 = instantNow.getEpochSecond();
                if (instantNow.getNano() > 0 && epochSecond2 < Long.MAX_VALUE) {
                    epochSecond2++;
                }
                long[] jArr = this.f139000c;
                long j10 = jArr[jArr.length - 1];
                if (this.f139003f.length <= 0 || epochSecond2 <= j10) {
                    int iBinarySearch = Arrays.binarySearch(this.f139000c, epochSecond2);
                    if (iBinarySearch < 0) {
                        iBinarySearch = (-iBinarySearch) - 1;
                    }
                    if (iBinarySearch > 0) {
                        int i10 = iBinarySearch - 1;
                        long j11 = this.f139000c[i10];
                        ZoneOffset[] zoneOffsetArr = this.f139002e;
                        bVar2 = new b(j11, zoneOffsetArr[i10], zoneOffsetArr[iBinarySearch]);
                    }
                } else {
                    ZoneOffset[] zoneOffsetArr2 = this.f139002e;
                    ZoneOffset zoneOffset = zoneOffsetArr2[zoneOffsetArr2.length - 1];
                    int iC3 = c(epochSecond2, zoneOffset);
                    b[] bVarArrB5 = b(iC3);
                    int length4 = bVarArrB5.length - 1;
                    while (true) {
                        if (length4 < 0) {
                            int i11 = iC3 - 1;
                            if (i11 > c(j10, zoneOffset)) {
                                b[] bVarArrB6 = b(i11);
                                bVar2 = bVarArrB6[bVarArrB6.length - 1];
                            }
                        } else {
                            b bVar3 = bVarArrB5[length4];
                            if (epochSecond2 > bVar3.f138979a) {
                                bVar2 = bVar3;
                                break;
                            }
                            length4--;
                        }
                    }
                }
            }
            if (bVar2 != null) {
                return false;
            }
        } else if (this.f139000c.length != 0) {
            return false;
        }
        return true;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f139004g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f139000c.length == 0) {
            return this.f138999b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f139003f.length > 0) {
            if (epochSecond > this.f139000c[r7.length - 1]) {
                b[] bVarArrB = b(c(epochSecond, this.f139002e[r7.length - 1]));
                b bVar = null;
                for (int i10 = 0; i10 < bVarArrB.length; i10++) {
                    bVar = bVarArrB[i10];
                    if (epochSecond < bVar.f138979a) {
                        return bVar.f138981c;
                    }
                }
                return bVar.f138982d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f139000c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f139002e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.C() ? Collections.EMPTY_LIST : j$.desugar.sun.nio.fs.g.o(new Object[]{bVar.f138981c, bVar.f138982d});
    }

    public final Object e(LocalDateTime localDateTime) {
        Object obj = null;
        int i10 = 0;
        if (this.f139004g != null) {
            b[] bVarArrB = b(localDateTime.getYear());
            if (bVarArrB.length == 0) {
                return i(this.f139004g.getOffset(localDateTime.A(this.f138999b[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i10 < length) {
                b bVar = bVarArrB[i10];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.f138981c)) {
                    return objA;
                }
                i10++;
                obj = objA;
            }
            return obj;
        }
        if (this.f139000c.length == 0) {
            return this.f138999b[0];
        }
        if (this.f139003f.length > 0) {
            if (localDateTime.isAfter(this.f139001d[r0.length - 1])) {
                b[] bVarArrB2 = b(localDateTime.getYear());
                int length2 = bVarArrB2.length;
                while (i10 < length2) {
                    b bVar2 = bVarArrB2[i10];
                    Object objA2 = a(localDateTime, bVar2);
                    if ((objA2 instanceof b) || objA2.equals(bVar2.f138981c)) {
                        return objA2;
                    }
                    i10++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f139001d, localDateTime);
        if (iBinarySearch == -1) {
            return this.f139002e[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else {
            Object[] objArr = this.f139001d;
            if (iBinarySearch < objArr.length - 1) {
                int i11 = iBinarySearch + 1;
                if (objArr[iBinarySearch].equals(objArr[i11])) {
                    iBinarySearch = i11;
                }
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime[] localDateTimeArr = this.f139001d;
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            ZoneOffset[] zoneOffsetArr = this.f139002e;
            int i12 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr[i12];
            ZoneOffset zoneOffset2 = zoneOffsetArr[i12 + 1];
            if (zoneOffset2.f138727b > zoneOffset.f138727b) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return this.f139002e[(iBinarySearch / 2) + 1];
    }

    public final b[] b(int i10) {
        LocalDate localDateH;
        b[] bVarArr = f138997l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f139005h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        int i11 = 0;
        int i12 = 1;
        if (this.f139004g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.MIN;
            long jA = new LocalDateTime(LocalDate.of(i10 - 1, 12, 31), LocalTime.of(0, 0)).A(this.f138999b[0]);
            long j11 = 1000;
            int offset = this.f139004g.getOffset(jA * 1000);
            long j12 = 31968000 + jA;
            while (jA < j12) {
                long j13 = jA + 7776000;
                long j14 = j11;
                if (offset != this.f139004g.getOffset(j13 * j14)) {
                    while (j13 - jA > j10) {
                        long jFloorDiv = Math.floorDiv(j13 + jA, 2L);
                        if (this.f139004g.getOffset(jFloorDiv * j14) == offset) {
                            jA = jFloorDiv;
                        } else {
                            j13 = jFloorDiv;
                        }
                        j10 = 1;
                    }
                    if (this.f139004g.getOffset(jA * j14) == offset) {
                        jA = j13;
                    }
                    ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = this.f139004g.getOffset(jA * j14);
                    ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(jA, zoneOffsetI2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jA, zoneOffsetI, zoneOffsetI2);
                    }
                    offset = offset2;
                } else {
                    jA = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.f139005h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f139003f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b10 = eVar.f138986b;
            if (b10 < 0) {
                Month month = eVar.f138985a;
                long j15 = i10;
                int iH = month.H(IsoChronology.INSTANCE.g0(j15)) + 1 + eVar.f138986b;
                LocalDate localDate = LocalDate.f138695d;
                ChronoField.YEAR.i0(j15);
                ChronoField.DAY_OF_MONTH.i0(iH);
                localDateH = LocalDate.H(i10, month.getValue(), iH);
                DayOfWeek dayOfWeek = eVar.f138987c;
                if (dayOfWeek != null) {
                    localDateH = localDateH.e(new l(dayOfWeek.getValue(), i12));
                }
            } else {
                Month month2 = eVar.f138985a;
                LocalDate localDate2 = LocalDate.f138695d;
                ChronoField.YEAR.i0(i10);
                ChronoField.DAY_OF_MONTH.i0(b10);
                localDateH = LocalDate.H(i10, month2.getValue(), b10);
                DayOfWeek dayOfWeek2 = eVar.f138987c;
                if (dayOfWeek2 != null) {
                    localDateH = localDateH.e(new l(dayOfWeek2.getValue(), i11));
                }
            }
            if (eVar.f138989e) {
                localDateH = localDateH.plusDays(1L);
            }
            LocalDateTime localDateTimeOf = LocalDateTime.of(localDateH, eVar.f138988d);
            d dVar = eVar.f138990f;
            ZoneOffset zoneOffset = eVar.f138991g;
            ZoneOffset zoneOffset2 = eVar.f138992h;
            int i14 = c.f138983a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeOf = localDateTimeOf.Q(zoneOffset2.f138727b - ZoneOffset.UTC.f138727b);
            } else if (i14 == 2) {
                localDateTimeOf = localDateTimeOf.Q(zoneOffset2.f138727b - zoneOffset.f138727b);
            }
            bVarArr3[i13] = new b(localDateTimeOf, eVar.f138992h, eVar.f138993i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.f139005h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.f139004g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else if (this.f139000c.length == 0) {
            zoneOffsetI = this.f138999b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f138998a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetI = this.f138999b[iBinarySearch + 1];
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f139004g, fVar.f139004g) && Arrays.equals(this.f138998a, fVar.f138998a) && Arrays.equals(this.f138999b, fVar.f138999b) && Arrays.equals(this.f139000c, fVar.f139000c) && Arrays.equals(this.f139002e, fVar.f139002e) && Arrays.equals(this.f139003f, fVar.f139003f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f139004g) ^ Arrays.hashCode(this.f138998a)) ^ Arrays.hashCode(this.f138999b)) ^ Arrays.hashCode(this.f139000c)) ^ Arrays.hashCode(this.f139002e)) ^ Arrays.hashCode(this.f139003f);
    }

    public final String toString() {
        TimeZone timeZone = this.f139004g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f138999b[r0.length - 1] + "]";
    }
}
