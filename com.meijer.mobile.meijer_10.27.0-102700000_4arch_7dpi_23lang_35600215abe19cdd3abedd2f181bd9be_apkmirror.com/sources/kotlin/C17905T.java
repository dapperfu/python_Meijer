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
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lx0/T;", "Lx0/u0;", "LH1/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh0/j;", "interactionSource", "Landroidx/compose/runtime/z1;", "a", "(Lh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "b", "c", "d", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17905T implements InterfaceC17978u0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {272}, m = "invokeSuspend")
    /* renamed from: x0.T$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17980v0 f167417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17905T f167418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C17980v0 c17980v0, C17905T c17905t, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f167417b = c17980v0;
            this.f167418c = c17905t;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f167417b, this.f167418c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167416a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C17980v0 c17980v0 = this.f167417b;
                float f10 = this.f167418c.defaultElevation;
                float f11 = this.f167418c.pressedElevation;
                float f12 = this.f167418c.hoveredElevation;
                float f13 = this.f167418c.focusedElevation;
                this.f167416a = 1;
                if (c17980v0.f(f10, f11, f12, f13, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {282}, m = "invokeSuspend")
    /* renamed from: x0.T$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167419a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f167420b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h0.j f167421c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17980v0 f167422d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.T$b$a */
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<h0.i> f167423a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f167424b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17980v0 f167425c;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", l = {HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT}, m = "invokeSuspend")
            /* renamed from: x0.T$b$a$a, reason: collision with other inner class name */
            static final class C2661a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f167426a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17980v0 f167427b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ h0.i f167428c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2661a(C17980v0 c17980v0, h0.i iVar, Continuation<? super C2661a> continuation) {
                    super(2, continuation);
                    this.f167427b = c17980v0;
                    this.f167428c = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C2661a(this.f167427b, this.f167428c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C2661a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f167426a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17980v0 c17980v0 = this.f167427b;
                        h0.i iVar = this.f167428c;
                        this.f167426a = 1;
                        if (c17980v0.b(iVar, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(List<h0.i> list, InterfaceC16622O interfaceC16622O, C17980v0 c17980v0) {
                this.f167423a = list;
                this.f167424b = interfaceC16622O;
                this.f167425c = c17980v0;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof h0.g) {
                    this.f167423a.add(iVar);
                } else if (iVar instanceof h0.h) {
                    this.f167423a.remove(((h0.h) iVar).getEnter());
                } else if (iVar instanceof h0.d) {
                    this.f167423a.add(iVar);
                } else if (iVar instanceof h0.e) {
                    this.f167423a.remove(((h0.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f167423a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f167423a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f167423a.remove(((n.a) iVar).getPress());
                }
                C16648k.d(this.f167424b, null, null, new C2661a(this.f167425c, (h0.i) CollectionsKt.F0(this.f167423a), null), 3, null);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h0.j jVar, C17980v0 c17980v0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f167421c = jVar;
            this.f167422d = c17980v0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f167421c, this.f167422d, continuation);
            bVar.f167420b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167419a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f167420b;
                ArrayList arrayList = new ArrayList();
                InterfaceC17152f<h0.i> interfaceC17152fB = this.f167421c.b();
                a aVar = new a(arrayList, interfaceC16622O, this.f167422d);
                this.f167419a = 1;
                if (interfaceC17152fB.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public /* synthetic */ C17905T(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private C17905T(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
    }

    @Override // kotlin.InterfaceC17978u0
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
            Object c17980v0 = new C17980v0(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            composer.t(c17980v0);
            objB = c17980v0;
        }
        C17980v0 c17980v02 = (C17980v0) objB;
        boolean zD = composer.D(c17980v02) | ((((i10 & 112) ^ 48) > 32 && composer.V(this)) || (i10 & 48) == 32);
        Object objB2 = composer.B();
        if (zD || objB2 == Composer.INSTANCE.a()) {
            objB2 = new a(c17980v02, this, null);
            composer.t(objB2);
        }
        J.g(this, (Function2) objB2, composer, (i10 >> 3) & 14);
        boolean zD2 = composer.D(c17980v02) | ((i12 > 4 && composer.V(jVar)) || (i10 & 6) == 4);
        Object objB3 = composer.B();
        if (zD2 || objB3 == Composer.INSTANCE.a()) {
            objB3 = new b(jVar, c17980v02, null);
            composer.t(objB3);
        }
        J.g(jVar, (Function2) objB3, composer, i11);
        z1<H1.h> z1VarC = c17980v02.c();
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
        if (!(other instanceof C17905T)) {
            return false;
        }
        C17905T c17905t = (C17905T) other;
        if (H1.h.u(this.defaultElevation, c17905t.defaultElevation) && H1.h.u(this.pressedElevation, c17905t.pressedElevation) && H1.h.u(this.hoveredElevation, c17905t.hoveredElevation)) {
            return H1.h.u(this.focusedElevation, c17905t.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((H1.h.w(this.defaultElevation) * 31) + H1.h.w(this.pressedElevation)) * 31) + H1.h.w(this.hoveredElevation)) * 31) + H1.h.w(this.focusedElevation);
    }
}
