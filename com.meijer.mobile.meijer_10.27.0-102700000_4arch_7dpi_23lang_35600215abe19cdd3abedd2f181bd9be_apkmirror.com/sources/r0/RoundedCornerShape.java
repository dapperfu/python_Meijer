package r0;

import H1.t;
import U0.j;
import U0.l;
import V0.AbstractC5337m1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lr0/h;", "Lr0/a;", "Lr0/b;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Lr0/b;Lr0/b;Lr0/b;Lr0/b;)V", "LU0/k;", "size", "", "LH1/t;", "layoutDirection", "LV0/m1;", "e", "(JFFFFLH1/t;)LV0/m1;", "j", "(Lr0/b;Lr0/b;Lr0/b;Lr0/b;)Lr0/h;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r0.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class RoundedCornerShape extends AbstractC16684a {
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedCornerShape)) {
            return false;
        }
        RoundedCornerShape roundedCornerShape = (RoundedCornerShape) other;
        return Intrinsics.e(getTopStart(), roundedCornerShape.getTopStart()) && Intrinsics.e(getTopEnd(), roundedCornerShape.getTopEnd()) && Intrinsics.e(getBottomEnd(), roundedCornerShape.getBottomEnd()) && Intrinsics.e(getBottomStart(), roundedCornerShape.getBottomStart());
    }

    @Override // r0.AbstractC16684a
    public AbstractC5337m1 e(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, t layoutDirection) {
        if (topStart + topEnd + bottomEnd + bottomStart == 0.0f) {
            return new AbstractC5337m1.b(l.c(size));
        }
        Rect rectC = l.c(size);
        t tVar = t.f12006a;
        float f10 = layoutDirection == tVar ? topStart : topEnd;
        long jB = U0.a.b((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        float f11 = layoutDirection == tVar ? topEnd : topStart;
        long jB2 = U0.a.b((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
        float f12 = layoutDirection == tVar ? bottomEnd : bottomStart;
        long jB3 = U0.a.b((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        float f13 = layoutDirection == tVar ? bottomStart : bottomEnd;
        return new AbstractC5337m1.c(j.c(rectC, jB, jB2, jB3, U0.a.b((Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32))));
    }

    @Override // r0.AbstractC16684a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public RoundedCornerShape c(InterfaceC16685b topStart, InterfaceC16685b topEnd, InterfaceC16685b bottomEnd, InterfaceC16685b bottomStart) {
        return new RoundedCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public RoundedCornerShape(InterfaceC16685b interfaceC16685b, InterfaceC16685b interfaceC16685b2, InterfaceC16685b interfaceC16685b3, InterfaceC16685b interfaceC16685b4) {
        super(interfaceC16685b, interfaceC16685b2, interfaceC16685b3, interfaceC16685b4);
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }
}
