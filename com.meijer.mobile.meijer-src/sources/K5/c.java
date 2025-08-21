package K5;

import M5.k;
import R5.t;
import com.adobe.marketing.mobile.C6569c;
import com.adobe.marketing.mobile.C6574h;
import com.adobe.marketing.mobile.C6576j;
import com.adobe.marketing.mobile.EventHistoryResult;
import com.adobe.marketing.mobile.InterfaceC6568b;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0017\u001a\u00020\n2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR#\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"LK5/c;", "LK5/f;", "<init>", "()V", "T", "Lcom/adobe/marketing/mobile/b;", "handler", "value", "", "dbError", "", "g", "(Lcom/adobe/marketing/mobile/b;Ljava/lang/Object;Z)V", "Lcom/adobe/marketing/mobile/h;", "event", "callback", "b", "(Lcom/adobe/marketing/mobile/h;Lcom/adobe/marketing/mobile/b;)V", "", "Lcom/adobe/marketing/mobile/j;", "eventHistoryRequests", "enforceOrder", "Lcom/adobe/marketing/mobile/k;", "a", "([Lcom/adobe/marketing/mobile/j;ZLcom/adobe/marketing/mobile/b;)V", "LK5/d;", "LK5/d;", "androidEventHistoryDatabase", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "f", "()Ljava/util/concurrent/ExecutorService;", "executor", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d androidEventHistoryDatabase = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy executor = LazyKt.b(b.f16290f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function0<ExecutorService> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f16290f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C6576j[] eventHistoryRequests, c this$0, InterfaceC6568b callback, boolean z10) {
        Intrinsics.j(eventHistoryRequests, "$eventHistoryRequests");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(callback, "$callback");
        ArrayList arrayList = new ArrayList();
        Long l10 = null;
        boolean z11 = false;
        int i10 = 0;
        for (C6576j c6576j : eventHistoryRequests) {
            i10++;
            long jB = c6576j.b();
            long jC = z10 ? e.c(c6576j, l10) : c6576j.a();
            EventHistoryResult eventHistoryResultE = this$0.androidEventHistoryDatabase.e(jB, jC, e.d(c6576j));
            t.e("MobileCore", "AndroidEventHistory", "EventHistoryRequest[%d] - (%d of %d) for hash(%d) from %d to %d with enforceOrder (%s) returned %d events", Integer.valueOf(eventHistoryRequests.hashCode()), Integer.valueOf(i10), Integer.valueOf(eventHistoryRequests.length), Long.valueOf(jB), Long.valueOf(jC), Long.valueOf(e.d(c6576j)), z10 ? "true" : "false", Integer.valueOf(eventHistoryResultE.count));
            if (z10) {
                if (eventHistoryResultE.count == -1) {
                    z11 = true;
                }
                l10 = eventHistoryResultE.oldestOccurrence;
            }
            arrayList.add(eventHistoryResultE);
        }
        this$0.g(callback, arrayList.toArray(new EventHistoryResult[0]), z11);
    }

    private final ExecutorService f() {
        return (ExecutorService) this.executor.getValue();
    }

    private final <T> void g(InterfaceC6568b<T> handler, T value, boolean dbError) {
        try {
            if (dbError) {
                if (handler != null) {
                    handler.b(C6569c.f63218j);
                }
            } else if (handler != null) {
                handler.a(value);
            }
        } catch (Exception e10) {
            t.a("MobileCore", "AndroidEventHistory", "Exception executing event history AdobeCallbackWithError " + e10, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(C6574h event, c this$0, InterfaceC6568b interfaceC6568b) {
        Intrinsics.j(event, "$event");
        Intrinsics.j(this$0, "this$0");
        long jA = k.a(event.o(), event.p());
        t.a("MobileCore", "AndroidEventHistory", "%s hash(" + jA + ") for Event(" + event.x() + ')', jA == 0 ? "Not Recording" : "Recording");
        boolean zB = jA != 0 ? this$0.androidEventHistoryDatabase.b(jA, event.u()) : false;
        this$0.g(interfaceC6568b, Boolean.valueOf(zB), !zB);
    }

    @Override // K5.f
    public void a(final C6576j[] eventHistoryRequests, final boolean enforceOrder, final InterfaceC6568b<EventHistoryResult[]> callback) {
        Intrinsics.j(eventHistoryRequests, "eventHistoryRequests");
        Intrinsics.j(callback, "callback");
        f().submit(new Runnable() { // from class: K5.a
            @Override // java.lang.Runnable
            public final void run() {
                c.e(eventHistoryRequests, this, callback, enforceOrder);
            }
        });
    }

    @Override // K5.f
    public void b(final C6574h event, final InterfaceC6568b<Boolean> callback) {
        Intrinsics.j(event, "event");
        f().submit(new Runnable() { // from class: K5.b
            @Override // java.lang.Runnable
            public final void run() {
                c.h(event, this, callback);
            }
        });
    }
}
