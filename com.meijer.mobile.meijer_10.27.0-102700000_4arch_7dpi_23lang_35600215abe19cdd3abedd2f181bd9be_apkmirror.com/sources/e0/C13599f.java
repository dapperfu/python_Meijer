package e0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001a1\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\f\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a'\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"", "position", "popupLength", "windowLength", "", "closeAffinity", "b", "(IIIZ)I", "h", "(IIIZ)Z", "g", "e", "(IIZ)I", "d", "f", "a", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13599f {
    private static final boolean h(int i10, int i11, int i12, boolean z10) {
        return z10 ? i11 <= i10 : i12 - i11 > i10;
    }

    private static final int a(int i10, int i11, boolean z10) {
        return f(i10, i11, !z10);
    }

    public static final int b(int i10, int i11, int i12, boolean z10) {
        return i11 >= i12 ? f(i11, i12, z10) : g(i10, i11, i12, z10) ? e(i10, i11, z10) : h(i10, i11, i12, z10) ? d(i10, i11, z10) : a(i11, i12, z10);
    }

    public static /* synthetic */ int c(int i10, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        return b(i10, i11, i12, z10);
    }

    private static final int d(int i10, int i11, boolean z10) {
        return e(i10, i11, !z10);
    }

    private static final int e(int i10, int i11, boolean z10) {
        return z10 ? i10 : i10 - i11;
    }

    private static final int f(int i10, int i11, boolean z10) {
        if (z10) {
            return 0;
        }
        return i11 - i10;
    }

    private static final boolean g(int i10, int i11, int i12, boolean z10) {
        return h(i10, i11, i12, !z10);
    }
}
