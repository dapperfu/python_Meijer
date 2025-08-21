package Ws;

import at.InterfaceC6294a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LWs/h;", "Lat/a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "shouldClearStorageAndTryAgain", "<init>", "(Ljava/lang/Exception;Z)V", "a", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "b", "Z", "()Z", "setShouldClearStorageAndTryAgain", "(Z)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements InterfaceC6294a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Exception exception;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean shouldClearStorageAndTryAgain;

    public h(Exception exception, boolean z10) {
        Intrinsics.j(exception, "exception");
        this.exception = exception;
        this.shouldClearStorageAndTryAgain = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getShouldClearStorageAndTryAgain() {
        return this.shouldClearStorageAndTryAgain;
    }
}
