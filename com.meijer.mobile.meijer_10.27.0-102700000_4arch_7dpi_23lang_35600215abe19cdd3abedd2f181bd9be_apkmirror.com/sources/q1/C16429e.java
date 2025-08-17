package q1;

import android.os.CancellationSignal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import qv.C0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqv/O;", "Landroid/os/CancellationSignal;", "signal", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lqv/C0;", "c", "(Lqv/O;Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function2;)Lqv/C0;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: q1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16429e {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: q1.e$a */
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f156677f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CancellationSignal cancellationSignal) {
            super(1);
            this.f156677f = cancellationSignal;
        }

        public final void a(Throwable th2) {
            if (th2 != null) {
                this.f156677f.cancel();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0 c(InterfaceC16622O interfaceC16622O, CancellationSignal cancellationSignal, Function2<? super InterfaceC16622O, ? super Continuation<? super Unit>, ? extends Object> function2) {
        final C0 c0D = C16648k.d(interfaceC16622O, null, null, function2, 3, null);
        c0D.K(new a(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: q1.d
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                C16429e.d(c0D);
            }
        });
        return c0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0 c02) {
        C0.a.a(c02, null, 1, null);
    }
}
