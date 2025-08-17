package Z0;

import H1.n;
import H1.r;
import V0.C5304b1;
import V0.InterfaceC5316f1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"LV0/f1;", "image", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "LV0/b1;", "filterQuality", "LZ0/a;", "a", "(LV0/f1;JJI)LZ0/a;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {
    public static final BitmapPainter a(InterfaceC5316f1 interfaceC5316f1, long j10, long j11, int i10) {
        BitmapPainter bitmapPainter = new BitmapPainter(interfaceC5316f1, j10, j11, null);
        bitmapPainter.n(i10);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(InterfaceC5316f1 interfaceC5316f1, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = n.INSTANCE.b();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = r.c((interfaceC5316f1.getHeight() & 4294967295L) | (interfaceC5316f1.getWidth() << 32));
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = C5304b1.INSTANCE.a();
        }
        return a(interfaceC5316f1, j12, j13, i10);
    }
}
