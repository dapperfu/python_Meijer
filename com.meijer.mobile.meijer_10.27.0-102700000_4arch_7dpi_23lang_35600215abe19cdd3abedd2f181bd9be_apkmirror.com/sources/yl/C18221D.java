package yl;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import com.launchdarkly.sdk.android.N;
import com.launchdarkly.sdk.android.b0;
import hv.C14574b;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import uw.a;
import yl.AbstractC18227f;
import yo.MeijerUser;
import zl.C18534b;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 52\u00020\u0001:\u0001/B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u0013\"\f\b\u0000\u0010\u001e*\u00020\u0018*\u00020\u001d2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"\"\f\b\u0000\u0010\u001e*\u00020\u0018*\u00020!2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\"\f\b\u0000\u0010\u001e*\u00020\u0018*\u00020%2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b)\u0010\u0017J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lyl/D;", "", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lcom/launchdarkly/sdk/android/b0;", "launchDarkly", "Lokhttp3/Headers;", "globalHeaders", "<init>", "(Lyo/k;LTq/j;Lcom/launchdarkly/sdk/android/b0;Lokhttp3/Headers;)V", "Lyo/c;", "user", "LTq/k;", PlaceTypes.STORE, "Lcom/launchdarkly/sdk/LDContext;", "p", "(Lyo/c;LTq/k;)Lcom/launchdarkly/sdk/LDContext;", "", "remoteId", "", "r", "(Ljava/lang/String;)Ljava/util/List;", "Lyl/f;", "feature", "", "v", "(Lyl/f;)Z", "Lyl/f$n0;", "T", "t", "(Lyl/f;)Ljava/lang/String;", "Lyl/f$G;", "Lcom/launchdarkly/sdk/LDValue;", "s", "(Lyl/f;)Lcom/launchdarkly/sdk/LDValue;", "Lyl/f$m0;", "u", "(Lyl/f;)Ljava/util/List;", "", "q", "Lio/reactivex/l;", "w", "(Lyl/f;)Lio/reactivex/l;", "a", "Lcom/launchdarkly/sdk/android/b0;", "b", "Lokhttp3/Headers;", "LNu/a;", "c", "LNu/a;", "disposables", "d", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: yl.D, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18221D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 launchDarkly;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Headers globalHeaders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yl.D$a */
    /* synthetic */ class a extends AdaptedFunctionReference implements Function1<LDContext, Unit> {
        a(Object obj) {
            super(1, obj, b0.class, "identify", "identify(Lcom/launchdarkly/sdk/LDContext;)Ljava/util/concurrent/Future;", 8);
        }

        public final void a(LDContext lDContext) {
            ((b0) this.f142801a).o2(lDContext);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LDContext lDContext) {
            a(lDContext);
            return Unit.f142422a;
        }
    }

    public C18221D(yo.k userManager, Tq.j storeProvider, b0 launchDarkly, Headers globalHeaders) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(launchDarkly, "launchDarkly");
        Intrinsics.j(globalHeaders, "globalHeaders");
        this.launchDarkly = launchDarkly;
        this.globalHeaders = globalHeaders;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        io.reactivex.l lVarA = C14574b.f136404a.a(userManager.F(), storeProvider.f());
        final Function1 function1 = new Function1() { // from class: yl.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18221D.k(this.f170646a, (Pair) obj);
            }
        };
        io.reactivex.l map = lVarA.map(new Pu.o() { // from class: yl.y
            @Override // Pu.o
            public final Object apply(Object obj) {
                return C18221D.l(function1, obj);
            }
        });
        final a aVar2 = new a(launchDarkly);
        Pu.g gVar = new Pu.g() { // from class: yl.z
            @Override // Pu.g
            public final void accept(Object obj) {
                C18221D.m(aVar2, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: yl.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18221D.n((Throwable) obj);
            }
        };
        Ck.a.a(map.subscribe(gVar, new Pu.g() { // from class: yl.B
            @Override // Pu.g
            public final void accept(Object obj) {
                C18221D.o(function12, obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean A(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(C18221D c18221d, AbstractC18227f abstractC18227f, Ref.ObjectRef objectRef) {
        N n10;
        b0 b0Var = c18221d.launchDarkly;
        String remoteId = abstractC18227f.getRemoteId();
        T t10 = objectRef.f142835a;
        N n11 = null;
        if (t10 == 0) {
            Intrinsics.y("listener");
            n10 = null;
        } else {
            n10 = (N) t10;
        }
        b0Var.D0(remoteId, n10);
        a.Companion companion = uw.a.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Removing listener for ");
        sb2.append(abstractC18227f.getRemoteId());
        sb2.append(": ");
        T t11 = objectRef.f142835a;
        if (t11 == 0) {
            Intrinsics.y("listener");
        } else {
            n11 = (N) t11;
        }
        sb2.append(n11);
        companion.a(sb2.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LDContext k(C18221D c18221d, Pair pair) {
        Intrinsics.j(pair, "<destruct>");
        return c18221d.p((MeijerUser) pair.a(), (Tq.k) pair.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LDContext l(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (LDContext) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Throwable th2) {
        uw.a.INSTANCE.f(th2, "Error merging data for LD context identification.", new Object[0]);
        return Unit.f142422a;
    }

    private final LDContext p(MeijerUser user, Tq.k store) {
        return C18534b.b(user, this.globalHeaders.get("Platform"), this.globalHeaders.get("Version"), this.globalHeaders.get("Build"), store != null ? Integer.valueOf(store.getStoreId()) : null);
    }

    private final List<String> r(String remoteId) {
        Iterable iterableA;
        List<String> listJ1;
        LDValue lDValueJ1 = this.launchDarkly.J1(remoteId, null);
        uw.a.INSTANCE.a("StringListFeatureFlag " + remoteId + ": " + lDValueJ1, new Object[0]);
        return (lDValueJ1 == null || (iterableA = lDValueJ1.A(LDValue.c.f91008f)) == null || (listJ1 = CollectionsKt.j1(iterableA)) == null) ? CollectionsKt.m() : listJ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, yl.C] */
    public static final void x(Ref.ObjectRef objectRef, final C18221D c18221d, final AbstractC18227f abstractC18227f, final io.reactivex.n emitter) {
        N n10;
        Intrinsics.j(emitter, "emitter");
        objectRef.f142835a = new N() { // from class: yl.C
            @Override // com.launchdarkly.sdk.android.N
            public final void a(String str) {
                C18221D.y(emitter, c18221d, abstractC18227f, str);
            }
        };
        b0 b0Var = c18221d.launchDarkly;
        String remoteId = abstractC18227f.getRemoteId();
        T t10 = objectRef.f142835a;
        N n11 = null;
        if (t10 == 0) {
            Intrinsics.y("listener");
            n10 = null;
        } else {
            n10 = (N) t10;
        }
        b0Var.k0(remoteId, n10);
        a.Companion companion = uw.a.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Added listener for ");
        sb2.append(abstractC18227f.getRemoteId());
        sb2.append(": ");
        T t11 = objectRef.f142835a;
        if (t11 == 0) {
            Intrinsics.y("listener");
        } else {
            n11 = (N) t11;
        }
        sb2.append(n11);
        companion.a(sb2.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean z(C18221D c18221d, AbstractC18227f abstractC18227f, Boolean it) {
        Intrinsics.j(it, "it");
        return Boolean.valueOf(c18221d.v(abstractC18227f));
    }

    public final List<Integer> q(String remoteId) {
        Iterable iterableA;
        List<Integer> listJ1;
        Intrinsics.j(remoteId, "remoteId");
        LDValue lDValueJ1 = this.launchDarkly.J1(remoteId, null);
        uw.a.INSTANCE.a(remoteId + ": " + lDValueJ1, new Object[0]);
        if (lDValueJ1 == null || (iterableA = lDValueJ1.A(LDValue.c.f91004b)) == null || (listJ1 = CollectionsKt.j1(iterableA)) == null) {
            return null;
        }
        if (listJ1.size() > 1) {
            List<Integer> list = listJ1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Integer num : list) {
                    if (num == null || num.intValue() != 0) {
                        return listJ1;
                    }
                }
            }
            uw.a.INSTANCE.s("Suspected mismatch of feature flag type for " + remoteId + ". Expected integer array, but array contains only zeros.", new Object[0]);
        }
        return listJ1;
    }

    public final <T extends AbstractC18227f & AbstractC18227f.G> LDValue s(T feature) {
        Intrinsics.j(feature, "feature");
        LDValue lDValueJ1 = this.launchDarkly.J1(feature.getRemoteId(), feature.a());
        Intrinsics.i(lDValueJ1, "jsonValueVariation(...)");
        return lDValueJ1;
    }

    public final <T extends AbstractC18227f & AbstractC18227f.n0> String t(T feature) {
        Intrinsics.j(feature, "feature");
        String strV1 = this.launchDarkly.v1(feature.getRemoteId(), feature.a());
        Intrinsics.i(strV1, "stringVariation(...)");
        return strV1;
    }

    public final <T extends AbstractC18227f & AbstractC18227f.m0> List<String> u(T feature) {
        Intrinsics.j(feature, "feature");
        String remoteId = feature.getRemoteId();
        return (remoteId == null || !(StringsKt.r0(remoteId) ^ true)) ? CollectionsKt.m() : r(feature.getRemoteId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        AbstractC18227f prerequisite = feature.getPrerequisite();
        if (prerequisite != null && !v(prerequisite)) {
            return false;
        }
        if (!(feature instanceof AbstractC18227f.E)) {
            if (!(feature instanceof AbstractC18227f.n0)) {
                return feature instanceof AbstractC18227f.G ? !Intrinsics.e(this.launchDarkly.J1(feature.getRemoteId(), ((AbstractC18227f.G) feature).a()), LDValue.u()) : this.launchDarkly.J3(feature.getRemoteId(), feature.getDefault());
            }
            String strV1 = this.launchDarkly.v1(feature.getRemoteId(), ((AbstractC18227f.n0) feature).a());
            Intrinsics.i(strV1, "stringVariation(...)");
            return !StringsKt.r0(strV1);
        }
        String remoteId = feature.getRemoteId();
        if (remoteId == null || StringsKt.r0(remoteId)) {
            remoteId = null;
        }
        if (remoteId != null) {
            List<Integer> listQ = q(remoteId);
            Boolean boolValueOf = listQ != null ? Boolean.valueOf(listQ.contains(Integer.valueOf(((AbstractC18227f.E) feature).a()))) : null;
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return feature.getDefault();
    }

    public final io.reactivex.l<Boolean> w(final AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        String remoteId = feature.getRemoteId();
        if (remoteId == null || StringsKt.r0(remoteId)) {
            io.reactivex.l<Boolean> lVarJust = io.reactivex.l.just(Boolean.valueOf(feature.getDefault()));
            Intrinsics.i(lVarJust, "just(...)");
            return lVarJust;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        io.reactivex.l lVarCreate = io.reactivex.l.create(new io.reactivex.o() { // from class: yl.t
            @Override // io.reactivex.o
            public final void a(io.reactivex.n nVar) {
                C18221D.x(objectRef, this, feature, nVar);
            }
        });
        final Function1 function1 = new Function1() { // from class: yl.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C18221D.z(this.f170640a, feature, (Boolean) obj);
            }
        };
        io.reactivex.l<Boolean> lVarDoOnDispose = lVarCreate.map(new Pu.o() { // from class: yl.v
            @Override // Pu.o
            public final Object apply(Object obj) {
                return C18221D.A(function1, obj);
            }
        }).startWith((io.reactivex.l) Boolean.valueOf(v(feature))).distinctUntilChanged().doOnDispose(new Pu.a() { // from class: yl.w
            @Override // Pu.a
            public final void run() {
                C18221D.B(this.f170643a, feature, objectRef);
            }
        });
        Intrinsics.i(lVarDoOnDispose, "doOnDispose(...)");
        return lVarDoOnDispose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(io.reactivex.n nVar, C18221D c18221d, AbstractC18227f abstractC18227f, String str) {
        nVar.onNext(Boolean.valueOf(c18221d.v(abstractC18227f)));
    }
}
