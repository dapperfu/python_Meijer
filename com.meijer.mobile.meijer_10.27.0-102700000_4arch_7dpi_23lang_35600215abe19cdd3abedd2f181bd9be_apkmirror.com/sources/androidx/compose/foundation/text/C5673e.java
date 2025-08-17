package androidx.compose.foundation.text;

import V0.AbstractC5324i0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5730l0;
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
import t0.InterfaceC17054a;
import u1.TextLayoutResult;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000~\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aæ\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020#2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2)\b\u0002\u0010 \u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010'\"\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*¨\u00062²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\u000e\u00100\u001a\u00020#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/z;", "textStyle", "Landroidx/compose/foundation/text/A;", "keyboardOptions", "Landroidx/compose/foundation/text/z;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Lz1/W;", "visualTransformation", "Lu1/v;", "onTextLayout", "Lh0/l;", "interactionSource", "LV0/i0;", "cursorBrush", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/z;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZIILz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Lz1/M;", "b", "(Lz1/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/z;Landroidx/compose/foundation/text/A;Landroidx/compose/foundation/text/z;ZIILz1/W;Lkotlin/jvm/functions/Function1;Lh0/l;LV0/i0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Lt0/a;", "Lt0/a;", "DefaultTextFieldDecorator", "LH1/k;", "J", "MinTouchTargetSizeForHandles", "", "cursorHandleState", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5673e {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC17054a f49379a = h.f49428a;

    /* renamed from: b, reason: collision with root package name */
    private static final long f49380b;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$a */
    static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f49381f = new a();

        a() {
            super(1);
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "it", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$b */
    static final class b extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49382f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49383g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1) {
            super(1);
            this.f49382f = textFieldValue;
            this.f49383g = function1;
        }

        public final void a(TextFieldValue textFieldValue) {
            if (Intrinsics.e(this.f49382f, textFieldValue)) {
                return;
            }
            this.f49383g.invoke(textFieldValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49384f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextFieldValue, Unit> f49385g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49386h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49387i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49388j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f49389k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f49390l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5693z f49391m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49392n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49393o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49394p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ z1.W f49395q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49396r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0.l f49397s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC5324i0 f49398t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49399u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f49400v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49401w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49402x;

        public final void a(Composer composer, int i10) {
            C5673e.b(this.f49384f, this.f49385g, this.f49386h, this.f49387i, this.f49388j, this.f49389k, this.f49390l, this.f49391m, this.f49392n, this.f49393o, this.f49394p, this.f49395q, this.f49396r, this.f49397s, this.f49398t, this.f49399u, composer, J0.a(this.f49400v | 1), J0.a(this.f49401w), this.f49402x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z10, boolean z11, TextStyle textStyle, KeyboardOptions keyboardOptions, C5693z c5693z, boolean z12, int i10, int i11, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5324i0 abstractC5324i0, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i12, int i13, int i14) {
            super(2);
            this.f49384f = textFieldValue;
            this.f49385g = function1;
            this.f49386h = modifier;
            this.f49387i = z10;
            this.f49388j = z11;
            this.f49389k = textStyle;
            this.f49390l = keyboardOptions;
            this.f49391m = c5693z;
            this.f49392n = z12;
            this.f49393o = i10;
            this.f49394p = i11;
            this.f49395q = w10;
            this.f49396r = function12;
            this.f49397s = lVar;
            this.f49398t = abstractC5324i0;
            this.f49399u = function3;
            this.f49400v = i12;
            this.f49401w = i13;
            this.f49402x = i14;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$d */
    static final class d extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f49403f = new d();

        d() {
            super(1);
        }

        public final void a(TextLayoutResult textLayoutResult) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$e, reason: collision with other inner class name */
    static final class C1027e extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextFieldValue f49404f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<TextFieldValue> f49405g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1027e(TextFieldValue textFieldValue, InterfaceC5730l0<TextFieldValue> interfaceC5730l0) {
            super(0);
            this.f49404f = textFieldValue;
            this.f49405g = interfaceC5730l0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (androidx.compose.ui.text.y.g(this.f49404f.getSelection(), C5673e.c(this.f49405g).getSelection()) && Intrinsics.e(this.f49404f.getComposition(), C5673e.c(this.f49405g).getComposition())) {
                return;
            }
            C5673e.d(this.f49405g, this.f49404f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz1/M;", "newTextFieldValueState", "", "a", "(Lz1/M;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$f */
    static final class f extends Lambda implements Function1<TextFieldValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f49406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<TextFieldValue> f49407g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<String> f49408h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super String, Unit> function1, InterfaceC5730l0<TextFieldValue> interfaceC5730l0, InterfaceC5730l0<String> interfaceC5730l02) {
            super(1);
            this.f49406f = function1;
            this.f49407g = interfaceC5730l0;
            this.f49408h = interfaceC5730l02;
        }

        public final void a(TextFieldValue textFieldValue) {
            C5673e.d(this.f49407g, textFieldValue);
            boolean zE = Intrinsics.e(C5673e.e(this.f49408h), textFieldValue.h());
            C5673e.f(this.f49408h, textFieldValue.h());
            if (zE) {
                return;
            }
            this.f49406f.invoke(textFieldValue.h());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            a(textFieldValue);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.e$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f49409f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f49410g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f49411h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49412i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f49413j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f49414k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ KeyboardOptions f49415l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5693z f49416m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f49417n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49418o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49419p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ z1.W f49420q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49421r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ h0.l f49422s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ AbstractC5324i0 f49423t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f49424u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f49425v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f49426w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f49427x;

        public final void a(Composer composer, int i10) {
            C5673e.a(this.f49409f, this.f49410g, this.f49411h, this.f49412i, this.f49413j, this.f49414k, this.f49415l, this.f49416m, this.f49417n, this.f49418o, this.f49419p, this.f49420q, this.f49421r, this.f49422s, this.f49423t, this.f49424u, composer, J0.a(this.f49425v | 1), J0.a(this.f49426w), this.f49427x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z10, boolean z11, TextStyle textStyle, KeyboardOptions keyboardOptions, C5693z c5693z, boolean z12, int i10, int i11, z1.W w10, Function1<? super TextLayoutResult, Unit> function12, h0.l lVar, AbstractC5324i0 abstractC5324i0, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, int i12, int i13, int i14) {
            super(2);
            this.f49409f = str;
            this.f49410g = function1;
            this.f49411h = modifier;
            this.f49412i = z10;
            this.f49413j = z11;
            this.f49414k = textStyle;
            this.f49415l = keyboardOptions;
            this.f49416m = c5693z;
            this.f49417n = z12;
            this.f49418o = i10;
            this.f49419p = i11;
            this.f49420q = w10;
            this.f49421r = function12;
            this.f49422s = lVar;
            this.f49423t = abstractC5324i0;
            this.f49424u = function3;
            this.f49425v = i12;
            this.f49426w = i13;
            this.f49427x = i14;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "it", "<anonymous>", "(Lkotlin/jvm/functions/Function0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.e$h */
    static final class h implements InterfaceC17054a {

        /* renamed from: a, reason: collision with root package name */
        public static final h f49428a = new h();

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
    public static final void a(java.lang.String r37, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.C5693z r44, boolean r45, int r46, int r47, z1.W r48, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r49, h0.l r50, V0.AbstractC5324i0 r51, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5673e.a(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.z, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, int, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void b(z1.TextFieldValue r38, kotlin.jvm.functions.Function1<? super z1.TextFieldValue, kotlin.Unit> r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.C5693z r45, boolean r46, int r47, int r48, z1.W r49, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r50, h0.l r51, V0.AbstractC5324i0 r52, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, int r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5673e.b(z1.M, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.z, androidx.compose.foundation.text.A, androidx.compose.foundation.text.z, boolean, int, int, z1.W, kotlin.jvm.functions.Function1, h0.l, V0.i0, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static {
        float f10 = 40;
        f49380b = H1.i.b(H1.h.p(f10), H1.h.p(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue c(InterfaceC5730l0<TextFieldValue> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC5730l0<TextFieldValue> interfaceC5730l0, TextFieldValue textFieldValue) {
        interfaceC5730l0.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(InterfaceC5730l0<String> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<String> interfaceC5730l0, String str) {
        interfaceC5730l0.setValue(str);
    }
}
