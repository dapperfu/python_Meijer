package b5;

import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.InterfaceC15560j;
import m5.Size;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb5/l;", "Lm5/j;", "Landroidx/compose/ui/layout/B;", "<init>", "()V", "Lm5/i;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "y", "(J)V", "Ltv/B;", "Ltv/B;", "currentConstraints", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class l implements InterfaceC15560j, androidx.compose.ui.layout.B {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<H1.b> currentConstraints = S.a(H1.b.a(F.h()));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a implements InterfaceC17152f<Size> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f59853a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        @SourceDebugExtension
        /* renamed from: b5.l$a$a, reason: collision with other inner class name */
        public static final class C1179a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f59854a;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2", f = "ConstraintsSizeResolver.kt", l = {221}, m = "emit")
            /* renamed from: b5.l$a$a$a, reason: collision with other inner class name */
            public static final class C1180a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f59855a;

                /* renamed from: b, reason: collision with root package name */
                int f59856b;

                public C1180a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f59855a = obj;
                    this.f59856b |= Integer.MIN_VALUE;
                    return C1179a.this.emit(null, this);
                }
            }

            public C1179a(InterfaceC17153g interfaceC17153g) {
                this.f59854a = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof b5.l.a.C1179a.C1180a
                    if (r0 == 0) goto L13
                    r0 = r8
                    b5.l$a$a$a r0 = (b5.l.a.C1179a.C1180a) r0
                    int r1 = r0.f59856b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f59856b = r1
                    goto L18
                L13:
                    b5.l$a$a$a r0 = new b5.l$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f59855a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f59856b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.ResultKt.b(r8)
                    tv.g r8 = r6.f59854a
                    H1.b r7 = (H1.b) r7
                    long r4 = r7.getValue()
                    m5.i r7 = b5.F.p(r4)
                    if (r7 == 0) goto L4b
                    r0.f59856b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: b5.l.a.C1179a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(InterfaceC17152f interfaceC17152f) {
            this.f59853a = interfaceC17152f;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super Size> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f59853a.collect(new C1179a(interfaceC17153g), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(f0 f0Var, f0.a aVar) {
        f0.a.h(aVar, f0Var, 0, 0, 0.0f, 4, null);
        return Unit.f142422a;
    }

    @Override // androidx.compose.ui.layout.B
    public J a(K k10, I i10, long j10) {
        this.currentConstraints.setValue(H1.b.a(j10));
        final f0 f0VarK0 = i10.k0(j10);
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new Function1() { // from class: b5.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.x(f0VarK0, (f0.a) obj);
            }
        }, 4, null);
    }

    @Override // m5.InterfaceC15560j
    public Object b(Continuation<? super Size> continuation) {
        return C17154h.A(new a(this.currentConstraints), continuation);
    }

    public final void y(long constraints) {
        this.currentConstraints.setValue(H1.b.a(constraints));
    }
}
