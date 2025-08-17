package s0;

import androidx.compose.ui.focus.B;
import androidx.compose.ui.focus.E;
import androidx.compose.ui.focus.InterfaceC5766i;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.q0;
import g1.C14185q;
import g1.EnumC14186s;
import g1.InterfaceC14171c;
import g1.J;
import g1.U;
import g1.W;
import kotlin.C13821t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020%8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Ls0/a;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/q0;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/focus/B;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/E;", "focusState", "U", "(Landroidx/compose/ui/focus/E;)V", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "v1", "()V", "q", "Lkotlin/jvm/functions/Function0;", "R2", "()Lkotlin/jvm/functions/Function0;", "S2", "", "r", "Z", "focused", "Lg1/W;", "s", "Lg1/W;", "suspendingPointerInputModifierNode", "Landroidx/compose/ui/node/y0;", "b1", "()J", "touchBoundsExpansion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C16843a extends AbstractC5817m implements q0, InterfaceC5766i, B {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onHandwritingSlopExceeded;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean focused;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final W suspendingPointerInputModifierNode = (W) K2(U.a(new C2493a()));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s0.a$a, reason: collision with other inner class name */
    static final class C2493a implements PointerInputEventHandler {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", l = {105, 133, 171}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: s0.a$a$a, reason: collision with other inner class name */
        static final class C2494a extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

            /* renamed from: b, reason: collision with root package name */
            Object f159829b;

            /* renamed from: c, reason: collision with root package name */
            Object f159830c;

            /* renamed from: d, reason: collision with root package name */
            int f159831d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f159832e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C16843a f159833f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2494a(C16843a c16843a, Continuation<? super C2494a> continuation) {
                super(2, continuation);
                this.f159833f = c16843a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2494a c2494a = new C2494a(this.f159833f, continuation);
                c2494a.f159832e = obj;
                return c2494a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r8 == r1) goto L74;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
            
                if (r9 != r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x01a6, code lost:
            
                if (r5 != r1) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01a8, code lost:
            
                return r1;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f4 -> B:42:0x00f8). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01a6 -> B:75:0x01a9). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 495
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: s0.C16843a.C2493a.C2494a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
                return ((C2494a) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
            }
        }

        C2493a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            Object objD = C13821t.d(j10, new C2494a(C16843a.this, null), continuation);
            return objD == IntrinsicsKt.f() ? objD : Unit.f142422a;
        }
    }

    public final Function0<Unit> R2() {
        return this.onHandwritingSlopExceeded;
    }

    public final void S2(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14185q pointerEvent, EnumC14186s pass, long bounds) {
        this.suspendingPointerInputModifierNode.s1(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        this.suspendingPointerInputModifierNode.v1();
    }

    public C16843a(Function0<Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.focus.InterfaceC5766i
    public void U(E focusState) {
        this.focused = focusState.a();
    }

    @Override // androidx.compose.ui.node.q0
    public long b1() {
        return androidx.compose.foundation.text.handwriting.a.a().a(C5815k.k(this));
    }
}
