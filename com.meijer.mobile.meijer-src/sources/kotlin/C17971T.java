package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.z1;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import h0.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lx0/T;", "Lx0/u0;", "LH1/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh0/j;", "interactionSource", "Landroidx/compose/runtime/z1;", "a", "(Lh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "b", "c", "d", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17971T implements InterfaceC18044u0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {272}, m = "invokeSuspend")
    /* renamed from: x0.T$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168504a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18046v0 f168505b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17971T f168506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C18046v0 c18046v0, C17971T c17971t, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f168505b = c18046v0;
            this.f168506c = c17971t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f168505b, this.f168506c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168504a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18046v0 c18046v0 = this.f168505b;
                float f10 = this.f168506c.defaultElevation;
                float f11 = this.f168506c.pressedElevation;
                float f12 = this.f168506c.hoveredElevation;
                float f13 = this.f168506c.focusedElevation;
                this.f168504a = 1;
                if (c18046v0.f(f10, f11, f12, f13, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {282}, m = "invokeSuspend")
    /* renamed from: x0.T$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168507a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f168508b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.j f168509c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C18046v0 f168510d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.T$b$a */
        static final class a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<h0.i> f168511a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f168512b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18046v0 f168513c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", l = {HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT}, m = "invokeSuspend")
            /* renamed from: x0.T$b$a$a, reason: collision with other inner class name */
            static final class C2685a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f168514a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C18046v0 f168515b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ h0.i f168516c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2685a(C18046v0 c18046v0, h0.i iVar, Continuation<? super C2685a> continuation) {
                    super(2, continuation);
                    this.f168515b = c18046v0;
                    this.f168516c = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2685a(this.f168515b, this.f168516c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((C2685a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f168514a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C18046v0 c18046v0 = this.f168515b;
                        h0.i iVar = this.f168516c;
                        this.f168514a = 1;
                        if (c18046v0.b(iVar, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(List<h0.i> list, InterfaceC15783O interfaceC15783O, C18046v0 c18046v0) {
                this.f168511a = list;
                this.f168512b = interfaceC15783O;
                this.f168513c = c18046v0;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof h0.g) {
                    this.f168511a.add(iVar);
                } else if (iVar instanceof h0.h) {
                    this.f168511a.remove(((h0.h) iVar).getEnter());
                } else if (iVar instanceof h0.d) {
                    this.f168511a.add(iVar);
                } else if (iVar instanceof h0.e) {
                    this.f168511a.remove(((h0.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f168511a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f168511a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f168511a.remove(((n.a) iVar).getPress());
                }
                C15809k.d(this.f168512b, null, null, new C2685a(this.f168513c, (h0.i) CollectionsKt.F0(this.f168511a), null), 3, null);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0.j jVar, C18046v0 c18046v0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f168509c = jVar;
            this.f168510d = c18046v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f168509c, this.f168510d, continuation);
            bVar.f168508b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168507a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f168508b;
                ArrayList arrayList = new ArrayList();
                InterfaceC16561f<h0.i> interfaceC16561fB = this.f168509c.b();
                a aVar = new a(arrayList, interfaceC15783O, this.f168510d);
                this.f168507a = 1;
                if (interfaceC16561fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public /* synthetic */ C17971T(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private C17971T(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
    }

    @Override // kotlin.InterfaceC18044u0
    public z1<H1.h> a(h0.j jVar, Composer composer, int i10) {
        composer.startReplaceGroup(-478475335);
        if (ComposerKt.M()) {
            ComposerKt.U(-478475335, i10, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && composer.V(jVar)) || (i10 & 6) == 4;
        Object objB = composer.B();
        if (z10 || objB == Composer.INSTANCE.a()) {
            Object c18046v0 = new C18046v0(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.t(c18046v0);
            objB = c18046v0;
        }
        C18046v0 c18046v02 = (C18046v0) objB;
        boolean zD = composer.D(c18046v02) | ((((i10 & 112) ^ 48) > 32 && composer.V(this)) || (i10 & 48) == 32);
        Object objB2 = composer.B();
        if (zD || objB2 == Composer.INSTANCE.a()) {
            objB2 = new a(c18046v02, this, null);
            composer.t(objB2);
        }
        J.g(this, (Function2) objB2, composer, (i10 >> 3) & 14);
        boolean zD2 = composer.D(c18046v02) | ((i12 > 4 && composer.V(jVar)) || (i10 & 6) == 4);
        Object objB3 = composer.B();
        if (zD2 || objB3 == Composer.INSTANCE.a()) {
            objB3 = new b(jVar, c18046v02, null);
            composer.t(objB3);
        }
        J.g(jVar, (Function2) objB3, composer, i11);
        z1<H1.h> z1VarC = c18046v02.c();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17971T)) {
            return false;
        }
        C17971T c17971t = (C17971T) other;
        if (H1.h.u(this.defaultElevation, c17971t.defaultElevation) && H1.h.u(this.pressedElevation, c17971t.pressedElevation) && H1.h.u(this.hoveredElevation, c17971t.hoveredElevation)) {
            return H1.h.u(this.focusedElevation, c17971t.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((H1.h.w(this.defaultElevation) * 31) + H1.h.w(this.pressedElevation)) * 31) + H1.h.w(this.hoveredElevation)) * 31) + H1.h.w(this.focusedElevation);
    }
}
