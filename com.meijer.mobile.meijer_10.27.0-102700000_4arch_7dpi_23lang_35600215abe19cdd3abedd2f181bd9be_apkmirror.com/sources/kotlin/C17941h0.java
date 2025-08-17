package kotlin;

import h0.C14322b;
import h0.n;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lx0/h0;", "", "<init>", "()V", "Lh0/i;", "interaction", "Lc0/i;", "LH1/h;", "a", "(Lh0/i;)Lc0/i;", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17941h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17941h0 f167926a = new C17941h0();

    public final InterfaceC6326i<H1.h> a(h0.i interaction) {
        if ((interaction instanceof n.b) || (interaction instanceof C14322b) || (interaction instanceof h0.g) || (interaction instanceof h0.d)) {
            return C17944i0.f167984a;
        }
        return null;
    }

    public final InterfaceC6326i<H1.h> b(h0.i interaction) {
        if (!(interaction instanceof n.b) && !(interaction instanceof C14322b)) {
            if (interaction instanceof h0.g) {
                return C17944i0.f167986c;
            }
            if (interaction instanceof h0.d) {
                return C17944i0.f167985b;
            }
            return null;
        }
        return C17944i0.f167985b;
    }

    private C17941h0() {
    }
}
