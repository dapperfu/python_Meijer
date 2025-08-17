package M;

import F.l0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.n;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f18751a;

    public byte[] a(n nVar) {
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f18751a;
        if (incorrectJpegMetadataQuirk != null) {
            return incorrectJpegMetadataQuirk.f(nVar);
        }
        ByteBuffer byteBufferE = nVar.getPlanes()[0].e();
        byte[] bArr = new byte[byteBufferE.capacity()];
        byteBufferE.rewind();
        byteBufferE.get(bArr);
        return bArr;
    }

    public d(l0 l0Var) {
        this.f18751a = (IncorrectJpegMetadataQuirk) l0Var.b(IncorrectJpegMetadataQuirk.class);
    }
}
