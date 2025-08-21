package X0;

import H1.t;
import V0.AbstractC5467i0;
import V0.C5447b1;
import V0.C5449c0;
import V0.C5489q0;
import V0.C5490r0;
import V0.F1;
import V0.G1;
import V0.InterfaceC5459f1;
import V0.P;
import V0.o1;
import V0.p1;
import V0.q1;
import V0.r1;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J`\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JN\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109JF\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=Jf\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJV\u0010H\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJV\u0010J\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJN\u0010N\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OJf\u0010T\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020R2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJf\u0010V\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020R2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJF\u0010Z\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010[JF\u0010\\\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]Jf\u0010b\u001a\u00020.2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020+0^2\u0006\u0010a\u001a\u00020`2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010cR \u0010i\u001a\u00020d8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010e\u0012\u0004\bh\u0010\u0003\u001a\u0004\bf\u0010gR\u001a\u0010o\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0014\u0010x\u001a\u00020u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006~"}, d2 = {"LX0/a;", "LX0/f;", "<init>", "()V", "LV0/o1;", "M", "()LV0/o1;", "N", "LX0/g;", "drawStyle", "O", "(LX0/g;)LV0/o1;", "LV0/i0;", "brush", "style", "", "alpha", "LV0/r0;", "colorFilter", "LV0/c0;", "blendMode", "LV0/b1;", "filterQuality", "q", "(LV0/i0;LX0/g;FLV0/r0;II)LV0/o1;", "LV0/q0;", "color", "a", "(JLX0/g;FLV0/r0;II)LV0/o1;", "strokeWidth", "miter", "LV0/F1;", "cap", "LV0/G1;", "join", "LV0/r1;", "pathEffect", "s", "(JFFIILV0/r1;FLV0/r0;II)LV0/o1;", "B", "(LV0/i0;FFIILV0/r1;FLV0/r0;II)LV0/o1;", "J", "(JF)J", "LU0/f;", "start", "end", "", "B1", "(LV0/i0;JJFILV0/r1;FLV0/r0;I)V", "n1", "(JJJFILV0/r1;FLV0/r0;I)V", "topLeft", "LU0/k;", "size", "W0", "(LV0/i0;JJFLX0/g;LV0/r0;I)V", "b2", "(JJJFLX0/g;LV0/r0;I)V", "LV0/f1;", "image", "q0", "(LV0/f1;JFLX0/g;LV0/r0;I)V", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "dstOffset", "dstSize", "U1", "(LV0/f1;JJJJFLX0/g;LV0/r0;II)V", "LU0/a;", "cornerRadius", "c0", "(LV0/i0;JJJFLX0/g;LV0/r0;I)V", "H1", "(JJJJLX0/g;FLV0/r0;I)V", "radius", "center", "P1", "(JFJFLX0/g;LV0/r0;I)V", "startAngle", "sweepAngle", "", "useCenter", "C1", "(LV0/i0;FFZJJFLX0/g;LV0/r0;I)V", "s0", "(JFFZJJFLX0/g;LV0/r0;I)V", "LV0/q1;", "path", "z0", "(LV0/q1;JFLX0/g;LV0/r0;I)V", "d2", "(LV0/q1;LV0/i0;FLX0/g;LV0/r0;I)V", "", "points", "Landroidx/compose/ui/graphics/f;", "pointMode", "C0", "(Ljava/util/List;IJFILV0/r1;FLV0/r0;I)V", "LX0/a$a;", "LX0/a$a;", "I", "()LX0/a$a;", "getDrawParams$annotations", "drawParams", "LX0/d;", "b", "LX0/d;", "L1", "()LX0/d;", "drawContext", "c", "LV0/o1;", "fillPaint", "d", "strokePaint", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "getDensity", "()F", "density", "F1", "fontScale", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d drawContext = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private o1 fillPaint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private o1 strokePaint;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LX0/a$a;", "", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "LU0/k;", "size", "<init>", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()LH1/d;", "b", "()LH1/t;", "c", "()Landroidx/compose/ui/graphics/Canvas;", "d", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LH1/d;", "f", "j", "(LH1/d;)V", "LH1/t;", "g", "k", "(LH1/t;)V", "Landroidx/compose/ui/graphics/Canvas;", "e", "i", "(Landroidx/compose/ui/graphics/Canvas;)V", "J", "h", "l", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @PublishedApi
    /* renamed from: X0.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class DrawParams {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private H1.d density;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private t layoutDirection;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private Canvas canvas;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        public /* synthetic */ DrawParams(H1.d dVar, t tVar, Canvas canvas, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, canvas, j10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.e(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.e(this.canvas, drawParams.canvas) && U0.k.f(this.size, drawParams.size);
        }

        private DrawParams(H1.d dVar, t tVar, Canvas canvas, long j10) {
            this.density = dVar;
            this.layoutDirection = tVar;
            this.canvas = canvas;
            this.size = j10;
        }

        /* renamed from: a, reason: from getter */
        public final H1.d getDensity() {
            return this.density;
        }

        /* renamed from: b, reason: from getter */
        public final t getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: c, reason: from getter */
        public final Canvas getCanvas() {
            return this.canvas;
        }

        /* renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final Canvas e() {
            return this.canvas;
        }

        public final H1.d f() {
            return this.density;
        }

        public final t g() {
            return this.layoutDirection;
        }

        public final long h() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + U0.k.j(this.size);
        }

        public final void i(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void j(H1.d dVar) {
            this.density = dVar;
        }

        public final void k(t tVar) {
            this.layoutDirection = tVar;
        }

        public final void l(long j10) {
            this.size = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) U0.k.l(this.size)) + ')';
        }

        public /* synthetic */ DrawParams(H1.d dVar, t tVar, Canvas canvas, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? t.f13338a : tVar, (i10 & 4) != 0 ? i.f41493a : canvas, (i10 & 8) != 0 ? U0.k.INSTANCE.b() : j10, null);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\t\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b\u0003\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"X0/a$b", "LX0/d;", "LX0/h;", "a", "LX0/h;", "e", "()LX0/h;", "transform", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "b", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "i", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "f", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/Canvas;", "value", "g", "()Landroidx/compose/ui/graphics/Canvas;", "j", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvas", "LU0/k;", "()J", "h", "(J)V", "size", "LH1/t;", "getLayoutDirection", "()LH1/t;", "d", "(LH1/t;)V", "layoutDirection", "LH1/d;", "getDensity", "()LH1/d;", "(LH1/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h transform = X0.b.b(this);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private GraphicsLayer graphicsLayer;

        b() {
        }

        @Override // X0.d
        public void a(H1.d dVar) {
            a.this.getDrawParams().j(dVar);
        }

        @Override // X0.d
        public long b() {
            return a.this.getDrawParams().h();
        }

        @Override // X0.d
        public void d(t tVar) {
            a.this.getDrawParams().k(tVar);
        }

        @Override // X0.d
        /* renamed from: e, reason: from getter */
        public h getTransform() {
            return this.transform;
        }

        @Override // X0.d
        public void f(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // X0.d
        public Canvas g() {
            return a.this.getDrawParams().e();
        }

        @Override // X0.d
        public H1.d getDensity() {
            return a.this.getDrawParams().f();
        }

        @Override // X0.d
        public t getLayoutDirection() {
            return a.this.getDrawParams().g();
        }

        @Override // X0.d
        public void h(long j10) {
            a.this.getDrawParams().l(j10);
        }

        @Override // X0.d
        /* renamed from: i, reason: from getter */
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // X0.d
        public void j(Canvas canvas) {
            a.this.getDrawParams().i(canvas);
        }
    }

    static /* synthetic */ o1 A(a aVar, long j10, float f10, float f11, int i10, int i11, r1 r1Var, float f12, C5490r0 c5490r0, int i12, int i13, int i14, Object obj) {
        return aVar.s(j10, f10, f11, i10, i11, r1Var, f12, c5490r0, i12, (i14 & 512) != 0 ? f.INSTANCE.b() : i13);
    }

    static /* synthetic */ o1 F(a aVar, AbstractC5467i0 abstractC5467i0, float f10, float f11, int i10, int i11, r1 r1Var, float f12, C5490r0 c5490r0, int i12, int i13, int i14, Object obj) {
        return aVar.B(abstractC5467i0, f10, f11, i10, i11, r1Var, f12, c5490r0, i12, (i14 & 512) != 0 ? f.INSTANCE.b() : i13);
    }

    private final long J(long j10, float f10) {
        return f10 == 1.0f ? j10 : C5489q0.q(j10, C5489q0.t(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final o1 M() {
        o1 o1Var = this.fillPaint;
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1VarA = P.a();
        o1VarA.H(p1.INSTANCE.a());
        this.fillPaint = o1VarA;
        return o1VarA;
    }

    private final o1 N() {
        o1 o1Var = this.strokePaint;
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1VarA = P.a();
        o1VarA.H(p1.INSTANCE.b());
        this.strokePaint = o1VarA;
        return o1VarA;
    }

    private final o1 O(g drawStyle) {
        if (Intrinsics.e(drawStyle, j.f41494a)) {
            return M();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        o1 o1VarN = N();
        Stroke kVar = (Stroke) drawStyle;
        if (o1VarN.J() != kVar.getWidth()) {
            o1VarN.I(kVar.getWidth());
        }
        if (!F1.e(o1VarN.v(), kVar.getCap())) {
            o1VarN.r(kVar.getCap());
        }
        if (o1VarN.B() != kVar.getMiter()) {
            o1VarN.F(kVar.getMiter());
        }
        if (!G1.e(o1VarN.A(), kVar.getJoin())) {
            o1VarN.w(kVar.getJoin());
        }
        if (!Intrinsics.e(o1VarN.getPathEffect(), kVar.getPathEffect())) {
            o1VarN.t(kVar.getPathEffect());
        }
        return o1VarN;
    }

    static /* synthetic */ o1 f(a aVar, long j10, g gVar, float f10, C5490r0 c5490r0, int i10, int i11, int i12, Object obj) {
        return aVar.a(j10, gVar, f10, c5490r0, i10, (i12 & 32) != 0 ? f.INSTANCE.b() : i11);
    }

    static /* synthetic */ o1 r(a aVar, AbstractC5467i0 abstractC5467i0, g gVar, float f10, C5490r0 c5490r0, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.INSTANCE.b();
        }
        return aVar.q(abstractC5467i0, gVar, f10, c5490r0, i10, i11);
    }

    @Override // X0.f
    public void B1(AbstractC5467i0 brush, long start, long end, float strokeWidth, int cap, r1 pathEffect, float alpha, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().o(start, end, F(this, brush, strokeWidth, 4.0f, cap, G1.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // X0.f
    public void C0(List<U0.f> points, int pointMode, long color, float strokeWidth, int cap, r1 pathEffect, float alpha, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().b(pointMode, points, A(this, color, strokeWidth, 4.0f, cap, G1.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // X0.f
    public void C1(AbstractC5467i0 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().g(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, r(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.drawParams.f().getFontScale();
    }

    @Override // X0.f
    public void H1(long color, long topLeft, long size, long cornerRadius, g style, float alpha, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().n(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    /* renamed from: I, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // X0.f
    /* renamed from: L1, reason: from getter */
    public d getDrawContext() {
        return this.drawContext;
    }

    @Override // X0.f
    public void P1(long color, float radius, long center, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().w(center, radius, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void U1(InterfaceC5459f1 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, C5490r0 colorFilter, int blendMode, int filterQuality) {
        this.drawParams.e().h(image, srcOffset, srcSize, dstOffset, dstSize, q(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // X0.f
    public void W0(AbstractC5467i0 brush, long topLeft, long size, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().f(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), r(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void b2(long color, long topLeft, long size, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().f(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void c0(AbstractC5467i0 brush, long topLeft, long size, long cornerRadius, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().n(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), r(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void d2(q1 path, AbstractC5467i0 brush, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().s(path, r(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // H1.d
    public float getDensity() {
        return this.drawParams.f().getDensity();
    }

    @Override // X0.f
    public t getLayoutDirection() {
        return this.drawParams.g();
    }

    @Override // X0.f
    public void n1(long color, long start, long end, float strokeWidth, int cap, r1 pathEffect, float alpha, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().o(start, end, A(this, color, strokeWidth, 4.0f, cap, G1.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // X0.f
    public void q0(InterfaceC5459f1 image, long topLeft, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().k(image, topLeft, r(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void s0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.e().g(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // X0.f
    public void z0(q1 path, long color, float alpha, g style, C5490r0 colorFilter, int blendMode) {
        this.drawParams.e().s(path, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    private final o1 B(AbstractC5467i0 brush, float strokeWidth, float miter, int cap, int join, r1 pathEffect, float alpha, C5490r0 colorFilter, int blendMode, int filterQuality) {
        o1 o1VarN = N();
        if (brush != null) {
            brush.a(b(), o1VarN, alpha);
        } else if (o1VarN.a() != alpha) {
            o1VarN.d(alpha);
        }
        if (!Intrinsics.e(o1VarN.getInternalColorFilter(), colorFilter)) {
            o1VarN.z(colorFilter);
        }
        if (!C5449c0.E(o1VarN.get_blendMode(), blendMode)) {
            o1VarN.s(blendMode);
        }
        if (o1VarN.J() != strokeWidth) {
            o1VarN.I(strokeWidth);
        }
        if (o1VarN.B() != miter) {
            o1VarN.F(miter);
        }
        if (!F1.e(o1VarN.v(), cap)) {
            o1VarN.r(cap);
        }
        if (!G1.e(o1VarN.A(), join)) {
            o1VarN.w(join);
        }
        if (!Intrinsics.e(o1VarN.getPathEffect(), pathEffect)) {
            o1VarN.t(pathEffect);
        }
        if (!C5447b1.d(o1VarN.G(), filterQuality)) {
            o1VarN.u(filterQuality);
        }
        return o1VarN;
    }

    private final o1 a(long color, g style, float alpha, C5490r0 colorFilter, int blendMode, int filterQuality) {
        o1 o1VarO = O(style);
        long J10 = J(color, alpha);
        if (!C5489q0.s(o1VarO.b(), J10)) {
            o1VarO.x(J10);
        }
        if (o1VarO.getInternalShader() != null) {
            o1VarO.D(null);
        }
        if (!Intrinsics.e(o1VarO.getInternalColorFilter(), colorFilter)) {
            o1VarO.z(colorFilter);
        }
        if (!C5449c0.E(o1VarO.get_blendMode(), blendMode)) {
            o1VarO.s(blendMode);
        }
        if (!C5447b1.d(o1VarO.G(), filterQuality)) {
            o1VarO.u(filterQuality);
        }
        return o1VarO;
    }

    private final o1 q(AbstractC5467i0 brush, g style, float alpha, C5490r0 colorFilter, int blendMode, int filterQuality) {
        o1 o1VarO = O(style);
        if (brush != null) {
            brush.a(b(), o1VarO, alpha);
        } else {
            if (o1VarO.getInternalShader() != null) {
                o1VarO.D(null);
            }
            long jB = o1VarO.b();
            C5489q0.Companion companion = C5489q0.INSTANCE;
            if (!C5489q0.s(jB, companion.a())) {
                o1VarO.x(companion.a());
            }
            if (o1VarO.a() != alpha) {
                o1VarO.d(alpha);
            }
        }
        if (!Intrinsics.e(o1VarO.getInternalColorFilter(), colorFilter)) {
            o1VarO.z(colorFilter);
        }
        if (!C5449c0.E(o1VarO.get_blendMode(), blendMode)) {
            o1VarO.s(blendMode);
        }
        if (!C5447b1.d(o1VarO.G(), filterQuality)) {
            o1VarO.u(filterQuality);
        }
        return o1VarO;
    }

    private final o1 s(long color, float strokeWidth, float miter, int cap, int join, r1 pathEffect, float alpha, C5490r0 colorFilter, int blendMode, int filterQuality) {
        o1 o1VarN = N();
        long J10 = J(color, alpha);
        if (!C5489q0.s(o1VarN.b(), J10)) {
            o1VarN.x(J10);
        }
        if (o1VarN.getInternalShader() != null) {
            o1VarN.D(null);
        }
        if (!Intrinsics.e(o1VarN.getInternalColorFilter(), colorFilter)) {
            o1VarN.z(colorFilter);
        }
        if (!C5449c0.E(o1VarN.get_blendMode(), blendMode)) {
            o1VarN.s(blendMode);
        }
        if (o1VarN.J() != strokeWidth) {
            o1VarN.I(strokeWidth);
        }
        if (o1VarN.B() != miter) {
            o1VarN.F(miter);
        }
        if (!F1.e(o1VarN.v(), cap)) {
            o1VarN.r(cap);
        }
        if (!G1.e(o1VarN.A(), join)) {
            o1VarN.w(join);
        }
        if (!Intrinsics.e(o1VarN.getPathEffect(), pathEffect)) {
            o1VarN.t(pathEffect);
        }
        if (!C5447b1.d(o1VarN.G(), filterQuality)) {
            o1VarN.u(filterQuality);
        }
        return o1VarN;
    }
}
