package J5;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.C6451j;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.InterfaceC6443b;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\b\u0010\tJ;\u0010\u000f\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LJ5/f;", "", "Lcom/adobe/marketing/mobile/h;", "event", "Lcom/adobe/marketing/mobile/b;", "", "callback", "", "b", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/b;)V", "", "Lcom/adobe/marketing/mobile/j;", "eventHistoryRequests", "enforceOrder", "Lcom/adobe/marketing/mobile/k;", "a", "([Lcom/adobe/marketing/mobile/j;ZLcom/adobe/marketing/mobile/b;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface f {
    void a(C6451j[] eventHistoryRequests, boolean enforceOrder, InterfaceC6443b<EventHistoryResult[]> callback);

    void b(C6449h event, InterfaceC6443b<Boolean> callback);
}
