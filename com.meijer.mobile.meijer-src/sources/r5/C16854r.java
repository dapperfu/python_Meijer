package r5;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import n5.AbstractC15906c;
import n5.Size;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lr5/r;", "Lr5/o;", "Lr5/s;", "logger", "<init>", "(Lr5/s;)V", "Ln5/i;", "size", "", "b", "(Ln5/i;)Z", "a", "()Z", "Lr5/s;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r5.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16854r implements InterfaceC16851o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16855s logger;

    @Override // r5.InterfaceC16851o
    /* renamed from: a */
    public boolean getAllowHardware() {
        return C16850n.f159241a.b(this.logger);
    }

    public C16854r(InterfaceC16855s interfaceC16855s) {
        this.logger = interfaceC16855s;
    }

    @Override // r5.InterfaceC16851o
    public boolean b(Size size) {
        int i10;
        AbstractC15906c width = size.getWidth();
        boolean z10 = width instanceof AbstractC15906c.a;
        int i11 = a.e.API_PRIORITY_OTHER;
        if (z10) {
            i10 = ((AbstractC15906c.a) width).px;
        } else {
            i10 = Integer.MAX_VALUE;
        }
        if (i10 > 100) {
            AbstractC15906c height = size.getHeight();
            if (height instanceof AbstractC15906c.a) {
                i11 = ((AbstractC15906c.a) height).px;
            }
            if (i11 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }
}
