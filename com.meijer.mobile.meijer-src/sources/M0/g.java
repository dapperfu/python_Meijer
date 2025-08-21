package M0;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\n\u0010\u0012\"\u00020\u00062\u00020\u0006*\n\u0010\u0013\"\u00020\u00022\u00020\u0002¨\u0006\u0014"}, d2 = {"", "capacity", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "b", "(I)[J", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", PreferencesHelper.PREF_ID, "a", "([JJ)I", "index", "d", "([JIJ)[J", "e", "([JI)[J", "c", "(I)J", "SnapshotId", "SnapshotIdArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {
    public static final int a(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final long c(int i10) {
        return i10;
    }

    public static final long[] d(long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.n(jArr, jArr2, 0, 0, i10);
        ArraysKt.n(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }

    public static final long[] e(long[] jArr, int i10) {
        int length = jArr.length;
        int i11 = length - 1;
        if (i11 == 0) {
            return null;
        }
        long[] jArr2 = new long[i11];
        if (i10 > 0) {
            ArraysKt.n(jArr, jArr2, 0, 0, i10);
        }
        if (i10 < i11) {
            ArraysKt.n(jArr, jArr2, i10, i10 + 1, length);
        }
        return jArr2;
    }

    public static final long[] b(int i10) {
        return new long[i10];
    }
}
