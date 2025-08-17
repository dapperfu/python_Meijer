package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.k, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    public final int f138727b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f138728c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f138723d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f138724e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f138725f = ofTotalSeconds(-64800);

    /* renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f138726g = ofTotalSeconds(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f138727b - this.f138727b;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset j0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap r0 = j$.time.ZoneOffset.f138724e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L65
            r1 = 3
            if (r0 == r1) goto L81
            r4 = 5
            if (r0 == r4) goto L5c
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L52
            r5 = 7
            if (r0 == r5) goto L45
            r1 = 9
            if (r0 != r1) goto L39
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
            int r2 = l0(r7, r5, r2)
            goto L87
        L39:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L45:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            int r2 = l0(r7, r4, r3)
            goto L87
        L52:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r6, r2)
        L5a:
            r2 = r3
            goto L87
        L5c:
            int r0 = l0(r7, r2, r3)
            int r1 = l0(r7, r1, r3)
            goto L5a
        L65:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L81:
            int r0 = l0(r7, r2, r3)
            r1 = r3
            r2 = r1
        L87:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto La0
            if (r3 != r5) goto L94
            goto La0
        L94:
            j$.time.DateTimeException r0 = new j$.time.DateTimeException
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        La0:
            if (r3 != r5) goto Laa
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = k0(r7, r0, r1)
            return r7
        Laa:
            j$.time.ZoneOffset r7 = k0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.j0(java.lang.String):j$.time.ZoneOffset");
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f H() {
        return new j$.time.zone.f(this);
    }

    public static int l0(CharSequence charSequence, int i10, boolean z10) {
        if (z10) {
            String str = (String) charSequence;
            if (str.charAt(i10 - 1) != ':') {
                throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char cCharAt = str2.charAt(i10);
        char cCharAt2 = str2.charAt(i10 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset i0(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.d(j$.time.temporal.n.f138959d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneOffset k0(int i10, int i11, int i12) {
        if (i10 < -18 || i10 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i10 + " is not in the range -18 to 18");
        }
        if (i10 > 0) {
            if (i11 < 0 || i12 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i10 < 0) {
            if (i11 > 0 || i12 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i11 > 0 && i12 < 0) || (i11 < 0 && i12 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i11 < -59 || i11 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (i12 < -59 || i12 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i12 + " is not in the range -59 to 59");
        }
        if (Math.abs(i10) == 18 && (i11 | i12) != 0) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return ofTotalSeconds((i11 * 60) + (i10 * 3600) + i12);
    }

    public static ZoneOffset ofTotalSeconds(int i10) {
        if (i10 < -64800 || i10 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i10 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i10);
            ConcurrentMap concurrentMap = f138723d;
            ZoneOffset zoneOffset = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            ((ConcurrentHashMap) concurrentMap).putIfAbsent(numValueOf, new ZoneOffset(i10));
            ZoneOffset zoneOffset2 = (ZoneOffset) ((ConcurrentHashMap) concurrentMap).get(numValueOf);
            ((ConcurrentHashMap) f138724e).putIfAbsent(zoneOffset2.f138728c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i10);
    }

    public ZoneOffset(int i10) {
        String string;
        this.f138727b = i10;
        if (i10 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder();
            int i11 = iAbs / 3600;
            int i12 = (iAbs / 60) % 60;
            sb2.append(i10 < 0 ? "-" : "+");
            sb2.append(i11 < 10 ? "0" : "");
            sb2.append(i11);
            sb2.append(i12 < 10 ? ":0" : ":");
            sb2.append(i12);
            int i13 = iAbs % 60;
            if (i13 != 0) {
                sb2.append(i13 < 10 ? ":0" : ":");
                sb2.append(i13);
            }
            string = sb2.toString();
        }
        this.f138728c = string;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f138728c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f138727b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
        return super.k(temporalField).a(j(temporalField), temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        if (temporalField == ChronoField.OFFSET_SECONDS) {
            return this.f138727b;
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.Z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.n.f138959d || temporalQuery == j$.time.temporal.n.f138960e) ? this : super.d(temporalQuery);
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        return temporal.a(this.f138727b, ChronoField.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f138727b == ((ZoneOffset) obj).f138727b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f138727b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f138728c;
    }

    private Object writeReplace() {
        return new n((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void f0(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(8);
        n0(dataOutput);
    }

    public final void n0(DataOutput dataOutput) throws IOException {
        int i10 = this.f138727b;
        int i11 = i10 % 900 == 0 ? i10 / 900 : 127;
        dataOutput.writeByte(i11);
        if (i11 == 127) {
            dataOutput.writeInt(i10);
        }
    }

    public static ZoneOffset m0(DataInput dataInput) throws IOException {
        byte b10 = dataInput.readByte();
        return b10 == Byte.MAX_VALUE ? ofTotalSeconds(dataInput.readInt()) : ofTotalSeconds(b10 * 900);
    }
}
