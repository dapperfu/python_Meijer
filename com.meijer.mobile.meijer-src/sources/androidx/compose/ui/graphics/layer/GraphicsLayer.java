package androidx.compose.ui.graphics.layer;

import H1.n;
import H1.r;
import H1.s;
import H1.t;
import U0.f;
import V0.AbstractC5480m1;
import V0.C5449c0;
import V0.C5489q0;
import V0.C5490r0;
import V0.P;
import V0.Q;
import V0.W;
import V0.o1;
import V0.q1;
import V0.y1;
import Y0.A;
import Y0.B;
import Y0.D;
import Y0.G;
import Y0.y;
import Y0.z;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import com.fullstory.instrumentation.frameworks.compose.FSComposeChildLayerDependenciesTracker;
import com.fullstory.instrumentation.frameworks.compose.FSComposeGraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 y2\u00020\u0001:\u0001DB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0010JA\u00102\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b0ø\u0001\u0000¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\f2\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0000¢\u0006\u0004\b9\u0010\u0010J\u000f\u0010:\u001a\u00020\fH\u0000¢\u0006\u0004\b:\u0010\u0010J\u0015\u0010;\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b;\u0010<J.\u0010A\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020=2\b\b\u0002\u0010\u000b\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020?ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ$\u0010C\u001a\u00020\f2\b\b\u0002\u0010\t\u001a\u00020=2\b\b\u0002\u0010\u000b\u001a\u00020>ø\u0001\u0000¢\u0006\u0004\bC\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR'\u0010M\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b08\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010LR%\u0010N\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0/¢\u0006\u0002\b08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010OR\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010RR\u001c\u0010U\u001a\u00020=8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010TR\u001c\u0010V\u001a\u00020>8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010TR\u0016\u0010X\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u000fR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010a\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0016\u0010c\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010RR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010*R\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010v\u001a\u00020Q2\u0006\u0010r\u001a\u00020Q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bs\u0010R\u001a\u0004\bt\u0010uR0\u0010\t\u001a\u00020\b2\u0006\u0010w\u001a\u00020\b8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bx\u0010T\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R0\u0010\u000b\u001a\u00020\n2\u0006\u0010w\u001a\u00020\n8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b}\u0010T\u001a\u0004\b~\u0010z\"\u0004\b\u007f\u0010|R3\u0010\u0082\u0001\u001a\u00020=2\u0006\u0010w\u001a\u00020=8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0005\b\u0080\u0001\u0010T\u001a\u0004\bi\u0010z\"\u0005\b\u0081\u0001\u0010|R5\u0010\u0087\u0001\u001a\u00020Q2\u0006\u0010w\u001a\u00020Q8F@FX\u0086\u000e¢\u0006\u001c\n\u0005\b\u0083\u0001\u0010R\u0012\u0005\b\u0086\u0001\u0010\u0010\u001a\u0004\b]\u0010u\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b~\u0010\u0088\u0001R0\u0010\u008e\u0001\u001a\u00030\u008a\u00012\u0007\u0010w\u001a\u00030\u008a\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bb\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R'\u0010\u0091\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\bW\u0010\u008f\u0001\"\u0005\bT\u0010\u0090\u0001R0\u0010\u0094\u0001\u001a\u00030\u0092\u00012\u0007\u0010w\u001a\u00030\u0092\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000f\u001a\u0005\bZ\u0010\u008b\u0001\"\u0006\b\u0093\u0001\u0010\u008d\u0001R.\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u0010w\u001a\u0005\u0018\u00010\u0095\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b`\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R(\u0010\u009b\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b}\u0010\u008f\u0001\"\u0006\b\u009a\u0001\u0010\u0090\u0001R)\u0010\u009d\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0080\u0001\u0010\u008f\u0001\"\u0006\b\u009c\u0001\u0010\u0090\u0001R)\u0010 \u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009e\u0001\u0010\u008f\u0001\"\u0006\b\u009f\u0001\u0010\u0090\u0001R)\u0010£\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010\u008f\u0001\"\u0006\b¢\u0001\u0010\u0090\u0001R(\u0010¤\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0083\u0001\u0010\u008f\u0001\"\u0005\bR\u0010\u0090\u0001R(\u0010¦\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bm\u0010\u008f\u0001\"\u0006\b¥\u0001\u0010\u0090\u0001R(\u0010¨\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u008f\u0001\"\u0006\b§\u0001\u0010\u0090\u0001R(\u0010ª\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u008f\u0001\"\u0006\b©\u0001\u0010\u0090\u0001R)\u0010\u00ad\u0001\u001a\u00020?2\u0006\u0010w\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0001\u0010\u008f\u0001\"\u0006\b¬\u0001\u0010\u0090\u0001R/\u0010³\u0001\u001a\u0005\u0018\u00010®\u00012\t\u0010w\u001a\u0005\u0018\u00010®\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R\u0013\u0010µ\u0001\u001a\u00020Y8F¢\u0006\u0007\u001a\u0005\be\u0010´\u0001R/\u0010¹\u0001\u001a\u00030¶\u00012\u0007\u0010w\u001a\u00030¶\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b·\u0001\u0010z\"\u0005\b¸\u0001\u0010|R/\u0010¼\u0001\u001a\u00030¶\u00012\u0007\u0010w\u001a\u00030¶\u00018F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\bº\u0001\u0010z\"\u0005\b»\u0001\u0010|\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006½\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "Landroidx/compose/ui/graphics/layer/b;", "impl", "Landroidx/compose/ui/graphics/layer/f;", "layerManager", "<init>", "(Landroidx/compose/ui/graphics/layer/b;Landroidx/compose/ui/graphics/layer/f;)V", "LH1/n;", "topLeft", "LH1/r;", "size", "", "Q", "(JJ)V", "F", "()V", "LX0/f;", "i", "(LX0/f;)V", "graphicsLayer", "d", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "androidCanvas", "f0", "(Landroid/graphics/Canvas;)V", "G", "D", "onRemovedFromParentLayer", "Landroid/graphics/RectF;", "C", "()Landroid/graphics/RectF;", "e", "LV0/q1;", "path", "Landroid/graphics/Outline;", "g0", "(LV0/q1;)Landroid/graphics/Outline;", "B", "()Landroid/graphics/Outline;", "f", "I", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "E", "(LH1/d;LH1/t;JLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "parentLayer", "h", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "H", "g", "O", "(LV0/q1;)V", "LU0/f;", "LU0/k;", "", "cornerRadius", "W", "(JJF)V", "R", "a", "Landroidx/compose/ui/graphics/layer/b;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/b;", "b", "LH1/d;", "c", "LH1/t;", "Lkotlin/jvm/functions/Function1;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "Z", "outlineDirty", "J", "roundRectOutlineTopLeft", "roundRectOutlineSize", "j", "roundRectCornerRadius", "LV0/m1;", "k", "LV0/m1;", "internalOutline", "l", "LV0/q1;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "LX0/a;", "o", "LX0/a;", "softwareDrawScope", "LV0/o1;", "p", "LV0/o1;", "softwareLayerPaint", "", "q", "parentLayerUsages", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "<set-?>", "r", "A", "()Z", "isReleased", "value", "s", "x", "()J", "c0", "(J)V", "t", "w", "a0", "u", "P", "pivotOffset", "v", "M", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Landroidx/compose/ui/graphics/layer/a;", "()I", "N", "(I)V", "compositingStrategy", "()F", "(F)V", "alpha", "LV0/c0;", "setBlendMode-s9anfk8", "blendMode", "LV0/r0;", "()LV0/r0;", "setColorFilter", "(LV0/r0;)V", "colorFilter", "X", "scaleX", "Y", "scaleY", "y", "d0", "translationX", "z", "e0", "translationY", "shadowElevation", "T", "rotationX", "U", "rotationY", "V", "rotationZ", "getCameraDistance", "L", "cameraDistance", "LV0/y1;", "getRenderEffect", "()LV0/y1;", "S", "(LV0/y1;)V", "renderEffect", "()LV0/m1;", "outline", "LV0/q0;", "getAmbientShadowColor-0d7_KjU", "K", "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "b0", "spotShadowColor", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GraphicsLayer implements FSComposeGraphicsLayer {

    /* renamed from: y, reason: collision with root package name */
    private static final y f51006y;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.layer.b impl;
    private final ChildLayerDependenciesTracker childDependenciesTracker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Outline androidOutline;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundRectCornerRadius;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private AbstractC5480m1 internalOutline;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private q1 outlinePath;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private q1 roundRectClipPath;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private X0.a softwareDrawScope;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private o1 softwareLayerPaint;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int parentLayerUsages;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long topLeft;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private RectF pathBounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private H1.d density = X0.e.a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.f13338a;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1<? super X0.f, Unit> drawBlock = c.f51031f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<X0.f, Unit> clipDrawBlock = new b();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean outlineDirty = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<X0.f, Unit> {
        b() {
            super(1);
        }

        public final void a(X0.f fVar) {
            q1 q1Var = GraphicsLayer.this.outlinePath;
            if (!GraphicsLayer.this.usePathForClip || !GraphicsLayer.this.getClip() || q1Var == null) {
                GraphicsLayer.this.i(fVar);
                return;
            }
            GraphicsLayer graphicsLayer = GraphicsLayer.this;
            int iB = androidx.compose.ui.graphics.b.INSTANCE.b();
            X0.d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().e(q1Var, iB);
                graphicsLayer.i(fVar);
            } finally {
                drawContext.g().i();
                drawContext.h(jB);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f51031f = new c();

        c() {
            super(1);
        }

        public final void a(X0.f fVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    private final void I() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = U0.k.INSTANCE.a();
        this.roundRectOutlineTopLeft = U0.f.INSTANCE.c();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    public final void R(long topLeft, long size) {
        W(topLeft, size, 0.0f);
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeGraphicsLayer
    public final FSComposeChildLayerDependenciesTracker _fsGetChildDependenciesTracker() {
        ChildLayerDependenciesTracker childLayerDependenciesTracker = this.childDependenciesTracker;
        if (childLayerDependenciesTracker instanceof FSComposeChildLayerDependenciesTracker) {
            return childLayerDependenciesTracker;
        }
        return null;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeGraphicsLayer
    public final void _fsOnRemovedFromParentLayer() {
        onRemovedFromParentLayer();
    }

    static {
        f51006y = f.INSTANCE.a() ? z.f42773a : Build.VERSION.SDK_INT >= 28 ? B.f42769a : G.f42772a.a() ? A.f42768a : z.f42773a;
    }

    private final Outline B() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF C() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void D() {
        this.parentLayerUsages++;
    }

    private final void F() {
        this.impl.x(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void G() {
        if (this.impl.p()) {
            return;
        }
        try {
            F();
        } catch (Throwable unused) {
        }
    }

    private final void Q(long topLeft, long size) {
        this.impl.t(n.k(topLeft), n.l(topLeft), size);
    }

    private final void a0(long j10) {
        if (r.e(this.size, j10)) {
            return;
        }
        this.size = j10;
        Q(this.topLeft, j10);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            e();
        }
    }

    private final void d(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.i(graphicsLayer)) {
            graphicsLayer.D();
        }
    }

    private final void e() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || v() > 0.0f) {
                q1 q1Var = this.outlinePath;
                if (q1Var != null) {
                    RectF rectFC = C();
                    if (!(q1Var instanceof Q)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((Q) q1Var).getInternalPath().computeBounds(rectFC, false);
                    Outline outlineG0 = g0(q1Var);
                    if (outlineG0 != null) {
                        outlineG0.setAlpha(j());
                        outline = outlineG0;
                    }
                    this.impl.I(outline, r.c((4294967295L & Math.round(rectFC.height())) | (Math.round(rectFC.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.D(false);
                        this.impl.o();
                    } else {
                        this.impl.D(this.clip);
                    }
                } else {
                    this.impl.D(this.clip);
                    U0.k.INSTANCE.b();
                    Outline outlineB = B();
                    long jD = s.d(this.size);
                    long j10 = this.roundRectOutlineTopLeft;
                    long j11 = this.roundRectOutlineSize;
                    long j12 = j11 == 9205357640488583168L ? jD : j11;
                    int i10 = (int) (j10 >> 32);
                    int i11 = (int) (j10 & 4294967295L);
                    outlineB.setRoundRect(Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11)), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j12 >> 32))), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 & 4294967295L))), this.roundRectCornerRadius);
                    outlineB.setAlpha(j());
                    this.impl.I(outlineB, s.c(j12));
                }
            } else {
                this.impl.D(false);
                this.impl.I(null, r.INSTANCE.a());
            }
        }
        this.outlineDirty = false;
    }

    private final void f() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            g();
        }
    }

    private final void f0(Canvas androidCanvas) {
        Canvas canvas;
        float fK = n.k(this.topLeft);
        float fL = n.l(this.topLeft);
        float fK2 = n.k(this.topLeft) + ((int) (this.size >> 32));
        float fL2 = n.l(this.topLeft) + ((int) (this.size & 4294967295L));
        float fJ = j();
        C5490r0 c5490r0M = m();
        int iK = k();
        if (fJ < 1.0f || !C5449c0.E(iK, C5449c0.INSTANCE.B()) || c5490r0M != null || a.e(n(), a.INSTANCE.c())) {
            o1 o1VarA = this.softwareLayerPaint;
            if (o1VarA == null) {
                o1VarA = P.a();
                this.softwareLayerPaint = o1VarA;
            }
            o1VarA.d(fJ);
            o1VarA.s(iK);
            o1VarA.z(c5490r0M);
            canvas = androidCanvas;
            canvas.saveLayer(fK, fL, fK2, fL2, o1VarA.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fK, fL);
        canvas.concat(this.impl.A());
    }

    private final Outline g0(q1 path) {
        Outline outline;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || path.a()) {
            Outline outlineB = B();
            if (i10 >= 30) {
                D.f42770a.a(outlineB, path);
            } else {
                if (!(path instanceof Q)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineB.setConvexPath(((Q) path).getInternalPath());
            }
            this.usePathForClip = !outlineB.canClip();
            outline = outlineB;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.F(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(X0.f r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.b(r0)
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.g(r0, r1)
            Z.X r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.a(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.e()
            if (r2 == 0) goto L28
            Z.X r2 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.c(r0)
            if (r2 != 0) goto L22
            Z.X r2 = Z.k0.a()
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.f(r0, r2)
        L22:
            r2.i(r1)
            r1.m()
        L28:
            r1 = 1
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.h(r0, r1)
            kotlin.jvm.functions.Function1<? super X0.f, kotlin.Unit> r1 = r14.drawBlock
            r1.invoke(r15)
            r15 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.h(r0, r15)
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.d(r0)
            if (r1 == 0) goto L3e
            r1.onRemovedFromParentLayer()
        L3e:
            Z.X r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.c(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.e()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.GraphicsLayer r10 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r10
            r10.onRemovedFromParentLayer()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.m()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.i(X0.f):void");
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        f();
    }

    /* renamed from: A, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    public final void H() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        f();
    }

    public final void J(float f10) {
        if (this.impl.getAlpha() == f10) {
            return;
        }
        this.impl.d(f10);
    }

    public final void K(long j10) {
        if (C5489q0.s(j10, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.z(j10);
    }

    public final void L(float f10) {
        if (this.impl.getCameraDistance() == f10) {
            return;
        }
        this.impl.i(f10);
    }

    public final void M(boolean z10) {
        if (this.clip != z10) {
            this.clip = z10;
            this.outlineDirty = true;
            e();
        }
    }

    public final void N(int i10) {
        if (a.e(this.impl.getCompositingStrategy(), i10)) {
            return;
        }
        this.impl.K(i10);
    }

    public final void P(long j10) {
        if (U0.f.j(this.pivotOffset, j10)) {
            return;
        }
        this.pivotOffset = j10;
        this.impl.J(j10);
    }

    public final void S(y1 y1Var) {
        this.impl.r();
        if (Intrinsics.e(null, y1Var)) {
            return;
        }
        this.impl.g(y1Var);
    }

    public final void T(float f10) {
        if (this.impl.getRotationX() == f10) {
            return;
        }
        this.impl.j(f10);
    }

    public final void U(float f10) {
        if (this.impl.getRotationY() == f10) {
            return;
        }
        this.impl.k(f10);
    }

    public final void V(float f10) {
        if (this.impl.getRotationZ() == f10) {
            return;
        }
        this.impl.l(f10);
    }

    public final void W(long topLeft, long size, float cornerRadius) {
        if (U0.f.j(this.roundRectOutlineTopLeft, topLeft) && U0.k.f(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        I();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        e();
    }

    public final void X(float f10) {
        if (this.impl.getScaleX() == f10) {
            return;
        }
        this.impl.h(f10);
    }

    public final void Y(float f10) {
        if (this.impl.getScaleY() == f10) {
            return;
        }
        this.impl.m(f10);
    }

    public final void Z(float f10) {
        if (this.impl.getShadowElevation() == f10) {
            return;
        }
        this.impl.H(f10);
        this.outlineDirty = true;
        e();
    }

    public final void b0(long j10) {
        if (C5489q0.s(j10, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.E(j10);
    }

    public final void c0(long j10) {
        if (n.j(this.topLeft, j10)) {
            return;
        }
        this.topLeft = j10;
        Q(j10, this.size);
    }

    public final void d0(float f10) {
        if (this.impl.getTranslationX() == f10) {
            return;
        }
        this.impl.n(f10);
    }

    public final void e0(float f10) {
        if (this.impl.getTranslationY() == f10) {
            return;
        }
        this.impl.e(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.b(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.e(r0, r1)
        Lf:
            Z.X r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.a(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.m()
        L5d:
            androidx.compose.ui.graphics.layer.b r0 = r15.impl
            r0.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.g():void");
    }

    public final void h(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        boolean z10;
        boolean z11;
        if (this.isReleased) {
            return;
        }
        e();
        G();
        boolean z12 = v() > 0.0f;
        if (z12) {
            canvas.l();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            f0(nativeCanvas);
        }
        boolean z13 = !zIsHardwareAccelerated && this.clip;
        if (z13) {
            canvas.save();
            AbstractC5480m1 abstractC5480m1O = o();
            if (abstractC5480m1O instanceof AbstractC5480m1.b) {
                androidx.compose.ui.graphics.Canvas.r(canvas, abstractC5480m1O.getRect(), 0, 2, null);
            } else if (abstractC5480m1O instanceof AbstractC5480m1.c) {
                q1 q1VarA = this.roundRectClipPath;
                if (q1VarA != null) {
                    q1VarA.v();
                } else {
                    q1VarA = W.a();
                    this.roundRectClipPath = q1VarA;
                }
                q1.p(q1VarA, ((AbstractC5480m1.c) abstractC5480m1O).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.j(canvas, q1VarA, 0, 2, null);
            } else if (abstractC5480m1O instanceof AbstractC5480m1.a) {
                androidx.compose.ui.graphics.Canvas.j(canvas, ((AbstractC5480m1.a) abstractC5480m1O).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.d(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z10 = z12;
            z11 = z13;
            this.impl.M(canvas);
        } else {
            X0.a aVar = this.softwareDrawScope;
            if (aVar == null) {
                aVar = new X0.a();
                this.softwareDrawScope = aVar;
            }
            X0.a aVar2 = aVar;
            H1.d dVar = this.density;
            t tVar = this.layoutDirection;
            long jD = s.d(this.size);
            H1.d density = aVar2.getDrawContext().getDensity();
            t layoutDirection = aVar2.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvasG = aVar2.getDrawContext().g();
            long jB = aVar2.getDrawContext().b();
            z10 = z12;
            GraphicsLayer graphicsLayer = aVar2.getDrawContext().getGraphicsLayer();
            z11 = z13;
            X0.d drawContext = aVar2.getDrawContext();
            drawContext.a(dVar);
            drawContext.d(tVar);
            drawContext.j(canvas);
            drawContext.h(jD);
            drawContext.f(this);
            canvas.save();
            try {
                i(aVar2);
            } finally {
                canvas.i();
                X0.d drawContext2 = aVar2.getDrawContext();
                drawContext2.a(density);
                drawContext2.d(layoutDirection);
                drawContext2.j(canvasG);
                drawContext2.h(jB);
                drawContext2.f(graphicsLayer);
            }
        }
        if (z11) {
            canvas.i();
        }
        if (z10) {
            canvas.t();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final float j() {
        return this.impl.getAlpha();
    }

    public final int k() {
        return this.impl.getBlendMode();
    }

    /* renamed from: l, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final C5490r0 m() {
        return this.impl.getColorFilter();
    }

    public final int n() {
        return this.impl.getCompositingStrategy();
    }

    public final AbstractC5480m1 o() {
        AbstractC5480m1 bVar;
        AbstractC5480m1 abstractC5480m1 = this.internalOutline;
        q1 q1Var = this.outlinePath;
        if (abstractC5480m1 != null) {
            return abstractC5480m1;
        }
        if (q1Var != null) {
            AbstractC5480m1.a aVar = new AbstractC5480m1.a(q1Var);
            this.internalOutline = aVar;
            return aVar;
        }
        long jD = s.d(this.size);
        long j10 = this.roundRectOutlineTopLeft;
        long j11 = this.roundRectOutlineSize;
        if (j11 != 9205357640488583168L) {
            jD = j11;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jD & 4294967295L));
        if (this.roundRectCornerRadius > 0.0f) {
            bVar = new AbstractC5480m1.c(U0.j.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, U0.a.b((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            bVar = new AbstractC5480m1.b(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = bVar;
        return bVar;
    }

    /* renamed from: p, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final float q() {
        return this.impl.getRotationX();
    }

    public final float r() {
        return this.impl.getRotationY();
    }

    public final float s() {
        return this.impl.getRotationZ();
    }

    public final float t() {
        return this.impl.getScaleX();
    }

    public final float u() {
        return this.impl.getScaleY();
    }

    public final float v() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: w, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: x, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float y() {
        return this.impl.getTranslationX();
    }

    public final float z() {
        return this.impl.getTranslationY();
    }

    public GraphicsLayer(androidx.compose.ui.graphics.layer.b bVar, f fVar) {
        this.impl = bVar;
        f.Companion companion = U0.f.INSTANCE;
        this.roundRectOutlineTopLeft = companion.c();
        this.roundRectOutlineSize = U0.k.INSTANCE.a();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        bVar.D(false);
        this.topLeft = n.INSTANCE.b();
        this.size = r.INSTANCE.a();
        this.pivotOffset = companion.b();
    }

    public final void E(H1.d density, t layoutDirection, long size, Function1<? super X0.f, Unit> block) {
        a0(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.F(true);
        F();
    }

    public final void O(q1 path) {
        I();
        this.outlinePath = path;
        e();
    }
}
