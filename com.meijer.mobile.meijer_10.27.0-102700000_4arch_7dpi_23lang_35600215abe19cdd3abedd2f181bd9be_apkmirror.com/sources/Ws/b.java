package Ws;

import at.InterfaceC6153a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LWs/b;", "Lat/a;", "", "tokenId", "", "deleteInvalidatedToken", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "getTokenId", "()Ljava/lang/String;", "b", "Z", "()Z", "setDeleteInvalidatedToken", "(Z)V", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC6153a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tokenId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean deleteInvalidatedToken;

    public b(String tokenId, boolean z10) {
        Intrinsics.j(tokenId, "tokenId");
        this.tokenId = tokenId;
        this.deleteInvalidatedToken = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDeleteInvalidatedToken() {
        return this.deleteInvalidatedToken;
    }

    public /* synthetic */ b(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
