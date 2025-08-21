package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.InterfaceC17343h;
import u1.ParagraphIntrinsicInfo;
import u1.Placeholder;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u001d\u0010 R \u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0014\u0010(\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010'¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/h;", "Lu1/h;", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;Ljava/util/List;LH1/d;Ly1/l$b;)V", "Landroidx/compose/ui/text/n;", "defaultStyle", "h", "(Landroidx/compose/ui/text/n;Landroidx/compose/ui/text/n;)Landroidx/compose/ui/text/n;", "a", "Landroidx/compose/ui/text/AnnotatedString;", "d", "()Landroidx/compose/ui/text/AnnotatedString;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "", "c", "Lkotlin/Lazy;", "e", "()F", "minIntrinsicWidth", "maxIntrinsicWidth", "Lu1/g;", "f", "infoList", "", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h implements InterfaceC17343h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnnotatedString annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy minIntrinsicWidth;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy maxIntrinsicWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<ParagraphIntrinsicInfo> infoList;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function0<Float> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            InterfaceC17343h intrinsics;
            List<ParagraphIntrinsicInfo> listF = h.this.f();
            if (listF.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                float fC = paragraphIntrinsicInfo2.getIntrinsics().c();
                int iO = CollectionsKt.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                        float fC2 = paragraphIntrinsicInfo3.getIntrinsics().c();
                        if (Float.compare(fC, fC2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            fC = fC2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.c());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function0<Float> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo;
            InterfaceC17343h intrinsics;
            List<ParagraphIntrinsicInfo> listF = h.this.f();
            if (listF.isEmpty()) {
                paragraphIntrinsicInfo = null;
            } else {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = listF.get(0);
                float fE = paragraphIntrinsicInfo2.getIntrinsics().e();
                int iO = CollectionsKt.o(listF);
                int i10 = 1;
                if (1 <= iO) {
                    while (true) {
                        ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = listF.get(i10);
                        float fE2 = paragraphIntrinsicInfo3.getIntrinsics().e();
                        if (Float.compare(fE, fE2) < 0) {
                            paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                            fE = fE2;
                        }
                        if (i10 == iO) {
                            break;
                        }
                        i10++;
                    }
                }
                paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
            }
            ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
            return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.e());
        }
    }

    public h(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, H1.d dVar, AbstractC18269l.b bVar) {
        this.annotatedString = annotatedString;
        this.placeholders = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f143288c;
        this.minIntrinsicWidth = LazyKt.a(lazyThreadSafetyMode, new b());
        this.maxIntrinsicWidth = LazyKt.a(lazyThreadSafetyMode, new a());
        ParagraphStyle paragraphStyle = textStyle.getParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> listJ = C6055b.j(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listJ.size());
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listJ.get(i10);
            AnnotatedString annotatedStringK = C6055b.k(annotatedString, range.h(), range.f());
            ParagraphStyle paragraphStyleH = h(range.g(), paragraphStyle);
            String text = annotatedStringK.getText();
            TextStyle textStyleI = textStyle.I(paragraphStyleH);
            List<AnnotatedString.Range<? extends AnnotatedString.a>> listC = annotatedStringK.c();
            if (listC == null) {
                listC = CollectionsKt.m();
            }
            arrayList.add(new ParagraphIntrinsicInfo(l.a(text, textStyleI, listC, dVar, bVar, i.b(g(), range.h(), range.f())), range.h(), range.f()));
        }
        this.infoList = arrayList;
    }

    @Override // u1.InterfaceC17343h
    public boolean a() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).getIntrinsics().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // u1.InterfaceC17343h
    public float c() {
        return ((Number) this.maxIntrinsicWidth.getValue()).floatValue();
    }

    /* renamed from: d, reason: from getter */
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // u1.InterfaceC17343h
    public float e() {
        return ((Number) this.minIntrinsicWidth.getValue()).floatValue();
    }

    public final List<ParagraphIntrinsicInfo> f() {
        return this.infoList;
    }

    public final List<AnnotatedString.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle h(ParagraphStyle style, ParagraphStyle defaultStyle) {
        if (!F1.l.j(style.getTextDirection(), F1.l.INSTANCE.f())) {
            return style;
        }
        return ParagraphStyle.b(style, 0, defaultStyle.getTextDirection(), 0L, null, null, null, 0, 0, null, 509, null);
    }
}
