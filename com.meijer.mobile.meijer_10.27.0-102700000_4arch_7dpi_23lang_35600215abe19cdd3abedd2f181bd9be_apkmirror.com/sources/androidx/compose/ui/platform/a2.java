package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.C0;
import qv.C16648k;
import qv.C16671v0;
import qv.InterfaceC16622O;
import rv.C16841f;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/a2;", "", "<init>", "()V", "Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "a", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/platform/Z1;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "factory", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a2 f51997a = new a2();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final AtomicReference<Z1> factory = new AtomicReference<>(Z1.INSTANCE.c());

    /* renamed from: c, reason: collision with root package name */
    public static final int f51999c = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/a2$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ qv.C0 f52000a;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
        }

        a(qv.C0 c02) {
            this.f52000a = c02;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            v10.removeOnAttachStateChangeListener(this);
            C0.a.a(this.f52000a, null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {227}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f52001a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Recomposer f52002b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f52003c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Recomposer recomposer, View view, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f52002b = recomposer;
            this.f52003c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f52002b, this.f52003c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            View view;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f52001a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Recomposer recomposer = this.f52002b;
                    this.f52001a = 1;
                    if (recomposer.m0(this) == objF) {
                        return objF;
                    }
                }
                if (b2.f(view) == this.f52002b) {
                    b2.i(this.f52003c, null);
                }
                return Unit.f142422a;
            } finally {
                if (b2.f(this.f52003c) == this.f52002b) {
                    b2.i(this.f52003c, null);
                }
            }
        }
    }

    public final Recomposer a(View rootView) {
        Recomposer recomposerA = factory.get().a(rootView);
        b2.i(rootView, recomposerA);
        rootView.addOnAttachStateChangeListener(new a(C16648k.d(C16671v0.f157699a, C16841f.b(rootView.getHandler(), "windowRecomposer cleanup").Y0(), null, new b(recomposerA, rootView, null), 2, null)));
        return recomposerA;
    }

    private a2() {
    }
}
