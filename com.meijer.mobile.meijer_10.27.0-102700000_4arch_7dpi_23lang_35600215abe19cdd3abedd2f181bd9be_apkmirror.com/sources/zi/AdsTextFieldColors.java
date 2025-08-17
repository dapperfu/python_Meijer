package zi;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import ji.q1;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b-\u0010.JÆ\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b?\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010:\u001a\u0004\bB\u0010<R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010<R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010<R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u0010:\u001a\u0004\b`\u0010<R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010:\u001a\u0004\bb\u0010<R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010:\u001a\u0004\bd\u0010<R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010:\u001a\u0004\b@\u0010<R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010:\u001a\u0004\bg\u0010<R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010:\u001a\u0004\bi\u0010<R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010:\u001a\u0004\bk\u0010<R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010:\u001a\u0004\bm\u0010<R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010:\u001a\u0004\bo\u0010<R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010:\u001a\u0004\bq\u0010<R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010:\u001a\u0004\bs\u0010<R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010:\u001a\u0004\bu\u0010<¨\u0006w²\u0006\f\u0010v\u001a\u00020+8\nX\u008a\u0084\u0002²\u0006\f\u0010v\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lzi/c1;", "", "LV0/q0;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "warningCursorColor", "successCursorColor", "disabledIndicatorColor", "warningIndicatorColor", "successIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "warningTrailingIconColor", "successTrailingIconColor", "warningLeadingIconColor", "successLeadingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "warningLabelColor", "successLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lji/q1$f$a;", "state", "Lh0/j;", "interactionSource", "Landroidx/compose/runtime/z1;", "e", "(Lji/q1$f$a;Lh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "isError", "c", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "a", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lzi/c1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getTextColor-0d7_KjU", "()J", "b", "getDisabledTextColor-0d7_KjU", "getCursorColor-0d7_KjU", "d", "getErrorCursorColor-0d7_KjU", "getFocusedIndicatorColor-0d7_KjU", "f", "getUnfocusedIndicatorColor-0d7_KjU", "g", "getErrorIndicatorColor-0d7_KjU", "h", "getWarningCursorColor-0d7_KjU", "i", "getSuccessCursorColor-0d7_KjU", "j", "getDisabledIndicatorColor-0d7_KjU", "k", "getWarningIndicatorColor-0d7_KjU", "l", "getSuccessIndicatorColor-0d7_KjU", "m", "getLeadingIconColor-0d7_KjU", "n", "getDisabledLeadingIconColor-0d7_KjU", "o", "getErrorLeadingIconColor-0d7_KjU", "p", "getTrailingIconColor-0d7_KjU", "q", "getDisabledTrailingIconColor-0d7_KjU", "r", "getErrorTrailingIconColor-0d7_KjU", "s", "getWarningTrailingIconColor-0d7_KjU", "t", "getSuccessTrailingIconColor-0d7_KjU", "u", "getWarningLeadingIconColor-0d7_KjU", "v", "getSuccessLeadingIconColor-0d7_KjU", "w", "x", "getFocusedLabelColor-0d7_KjU", "y", "getUnfocusedLabelColor-0d7_KjU", "z", "getDisabledLabelColor-0d7_KjU", "A", "getErrorLabelColor-0d7_KjU", "B", "getWarningLabelColor-0d7_KjU", "C", "getSuccessLabelColor-0d7_KjU", "D", "getPlaceholderColor-0d7_KjU", "E", "getDisabledPlaceholderColor-0d7_KjU", "focused", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: zi.c1, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AdsTextFieldColors {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorLabelColor;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final long warningLabelColor;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successLabelColor;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final long placeholderColor;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledPlaceholderColor;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledTextColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long cursorColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorCursorColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long focusedIndicatorColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long unfocusedIndicatorColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorIndicatorColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long warningCursorColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successCursorColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledIndicatorColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long warningIndicatorColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successIndicatorColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long leadingIconColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledLeadingIconColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorLeadingIconColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long trailingIconColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledTrailingIconColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorTrailingIconColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long warningTrailingIconColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successTrailingIconColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final long warningLeadingIconColor;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long successLeadingIconColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final long focusedLabelColor;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final long unfocusedLabelColor;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long disabledLabelColor;

    public /* synthetic */ AdsTextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40);
    }

    public static /* synthetic */ AdsTextFieldColors b(AdsTextFieldColors adsTextFieldColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, int i10, Object obj) {
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        AdsTextFieldColors adsTextFieldColors2;
        long j71 = (i10 & 1) != 0 ? adsTextFieldColors.textColor : j10;
        long j72 = (i10 & 2) != 0 ? adsTextFieldColors.disabledTextColor : j11;
        long j73 = (i10 & 4) != 0 ? adsTextFieldColors.cursorColor : j12;
        long j74 = (i10 & 8) != 0 ? adsTextFieldColors.errorCursorColor : j13;
        long j75 = (i10 & 16) != 0 ? adsTextFieldColors.focusedIndicatorColor : j14;
        long j76 = (i10 & 32) != 0 ? adsTextFieldColors.unfocusedIndicatorColor : j15;
        long j77 = (i10 & 64) != 0 ? adsTextFieldColors.errorIndicatorColor : j16;
        long j78 = j71;
        long j79 = (i10 & 128) != 0 ? adsTextFieldColors.warningCursorColor : j17;
        long j80 = (i10 & 256) != 0 ? adsTextFieldColors.successCursorColor : j18;
        long j81 = (i10 & 512) != 0 ? adsTextFieldColors.disabledIndicatorColor : j19;
        long j82 = (i10 & 1024) != 0 ? adsTextFieldColors.warningIndicatorColor : j20;
        long j83 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? adsTextFieldColors.successIndicatorColor : j21;
        long j84 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? adsTextFieldColors.leadingIconColor : j22;
        long j85 = (i10 & 8192) != 0 ? adsTextFieldColors.disabledLeadingIconColor : j23;
        long j86 = (i10 & 16384) != 0 ? adsTextFieldColors.errorLeadingIconColor : j24;
        long j87 = (i10 & 32768) != 0 ? adsTextFieldColors.trailingIconColor : j25;
        long j88 = (i10 & 65536) != 0 ? adsTextFieldColors.disabledTrailingIconColor : j26;
        long j89 = (i10 & 131072) != 0 ? adsTextFieldColors.errorTrailingIconColor : j27;
        long j90 = (i10 & 262144) != 0 ? adsTextFieldColors.warningTrailingIconColor : j28;
        long j91 = (i10 & 524288) != 0 ? adsTextFieldColors.successTrailingIconColor : j29;
        long j92 = (i10 & 1048576) != 0 ? adsTextFieldColors.warningLeadingIconColor : j30;
        long j93 = (i10 & 2097152) != 0 ? adsTextFieldColors.successLeadingIconColor : j31;
        long j94 = (i10 & 4194304) != 0 ? adsTextFieldColors.backgroundColor : j32;
        long j95 = (i10 & 8388608) != 0 ? adsTextFieldColors.focusedLabelColor : j33;
        long j96 = (i10 & 16777216) != 0 ? adsTextFieldColors.unfocusedLabelColor : j34;
        long j97 = (i10 & 33554432) != 0 ? adsTextFieldColors.disabledLabelColor : j35;
        long j98 = (i10 & 67108864) != 0 ? adsTextFieldColors.errorLabelColor : j36;
        long j99 = (i10 & 134217728) != 0 ? adsTextFieldColors.warningLabelColor : j37;
        long j100 = (i10 & 268435456) != 0 ? adsTextFieldColors.successLabelColor : j38;
        long j101 = (i10 & 536870912) != 0 ? adsTextFieldColors.placeholderColor : j39;
        if ((i10 & 1073741824) != 0) {
            j42 = j101;
            j41 = adsTextFieldColors.disabledPlaceholderColor;
            j44 = j95;
            j45 = j96;
            j46 = j97;
            j47 = j98;
            j48 = j99;
            j49 = j100;
            j51 = j88;
            j52 = j89;
            j53 = j90;
            j54 = j91;
            j55 = j92;
            j56 = j93;
            j43 = j94;
            j58 = j81;
            j59 = j82;
            j60 = j83;
            j61 = j84;
            j62 = j85;
            j63 = j86;
            j50 = j87;
            j65 = j73;
            j66 = j74;
            j67 = j75;
            j68 = j76;
            j69 = j77;
            j70 = j79;
            j57 = j80;
            adsTextFieldColors2 = adsTextFieldColors;
            j64 = j72;
        } else {
            j41 = j40;
            j42 = j101;
            j43 = j94;
            j44 = j95;
            j45 = j96;
            j46 = j97;
            j47 = j98;
            j48 = j99;
            j49 = j100;
            j50 = j87;
            j51 = j88;
            j52 = j89;
            j53 = j90;
            j54 = j91;
            j55 = j92;
            j56 = j93;
            j57 = j80;
            j58 = j81;
            j59 = j82;
            j60 = j83;
            j61 = j84;
            j62 = j85;
            j63 = j86;
            j64 = j72;
            j65 = j73;
            j66 = j74;
            j67 = j75;
            j68 = j76;
            j69 = j77;
            j70 = j79;
            adsTextFieldColors2 = adsTextFieldColors;
        }
        return adsTextFieldColors2.a(j78, j64, j65, j66, j67, j68, j69, j70, j57, j58, j59, j60, j61, j62, j63, j50, j51, j52, j53, j54, j55, j56, j43, j44, j45, j46, j47, j48, j49, j42, j41);
    }

    public final AdsTextFieldColors a(long textColor, long disabledTextColor, long cursorColor, long errorCursorColor, long focusedIndicatorColor, long unfocusedIndicatorColor, long errorIndicatorColor, long warningCursorColor, long successCursorColor, long disabledIndicatorColor, long warningIndicatorColor, long successIndicatorColor, long leadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long trailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long warningTrailingIconColor, long successTrailingIconColor, long warningLeadingIconColor, long successLeadingIconColor, long backgroundColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long warningLabelColor, long successLabelColor, long placeholderColor, long disabledPlaceholderColor) {
        return new AdsTextFieldColors(textColor, disabledTextColor, cursorColor, errorCursorColor, focusedIndicatorColor, unfocusedIndicatorColor, errorIndicatorColor, warningCursorColor, successCursorColor, disabledIndicatorColor, warningIndicatorColor, successIndicatorColor, leadingIconColor, disabledLeadingIconColor, errorLeadingIconColor, trailingIconColor, disabledTrailingIconColor, errorTrailingIconColor, warningTrailingIconColor, successTrailingIconColor, warningLeadingIconColor, successLeadingIconColor, backgroundColor, focusedLabelColor, unfocusedLabelColor, disabledLabelColor, errorLabelColor, warningLabelColor, successLabelColor, placeholderColor, disabledPlaceholderColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdsTextFieldColors)) {
            return false;
        }
        AdsTextFieldColors adsTextFieldColors = (AdsTextFieldColors) other;
        return C5346q0.s(this.textColor, adsTextFieldColors.textColor) && C5346q0.s(this.disabledTextColor, adsTextFieldColors.disabledTextColor) && C5346q0.s(this.cursorColor, adsTextFieldColors.cursorColor) && C5346q0.s(this.errorCursorColor, adsTextFieldColors.errorCursorColor) && C5346q0.s(this.focusedIndicatorColor, adsTextFieldColors.focusedIndicatorColor) && C5346q0.s(this.unfocusedIndicatorColor, adsTextFieldColors.unfocusedIndicatorColor) && C5346q0.s(this.errorIndicatorColor, adsTextFieldColors.errorIndicatorColor) && C5346q0.s(this.warningCursorColor, adsTextFieldColors.warningCursorColor) && C5346q0.s(this.successCursorColor, adsTextFieldColors.successCursorColor) && C5346q0.s(this.disabledIndicatorColor, adsTextFieldColors.disabledIndicatorColor) && C5346q0.s(this.warningIndicatorColor, adsTextFieldColors.warningIndicatorColor) && C5346q0.s(this.successIndicatorColor, adsTextFieldColors.successIndicatorColor) && C5346q0.s(this.leadingIconColor, adsTextFieldColors.leadingIconColor) && C5346q0.s(this.disabledLeadingIconColor, adsTextFieldColors.disabledLeadingIconColor) && C5346q0.s(this.errorLeadingIconColor, adsTextFieldColors.errorLeadingIconColor) && C5346q0.s(this.trailingIconColor, adsTextFieldColors.trailingIconColor) && C5346q0.s(this.disabledTrailingIconColor, adsTextFieldColors.disabledTrailingIconColor) && C5346q0.s(this.errorTrailingIconColor, adsTextFieldColors.errorTrailingIconColor) && C5346q0.s(this.warningTrailingIconColor, adsTextFieldColors.warningTrailingIconColor) && C5346q0.s(this.successTrailingIconColor, adsTextFieldColors.successTrailingIconColor) && C5346q0.s(this.warningLeadingIconColor, adsTextFieldColors.warningLeadingIconColor) && C5346q0.s(this.successLeadingIconColor, adsTextFieldColors.successLeadingIconColor) && C5346q0.s(this.backgroundColor, adsTextFieldColors.backgroundColor) && C5346q0.s(this.focusedLabelColor, adsTextFieldColors.focusedLabelColor) && C5346q0.s(this.unfocusedLabelColor, adsTextFieldColors.unfocusedLabelColor) && C5346q0.s(this.disabledLabelColor, adsTextFieldColors.disabledLabelColor) && C5346q0.s(this.errorLabelColor, adsTextFieldColors.errorLabelColor) && C5346q0.s(this.warningLabelColor, adsTextFieldColors.warningLabelColor) && C5346q0.s(this.successLabelColor, adsTextFieldColors.successLabelColor) && C5346q0.s(this.placeholderColor, adsTextFieldColors.placeholderColor) && C5346q0.s(this.disabledPlaceholderColor, adsTextFieldColors.disabledPlaceholderColor);
    }

    private AdsTextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40) {
        this.textColor = j10;
        this.disabledTextColor = j11;
        this.cursorColor = j12;
        this.errorCursorColor = j13;
        this.focusedIndicatorColor = j14;
        this.unfocusedIndicatorColor = j15;
        this.errorIndicatorColor = j16;
        this.warningCursorColor = j17;
        this.successCursorColor = j18;
        this.disabledIndicatorColor = j19;
        this.warningIndicatorColor = j20;
        this.successIndicatorColor = j21;
        this.leadingIconColor = j22;
        this.disabledLeadingIconColor = j23;
        this.errorLeadingIconColor = j24;
        this.trailingIconColor = j25;
        this.disabledTrailingIconColor = j26;
        this.errorTrailingIconColor = j27;
        this.warningTrailingIconColor = j28;
        this.successTrailingIconColor = j29;
        this.warningLeadingIconColor = j30;
        this.successLeadingIconColor = j31;
        this.backgroundColor = j32;
        this.focusedLabelColor = j33;
        this.unfocusedLabelColor = j34;
        this.disabledLabelColor = j35;
        this.errorLabelColor = j36;
        this.warningLabelColor = j37;
        this.successLabelColor = j38;
        this.placeholderColor = j39;
        this.disabledPlaceholderColor = j40;
    }

    /* renamed from: d, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public final androidx.compose.runtime.z1<C5346q0> e(q1.f.a state, h0.j interactionSource, Composer composer, int i10) {
        long j10;
        Composer composer2;
        androidx.compose.runtime.z1<C5346q0> z1VarA;
        Intrinsics.j(state, "state");
        Intrinsics.j(interactionSource, "interactionSource");
        composer.startReplaceGroup(-16550107);
        if (ComposerKt.M()) {
            ComposerKt.U(-16550107, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsTextFieldColors.indicatorColor (AdsQuantityInputComposer.kt:565)");
        }
        androidx.compose.runtime.z1<Boolean> z1VarA2 = h0.f.a(interactionSource, composer, (i10 >> 3) & 14);
        if (state instanceof q1.f.a.C2216f) {
            j10 = this.warningIndicatorColor;
        } else if (state instanceof q1.f.a.e) {
            j10 = this.successIndicatorColor;
        } else if (state instanceof q1.f.a.c) {
            j10 = this.errorIndicatorColor;
        } else if (state instanceof q1.f.a.b) {
            j10 = f(z1VarA2) ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
        } else if (state instanceof q1.f.a.C2215a) {
            j10 = this.disabledIndicatorColor;
        } else {
            if (!(state instanceof q1.f.a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = this.unfocusedIndicatorColor;
        }
        long j11 = j10;
        if (state instanceof q1.f.a.C2215a) {
            composer.startReplaceGroup(877895972);
            z1VarA = androidx.compose.runtime.o1.p(C5346q0.m(j11), composer, 0);
            composer.P();
            composer2 = composer;
        } else {
            composer.startReplaceGroup(877959336);
            composer2 = composer;
            z1VarA = kotlin.t.a(j11, C6327j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return z1VarA;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((C5346q0.y(this.textColor) * 31) + C5346q0.y(this.disabledTextColor)) * 31) + C5346q0.y(this.cursorColor)) * 31) + C5346q0.y(this.errorCursorColor)) * 31) + C5346q0.y(this.focusedIndicatorColor)) * 31) + C5346q0.y(this.unfocusedIndicatorColor)) * 31) + C5346q0.y(this.errorIndicatorColor)) * 31) + C5346q0.y(this.warningCursorColor)) * 31) + C5346q0.y(this.successCursorColor)) * 31) + C5346q0.y(this.disabledIndicatorColor)) * 31) + C5346q0.y(this.warningIndicatorColor)) * 31) + C5346q0.y(this.successIndicatorColor)) * 31) + C5346q0.y(this.leadingIconColor)) * 31) + C5346q0.y(this.disabledLeadingIconColor)) * 31) + C5346q0.y(this.errorLeadingIconColor)) * 31) + C5346q0.y(this.trailingIconColor)) * 31) + C5346q0.y(this.disabledTrailingIconColor)) * 31) + C5346q0.y(this.errorTrailingIconColor)) * 31) + C5346q0.y(this.warningTrailingIconColor)) * 31) + C5346q0.y(this.successTrailingIconColor)) * 31) + C5346q0.y(this.warningLeadingIconColor)) * 31) + C5346q0.y(this.successLeadingIconColor)) * 31) + C5346q0.y(this.backgroundColor)) * 31) + C5346q0.y(this.focusedLabelColor)) * 31) + C5346q0.y(this.unfocusedLabelColor)) * 31) + C5346q0.y(this.disabledLabelColor)) * 31) + C5346q0.y(this.errorLabelColor)) * 31) + C5346q0.y(this.warningLabelColor)) * 31) + C5346q0.y(this.successLabelColor)) * 31) + C5346q0.y(this.placeholderColor)) * 31) + C5346q0.y(this.disabledPlaceholderColor);
    }

    public String toString() {
        return "AdsTextFieldColors(textColor=" + ((Object) C5346q0.z(this.textColor)) + ", disabledTextColor=" + ((Object) C5346q0.z(this.disabledTextColor)) + ", cursorColor=" + ((Object) C5346q0.z(this.cursorColor)) + ", errorCursorColor=" + ((Object) C5346q0.z(this.errorCursorColor)) + ", focusedIndicatorColor=" + ((Object) C5346q0.z(this.focusedIndicatorColor)) + ", unfocusedIndicatorColor=" + ((Object) C5346q0.z(this.unfocusedIndicatorColor)) + ", errorIndicatorColor=" + ((Object) C5346q0.z(this.errorIndicatorColor)) + ", warningCursorColor=" + ((Object) C5346q0.z(this.warningCursorColor)) + ", successCursorColor=" + ((Object) C5346q0.z(this.successCursorColor)) + ", disabledIndicatorColor=" + ((Object) C5346q0.z(this.disabledIndicatorColor)) + ", warningIndicatorColor=" + ((Object) C5346q0.z(this.warningIndicatorColor)) + ", successIndicatorColor=" + ((Object) C5346q0.z(this.successIndicatorColor)) + ", leadingIconColor=" + ((Object) C5346q0.z(this.leadingIconColor)) + ", disabledLeadingIconColor=" + ((Object) C5346q0.z(this.disabledLeadingIconColor)) + ", errorLeadingIconColor=" + ((Object) C5346q0.z(this.errorLeadingIconColor)) + ", trailingIconColor=" + ((Object) C5346q0.z(this.trailingIconColor)) + ", disabledTrailingIconColor=" + ((Object) C5346q0.z(this.disabledTrailingIconColor)) + ", errorTrailingIconColor=" + ((Object) C5346q0.z(this.errorTrailingIconColor)) + ", warningTrailingIconColor=" + ((Object) C5346q0.z(this.warningTrailingIconColor)) + ", successTrailingIconColor=" + ((Object) C5346q0.z(this.successTrailingIconColor)) + ", warningLeadingIconColor=" + ((Object) C5346q0.z(this.warningLeadingIconColor)) + ", successLeadingIconColor=" + ((Object) C5346q0.z(this.successLeadingIconColor)) + ", backgroundColor=" + ((Object) C5346q0.z(this.backgroundColor)) + ", focusedLabelColor=" + ((Object) C5346q0.z(this.focusedLabelColor)) + ", unfocusedLabelColor=" + ((Object) C5346q0.z(this.unfocusedLabelColor)) + ", disabledLabelColor=" + ((Object) C5346q0.z(this.disabledLabelColor)) + ", errorLabelColor=" + ((Object) C5346q0.z(this.errorLabelColor)) + ", warningLabelColor=" + ((Object) C5346q0.z(this.warningLabelColor)) + ", successLabelColor=" + ((Object) C5346q0.z(this.successLabelColor)) + ", placeholderColor=" + ((Object) C5346q0.z(this.placeholderColor)) + ", disabledPlaceholderColor=" + ((Object) C5346q0.z(this.disabledPlaceholderColor)) + ')';
    }

    private static final boolean f(androidx.compose.runtime.z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    public final androidx.compose.runtime.z1<C5346q0> c(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(-1246563211);
        if (ComposerKt.M()) {
            ComposerKt.U(-1246563211, i10, -1, "com.meijer.mobile.android_acres_library.composables.form_fields.AdsTextFieldColors.cursorColor (AdsQuantityInputComposer.kt:622)");
        }
        if (z10) {
            j10 = this.errorCursorColor;
        } else {
            j10 = this.cursorColor;
        }
        androidx.compose.runtime.z1<C5346q0> z1VarP = androidx.compose.runtime.o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }
}
