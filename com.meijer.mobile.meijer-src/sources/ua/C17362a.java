package ua;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lua/a;", "", "Ln9/b;", "concurrentHandlerHolder", "Ly9/b;", "requestManager", "Lya/c;", "mobileEngageRequestModelFactory", "Lua/c;", "messageInboxResponseMapper", "<init>", "(Ln9/b;Ly9/b;Lya/c;Lua/c;)V", "a", "Ln9/b;", "b", "Ly9/b;", "c", "Lya/c;", "d", "Lua/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ua.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17362a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ya.c mobileEngageRequestModelFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17364c messageInboxResponseMapper;

    public C17362a(n9.b concurrentHandlerHolder, y9.b requestManager, ya.c mobileEngageRequestModelFactory, C17364c messageInboxResponseMapper) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(mobileEngageRequestModelFactory, "mobileEngageRequestModelFactory");
        Intrinsics.j(messageInboxResponseMapper, "messageInboxResponseMapper");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.requestManager = requestManager;
        this.mobileEngageRequestModelFactory = mobileEngageRequestModelFactory;
        this.messageInboxResponseMapper = messageInboxResponseMapper;
    }
}
