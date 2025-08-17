package M0;

import Z.N;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"LM0/f;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "array", "<init>", "([J)V", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", PreferencesHelper.PREF_ID, "", "a", "(J)V", "b", "()[J", "LZ/N;", "LZ/N;", "list", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final N list;

    public final void a(long id2) {
        this.list.d(id2);
    }

    public final long[] b() {
        N n10 = this.list;
        int i10 = n10._size;
        if (i10 == 0) {
            return null;
        }
        long[] jArr = new long[i10];
        long[] jArr2 = n10.content;
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = jArr2[i11];
        }
        return jArr;
    }

    public f(long[] jArr) {
        N n10;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            n10 = new N(jArrCopyOf.length);
            n10.e(n10._size, jArrCopyOf);
        } else {
            n10 = new N(0, 1, null);
        }
        this.list = n10;
    }
}
