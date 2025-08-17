package kotlin;

import V0.C5346q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.C6327j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.t;
import t1.EnumC17055a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\"\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Lx0/Q;", "Lx0/A;", "LV0/q0;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lt1/a;", "state", "Landroidx/compose/runtime/z1;", "a", "(Lt1/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "enabled", "b", "(ZLt1/a;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "c", "J", "d", "e", "f", "g", "h", "i", "j", "k", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17900Q implements InterfaceC17868A {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long checkedCheckmarkColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedCheckmarkColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long checkedBoxColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBoxColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long disabledCheckedBoxColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long disabledUncheckedBoxColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBoxColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long checkedBorderColor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long uncheckedBorderColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long disabledBorderColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndeterminateBorderColor;

    public /* synthetic */ C17900Q(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.Q$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC17055a.values().length];
            try {
                iArr[EnumC17055a.f161355a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17055a.f161357c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17055a.f161356b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private C17900Q(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.checkedCheckmarkColor = j10;
        this.uncheckedCheckmarkColor = j11;
        this.checkedBoxColor = j12;
        this.uncheckedBoxColor = j13;
        this.disabledCheckedBoxColor = j14;
        this.disabledUncheckedBoxColor = j15;
        this.disabledIndeterminateBoxColor = j16;
        this.checkedBorderColor = j17;
        this.uncheckedBorderColor = j18;
        this.disabledBorderColor = j19;
        this.disabledIndeterminateBorderColor = j20;
    }

    @Override // kotlin.InterfaceC17868A
    public z1<C5346q0> a(EnumC17055a enumC17055a, Composer composer, int i10) {
        long j10;
        int i11;
        composer.startReplaceGroup(544656267);
        if (ComposerKt.M()) {
            ComposerKt.U(544656267, i10, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:407)");
        }
        EnumC17055a enumC17055a2 = EnumC17055a.f161356b;
        if (enumC17055a == enumC17055a2) {
            j10 = this.uncheckedCheckmarkColor;
        } else {
            j10 = this.checkedCheckmarkColor;
        }
        long j11 = j10;
        if (enumC17055a == enumC17055a2) {
            i11 = 100;
        } else {
            i11 = 50;
        }
        z1<C5346q0> z1VarA = t.a(j11, C6327j.l(i11, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarA;
    }

    @Override // kotlin.InterfaceC17868A
    public z1<C5346q0> b(boolean z10, EnumC17055a enumC17055a, Composer composer, int i10) {
        long j10;
        Composer composer2;
        z1<C5346q0> z1VarP;
        int i11;
        composer.startReplaceGroup(840901029);
        if (ComposerKt.M()) {
            ComposerKt.U(840901029, i10, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:420)");
        }
        if (z10) {
            int i12 = a.$EnumSwitchMapping$0[enumC17055a.ordinal()];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3) {
                    j10 = this.uncheckedBoxColor;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j10 = this.checkedBoxColor;
            }
        } else {
            int i13 = a.$EnumSwitchMapping$0[enumC17055a.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        j10 = this.disabledUncheckedBoxColor;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j10 = this.disabledIndeterminateBoxColor;
                }
            } else {
                j10 = this.disabledCheckedBoxColor;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceGroup(507535414);
            if (enumC17055a == EnumC17055a.f161356b) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            composer2 = composer;
            z1VarP = t.a(j11, C6327j.l(i11, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.P();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(507715958);
            z1VarP = o1.p(C5346q0.m(j11), composer2, 0);
            composer2.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return z1VarP;
    }

    @Override // kotlin.InterfaceC17868A
    public z1<C5346q0> c(boolean z10, EnumC17055a enumC17055a, Composer composer, int i10) {
        long j10;
        Composer composer2;
        z1<C5346q0> z1VarP;
        int i11;
        composer.startReplaceGroup(-1568341342);
        if (ComposerKt.M()) {
            ComposerKt.U(-1568341342, i10, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:447)");
        }
        if (z10) {
            int i12 = a.$EnumSwitchMapping$0[enumC17055a.ordinal()];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3) {
                    j10 = this.uncheckedBorderColor;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                j10 = this.checkedBorderColor;
            }
        } else {
            int i13 = a.$EnumSwitchMapping$0[enumC17055a.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j10 = this.disabledBorderColor;
                } else {
                    j10 = this.disabledIndeterminateBorderColor;
                }
            } else {
                j10 = this.disabledBorderColor;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceGroup(-840498473);
            if (enumC17055a == EnumC17055a.f161356b) {
                i11 = 100;
            } else {
                i11 = 50;
            }
            composer2 = composer;
            z1VarP = t.a(j11, C6327j.l(i11, 0, null, 6, null), null, null, composer2, 0, 12);
            composer2.P();
        } else {
            composer2 = composer;
            composer2.startReplaceGroup(-840317929);
            z1VarP = o1.p(C5346q0.m(j11), composer2, 0);
            composer2.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer2.P();
        return z1VarP;
    }
}
