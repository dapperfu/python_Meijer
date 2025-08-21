package com.adobe.marketing.mobile.assurance.internal;

import com.adobe.marketing.mobile.InterfaceC6543a;
import g6.C14333f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000f\u000b\u0011B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0011\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/L;", "", "Lcom/adobe/marketing/mobile/assurance/internal/L$b;", "listener", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/L$b;)V", "Lg6/f;", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "workDispatcher", "(Lg6/f;)V", "", "b", "()V", "event", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/l;)Z", "c", "Lg6/f;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14333f<C6555l> workDispatcher;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/L$b;", "", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "event", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/l;)V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {
        void a(C6555l event);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/L$c;", "Lg6/f$c;", "Lcom/adobe/marketing/mobile/assurance/internal/l;", "Lcom/adobe/marketing/mobile/assurance/internal/J;", "eventStitcher", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/J;)V", "item", "", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/l;)Z", "a", "Lcom/adobe/marketing/mobile/assurance/internal/J;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements C14333f.c<C6555l> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final J eventStitcher;

        public c(J eventStitcher) {
            Intrinsics.j(eventStitcher, "eventStitcher");
            this.eventStitcher = eventStitcher;
        }

        @Override // g6.C14333f.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(C6555l item) {
            Intrinsics.j(item, "item");
            if (J.INSTANCE.a(item) || item.b() != null) {
                try {
                    this.eventStitcher.a(item);
                } catch (Exception e10) {
                    R5.t.a("Assurance", "InboundEventQueueWorker", "Error while processing inbound event", e10.getLocalizedMessage());
                }
                return true;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str = String.format("Received a nonControl Assurance event.Ignoring processing of the inbound event - %s", Arrays.copyOf(new Object[]{item.toString()}, 1));
            Intrinsics.i(str, "format(format, *args)");
            R5.t.f("Assurance", "InboundEventQueueWorker", str, new Object[0]);
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public L(final b listener) {
        this((C14333f<C6555l>) new C14333f("InboundEventQueueWorker", new c(new J(new InterfaceC6543a() { // from class: com.adobe.marketing.mobile.assurance.internal.K
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                listener.a((C6555l) obj);
            }
        }))));
        Intrinsics.j(listener, "listener");
    }

    public final boolean a(C6555l event) {
        Intrinsics.j(event, "event");
        if (this.workDispatcher.getState() != C14333f.b.SHUTDOWN) {
            return this.workDispatcher.o(event);
        }
        R5.t.e("Assurance", "InboundEventQueueWorker", "Cannot queue event. Work dispatcher was shutdown.", new Object[0]);
        return false;
    }

    public final void b() {
        C14333f.b bVarK = this.workDispatcher.getState();
        if (bVarK == C14333f.b.NOT_STARTED) {
            this.workDispatcher.x();
            return;
        }
        R5.t.e("Assurance", "InboundEventQueueWorker", "Work dispatcher was already started and is in " + bVarK + " state.", new Object[0]);
    }

    public final void c() {
        this.workDispatcher.w();
    }

    public L(C14333f<C6555l> workDispatcher) {
        Intrinsics.j(workDispatcher, "workDispatcher");
        this.workDispatcher = workDispatcher;
    }
}
