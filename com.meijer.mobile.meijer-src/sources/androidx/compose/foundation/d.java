package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.semantics.Role;
import d0.InterfaceC13561B;
import g1.J;
import kotlin.C13904L;
import kotlin.InterfaceC13893A;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\u00020\r*\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JN\u0010\u0014\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0004ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/d;", "Landroidx/compose/foundation/a;", "Lh0/l;", "interactionSource", "Ld0/B;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lg1/J;", "Y2", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p3", "(Lh0/l;Ld0/B;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "Le1/b;", "event", "i3", "(Landroid/view/KeyEvent;)Z", "j3", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class d extends androidx.compose.foundation.a {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "offset", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.ClickableNode$clickPointerInput$2", f = "Clickable.kt", l = {696}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f48289a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f48290b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f48291c;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13893A interfaceC13893A, U0.f fVar, Continuation<? super Unit> continuation) {
            return d(interfaceC13893A, fVar.getPackedValue(), continuation);
        }

        public final Object d(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f48290b = interfaceC13893A;
            aVar.f48291c = j10;
            return aVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f48289a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC13893A interfaceC13893A = (InterfaceC13893A) this.f48290b;
                long j10 = this.f48291c;
                if (d.this.getEnabled()) {
                    d dVar = d.this;
                    this.f48289a = 1;
                    if (dVar.f3(interfaceC13893A, j10, this) == objF) {
                        return objF;
                    }
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<U0.f, Unit> {
        b() {
            super(1);
        }

        public final void a(long j10) {
            if (d.this.getEnabled()) {
                d.this.e3().invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
            a(fVar.getPackedValue());
            return Unit.f143329a;
        }
    }

    public /* synthetic */ d(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, interfaceC13561B, z10, str, role, function0);
    }

    @Override // androidx.compose.foundation.a
    protected final boolean i3(KeyEvent event) {
        return false;
    }

    private d(h0.l lVar, InterfaceC13561B interfaceC13561B, boolean z10, String str, Role role, Function0<Unit> function0) {
        super(lVar, interfaceC13561B, z10, str, role, function0, null);
    }

    static /* synthetic */ Object o3(d dVar, J j10, Continuation<? super Unit> continuation) {
        Object objK = C13904L.k(j10, dVar.new a(null), dVar.new b(), continuation);
        return objK == IntrinsicsKt.f() ? objK : Unit.f143329a;
    }

    @Override // androidx.compose.foundation.a
    public Object Y2(J j10, Continuation<? super Unit> continuation) {
        return o3(this, j10, continuation);
    }

    @Override // androidx.compose.foundation.a
    protected final boolean j3(KeyEvent event) {
        e3().invoke();
        return true;
    }

    public final void p3(h0.l interactionSource, InterfaceC13561B indicationNodeFactory, boolean enabled, String onClickLabel, Role role, Function0<Unit> onClick) {
        n3(interactionSource, indicationNodeFactory, enabled, onClickLabel, role, onClick);
    }
}
