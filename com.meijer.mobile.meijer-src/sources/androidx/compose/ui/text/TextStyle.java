package androidx.compose.ui.text;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import V0.AbstractC5467i0;
import V0.C5489q0;
import V0.Shadow;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.Deprecated;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import u1.C17335B;
import u1.PlatformTextStyle;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b'\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001QB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0087\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b\b\u00102B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010)\u001a\u00020\r\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b\b\u00107J\u000f\u00108\u001a\u00020\u0002H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u00002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b=\u0010>J \u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u000105H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010BJ\u009e\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010)\u001a\u00020\r2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00106\u001a\u0004\u0018\u000105ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020E2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020E2\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020E2\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010IJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020KH\u0000¢\u0006\u0004\bN\u0010MJ\u000f\u0010O\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\bU\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0013\u0010]\u001a\u0004\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bd\u0010_R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bm\u0010PR\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bn\u0010_R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0017\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bu\u0010_R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u00104\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0017\u0010&\u001a\u00020%8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b|\u0010MR\u0017\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b}\u0010MR\u0017\u0010)\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b~\u0010_R\u0014\u0010+\u001a\u0004\u0018\u00010*8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010MR\u0018\u0010/\u001a\u00020.8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010MR\u0015\u00106\u001a\u0004\u0018\u0001058F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/text/z;", "", "Landroidx/compose/ui/text/s;", "spanStyle", "Landroidx/compose/ui/text/n;", "paragraphStyle", "Lu1/m;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/n;Lu1/m;)V", "(Landroidx/compose/ui/text/s;Landroidx/compose/ui/text/n;)V", "LV0/q0;", "color", "LH1/v;", "fontSize", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "Ly1/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LF1/a;", "baselineShift", "LF1/o;", "textGeometricTransform", "LB1/e;", "localeList", "background", "LF1/k;", "textDecoration", "LV0/B1;", "shadow", "LF1/j;", "textAlign", "LF1/l;", "textDirection", "lineHeight", "LF1/q;", "textIndent", "LF1/h;", "lineHeightStyle", "LF1/f;", "lineBreak", "LF1/e;", "hyphens", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;LF1/j;LF1/l;JLF1/q;Lu1/m;LF1/h;LF1/f;LF1/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LX0/g;", "drawStyle", "LF1/s;", "textMotion", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;LX0/g;IIJLF1/q;Lu1/m;LF1/h;IILF1/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "N", "()Landroidx/compose/ui/text/s;", "M", "()Landroidx/compose/ui/text/n;", "other", "J", "(Landroidx/compose/ui/text/z;)Landroidx/compose/ui/text/z;", "K", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;LX0/g;IIJLF1/q;LF1/h;IILu1/m;LF1/s;)Landroidx/compose/ui/text/z;", "I", "(Landroidx/compose/ui/text/n;)Landroidx/compose/ui/text/z;", "b", "(JJLy1/B;Ly1/w;Ly1/x;Ly1/l;Ljava/lang/String;JLF1/a;LF1/o;LB1/e;JLF1/k;LV0/B1;LX0/g;IIJLF1/q;Lu1/m;LF1/h;IILF1/s;)Landroidx/compose/ui/text/z;", "", "equals", "(Ljava/lang/Object;)Z", "G", "(Landroidx/compose/ui/text/z;)Z", "F", "", "hashCode", "()I", "H", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/s;", "y", "Landroidx/compose/ui/text/n;", "v", "c", "Lu1/m;", "w", "()Lu1/m;", "LV0/i0;", "g", "()LV0/i0;", "brush", "h", "()J", "", "d", "()F", "alpha", "l", "o", "()Ly1/B;", "m", "()Ly1/w;", "n", "()Ly1/x;", "j", "()Ly1/l;", "k", "q", "f", "()LF1/a;", "C", "()LF1/o;", "u", "()LB1/e;", "e", "A", "()LF1/k;", "x", "()LV0/B1;", "i", "()LX0/g;", "z", "B", "s", "D", "()LF1/q;", "t", "()LF1/h;", "p", "r", "E", "()LF1/s;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.z, reason: from toString */
/* loaded from: classes.dex */
public final class TextStyle {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    private static final TextStyle f52910e = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle spanStyle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ParagraphStyle paragraphStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformTextStyle platformStyle;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/z$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/z;", "Default", "Landroidx/compose/ui/text/z;", "a", "()Landroidx/compose/ui/text/z;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextStyle a() {
            return TextStyle.f52910e;
        }
    }

    @Deprecated
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, F1.j jVar, F1.l lVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, F1.f fVar, F1.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, b12, jVar, lVar, j14, textIndent, platformTextStyle, lineHeightStyle, fVar, eVar);
    }

    public static /* synthetic */ TextStyle c(TextStyle textStyle, long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, X0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, int i14, Object obj) {
        F1.s sVarK;
        int i15;
        long jG = (i14 & 1) != 0 ? textStyle.spanStyle.g() : j10;
        long jK = (i14 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j11;
        FontWeight fontWeightN = (i14 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        C18280w c18280wL = (i14 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : c18280w;
        C18281x c18281xM = (i14 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : c18281x;
        AbstractC18269l abstractC18269lI = (i14 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : abstractC18269l;
        String strJ = (i14 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jO = (i14 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j12;
        F1.a aVarE = (i14 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : aVar;
        TextGeometricTransform textGeometricTransformU = (i14 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeListP = (i14 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j15 = jG;
        long jD = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? textStyle.spanStyle.getBackground() : j13;
        F1.k kVarS = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? textStyle.spanStyle.getTextDecoration() : kVar;
        Shadow b1R = (i14 & 8192) != 0 ? textStyle.spanStyle.getShadow() : b12;
        F1.k kVar2 = kVarS;
        X0.g gVarH = (i14 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : gVar;
        int iH = (i14 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i10;
        int i16 = (i14 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i11;
        long jE = (i14 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j14;
        TextIndent textIndentJ = (i14 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyleF = (i14 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iD = (i14 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : i12;
        int iC = (i14 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i13;
        if ((i14 & 8388608) != 0) {
            i15 = iC;
            sVarK = textStyle.paragraphStyle.getTextMotion();
        } else {
            sVarK = sVar;
            i15 = iC;
        }
        return textStyle.b(j15, jK, fontWeightN, c18280wL, c18281xM, abstractC18269lI, strJ, jO, aVarE, textGeometricTransformU, localeListP, jD, kVar2, b1R, gVarH, iH, i16, jE, textIndentJ, platformTextStyle2, lineHeightStyleF, iD, i15, sVarK);
    }

    public final TextStyle K(long color, long fontSize, FontWeight fontWeight, C18280w fontStyle, C18281x fontSynthesis, AbstractC18269l fontFamily, String fontFeatureSettings, long letterSpacing, F1.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, F1.k textDecoration, Shadow shadow, X0.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, F1.s textMotion) {
        SpanStyle sVarB = u1.n.b(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle nVarA = o.a(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == sVarB && this.paragraphStyle == nVarA) ? this : new TextStyle(sVarB, nVarA);
    }

    public final TextStyle b(long color, long fontSize, FontWeight fontWeight, C18280w fontStyle, C18281x fontSynthesis, AbstractC18269l fontFamily, String fontFeatureSettings, long letterSpacing, F1.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, F1.k textDecoration, Shadow shadow, X0.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, F1.s textMotion) {
        return new TextStyle(new SpanStyle(C5489q0.s(color, this.spanStyle.g()) ? this.spanStyle.getTextForegroundStyle() : F1.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.e(this.spanStyle, textStyle.spanStyle) && Intrinsics.e(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.e(this.platformStyle, textStyle.platformStyle);
    }

    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, X0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, b12, gVar, i10, i11, j14, textIndent, platformTextStyle, lineHeightStyle, i12, i13, sVar);
    }

    public final F1.k A() {
        return this.spanStyle.getTextDecoration();
    }

    public final int B() {
        return this.paragraphStyle.getTextDirection();
    }

    public final TextGeometricTransform C() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent D() {
        return this.paragraphStyle.getTextIndent();
    }

    public final F1.s E() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean F(TextStyle other) {
        return this == other || this.spanStyle.w(other.spanStyle);
    }

    public final boolean G(TextStyle other) {
        if (this != other) {
            return Intrinsics.e(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.v(other.spanStyle);
        }
        return true;
    }

    public final int H() {
        int iX = ((this.spanStyle.x() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iX + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle I(ParagraphStyle other) {
        return new TextStyle(getSpanStyle(), getParagraphStyle().l(other));
    }

    public final TextStyle J(TextStyle other) {
        return (other == null || Intrinsics.e(other, f52910e)) ? this : new TextStyle(getSpanStyle().y(other.getSpanStyle()), getParagraphStyle().l(other.getParagraphStyle()));
    }

    /* renamed from: M, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    /* renamed from: N, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public final float d() {
        return this.spanStyle.c();
    }

    public final long e() {
        return this.spanStyle.getBackground();
    }

    public final F1.a f() {
        return this.spanStyle.getBaselineShift();
    }

    public final AbstractC5467i0 g() {
        return this.spanStyle.f();
    }

    public final long h() {
        return this.spanStyle.g();
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final X0.g i() {
        return this.spanStyle.getDrawStyle();
    }

    public final AbstractC18269l j() {
        return this.spanStyle.getFontFamily();
    }

    public final String k() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long l() {
        return this.spanStyle.getFontSize();
    }

    public final C18280w m() {
        return this.spanStyle.getFontStyle();
    }

    public final C18281x n() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontWeight o() {
        return this.spanStyle.getFontWeight();
    }

    public final int p() {
        return this.paragraphStyle.getHyphens();
    }

    public final long q() {
        return this.spanStyle.getLetterSpacing();
    }

    public final int r() {
        return this.paragraphStyle.getLineBreak();
    }

    public final long s() {
        return this.paragraphStyle.getLineHeight();
    }

    public final LineHeightStyle t() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) C5489q0.z(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) H1.v.j(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) H1.v.j(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) C5489q0.z(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((Object) F1.j.m(z())) + ", textDirection=" + ((Object) F1.l.l(B())) + ", lineHeight=" + ((Object) H1.v.j(s())) + ", textIndent=" + D() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + t() + ", lineBreak=" + ((Object) F1.f.k(r())) + ", hyphens=" + ((Object) F1.e.i(p())) + ", textMotion=" + E() + ')';
    }

    public final LocaleList u() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle v() {
        return this.paragraphStyle;
    }

    /* renamed from: w, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow x() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle y() {
        return this.spanStyle;
    }

    public final int z() {
        return this.paragraphStyle.getTextAlign();
    }

    public TextStyle(SpanStyle sVar, ParagraphStyle nVar, PlatformTextStyle platformTextStyle) {
        this.spanStyle = sVar;
        this.paragraphStyle = nVar;
        this.platformStyle = platformTextStyle;
    }

    public TextStyle(SpanStyle sVar, ParagraphStyle nVar) {
        this(sVar, nVar, C17335B.b(sVar.getPlatformStyle(), nVar.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, F1.j jVar, F1.l lVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, F1.f fVar, F1.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        long j15 = (i10 & 1) != 0 ? C5489q0.INSTANCE.j() : j10;
        long jA = (i10 & 2) != 0 ? H1.v.INSTANCE.a() : j11;
        FontWeight fontWeight2 = (i10 & 4) != 0 ? null : fontWeight;
        C18280w c18280w2 = (i10 & 8) != 0 ? null : c18280w;
        C18281x c18281x2 = (i10 & 16) != 0 ? null : c18281x;
        AbstractC18269l abstractC18269l2 = (i10 & 32) != 0 ? null : abstractC18269l;
        String str2 = (i10 & 64) != 0 ? null : str;
        long jA2 = (i10 & 128) != 0 ? H1.v.INSTANCE.a() : j12;
        F1.a aVar2 = (i10 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i10 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i10 & 1024) != 0 ? null : localeList;
        long j16 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? C5489q0.INSTANCE.j() : j13;
        F1.k kVar2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar;
        long j17 = j15;
        Shadow b13 = (i10 & 8192) != 0 ? null : b12;
        F1.j jVar2 = (i10 & 16384) != 0 ? null : jVar;
        F1.l lVar2 = (i10 & 32768) != 0 ? null : lVar;
        long jA3 = (i10 & 65536) != 0 ? H1.v.INSTANCE.a() : j14;
        TextIndent textIndent2 = (i10 & 131072) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i10 & 262144) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i10 & 524288) != 0 ? null : lineHeightStyle;
        F1.f fVar2 = (i10 & 1048576) != 0 ? null : fVar;
        long j18 = jA;
        FontWeight fontWeight3 = fontWeight2;
        F1.k kVar3 = kVar2;
        C18280w c18280w3 = c18280w2;
        C18281x c18281x3 = c18281x2;
        AbstractC18269l abstractC18269l3 = abstractC18269l2;
        String str3 = str2;
        long j19 = jA2;
        F1.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j20 = j16;
        this(j17, j18, fontWeight3, c18280w3, c18281x3, abstractC18269l3, str3, j19, aVar3, textGeometricTransform3, localeList3, j20, kVar3, b13, jVar2, lVar2, jA3, textIndent2, platformTextStyle2, lineHeightStyle2, fVar2, (i10 & 2097152) != 0 ? null : eVar, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, F1.j jVar, F1.l lVar, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, F1.f fVar, F1.e eVar) {
        SpanStyle sVar = new SpanStyle(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, b12, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, null, 32768, null);
        int value = jVar != null ? jVar.getValue() : F1.j.INSTANCE.g();
        int value2 = lVar != null ? lVar.getValue() : F1.l.INSTANCE.f();
        PlatformParagraphStyle paragraphSyle = platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null;
        this(sVar, new ParagraphStyle(value, value2, j14, textIndent, paragraphSyle, lineHeightStyle, fVar != null ? fVar.getMask() : F1.f.INSTANCE.b(), eVar != null ? eVar.getValue() : F1.e.INSTANCE.c(), null, 256, null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, X0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        long j15 = (i14 & 1) != 0 ? C5489q0.INSTANCE.j() : j10;
        long jA = (i14 & 2) != 0 ? H1.v.INSTANCE.a() : j11;
        FontWeight fontWeight2 = (i14 & 4) != 0 ? null : fontWeight;
        C18280w c18280w2 = (i14 & 8) != 0 ? null : c18280w;
        C18281x c18281x2 = (i14 & 16) != 0 ? null : c18281x;
        AbstractC18269l abstractC18269l2 = (i14 & 32) != 0 ? null : abstractC18269l;
        String str2 = (i14 & 64) != 0 ? null : str;
        long jA2 = (i14 & 128) != 0 ? H1.v.INSTANCE.a() : j12;
        F1.a aVar2 = (i14 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i14 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i14 & 1024) != 0 ? null : localeList;
        long j16 = (i14 & RecyclerView.m.FLAG_MOVED) != 0 ? C5489q0.INSTANCE.j() : j13;
        F1.k kVar2 = (i14 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : kVar;
        long j17 = j15;
        Shadow b13 = (i14 & 8192) != 0 ? null : b12;
        X0.g gVar2 = (i14 & 16384) != 0 ? null : gVar;
        int iG = (i14 & 32768) != 0 ? F1.j.INSTANCE.g() : i10;
        int iF = (i14 & 65536) != 0 ? F1.l.INSTANCE.f() : i11;
        long jA3 = (i14 & 131072) != 0 ? H1.v.INSTANCE.a() : j14;
        TextIndent textIndent2 = (i14 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i14 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i14 & 1048576) != 0 ? null : lineHeightStyle;
        int iB = (i14 & 2097152) != 0 ? F1.f.INSTANCE.b() : i12;
        int iC = (i14 & 4194304) != 0 ? F1.e.INSTANCE.c() : i13;
        long j18 = jA;
        FontWeight fontWeight3 = fontWeight2;
        F1.k kVar3 = kVar2;
        C18280w c18280w3 = c18280w2;
        C18281x c18281x3 = c18281x2;
        AbstractC18269l abstractC18269l3 = abstractC18269l2;
        String str3 = str2;
        long j19 = jA2;
        F1.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j20 = j16;
        this(j17, j18, fontWeight3, c18280w3, c18281x3, abstractC18269l3, str3, j19, aVar3, textGeometricTransform3, localeList3, j20, kVar3, b13, gVar2, iG, iF, jA3, textIndent2, platformTextStyle2, lineHeightStyle2, iB, iC, (i14 & 8388608) != 0 ? null : sVar, null);
    }

    private TextStyle(long j10, long j11, FontWeight fontWeight, C18280w c18280w, C18281x c18281x, AbstractC18269l abstractC18269l, String str, long j12, F1.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j13, F1.k kVar, Shadow b12, X0.g gVar, int i10, int i11, long j14, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i12, int i13, F1.s sVar) {
        this(new SpanStyle(j10, j11, fontWeight, c18280w, c18281x, abstractC18269l, str, j12, aVar, textGeometricTransform, localeList, j13, kVar, b12, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, gVar, (DefaultConstructorMarker) null), new ParagraphStyle(i10, i11, j14, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i12, i13, sVar, null), platformTextStyle);
    }
}
