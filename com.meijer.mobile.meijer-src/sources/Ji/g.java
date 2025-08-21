package Ji;

import Ji.b;
import Ji.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00028\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u00002\u001d\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0002\b\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001a\u0010\u001bRI\u0010\"\u001a1\u0012\u0004\u0012\u00028\u0000\u0012'\u0012%\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u001d0\u0014¢\u0006\u0002\b\u00150\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R@\u0010)\u001a(\u0012\u0004\u0012\u00028\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00020\u0014¢\u0006\u0002\b\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LJi/g;", "KEY", "LJi/b;", "COMPOSER", "LJi/h;", "SCOPE", "LJi/i;", "<init>", "()V", "key", "g", "(Ljava/lang/Object;)LJi/h;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "k", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function2;", "f", "()LJi/b;", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "m", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "scope", "p", "(Ljava/lang/Object;LJi/h;)V", "", "Lkotlin/Function1;", "a", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "providerMap", "Lkotlin/ParameterName;", "name", "b", "Lkotlin/jvm/functions/Function2;", "j", "()Lkotlin/jvm/functions/Function2;", "scopeFactory", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class g<KEY, COMPOSER extends b, SCOPE extends h> implements i<KEY, SCOPE> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<KEY, Function2<SCOPE, COMPOSER, Function3<Modifier, Composer, Integer, Unit>>> providerMap = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<SCOPE, KEY, SCOPE> scopeFactory = new Function2() { // from class: Ji.d
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return g.o((h) obj, obj2);
        }
    };

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g<KEY, COMPOSER, SCOPE> f15901a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ KEY f15902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f15903c;

        a(g<KEY, COMPOSER, SCOPE> gVar, KEY key, Modifier modifier) {
            this.f15901a = gVar;
            this.f15902b = key;
            this.f15903c = modifier;
        }

        public final void a(Composer composer, int i10) {
            Function3<Modifier, Composer, Integer, Unit> function3A;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-127113987, i10, -1, "com.meijer.mobile.android_acres_library.core.Provider.provide.<anonymous> (Provider.kt:32)");
            }
            Function2 function2 = this.f15901a.i().get(this.f15902b);
            if (function2 == null || (function3A = (Function3) function2.invoke(this.f15901a.g(this.f15902b), this.f15901a.f())) == null) {
                function3A = Ji.a.f15889a.a();
            }
            function3A.invoke(this.f15903c, composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h o(h hVar, Object obj) {
        Intrinsics.j(hVar, "<this>");
        return hVar;
    }

    public COMPOSER f() {
        try {
            h hVarH = h(this, null, 1, null);
            Intrinsics.h(hVarH, "null cannot be cast to non-null type COMPOSER of com.meijer.mobile.android_acres_library.core.Provider");
            return (COMPOSER) hVarH;
        } catch (TypeCastException unused) {
            throw new TypeCastException("The scope did not implement a composer. Either define one here or implement it in the scope");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SCOPE g(KEY key) {
        return key != null ? j().invoke(getInitialScope(), key) : getInitialScope();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ h h(g gVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChildScope");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return gVar.g(obj);
    }

    public static /* synthetic */ Function2 l(g gVar, Object obj, Modifier modifier, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provide");
        }
        if ((i10 & 2) != 0) {
            modifier = Modifier.INSTANCE;
        }
        return gVar.k(obj, modifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 n(Function2 function2, Object obj, h hVar, b it) {
        Intrinsics.j(hVar, "<this>");
        Intrinsics.j(it, "it");
        function2.invoke(hVar, obj);
        return ((b) hVar).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 q(h hVar, h hVar2, b it) {
        Intrinsics.j(hVar2, "<this>");
        Intrinsics.j(it, "it");
        Intrinsics.h(hVar, "null cannot be cast to non-null type com.meijer.mobile.android_acres_library.core.Composer");
        return ((b) hVar).a();
    }

    public Map<KEY, Function2<SCOPE, COMPOSER, Function3<Modifier, Composer, Integer, Unit>>> i() {
        return this.providerMap;
    }

    public Function2<SCOPE, KEY, SCOPE> j() {
        return this.scopeFactory;
    }

    public Function2<Composer, Integer, Unit> k(KEY key, Modifier modifier) {
        Intrinsics.j(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-127113987, true, new a(this, key, modifier));
    }

    public void m(final KEY key, final Function2<? super SCOPE, ? super KEY, Unit> block) {
        Intrinsics.j(block, "block");
        i().put(key, new Function2() { // from class: Ji.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.n(block, key, (h) obj, (b) obj2);
            }
        });
    }

    public final void p(KEY key, final SCOPE scope) {
        Intrinsics.j(scope, "scope");
        i().put(key, new Function2() { // from class: Ji.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.q(scope, (h) obj, (b) obj2);
            }
        });
    }
}
