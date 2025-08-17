package qr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lqr/a;", "", "LCs/b;", "userProvider", "<init>", "(LCs/b;)V", "Lqr/b;", "a", "()Lqr/b;", "LCs/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16600a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    public C16600a(Cs.b userProvider) {
        Intrinsics.j(userProvider, "userProvider");
        this.userProvider = userProvider;
    }

    public final SubscriptionUserInfo a() {
        return new SubscriptionUserInfo(this.userProvider.h(), this.userProvider.b());
    }
}
