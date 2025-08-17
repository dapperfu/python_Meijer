package androidx.compose.ui.node;

import V0.AbstractC5324i0;
import V0.C5347r0;
import V0.InterfaceC5316f1;
import V0.q1;
import V0.r1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import j1.C14832a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJq\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJY\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JO\u0010&\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'Jw\u00100\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020(2\b\b\u0002\u0010-\u001a\u00020*2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020.H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101Jk\u00109\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jk\u0010;\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<JM\u0010?\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010@JM\u0010A\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bA\u0010BJq\u0010G\u001a\u00020\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0C2\u0006\u0010F\u001a\u00020E2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00106\u001a\u0002052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJY\u0010I\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bI\u0010JJY\u0010K\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJc\u0010O\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010N\u001a\u00020M2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJc\u0010Q\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010N\u001a\u00020M2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020T*\u00020SH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020T*\u00020WH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020S*\u00020WH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bZ\u0010[J\u001a\u0010\\\u001a\u00020S*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\\\u0010]J\u001a\u0010^\u001a\u00020S*\u00020TH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020`*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020\t*\u00020SH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010]J\u0017\u0010d\u001a\u00020\t*\u00020WH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bd\u0010[J\u0017\u0010e\u001a\u00020\u0010*\u00020`H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\be\u0010bJ\u0017\u0010f\u001a\u00020W*\u00020SH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bf\u0010gJ\u001a\u0010h\u001a\u00020W*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bh\u0010gJ\u001a\u0010i\u001a\u00020W*\u00020TH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0019H\u0016¢\u0006\u0004\bk\u0010lJ#\u0010r\u001a\u00020\u0019*\u00020m2\u0006\u0010o\u001a\u00020n2\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\br\u0010sJ<\u0010x\u001a\u00020\u00192\u0006\u0010o\u001a\u00020n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020v2\b\u0010q\u001a\u0004\u0018\u00010pH\u0000ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ<\u0010z\u001a\u00020\u00192\u0006\u0010o\u001a\u00020n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010u\u001a\u00020t2\u0006\u0010w\u001a\u00020m2\b\u0010q\u001a\u0004\u0018\u00010pH\u0000ø\u0001\u0000¢\u0006\u0004\bz\u0010{R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bx\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010w\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010!\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u0084\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0082\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0090\u0001"}, d2 = {"Landroidx/compose/ui/node/J;", "LX0/f;", "LX0/c;", "LX0/a;", "canvasDrawScope", "<init>", "(LX0/a;)V", "LV0/i0;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "LU0/f;", "topLeft", "LU0/k;", "size", "alpha", "LX0/g;", "style", "LV0/r0;", "colorFilter", "LV0/c0;", "blendMode", "", "C1", "(LV0/i0;FFZJJFLX0/g;LV0/r0;I)V", "LV0/q0;", "color", "s0", "(JFFZJJFLX0/g;LV0/r0;I)V", "radius", "center", "P1", "(JFJFLX0/g;LV0/r0;I)V", "LV0/f1;", "image", "q0", "(LV0/f1;JFLX0/g;LV0/r0;I)V", "LH1/n;", "srcOffset", "LH1/r;", "srcSize", "dstOffset", "dstSize", "LV0/b1;", "filterQuality", "U1", "(LV0/f1;JJJJFLX0/g;LV0/r0;II)V", "start", "end", "strokeWidth", "LV0/F1;", "cap", "LV0/r1;", "pathEffect", "B1", "(LV0/i0;JJFILV0/r1;FLV0/r0;I)V", "n1", "(JJJFILV0/r1;FLV0/r0;I)V", "LV0/q1;", "path", "d2", "(LV0/q1;LV0/i0;FLX0/g;LV0/r0;I)V", "z0", "(LV0/q1;JFLX0/g;LV0/r0;I)V", "", "points", "Landroidx/compose/ui/graphics/f;", "pointMode", "C0", "(Ljava/util/List;IJFILV0/r1;FLV0/r0;I)V", "W0", "(LV0/i0;JJFLX0/g;LV0/r0;I)V", "b2", "(JJJFLX0/g;LV0/r0;I)V", "LU0/a;", "cornerRadius", "c0", "(LV0/i0;JJJFLX0/g;LV0/r0;I)V", "H1", "(JJJJLX0/g;FLV0/r0;I)V", "LH1/h;", "", "E0", "(F)I", "LH1/v;", "N1", "(J)I", "t", "(J)F", "L", "(F)F", "K", "(I)F", "LH1/k;", "p", "(J)J", "I1", "N0", "T", "o", "(F)J", "x", "w", "(I)J", "a2", "()V", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "q", "(Landroidx/compose/ui/node/t;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$c;", "drawNode", "a", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$c;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "f", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "LX0/a;", "getCanvasDrawScope", "()LX0/a;", "b", "Landroidx/compose/ui/node/t;", "Q1", "()J", "getDensity", "()F", "density", "LX0/d;", "L1", "()LX0/d;", "drawContext", "F1", "fontScale", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J implements X0.f, X0.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X0.a canvasDrawScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5823t drawNode;

    public J(X0.a aVar) {
        this.canvasDrawScope = aVar;
    }

    @Override // H1.d
    public int E0(float f10) {
        return this.canvasDrawScope.E0(f10);
    }

    @Override // H1.l
    /* renamed from: F1 */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // H1.d
    public float I1(float f10) {
        return this.canvasDrawScope.I1(f10);
    }

    @Override // H1.d
    public float K(int i10) {
        return this.canvasDrawScope.K(i10);
    }

    @Override // H1.d
    public float L(float f10) {
        return this.canvasDrawScope.L(f10);
    }

    @Override // H1.d
    public float N0(long j10) {
        return this.canvasDrawScope.N0(j10);
    }

    @Override // H1.d
    public int N1(long j10) {
        return this.canvasDrawScope.N1(j10);
    }

    @Override // X0.f
    public long Q1() {
        return this.canvasDrawScope.Q1();
    }

    @Override // H1.d
    public long T(long j10) {
        return this.canvasDrawScope.T(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void a(Canvas canvas, long size, NodeCoordinator coordinator, Modifier.c drawNode, GraphicsLayer layer) {
        int iA = C5810f0.a(4);
        AbstractC5817m abstractC5817mH = drawNode;
        D0.c cVar = null;
        while (abstractC5817mH != 0) {
            if (abstractC5817mH instanceof InterfaceC5823t) {
                f(canvas, size, coordinator, abstractC5817mH, layer);
            } else if ((abstractC5817mH.getKindSet() & iA) != 0 && (abstractC5817mH instanceof AbstractC5817m)) {
                Modifier.c delegate = abstractC5817mH.getDelegate();
                int i10 = 0;
                abstractC5817mH = abstractC5817mH;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC5817mH = delegate;
                        } else {
                            if (cVar == null) {
                                cVar = new D0.c(new Modifier.c[16], 0);
                            }
                            if (abstractC5817mH != 0) {
                                cVar.c(abstractC5817mH);
                                abstractC5817mH = 0;
                            }
                            cVar.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    abstractC5817mH = abstractC5817mH;
                }
                if (i10 == 1) {
                }
            }
            abstractC5817mH = C5815k.h(cVar);
        }
    }

    @Override // X0.f
    public long b() {
        return this.canvasDrawScope.b();
    }

    @Override // H1.d
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // H1.l
    public long o(float f10) {
        return this.canvasDrawScope.o(f10);
    }

    @Override // H1.d
    public long p(long j10) {
        return this.canvasDrawScope.p(j10);
    }

    public final void q(InterfaceC5823t interfaceC5823t, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorJ = C5815k.j(interfaceC5823t, C5810f0.a(4));
        nodeCoordinatorJ.getLayoutNode().c0().f(canvas, H1.s.d(nodeCoordinatorJ.c()), nodeCoordinatorJ, interfaceC5823t, graphicsLayer);
    }

    @Override // H1.l
    public float t(long j10) {
        return this.canvasDrawScope.t(j10);
    }

    @Override // H1.d
    public long w(int i10) {
        return this.canvasDrawScope.w(i10);
    }

    @Override // H1.d
    public long x(float f10) {
        return this.canvasDrawScope.x(f10);
    }

    public /* synthetic */ J(X0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new X0.a() : aVar);
    }

    @Override // X0.f
    public void B1(AbstractC5324i0 brush, long start, long end, float strokeWidth, int cap, r1 pathEffect, float alpha, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.B1(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // X0.f
    public void C0(List<U0.f> points, int pointMode, long color, float strokeWidth, int cap, r1 pathEffect, float alpha, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.C0(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // X0.f
    public void C1(AbstractC5324i0 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.C1(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void H1(long color, long topLeft, long size, long cornerRadius, X0.g style, float alpha, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.H1(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // X0.f
    /* renamed from: L1 */
    public X0.d getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // X0.f
    public void P1(long color, float radius, long center, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.P1(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void U1(InterfaceC5316f1 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, X0.g style, C5347r0 colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.U1(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // X0.f
    public void W0(AbstractC5324i0 brush, long topLeft, long size, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.W0(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void b2(long color, long topLeft, long size, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.b2(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void c0(AbstractC5324i0 brush, long topLeft, long size, long cornerRadius, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.c0(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void d2(q1 path, AbstractC5324i0 brush, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.d2(path, brush, alpha, style, colorFilter, blendMode);
    }

    public final void f(Canvas canvas, long size, NodeCoordinator coordinator, InterfaceC5823t drawNode, GraphicsLayer layer) {
        InterfaceC5823t interfaceC5823t = this.drawNode;
        this.drawNode = drawNode;
        X0.a aVar = this.canvasDrawScope;
        H1.t layoutDirection = coordinator.getLayoutDirection();
        H1.d density = aVar.getDrawContext().getDensity();
        H1.t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
        Canvas canvasG = aVar.getDrawContext().g();
        long jB = aVar.getDrawContext().b();
        GraphicsLayer graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
        X0.d drawContext = aVar.getDrawContext();
        drawContext.a(coordinator);
        drawContext.d(layoutDirection);
        drawContext.j(canvas);
        drawContext.h(size);
        drawContext.f(layer);
        canvas.save();
        try {
            drawNode.I(this);
            canvas.i();
            X0.d drawContext2 = aVar.getDrawContext();
            drawContext2.a(density);
            drawContext2.d(layoutDirection2);
            drawContext2.j(canvasG);
            drawContext2.h(jB);
            drawContext2.f(graphicsLayer);
            this.drawNode = interfaceC5823t;
        } catch (Throwable th2) {
            canvas.i();
            X0.d drawContext3 = aVar.getDrawContext();
            drawContext3.a(density);
            drawContext3.d(layoutDirection2);
            drawContext3.j(canvasG);
            drawContext3.h(jB);
            drawContext3.f(graphicsLayer);
            throw th2;
        }
    }

    @Override // X0.f
    public H1.t getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // X0.f
    public void n1(long color, long start, long end, float strokeWidth, int cap, r1 pathEffect, float alpha, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.n1(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // X0.f
    public void q0(InterfaceC5316f1 image, long topLeft, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.q0(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void s0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.s0(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // X0.f
    public void z0(q1 path, long color, float alpha, X0.g style, C5347r0 colorFilter, int blendMode) {
        this.canvasDrawScope.z0(path, color, alpha, style, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // X0.c
    public void a2() {
        Canvas canvasG = getDrawContext().g();
        InterfaceC5823t interfaceC5823t = this.drawNode;
        if (interfaceC5823t != null) {
            AbstractC5817m abstractC5817mB = K.b(interfaceC5823t);
            if (abstractC5817mB != 0) {
                int iA = C5810f0.a(4);
                D0.c cVar = null;
                while (abstractC5817mB != 0) {
                    if (abstractC5817mB instanceof InterfaceC5823t) {
                        q((InterfaceC5823t) abstractC5817mB, canvasG, getDrawContext().getGraphicsLayer());
                    } else if ((abstractC5817mB.getKindSet() & iA) != 0 && (abstractC5817mB instanceof AbstractC5817m)) {
                        Modifier.c delegate = abstractC5817mB.getDelegate();
                        int i10 = 0;
                        abstractC5817mB = abstractC5817mB;
                        while (delegate != null) {
                            if ((delegate.getKindSet() & iA) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    abstractC5817mB = delegate;
                                } else {
                                    if (cVar == null) {
                                        cVar = new D0.c(new Modifier.c[16], 0);
                                    }
                                    if (abstractC5817mB != 0) {
                                        cVar.c(abstractC5817mB);
                                        abstractC5817mB = 0;
                                    }
                                    cVar.c(delegate);
                                }
                            }
                            delegate = delegate.getChild();
                            abstractC5817mB = abstractC5817mB;
                        }
                        if (i10 == 1) {
                        }
                    }
                    abstractC5817mB = C5815k.h(cVar);
                }
                return;
            }
            NodeCoordinator nodeCoordinatorJ = C5815k.j(interfaceC5823t, C5810f0.a(4));
            if (nodeCoordinatorJ.N2() == interfaceC5823t.getNode()) {
                nodeCoordinatorJ = nodeCoordinatorJ.getWrapped();
                Intrinsics.g(nodeCoordinatorJ);
            }
            nodeCoordinatorJ.n3(canvasG, getDrawContext().getGraphicsLayer());
            return;
        }
        C14832a.c("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new KotlinNothingValueException();
    }
}
