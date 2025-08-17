package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "distance", "", "isInLayer", "isInExpandedBounds", "Landroidx/compose/ui/node/r;", "a", "(FZZ)J", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5827x {
    static /* synthetic */ long b(float f10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return a(f10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10, boolean z11) {
        long j10;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f10);
        long j11 = 0;
        if (z10) {
            j10 = 1;
        } else {
            j10 = 0;
        }
        if (z11) {
            j11 = 2;
        }
        return r.b(((j10 | j11) & 4294967295L) | (jFloatToRawIntBits << 32));
    }
}
