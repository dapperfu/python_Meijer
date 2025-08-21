package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import kotlin.C13904L;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001av\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/z;", "style", "", "softWrap", "LF1/t;", "overflow", "", "maxLines", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "onClick", "a", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5817g {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.g$a */
    static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49740f = new a();

        a() {
            super(1);
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/v;", "it", "", "a", "(Lu1/v;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.g$b */
    static final class b extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<TextLayoutResult> f49741f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49742g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC5872l0<TextLayoutResult> interfaceC5872l0, Function1<? super TextLayoutResult, Unit> function1) {
            super(1);
            this.f49741f = interfaceC5872l0;
            this.f49742g = function1;
        }

        public final void a(TextLayoutResult textLayoutResult) {
            this.f49741f.setValue(textLayoutResult);
            this.f49742g.invoke(textLayoutResult);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.g$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49743f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49744g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49745h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49746i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49747j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f49748k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49749l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f49750m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f49751n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49752o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z10, int i10, int i11, Function1<? super TextLayoutResult, Unit> function1, Function1<? super Integer, Unit> function12, int i12, int i13) {
            super(2);
            this.f49743f = annotatedString;
            this.f49744g = modifier;
            this.f49745h = textStyle;
            this.f49746i = z10;
            this.f49747j = i10;
            this.f49748k = i11;
            this.f49749l = function1;
            this.f49750m = function12;
            this.f49751n = i12;
            this.f49752o = i13;
        }

        public final void a(Composer composer, int i10) {
            C5817g.a(this.f49743f, this.f49744g, this.f49745h, this.f49746i, this.f49747j, this.f49748k, this.f49749l, this.f49750m, composer, J0.a(this.f49751n | 1), this.f49752o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.g$d */
    static final class d implements PointerInputEventHandler {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<TextLayoutResult> f49753a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f49754b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "pos", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.g$d$a */
        static final class a extends Lambda implements Function1<U0.f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<TextLayoutResult> f49755f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f49756g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(InterfaceC5872l0<TextLayoutResult> interfaceC5872l0, Function1<? super Integer, Unit> function1) {
                super(1);
                this.f49755f = interfaceC5872l0;
                this.f49756g = function1;
            }

            public final void a(long j10) {
                TextLayoutResult value = this.f49755f.getValue();
                if (value != null) {
                    this.f49756g.invoke(Integer.valueOf(value.x(j10)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                a(fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(InterfaceC5872l0<TextLayoutResult> interfaceC5872l0, Function1<? super Integer, Unit> function1) {
            this.f49753a = interfaceC5872l0;
            this.f49754b = function1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
            Object objM = C13904L.m(j10, null, null, null, new a(this.f49753a, this.f49754b), continuation, 7, null);
            return objM == IntrinsicsKt.f() ? objM : Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.text.AnnotatedString r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.text.TextStyle r29, boolean r30, int r31, int r32, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r33, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5817g.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
