package hw;

import gw.C14413b;
import gw.C14416e;
import gw.C14419h;
import gw.buffer;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgw/F;", "Lgw/h;", "bytes", "", "bytesOffset", "byteCount", "", "fromIndex", "toIndex", "a", "(Lgw/F;Lgw/h;IIJJ)J", "Lgw/e;", "", "c", "(Lgw/e;Lgw/h;IIJJ)Z", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class f {
    public static final long a(buffer bufferVar, C14419h c14419h, int i10, int i11, long j10, long j11) {
        Intrinsics.j(bufferVar, "<this>");
        C14419h bytes = c14419h;
        Intrinsics.j(bytes, "bytes");
        int i12 = i10;
        long j12 = i11;
        C14413b.b(bytes.V(), i12, j12);
        if (bufferVar.closed) {
            throw new IllegalStateException("closed");
        }
        long jMax = j10;
        while (true) {
            long jB = a.b(bufferVar.bufferField, bytes, jMax, j11, i12, i11);
            if (jB != -1) {
                return jB;
            }
            long size = (bufferVar.bufferField.getSize() - j12) + 1;
            if (size >= j11) {
                return -1L;
            }
            long j13 = jMax;
            if (!c(bufferVar.bufferField, c14419h, i10, i11, j13, j11) || bufferVar.source.read(bufferVar.bufferField, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(j13, size);
            bytes = c14419h;
            i12 = i10;
        }
    }

    public static /* synthetic */ long b(buffer bufferVar, C14419h c14419h, int i10, int i11, long j10, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = c14419h.V();
        }
        return a(bufferVar, c14419h, i13, i11, j10, (i12 & 16) != 0 ? Long.MAX_VALUE : j11);
    }

    private static final boolean c(C14416e c14416e, C14419h c14419h, int i10, int i11, long j10, long j11) {
        if (c14416e.getSize() < j11) {
            return true;
        }
        int iMax = (int) Math.max(1L, (c14416e.getSize() - j11) + 1);
        int iMin = ((int) Math.min(i11, (c14416e.getSize() - j10) + 1)) - 1;
        if (iMax <= iMin) {
            int i12 = iMin;
            while (true) {
                C14416e c14416e2 = c14416e;
                C14419h c14419h2 = c14419h;
                int i13 = i10;
                if (c14416e2.z(c14416e.getSize() - i12, c14419h2, i13, i12)) {
                    return true;
                }
                if (i12 != iMax) {
                    i12--;
                    c14416e = c14416e2;
                    c14419h = c14419h2;
                    i10 = i13;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
}
