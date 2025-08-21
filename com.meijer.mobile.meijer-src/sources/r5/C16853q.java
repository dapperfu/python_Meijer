package r5;

import kotlin.Metadata;
import n5.Size;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lr5/q;", "Lr5/o;", "", "allowHardware", "<init>", "(Z)V", "Ln5/i;", "size", "b", "(Ln5/i;)Z", "a", "()Z", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: r5.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16853q implements InterfaceC16851o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean allowHardware;

    @Override // r5.InterfaceC16851o
    /* renamed from: a, reason: from getter */
    public boolean getAllowHardware() {
        return this.allowHardware;
    }

    @Override // r5.InterfaceC16851o
    public boolean b(Size size) {
        return this.allowHardware;
    }

    public C16853q(boolean z10) {
        this.allowHardware = z10;
    }
}
