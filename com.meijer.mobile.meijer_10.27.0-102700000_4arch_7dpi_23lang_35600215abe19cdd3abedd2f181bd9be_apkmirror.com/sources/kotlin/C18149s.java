package kotlin;

import C1.o;
import java.util.List;
import kotlin.InterfaceC18130Y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.EnumC16624Q;
import qv.InterfaceC16619L;
import qv.InterfaceC16622O;
import qv.X0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ly1/s;", "", "Ly1/h;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Ly1/h;Lkotlin/coroutines/CoroutineContext;)V", "Ly1/W;", "typefaceRequest", "Ly1/I;", "platformFontLoader", "Lkotlin/Function1;", "Ly1/Y$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Ly1/Y;", "a", "(Ly1/W;Ly1/I;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly1/Y;", "Ly1/h;", "Lqv/O;", "b", "Lqv/O;", "asyncLoadScope", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18149s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f170139d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final C18152v f170140e = new C18152v();

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC16619L f170141f = new c(InterfaceC16619L.INSTANCE);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18138h asyncTypefaceCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC16622O asyncLoadScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: y1.s$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f170144a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18137g f170145b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18137g c18137g, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f170145b = c18137g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f170145b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f170144a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18137g c18137g = this.f170145b;
                this.f170144a = 1;
                if (c18137g.l(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public C18149s(C18138h c18138h, CoroutineContext coroutineContext) {
        this.asyncTypefaceCache = c18138h;
        this.asyncLoadScope = C16623P.a(f170141f.m0(o.a()).m0(coroutineContext).m0(X0.a((C0) coroutineContext.g(C0.INSTANCE))));
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"y1/s$c", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lqv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "l0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: y1.s$c */
    public static final class c extends AbstractCoroutineContextElement implements InterfaceC16619L {
        @Override // qv.InterfaceC16619L
        public void l0(CoroutineContext context, Throwable exception) {
        }

        public c(InterfaceC16619L.Companion companion) {
            super(companion);
        }
    }

    public InterfaceC18130Y a(TypefaceRequest typefaceRequest, InterfaceC18115I platformFontLoader, Function1<? super InterfaceC18130Y.b, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        if (typefaceRequest.getFontFamily() instanceof FontListFontFamily) {
            Pair pairB = C18150t.b(f170140e.a(((FontListFontFamily) typefaceRequest.getFontFamily()).q(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
            List list = (List) pairB.a();
            Object objB = pairB.b();
            if (list == null) {
                return new InterfaceC18130Y.b(objB, false, 2, null);
            }
            C18137g c18137g = new C18137g(list, objB, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
            C16648k.d(this.asyncLoadScope, null, EnumC16624Q.f157614d, new b(c18137g, null), 1, null);
            return new InterfaceC18130Y.a(c18137g);
        }
        return null;
    }

    public /* synthetic */ C18149s(C18138h c18138h, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C18138h() : c18138h, (i10 & 2) != 0 ? EmptyCoroutineContext.f142646a : coroutineContext);
    }
}
