package kotlin;

import V0.InterfaceC5502x0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import java.util.Map;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÒ\u0001\u0010!\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aæ\u0001\u0010'\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020#2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020%0$2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a%\u0010,\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001d0*H\u0007¢\u0006\u0004\b,\u0010-\"\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020\u001f0.8\u0006¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"", "text", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "color", "LH1/v;", "fontSize", "Ly1/w;", "fontStyle", "Ly1/B;", "fontWeight", "Ly1/l;", "fontFamily", "letterSpacing", "LF1/k;", "textDecoration", "LF1/j;", "textAlign", "lineHeight", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Lkotlin/Function1;", "Lu1/v;", "", "onTextLayout", "Landroidx/compose/ui/text/z;", "style", "b", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLy1/w;Ly1/B;Ly1/l;JLF1/k;LF1/j;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/z;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/AnnotatedString;", "", "Landroidx/compose/foundation/text/r;", "inlineContent", "c", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLy1/w;Ly1/B;Ly1/l;JLF1/k;LF1/j;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/z;Landroidx/compose/runtime/Composer;III)V", "value", "Lkotlin/Function0;", "content", "a", "(Landroidx/compose/ui/text/z;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/F0;", "Landroidx/compose/runtime/F0;", "d", "()Landroidx/compose/runtime/F0;", "LocalTextStyle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class N1 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<TextStyle> f168319a = r.c(o1.r(), a.f168320f);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextStyle f168321f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168322g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168323h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f168321f = textStyle;
            this.f168322g = function2;
            this.f168323h = i10;
        }

        public final void a(Composer composer, int i10) {
            N1.a(this.f168321f, this.f168322g, composer, J0.a(this.f168323h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/q0;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    static final class c implements InterfaceC5502x0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f168324a;

        c(long j10) {
            this.f168324a = j10;
        }

        @Override // V0.InterfaceC5502x0
        public final long a() {
            return this.f168324a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f168325f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168326g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168327h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168328i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C18280w f168329j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ FontWeight f168330k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC18269l f168331l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f168332m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ F1.k f168333n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ F1.j f168334o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f168335p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168336q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f168337r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f168338s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f168339t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f168340u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ TextStyle f168341v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f168342w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168343x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f168344y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, Modifier modifier, long j10, long j11, C18280w c18280w, FontWeight fontWeight, AbstractC18269l abstractC18269l, long j12, F1.k kVar, F1.j jVar, long j13, int i10, boolean z10, int i11, int i12, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, int i13, int i14, int i15) {
            super(2);
            this.f168325f = str;
            this.f168326g = modifier;
            this.f168327h = j10;
            this.f168328i = j11;
            this.f168329j = c18280w;
            this.f168330k = fontWeight;
            this.f168331l = abstractC18269l;
            this.f168332m = j12;
            this.f168333n = kVar;
            this.f168334o = jVar;
            this.f168335p = j13;
            this.f168336q = i10;
            this.f168337r = z10;
            this.f168338s = i11;
            this.f168339t = i12;
            this.f168340u = function1;
            this.f168341v = textStyle;
            this.f168342w = i13;
            this.f168343x = i14;
            this.f168344y = i15;
        }

        public final void a(Composer composer, int i10) {
            N1.b(this.f168325f, this.f168326g, this.f168327h, this.f168328i, this.f168329j, this.f168330k, this.f168331l, this.f168332m, this.f168333n, this.f168334o, this.f168335p, this.f168336q, this.f168337r, this.f168338s, this.f168339t, this.f168340u, this.f168341v, composer, J0.a(this.f168342w | 1), J0.a(this.f168343x), this.f168344y);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends Lambda implements Function1<TextLayoutResult, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f168345f = new e();

        e() {
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

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/q0;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    static final class f implements InterfaceC5502x0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f168346a;

        f(long j10) {
            this.f168346a = j10;
        }

        @Override // V0.InterfaceC5502x0
        public final long a() {
            return this.f168346a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AnnotatedString f168347f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168348g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168349h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168350i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C18280w f168351j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ FontWeight f168352k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ AbstractC18269l f168353l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f168354m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ F1.k f168355n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ F1.j f168356o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f168357p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168358q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f168359r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f168360s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f168361t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Map<String, androidx.compose.foundation.text.r> f168362u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Function1<TextLayoutResult, Unit> f168363v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ TextStyle f168364w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168365x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f168366y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f168367z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(AnnotatedString annotatedString, Modifier modifier, long j10, long j11, C18280w c18280w, FontWeight fontWeight, AbstractC18269l abstractC18269l, long j12, F1.k kVar, F1.j jVar, long j13, int i10, boolean z10, int i11, int i12, Map<String, androidx.compose.foundation.text.r> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, int i13, int i14, int i15) {
            super(2);
            this.f168347f = annotatedString;
            this.f168348g = modifier;
            this.f168349h = j10;
            this.f168350i = j11;
            this.f168351j = c18280w;
            this.f168352k = fontWeight;
            this.f168353l = abstractC18269l;
            this.f168354m = j12;
            this.f168355n = kVar;
            this.f168356o = jVar;
            this.f168357p = j13;
            this.f168358q = i10;
            this.f168359r = z10;
            this.f168360s = i11;
            this.f168361t = i12;
            this.f168362u = map;
            this.f168363v = function1;
            this.f168364w = textStyle;
            this.f168365x = i13;
            this.f168366y = i14;
            this.f168367z = i15;
        }

        public final void a(Composer composer, int i10) {
            N1.c(this.f168347f, this.f168348g, this.f168349h, this.f168350i, this.f168351j, this.f168352k, this.f168353l, this.f168354m, this.f168355n, this.f168356o, this.f168357p, this.f168358q, this.f168359r, this.f168360s, this.f168361t, this.f168362u, this.f168363v, this.f168364w, composer, J0.a(this.f168365x | 1), J0.a(this.f168366y), this.f168367z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r67, androidx.compose.ui.Modifier r68, long r69, long r71, kotlin.C18280w r73, kotlin.FontWeight r74, kotlin.AbstractC18269l r75, long r76, F1.k r78, F1.j r79, long r80, int r82, boolean r83, int r84, int r85, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r86, androidx.compose.ui.text.TextStyle r87, androidx.compose.runtime.Composer r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.N1.b(java.lang.String, androidx.compose.ui.Modifier, long, long, y1.w, y1.B, y1.l, long, F1.k, F1.j, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.z, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.text.AnnotatedString r60, androidx.compose.ui.Modifier r61, long r62, long r64, kotlin.C18280w r66, kotlin.FontWeight r67, kotlin.AbstractC18269l r68, long r69, F1.k r71, F1.j r72, long r73, int r75, boolean r76, int r77, int r78, java.util.Map<java.lang.String, androidx.compose.foundation.text.r> r79, kotlin.jvm.functions.Function1<? super u1.TextLayoutResult, kotlin.Unit> r80, androidx.compose.ui.text.TextStyle r81, androidx.compose.runtime.Composer r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 1188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.N1.c(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, y1.w, y1.B, y1.l, long, F1.k, F1.j, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.z, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/z;", "c", "()Landroidx/compose/ui/text/z;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<TextStyle> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168320f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final TextStyle invoke() {
            return Q1.b();
        }
    }

    public static final F0<TextStyle> d() {
        return f168319a;
    }

    public static final void a(TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(1772272796);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(textStyle)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(1772272796, i11, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:400)");
            }
            F0<TextStyle> f02 = f168319a;
            r.a(f02.d(((TextStyle) composerStartRestartGroup.o(f02)).J(textStyle)), function2, composerStartRestartGroup, (i11 & 112) | G0.f50200i);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(textStyle, function2, i10));
        }
    }
}
