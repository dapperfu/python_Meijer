package wv;

import kotlin.Metadata;
import rv.C16950E;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "locked", "Lwv/a;", "a", "(Z)Lwv/a;", "Lrv/E;", "Lrv/E;", "NO_OWNER", "b", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final C16950E f167651a = new C16950E("NO_OWNER");

    /* renamed from: b, reason: collision with root package name */
    private static final C16950E f167652b = new C16950E("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC17929a a(boolean z10) {
        return new f(z10);
    }

    public static /* synthetic */ InterfaceC17929a b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }
}
