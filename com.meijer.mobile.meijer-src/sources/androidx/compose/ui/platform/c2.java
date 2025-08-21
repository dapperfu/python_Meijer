package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5867j;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/ui/platform/c2;", "Landroidx/compose/runtime/j;", "Landroidx/lifecycle/p;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "original", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/j;)V", "Lkotlin/Function0;", "", "content", "d", "(Lkotlin/jvm/functions/Function2;)V", "dispose", "()V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "A", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroidx/compose/runtime/j;", "y", "()Landroidx/compose/runtime/j;", "", "c", "Z", "disposed", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/l;", "addedToLifecycle", "e", "Lkotlin/jvm/functions/Function2;", "lastContent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c2 implements InterfaceC5867j, InterfaceC6169p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5867j original;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC6165l addedToLifecycle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Composer, ? super Integer, Unit> lastContent = C6031s0.f52366a.a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<AndroidComposeView.C5973b, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f52273g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.platform.c2$a$a, reason: collision with other inner class name */
        static final class C1076a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ c2 f52274f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f52275g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.c2$a$a$a, reason: collision with other inner class name */
            static final class C1077a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f52276a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c2 f52277b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1077a(c2 c2Var, Continuation<? super C1077a> continuation) {
                    super(2, continuation);
                    this.f52277b = c2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C1077a(this.f52277b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C1077a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f52276a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        AndroidComposeView owner = this.f52277b.getOwner();
                        this.f52276a = 1;
                        if (owner.k0(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {137}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.c2$a$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f52278a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ c2 f52279b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(c2 c2Var, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f52279b = c2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f52279b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f52278a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        AndroidComposeView owner = this.f52279b.getOwner();
                        this.f52278a = 1;
                        if (owner.l0(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.ui.platform.c2$a$a$c */
            static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ c2 f52280f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f52281g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(c2 c2Var, Function2<? super Composer, ? super Integer, Unit> function2) {
                    super(2);
                    this.f52280f = c2Var;
                    this.f52281g = function2;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1193460702, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:139)");
                    }
                    AndroidCompositionLocals_androidKt.a(this.f52280f.getOwner(), this.f52281g, composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1076a(c2 c2Var, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f52274f = c2Var;
                this.f52275g = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-2000640158, i10, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:123)");
                }
                Object tag = this.f52274f.getOwner().getTag(P0.k.f25225K);
                Set<O0.a> set = TypeIntrinsics.q(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.f52274f.getOwner().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(P0.k.f25225K) : null;
                    set = TypeIntrinsics.q(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(composer.C());
                    composer.y();
                }
                AndroidComposeView owner = this.f52274f.getOwner();
                boolean zD = composer.D(this.f52274f);
                c2 c2Var = this.f52274f;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1077a(c2Var, null);
                    composer.t(objB);
                }
                androidx.compose.runtime.J.g(owner, (Function2) objB, composer, 0);
                AndroidComposeView owner2 = this.f52274f.getOwner();
                boolean zD2 = composer.D(this.f52274f);
                c2 c2Var2 = this.f52274f;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(c2Var2, null);
                    composer.t(objB2);
                }
                androidx.compose.runtime.J.g(owner2, (Function2) objB2, composer, 0);
                androidx.compose.runtime.r.a(O0.e.a().d(set), ComposableLambdaKt.c(-1193460702, true, new c(this.f52274f, this.f52275g), composer, 54), composer, androidx.compose.runtime.G0.f50200i | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Composer, ? super Integer, Unit> function2) {
            super(1);
            this.f52273g = function2;
        }

        public final void a(AndroidComposeView.C5973b c5973b) {
            if (c2.this.disposed) {
                return;
            }
            AbstractC6165l lifecycle = c5973b.getLifecycleOwner().getLifecycle();
            c2.this.lastContent = this.f52273g;
            if (c2.this.addedToLifecycle == null) {
                c2.this.addedToLifecycle = lifecycle;
                lifecycle.a(c2.this);
            } else if (lifecycle.getState().b(AbstractC6165l.b.f55501c)) {
                c2.this.getOriginal().d(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new C1076a(c2.this, this.f52273g)));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.C5973b c5973b) {
            a(c5973b);
            return Unit.f143329a;
        }
    }

    /* renamed from: A, reason: from getter */
    public final AndroidComposeView getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.InterfaceC5867j
    public void d(Function2<? super Composer, ? super Integer, Unit> content) {
        this.owner.setOnViewTreeOwnersAvailable(new a(content));
    }

    @Override // androidx.compose.runtime.InterfaceC5867j
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.getView().setTag(P0.k.f25226L, null);
            AbstractC6165l abstractC6165l = this.addedToLifecycle;
            if (abstractC6165l != null) {
                abstractC6165l.d(this);
            }
        }
        this.original.dispose();
    }

    @Override // androidx.view.InterfaceC6169p
    public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
        if (event == AbstractC6165l.a.ON_DESTROY) {
            dispose();
        } else {
            if (event != AbstractC6165l.a.ON_CREATE || this.disposed) {
                return;
            }
            d(this.lastContent);
        }
    }

    /* renamed from: y, reason: from getter */
    public final InterfaceC5867j getOriginal() {
        return this.original;
    }

    public c2(AndroidComposeView androidComposeView, InterfaceC5867j interfaceC5867j) {
        this.owner = androidComposeView;
        this.original = interfaceC5867j;
    }
}
