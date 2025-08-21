package kotlin;

import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lb0/s;", "", "", "scale", "Landroidx/compose/ui/graphics/i;", "transformOrigin", "Lc0/F;", "animationSpec", "<init>", "(FJLc0/F;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "J", "c", "()J", "Lc0/F;", "()Lc0/F;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.s, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class Scale {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float scale;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long transformOrigin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6419F<Float> animationSpec;

    public /* synthetic */ Scale(float f10, long j10, InterfaceC6419F interfaceC6419F, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10, interfaceC6419F);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) other;
        return Float.compare(this.scale, scale.scale) == 0 && androidx.compose.ui.graphics.i.e(this.transformOrigin, scale.transformOrigin) && Intrinsics.e(this.animationSpec, scale.animationSpec);
    }

    private Scale(float f10, long j10, InterfaceC6419F<Float> interfaceC6419F) {
        this.scale = f10;
        this.transformOrigin = j10;
        this.animationSpec = interfaceC6419F;
    }

    public final InterfaceC6419F<Float> a() {
        return this.animationSpec;
    }

    /* renamed from: b, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* renamed from: c, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.scale) * 31) + androidx.compose.ui.graphics.i.h(this.transformOrigin)) * 31) + this.animationSpec.hashCode();
    }

    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) androidx.compose.ui.graphics.i.i(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + ')';
    }
}
