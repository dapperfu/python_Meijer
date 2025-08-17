package qv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import vv.C17631E;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0012¨\u0006\u0015"}, d2 = {"", "g", "(Ljava/lang/Object;)Ljava/lang/Object;", "h", "Lvv/E;", "a", "Lvv/E;", "COMPLETING_ALREADY", "b", "COMPLETING_WAITING_CHILDREN", "c", "COMPLETING_RETRY", "d", "TOO_LATE_TO_CANCEL", "e", "SEALED", "Lqv/k0;", "f", "Lqv/k0;", "EMPTY_NEW", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C17631E f157595a = new C17631E("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final C17631E f157596b = new C17631E("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    private static final C17631E f157597c = new C17631E("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    private static final C17631E f157598d = new C17631E("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    private static final C17631E f157599e = new C17631E("SEALED");

    /* renamed from: f, reason: collision with root package name */
    private static final C16649k0 f157600f = new C16649k0(false);

    /* renamed from: g, reason: collision with root package name */
    private static final C16649k0 f157601g = new C16649k0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC16675x0 ? new C16677y0((InterfaceC16675x0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC16675x0 interfaceC16675x0;
        C16677y0 c16677y0 = obj instanceof C16677y0 ? (C16677y0) obj : null;
        return (c16677y0 == null || (interfaceC16675x0 = c16677y0.state) == null) ? obj : interfaceC16675x0;
    }
}
