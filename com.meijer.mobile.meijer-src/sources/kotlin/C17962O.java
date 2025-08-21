package kotlin;

import V0.C5489q0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lx0/O;", "Lx0/u;", "LV0/q0;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Landroidx/compose/runtime/z1;", "a", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "d", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17962O implements InterfaceC18043u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledBackgroundColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ C17962O(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C17962O.class != other.getClass()) {
            return false;
        }
        C17962O c17962o = (C17962O) other;
        return C5489q0.s(this.backgroundColor, c17962o.backgroundColor) && C5489q0.s(this.contentColor, c17962o.contentColor) && C5489q0.s(this.disabledBackgroundColor, c17962o.disabledBackgroundColor) && C5489q0.s(this.disabledContentColor, c17962o.disabledContentColor);
    }

    private C17962O(long j10, long j11, long j12, long j13) {
        this.backgroundColor = j10;
        this.contentColor = j11;
        this.disabledBackgroundColor = j12;
        this.disabledContentColor = j13;
    }

    public int hashCode() {
        return (((((C5489q0.y(this.backgroundColor) * 31) + C5489q0.y(this.contentColor)) * 31) + C5489q0.y(this.disabledBackgroundColor)) * 31) + C5489q0.y(this.disabledContentColor);
    }

    @Override // kotlin.InterfaceC18043u
    public z1<C5489q0> a(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(-655254499);
        if (ComposerKt.M()) {
            ComposerKt.U(-655254499, i10, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:584)");
        }
        if (z10) {
            j10 = this.backgroundColor;
        } else {
            j10 = this.disabledBackgroundColor;
        }
        z1<C5489q0> z1VarP = o1.p(C5489q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }

    @Override // kotlin.InterfaceC18043u
    public z1<C5489q0> b(boolean z10, Composer composer, int i10) {
        long j10;
        composer.startReplaceGroup(-2133647540);
        if (ComposerKt.M()) {
            ComposerKt.U(-2133647540, i10, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:589)");
        }
        if (z10) {
            j10 = this.contentColor;
        } else {
            j10 = this.disabledContentColor;
        }
        z1<C5489q0> z1VarP = o1.p(C5489q0.m(j10), composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarP;
    }
}
