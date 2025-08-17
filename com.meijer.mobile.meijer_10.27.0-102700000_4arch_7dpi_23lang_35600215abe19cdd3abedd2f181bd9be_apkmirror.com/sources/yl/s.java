package yl;

import android.content.SharedPreferences;
import com.launchdarkly.sdk.LDValue;
import java.util.List;
import java.util.Map;
import jv.C15078a;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import yl.AbstractC18227f;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u0007\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\u001a2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010 \u001a\u0004\u0018\u00010\u001f\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\u001e2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J)\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070#\"\f\b\u0000\u0010\u001b*\u00020\f*\u00020\"2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u00100\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00070\u00070,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lyl/s;", "", "Landroid/content/SharedPreferences;", "preferences", "", "isDevMode", "", "", "overridesProvider", "<init>", "(Landroid/content/SharedPreferences;ZLjava/util/Map;)V", "(Landroid/content/SharedPreferences;Z)V", "Lyl/f;", "feature", "k", "(Lyl/f;)Ljava/lang/Boolean;", "Lyl/g;", "state", "", "q", "(Lyl/f;Lyl/g;)V", "g", "(Lyl/f;)Lyl/g;", "Lio/reactivex/l;", "l", "(Lyl/f;)Lio/reactivex/l;", "Lyl/f$n0;", "T", "i", "(Lyl/f;)Ljava/lang/String;", "Lyl/f$G;", "Lcom/launchdarkly/sdk/LDValue;", "h", "(Lyl/f;)Lcom/launchdarkly/sdk/LDValue;", "Lyl/f$m0;", "", "j", "(Lyl/f;)Ljava/util/List;", "a", "Landroid/content/SharedPreferences;", "b", "Z", "c", "Ljava/util/Map;", "Ljv/a;", "kotlin.jvm.PlatformType", "d", "Ljv/a;", "changeStream", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "e", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "changeListener", "featureflag_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDevMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> overridesProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15078a<String> changeStream;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences.OnSharedPreferenceChangeListener changeListener;

    public s(SharedPreferences preferences, boolean z10, Map<String, ? extends Object> map) {
        Intrinsics.j(preferences, "preferences");
        this.preferences = preferences;
        this.isDevMode = z10;
        this.overridesProvider = map;
        C15078a<String> c15078aE = C15078a.e();
        Intrinsics.i(c15078aE, "create(...)");
        this.changeStream = c15078aE;
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: yl.n
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                s.f(this.f170626a, sharedPreferences, str);
            }
        };
        this.changeListener = onSharedPreferenceChangeListener;
        preferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(s sVar, SharedPreferences sharedPreferences, String str) {
        Intrinsics.j(sharedPreferences, "<unused var>");
        C15078a<String> c15078a = sVar.changeStream;
        if (str == null) {
            str = "";
        }
        c15078a.onNext(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(AbstractC18227f abstractC18227f, String it) {
        Intrinsics.j(it, "it");
        return Intrinsics.e(it, abstractC18227f.getInternalId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18253g o(s sVar, AbstractC18227f abstractC18227f, String it) {
        Intrinsics.j(it, "it");
        return sVar.g(abstractC18227f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18253g p(Function1 function1, Object p02) {
        Intrinsics.j(p02, "p0");
        return (AbstractC18253g) function1.invoke(p02);
    }

    public final AbstractC18253g g(AbstractC18227f feature) {
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
        return C18254h.b(boolValueOf);
    }

    public final <T extends AbstractC18227f & AbstractC18227f.G> LDValue h(T feature) {
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

    public final <T extends AbstractC18227f & AbstractC18227f.n0> String i(T feature) {
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

    public final <T extends AbstractC18227f & AbstractC18227f.m0> List<String> j(T feature) {
        Intrinsics.j(feature, "feature");
        return CollectionsKt.m();
    }

    public final Boolean k(AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        AbstractC18227f prerequisite = feature.getPrerequisite();
        return prerequisite != null ? Intrinsics.e(k(prerequisite), Boolean.FALSE) : false ? Boolean.FALSE : g(feature).a();
    }

    public final io.reactivex.l<AbstractC18253g> l(final AbstractC18227f feature) {
        Intrinsics.j(feature, "feature");
        C15078a<String> c15078a = this.changeStream;
        final Function1 function1 = new Function1() { // from class: yl.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(s.m(feature, (String) obj));
            }
        };
        io.reactivex.l<String> lVarFilter = c15078a.filter(new Pu.q() { // from class: yl.p
            @Override // Pu.q
            public final boolean test(Object obj) {
                return s.n(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: yl.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.o(this.f170629a, feature, (String) obj);
            }
        };
        io.reactivex.l<AbstractC18253g> lVarDistinctUntilChanged = lVarFilter.map(new Pu.o() { // from class: yl.r
            @Override // Pu.o
            public final Object apply(Object obj) {
                return s.p(function12, obj);
            }
        }).startWith((io.reactivex.l<R>) g(feature)).distinctUntilChanged();
        Intrinsics.i(lVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return lVarDistinctUntilChanged;
    }

    public final void q(AbstractC18227f feature, AbstractC18253g state) {
        Intrinsics.j(feature, "feature");
        Intrinsics.j(state, "state");
        String internalId = feature.getInternalId();
        if (internalId == null || StringsKt.r0(internalId)) {
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
