package kotlin;

import V0.C5489q0;
import V0.D1;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.AbstractC16798a;
import z1.W;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jä\u0001\u00100\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u00020\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101Jä\u0001\u00106\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u00102\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u00020\u001a2\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020\u001a2\b\b\u0002\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u00020\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00101JÅ\u0001\u0010D\u001a\u00020\u00102\u0006\u00108\u001a\u0002072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010092\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001092\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001092\u0010\b\u0002\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001092\u0010\b\u0002\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001092\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\u00172\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001009H\u0007¢\u0006\u0004\bD\u0010ER\u001d\u0010I\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bG\u0010HR\u001d\u0010K\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\bJ\u0010HR\u001d\u0010M\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bL\u0010HR\u001d\u0010P\u001a\u00020\r8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010F\u001a\u0004\bO\u0010HR\u0011\u0010R\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bN\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006S"}, d2 = {"Lx0/G1;", "", "<init>", "()V", "", "enabled", "isError", "Lh0/j;", "interactionSource", "Lx0/F1;", "colors", "LV0/D1;", "shape", "LH1/h;", "focusedBorderThickness", "unfocusedBorderThickness", "", "a", "(ZZLh0/j;Lx0/F1;LV0/D1;FFLandroidx/compose/runtime/Composer;II)V", "start", "top", "end", "bottom", "Lj0/C;", "g", "(FFFF)Lj0/C;", "LV0/q0;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "i", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Lx0/F1;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "f", "", "value", "Lkotlin/Function0;", "innerTextField", "singleLine", "Lz1/W;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "border", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLz1/W;Lh0/j;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LV0/D1;Lx0/F1;Lj0/C;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "F", "c", "()F", "MinHeight", "d", "MinWidth", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "e", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "(Landroidx/compose/runtime/Composer;I)LV0/D1;", "OutlinedTextFieldShape", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public static final G1 f167993a = new G1();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float MinHeight = H1.h.p(56);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float MinWidth = H1.h.p(280);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float UnfocusedBorderThickness = H1.h.p(1);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float FocusedBorderThickness = H1.h.p(2);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f167999g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168000h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ h0.j f168001i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ F1 f168002j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ D1 f168003k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f168004l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168005m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f168006n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f168007o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, h0.j jVar, F1 f12, D1 d12, float f10, float f11, int i10, int i11) {
            super(2);
            this.f167999g = z10;
            this.f168000h = z11;
            this.f168001i = jVar;
            this.f168002j = f12;
            this.f168003k = d12;
            this.f168004l = f10;
            this.f168005m = f11;
            this.f168006n = i10;
            this.f168007o = i11;
        }

        public final void a(Composer composer, int i10) {
            G1.this.a(this.f167999g, this.f168000h, this.f168001i, this.f168002j, this.f168003k, this.f168004l, this.f168005m, composer, J0.a(this.f168006n | 1), this.f168007o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168008f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f168009g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ h0.j f168010h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ F1 f168011i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ D1 f168012j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, boolean z11, h0.j jVar, F1 f12, D1 d12) {
            super(2);
            this.f168008f = z10;
            this.f168009g = z11;
            this.f168010h = jVar;
            this.f168011i = f12;
            this.f168012j = d12;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2147252344, i10, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:659)");
            }
            G1.f167993a.a(this.f168008f, this.f168009g, this.f168010h, this.f168011i, this.f168012j, 0.0f, 0.0f, composer, 12582912, 96);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f168014g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168015h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f168016i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168017j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ W f168018k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.j f168019l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f168020m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168021n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168022o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168023p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168024q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ D1 f168025r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ F1 f168026s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f168027t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168028u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f168029v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f168030w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168031x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, boolean z11, W w10, h0.j jVar, boolean z12, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, D1 d12, F1 f12, InterfaceC14882C interfaceC14882C, Function2<? super Composer, ? super Integer, Unit> function26, int i10, int i11, int i12) {
            super(2);
            this.f168014g = str;
            this.f168015h = function2;
            this.f168016i = z10;
            this.f168017j = z11;
            this.f168018k = w10;
            this.f168019l = jVar;
            this.f168020m = z12;
            this.f168021n = function22;
            this.f168022o = function23;
            this.f168023p = function24;
            this.f168024q = function25;
            this.f168025r = d12;
            this.f168026s = f12;
            this.f168027t = interfaceC14882C;
            this.f168028u = function26;
            this.f168029v = i10;
            this.f168030w = i11;
            this.f168031x = i12;
        }

        public final void a(Composer composer, int i10) {
            G1.this.b(this.f168014g, this.f168015h, this.f168016i, this.f168017j, this.f168018k, this.f168019l, this.f168020m, this.f168021n, this.f168022o, this.f168023p, this.f168024q, this.f168025r, this.f168026s, this.f168027t, this.f168028u, composer, J0.a(this.f168029v | 1), J0.a(this.f168030w), this.f168031x);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r62, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r63, boolean r64, boolean r65, z1.W r66, h0.j r67, boolean r68, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r69, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r71, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, V0.D1 r73, kotlin.F1 r74, j0.InterfaceC14882C r75, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r76, androidx.compose.runtime.Composer r77, int r78, int r79, int r80) {
        /*
            Method dump skipped, instructions count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.G1.b(java.lang.String, kotlin.jvm.functions.Function2, boolean, boolean, z1.W, h0.j, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, V0.D1, x0.F1, j0.C, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final F1 f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i10, int i11, int i12, int i13) {
        long j31;
        long jQ;
        long j32;
        long jQ2;
        long j33;
        long jQ3;
        long j34;
        long jQ4;
        long j35;
        long jQ5 = (i13 & 1) != 0 ? C5489q0.q(((C5489q0) composer.o(C17960N.a())).getValue(), ((Number) composer.o(C17958M.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jQ6 = (i13 & 2) != 0 ? C5489q0.q(jQ5, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jI = (i13 & 4) != 0 ? C5489q0.INSTANCE.i() : j12;
        long j36 = (i13 & 8) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j13;
        long jD = (i13 & 16) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j14;
        long jQ7 = (i13 & 32) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).j(), C17956L.f168212a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jQ8 = (i13 & 64) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j37 = jQ8;
            jQ = C5489q0.q(j37, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j31 = j37;
        } else {
            j31 = jQ8;
            jQ = j17;
        }
        long jD2 = (i13 & 256) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j18;
        long jQ9 = (i13 & 512) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j38 = jQ9;
            jQ2 = C5489q0.q(j38, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j38;
        } else {
            j32 = jQ9;
            jQ2 = j20;
        }
        long j39 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? j32 : j21;
        long jQ10 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            long j40 = jQ10;
            jQ3 = C5489q0.q(j40, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j40;
        } else {
            j33 = jQ10;
            jQ3 = j23;
        }
        long jD3 = (i13 & 16384) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j24;
        long jQ11 = (32768 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).j(), C17956L.f168212a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jQ12 = (65536 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            long j41 = jQ12;
            jQ4 = C5489q0.q(j41, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j41;
        } else {
            j34 = jQ12;
            jQ4 = j27;
        }
        long jD4 = (262144 & i13) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j28;
        long jQ13 = (524288 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jQ14 = (i13 & 1048576) != 0 ? C5489q0.q(jQ13, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.M()) {
            j35 = jQ14;
            ComposerKt.U(1762667317, i10, i11, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:462)");
        } else {
            j35 = jQ14;
        }
        C17979X c17979x = new C17979X(jQ5, jQ6, j36, jD, jQ7, j31, jD2, jQ, j32, jQ2, j39, j33, jQ3, jD3, jI, jQ11, j34, jQ4, jD4, jQ13, j35, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17979x;
    }

    public final F1 i(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, Composer composer, int i10, int i11, int i12, int i13) {
        long j31;
        long jQ;
        long j32;
        long jQ2;
        long j33;
        long jQ3;
        long j34;
        long jQ4;
        long j35;
        long jQ5 = (i13 & 1) != 0 ? C5489q0.q(((C5489q0) composer.o(C17960N.a())).getValue(), ((Number) composer.o(C17958M.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long jQ6 = (i13 & 2) != 0 ? C5489q0.q(jQ5, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long jQ7 = (i13 & 4) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long j36 = (i13 & 8) != 0 ? C17943E0.f167967a.a(composer, 6).j() : j13;
        long jD = (i13 & 16) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j14;
        long jQ8 = (i13 & 32) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).j(), C17956L.f168212a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jQ9 = (i13 & 64) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            long j37 = jQ9;
            jQ = C5489q0.q(j37, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j31 = j37;
        } else {
            j31 = jQ9;
            jQ = j17;
        }
        long jD2 = (i13 & 256) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j18;
        long jQ10 = (i13 & 512) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            long j38 = jQ10;
            jQ2 = C5489q0.q(j38, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j38;
        } else {
            j32 = jQ10;
            jQ2 = j20;
        }
        long j39 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? j32 : j21;
        long jQ11 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            long j40 = jQ11;
            jQ3 = C5489q0.q(j40, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j33 = j40;
        } else {
            j33 = jQ11;
            jQ3 = j23;
        }
        long jD3 = (i13 & 16384) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j24;
        long jQ12 = (32768 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).j(), C17956L.f168212a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jQ13 = (65536 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            long j41 = jQ13;
            jQ4 = C5489q0.q(j41, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j34 = j41;
        } else {
            j34 = jQ13;
            jQ4 = j27;
        }
        long jD4 = (262144 & i13) != 0 ? C17943E0.f167967a.a(composer, 6).d() : j28;
        long jQ14 = (524288 & i13) != 0 ? C5489q0.q(C17943E0.f167967a.a(composer, 6).i(), C17956L.f168212a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        long jQ15 = (i13 & 1048576) != 0 ? C5489q0.q(jQ14, C17956L.f168212a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j30;
        if (ComposerKt.M()) {
            j35 = jQ15;
            ComposerKt.U(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:408)");
        } else {
            j35 = jQ15;
        }
        C17979X c17979x = new C17979X(jQ5, jQ6, j36, jD, jQ8, j31, jD2, jQ, j32, jQ2, j39, j33, jQ3, jD3, jQ7, jQ12, j34, jQ4, jD4, jQ14, j35, null);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17979x;
    }

    public static /* synthetic */ InterfaceC14882C h(G1 g12, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = I1.f();
        }
        if ((i10 & 2) != 0) {
            f11 = I1.f();
        }
        if ((i10 & 4) != 0) {
            f12 = I1.f();
        }
        if ((i10 & 8) != 0) {
            f13 = I1.f();
        }
        return g12.g(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r20, boolean r21, h0.j r22, kotlin.F1 r23, V0.D1 r24, float r25, float r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.G1.a(boolean, boolean, h0.j, x0.F1, V0.D1, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float c() {
        return MinHeight;
    }

    public final float d() {
        return MinWidth;
    }

    private G1() {
    }

    @JvmName
    public final D1 e(Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(1899109048, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:227)");
        }
        AbstractC16798a small = C17943E0.f167967a.b(composer, 6).getSmall();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return small;
    }

    public final InterfaceC14882C g(float start, float top, float end, float bottom) {
        return D.d(start, top, end, bottom);
    }
}
