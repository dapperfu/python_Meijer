package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import java.util.List;
import kotlin.InterfaceC18257Y;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Ly1/g;", "Landroidx/compose/runtime/z1;", "", "", "Ly1/k;", "fontList", "initialType", "Ly1/W;", "typefaceRequest", "Ly1/h;", "asyncTypefaceCache", "Lkotlin/Function1;", "Ly1/Y$b;", "", "onCompletion", "Ly1/I;", "platformFontLoader", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ly1/W;Ly1/h;Lkotlin/jvm/functions/Function1;Ly1/I;)V", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "m", "(Ly1/k;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "Ly1/W;", "c", "Ly1/h;", "d", "Lkotlin/jvm/functions/Function1;", "e", "Ly1/I;", "<set-?>", "f", "Landroidx/compose/runtime/l0;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "", "g", "Z", "k", "()Z", "setCacheable$ui_text_release", "(Z)V", "cacheable", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18264g implements z1<Object> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<InterfaceC18268k> fontList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TypefaceRequest typefaceRequest;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C18265h asyncTypefaceCache;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function1<InterfaceC18257Y.b, Unit> onCompletion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18242I platformFontLoader;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 value;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean cacheable = true;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load")
    /* renamed from: y1.g$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171112a;

        /* renamed from: b, reason: collision with root package name */
        Object f171113b;

        /* renamed from: c, reason: collision with root package name */
        Object f171114c;

        /* renamed from: d, reason: collision with root package name */
        int f171115d;

        /* renamed from: e, reason: collision with root package name */
        int f171116e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171117f;

        /* renamed from: h, reason: collision with root package name */
        int f171119h;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171117f = obj;
            this.f171119h |= Integer.MIN_VALUE;
            return C18264g.this.l(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend")
    /* renamed from: y1.g$b */
    static final class b extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171120a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC18268k f171122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18268k interfaceC18268k, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f171122c = interfaceC18268k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return C18264g.this.new b(this.f171122c, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<Object> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171120a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C18264g c18264g = C18264g.this;
            InterfaceC18268k interfaceC18268k = this.f171122c;
            this.f171120a = 1;
            Object objM = c18264g.m(interfaceC18268k, this);
            if (objM == objF) {
                return objF;
            }
            return objM;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {314}, m = "loadWithTimeoutOrNull$ui_text_release")
    /* renamed from: y1.g$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f171123a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f171124b;

        /* renamed from: d, reason: collision with root package name */
        int f171126d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f171124b = obj;
            this.f171126d |= Integer.MIN_VALUE;
            return C18264g.this.m(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", l = {315}, m = "invokeSuspend")
    /* renamed from: y1.g$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Object>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171127a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC18268k f171129c;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Object> continuation) {
            return invoke2(interfaceC15783O, (Continuation<Object>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC18268k interfaceC18268k, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f171129c = interfaceC18268k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C18264g.this.new d(this.f171129c, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<Object> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171127a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            InterfaceC18242I interfaceC18242I = C18264g.this.platformFontLoader;
            InterfaceC18268k interfaceC18268k = this.f171129c;
            this.f171127a = 1;
            Object objB = interfaceC18242I.b(interfaceC18268k, this);
            if (objB == objF) {
                return objF;
            }
            return objB;
        }
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    @Override // androidx.compose.runtime.z1
    public Object getValue() {
        return this.value.getValue();
    }

    /* renamed from: k, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:35:0x00b4, B:38:0x00e8, B:20:0x005a), top: B:56:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008d -> B:45:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fb -> B:42:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(kotlin.coroutines.Continuation<? super kotlin.Unit> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18264g.l(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(kotlin.InterfaceC18268k r7, kotlin.coroutines.Continuation<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlin.C18264g.c
            if (r0 == 0) goto L13
            r0 = r8
            y1.g$c r0 = (kotlin.C18264g.c) r0
            int r1 = r0.f171126d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171126d = r1
            goto L18
        L13:
            y1.g$c r0 = new y1.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f171124b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f171126d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f171123a
            y1.k r7 = (kotlin.InterfaceC18268k) r7
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.ResultKt.b(r8)
            y1.g$d r8 = new y1.g$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f171123a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.f171126d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = mv.d1.e(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            mv.L$a r2 = mv.InterfaceC15780L.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r1 = r1.g(r2)
            mv.L r1 = (mv.InterfaceC15780L) r1
            if (r1 == 0) goto L86
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.m0(r0, r2)
            goto L86
        L7c:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = mv.E0.n(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C18264g.m(y1.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18264g(List<? extends InterfaceC18268k> list, Object obj, TypefaceRequest typefaceRequest, C18265h c18265h, Function1<? super InterfaceC18257Y.b, Unit> function1, InterfaceC18242I interfaceC18242I) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = c18265h;
        this.onCompletion = function1;
        this.platformFontLoader = interfaceC18242I;
        this.value = t1.e(obj, null, 2, null);
    }
}
