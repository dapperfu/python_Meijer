package kotlin;

import C1.o;
import java.util.List;
import kotlin.InterfaceC18257Y;
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
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.EnumC15785Q;
import mv.InterfaceC15780L;
import mv.InterfaceC15783O;
import mv.X0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JI\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ly1/s;", "", "Ly1/h;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Ly1/h;Lkotlin/coroutines/CoroutineContext;)V", "Ly1/W;", "typefaceRequest", "Ly1/I;", "platformFontLoader", "Lkotlin/Function1;", "Ly1/Y$b;", "", "onAsyncCompletion", "createDefaultTypeface", "Ly1/Y;", "a", "(Ly1/W;Ly1/I;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ly1/Y;", "Ly1/h;", "Lmv/O;", "b", "Lmv/O;", "asyncLoadScope", "c", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: y1.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18276s {

    /* renamed from: d, reason: collision with root package name */
    public static final int f171165d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final C18279v f171166e = new C18279v();

    /* renamed from: f, reason: collision with root package name */
    private static final InterfaceC15780L f171167f = new c(InterfaceC15780L.INSTANCE);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18265h asyncTypefaceCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O asyncLoadScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: y1.s$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f171170a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18264g f171171b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C18264g c18264g, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f171171b = c18264g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f171171b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f171170a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18264g c18264g = this.f171171b;
                this.f171170a = 1;
                if (c18264g.l(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public C18276s(C18265h c18265h, CoroutineContext coroutineContext) {
        this.asyncTypefaceCache = c18265h;
        this.asyncLoadScope = C15784P.a(f171167f.n0(o.a()).n0(coroutineContext).n0(X0.a((C0) coroutineContext.g(C0.INSTANCE))));
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"y1/s$c", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lmv/L;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "m0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: y1.s$c */
    public static final class c extends AbstractCoroutineContextElement implements InterfaceC15780L {
        @Override // mv.InterfaceC15780L
        public void m0(CoroutineContext context, Throwable exception) {
        }

        public c(InterfaceC15780L.Companion companion) {
            super(companion);
        }
    }

    public InterfaceC18257Y a(TypefaceRequest typefaceRequest, InterfaceC18242I platformFontLoader, Function1<? super InterfaceC18257Y.b, Unit> onAsyncCompletion, Function1<? super TypefaceRequest, ? extends Object> createDefaultTypeface) {
        if (typefaceRequest.getFontFamily() instanceof FontListFontFamily) {
            Pair pairB = C18277t.b(f171166e.a(((FontListFontFamily) typefaceRequest.getFontFamily()).q(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
            List list = (List) pairB.a();
            Object objB = pairB.b();
            if (list == null) {
                return new InterfaceC18257Y.b(objB, false, 2, null);
            }
            C18264g c18264g = new C18264g(list, objB, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
            C15809k.d(this.asyncLoadScope, null, EnumC15785Q.f151688d, new b(c18264g, null), 1, null);
            return new InterfaceC18257Y.a(c18264g);
        }
        return null;
    }

    public /* synthetic */ C18276s(C18265h c18265h, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C18265h() : c18265h, (i10 & 2) != 0 ? EmptyCoroutineContext.f143553a : coroutineContext);
    }
}
