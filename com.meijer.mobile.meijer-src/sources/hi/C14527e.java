package hi;

import Ek.n;
import Tq.j;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.C14763j;
import ii.TrackingData;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0001*B:\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\u0010\u000b\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0006¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0014\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0017\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ0\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0004\b\"\u0010#J0\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R3\u0010\u000b\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b/\u00100R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u0006018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00105R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u000208078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lhi/e;", "Lhi/a;", "LCs/b;", "userProvider", "LTq/j;", "storeProvider", "", "Ljava/lang/Class;", "Lii/f$a;", "Lhi/f;", "Lkotlin/jvm/JvmSuppressWildcards;", "analyticsServices", "<init>", "(LCs/b;LTq/j;Ljava/util/Map;)V", "", "targets", "", "actionValue", "extraData", "", "t", "(Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;)V", "stateValue", "u", "Lii/f;", "trackingData", "f", "(Lii/f;)V", "i", "Lii/h;", "event", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "builder", "g", "(Lii/h;Lkotlin/jvm/functions/Function1;)V", "c", "d", "(Lii/h;)V", "timeFormat", "j", "(Ljava/lang/String;)V", "a", "LCs/b;", "b", "LTq/j;", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "LEk/n;", "LEk/n;", "stagedEventStore", "e", "Ljava/lang/String;", "previousTrackState", "", "Lii/i;", "q", "()Ljava/util/List;", "defaultTrackingItems", "engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hi.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14527e implements InterfaceC14523a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<? extends TrackingData.a>, InterfaceC14528f> analyticsServices;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n<Map<AbstractC14761h, TrackingData>> stagedEventStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String timeFormat;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String previousTrackState;

    public C14527e(Cs.b userProvider, j storeProvider, Map<Class<? extends TrackingData.a>, InterfaceC14528f> analyticsServices) {
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(analyticsServices, "analyticsServices");
        this.userProvider = userProvider;
        this.storeProvider = storeProvider;
        this.analyticsServices = analyticsServices;
        this.stagedEventStore = new n<>(MapsKt.k());
        this.timeFormat = "";
        this.previousTrackState = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map o(AbstractC14761h abstractC14761h, Map events) {
        Intrinsics.j(events, "events");
        return MapsKt.q(events, abstractC14761h);
    }

    private final List<AbstractC14762i> q() {
        AbstractC14762i.Extra extraB = C14756c.b("digitalId", String.valueOf(this.userProvider.c()));
        String strA = this.userProvider.a();
        if (strA == null || StringsKt.s0(strA)) {
            strA = null;
        }
        return CollectionsKt.p(extraB, C14756c.b("externalShopperId", strA), C14756c.b("authentication status", this.userProvider.c() == 0 ? "unauthenticated" : "authenticated"), C14756c.b("currentStoreId", String.valueOf(this.storeProvider.g())), C14756c.b("homeStoreId", String.valueOf(this.storeProvider.b())), C14756c.b("language", Locale.getDefault().toLanguageTag()), C14756c.b("timeFormat", this.timeFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map r(AbstractC14761h abstractC14761h, Function1 function1, Map events) {
        TrackingData trackingData;
        Intrinsics.j(events, "events");
        TrackingData trackingData2 = (TrackingData) events.get(abstractC14761h);
        if (trackingData2 == null || (trackingData = TrackingData.g(trackingData2, null, null, 3, null)) == null) {
            trackingData = new TrackingData(abstractC14761h, null, 2, null);
        }
        function1.invoke(trackingData);
        return MapsKt.v(events, TuplesKt.a(abstractC14761h, TrackingData.g(trackingData, null, null, 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map s(AbstractC14761h abstractC14761h, Function1 function1, C14527e c14527e, Map events) {
        TrackingData trackingData;
        Intrinsics.j(events, "events");
        TrackingData trackingData2 = (TrackingData) events.get(abstractC14761h);
        if (trackingData2 == null || (trackingData = TrackingData.g(trackingData2, null, null, 3, null)) == null) {
            trackingData = new TrackingData(abstractC14761h, null, 2, null);
        }
        function1.invoke(trackingData);
        c14527e.k(trackingData);
        return MapsKt.v(events, TuplesKt.a(abstractC14761h, TrackingData.g(trackingData, null, null, 3, null)));
    }

    private final void t(Set<? extends TrackingData.a> targets, String actionValue, Map<String, String> extraData) {
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            InterfaceC14528f interfaceC14528f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14528f != null) {
                interfaceC14528f.b(actionValue, extraData);
            }
        }
    }

    @Override // hi.InterfaceC14523a
    public void c(final AbstractC14761h event, final Function1<? super TrackingData, Unit> builder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(builder, "builder");
        this.stagedEventStore.a(new Function1() { // from class: hi.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14527e.s(event, builder, this, (Map) obj);
            }
        });
    }

    @Override // hi.InterfaceC14523a
    public void d(final AbstractC14761h event) {
        Intrinsics.j(event, "event");
        this.stagedEventStore.a(new Function1() { // from class: hi.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14527e.o(event, (Map) obj);
            }
        });
    }

    @Override // hi.InterfaceC14523a
    public void f(TrackingData trackingData) {
        Intrinsics.j(trackingData, "trackingData");
        AbstractC14761h event = trackingData.getEvent();
        if (event instanceof AbstractC14761h.Action) {
            t(SetsKt.m(trackingData.l(), TrackingData.a.b.f137705a), trackingData.getEvent().getValue(), C14763j.c(C14763j.a(C14763j.b(trackingData.i(), C14756c.f(this.previousTrackState)), q())));
        } else {
            if (!(event instanceof AbstractC14761h.State)) {
                throw new NoWhenBranchMatchedException();
            }
            u(trackingData.l(), trackingData.getEvent().getValue(), C14763j.c(C14763j.a(C14763j.b(trackingData.i(), C14756c.f(this.previousTrackState)), q())));
        }
    }

    @Override // hi.InterfaceC14523a
    public void g(final AbstractC14761h event, final Function1<? super TrackingData, Unit> builder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(builder, "builder");
        this.stagedEventStore.a(new Function1() { // from class: hi.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14527e.r(event, builder, (Map) obj);
            }
        });
    }

    @Override // hi.InterfaceC14523a
    public void i(TrackingData trackingData) {
        Intrinsics.j(trackingData, "trackingData");
        Iterator<T> it = trackingData.l().iterator();
        while (it.hasNext()) {
            InterfaceC14528f interfaceC14528f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14528f != null) {
                interfaceC14528f.c(C14763j.c(trackingData.i()));
            }
        }
    }

    @Override // hi.InterfaceC14523a
    public void j(String timeFormat) {
        Intrinsics.j(timeFormat, "timeFormat");
        this.timeFormat = timeFormat;
    }

    protected Map<Class<? extends TrackingData.a>, InterfaceC14528f> p() {
        return this.analyticsServices;
    }

    private final void u(Set<? extends TrackingData.a> targets, String stateValue, Map<String, String> extraData) {
        Map<String, String> mapD = MapsKt.D(extraData);
        String strD = this.userProvider.d();
        if (strD != null) {
            if (StringsKt.s0(strD)) {
                strD = null;
            }
            if (strD != null) {
                mapD.put("cmpid", strD);
                this.userProvider.f();
            }
        }
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            InterfaceC14528f interfaceC14528f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14528f != null) {
                interfaceC14528f.a(stateValue, mapD);
            }
        }
        synchronized (this.previousTrackState) {
            this.previousTrackState = stateValue;
            Unit unit = Unit.f143329a;
        }
    }
}
