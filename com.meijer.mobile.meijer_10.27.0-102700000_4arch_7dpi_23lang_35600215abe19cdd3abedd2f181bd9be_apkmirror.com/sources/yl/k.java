package yl;

import com.launchdarkly.sdk.LDValue;
import hv.C14574b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u001eB\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f\"\f\b\u0000\u0010\u000e*\u00020\b*\u00020\r2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u0013\"\f\b\u0000\u0010\u000e*\u00020\b*\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017\"\f\b\u0000\u0010\u000e*\u00020\b*\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, d2 = {"Lyl/k;", "", "Lyl/s;", "localConfigManager", "Lyl/D;", "remoteConfigManager", "<init>", "(Lyl/s;Lyl/D;)V", "Lyl/f;", "feature", "", "e", "(Lyl/f;)Z", "Lyl/f$n0;", "T", "", "c", "(Lyl/f;)Ljava/lang/String;", "Lyl/f$G;", "Lcom/launchdarkly/sdk/LDValue;", "b", "(Lyl/f;)Lcom/launchdarkly/sdk/LDValue;", "Lyl/f$m0;", "", "d", "(Lyl/f;)Ljava/util/List;", "Lio/reactivex/l;", "f", "(Lyl/f;)Lio/reactivex/l;", "Lyl/g;", "a", "(Lyl/f;)Lyl/g;", "state", "", "g", "(Lyl/f;Lyl/g;)V", "Lyl/s;", "Lyl/D;", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s localConfigManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C18221D remoteConfigManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class b<T1, T2, R> implements Pu.c<T1, T2, R> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Pu.c
        public final R apply(T1 t12, T2 t22) {
            boolean zBooleanValue = ((Boolean) t22).booleanValue();
            Boolean boolA = ((AbstractC18253g) t12).a();
            if (boolA != null) {
                zBooleanValue = boolA.booleanValue();
            }
            return (R) Boolean.valueOf(zBooleanValue);
        }
    }

    public k(s localConfigManager, C18221D c18221d) {
        Intrinsics.j(localConfigManager, "localConfigManager");
        this.localConfigManager = localConfigManager;
        this.remoteConfigManager = c18221d;
    }

    public final AbstractC18253g a(AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        return this.localConfigManager.g(feature);
    }

    public final <T extends AbstractC18227f & AbstractC18227f.G> LDValue b(T feature) {
        Intrinsics.j(feature, "feature");
        LDValue lDValueH = this.localConfigManager.h(feature);
        if (lDValueH == null) {
            C18221D c18221d = this.remoteConfigManager;
            lDValueH = c18221d != null ? c18221d.s(feature) : null;
            if (lDValueH == null) {
                return feature.a();
            }
        }
        return lDValueH;
    }

    public final <T extends AbstractC18227f & AbstractC18227f.n0> String c(T feature) {
        Intrinsics.j(feature, "feature");
        String strI = this.localConfigManager.i(feature);
        if (strI == null) {
            C18221D c18221d = this.remoteConfigManager;
            strI = c18221d != null ? c18221d.t(feature) : null;
            if (strI == null) {
                return feature.a();
            }
        }
        return strI;
    }

    public final <T extends AbstractC18227f & AbstractC18227f.m0> List<String> d(T feature) {
        Intrinsics.j(feature, "feature");
        List<String> listJ = this.localConfigManager.j(feature);
        if (listJ.isEmpty()) {
            listJ = null;
        }
        if (listJ != null) {
            return listJ;
        }
        C18221D c18221d = this.remoteConfigManager;
        List<String> listU = c18221d != null ? c18221d.u(feature) : null;
        return listU == null ? feature.a() : listU;
    }

    public final boolean e(AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        Boolean boolK = this.localConfigManager.k(feature);
        if (boolK != null) {
            return boolK.booleanValue();
        }
        C18221D c18221d = this.remoteConfigManager;
        Boolean boolValueOf = c18221d != null ? Boolean.valueOf(c18221d.v(feature)) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : feature.getDefault();
    }

    public final io.reactivex.l<Boolean> f(AbstractC18227f feature) {
        io.reactivex.l<Boolean> lVarJust;
        Intrinsics.j(feature, "feature");
        C14574b c14574b = C14574b.f136404a;
        io.reactivex.l<AbstractC18253g> lVarL = this.localConfigManager.l(feature);
        C18221D c18221d = this.remoteConfigManager;
        if (c18221d == null || (lVarJust = c18221d.w(feature)) == null) {
            lVarJust = io.reactivex.l.just(Boolean.valueOf(feature.getDefault()));
            Intrinsics.i(lVarJust, "just(...)");
        }
        io.reactivex.l lVarCombineLatest = io.reactivex.l.combineLatest(lVarL, lVarJust, new b());
        Intrinsics.f(lVarCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        io.reactivex.l<Boolean> lVarDistinctUntilChanged = lVarCombineLatest.distinctUntilChanged();
        Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return lVarDistinctUntilChanged;
    }

    public final void g(AbstractC18227f feature, AbstractC18253g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        this.localConfigManager.q(feature, state);
    }
}
