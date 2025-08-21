package androidx.compose.ui.text;

import V0.AbstractC5467i0;
import V0.Shadow;
import V0.W;
import V0.q1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.C17334A;
import u1.C17340e;
import u1.InterfaceC17341f;
import u1.ParagraphIntrinsicInfo;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJP\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JX\u0010%\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/ø\u0001\u0000¢\u0006\u0004\b1\u00102J(\u0010:\u001a\u0002092\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b<\u0010=J*\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u0002092\u0006\u0010@\u001a\u00020?2\b\b\u0001\u0010A\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020H2\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bK\u0010JJ\u001b\u0010L\u001a\u0002092\u0006\u0010\f\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010N\u001a\u0002032\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bN\u0010=J\u0015\u0010O\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bS\u0010RJ\u0015\u0010T\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\u0015\u0010U\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bU\u0010RJ\u0015\u0010V\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bV\u0010RJ\u0015\u0010W\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\bW\u0010PJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010X\u001a\u00020D¢\u0006\u0004\bY\u0010ZR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010[\u001a\u0004\b\\\u0010]R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0017\u0010e\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bK\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010h\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\bf\u0010gR\u0017\u0010j\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bN\u0010\u001f\u001a\u0004\bi\u0010gR\u0017\u0010l\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bk\u0010aR\u001f\u0010r\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR \u0010u\u001a\b\u0012\u0004\u0012\u00020s0m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010o\u001a\u0004\bt\u0010qR\u0014\u0010x\u001a\u00020v8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010wR\u0011\u0010y\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bn\u0010gR\u0011\u0010{\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bz\u0010g\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, d2 = {"Landroidx/compose/ui/text/g;", "", "Landroidx/compose/ui/text/h;", "intrinsics", "LH1/b;", "constraints", "", "maxLines", "LF1/t;", "overflow", "<init>", "(Landroidx/compose/ui/text/h;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "offset", "", "J", "(I)V", "K", "lineIndex", "L", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "LV0/q0;", "color", "LV0/B1;", "shadow", "LF1/k;", "decoration", "LX0/g;", "drawStyle", "LV0/c0;", "blendMode", "F", "(Landroidx/compose/ui/graphics/Canvas;JLV0/B1;LF1/k;LX0/g;I)V", "LV0/i0;", "brush", "", "alpha", "H", "(Landroidx/compose/ui/graphics/Canvas;LV0/i0;FLV0/B1;LF1/k;LX0/g;I)V", "start", "end", "LV0/q1;", "A", "(II)LV0/q1;", "vertical", "q", "(F)I", "LU0/f;", "position", "x", "(J)I", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lu1/p;", "granularity", "Lu1/t;", "inclusionStrategy", "Landroidx/compose/ui/text/y;", "C", "(Landroidx/compose/ui/geometry/Rect;ILu1/t;)J", "d", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "a", "(J[FI)[F", "", "usePrimaryDirection", "i", "(IZ)F", "LF1/i;", "y", "(I)LF1/i;", "c", "E", "(I)J", "e", "p", "(I)I", "s", "(I)F", "t", "v", "l", "r", "u", "visibleEnd", "n", "(IZ)I", "Landroidx/compose/ui/text/h;", "j", "()Landroidx/compose/ui/text/h;", "b", "I", "w", "()I", "Z", "f", "()Z", "didExceedMaxLines", "D", "()F", "width", "h", "height", "m", "lineCount", "", "g", "Ljava/util/List;", "B", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/k;", "z", "paragraphInfoList", "Landroidx/compose/ui/text/AnnotatedString;", "()Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "firstBaseline", "k", "lastBaseline", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h intrinsics;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean didExceedMaxLines;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int lineCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Rect> placeholderRects;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphInfo> paragraphInfoList;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/k;", "paragraphInfo", "", "a", "(Landroidx/compose/ui/text/k;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<ParagraphInfo, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f52696f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float[] f52697g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f52698h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f52699i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, float[] fArr, Ref.IntRef intRef, Ref.FloatRef floatRef) {
            super(1);
            this.f52696f = j10;
            this.f52697g = fArr;
            this.f52698h = intRef;
            this.f52699i = floatRef;
        }

        public final void a(ParagraphInfo paragraphInfo) {
            long j10 = this.f52696f;
            float[] fArr = this.f52697g;
            Ref.IntRef intRef = this.f52698h;
            Ref.FloatRef floatRef = this.f52699i;
            long jB = C17334A.b(paragraphInfo.r(paragraphInfo.getStartIndex() > y.l(j10) ? paragraphInfo.getStartIndex() : y.l(j10)), paragraphInfo.r(paragraphInfo.getEndIndex() < y.k(j10) ? paragraphInfo.getEndIndex() : y.k(j10)));
            paragraphInfo.getParagraph().v(jB, fArr, intRef.f143740a);
            int iJ = intRef.f143740a + (y.j(jB) * 4);
            for (int i10 = intRef.f143740a; i10 < iJ; i10 += 4) {
                int i11 = i10 + 1;
                float f10 = fArr[i11];
                float f11 = floatRef.f143739a;
                fArr[i11] = f10 + f11;
                int i12 = i10 + 3;
                fArr[i12] = fArr[i12] + f11;
            }
            intRef.f143740a = iJ;
            floatRef.f143739a += paragraphInfo.getParagraph().getHeight();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
            a(paragraphInfo);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/k;", "paragraphInfo", "", "a", "(Landroidx/compose/ui/text/k;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<ParagraphInfo, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1 f52700f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f52701g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f52702h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q1 q1Var, int i10, int i11) {
            super(1);
            this.f52700f = q1Var;
            this.f52701g = i10;
            this.f52702h = i11;
        }

        public final void a(ParagraphInfo paragraphInfo) {
            q1.j(this.f52700f, paragraphInfo.i(paragraphInfo.getParagraph().t(paragraphInfo.r(this.f52701g), paragraphInfo.r(this.f52702h))), 0L, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
            a(paragraphInfo);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ g(h hVar, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, j10, i10, i11);
    }

    private final void J(int offset) {
        boolean z10 = false;
        if (offset >= 0 && offset < b().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        A1.a.a("offset(" + offset + ") is out of bounds [0, " + b().length() + ')');
    }

    private final void K(int offset) {
        boolean z10 = false;
        if (offset >= 0 && offset <= b().getText().length()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        A1.a.a("offset(" + offset + ") is out of bounds [0, " + b().length() + ']');
    }

    private final void L(int lineIndex) {
        boolean z10 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        A1.a.a("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
    }

    private g(h hVar, long j10, int i10, int i11) {
        this.intrinsics = hVar;
        this.maxLines = i10;
        boolean z10 = true;
        if (!(H1.b.n(j10) == 0 && H1.b.m(j10) == 0)) {
            A1.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> listF = hVar.f();
        int size = listF.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = listF.get(i13);
            InterfaceC17341f interfaceC17341fC = m.c(paragraphIntrinsicInfo.getIntrinsics(), H1.c.b(0, H1.b.l(j10), 0, H1.b.g(j10) ? RangesKt.f(H1.b.k(j10) - m.d(f10), 0) : H1.b.k(j10), 5, null), this.maxLines - i12, i11);
            float height = f10 + interfaceC17341fC.getHeight();
            int iP = i12 + interfaceC17341fC.p();
            arrayList.add(new ParagraphInfo(interfaceC17341fC, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, iP, f10, height));
            if (interfaceC17341fC.r() || (iP == this.maxLines && i13 != CollectionsKt.o(this.intrinsics.f()))) {
                i12 = iP;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = iP;
                f10 = height;
            }
        }
        z10 = false;
        this.height = f10;
        this.lineCount = i12;
        this.didExceedMaxLines = z10;
        this.paragraphInfoList = arrayList;
        this.width = H1.b.l(j10);
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
            List<Rect> listD = paragraphInfo.getParagraph().D();
            ArrayList arrayList3 = new ArrayList(listD.size());
            int size3 = listD.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Rect rect = listD.get(i15);
                arrayList3.add(rect != null ? paragraphInfo.j(rect) : null);
            }
            CollectionsKt.C(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.g().size()) {
            int size4 = this.intrinsics.g().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.P0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public static /* synthetic */ void I(g gVar, Canvas canvas, AbstractC5467i0 abstractC5467i0, float f10, Shadow b12, F1.k kVar, X0.g gVar2, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        gVar.H(canvas, abstractC5467i0, f10, (i11 & 8) != 0 ? null : b12, (i11 & 16) != 0 ? null : kVar, (i11 & 32) != 0 ? null : gVar2, (i11 & 64) != 0 ? X0.f.INSTANCE.a() : i10);
    }

    private final AnnotatedString b() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int o(g gVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return gVar.n(i10, z10);
    }

    public final q1 A(int start, int end) {
        if (!(start >= 0 && start <= end && end <= b().getText().length())) {
            A1.a.a("Start(" + start + ") or End(" + end + ") is out of range [0.." + b().getText().length() + "), or start > end!");
        }
        if (start == end) {
            return W.a();
        }
        q1 q1VarA = W.a();
        C17340e.d(this.paragraphInfoList, C17334A.b(start, end), new b(q1VarA, start, end));
        return q1VarA;
    }

    public final List<Rect> B() {
        return this.placeholderRects;
    }

    public final long C(Rect rect, int granularity, u1.t inclusionStrategy) {
        y.Companion companion;
        y.Companion companion2;
        int iC = C17340e.c(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iC).getBottom() >= rect.i() || iC == CollectionsKt.o(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iC);
            return ParagraphInfo.l(paragraphInfo, paragraphInfo.getParagraph().g(paragraphInfo.p(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iC2 = C17340e.c(this.paragraphInfoList, rect.i());
        long jA = y.INSTANCE.a();
        while (true) {
            companion = y.INSTANCE;
            if (!y.g(jA, companion.a()) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iC);
            jA = ParagraphInfo.l(paragraphInfo2, paragraphInfo2.getParagraph().g(paragraphInfo2.p(rect), granularity, inclusionStrategy), false, 1, null);
            iC++;
        }
        if (y.g(jA, companion.a())) {
            return companion.a();
        }
        long jA2 = companion.a();
        while (true) {
            companion2 = y.INSTANCE;
            if (!y.g(jA2, companion2.a()) || iC > iC2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iC2);
            jA2 = ParagraphInfo.l(paragraphInfo3, paragraphInfo3.getParagraph().g(paragraphInfo3.p(rect), granularity, inclusionStrategy), false, 1, null);
            iC2--;
        }
        return y.g(jA2, companion2.a()) ? jA : C17334A.b(y.n(jA), y.i(jA2));
    }

    /* renamed from: D, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float g() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().l();
    }

    /* renamed from: h, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: j, reason: from getter */
    public final h getIntrinsics() {
        return this.intrinsics;
    }

    public final float k() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.D0(this.paragraphInfoList);
        return paragraphInfo.o(paragraphInfo.getParagraph().w());
    }

    /* renamed from: m, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    public final int q(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.c(this.paragraphInfoList, vertical));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.n(paragraphInfo.getParagraph().s(paragraphInfo.t(vertical)));
    }

    /* renamed from: w, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int x(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.c(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & position))));
        return paragraphInfo.d() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.m(paragraphInfo.getParagraph().m(paragraphInfo.q(position)));
    }

    public final List<ParagraphInfo> z() {
        return this.paragraphInfoList;
    }

    public final long E(int offset) {
        int iA;
        K(offset);
        if (offset == b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.k(paragraphInfo.getParagraph().k(paragraphInfo.r(offset)), false);
    }

    public final void F(Canvas canvas, long color, Shadow shadow, F1.k decoration, X0.g drawStyle, int blendMode) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = list.get(i10);
            paragraphInfo.getParagraph().B(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.d(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.i();
    }

    public final void H(Canvas canvas, AbstractC5467i0 brush, float alpha, Shadow shadow, F1.k decoration, X0.g drawStyle, int blendMode) {
        C1.b.a(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public final float[] a(long range, float[] array, int arrayStart) {
        J(y.l(range));
        K(y.k(range));
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f143740a = arrayStart;
        C17340e.d(this.paragraphInfoList, range, new a(range, array, intRef, new Ref.FloatRef()));
        return array;
    }

    public final F1.i c(int offset) {
        int iA;
        K(offset);
        if (offset == b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.getParagraph().z(paragraphInfo.r(offset));
    }

    public final Rect d(int offset) {
        J(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.a(this.paragraphInfoList, offset));
        return paragraphInfo.j(paragraphInfo.getParagraph().f(paragraphInfo.r(offset)));
    }

    public final Rect e(int offset) {
        int iA;
        K(offset);
        if (offset == b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.j(paragraphInfo.getParagraph().j(paragraphInfo.r(offset)));
    }

    public final float i(int offset, boolean usePrimaryDirection) {
        int iA;
        K(offset);
        if (offset == b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.getParagraph().u(paragraphInfo.r(offset), usePrimaryDirection);
    }

    public final float l(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().A(paragraphInfo.s(lineIndex)));
    }

    public final int n(int lineIndex, boolean visibleEnd) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().o(paragraphInfo.s(lineIndex), visibleEnd));
    }

    public final int p(int offset) {
        int iA;
        if (offset >= b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else if (offset < 0) {
            iA = 0;
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.n(paragraphInfo.getParagraph().x(paragraphInfo.r(offset)));
    }

    public final float r(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().b(paragraphInfo.s(lineIndex));
    }

    public final float s(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().d(paragraphInfo.s(lineIndex));
    }

    public final float t(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().a(paragraphInfo.s(lineIndex));
    }

    public final int u(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.m(paragraphInfo.getParagraph().n(paragraphInfo.s(lineIndex)));
    }

    public final float v(int lineIndex) {
        L(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(C17340e.b(this.paragraphInfoList, lineIndex));
        return paragraphInfo.o(paragraphInfo.getParagraph().i(paragraphInfo.s(lineIndex)));
    }

    public final F1.i y(int offset) {
        int iA;
        K(offset);
        if (offset == b().length()) {
            iA = CollectionsKt.o(this.paragraphInfoList);
        } else {
            iA = C17340e.a(this.paragraphInfoList, offset);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iA);
        return paragraphInfo.getParagraph().h(paragraphInfo.r(offset));
    }
}
