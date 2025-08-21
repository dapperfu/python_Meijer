package j4;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14675p;
import kotlin.C14682w;
import kotlin.InterfaceC6302b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.P;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Lj4/e;", "Li4/B;", "Lj4/e$b;", "<init>", "()V", "", "Li4/h;", "entries", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "", "e", "(Ljava/util/List;Li4/w;Li4/B$a;)V", "l", "()Lj4/e$b;", "popUpTo", "", "savedState", "j", "(Li4/h;Z)V", "entry", "o", "(Li4/h;)V", "Landroidx/compose/runtime/l0;", "c", "Landroidx/compose/runtime/l0;", "n", "()Landroidx/compose/runtime/l0;", "isPop", "Lpv/P;", "m", "()Lpv/P;", "backStack", "d", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC14656B.b("composable")
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e extends AbstractC14656B<b> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0<Boolean> isPop = t1.e(Boolean.FALSE, null, 2, null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fR6\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010RB\u0010\u001a\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010\u001f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u0019RB\u0010#\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019RB\u0010'\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0011¢\u0006\u0002\b\u0007¢\u0006\u0002\b\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019¨\u0006("}, d2 = {"Lj4/e$b;", "Li4/p;", "Lj4/e;", "navigator", "Lkotlin/Function2;", "Lb0/b;", "Li4/h;", "Lkotlin/jvm/JvmSuppressWildcards;", "", "Lkotlin/ExtensionFunctionType;", "content", "<init>", "(Lj4/e;Lkotlin/jvm/functions/Function4;)V", "l", "Lkotlin/jvm/functions/Function4;", "H", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Landroidx/compose/animation/h;", "m", "Lkotlin/jvm/functions/Function1;", "I", "()Lkotlin/jvm/functions/Function1;", "N", "(Lkotlin/jvm/functions/Function1;)V", "enterTransition", "Landroidx/compose/animation/j;", "n", "K", "P", "exitTransition", "o", "L", "Q", "popEnterTransition", "p", "M", "R", "popExitTransition", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends C14675p {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> content;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> enterTransition;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> exitTransition;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> popEnterTransition;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> popExitTransition;

        public final Function4<InterfaceC6302b, C14667h, Composer, Integer, Unit> H() {
            return this.content;
        }

        public final Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> I() {
            return this.enterTransition;
        }

        public final Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> K() {
            return this.exitTransition;
        }

        public final Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> L() {
            return this.popEnterTransition;
        }

        public final Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> M() {
            return this.popExitTransition;
        }

        public final void N(Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1) {
            this.enterTransition = function1;
        }

        public final void P(Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1) {
            this.exitTransition = function1;
        }

        public final void Q(Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.h> function1) {
            this.popEnterTransition = function1;
        }

        public final void R(Function1<androidx.compose.animation.d<C14667h>, androidx.compose.animation.j> function1) {
            this.popExitTransition = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(e eVar, Function4<? super InterfaceC6302b, C14667h, ? super Composer, ? super Integer, Unit> function4) {
            super(eVar);
            this.content = function4;
        }
    }

    @Override // kotlin.AbstractC14656B
    public void e(List<C14667h> entries, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            b().j((C14667h) it.next());
        }
        this.isPop.setValue(Boolean.FALSE);
    }

    @Override // kotlin.AbstractC14656B
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this, j4.b.f139835a.a());
    }

    public final InterfaceC5872l0<Boolean> n() {
        return this.isPop;
    }

    @Override // kotlin.AbstractC14656B
    public void j(C14667h popUpTo, boolean savedState) {
        b().h(popUpTo, savedState);
        this.isPop.setValue(Boolean.TRUE);
    }

    public final P<List<C14667h>> m() {
        return b().b();
    }

    public final void o(C14667h entry) {
        b().e(entry);
    }
}
