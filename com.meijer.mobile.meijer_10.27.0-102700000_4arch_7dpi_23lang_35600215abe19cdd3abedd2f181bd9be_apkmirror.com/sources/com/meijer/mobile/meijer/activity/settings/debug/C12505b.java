package com.meijer.mobile.meijer.activity.settings.debug;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import yl.AbstractC18227f;
import yl.AbstractC18253g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u001d8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\"¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "", "Lyl/k;", "featureManager", "<init>", "(Lyl/k;)V", "", "searchTerm", "", "d", "(Ljava/lang/String;)V", "Lyl/f;", "feature", "Lyl/g;", "state", "c", "(Lyl/f;Lyl/g;)V", "a", "Lyl/k;", "", "b", "Ljava/util/List;", "allFeatures", "Ltv/B;", "Ltv/B;", "_availableFeatures", "j$/time/Instant", "kotlin.jvm.PlatformType", "_stateUpdates", "Ltv/f;", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "e", "Ltv/f;", "_flagFlow", "()Ltv/f;", "flagFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12505b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC18227f> allFeatures;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<List<AbstractC18227f>> _availableFeatures;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Instant> _stateUpdates;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<List<DebugFeatureFlag>> _flagFlow;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "", "Lyl/f;", "feature", "Lyl/g;", "state", "", "isEnabled", "<init>", "(Lyl/f;Lyl/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyl/f;", "()Lyl/f;", "b", "Lyl/g;", "()Lyl/g;", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$a, reason: from toString */
    public static final /* data */ class DebugFeatureFlag {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18227f feature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18253g state;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isEnabled;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DebugFeatureFlag)) {
                return false;
            }
            DebugFeatureFlag debugFeatureFlag = (DebugFeatureFlag) other;
            return Intrinsics.e(this.feature, debugFeatureFlag.feature) && Intrinsics.e(this.state, debugFeatureFlag.state) && this.isEnabled == debugFeatureFlag.isEnabled;
        }

        public int hashCode() {
            return (((this.feature.hashCode() * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isEnabled);
        }

        public String toString() {
            return "DebugFeatureFlag(feature=" + this.feature + ", state=" + this.state + ", isEnabled=" + this.isEnabled + ')';
        }

        public DebugFeatureFlag(AbstractC18227f feature, AbstractC18253g state, boolean z10) {
            Intrinsics.j(feature, "feature");
            Intrinsics.j(state, "state");
            this.feature = feature;
            this.state = state;
            this.isEnabled = z10;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC18227f getFeature() {
            return this.feature;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC18253g getState() {
            return this.state;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lyl/f;", "features", "j$/time/Instant", "kotlin.jvm.PlatformType", "<unused var>", "<anonymous>", "(Ljava/util/List;Lj$/time/Instant;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugFlagsProvider$_flagFlow$1", f = "DebugFlagsProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$b, reason: collision with other inner class name */
    static final class C1775b extends SuspendLambda implements Function3<List<? extends AbstractC18227f>, Instant, Continuation<? super List<? extends AbstractC18227f>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112144a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112145b;

        C1775b(Continuation<? super C1775b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC18227f> list, Instant instant, Continuation<? super List<? extends AbstractC18227f>> continuation) {
            C1775b c1775b = new C1775b(continuation);
            c1775b.f112145b = list;
            return c1775b.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112144a == 0) {
                ResultKt.b(obj);
                return (List) this.f112145b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lyl/f;", "features", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugFlagsProvider$_flagFlow$2", f = "DebugFlagsProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$c */
    static final class c extends SuspendLambda implements Function2<List<? extends AbstractC18227f>, Continuation<? super List<? extends DebugFeatureFlag>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112146a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f112147b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C12505b.this.new c(continuation);
            cVar.f112147b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC18227f> list, Continuation<? super List<DebugFeatureFlag>> continuation) {
            return ((c) create(list, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112146a == 0) {
                ResultKt.b(obj);
                List<AbstractC18227f> list = (List) this.f112147b;
                C12505b c12505b = C12505b.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (AbstractC18227f abstractC18227f : list) {
                    arrayList.add(new DebugFeatureFlag(abstractC18227f, c12505b.featureManager.a(abstractC18227f), c12505b.featureManager.e(abstractC18227f)));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12505b(yl.k featureManager) {
        Intrinsics.j(featureManager, "featureManager");
        this.featureManager = featureManager;
        List<AbstractC18227f> listP = CollectionsKt.p(AbstractC18227f.r0.f170599h, AbstractC18227f.i0.f170583h, AbstractC18227f.y0.f170615h, AbstractC18227f.C18231d.f170572h, AbstractC18227f.Q.f170556h, AbstractC18227f.j0.f170585h, AbstractC18227f.C18247u.f170606h, AbstractC18227f.C18238l.f170588h, AbstractC18227f.p0.f170595h, AbstractC18227f.o0.f170593h, AbstractC18227f.e0.f170575h, AbstractC18227f.F.f170546h, AbstractC18227f.C18240n.f170591h, AbstractC18227f.C18241o.f170592h, AbstractC18227f.B.f170543h, AbstractC18227f.A.f170542h, AbstractC18227f.T.f170559h, AbstractC18227f.C18243q.f170596h, AbstractC18227f.C18236j.f170584h, AbstractC18227f.C18232e.f170574h, AbstractC18227f.H.f170547h, AbstractC18227f.d0.f170573h, AbstractC18227f.c0.f170571h, AbstractC18227f.J.f170549h, AbstractC18227f.I.f170548h, AbstractC18227f.N.f170553h, AbstractC18227f.O.f170554h, AbstractC18227f.C18228a.f170566h, AbstractC18227f.C18229b.f170568h, AbstractC18227f.C18230c.f170570h, AbstractC18227f.P.f170555h, AbstractC18227f.M.f170552h, AbstractC18227f.t0.f170605h, AbstractC18227f.S.f170558h, AbstractC18227f.U.f170560h, AbstractC18227f.C18233g.f170578h, AbstractC18227f.X.f170563h, AbstractC18227f.q0.f170597h, AbstractC18227f.C18235i.f170582h, AbstractC18227f.R.f170557h, AbstractC18227f.C18248v.f170608h, AbstractC18227f.C18249w.f170610h, AbstractC18227f.C2748f.f170576h, AbstractC18227f.C18242p.f170594h, AbstractC18227f.C.f170544h, AbstractC18227f.C18252z.f170616h, AbstractC18227f.V.f170561h, AbstractC18227f.g0.f170579h, AbstractC18227f.k0.f170587h, AbstractC18227f.l0.f170589h, AbstractC18227f.C18237k.f170586h, AbstractC18227f.W.f170562h, AbstractC18227f.C18239m.f170590h, AbstractC18227f.C18245s.f170602h, AbstractC18227f.w0.f170611h, AbstractC18227f.s0.f170603h, AbstractC18227f.x0.f170613h, AbstractC18227f.C18246t.f170604h, AbstractC18227f.Y.f170564h, AbstractC18227f.f0.f170577h, AbstractC18227f.C18234h.f170580h, AbstractC18227f.L.f170551h, AbstractC18227f.K.f170550h, AbstractC18227f.b0.f170569h, AbstractC18227f.Z.f170565h, AbstractC18227f.C18251y.f170614h, AbstractC18227f.h0.f170581h, AbstractC18227f.a0.f170567h, AbstractC18227f.C18250x.f170612h, AbstractC18227f.u0.f170607h);
        this.allFeatures = listP;
        InterfaceC17140B<List<AbstractC18227f>> interfaceC17140BA = tv.S.a(listP);
        this._availableFeatures = interfaceC17140BA;
        InterfaceC17140B<Instant> interfaceC17140BA2 = tv.S.a(Instant.MIN);
        this._stateUpdates = interfaceC17140BA2;
        this._flagFlow = C17154h.K(C17154h.F(interfaceC17140BA, interfaceC17140BA2, new C1775b(null)), new c(null));
    }

    public final InterfaceC17152f<List<DebugFeatureFlag>> b() {
        return this._flagFlow;
    }

    public final void c(AbstractC18227f feature, AbstractC18253g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        this.featureManager.g(feature, state);
        InterfaceC17140B<Instant> interfaceC17140B = this._stateUpdates;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), Instant.now())) {
        }
    }

    public final void d(String searchTerm) {
        List<AbstractC18227f> value;
        ArrayList arrayList;
        Intrinsics.j(searchTerm, "searchTerm");
        InterfaceC17140B<List<AbstractC18227f>> interfaceC17140B = this._availableFeatures;
        do {
            value = interfaceC17140B.getValue();
            List<AbstractC18227f> list = this.allFeatures;
            arrayList = new ArrayList();
            for (Object obj : list) {
                AbstractC18227f abstractC18227f = (AbstractC18227f) obj;
                List listP = CollectionsKt.p(abstractC18227f.getTitle(), abstractC18227f.getDescription(), abstractC18227f.getRemoteId(), abstractC18227f.getInternalId());
                if (!(listP instanceof Collection) || !listP.isEmpty()) {
                    Iterator it = listP.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (str != null && StringsKt.a0(str, searchTerm, true)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        } while (!interfaceC17140B.e(value, arrayList));
    }
}
