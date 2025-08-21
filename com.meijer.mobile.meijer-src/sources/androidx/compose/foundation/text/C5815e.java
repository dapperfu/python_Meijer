package androidx.compose.foundation.text;

import V0.AbstractC5467i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import t0.InterfaceC17173a;
import u1.TextLayoutResult;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aæ\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'\"\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*¨\u00062²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\u000e\u00100\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/z;", "textStyle", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lz1/W;", "visualTransformation", "Lu1/v;", "onTextLayout", "Lh0/l;", "interactionSource", "LV0/i0;", "cursorBrush", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/z;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZIILz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Lz1/M;", "b", "(Lz1/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/z;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZIILz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Lt0/a;", "Lt0/a;", "DefaultTextFieldDecorator", "LH1/k;", "J", "MinTouchTargetSizeForHandles", "", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5815e {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC17173a f49603a = h.f49652a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f49604b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$a */
    static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49605f = new a();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$b */
    static final class b extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49606f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1) {
            super(1);
            this.f49606f = textFieldValue;
            this.f49607g = function1;
        }

        public final void a(TextFieldValue textFieldValue) {
            if (Intrinsics.e(this.f49606f, textFieldValue)) {
                return;
            }
            this.f49607g.invoke(textFieldValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49608f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49609g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49610h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49611i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49612j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f49613k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f49614l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5835z f49615m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49616n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49617o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49618p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ z1.W f49619q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49620r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0.l f49621s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f49622t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49623u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f49624v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49625w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49626x;

        public final void a(Composer composer, int i10) {
            C5815e.b(this.f49608f, this.f49609g, this.f49610h, this.f49611i, this.f49612j, this.f49613k, this.f49614l, this.f49615m, this.f49616n, this.f49617o, this.f49618p, this.f49619q, this.f49620r, this.f49621s, this.f49622t, this.f49623u, composer, J0.a(this.f49624v | 1), J0.a(this.f49625w), this.f49626x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z10, boolean z11, TextStyle textStyle, KeyboardOptions keyboardOptions, C5835z c5835z, boolean z12, int i10, int i11, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5467i0 abstractC5467i0, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i12, int i13, int i14) {
            super(2);
            this.f49608f = textFieldValue;
            this.f49609g = function1;
            this.f49610h = modifier;
            this.f49611i = z10;
            this.f49612j = z11;
            this.f49613k = textStyle;
            this.f49614l = keyboardOptions;
            this.f49615m = c5835z;
            this.f49616n = z12;
            this.f49617o = i10;
            this.f49618p = i11;
            this.f49619q = w10;
            this.f49620r = function12;
            this.f49621s = lVar;
            this.f49622t = abstractC5467i0;
            this.f49623u = function3;
            this.f49624v = i12;
            this.f49625w = i13;
            this.f49626x = i14;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$d */
    static final class d extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f49627f = new d();

        d() {
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

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$e, reason: collision with other inner class name */
    static final class C1040e extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49628f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<TextFieldValue> f49629g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1040e(TextFieldValue textFieldValue, InterfaceC5872l0<TextFieldValue> interfaceC5872l0) {
            super(0);
            this.f49628f = textFieldValue;
            this.f49629g = interfaceC5872l0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (androidx.compose.ui.text.y.g(this.f49628f.getSelection(), C5815e.c(this.f49629g).getSelection()) && Intrinsics.e(this.f49628f.getComposition(), C5815e.c(this.f49629g).getComposition())) {
                return;
            }
            C5815e.d(this.f49629g, this.f49628f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "newTextFieldValueState", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$f */
    static final class f extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f49630f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<TextFieldValue> f49631g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<String> f49632h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super String, Unit> function1, InterfaceC5872l0<TextFieldValue> interfaceC5872l0, InterfaceC5872l0<String> interfaceC5872l02) {
            super(1);
            this.f49630f = function1;
            this.f49631g = interfaceC5872l0;
            this.f49632h = interfaceC5872l02;
        }

        public final void a(TextFieldValue textFieldValue) {
            C5815e.d(this.f49631g, textFieldValue);
            boolean zE = Intrinsics.e(C5815e.e(this.f49632h), textFieldValue.h());
            C5815e.f(this.f49632h, textFieldValue.h());
            if (zE) {
                return;
            }
            this.f49630f.invoke(textFieldValue.h());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f49633f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f49634g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49635h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49636i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49637j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f49638k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f49639l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5835z f49640m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49641n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49642o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49643p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ z1.W f49644q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49645r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0.l f49646s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC5467i0 f49647t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49648u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f49649v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49650w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49651x;

        public final void a(Composer composer, int i10) {
            C5815e.a(this.f49633f, this.f49634g, this.f49635h, this.f49636i, this.f49637j, this.f49638k, this.f49639l, this.f49640m, this.f49641n, this.f49642o, this.f49643p, this.f49644q, this.f49645r, this.f49646s, this.f49647t, this.f49648u, composer, J0.a(this.f49649v | 1), J0.a(this.f49650w), this.f49651x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z10, boolean z11, TextStyle textStyle, KeyboardOptions keyboardOptions, C5835z c5835z, boolean z12, int i10, int i11, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5467i0 abstractC5467i0, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i12, int i13, int i14) {
            super(2);
            this.f49633f = str;
            this.f49634g = function1;
            this.f49635h = modifier;
            this.f49636i = z10;
            this.f49637j = z11;
            this.f49638k = textStyle;
            this.f49639l = keyboardOptions;
            this.f49640m = c5835z;
            this.f49641n = z12;
            this.f49642o = i10;
            this.f49643p = i11;
            this.f49644q = w10;
            this.f49645r = function12;
            this.f49646s = lVar;
            this.f49647t = abstractC5467i0;
            this.f49648u = function3;
            this.f49649v = i12;
            this.f49650w = i13;
            this.f49651x = i14;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "<anonymous>", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$h */
    static final class h implements InterfaceC17173a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f49652a = new h();

        h() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r37, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.C5835z r44, boolean r45, int r46, int r47, z1.W r48, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r49, h0.l r50, V0.AbstractC5467i0 r51, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5815e.a(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.z, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, int, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(z1.TextFieldValue r38, kotlin.jvm.functions.Function1<? super z1.TextFieldValue, kotlin.Unit> r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.C5835z r45, boolean r46, int r47, int r48, z1.W r49, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r50, h0.l r51, V0.AbstractC5467i0 r52, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5815e.b(z1.M, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.z, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, int, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        float f10 = 40;
        f49604b = H1.i.b(H1.h.p(f10), H1.h.p(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue c(InterfaceC5872l0<TextFieldValue> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5872l0<TextFieldValue> interfaceC5872l0, TextFieldValue textFieldValue) {
        interfaceC5872l0.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC5872l0<String> interfaceC5872l0) {
        return interfaceC5872l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5872l0<String> interfaceC5872l0, String str) {
        interfaceC5872l0.setValue(str);
    }
}
