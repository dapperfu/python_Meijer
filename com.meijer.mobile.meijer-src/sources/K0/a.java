package K0;

import Lu.g;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "T", "Lio/reactivex/l;", "initial", "Landroidx/compose/runtime/z1;", "a", "(Lio/reactivex/l;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "runtime-rxjava2_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K0.a$a, reason: collision with other inner class name */
    static final class C0269a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f16246a;

        @Override // Lu.g
        public final /* synthetic */ void accept(Object obj) {
            this.f16246a.invoke(obj);
        }

        C0269a(Function1 function1) {
            this.f16246a = function1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "S", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class b extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f16247f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0 f16248g;

        /* JADX INFO: Add missing generic type declarations: [R] */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "S", "it", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: K0.a$b$a, reason: collision with other inner class name */
        public static final class C0270a<R> extends Lambda implements Function1<R, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0 f16249f;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C0270a<R>) obj);
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0270a(InterfaceC5872l0 interfaceC5872l0) {
                super(1);
                this.f16249f = interfaceC5872l0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(R r10) {
                this.f16249f.setValue(r10);
            }
        }

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/DisposableEffectScope$onDispose$1", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: K0.a$b$b, reason: collision with other inner class name */
        public static final class C0271b implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ju.b f16250a;

            public C0271b(Ju.b bVar) {
                this.f16250a = bVar;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f16250a.dispose();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, InterfaceC5872l0 interfaceC5872l0) {
            super(1);
            this.f16247f = obj;
            this.f16248g = interfaceC5872l0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            return new C0271b(((l) this.f16247f).subscribe(new C0269a(new C0270a(this.f16248g))));
        }
    }

    public static final <R, T extends R> z1<R> a(l<T> lVar, R r10, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1018254449, i10, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:48)");
        }
        int i11 = (i10 & 112) | (i10 & 14) | (((i10 >> 3) & 8) << 3);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = t1.e(r10, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        J.c(lVar, new b(lVar, interfaceC5872l0), composer, i11 & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5872l0;
    }
}
