package lw;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kw.C15325b;
import kw.C15328e;
import kw.C15331h;
import kw.F;
import kw.N;
import kw.z;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0003\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001aA\u0010\u001d\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u001f*\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006+"}, d2 = {"Lkw/F;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "g", "(Lkw/F;I[BII)Z", "Lkw/e;", "", "newline", "", "h", "(Lkw/e;J)Ljava/lang/String;", "Lkw/z;", "options", "selectTruncated", "i", "(Lkw/e;Lkw/z;Z)I", "v", "e", "(J)I", "Lkw/h;", "fromIndex", "toIndex", "byteCount", "b", "(Lkw/e;Lkw/h;JJII)J", "Lkw/e$a;", "unsafeCursor", "d", "(Lkw/e;Lkw/e$a;)Lkw/e$a;", "a", "[B", "f", "()[B", "HEX_DIGIT_BYTES", "", "[J", "DigitCountToLargestValue", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f149444a = N.a("0123456789abcdef");

    /* renamed from: b, reason: collision with root package name */
    private static final long[] f149445b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final long b(C15328e c15328e, C15331h bytes, long j10, long j11, int i10, int i11) {
        F f10;
        int i12;
        long j12 = j10;
        long size = j11;
        Intrinsics.j(c15328e, "<this>");
        Intrinsics.j(bytes, "bytes");
        long j13 = i11;
        C15325b.b(bytes.V(), i10, j13);
        if (i11 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long size2 = 0;
        if (j12 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j12).toString());
        }
        if (j12 > size) {
            throw new IllegalArgumentException(("fromIndex > toIndex: " + j12 + " > " + size).toString());
        }
        if (size > c15328e.getSize()) {
            size = c15328e.getSize();
        }
        long j14 = -1;
        if (j12 == size || (f10 = c15328e.head) == null) {
            return -1L;
        }
        if (c15328e.getSize() - j12 >= j12) {
            while (true) {
                long j15 = (f10.limit - f10.pos) + size2;
                if (j15 > j12) {
                    break;
                }
                f10 = f10.next;
                Intrinsics.g(f10);
                size2 = j15;
            }
            byte[] bArrI = bytes.I();
            byte b10 = bArrI[i10];
            long jMin = Math.min(size, (c15328e.getSize() - j13) + 1);
            while (size2 < jMin) {
                byte[] bArr = f10.data;
                int iMin = (int) Math.min(f10.limit, (f10.pos + jMin) - size2);
                i12 = (int) ((f10.pos + j12) - size2);
                while (i12 < iMin) {
                    if (bArr[i12] != b10 || !g(f10, i12 + 1, bArrI, i10 + 1, i11)) {
                        i12++;
                    }
                }
                size2 += f10.limit - f10.pos;
                f10 = f10.next;
                Intrinsics.g(f10);
                j12 = size2;
            }
            return -1L;
        }
        size2 = c15328e.getSize();
        while (size2 > j12) {
            f10 = f10.prev;
            Intrinsics.g(f10);
            size2 -= f10.limit - f10.pos;
            j14 = j14;
        }
        long j16 = j14;
        byte[] bArrI2 = bytes.I();
        byte b11 = bArrI2[i10];
        long jMin2 = Math.min(size, (c15328e.getSize() - j13) + 1);
        while (size2 < jMin2) {
            byte[] bArr2 = f10.data;
            int iMin2 = (int) Math.min(f10.limit, (f10.pos + jMin2) - size2);
            i12 = (int) ((f10.pos + j12) - size2);
            while (i12 < iMin2) {
                if (bArr2[i12] != b11 || !g(f10, i12 + 1, bArrI2, i10 + 1, i11)) {
                    i12++;
                }
            }
            size2 += f10.limit - f10.pos;
            f10 = f10.next;
            Intrinsics.g(f10);
            j12 = size2;
        }
        return j16;
        return (i12 - f10.pos) + size2;
    }

    public static /* synthetic */ long c(C15328e c15328e, C15331h c15331h, long j10, long j11, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return b(c15328e, c15331h, j10, j11, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? c15331h.V() : i11);
    }

    public static final C15328e.a d(C15328e c15328e, C15328e.a unsafeCursor) {
        Intrinsics.j(c15328e, "<this>");
        Intrinsics.j(unsafeCursor, "unsafeCursor");
        C15328e.a aVarG = C15325b.g(unsafeCursor);
        if (aVarG.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.buffer = c15328e;
        aVarG.readWrite = true;
        return aVarG;
    }

    public static final byte[] f() {
        return f149444a;
    }

    public static final boolean g(F segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.j(segment, "segment");
        Intrinsics.j(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                Intrinsics.g(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String h(C15328e c15328e, long j10) throws EOFException {
        Intrinsics.j(c15328e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c15328e.l(j11) == 13) {
                String strK1 = c15328e.K1(j11);
                c15328e.skip(2L);
                return strK1;
            }
        }
        String strK12 = c15328e.K1(j10);
        c15328e.skip(1L);
        return strK12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int i(kw.C15328e r17, kw.z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.a.i(kw.e, kw.z, boolean):int");
    }

    public static /* synthetic */ int j(C15328e c15328e, z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(c15328e, zVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(long j10) {
        int i10;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j10)) * 10) >>> 5;
        if (j10 > f149445b[iNumberOfLeadingZeros]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        return iNumberOfLeadingZeros + i10;
    }
}
