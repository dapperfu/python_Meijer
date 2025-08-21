package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.C5893w0;
import androidx.compose.runtime.InterfaceC5840b0;
import androidx.compose.runtime.Recomposer;
import androidx.view.AbstractC6165l;
import androidx.view.C6161i0;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import j1.C14920a;
import j2.C14928h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16562g;
import pv.L;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0011\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\",\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0003\"\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001e\u0010!\u001a\u00020\u000e*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroid/view/View;", "Landroidx/compose/runtime/k;", "d", "(Landroid/view/View;)Landroidx/compose/runtime/k;", "Landroid/content/Context;", "applicationContext", "Lpv/P;", "", "e", "(Landroid/content/Context;)Lpv/P;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroidx/lifecycle/l;", "lifecycle", "Landroidx/compose/runtime/Recomposer;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/l;)Landroidx/compose/runtime/Recomposer;", "", "a", "Ljava/util/Map;", "animationScale", "value", "f", "i", "(Landroid/view/View;Landroidx/compose/runtime/k;)V", "compositionContext", "g", "(Landroid/view/View;)Landroid/view/View;", "contentChild", "h", "(Landroid/view/View;)Landroidx/compose/runtime/Recomposer;", "getWindowRecomposer$annotations", "(Landroid/view/View;)V", "windowRecomposer", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Context, pv.P<Float>> f52232a = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/b2$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f52233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Recomposer f52234b;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v10) {
        }

        a(View view, Recomposer recomposer) {
            this.f52233a = view;
            this.f52234b = recomposer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v10) {
            this.f52233a.removeOnAttachStateChangeListener(this);
            this.f52234b.Z();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/b2$b", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC6169p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f52235a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5893w0 f52236b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Recomposer f52237c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<U0> f52238d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f52239e;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbstractC6165l.a.values().length];
                try {
                    iArr[AbstractC6165l.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC6165l.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {388}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.b2$b$b, reason: collision with other inner class name */
        static final class C1074b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f52240a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f52241b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<U0> f52242c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Recomposer f52243d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC6172s f52244e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f52245f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ View f52246g;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {383}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.b2$b$b$a */
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f52247a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ pv.P<Float> f52248b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ U0 f52249c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "", "a", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.ui.platform.b2$b$b$a$a, reason: collision with other inner class name */
                static final class C1075a<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ U0 f52250a;

                    C1075a(U0 u02) {
                        this.f52250a = u02;
                    }

                    public final Object a(float f10, Continuation<? super Unit> continuation) {
                        this.f52250a.e(f10);
                        return Unit.f143329a;
                    }

                    @Override // pv.InterfaceC16562g
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return a(((Number) obj).floatValue(), continuation);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f52248b, this.f52249c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(pv.P<Float> p10, U0 u02, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f52248b = p10;
                    this.f52249c = u02;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f52247a;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    } else {
                        ResultKt.b(obj);
                        pv.P<Float> p10 = this.f52248b;
                        C1075a c1075a = new C1075a(this.f52249c);
                        this.f52247a = 1;
                        if (p10.collect(c1075a, this) == objF) {
                            return objF;
                        }
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1074b(Ref.ObjectRef<U0> objectRef, Recomposer recomposer, InterfaceC6172s interfaceC6172s, b bVar, View view, Continuation<? super C1074b> continuation) {
                super(2, continuation);
                this.f52242c = objectRef;
                this.f52243d = recomposer;
                this.f52244e = interfaceC6172s;
                this.f52245f = bVar;
                this.f52246g = view;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1074b c1074b = new C1074b(this.f52242c, this.f52243d, this.f52244e, this.f52245f, this.f52246g, continuation);
                c1074b.f52241b = obj;
                return c1074b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1074b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v12, types: [mv.C0] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th2;
                mv.C0 c02;
                mv.C0 c0D;
                Object objF = IntrinsicsKt.f();
                ?? r12 = this.f52240a;
                try {
                    if (r12 != 0) {
                        if (r12 == 1) {
                            mv.C0 c03 = (mv.C0) this.f52241b;
                            ResultKt.b(obj);
                            r12 = c03;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f52241b;
                        try {
                            U0 u02 = this.f52242c.f143742a;
                            if (u02 != null) {
                                pv.P pE = b2.e(this.f52246g.getContext().getApplicationContext());
                                u02.e(((Number) pE.getValue()).floatValue());
                                c0D = C15809k.d(interfaceC15783O, null, null, new a(pE, u02, null), 3, null);
                            } else {
                                c0D = null;
                            }
                            Recomposer recomposer = this.f52243d;
                            this.f52241b = c0D;
                            this.f52240a = 1;
                            r12 = c0D;
                            if (recomposer.B0(this) == objF) {
                                return objF;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            c02 = null;
                            if (c02 != null) {
                                C0.a.a(c02, null, 1, null);
                            }
                            this.f52244e.getLifecycle().d(this.f52245f);
                            throw th2;
                        }
                    }
                    if (r12 != 0) {
                        C0.a.a(r12, null, 1, null);
                    }
                    this.f52244e.getLifecycle().d(this.f52245f);
                    return Unit.f143329a;
                } catch (Throwable th4) {
                    th2 = th4;
                    c02 = r12;
                }
            }
        }

        b(InterfaceC15783O interfaceC15783O, C5893w0 c5893w0, Recomposer recomposer, Ref.ObjectRef<U0> objectRef, View view) {
            this.f52235a = interfaceC15783O;
            this.f52236b = c5893w0;
            this.f52237c = recomposer;
            this.f52238d = objectRef;
            this.f52239e = view;
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s source, AbstractC6165l.a event) {
            int i10 = a.$EnumSwitchMapping$0[event.ordinal()];
            if (i10 == 1) {
                C15809k.d(this.f52235a, null, EnumC15785Q.f151688d, new C1074b(this.f52238d, this.f52237c, source, this, this.f52239e, null), 1, null);
                return;
            }
            if (i10 == 2) {
                C5893w0 c5893w0 = this.f52236b;
                if (c5893w0 != null) {
                    c5893w0.f();
                }
                this.f52237c.A0();
                return;
            }
            if (i10 == 3) {
                this.f52237c.n0();
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f52237c.Z();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpv/g;", "", "", "<anonymous>", "(Lpv/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16562g<? super Float>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f52251a;

        /* renamed from: b, reason: collision with root package name */
        int f52252b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f52253c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContentResolver f52254d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f52255e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f52256f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ov.g<Unit> f52257g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f52258h;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f52254d, this.f52255e, this.f52256f, this.f52257g, this.f52258h, continuation);
            cVar.f52253c = obj;
            return cVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, ov.g<Unit> gVar, Context context, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f52254d = contentResolver;
            this.f52255e = uri;
            this.f52256f = dVar;
            this.f52257g = gVar;
            this.f52258h = context;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super Float> interfaceC16562g, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16562g, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        
            if (r4.emit(r9, r8) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:18:0x0048, B:22:0x0058, B:24:0x0060, B:14:0x002d, B:17:0x0042), top: B:31:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f52252b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f52251a
                ov.i r1 = (ov.i) r1
                java.lang.Object r4 = r8.f52253c
                pv.g r4 = (pv.InterfaceC16562g) r4
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f52251a
                ov.i r1 = (ov.i) r1
                java.lang.Object r4 = r8.f52253c
                pv.g r4 = (pv.InterfaceC16562g) r4
                kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f52253c
                pv.g r9 = (pv.InterfaceC16562g) r9
                android.content.ContentResolver r1 = r8.f52254d
                android.net.Uri r4 = r8.f52255e
                r5 = 0
                androidx.compose.ui.platform.b2$d r6 = r8.f52256f
                r1.registerContentObserver(r4, r5, r6)
                ov.g<kotlin.Unit> r1 = r8.f52257g     // Catch: java.lang.Throwable -> L1b
                ov.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f52253c = r9     // Catch: java.lang.Throwable -> L1b
                r8.f52251a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f52252b = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L81
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f52258h     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.Boxing.c(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f52253c = r4     // Catch: java.lang.Throwable -> L1b
                r8.f52251a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f52252b = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L81:
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f52254d
                androidx.compose.ui.platform.b2$d r0 = r8.f52256f
                r9.unregisterContentObserver(r0)
                kotlin.Unit r9 = kotlin.Unit.f143329a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f52254d
                androidx.compose.ui.platform.b2$d r1 = r8.f52256f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.b2.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/b2$d", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", "uri", "", "onChange", "(ZLandroid/net/Uri;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ov.g<Unit> f52259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ov.g<Unit> gVar, Handler handler) {
            super(handler);
            this.f52259a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, Uri uri) {
            this.f52259a.k(Unit.f143329a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, androidx.compose.ui.platform.U0] */
    public static final Recomposer b(View view, CoroutineContext coroutineContext, AbstractC6165l abstractC6165l) {
        C5893w0 c5893w0;
        if (coroutineContext.g(ContinuationInterceptor.INSTANCE) == null || coroutineContext.g(InterfaceC5840b0.INSTANCE) == null) {
            coroutineContext = P.INSTANCE.a().n0(coroutineContext);
        }
        InterfaceC5840b0 interfaceC5840b0 = (InterfaceC5840b0) coroutineContext.g(InterfaceC5840b0.INSTANCE);
        if (interfaceC5840b0 != null) {
            C5893w0 c5893w02 = new C5893w0(interfaceC5840b0);
            c5893w02.e();
            c5893w0 = c5893w02;
        } else {
            c5893w0 = null;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        P0.j jVar = (P0.j) coroutineContext.g(P0.j.INSTANCE);
        P0.j jVar2 = jVar;
        if (jVar == null) {
            ?? u02 = new U0();
            objectRef.f143742a = u02;
            jVar2 = u02;
        }
        CoroutineContext coroutineContextN0 = coroutineContext.n0(c5893w0 != null ? c5893w0 : EmptyCoroutineContext.f143553a).n0(jVar2);
        Recomposer recomposer = new Recomposer(coroutineContextN0);
        recomposer.n0();
        InterfaceC15783O interfaceC15783OA = C15784P.a(coroutineContextN0);
        if (abstractC6165l == null) {
            InterfaceC6172s interfaceC6172sA = C6161i0.a(view);
            abstractC6165l = interfaceC6172sA != null ? interfaceC6172sA.getLifecycle() : null;
        }
        if (abstractC6165l != null) {
            view.addOnAttachStateChangeListener(new a(view, recomposer));
            abstractC6165l.a(new b(interfaceC15783OA, c5893w0, recomposer, objectRef, view));
            return recomposer;
        }
        C14920a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Recomposer c(View view, CoroutineContext coroutineContext, AbstractC6165l abstractC6165l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        if ((i10 & 2) != 0) {
            abstractC6165l = null;
        }
        return b(view, coroutineContext, abstractC6165l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pv.P<Float> e(Context context) {
        pv.P<Float> p10;
        Map<Context, pv.P<Float>> map = f52232a;
        synchronized (map) {
            try {
                pv.P<Float> pY = map.get(context);
                if (pY == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    ov.g gVarB = ov.j.b(-1, null, null, 6, null);
                    pY = C16563h.Y(C16563h.E(new c(contentResolver, uriFor, new d(gVarB, C14928h.a(Looper.getMainLooper())), gVarB, context, null)), C15784P.b(), L.Companion.b(pv.L.INSTANCE, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, pY);
                }
                p10 = pY;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p10;
    }

    public static final AbstractC5869k f(View view) {
        Object tag = view.getTag(P0.k.f25221G);
        if (tag instanceof AbstractC5869k) {
            return (AbstractC5869k) tag;
        }
        return null;
    }

    public static final void i(View view, AbstractC5869k abstractC5869k) {
        view.setTag(P0.k.f25221G, abstractC5869k);
    }

    public static final AbstractC5869k d(View view) {
        AbstractC5869k abstractC5869kF = f(view);
        if (abstractC5869kF != null) {
            return abstractC5869kF;
        }
        for (ViewParent parent = view.getParent(); abstractC5869kF == null && (parent instanceof View); parent = parent.getParent()) {
            abstractC5869kF = f((View) parent);
        }
        return abstractC5869kF;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final Recomposer h(View view) {
        if (!view.isAttachedToWindow()) {
            C14920a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        AbstractC5869k abstractC5869kF = f(viewG);
        if (abstractC5869kF == null) {
            return a2.f52221a.a(viewG);
        }
        if (abstractC5869kF instanceof Recomposer) {
            return (Recomposer) abstractC5869kF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }
}
