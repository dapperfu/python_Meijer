package j$.nio.file.attribute;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class FileTime implements Comparable<FileTime> {

    /* renamed from: a, reason: collision with root package name */
    public final long f139208a;

    /* renamed from: b, reason: collision with root package name */
    public Instant f139209b;

    /* renamed from: c, reason: collision with root package name */
    public String f139210c;

    public static long O(long j10, long j11, long j12) {
        if (j10 > j12) {
            return Long.MAX_VALUE;
        }
        if (j10 < (-j12)) {
            return Long.MIN_VALUE;
        }
        return j10 * j11;
    }

    public FileTime(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f139208a = j10;
        this.f139209b = null;
    }

    public long toMillis() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.f139208a);
        }
        long epochSecond = this.f139209b.getEpochSecond();
        int nano = this.f139209b.getNano();
        long j10 = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j10 / 1000 == epochSecond) {
            return j10 + (nano / 1000000);
        }
        return epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.Instant toInstant() {
        /*
            r12 = this;
            j$.time.Instant r0 = r12.f139209b
            if (r0 != 0) goto La6
            int[] r0 = j$.nio.file.attribute.s.f139225a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L74;
                case 2: goto L66;
                case 3: goto L58;
                case 4: goto L52;
                case 5: goto L3e;
                case 6: goto L2b;
                case 7: goto L1a;
                default: goto L12;
            }
        L12:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L1a:
            long r0 = r12.f139208a
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = java.lang.Math.floorDiv(r0, r2)
            long r4 = r12.f139208a
            long r2 = java.lang.Math.floorMod(r4, r2)
            int r2 = (int) r2
            goto L83
        L2b:
            long r0 = r12.f139208a
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = java.lang.Math.floorDiv(r0, r2)
            long r4 = r12.f139208a
            long r2 = java.lang.Math.floorMod(r4, r2)
            int r2 = (int) r2
            int r2 = r2 * 1000
            goto L83
        L3e:
            long r0 = r12.f139208a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = java.lang.Math.floorDiv(r0, r2)
            long r4 = r12.f139208a
            long r2 = java.lang.Math.floorMod(r4, r2)
            int r2 = (int) r2
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r2 = r2 * r3
            goto L83
        L52:
            long r2 = r12.f139208a
        L54:
            r10 = r2
            r2 = r1
            r0 = r10
            goto L83
        L58:
            long r4 = r12.f139208a
            r6 = 60
            r8 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r2 = O(r4, r6, r8)
            goto L54
        L66:
            long r4 = r12.f139208a
            r6 = 3600(0xe10, double:1.7786E-320)
            r8 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r2 = O(r4, r6, r8)
            goto L54
        L74:
            long r4 = r12.f139208a
            r6 = 86400(0x15180, double:4.26873E-319)
            r8 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r2 = O(r4, r6, r8)
            goto L54
        L83:
            r3 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L91
            j$.time.Instant r0 = j$.time.Instant.MIN
            r12.f139209b = r0
            goto La6
        L91:
            r3 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L9f
            j$.time.Instant r0 = j$.time.Instant.f139281d
            r12.f139209b = r0
            goto La6
        L9f:
            long r2 = (long) r2
            j$.time.Instant r0 = j$.time.Instant.ofEpochSecond(r0, r2)
            r12.f139209b = r0
        La6:
            j$.time.Instant r0 = r12.f139209b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.FileTime.toInstant():j$.time.Instant");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FileTime) && compareTo((FileTime) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    public final long Q(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.f139208a - timeUnit.convert(j10, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - TimeUnit.DAYS.toSeconds(j10));
    }

    @Override // java.lang.Comparable
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(FileTime fileTime) {
        long days;
        long days2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            fileTime.getClass();
            return Long.compare(this.f139208a, fileTime.f139208a);
        }
        long epochSecond = toInstant().getEpochSecond();
        int iCompare = Long.compare(epochSecond, fileTime.toInstant().getEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Long.compare(toInstant().getNano(), fileTime.toInstant().getNano());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        if (timeUnit != null) {
            days = timeUnit.toDays(this.f139208a);
        } else {
            days = TimeUnit.SECONDS.toDays(toInstant().getEpochSecond());
        }
        if (timeUnit != null) {
            days2 = timeUnit.toDays(fileTime.f139208a);
        } else {
            days2 = TimeUnit.SECONDS.toDays(fileTime.toInstant().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(Q(days), fileTime.Q(days2));
        }
        return Long.compare(days, days2);
    }

    public static void C(StringBuilder sb2, int i10, int i11) {
        while (i10 > 0) {
            sb2.append((char) ((i11 / i10) + 48));
            i11 %= i10;
            i10 /= 10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.FileTime.toString():java.lang.String");
    }
}
