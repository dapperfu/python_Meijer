package N5;

import R5.t;
import com.adobe.marketing.mobile.AbstractC6579m;
import com.adobe.marketing.mobile.C6569c;
import com.adobe.marketing.mobile.C6576j;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.InterfaceC6568b;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Lcom/adobe/marketing/mobile/j;", "requests", "", "searchType", "Lcom/adobe/marketing/mobile/m;", "extensionApi", "", "b", "(Ljava/util/List;Ljava/lang/String;Lcom/adobe/marketing/mobile/m;)I", "", "enforceOrder", "", "Lcom/adobe/marketing/mobile/k;", "eventHistoryResult", "a", "(Z[Lcom/adobe/marketing/mobile/k;)I", "c", "(Ljava/util/List;Lcom/adobe/marketing/mobile/m;)I", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"N5/a$a", "Lcom/adobe/marketing/mobile/b;", "", "Lcom/adobe/marketing/mobile/k;", "results", "", "c", "([Lcom/adobe/marketing/mobile/k;)V", "Lcom/adobe/marketing/mobile/c;", "error", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: N5.a$a, reason: collision with other inner class name */
    public static final class C0363a implements InterfaceC6568b<EventHistoryResult[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f20669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f20671c;

        C0363a(Ref.IntRef intRef, String str, CountDownLatch countDownLatch) {
            this.f20669a = intRef;
            this.f20670b = str;
            this.f20671c = countDownLatch;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6568b
        public void b(C6569c error) {
            Intrinsics.j(error, "error");
            t.f("LaunchRulesEngine", "historicalEventsQuerying", "Unable to retrieve historical events, caused by the error: " + error.b(), new Object[0]);
            this.f20669a.f143740a = -1;
            this.f20671c.countDown();
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6543a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(EventHistoryResult[] results) {
            Intrinsics.j(results, "results");
            this.f20669a.f143740a = a.a(Intrinsics.e(this.f20670b, "ordered"), results);
            this.f20671c.countDown();
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"N5/a$b", "Lcom/adobe/marketing/mobile/b;", "", "Lcom/adobe/marketing/mobile/k;", "results", "", "c", "([Lcom/adobe/marketing/mobile/k;)V", "Lcom/adobe/marketing/mobile/c;", "error", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements InterfaceC6568b<EventHistoryResult[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f20672a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f20673b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f20674c;

        b(Ref.IntRef intRef, Ref.LongRef longRef, CountDownLatch countDownLatch) {
            this.f20672a = intRef;
            this.f20673b = longRef;
            this.f20674c = countDownLatch;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6568b
        public void b(C6569c error) {
            Intrinsics.j(error, "error");
            t.f("LaunchRulesEngine", "historicalEventsQuerying", "Unable to retrieve most recent historical event, caused by the error: " + error.b(), new Object[0]);
            this.f20674c.countDown();
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6543a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(EventHistoryResult[] results) {
            Intrinsics.j(results, "results");
            int length = results.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                EventHistoryResult eventHistoryResult = results[i10];
                if (eventHistoryResult.count == -1) {
                    this.f20672a.f143740a = -1;
                    break;
                }
                Long l10 = eventHistoryResult.newestOccurrence;
                if (l10 != null) {
                    long jLongValue = l10.longValue();
                    Ref.LongRef longRef = this.f20673b;
                    if (jLongValue > longRef.f143741a) {
                        longRef.f143741a = eventHistoryResult.newestOccurrence.longValue();
                        this.f20672a.f143740a = i10;
                    }
                }
                i10++;
            }
            this.f20674c.countDown();
        }
    }

    public static final /* synthetic */ int a(boolean z10, EventHistoryResult[] eventHistoryResult) {
        Intrinsics.j(eventHistoryResult, "eventHistoryResult");
        if (!z10) {
            int i10 = 0;
            for (EventHistoryResult eventHistoryResult2 : eventHistoryResult) {
                int i11 = eventHistoryResult2.count;
                if (i11 == -1) {
                    return -1;
                }
                i10 += i11;
            }
            return i10;
        }
        for (EventHistoryResult eventHistoryResult3 : eventHistoryResult) {
            int i12 = eventHistoryResult3.count;
            if (i12 == -1) {
                return -1;
            }
            if (i12 == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static final /* synthetic */ int b(List requests2, String searchType, AbstractC6579m extensionApi) throws InterruptedException {
        Intrinsics.j(requests2, "requests");
        Intrinsics.j(searchType, "searchType");
        Intrinsics.j(extensionApi, "extensionApi");
        if (Intrinsics.e(searchType, "mostRecent")) {
            t.f("LaunchRulesEngine", "historicalEventsQuerying", "Unable to retrieve historical events, unsupported EventHistorySearchType 'mostRecent'", new Object[0]);
            return -1;
        }
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref.IntRef intRef = new Ref.IntRef();
            extensionApi.d((C6576j[]) requests2.toArray(new C6576j[0]), Intrinsics.e(searchType, "ordered"), new C0363a(intRef, searchType, countDownLatch));
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            return intRef.f143740a;
        } catch (Exception e10) {
            t.f("LaunchRulesEngine", "historicalEventsQuerying", "Unable to retrieve historical events, caused by the exception: " + e10.getLocalizedMessage(), new Object[0]);
            return -1;
        }
    }

    public static final /* synthetic */ int c(List requests2, AbstractC6579m extensionApi) throws InterruptedException {
        Intrinsics.j(requests2, "requests");
        Intrinsics.j(extensionApi, "extensionApi");
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.f143740a = -1;
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.f143741a = Long.MIN_VALUE;
            extensionApi.d((C6576j[]) requests2.toArray(new C6576j[0]), false, new b(intRef, longRef, countDownLatch));
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            return intRef.f143740a;
        } catch (Exception e10) {
            t.f("LaunchRulesEngine", "historicalEventsQuerying", "Unable to retrieve most recent historical event, caused by the exception: " + e10.getLocalizedMessage(), new Object[0]);
            return -1;
        }
    }
}
