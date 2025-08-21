package mv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import rv.C16950E;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lrv/E;", "a", "Lrv/E;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lmv/k0;", "f", "Lmv/k0;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C16950E f151669a = new C16950E("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final C16950E f151670b = new C16950E("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C16950E f151671c = new C16950E("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C16950E f151672d = new C16950E("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C16950E f151673e = new C16950E("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C15810k0 f151674f = new C15810k0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C15810k0 f151675g = new C15810k0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC15836x0 ? new C15838y0((InterfaceC15836x0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC15836x0 interfaceC15836x0;
        C15838y0 c15838y0 = obj instanceof C15838y0 ? (C15838y0) obj : null;
        return (c15838y0 == null || (interfaceC15836x0 = c15838y0.state) == null) ? obj : interfaceC15836x0;
    }
}
