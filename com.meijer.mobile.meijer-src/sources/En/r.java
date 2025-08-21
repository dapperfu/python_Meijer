package En;

import Cn.SplitAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tk.C17269a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0016¨\u0006\u0019"}, d2 = {"LEn/r;", "", "Lcom/meijer/mobile/meijer/activity/settings/a;", "listener", "LCn/e;", "addressEntered", "suggestedAddressInternalSplit", "<init>", "(Lcom/meijer/mobile/meijer/activity/settings/a;LCn/e;LCn/e;)V", "", "d", "()V", "c", "a", "Lcom/meijer/mobile/meijer/activity/settings/a;", "getListener", "()Lcom/meijer/mobile/meijer/activity/settings/a;", "setListener", "(Lcom/meijer/mobile/meijer/activity/settings/a;)V", "b", "LCn/e;", "", "()Ljava/lang/String;", "userAddress", "suggestedAddress", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.meijer.activity.settings.a listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SplitAddress addressEntered;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private SplitAddress suggestedAddressInternalSplit;

    public r(com.meijer.mobile.meijer.activity.settings.a listener, SplitAddress addressEntered, SplitAddress suggestedAddressInternalSplit) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(addressEntered, "addressEntered");
        Intrinsics.j(suggestedAddressInternalSplit, "suggestedAddressInternalSplit");
        this.listener = listener;
        this.addressEntered = addressEntered;
        this.suggestedAddressInternalSplit = suggestedAddressInternalSplit;
    }

    public final String a() {
        return C17269a.f163094a.d(this.suggestedAddressInternalSplit.getAddressLine1(), this.suggestedAddressInternalSplit.getAddressLine2(), this.suggestedAddressInternalSplit.getCity(), this.suggestedAddressInternalSplit.getState(), this.suggestedAddressInternalSplit.getZip());
    }

    public final String b() {
        return C17269a.f163094a.d(this.addressEntered.getAddressLine1(), this.addressEntered.getAddressLine2(), this.addressEntered.getCity(), this.addressEntered.getState(), this.addressEntered.getZip());
    }

    public final void c() {
        this.listener.l0(this.suggestedAddressInternalSplit, true);
    }

    public final void d() {
        this.listener.l0(this.addressEntered, false);
    }
}
