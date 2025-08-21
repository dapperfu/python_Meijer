package zl;

import android.content.SharedPreferences;
import com.launchdarkly.sdk.LDValue;
import fv.C14268a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u0007\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u0004\u0018\u00010\u001f\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\u001e2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\"2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00100\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00070\u00070,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lzl/s;", "", "Landroid/content/SharedPreferences;", "preferences", "", "isDevMode", "", "", "overridesProvider", "<init>", "(Landroid/content/SharedPreferences;ZLjava/util/Map;)V", "(Landroid/content/SharedPreferences;Z)V", "Lzl/f;", "feature", "k", "(Lzl/f;)Ljava/lang/Boolean;", "Lzl/g;", "state", "", "q", "(Lzl/f;Lzl/g;)V", "g", "(Lzl/f;)Lzl/g;", "Lio/reactivex/l;", "l", "(Lzl/f;)Lio/reactivex/l;", "Lzl/f$n0;", "T", "i", "(Lzl/f;)Ljava/lang/String;", "Lzl/f$G;", "Lcom/launchdarkly/sdk/LDValue;", "h", "(Lzl/f;)Lcom/launchdarkly/sdk/LDValue;", "Lzl/f$m0;", "", "j", "(Lzl/f;)Ljava/util/List;", "a", "Landroid/content/SharedPreferences;", "b", "Z", "c", "Ljava/util/Map;", "Lfv/a;", "kotlin.jvm.PlatformType", "d", "Lfv/a;", "changeStream", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "e", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "changeListener", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDevMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> overridesProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C14268a<String> changeStream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.OnSharedPreferenceChangeListener changeListener;

    public s(SharedPreferences preferences, boolean z10, Map<String, ? extends Object> map) {
        Intrinsics.j(preferences, "preferences");
        this.preferences = preferences;
        this.isDevMode = z10;
        this.overridesProvider = map;
        C14268a<String> c14268aE = C14268a.e();
        Intrinsics.i(c14268aE, "create(...)");
        this.changeStream = c14268aE;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: zl.n
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                s.f(this.f172926a, sharedPreferences, str);
            }
        };
        this.changeListener = onSharedPreferenceChangeListener;
        preferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(s sVar, SharedPreferences sharedPreferences, String str) {
        Intrinsics.j(sharedPreferences, "<unused var>");
        C14268a<String> c14268a = sVar.changeStream;
        if (str == null) {
            str = "";
        }
        c14268a.onNext(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(AbstractC18503f abstractC18503f, String it) {
        Intrinsics.j(it, "it");
        return Intrinsics.e(it, abstractC18503f.getInternalId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18529g o(s sVar, AbstractC18503f abstractC18503f, String it) {
        Intrinsics.j(it, "it");
        return sVar.g(abstractC18503f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18529g p(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (AbstractC18529g) function1.invoke(p02);
    }

    public final AbstractC18529g g(AbstractC18503f feature) {
        Intrinsics.j(feature, "feature");
        SharedPreferences sharedPreferences = this.preferences;
        Boolean boolValueOf = null;
        if (!this.isDevMode) {
            sharedPreferences = null;
        }
        if (sharedPreferences != null) {
            if (!sharedPreferences.contains(feature.getInternalId())) {
                sharedPreferences = null;
            }
            if (sharedPreferences != null) {
                boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean(feature.getInternalId(), feature.getDefault()));
            }
        }
        return C18530h.b(boolValueOf);
    }

    public final <T extends AbstractC18503f & AbstractC18503f.G> LDValue h(T feature) {
        Intrinsics.j(feature, "feature");
        if (Intrinsics.e(k(feature), Boolean.TRUE)) {
            Map<String, Object> map = this.overridesProvider;
            Object obj = map != null ? map.get(feature.getInternalId()) : null;
            lDValue = obj instanceof LDValue ? (LDValue) obj : null;
            if (lDValue == null) {
                return LDValue.v(feature.b());
            }
        }
        return lDValue;
    }

    public final <T extends AbstractC18503f & AbstractC18503f.n0> String i(T feature) {
        Intrinsics.j(feature, "feature");
        if (Intrinsics.e(k(feature), Boolean.TRUE)) {
            Map<String, Object> map = this.overridesProvider;
            Object obj = map != null ? map.get(feature.getInternalId()) : null;
            str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                return feature.b();
            }
        }
        return str;
    }

    public final <T extends AbstractC18503f & AbstractC18503f.m0> List<String> j(T feature) {
        Intrinsics.j(feature, "feature");
        return CollectionsKt.m();
    }

    public final Boolean k(AbstractC18503f feature) {
        Intrinsics.j(feature, "feature");
        AbstractC18503f prerequisite = feature.getPrerequisite();
        return prerequisite != null ? Intrinsics.e(k(prerequisite), Boolean.FALSE) : false ? Boolean.FALSE : g(feature).a();
    }

    public final io.reactivex.l<AbstractC18529g> l(final AbstractC18503f feature) {
        Intrinsics.j(feature, "feature");
        C14268a<String> c14268a = this.changeStream;
        final Function1 function1 = new Function1() { // from class: zl.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s.m(feature, (String) obj));
            }
        };
        io.reactivex.l<String> lVarFilter = c14268a.filter(new Lu.q() { // from class: zl.p
            @Override // Lu.q
            public final boolean test(Object obj) {
                return s.n(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: zl.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.o(this.f172929a, feature, (String) obj);
            }
        };
        io.reactivex.l<AbstractC18529g> lVarDistinctUntilChanged = lVarFilter.map(new Lu.o() { // from class: zl.r
            @Override // Lu.o
            public final Object apply(Object obj) {
                return s.p(function12, obj);
            }
        }).startWith((io.reactivex.l<R>) g(feature)).distinctUntilChanged();
        Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return lVarDistinctUntilChanged;
    }

    public final void q(AbstractC18503f feature, AbstractC18529g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        String internalId = feature.getInternalId();
        if (internalId == null || StringsKt.s0(internalId)) {
            throw new IllegalArgumentException("Feature " + feature + " is not configured for local overrides.");
        }
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        Boolean boolA = state.a();
        if (boolA != null) {
            editorEdit.putBoolean(feature.getInternalId(), boolA.booleanValue());
        } else {
            editorEdit.remove(feature.getInternalId());
        }
        editorEdit.apply();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(SharedPreferences preferences, boolean z10) {
        this(preferences, z10, null);
        Intrinsics.j(preferences, "preferences");
    }
}
