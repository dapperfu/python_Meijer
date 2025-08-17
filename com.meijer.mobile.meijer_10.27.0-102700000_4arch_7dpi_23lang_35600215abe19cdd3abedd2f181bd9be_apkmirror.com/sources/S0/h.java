package S0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LS0/b;", "LU0/f;", "a", "(LS0/b;)J", "positionInRoot", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h {
    public static final long a(b bVar) {
        float x10 = bVar.getDragEvent().getX();
        float y10 = bVar.getDragEvent().getY();
        return U0.f.e((Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L));
    }
}
