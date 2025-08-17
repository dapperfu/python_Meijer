package u1;

import V0.AbstractC5324i0;
import V0.C5346q0;
import V0.Shadow;
import V0.q1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0016H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010 J\u0017\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\rH&¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H&ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\t2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b1\u0010\u000bJ,\u00107\u001a\u0002062\u0006\u00102\u001a\u00020.2\u0006\u00104\u001a\u0002032\b\b\u0001\u00105\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020.2\u0006\u0010\b\u001a\u00020\u0002H&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:JR\u0010G\u001a\u0002062\u0006\u0010<\u001a\u00020;2\b\b\u0002\u0010>\u001a\u00020=2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020EH&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJZ\u0010L\u001a\u0002062\u0006\u0010<\u001a\u00020;2\u0006\u0010J\u001a\u00020I2\b\b\u0002\u0010K\u001a\u00020\r2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010F\u001a\u00020EH&ø\u0001\u0000¢\u0006\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010T\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010OR\u0014\u0010V\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010OR\u0014\u0010X\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010OR\u0014\u0010Z\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010OR\u0014\u0010]\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0a8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\u0082\u0001\u0001eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006fÀ\u0006\u0003"}, d2 = {"Lu1/f;", "", "", "start", "end", "LV0/q1;", "t", "(II)LV0/q1;", "offset", "Landroidx/compose/ui/geometry/Rect;", "j", "(I)Landroidx/compose/ui/geometry/Rect;", "lineIndex", "", "d", "(I)F", "a", "i", "A", "b", "n", "(I)I", "", "visibleEnd", "o", "(IZ)I", "x", "usePrimaryDirection", "u", "(IZ)F", "LF1/i;", "h", "(I)LF1/i;", "z", "vertical", "s", "(F)I", "LU0/f;", "position", "m", "(J)I", "rect", "Lu1/p;", "granularity", "Lu1/t;", "inclusionStrategy", "Landroidx/compose/ui/text/y;", "g", "(Landroidx/compose/ui/geometry/Rect;ILu1/t;)J", "f", "range", "", "array", "arrayStart", "", "v", "(J[FI)V", "k", "(I)J", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "LV0/q0;", "color", "LV0/B1;", "shadow", "LF1/k;", "textDecoration", "LX0/g;", "drawStyle", "LV0/c0;", "blendMode", "B", "(Landroidx/compose/ui/graphics/Canvas;JLV0/B1;LF1/k;LX0/g;I)V", "LV0/i0;", "brush", "alpha", "y", "(Landroidx/compose/ui/graphics/Canvas;LV0/i0;FLV0/B1;LF1/k;LX0/g;I)V", "getWidth", "()F", "width", "getHeight", "height", "e", "minIntrinsicWidth", "c", "maxIntrinsicWidth", "l", "firstBaseline", "w", "lastBaseline", "r", "()Z", "didExceedMaxLines", "p", "()I", "lineCount", "", "D", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/a;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: u1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC17214f {
    float A(int lineIndex);

    void B(Canvas canvas, long color, Shadow shadow, F1.k textDecoration, X0.g drawStyle, int blendMode);

    List<Rect> D();

    float a(int lineIndex);

    float b(int lineIndex);

    float c();

    float d(int lineIndex);

    float e();

    Rect f(int offset);

    long g(Rect rect, int granularity, t inclusionStrategy);

    float getHeight();

    float getWidth();

    F1.i h(int offset);

    float i(int lineIndex);

    Rect j(int offset);

    long k(int offset);

    float l();

    int m(long position);

    int n(int lineIndex);

    int o(int lineIndex, boolean visibleEnd);

    int p();

    boolean r();

    int s(float vertical);

    q1 t(int start, int end);

    float u(int offset, boolean usePrimaryDirection);

    void v(long range, float[] array, int arrayStart);

    float w();

    int x(int offset);

    void y(Canvas canvas, AbstractC5324i0 brush, float alpha, Shadow shadow, F1.k textDecoration, X0.g drawStyle, int blendMode);

    F1.i z(int offset);

    static /* synthetic */ void C(InterfaceC17214f interfaceC17214f, Canvas canvas, AbstractC5324i0 abstractC5324i0, float f10, Shadow shadow, F1.k kVar, X0.g gVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        interfaceC17214f.y(canvas, abstractC5324i0, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : gVar, (i11 & 64) != 0 ? X0.f.INSTANCE.a() : i10);
    }

    static /* synthetic */ void q(InterfaceC17214f interfaceC17214f, Canvas canvas, long j10, Shadow shadow, F1.k kVar, X0.g gVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        interfaceC17214f.B(canvas, (i11 & 2) != 0 ? C5346q0.INSTANCE.j() : j10, (i11 & 4) != 0 ? null : shadow, (i11 & 8) != 0 ? null : kVar, (i11 & 16) == 0 ? gVar : null, (i11 & 32) != 0 ? X0.f.INSTANCE.a() : i10);
    }
}
