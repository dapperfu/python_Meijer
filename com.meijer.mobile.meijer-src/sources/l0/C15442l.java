package l0;

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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll0/A;", "state", "Lkotlin/Function1;", "Ll0/w;", "", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/Function0;", "Ll0/j;", "a", "(Ll0/A;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15442l {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/h;", "c", "()Ll0/h;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.l$b */
    static final class b extends Lambda implements Function0<C15438h> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<Function1<w, Unit>> f149061f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1<? extends Function1<? super w, Unit>> z1Var) {
            super(0);
            this.f149061f = z1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15438h invoke() {
            return new C15438h(this.f149061f.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/k;", "c", "()Ll0/k;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: l0.l$c */
    static final class c extends Lambda implements Function0<C15441k> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<C15438h> f149062f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f149063g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.a f149064h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z1<C15438h> z1Var, C15429A c15429a, androidx.compose.foundation.lazy.a aVar) {
            super(0);
            this.f149062f = z1Var;
            this.f149063g = c15429a;
            this.f149064h = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C15441k invoke() {
            C15438h value = this.f149062f.getValue();
            return new C15441k(this.f149063g, value, this.f149064h, new C15858Q(this.f149063g.z(), value));
        }
    }

    public static final Function0<InterfaceC15440j> a(C15429A c15429a, Function1<? super w, Unit> function1, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:44)");
        }
        z1 z1VarP = o1.p(function1, composer, (i10 >> 3) & 14);
        if ((((i10 & 14) ^ 6) > 4 && composer.V(c15429a)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            androidx.compose.foundation.lazy.a aVar = new androidx.compose.foundation.lazy.a();
            objB = new PropertyReference0Impl(o1.d(o1.o(), new c(o1.d(o1.o(), new b(z1VarP)), c15429a, aVar))) { // from class: l0.l.a
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
