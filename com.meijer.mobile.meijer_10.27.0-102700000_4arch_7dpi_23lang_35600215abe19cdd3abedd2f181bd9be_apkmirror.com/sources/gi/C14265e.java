package gi;

import Dk.n;
import Tq.j;
import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.C14483j;
import hi.TrackingData;
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

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001*B:\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\u0010\u000b\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0006¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0014\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J;\u0010\u0017\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ0\u0010\"\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0004\b\"\u0010#J0\u0010$\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R3\u0010\u000b\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00180\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00106R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lgi/e;", "Lgi/a;", "LCs/b;", "userProvider", "LTq/j;", "storeProvider", "", "Ljava/lang/Class;", "Lhi/f$a;", "Lgi/f;", "Lkotlin/jvm/JvmSuppressWildcards;", "analyticsServices", "<init>", "(LCs/b;LTq/j;Ljava/util/Map;)V", "", "targets", "", "actionValue", "extraData", "", "t", "(Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;)V", "stateValue", "u", "Lhi/f;", "trackingData", "d", "(Lhi/f;)V", "g", "Lhi/h;", "event", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "builder", "i", "(Lhi/h;Lkotlin/jvm/functions/Function1;)V", "f", "j", "(Lhi/h;)V", "timeFormat", "k", "(Ljava/lang/String;)V", "a", "LCs/b;", "b", "LTq/j;", "c", "Ljava/util/Map;", "p", "()Ljava/util/Map;", "LDk/n;", "LDk/n;", "stagedEventStore", "e", "Ljava/lang/String;", "previousTrackState", "", "Lhi/i;", "q", "()Ljava/util/List;", "defaultTrackingItems", "engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gi.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C14265e implements InterfaceC14261a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Class<? extends TrackingData.a>, InterfaceC14266f> analyticsServices;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n<Map<AbstractC14481h, TrackingData>> stagedEventStore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String timeFormat;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String previousTrackState;

    public C14265e(Cs.b userProvider, j storeProvider, Map<Class<? extends TrackingData.a>, InterfaceC14266f> analyticsServices) {
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
    public static final Map o(AbstractC14481h abstractC14481h, Map events) {
        Intrinsics.j(events, "events");
        return MapsKt.q(events, abstractC14481h);
    }

    private final List<AbstractC14482i> q() {
        AbstractC14482i.Extra extraB = C14476c.b("digitalId", String.valueOf(this.userProvider.c()));
        String strA = this.userProvider.a();
        if (strA == null || StringsKt.r0(strA)) {
            strA = null;
        }
        return CollectionsKt.p(extraB, C14476c.b("externalShopperId", strA), C14476c.b("authentication status", this.userProvider.c() == 0 ? "unauthenticated" : "authenticated"), C14476c.b("currentStoreId", String.valueOf(this.storeProvider.g())), C14476c.b("homeStoreId", String.valueOf(this.storeProvider.b())), C14476c.b("language", Locale.getDefault().toLanguageTag()), C14476c.b("timeFormat", this.timeFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map r(AbstractC14481h abstractC14481h, Function1 function1, Map events) {
        TrackingData trackingData;
        Intrinsics.j(events, "events");
        TrackingData trackingData2 = (TrackingData) events.get(abstractC14481h);
        if (trackingData2 == null || (trackingData = TrackingData.g(trackingData2, null, null, 3, null)) == null) {
            trackingData = new TrackingData(abstractC14481h, null, 2, null);
        }
        function1.invoke(trackingData);
        return MapsKt.v(events, TuplesKt.a(abstractC14481h, TrackingData.g(trackingData, null, null, 3, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map s(AbstractC14481h abstractC14481h, Function1 function1, C14265e c14265e, Map events) {
        TrackingData trackingData;
        Intrinsics.j(events, "events");
        TrackingData trackingData2 = (TrackingData) events.get(abstractC14481h);
        if (trackingData2 == null || (trackingData = TrackingData.g(trackingData2, null, null, 3, null)) == null) {
            trackingData = new TrackingData(abstractC14481h, null, 2, null);
        }
        function1.invoke(trackingData);
        c14265e.e(trackingData);
        return MapsKt.v(events, TuplesKt.a(abstractC14481h, TrackingData.g(trackingData, null, null, 3, null)));
    }

    private final void t(Set<? extends TrackingData.a> targets, String actionValue, Map<String, String> extraData) {
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            InterfaceC14266f interfaceC14266f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14266f != null) {
                interfaceC14266f.b(actionValue, extraData);
            }
        }
    }

    @Override // gi.InterfaceC14261a
    public void d(TrackingData trackingData) {
        Intrinsics.j(trackingData, "trackingData");
        AbstractC14481h event = trackingData.getEvent();
        if (event instanceof AbstractC14481h.Action) {
            t(SetsKt.m(trackingData.l(), TrackingData.a.b.f135065a), trackingData.getEvent().getValue(), C14483j.c(C14483j.a(C14483j.b(trackingData.i(), C14476c.f(this.previousTrackState)), q())));
        } else {
            if (!(event instanceof AbstractC14481h.State)) {
                throw new NoWhenBranchMatchedException();
            }
            u(trackingData.l(), trackingData.getEvent().getValue(), C14483j.c(C14483j.a(C14483j.b(trackingData.i(), C14476c.f(this.previousTrackState)), q())));
        }
    }

    @Override // gi.InterfaceC14261a
    public void f(final AbstractC14481h event, final Function1<? super TrackingData, Unit> builder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(builder, "builder");
        this.stagedEventStore.a(new Function1() { // from class: gi.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14265e.s(event, builder, this, (Map) obj);
            }
        });
    }

    @Override // gi.InterfaceC14261a
    public void g(TrackingData trackingData) {
        Intrinsics.j(trackingData, "trackingData");
        Iterator<T> it = trackingData.l().iterator();
        while (it.hasNext()) {
            InterfaceC14266f interfaceC14266f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14266f != null) {
                interfaceC14266f.c(C14483j.c(trackingData.i()));
            }
        }
    }

    @Override // gi.InterfaceC14261a
    public void i(final AbstractC14481h event, final Function1<? super TrackingData, Unit> builder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(builder, "builder");
        this.stagedEventStore.a(new Function1() { // from class: gi.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14265e.r(event, builder, (Map) obj);
            }
        });
    }

    @Override // gi.InterfaceC14261a
    public void j(final AbstractC14481h event) {
        Intrinsics.j(event, "event");
        this.stagedEventStore.a(new Function1() { // from class: gi.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14265e.o(event, (Map) obj);
            }
        });
    }

    @Override // gi.InterfaceC14261a
    public void k(String timeFormat) {
        Intrinsics.j(timeFormat, "timeFormat");
        this.timeFormat = timeFormat;
    }

    protected Map<Class<? extends TrackingData.a>, InterfaceC14266f> p() {
        return this.analyticsServices;
    }

    private final void u(Set<? extends TrackingData.a> targets, String stateValue, Map<String, String> extraData) {
        Map<String, String> mapD = MapsKt.D(extraData);
        String strD = this.userProvider.d();
        if (strD != null) {
            if (StringsKt.r0(strD)) {
                strD = null;
            }
            if (strD != null) {
                mapD.put("cmpid", strD);
                this.userProvider.f();
            }
        }
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            InterfaceC14266f interfaceC14266f = p().get(((TrackingData.a) it.next()).getClass());
            if (interfaceC14266f != null) {
                interfaceC14266f.a(stateValue, mapD);
            }
        }
        synchronized (this.previousTrackState) {
            this.previousTrackState = stateValue;
            Unit unit = Unit.f142422a;
        }
    }
}
