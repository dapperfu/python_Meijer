package ka;

import fa.InterfaceC13862c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lka/e;", "Lka/a;", "Ll9/b;", "concurrentHandlerHolder", "Lfa/c;", "eventServiceInternal", "<init>", "(Ll9/b;Lfa/c;)V", "", "campaignId", "sid", "url", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ll9/b;", "b", "Lfa/c;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements InterfaceC15126a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13862c eventServiceInternal;

    public e(l9.b concurrentHandlerHolder, InterfaceC13862c eventServiceInternal) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.eventServiceInternal = eventServiceInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, String str2, String str3, e eVar) {
        HashMap map = new HashMap();
        map.put("campaignId", str);
        if (str2 != null) {
            map.put("sid", str2);
        }
        if (str3 != null) {
            map.put("url", str3);
        }
        eVar.eventServiceInternal.d("inapp:viewed", map, null);
    }

    @Override // ka.InterfaceC15126a
    public void a(final String campaignId, final String sid, final String url) {
        Intrinsics.j(campaignId, "campaignId");
        G9.b.c(campaignId, "CampaignId must not be null!");
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: ka.d
            @Override // java.lang.Runnable
            public final void run() {
                e.c(campaignId, sid, url, this);
            }
        });
    }
}
