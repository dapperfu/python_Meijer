package androidx.compose.foundation.text;

import V0.InterfaceC5359x0;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC18142l;
import kotlin.C17704M;
import kotlin.InterfaceC17701J;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.Placeholder;
import u1.TextLayoutResult;
import v0.C17442g;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0086\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u009c\u0001\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001az\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0090\u0001\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00172\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a%\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$0#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010&\u001aG\u0010/\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020-\u0012\f\u0012\n\u0012\u0004\u0012\u00020.\u0018\u00010*0,\u0018\u00010'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0*H\u0002¢\u0006\u0004\b/\u00100\u001aÌ\u0001\u0010<\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020403\u0018\u00010'2\u001c\u00107\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001060'\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aº\u0001\u0010?\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00172\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010>\u001a\u00020\f2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u00102\u001a\u0002012\b\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\u000e\u0010A\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/z;", "style", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "LV0/x0;", "color", "Landroidx/compose/foundation/text/L;", "autoSize", "c", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function1;IZIILV0/x0;Landroidx/compose/foundation/text/L;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/r;", "inlineContent", "a", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;LV0/x0;Landroidx/compose/foundation/text/L;Landroidx/compose/runtime/Composer;III)V", "d", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function1;IZIILV0/x0;Landroidx/compose/runtime/Composer;II)V", "b", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;LV0/x0;Landroidx/compose/runtime/Composer;II)V", "Lw0/J;", "selectionRegistrar", "LL0/k;", "", "l", "(Lw0/J;)LL0/k;", "", "Landroidx/compose/ui/layout/I;", "measurables", "Lkotlin/Function0;", "shouldMeasureLinks", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/f0;", "LH1/n;", "k", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/util/List;", "Ly1/l$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Lv0/g;", "selectionController", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "m", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function1;IZIILy1/l$b;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lv0/g;LV0/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/L;)Landroidx/compose/ui/Modifier;", "hasInlineContent", "g", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/z;IZIILy1/l$b;Lv0/g;LV0/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/L;Landroidx/compose/runtime/Composer;III)V", "displayedText", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.text.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5674f {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f49435f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49436g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49437h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49438i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49439j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f49440k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f49441l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f49442m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5359x0 f49443n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49444o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49445p;

        public final void a(Composer composer, int i10) {
            C5674f.c(this.f49435f, this.f49436g, this.f49437h, this.f49438i, this.f49439j, this.f49440k, this.f49441l, this.f49442m, this.f49443n, null, composer, J0.a(this.f49444o | 1), this.f49445p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, InterfaceC5359x0 interfaceC5359x0, L l10, int i13, int i14) {
            super(2);
            this.f49435f = str;
            this.f49436g = modifier;
            this.f49437h = textStyle;
            this.f49438i = function1;
            this.f49439j = i10;
            this.f49440k = z10;
            this.f49441l = i11;
            this.f49442m = i12;
            this.f49443n = interfaceC5359x0;
            this.f49444o = i13;
            this.f49445p = i14;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "substitutionValue", "", "a", "(Landroidx/compose/foundation/text/modifiers/b$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$b */
    static final class b extends Lambda implements Function1<b.TextSubstitutionValue, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<AnnotatedString> f49446f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5730l0<AnnotatedString> interfaceC5730l0) {
            super(1);
            this.f49446f = interfaceC5730l0;
        }

        public final void a(b.TextSubstitutionValue aVar) {
            C5674f.f(this.f49446f, aVar.getIsShowingSubstitution() ? aVar.getSubstitution() : aVar.getOriginal());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(b.TextSubstitutionValue aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49447f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49448g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49449h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49450i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49451j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f49452k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f49453l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f49454m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map<String, r> f49455n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5359x0 f49456o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49457p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f49458q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f49459r;

        public final void a(Composer composer, int i10) {
            C5674f.a(this.f49447f, this.f49448g, this.f49449h, this.f49450i, this.f49451j, this.f49452k, this.f49453l, this.f49454m, this.f49455n, this.f49456o, null, composer, J0.a(this.f49457p | 1), J0.a(this.f49458q), this.f49459r);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, Map<String, r> map, InterfaceC5359x0 interfaceC5359x0, L l10, int i13, int i14, int i15) {
            super(2);
            this.f49447f = annotatedString;
            this.f49448g = modifier;
            this.f49449h = textStyle;
            this.f49450i = function1;
            this.f49451j = i10;
            this.f49452k = z10;
            this.f49453l = i11;
            this.f49454m = i12;
            this.f49455n = map;
            this.f49456o = interfaceC5359x0;
            this.f49457p = i13;
            this.f49458q = i14;
            this.f49459r = i15;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$d */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f49460f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49461g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49462h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49463i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49464j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f49465k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f49466l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f49467m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5359x0 f49468n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49469o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49470p;

        public final void a(Composer composer, int i10) {
            C5674f.d(this.f49460f, this.f49461g, this.f49462h, this.f49463i, this.f49464j, this.f49465k, this.f49466l, this.f49467m, this.f49468n, composer, J0.a(this.f49469o | 1), this.f49470p);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, InterfaceC5359x0 interfaceC5359x0, int i13, int i14) {
            super(2);
            this.f49460f = str;
            this.f49461g = modifier;
            this.f49462h = textStyle;
            this.f49463i = function1;
            this.f49464j = i10;
            this.f49465k = z10;
            this.f49466l = i11;
            this.f49467m = i12;
            this.f49468n = interfaceC5359x0;
            this.f49469o = i13;
            this.f49470p = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$e */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49471f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f49472g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextStyle f49473h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49474i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f49475j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f49476k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f49477l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f49478m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map<String, r> f49479n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5359x0 f49480o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f49481p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f49482q;

        public final void a(Composer composer, int i10) {
            C5674f.b(this.f49471f, this.f49472g, this.f49473h, this.f49474i, this.f49475j, this.f49476k, this.f49477l, this.f49478m, this.f49479n, this.f49480o, composer, J0.a(this.f49481p | 1), this.f49482q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, Map<String, r> map, InterfaceC5359x0 interfaceC5359x0, int i13, int i14) {
            super(2);
            this.f49471f = annotatedString;
            this.f49472g = modifier;
            this.f49473h = textStyle;
            this.f49474i = function1;
            this.f49475j = i10;
            this.f49476k = z10;
            this.f49477l = i11;
            this.f49478m = i12;
            this.f49479n = map;
            this.f49480o = interfaceC5359x0;
            this.f49481p = i13;
            this.f49482q = i14;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$f, reason: collision with other inner class name */
    static final class C1028f extends Lambda implements Function0<Long> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17701J f49483f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1028f(InterfaceC17701J interfaceC17701J) {
            super(0);
            this.f49483f = interfaceC17701J;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f49483f.a());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$g */
    static final class g extends Lambda implements Function0<Long> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17701J f49484f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC17701J interfaceC17701J) {
            super(0);
            this.f49484f = interfaceC17701J;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f49484f.a());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/v;", "it", "", "a", "(Lu1/v;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$h */
    static final class h extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f49485f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49486g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(k0 k0Var, Function1<? super TextLayoutResult, Unit> function1) {
            super(1);
            this.f49485f = k0Var;
            this.f49486g = function1;
        }

        public final void a(TextLayoutResult textLayoutResult) {
            k0 k0Var = this.f49485f;
            if (k0Var != null) {
                k0Var.r(textLayoutResult);
            }
            Function1<TextLayoutResult, Unit> function1 = this.f49486g;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
            a(textLayoutResult);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.f$i */
    static final class i extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f49487f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k0 k0Var) {
            super(0);
            this.f49487f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            k0 k0Var = this.f49487f;
            return Boolean.valueOf(k0Var != null ? k0Var.l().invoke().booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.text.f$j */
    static final class j extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f49488f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(k0 k0Var) {
            super(0);
            this.f49488f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            k0 k0Var = this.f49488f;
            return Boolean.valueOf(k0Var != null ? k0Var.l().invoke().booleanValue() : false);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Landroidx/compose/ui/geometry/Rect;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$k */
    static final class k extends Lambda implements Function0<List<? extends Rect>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<List<Rect>> f49489f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC5730l0<List<Rect>> interfaceC5730l0) {
            super(0);
            this.f49489f = interfaceC5730l0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Rect> invoke() {
            InterfaceC5730l0<List<Rect>> interfaceC5730l0 = this.f49489f;
            if (interfaceC5730l0 != null) {
                return interfaceC5730l0.getValue();
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$l */
    static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f49490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49491g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f49492h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f49493i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, r> f49494j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ TextStyle f49495k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f49496l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f49497m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f49498n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f49499o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ AbstractC18142l.b f49500p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C17442g f49501q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC5359x0 f49502r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1<b.TextSubstitutionValue, Unit> f49503s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f49504t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f49505u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f49506v;

        public final void a(Composer composer, int i10) {
            C5674f.g(this.f49490f, this.f49491g, this.f49492h, this.f49493i, this.f49494j, this.f49495k, this.f49496l, this.f49497m, this.f49498n, this.f49499o, this.f49500p, this.f49501q, this.f49502r, this.f49503s, null, composer, J0.a(this.f49504t | 1), J0.a(this.f49505u), this.f49506v);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Modifier modifier, AnnotatedString annotatedString, Function1<? super TextLayoutResult, Unit> function1, boolean z10, Map<String, r> map, TextStyle textStyle, int i10, boolean z11, int i11, int i12, AbstractC18142l.b bVar, C17442g c17442g, InterfaceC5359x0 interfaceC5359x0, Function1<? super b.TextSubstitutionValue, Unit> function12, L l10, int i13, int i14, int i15) {
            super(2);
            this.f49490f = modifier;
            this.f49491g = annotatedString;
            this.f49492h = function1;
            this.f49493i = z10;
            this.f49494j = map;
            this.f49495k = textStyle;
            this.f49496l = i10;
            this.f49497m = z11;
            this.f49498n = i11;
            this.f49499o = i12;
            this.f49500p = bVar;
            this.f49501q = c17442g;
            this.f49502r = interfaceC5359x0;
            this.f49503s = function12;
            this.f49504t = i13;
            this.f49505u = i14;
            this.f49506v = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/geometry/Rect;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$m */
    static final class m extends Lambda implements Function1<List<? extends Rect>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<List<Rect>> f49507f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InterfaceC5730l0<List<Rect>> interfaceC5730l0) {
            super(1);
            this.f49507f = interfaceC5730l0;
        }

        public final void a(List<Rect> list) {
            InterfaceC5730l0<List<Rect>> interfaceC5730l0 = this.f49507f;
            if (interfaceC5730l0 == null) {
                return;
            }
            interfaceC5730l0.setValue(list);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list) {
            a(list);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "c", "()Landroidx/compose/ui/text/AnnotatedString;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$n */
    static final class n extends Lambda implements Function0<AnnotatedString> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0 f49508f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49509g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(k0 k0Var, AnnotatedString annotatedString) {
            super(0);
            this.f49508f = k0Var;
            this.f49509g = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString invoke() {
            AnnotatedString annotatedStringI;
            k0 k0Var = this.f49508f;
            return (k0Var == null || (annotatedStringI = k0Var.i()) == null) ? this.f49509g : annotatedStringI;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "c", "()Landroidx/compose/ui/text/AnnotatedString;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$o */
    static final class o extends Lambda implements Function0<AnnotatedString> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f49510f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(AnnotatedString annotatedString) {
            super(0);
            this.f49510f = annotatedString;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final AnnotatedString invoke() {
            return this.f49510f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/m;", "", "it", "a", "(LL0/m;J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$p */
    static final class p extends Lambda implements Function2<L0.m, Long, Long> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17701J f49511f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC17701J interfaceC17701J) {
            super(2);
            this.f49511f = interfaceC17701J;
        }

        public final Long a(L0.m mVar, long j10) {
            if (C17704M.b(this.f49511f, j10)) {
                return Long.valueOf(j10);
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Long invoke(L0.m mVar, Long l10) {
            return a(mVar, l10.longValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$q */
    static final class q extends Lambda implements Function1<Long, Long> {

        /* renamed from: f, reason: collision with root package name */
        public static final q f49512f = new q();

        q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Long invoke(Long l10) {
            return a(l10.longValue());
        }

        public final Long a(long j10) {
            return Long.valueOf(j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.text.AnnotatedString r37, androidx.compose.ui.Modifier r38, androidx.compose.ui.text.TextStyle r39, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r40, int r41, boolean r42, int r43, int r44, java.util.Map<java.lang.String, androidx.compose.foundation.text.r> r45, V0.InterfaceC5359x0 r46, androidx.compose.foundation.text.L r47, androidx.compose.runtime.Composer r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5674f.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, V0.x0, androidx.compose.foundation.text.L, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.ui.Modifier r29, androidx.compose.ui.text.AnnotatedString r30, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r31, boolean r32, java.util.Map<java.lang.String, androidx.compose.foundation.text.r> r33, androidx.compose.ui.text.TextStyle r34, int r35, boolean r36, int r37, int r38, kotlin.AbstractC18142l.b r39, v0.C17442g r40, V0.InterfaceC5359x0 r41, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.modifiers.b.TextSubstitutionValue, kotlin.Unit> r42, androidx.compose.foundation.text.L r43, androidx.compose.runtime.Composer r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5674f.g(androidx.compose.ui.Modifier, androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, boolean, java.util.Map, androidx.compose.ui.text.z, int, boolean, int, int, y1.l$b, v0.g, V0.x0, kotlin.jvm.functions.Function1, androidx.compose.foundation.text.L, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(androidx.compose.ui.text.AnnotatedString r29, androidx.compose.ui.Modifier r30, androidx.compose.ui.text.TextStyle r31, kotlin.jvm.functions.Function1 r32, int r33, boolean r34, int r35, int r36, java.util.Map r37, V0.InterfaceC5359x0 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5674f.b(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, V0.x0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[PHI: r21
      0x011b: PHI (r21v15 int) = (r21v4 int), (r21v10 int), (r21v11 int) binds: [B:100:0x0119, B:110:0x0136, B:109:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r38, androidx.compose.ui.Modifier r39, androidx.compose.ui.text.TextStyle r40, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r41, int r42, boolean r43, int r44, int r45, V0.InterfaceC5359x0 r46, androidx.compose.foundation.text.L r47, androidx.compose.runtime.Composer r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5674f.c(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, kotlin.jvm.functions.Function1, int, boolean, int, int, V0.x0, androidx.compose.foundation.text.L, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    @kotlin.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void d(java.lang.String r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, kotlin.jvm.functions.Function1 r29, int r30, boolean r31, int r32, int r33, V0.InterfaceC5359x0 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C5674f.d(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.z, kotlin.jvm.functions.Function1, int, boolean, int, int, V0.x0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final L0.k<Long, Long> l(InterfaceC17701J interfaceC17701J) {
        return L0.l.a(new p(interfaceC17701J), q.f49512f);
    }

    private static final Modifier m(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i10, boolean z10, int i11, int i12, AbstractC18142l.b bVar, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, C17442g c17442g, InterfaceC5359x0 interfaceC5359x0, Function1<? super b.TextSubstitutionValue, Unit> function13, L l10) {
        if (c17442g == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, null, interfaceC5359x0, l10, function13, null));
        }
        return modifier.then(c17442g.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, bVar, function1, i10, z10, i11, i12, list, function12, c17442g, interfaceC5359x0, l10, null));
    }

    private static final AnnotatedString e(InterfaceC5730l0<AnnotatedString> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC5730l0<AnnotatedString> interfaceC5730l0, AnnotatedString annotatedString) {
        interfaceC5730l0.setValue(annotatedString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<androidx.compose.ui.layout.f0, Function0<H1.n>>> k(List<? extends androidx.compose.ui.layout.I> list, Function0<Boolean> function0) {
        if (function0.invoke().booleanValue()) {
            p0 p0Var = new p0();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.compose.ui.layout.I i11 = list.get(i10);
                Object objA = i11.getParentData();
                Intrinsics.h(objA, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                o0 o0VarA = ((q0) objA).getMeasurePolicy().a(p0Var);
                arrayList.add(new Pair(i11.k0(H1.b.INSTANCE.b(o0VarA.getWidth(), o0VarA.getWidth(), o0VarA.getHeight(), o0VarA.getHeight())), o0VarA.b()));
            }
            return arrayList;
        }
        return null;
    }
}
