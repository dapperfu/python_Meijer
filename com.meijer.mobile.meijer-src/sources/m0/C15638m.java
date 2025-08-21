package m0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.C15858Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm0/I;", "state", "Lkotlin/Function1;", "Lm0/C;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "Lm0/k;", "a", "(Lm0/I;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15638m {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "c", "()Lm0/i;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.m$b */
    static final class b extends Lambda implements Function0<C15634i> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Function1<InterfaceC15617C, Unit>> f150368f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1<? extends Function1<? super InterfaceC15617C, Unit>> z1Var) {
            super(0);
            this.f150368f = z1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15634i invoke() {
            return new C15634i(this.f150368f.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/l;", "c", "()Lm0/l;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.m$c */
    static final class c extends Lambda implements Function0<C15637l> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<C15634i> f150369f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15623I f150370g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1<C15634i> z1Var, C15623I c15623i) {
            super(0);
            this.f150369f = z1Var;
            this.f150370g = c15623i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15637l invoke() {
            C15634i value = this.f150369f.getValue();
            return new C15637l(this.f150370g, value, new C15858Q(this.f150370g.w(), value));
        }
    }

    public static final Function0<InterfaceC15636k> a(C15623I c15623i, Function1<? super InterfaceC15617C, Unit> function1, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1898306282, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:42)");
        }
        z1 z1VarP = o1.p(function1, composer, (i10 >> 3) & 14);
        if ((((i10 & 14) ^ 6) > 4 && composer.V(c15623i)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            objB = new PropertyReference0Impl(o1.d(o1.o(), new c(o1.d(o1.o(), new b(z1VarP)), c15623i))) { // from class: m0.m.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((z1) this.receiver).getValue();
                }
            };
            composer.t(objB);
        }
        KProperty0 kProperty0 = (KProperty0) objB;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return kProperty0;
    }
}
