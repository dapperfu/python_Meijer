package Ji;

import Ji.b;
import Ji.h;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0005*\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006:\u0001\u0017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"LJi/c;", "KEY", "LJi/b;", "COMPOSER", "LJi/h;", "SCOPE", "LJi/g;", "<init>", "()V", "key", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "k", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function2;", "f", "()LJi/b;", "Landroidx/compose/runtime/z1;", "r", "()Landroidx/compose/runtime/z1;", "state", "c", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class c<KEY, COMPOSER extends Ji.b, SCOPE extends h> extends g<KEY, COMPOSER, SCOPE> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f15893d = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<KEY, COMPOSER, SCOPE> f15894a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f15895b;

        b(c<KEY, COMPOSER, SCOPE> cVar, Modifier modifier) {
            this.f15894a = cVar;
            this.f15895b = modifier;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1220284197, i10, -1, "com.meijer.mobile.android_acres_library.core.EntryPointProvider.provide.<anonymous> (Provider.kt:78)");
            }
            this.f15894a.f().a().invoke(this.f15895b, composer, 0);
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

    public abstract z1<SCOPE> r();

    @Override // Ji.g
    public Function2<Composer, Integer, Unit> k(KEY key, Modifier modifier) {
        Intrinsics.j(modifier, "modifier");
        return ComposableLambdaKt.composableLambdaInstance(-1220284197, true, new b(this, modifier));
    }

    @Override // Ji.g
    public COMPOSER f() {
        try {
            SCOPE value = r().getValue();
            Intrinsics.h(value, "null cannot be cast to non-null type COMPOSER of com.meijer.mobile.android_acres_library.core.EntryPointProvider");
            return (COMPOSER) value;
        } catch (TypeCastException unused) {
            throw new TypeCastException("An entry point provider MUST have a Scope that implements a Composer.");
        }
    }
}
