package ma;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qa.C16616a;
import u9.C17361a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lma/c;", "Lma/a;", "Ln9/b;", "concurrentHandlerHolder", "Lg9/c;", "Lqa/a;", "Lg9/d;", "repository", "Lu9/a;", "timestampProvider", "<init>", "(Ln9/b;Lg9/c;Lu9/a;)V", "", "campaignId", "sid", "url", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ln9/b;", "getConcurrentHandlerHolder", "()Ln9/b;", "setConcurrentHandlerHolder", "(Ln9/b;)V", "b", "Lg9/c;", "getRepository", "()Lg9/c;", "setRepository", "(Lg9/c;)V", "c", "Lu9/a;", "getTimestampProvider", "()Lu9/a;", "setTimestampProvider", "(Lu9/a;)V", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ma.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15699c implements InterfaceC15697a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private n9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private g9.c<C16616a, g9.d> repository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C17361a timestampProvider;

    public C15699c(n9.b concurrentHandlerHolder, g9.c<C16616a, g9.d> repository, C17361a timestampProvider) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(repository, "repository");
        Intrinsics.j(timestampProvider, "timestampProvider");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.repository = repository;
        this.timestampProvider = timestampProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, C15699c c15699c) {
        c15699c.repository.add(new C16616a(str, c15699c.timestampProvider.a()));
    }

    @Override // ma.InterfaceC15697a
    public void a(final String campaignId, String sid, String url) {
        Intrinsics.j(campaignId, "campaignId");
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ma.b
            @Override // java.lang.Runnable
            public final void run() {
                C15699c.c(campaignId, this);
            }
        });
    }
}
