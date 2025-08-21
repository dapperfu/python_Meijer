package K5;

import com.adobe.marketing.mobile.C6576j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u001d\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adobe/marketing/mobile/j;", "", "latestEventOccurrence", "c", "(Lcom/adobe/marketing/mobile/j;Ljava/lang/Long;)J", "d", "(Lcom/adobe/marketing/mobile/j;)J", "adjustedToDate", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(C6576j c6576j, Long l10) {
        return l10 == null ? c6576j.a() : Math.max(l10.longValue(), c6576j.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(C6576j c6576j) {
        if (c6576j.c() == 0) {
            return System.currentTimeMillis();
        }
        return c6576j.c();
    }
}
