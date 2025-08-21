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
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import zl.AbstractC18503f;
import zl.AbstractC18529g;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00130\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u001a0\u001a0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00130\u001d8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\"¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/b;", "", "Lzl/k;", "featureManager", "<init>", "(Lzl/k;)V", "", "searchTerm", "", "d", "(Ljava/lang/String;)V", "Lzl/f;", "feature", "Lzl/g;", "state", "c", "(Lzl/f;Lzl/g;)V", "a", "Lzl/k;", "", "b", "Ljava/util/List;", "allFeatures", "Lpv/B;", "Lpv/B;", "_availableFeatures", "j$/time/Instant", "kotlin.jvm.PlatformType", "_stateUpdates", "Lpv/f;", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "e", "Lpv/f;", "_flagFlow", "()Lpv/f;", "flagFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12631b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC18503f> allFeatures;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<AbstractC18503f>> _availableFeatures;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Instant> _stateUpdates;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16561f<List<DebugFeatureFlag>> _flagFlow;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "", "Lzl/f;", "feature", "Lzl/g;", "state", "", "isEnabled", "<init>", "(Lzl/f;Lzl/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lzl/f;", "()Lzl/f;", "b", "Lzl/g;", "()Lzl/g;", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$a, reason: from toString */
    public static final /* data */ class DebugFeatureFlag {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18503f feature;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18529g state;

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

        public DebugFeatureFlag(AbstractC18503f feature, AbstractC18529g state, boolean z10) {
            Intrinsics.j(feature, "feature");
            Intrinsics.j(state, "state");
            this.feature = feature;
            this.state = state;
            this.isEnabled = z10;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC18503f getFeature() {
            return this.feature;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC18529g getState() {
            return this.state;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lzl/f;", "features", "j$/time/Instant", "kotlin.jvm.PlatformType", "<unused var>", "<anonymous>", "(Ljava/util/List;Lj$/time/Instant;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugFlagsProvider$_flagFlow$1", f = "DebugFlagsProvider.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$b, reason: collision with other inner class name */
    static final class C1783b extends SuspendLambda implements Function3<List<? extends AbstractC18503f>, Instant, Continuation<? super List<? extends AbstractC18503f>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f112999a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f113000b;

        C1783b(Continuation<? super C1783b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC18503f> list, Instant instant, Continuation<? super List<? extends AbstractC18503f>> continuation) {
            C1783b c1783b = new C1783b(continuation);
            c1783b.f113000b = list;
            return c1783b.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f112999a == 0) {
                ResultKt.b(obj);
                return (List) this.f113000b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lzl/f;", "features", "Lcom/meijer/mobile/meijer/activity/settings/debug/b$a;", "<anonymous>", "(Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.settings.debug.DebugFlagsProvider$_flagFlow$2", f = "DebugFlagsProvider.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.settings.debug.b$c */
    static final class c extends SuspendLambda implements Function2<List<? extends AbstractC18503f>, Continuation<? super List<? extends DebugFeatureFlag>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f113001a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f113002b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C12631b.this.new c(continuation);
            cVar.f113002b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends AbstractC18503f> list, Continuation<? super List<DebugFeatureFlag>> continuation) {
            return ((c) create(list, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f113001a == 0) {
                ResultKt.b(obj);
                List<AbstractC18503f> list = (List) this.f113002b;
                C12631b c12631b = C12631b.this;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                for (AbstractC18503f abstractC18503f : list) {
                    arrayList.add(new DebugFeatureFlag(abstractC18503f, c12631b.featureManager.a(abstractC18503f), c12631b.featureManager.e(abstractC18503f)));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12631b(zl.k featureManager) {
        Intrinsics.j(featureManager, "featureManager");
        this.featureManager = featureManager;
        List<AbstractC18503f> listP = CollectionsKt.p(AbstractC18503f.r0.f172899h, AbstractC18503f.i0.f172883h, AbstractC18503f.y0.f172915h, AbstractC18503f.C18507d.f172872h, AbstractC18503f.Q.f172856h, AbstractC18503f.j0.f172885h, AbstractC18503f.C18523u.f172906h, AbstractC18503f.C18514l.f172888h, AbstractC18503f.p0.f172895h, AbstractC18503f.o0.f172893h, AbstractC18503f.e0.f172875h, AbstractC18503f.F.f172846h, AbstractC18503f.C18516n.f172891h, AbstractC18503f.C18517o.f172892h, AbstractC18503f.B.f172843h, AbstractC18503f.A.f172842h, AbstractC18503f.T.f172859h, AbstractC18503f.C18519q.f172896h, AbstractC18503f.C18512j.f172884h, AbstractC18503f.C18508e.f172874h, AbstractC18503f.H.f172847h, AbstractC18503f.d0.f172873h, AbstractC18503f.c0.f172871h, AbstractC18503f.J.f172849h, AbstractC18503f.I.f172848h, AbstractC18503f.N.f172853h, AbstractC18503f.O.f172854h, AbstractC18503f.C18504a.f172866h, AbstractC18503f.C18505b.f172868h, AbstractC18503f.C18506c.f172870h, AbstractC18503f.P.f172855h, AbstractC18503f.M.f172852h, AbstractC18503f.t0.f172905h, AbstractC18503f.S.f172858h, AbstractC18503f.U.f172860h, AbstractC18503f.C18509g.f172878h, AbstractC18503f.X.f172863h, AbstractC18503f.q0.f172897h, AbstractC18503f.C18511i.f172882h, AbstractC18503f.R.f172857h, AbstractC18503f.C18524v.f172908h, AbstractC18503f.C18525w.f172910h, AbstractC18503f.C2788f.f172876h, AbstractC18503f.C18518p.f172894h, AbstractC18503f.C.f172844h, AbstractC18503f.C18528z.f172916h, AbstractC18503f.V.f172861h, AbstractC18503f.g0.f172879h, AbstractC18503f.k0.f172887h, AbstractC18503f.l0.f172889h, AbstractC18503f.C18513k.f172886h, AbstractC18503f.W.f172862h, AbstractC18503f.C18515m.f172890h, AbstractC18503f.C18521s.f172902h, AbstractC18503f.w0.f172911h, AbstractC18503f.s0.f172903h, AbstractC18503f.x0.f172913h, AbstractC18503f.C18522t.f172904h, AbstractC18503f.Y.f172864h, AbstractC18503f.f0.f172877h, AbstractC18503f.C18510h.f172880h, AbstractC18503f.L.f172851h, AbstractC18503f.K.f172850h, AbstractC18503f.b0.f172869h, AbstractC18503f.Z.f172865h, AbstractC18503f.C18527y.f172914h, AbstractC18503f.h0.f172881h, AbstractC18503f.a0.f172867h, AbstractC18503f.C18526x.f172912h, AbstractC18503f.u0.f172907h);
        this.allFeatures = listP;
        InterfaceC16549B<List<AbstractC18503f>> interfaceC16549BA = pv.S.a(listP);
        this._availableFeatures = interfaceC16549BA;
        InterfaceC16549B<Instant> interfaceC16549BA2 = pv.S.a(Instant.MIN);
        this._stateUpdates = interfaceC16549BA2;
        this._flagFlow = C16563h.K(C16563h.F(interfaceC16549BA, interfaceC16549BA2, new C1783b(null)), new c(null));
    }

    public final InterfaceC16561f<List<DebugFeatureFlag>> b() {
        return this._flagFlow;
    }

    public final void c(AbstractC18503f feature, AbstractC18529g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        this.featureManager.g(feature, state);
        InterfaceC16549B<Instant> interfaceC16549B = this._stateUpdates;
        while (!interfaceC16549B.e(interfaceC16549B.getValue(), Instant.now())) {
        }
    }

    public final void d(String searchTerm) {
        List<AbstractC18503f> value;
        ArrayList arrayList;
        Intrinsics.j(searchTerm, "searchTerm");
        InterfaceC16549B<List<AbstractC18503f>> interfaceC16549B = this._availableFeatures;
        do {
            value = interfaceC16549B.getValue();
            List<AbstractC18503f> list = this.allFeatures;
            arrayList = new ArrayList();
            for (Object obj : list) {
                AbstractC18503f abstractC18503f = (AbstractC18503f) obj;
                List listP = CollectionsKt.p(abstractC18503f.getTitle(), abstractC18503f.getDescription(), abstractC18503f.getRemoteId(), abstractC18503f.getInternalId());
                if (!(listP instanceof Collection) || !listP.isEmpty()) {
                    Iterator it = listP.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (str != null && StringsKt.b0(str, searchTerm, true)) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        } while (!interfaceC16549B.e(value, arrayList));
    }
}
