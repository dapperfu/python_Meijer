package d3;

import a3.C5653j;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class u {
    public static void d(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer("csd-" + i10, ByteBuffer.wrap(list.get(i10)));
        }
    }

    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C5653j c5653j) {
        if (c5653j != null) {
            d(mediaFormat, "color-transfer", c5653j.f44665c);
            d(mediaFormat, "color-standard", c5653j.f44663a);
            d(mediaFormat, "color-range", c5653j.f44664b);
            a(mediaFormat, "hdr-static-info", c5653j.f44666d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }
}
