package Qi;

import Ki.LocalThemeScope;
import Oi.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.EnumC17961N0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010RR\u0010\u001c\u001a=\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0012\"\u0012 \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0002\b\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u00148\n@\nX\u008a\u008e\u0002"}, d2 = {"LQi/b0;", "LOi/c;", "LOi/l$d;", "state", "<init>", "(LOi/l$d;)V", "", "d", "()Z", "LKi/M;", "", "f", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "a", "LOi/l$d;", "n", "()LOi/l$d;", "Lkotlin/Function3;", "Lmv/O;", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "b", "Lkotlin/jvm/functions/Function5;", "m", "()Lkotlin/jvm/functions/Function5;", "content", "getName", "()Ljava/lang/String;", "name", "bottomSheetToShow", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qi.b0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4769b0 implements Oi.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.d state;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> content;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qi.b0$a */
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30036a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C17959M0 f30037b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30038c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30039d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30040e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f30041f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f30042g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f30043h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ C4769b0 f30044i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f30045j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f30046k;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$a, reason: collision with other inner class name */
        static final class C0595a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30047a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30048b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30049c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30050d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30051e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$1$1$1", f = "BottomSheetShowcase.kt", l = {209}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$a$a, reason: collision with other inner class name */
            static final class C0596a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30052a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30053b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30054c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30055d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0596a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0596a> continuation) {
                    super(2, continuation);
                    this.f30054c = c17959m0;
                    this.f30055d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0596a c0596a = new C0596a(this.f30054c, this.f30055d, continuation);
                    c0596a.f30053b = obj;
                    return c0596a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0596a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30052a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30055d, (String) this.f30053b);
                        C17959M0 c17959m0 = this.f30054c;
                        this.f30052a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            C0595a(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30047a = c4769b0;
                this.f30048b = localThemeScope;
                this.f30049c = interfaceC15783O;
                this.f30050d = c17959m0;
                this.f30051e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(678510964, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:206)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30047a.m();
                LocalThemeScope localThemeScope = this.f30048b;
                InterfaceC15783O interfaceC15783O = this.f30049c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30050d);
                C17959M0 c17959m0 = this.f30050d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30051e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0596a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$b */
        static final class b implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30056a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30057b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30058c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30059d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30060e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$2$1$1", f = "BottomSheetShowcase.kt", l = {221}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$b$a, reason: collision with other inner class name */
            static final class C0597a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30061a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30062b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30063c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30064d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0597a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0597a> continuation) {
                    super(2, continuation);
                    this.f30063c = c17959m0;
                    this.f30064d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0597a c0597a = new C0597a(this.f30063c, this.f30064d, continuation);
                    c0597a.f30062b = obj;
                    return c0597a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0597a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30061a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30064d, (String) this.f30062b);
                        C17959M0 c17959m0 = this.f30063c;
                        this.f30061a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            b(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30056a = c4769b0;
                this.f30057b = localThemeScope;
                this.f30058c = interfaceC15783O;
                this.f30059d = c17959m0;
                this.f30060e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1762912303, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:218)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30056a.m();
                LocalThemeScope localThemeScope = this.f30057b;
                InterfaceC15783O interfaceC15783O = this.f30058c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30059d);
                C17959M0 c17959m0 = this.f30059d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30060e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0597a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$c */
        static final class c implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30065a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30066b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30067c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30068d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30069e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$3$1$1", f = "BottomSheetShowcase.kt", l = {233}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$c$a, reason: collision with other inner class name */
            static final class C0598a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30070a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30071b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30072c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30073d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0598a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0598a> continuation) {
                    super(2, continuation);
                    this.f30072c = c17959m0;
                    this.f30073d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0598a c0598a = new C0598a(this.f30072c, this.f30073d, continuation);
                    c0598a.f30071b = obj;
                    return c0598a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0598a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30070a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30073d, (String) this.f30071b);
                        C17959M0 c17959m0 = this.f30072c;
                        this.f30070a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            c(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30065a = c4769b0;
                this.f30066b = localThemeScope;
                this.f30067c = interfaceC15783O;
                this.f30068d = c17959m0;
                this.f30069e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1838222292, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:230)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30065a.m();
                LocalThemeScope localThemeScope = this.f30066b;
                InterfaceC15783O interfaceC15783O = this.f30067c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30068d);
                C17959M0 c17959m0 = this.f30068d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30069e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0598a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$d */
        static final class d implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30074a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30075b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30076c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30077d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30078e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$4$1$1", f = "BottomSheetShowcase.kt", l = {245}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$d$a, reason: collision with other inner class name */
            static final class C0599a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30079a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30080b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30081c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30082d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0599a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0599a> continuation) {
                    super(2, continuation);
                    this.f30081c = c17959m0;
                    this.f30082d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0599a c0599a = new C0599a(this.f30081c, this.f30082d, continuation);
                    c0599a.f30080b = obj;
                    return c0599a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0599a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30079a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30082d, (String) this.f30080b);
                        C17959M0 c17959m0 = this.f30081c;
                        this.f30079a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            d(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30074a = c4769b0;
                this.f30075b = localThemeScope;
                this.f30076c = interfaceC15783O;
                this.f30077d = c17959m0;
                this.f30078e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1735420964, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:242)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30074a.m();
                LocalThemeScope localThemeScope = this.f30075b;
                InterfaceC15783O interfaceC15783O = this.f30076c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30077d);
                C17959M0 c17959m0 = this.f30077d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30078e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0599a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$e */
        static final class e implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30083a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30084b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30085c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30086d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30087e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$5$1$1", f = "BottomSheetShowcase.kt", l = {257}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$e$a, reason: collision with other inner class name */
            static final class C0600a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30088a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30089b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30090c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30091d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0600a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0600a> continuation) {
                    super(2, continuation);
                    this.f30090c = c17959m0;
                    this.f30091d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0600a c0600a = new C0600a(this.f30090c, this.f30091d, continuation);
                    c0600a.f30089b = obj;
                    return c0600a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0600a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30088a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30091d, (String) this.f30089b);
                        C17959M0 c17959m0 = this.f30090c;
                        this.f30088a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            e(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30083a = c4769b0;
                this.f30084b = localThemeScope;
                this.f30085c = interfaceC15783O;
                this.f30086d = c17959m0;
                this.f30087e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-493973387, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:254)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30083a.m();
                LocalThemeScope localThemeScope = this.f30084b;
                InterfaceC15783O interfaceC15783O = this.f30085c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30086d);
                C17959M0 c17959m0 = this.f30086d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30087e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0600a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$f */
        static final class f implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30092a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30093b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30094c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30095d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30096e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$6$1$1", f = "BottomSheetShowcase.kt", l = {269}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$f$a, reason: collision with other inner class name */
            static final class C0601a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30097a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30098b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30099c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30100d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0601a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0601a> continuation) {
                    super(2, continuation);
                    this.f30099c = c17959m0;
                    this.f30100d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0601a c0601a = new C0601a(this.f30099c, this.f30100d, continuation);
                    c0601a.f30098b = obj;
                    return c0601a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0601a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30097a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30100d, (String) this.f30098b);
                        C17959M0 c17959m0 = this.f30099c;
                        this.f30097a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            f(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30092a = c4769b0;
                this.f30093b = localThemeScope;
                this.f30094c = interfaceC15783O;
                this.f30095d = c17959m0;
                this.f30096e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1311023831, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:266)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30092a.m();
                LocalThemeScope localThemeScope = this.f30093b;
                InterfaceC15783O interfaceC15783O = this.f30094c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30095d);
                C17959M0 c17959m0 = this.f30095d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30096e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0601a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Qi.b0$a$g */
        static final class g implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4769b0 f30101a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f30102b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f30103c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30104d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30105e;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$7$1$1", f = "BottomSheetShowcase.kt", l = {281}, m = "invokeSuspend")
            /* renamed from: Qi.b0$a$g$a, reason: collision with other inner class name */
            static final class C0602a extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f30106a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f30107b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C17959M0 f30108c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<String> f30109d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0602a(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super C0602a> continuation) {
                    super(2, continuation);
                    this.f30108c = c17959m0;
                    this.f30109d = interfaceC5872l0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0602a c0602a = new C0602a(this.f30108c, this.f30109d, continuation);
                    c0602a.f30107b = obj;
                    return c0602a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((C0602a) create(str, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f30106a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C4769b0.i(this.f30109d, (String) this.f30107b);
                        C17959M0 c17959m0 = this.f30108c;
                        this.f30106a = 1;
                        if (c17959m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            g(C4769b0 c4769b0, LocalThemeScope localThemeScope, InterfaceC15783O interfaceC15783O, C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0) {
                this.f30101a = c4769b0;
                this.f30102b = localThemeScope;
                this.f30103c = interfaceC15783O;
                this.f30104d = c17959m0;
                this.f30105e = interfaceC5872l0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1331481206, i10, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous>.<anonymous> (BottomSheetShowcase.kt:278)");
                }
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30101a.m();
                LocalThemeScope localThemeScope = this.f30102b;
                InterfaceC15783O interfaceC15783O = this.f30103c;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30104d);
                C17959M0 c17959m0 = this.f30104d;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30105e;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C0602a(c17959m0, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(localThemeScope, interfaceC15783O, (Function2) objB, composer, 0);
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

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase$Content$1$8$1", f = "BottomSheetShowcase.kt", l = {290}, m = "invokeSuspend")
        /* renamed from: Qi.b0$a$h */
        static final class h extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f30110a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f30111b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17959M0 f30112c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<String> f30113d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(C17959M0 c17959m0, InterfaceC5872l0<String> interfaceC5872l0, Continuation<? super h> continuation) {
                super(2, continuation);
                this.f30112c = c17959m0;
                this.f30113d = interfaceC5872l0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                h hVar = new h(this.f30112c, this.f30113d, continuation);
                hVar.f30111b = obj;
                return hVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((h) create(str, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f30110a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C4769b0.i(this.f30113d, (String) this.f30111b);
                    C17959M0 c17959m0 = this.f30112c;
                    this.f30110a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        a(String str, C17959M0 c17959m0, String str2, String str3, String str4, String str5, String str6, String str7, C4769b0 c4769b0, InterfaceC15783O interfaceC15783O, InterfaceC5872l0<String> interfaceC5872l0) {
            this.f30036a = str;
            this.f30037b = c17959m0;
            this.f30038c = str2;
            this.f30039d = str3;
            this.f30040e = str4;
            this.f30041f = str5;
            this.f30042g = str6;
            this.f30043h = str7;
            this.f30044i = c4769b0;
            this.f30045j = interfaceC15783O;
            this.f30046k = interfaceC5872l0;
        }

        public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1460454451, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content.<anonymous> (BottomSheetShowcase.kt:201)");
            }
            String strH = C4769b0.h(this.f30046k);
            if (Intrinsics.e(strH, this.f30036a)) {
                composer.startReplaceGroup(-379756846);
                C17959M0 c17959m0 = this.f30037b;
                F0.S(AdsTheme, c17959m0, ComposableLambdaKt.c(678510964, true, new C0595a(this.f30044i, AdsTheme, this.f30045j, c17959m0, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30038c)) {
                composer.startReplaceGroup(-379329046);
                C17959M0 c17959m02 = this.f30037b;
                F0.c0(AdsTheme, c17959m02, ComposableLambdaKt.c(1762912303, true, new b(this.f30044i, AdsTheme, this.f30045j, c17959m02, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30039d)) {
                composer.startReplaceGroup(-378898673);
                C17959M0 c17959m03 = this.f30037b;
                F0.W(AdsTheme, c17959m03, ComposableLambdaKt.c(-1838222292, true, new c(this.f30044i, AdsTheme, this.f30045j, c17959m03, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30040e)) {
                composer.startReplaceGroup(-378460860);
                C17959M0 c17959m04 = this.f30037b;
                F0.i0(AdsTheme, c17959m04, ComposableLambdaKt.c(-1735420964, true, new d(this.f30044i, AdsTheme, this.f30045j, c17959m04, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30041f)) {
                composer.startReplaceGroup(-378021652);
                C17959M0 c17959m05 = this.f30037b;
                F0.D(AdsTheme, c17959m05, ComposableLambdaKt.c(-493973387, true, new e(this.f30044i, AdsTheme, this.f30045j, c17959m05, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30042g)) {
                composer.startReplaceGroup(-377580894);
                C17959M0 c17959m06 = this.f30037b;
                F0.J(AdsTheme, c17959m06, ComposableLambdaKt.c(1311023831, true, new f(this.f30044i, AdsTheme, this.f30045j, c17959m06, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else if (Intrinsics.e(strH, this.f30043h)) {
                composer.startReplaceGroup(-377130526);
                C17959M0 c17959m07 = this.f30037b;
                F0.O(AdsTheme, c17959m07, ComposableLambdaKt.c(-1331481206, true, new g(this.f30044i, AdsTheme, this.f30045j, c17959m07, this.f30046k), composer, 54), composer, (i11 & 14) | 384 | (C17959M0.f168297e << 3));
                composer.P();
            } else {
                composer.startReplaceGroup(-376711809);
                Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> function5M = this.f30044i.m();
                InterfaceC15783O interfaceC15783O = this.f30045j;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f30037b);
                C17959M0 c17959m08 = this.f30037b;
                InterfaceC5872l0<String> interfaceC5872l0 = this.f30046k;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new h(c17959m08, interfaceC5872l0, null);
                    composer.t(objB);
                }
                composer.P();
                function5M.m(AdsTheme, interfaceC15783O, (Function2) objB, composer, Integer.valueOf(i11 & 14));
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            a(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Override // Oi.c
    public boolean d() {
        return false;
    }

    public C4769b0(l.d state) {
        Intrinsics.j(state, "state");
        this.state = state;
        this.content = H2.f28560a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(C4769b0 c4769b0, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4769b0.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    @Override // Oi.c
    @SuppressLint({"AlwaysProvideAModifier"})
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(508902460);
        if ((i10 & 48) == 0) {
            i11 = (composerStartRestartGroup.V(this) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 17) == 16 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(508902460, i11, -1, "com.meijer.mobile.androidacres.showcase.components.BottomSheetShowcase.Content (BottomSheetShowcase.kt:184)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
            composerStartRestartGroup.P();
            C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composerStartRestartGroup, 3078, 6);
            composer2 = composerStartRestartGroup;
            Object objB2 = composer2.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer2);
                composer2.t(objB2);
            }
            Ki.K.b(null, ComposableLambdaKt.c(-1460454451, true, new a("Default", c17959m0J, "Header and Footer", "Footer Only", "Secondary Action Buttons Only", "Custom Content", "Custom Content with Footer", "Custom Content with Header", this, (InterfaceC15783O) objB2, interfaceC5872l0), composer2, 54), composer2, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Qi.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4769b0.j(this.f30016a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Oi.c
    public String getName() {
        return "BottomSheet";
    }

    public final Function5<LocalThemeScope, InterfaceC15783O, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object>, Composer, Integer, Unit> m() {
        return this.content;
    }

    @Override // Oi.c
    /* renamed from: n, reason: from getter */
    public l.d getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
