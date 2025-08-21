package V0;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LV0/H1;", "LV0/z1;", "LU0/f;", "center", "", "LV0/q0;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LU0/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "J", "f", "Ljava/util/List;", "g", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class H1 extends z1 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long center;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<C5489q0> colors;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Float> stops;

    public /* synthetic */ H1(long j10, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, list, list2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) other;
        return U0.f.j(this.center, h12.center) && Intrinsics.e(this.colors, h12.colors) && Intrinsics.e(this.stops, h12.stops);
    }

    private H1(long j10, List<C5489q0> list, List<Float> list2) {
        this.center = j10;
        this.colors = list;
        this.stops = list2;
    }

    @Override // V0.z1
    public Shader b(long size) {
        long jE;
        long j10 = this.center;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            jE = U0.l.b(size);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j10 >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                size = this.center;
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L));
            jE = U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        }
        return A1.b(jE, this.colors, this.stops);
    }

    public int hashCode() {
        int iO = ((U0.f.o(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iO + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if ((this.center & 9223372034707292159L) != 9205357640488583168L) {
            str = "center=" + ((Object) U0.f.s(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}
