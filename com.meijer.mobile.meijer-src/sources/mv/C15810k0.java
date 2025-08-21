package mv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lmv/k0;", "Lmv/x0;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "Lmv/M0;", "c", "()Lmv/M0;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.k0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15810k0 implements InterfaceC15836x0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    @Override // mv.InterfaceC15836x0
    public M0 c() {
        return null;
    }

    @Override // mv.InterfaceC15836x0
    /* renamed from: a, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(getIsActive() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }

    public C15810k0(boolean z10) {
        this.isActive = z10;
    }
}
