package h0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import h0.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh0/j;", "Landroidx/compose/runtime/z1;", "", "a", "(Lh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f134630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f134631b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f134632c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h0.o$a$a, reason: collision with other inner class name */
        static final class C2134a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<n.b> f134633a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f134634b;

            C2134a(List<n.b> list, InterfaceC5872l0<Boolean> interfaceC5872l0) {
                this.f134633a = list;
                this.f134634b = interfaceC5872l0;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof n.b) {
                    this.f134633a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f134633a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f134633a.remove(((n.a) iVar).getPress());
                }
                this.f134634b.setValue(Boxing.a(!this.f134633a.isEmpty()));
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, InterfaceC5872l0<Boolean> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f134631b = jVar;
            this.f134632c = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f134631b, this.f134632c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f134630a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC16561f<i> interfaceC16561fB = this.f134631b.b();
                C2134a c2134a = new C2134a(arrayList, this.f134632c);
                this.f134630a = 1;
                if (interfaceC16561fB.collect(c2134a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final z1<Boolean> a(j jVar, Composer composer, int i10) {
        boolean z10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1692965168, i10, -1, "androidx.compose.foundation.interaction.collectIsPressedAsState (PressInteraction.kt:80)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(Boolean.FALSE, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        int i11 = i10 & 14;
        if (((i11 ^ 6) > 4 && composer.V(jVar)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object objB2 = composer.B();
        if (z10 || objB2 == companion.a()) {
            objB2 = new a(jVar, interfaceC5872l0, null);
            composer.t(objB2);
        }
        J.g(jVar, (Function2) objB2, composer, i11);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5872l0;
    }
}
