package vv;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "propertyName", "", "defaultValue", "d", "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "a", "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* renamed from: vv.H, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C17634H {
    public static final int a(String str, int i10, int i11, int i12) {
        return (int) C17632F.c(str, i10, i11, i12);
    }

    public static /* synthetic */ int e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = a.e.API_PRIORITY_OTHER;
        }
        return C17632F.b(str, i10, i11, i12);
    }

    public static /* synthetic */ long f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C17632F.c(str, j10, j13, j12);
    }

    public static final long b(String str, long j10, long j11, long j12) {
        String strD = C17632F.d(str);
        if (strD == null) {
            return j10;
        }
        Long lX = StringsKt.x(strD);
        if (lX != null) {
            long jLongValue = lX.longValue();
            if (j11 <= jLongValue && jLongValue <= j12) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = C17632F.d(str);
        if (strD == null) {
            return str2;
        }
        return strD;
    }

    public static final boolean d(String str, boolean z10) {
        String strD = C17632F.d(str);
        if (strD != null) {
            return Boolean.parseBoolean(strD);
        }
        return z10;
    }
}
