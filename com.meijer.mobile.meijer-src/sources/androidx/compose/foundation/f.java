package androidx.compose.foundation;

import V0.C5489q0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.C5966u;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.InterfaceC5965t;
import d0.InterfaceC13561B;
import h0.n;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/f;", "Ld0/B;", "<init>", "()V", "Lh0/j;", "interactionSource", "Landroidx/compose/ui/node/j;", "a", "(Lh0/j;)Landroidx/compose/ui/node/j;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f implements InterfaceC13561B {

    /* renamed from: a, reason: collision with root package name */
    public static final f f48317a = new f();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/f$a;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/t;", "Lh0/j;", "interactionSource", "<init>", "(Lh0/j;)V", "", "t2", "()V", "LX0/c;", "I", "(LX0/c;)V", "o", "Lh0/j;", "", "p", "Z", "isPressed", "q", "isHovered", "r", "isFocused", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a extends Modifier.c implements InterfaceC5965t {

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final h0.j interactionSource;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean isPressed;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean isHovered;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean isFocused;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.f$a$a, reason: collision with other inner class name */
        static final class C0993a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f48322a;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.f$a$a$a, reason: collision with other inner class name */
            static final class C0994a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f48324a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f48325b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.IntRef f48326c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ a f48327d;

                C0994a(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.IntRef intRef3, a aVar) {
                    this.f48324a = intRef;
                    this.f48325b = intRef2;
                    this.f48326c = intRef3;
                    this.f48327d = aVar;
                }

                @Override // pv.InterfaceC16562g
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                    boolean z10 = true;
                    if (iVar instanceof n.b) {
                        this.f48324a.f143740a++;
                    } else if (iVar instanceof n.c) {
                        Ref.IntRef intRef = this.f48324a;
                        intRef.f143740a--;
                    } else if (iVar instanceof n.a) {
                        Ref.IntRef intRef2 = this.f48324a;
                        intRef2.f143740a--;
                    } else if (iVar instanceof h0.g) {
                        this.f48325b.f143740a++;
                    } else if (iVar instanceof h0.h) {
                        Ref.IntRef intRef3 = this.f48325b;
                        intRef3.f143740a--;
                    } else if (iVar instanceof h0.d) {
                        this.f48326c.f143740a++;
                    } else if (iVar instanceof h0.e) {
                        Ref.IntRef intRef4 = this.f48326c;
                        intRef4.f143740a--;
                    }
                    boolean z11 = false;
                    boolean z12 = this.f48324a.f143740a > 0;
                    boolean z13 = this.f48325b.f143740a > 0;
                    boolean z14 = this.f48326c.f143740a > 0;
                    if (this.f48327d.isPressed != z12) {
                        this.f48327d.isPressed = z12;
                        z11 = true;
                    }
                    if (this.f48327d.isHovered != z13) {
                        this.f48327d.isHovered = z13;
                        z11 = true;
                    }
                    if (this.f48327d.isFocused != z14) {
                        this.f48327d.isFocused = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        C5966u.a(this.f48327d);
                    }
                    return Unit.f143329a;
                }
            }

            C0993a(Continuation<? super C0993a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return a.this.new C0993a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0993a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f48322a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Ref.IntRef intRef = new Ref.IntRef();
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    Ref.IntRef intRef3 = new Ref.IntRef();
                    InterfaceC16561f<h0.i> interfaceC16561fB = a.this.interactionSource.b();
                    C0994a c0994a = new C0994a(intRef, intRef2, intRef3, a.this);
                    this.f48322a = 1;
                    if (interfaceC16561fB.collect(c0994a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Override // androidx.compose.ui.node.InterfaceC5965t
        public void I(X0.c cVar) {
            cVar.a2();
            if (this.isPressed) {
                X0.f.i1(cVar, C5489q0.q(C5489q0.INSTANCE.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.b(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered || this.isFocused) {
                X0.f.i1(cVar, C5489q0.q(C5489q0.INSTANCE.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.b(), 0.0f, null, null, 0, 122, null);
            }
        }

        public a(h0.j jVar) {
            this.interactionSource = jVar;
        }

        @Override // androidx.compose.ui.Modifier.c
        public void t2() {
            C15809k.d(j2(), null, null, new C0993a(null), 3, null);
        }
    }

    public boolean equals(Object other) {
        return other == this;
    }

    @Override // d0.InterfaceC13561B
    public int hashCode() {
        return -1;
    }

    @Override // d0.InterfaceC13561B
    public InterfaceC5956j a(h0.j interactionSource) {
        return new a(interactionSource);
    }

    private f() {
    }
}
