package wa;

import ha.InterfaceC14492c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lwa/k;", "Ljava/lang/Runnable;", "Lha/c;", "eventServiceInternal", "", "buttonId", "sid", "<init>", "(Lha/c;Ljava/lang/String;Ljava/lang/String;)V", "", "run", "()V", "a", "Lha/c;", "b", "Ljava/lang/String;", "c", "getSid", "()Ljava/lang/String;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14492c eventServiceInternal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String buttonId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String sid;

    public k(InterfaceC14492c eventServiceInternal, String buttonId, String sid) {
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(buttonId, "buttonId");
        Intrinsics.j(sid, "sid");
        this.eventServiceInternal = eventServiceInternal;
        this.buttonId = buttonId;
        this.sid = sid;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashMap map = new HashMap();
        map.put("button_id", this.buttonId);
        map.put("origin", "button");
        map.put("sid", this.sid);
        this.eventServiceInternal.e("push:click", map, null);
    }
}
