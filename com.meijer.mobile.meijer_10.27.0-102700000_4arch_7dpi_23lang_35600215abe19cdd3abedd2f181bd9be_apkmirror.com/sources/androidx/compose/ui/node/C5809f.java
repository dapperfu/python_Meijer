package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/f;", "", "", "data", "a", "([I)[I", "", "index", "b", "([II)I", "value", "", "d", "([III)V", "c", "([I)I", "mid", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: androidx.compose.ui.node.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5809f {
    public static int[] a(int[] iArr) {
        return iArr;
    }

    private static final int c(int[] iArr) {
        return iArr.length / 2;
    }

    public static final int b(int[] iArr, int i10) {
        return iArr[i10 + c(iArr)];
    }

    public static final void d(int[] iArr, int i10, int i11) {
        iArr[i10 + c(iArr)] = i11;
    }
}
