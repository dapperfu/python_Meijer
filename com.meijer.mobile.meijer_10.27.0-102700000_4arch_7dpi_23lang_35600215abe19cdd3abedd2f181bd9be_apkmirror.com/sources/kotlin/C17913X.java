package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b$\u0010\u001fJ-\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b%\u0010#J-\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b&\u0010#J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b)\u0010(J-\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b+\u0010#J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b,\u0010(J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0004\b-\u0010(J\u001a\u00100\u001a\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010.H\u0096\u0002¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u00105R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u00105R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u00105R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u00105R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u00105R\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u00105R\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b,\u00105R\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u00105R\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u00105R\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u00105R\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00105R\u001a\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u00105R\u001a\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u00105R\u001a\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u00105R\u001a\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u00105R\u001a\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u00105R\u001a\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u00105R\u001a\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b=\u00105R\u001a\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u00105R\u001a\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u00105R\u001a\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B²\u0006\f\u0010A\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010A\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lx0/X;", "Lx0/F1;", "LV0/q0;", "textColor", "disabledTextColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "errorIndicatorColor", "disabledIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "backgroundColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "isError", "Landroidx/compose/runtime/z1;", "c", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lh0/j;", "interactionSource", "h", "(ZZLh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "d", "b", "i", "a", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "e", "error", "f", "g", "j", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "focused", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17913X implements F1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long textColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long leadingIconColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long trailingIconColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long errorLabelColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long placeholderColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long disabledPlaceholderColor;

    public /* synthetic */ C17913X(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C17913X.class != other.getClass()) {
            return false;
        }
        C17913X c17913x = (C17913X) other;
        return C5346q0.s(this.textColor, c17913x.textColor) && C5346q0.s(this.disabledTextColor, c17913x.disabledTextColor) && C5346q0.s(this.cursorColor, c17913x.cursorColor) && C5346q0.s(this.errorCursorColor, c17913x.errorCursorColor) && C5346q0.s(this.focusedIndicatorColor, c17913x.focusedIndicatorColor) && C5346q0.s(this.unfocusedIndicatorColor, c17913x.unfocusedIndicatorColor) && C5346q0.s(this.errorIndicatorColor, c17913x.errorIndicatorColor) && C5346q0.s(this.disabledIndicatorColor, c17913x.disabledIndicatorColor) && C5346q0.s(this.leadingIconColor, c17913x.leadingIconColor) && C5346q0.s(this.disabledLeadingIconColor, c17913x.disabledLeadingIconColor) && C5346q0.s(this.errorLeadingIconColor, c17913x.errorLeadingIconColor) && C5346q0.s(this.trailingIconColor, c17913x.trailingIconColor) && C5346q0.s(this.disabledTrailingIconColor, c17913x.disabledTrailingIconColor) && C5346q0.s(this.errorTrailingIconColor, c17913x.errorTrailingIconColor) && C5346q0.s(this.backgroundColor, c17913x.backgroundColor) && C5346q0.s(this.focusedLabelColor, c17913x.focusedLabelColor) && C5346q0.s(this.unfocusedLabelColor, c17913x.unfocusedLabelColor) && C5346q0.s(this.disabledLabelColor, c17913x.disabledLabelColor) && C5346q0.s(this.errorLabelColor, c17913x.errorLabelColor) && C5346q0.s(this.placeholderColor, c17913x.placeholderColor) && C5346q0.s(this.disabledPlaceholderColor, c17913x.disabledPlaceholderColor);
    }

    private C17913X(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        this.textColor = j10;
        this.disabledTextColor = j11;
        this.cursorColor = j12;
        this.errorCursorColor = j13;
        this.focusedIndicatorColor = j14;
        this.unfocusedIndicatorColor = j15;
        this.errorIndicatorColor = j16;
        this.disabledIndicatorColor = j17;
        this.leadingIconColor = j18;
        this.disabledLeadingIconColor = j19;
        this.errorLeadingIconColor = j20;
        this.trailingIconColor = j21;
        this.disabledTrailingIconColor = j22;
        this.errorTrailingIconColor = j23;
        this.backgroundColor = j24;
        this.focusedLabelColor = j25;
        this.unfocusedLabelColor = j26;
        this.disabledLabelColor = j27;
        this.errorLabelColor = j28;
        this.placeholderColor = j29;
        this.disabledPlaceholderColor = j30;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((C5346q0.y(this.textColor) * 31) + C5346q0.y(this.disabledTextColor)) * 31) + C5346q0.y(this.cursorColor)) * 31) + C5346q0.y(this.errorCursorColor)) * 31) + C5346q0.y(this.focusedIndicatorColor)) * 31) + C5346q0.y(this.unfocusedIndicatorColor)) * 31) + C5346q0.y(this.errorIndicatorColor)) * 31) + C5346q0.y(this.disabledIndicatorColor)) * 31) + C5346q0.y(this.leadingIconColor)) * 31) + C5346q0.y(this.disabledLeadingIconColor)) * 31) + C5346q0.y(this.errorLeadingIconColor)) * 31) + C5346q0.y(this.trailingIconColor)) * 31) + C5346q0.y(this.disabledTrailingIconColor)) * 31) + C5346q0.y(this.errorTrailingIconColor)) * 31) + C5346q0.y(this.backgroundColor)) * 31) + C5346q0.y(this.focusedLabelColor)) * 31) + C5346q0.y(this.unfocusedLabelColor)) * 31) + C5346q0.y(this.disabledLabelColor)) * 31) + C5346q0.y(this.errorLabelColor)) * 31) + C5346q0.y(this.placeholderColor)) * 31) + C5346q0.y(this.disabledPlaceholderColor);
    }

    private static final boolean k(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    private static final boolean l(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    @Override // kotlin.F1
    public z1<C5346q0> a(boolean z10, Composer composer, int i10) {
        composer.startReplaceGroup(-1423938813);
        if (ComposerKt.M()) {
            ComposerKt.U(-1423938813, i10, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:868)");
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(this.backgroundColor), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> b(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(1383318157);
        if (ComposerKt.M()) {
            ComposerKt.U(1383318157, i10, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:835)");
        }
        if (!z10) {
            j10 = this.disabledTrailingIconColor;
        } else if (z11) {
            j10 = this.errorTrailingIconColor;
        } else {
            j10 = this.trailingIconColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> c(boolean z10, boolean z11, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(1016171324);
        if (ComposerKt.M()) {
            ComposerKt.U(1016171324, i10, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:793)");
        }
        if (!z10) {
            j10 = this.disabledLeadingIconColor;
        } else if (z11) {
            j10 = this.errorLeadingIconColor;
        } else {
            j10 = this.leadingIconColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> d(boolean z10, boolean z11, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(225259054);
        if (ComposerKt.M()) {
            ComposerKt.U(225259054, i10, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:820)");
        }
        if (!z10) {
            j10 = this.disabledTrailingIconColor;
        } else if (z11) {
            j10 = this.errorTrailingIconColor;
        } else {
            j10 = this.trailingIconColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> e(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(264799724);
        if (ComposerKt.M()) {
            ComposerKt.U(264799724, i10, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:873)");
        }
        if (z10) {
            j10 = this.placeholderColor;
        } else {
            j10 = this.disabledPlaceholderColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> f(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(727091888);
        if (ComposerKt.M()) {
            ComposerKt.U(727091888, i10, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:882)");
        }
        z1<Boolean> z1VarA = h0.f.a(jVar, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledLabelColor;
        } else if (z11) {
            j10 = this.errorLabelColor;
        } else if (l(z1VarA)) {
            j10 = this.focusedLabelColor;
        } else {
            j10 = this.unfocusedLabelColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> g(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(9804418);
        if (ComposerKt.M()) {
            ComposerKt.U(9804418, i10, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:896)");
        }
        if (z10) {
            j10 = this.textColor;
        } else {
            j10 = this.disabledTextColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> h(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(-1519634405);
        if (ComposerKt.M()) {
            ComposerKt.U(-1519634405, i10, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:808)");
        }
        if (!z10) {
            j10 = this.disabledLeadingIconColor;
        } else if (z11) {
            j10 = this.errorLeadingIconColor;
        } else {
            j10 = this.leadingIconColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> i(boolean z10, boolean z11, h0.j jVar, Composer composer, int i10) {
        long j10;
        Composer composer2;
        z1<C5346q0> z1VarP;
        composer.startReplaceGroup(998675979);
        if (ComposerKt.M()) {
            ComposerKt.U(998675979, i10, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:850)");
        }
        z1<Boolean> z1VarA = h0.f.a(jVar, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.disabledIndicatorColor;
        } else if (z11) {
            j10 = this.errorIndicatorColor;
        } else if (k(z1VarA)) {
            j10 = this.focusedIndicatorColor;
        } else {
            j10 = this.unfocusedIndicatorColor;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceGroup(1614254271);
            composer2 = composer;
            z1VarP = t.a(j11, C6327j.l(BinsView.TOTE_WIDTH_DP, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.P();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(1614357129);
            z1VarP = o1.p(C5346q0.m(j11), composer2, 0);
            composer2.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return z1VarP;
    }

    @Override // kotlin.F1
    public z1<C5346q0> j(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(-1446422485);
        if (ComposerKt.M()) {
            ComposerKt.U(-1446422485, i10, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:901)");
        }
        if (z10) {
            j10 = this.errorCursorColor;
        } else {
            j10 = this.cursorColor;
        }
        z1<C5346q0> z1VarP = o1.p(C5346q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }
}
