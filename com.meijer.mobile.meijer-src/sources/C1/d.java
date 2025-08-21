package C1;

import android.graphics.Typeface;
import androidx.compose.runtime.z1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.InterfaceC18257Y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.InterfaceC17343h;
import u1.Placeholder;
import v1.O;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b$\u00100R\u001a\u00105\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010CR\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010CR\u0014\u0010G\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010F¨\u0006H"}, d2 = {"LC1/d;", "Lu1/h;", "", "text", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "Lu1/i;", "placeholders", "Ly1/l$b;", "fontFamilyResolver", "LH1/d;", "density", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ljava/util/List;Ljava/util/List;Ly1/l$b;LH1/d;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "Landroidx/compose/ui/text/z;", "i", "()Landroidx/compose/ui/text/z;", "c", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "d", "getPlaceholders", "e", "Ly1/l$b;", "g", "()Ly1/l$b;", "f", "LH1/d;", "getDensity", "()LH1/d;", "LC1/i;", "LC1/i;", "k", "()LC1/i;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "Lv1/O;", "Lv1/O;", "()Lv1/O;", "layoutIntrinsics", "LC1/u;", "j", "LC1/u;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d implements InterfaceC17343h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<AnnotatedString.Range<? extends AnnotatedString.a>> annotations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC18269l.b fontFamilyResolver;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final H1.d density;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i textPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final O layoutIntrinsics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private u resolvedTypefaces;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ly1/l;", "fontFamily", "Ly1/B;", "fontWeight", "Ly1/w;", "fontStyle", "Ly1/x;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(Ly1/l;Ly1/B;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function4<AbstractC18269l, FontWeight, C18280w, C18281x, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(AbstractC18269l abstractC18269l, FontWeight fontWeight, int i10, int i11) {
            z1<Object> z1VarB = d.this.getFontFamilyResolver().b(abstractC18269l, fontWeight, i10, i11);
            if (z1VarB instanceof InterfaceC18257Y.b) {
                Object value = z1VarB.getValue();
                Intrinsics.h(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            u uVar = new u(z1VarB, d.this.resolvedTypefaces);
            d.this.resolvedTypefaces = uVar;
            return uVar.a();
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Typeface invoke(AbstractC18269l abstractC18269l, FontWeight fontWeight, C18280w c18280w, C18281x c18281x) {
            return a(abstractC18269l, fontWeight, c18280w.getValue(), c18281x.getValue());
        }
    }

    @Override // u1.InterfaceC17343h
    public boolean a() {
        u uVar = this.resolvedTypefaces;
        if (uVar != null ? uVar.b() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && e.c(this.style) && p.f4045a.a().getValue().booleanValue();
    }

    @Override // u1.InterfaceC17343h
    public float c() {
        return this.layoutIntrinsics.i();
    }

    @Override // u1.InterfaceC17343h
    public float e() {
        return this.layoutIntrinsics.j();
    }

    /* renamed from: f, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC18269l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: h, reason: from getter */
    public final O getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: j, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    /* renamed from: k, reason: from getter */
    public final i getTextPaint() {
        return this.textPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.AnnotatedString$d<? extends androidx.compose.ui.text.AnnotatedString$a>>, java.util.List<androidx.compose.ui.text.AnnotatedString$d<? extends androidx.compose.ui.text.AnnotatedString$a>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$d<? extends androidx.compose.ui.text.AnnotatedString$a>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    public d(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, List<AnnotatedString.Range<Placeholder>> list2, AbstractC18269l.b bVar, H1.d dVar) {
        boolean zBooleanValue;
        Object obj;
        boolean z10;
        List arrayList;
        AnnotatedString.Range<? extends AnnotatedString.a> range;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = dVar;
        i iVar = new i(1, dVar.getDensity());
        this.textPaint = iVar;
        if (!e.c(textStyle)) {
            zBooleanValue = false;
        } else {
            zBooleanValue = p.f4045a.a().getValue().booleanValue();
        }
        this.emojiCompatProcessed = zBooleanValue;
        this.textDirectionHeuristic = e.d(textStyle.B(), textStyle.u());
        a aVar = new a();
        D1.d.e(iVar, textStyle.E());
        SpanStyle spanStyle = textStyle.getSpanStyle();
        int size = ((Collection) list).size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (((AnnotatedString.Range) obj).g() instanceof SpanStyle) {
                    break;
                } else {
                    i10++;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        SpanStyle spanStyleA = D1.d.a(iVar, spanStyle, aVar, dVar, z10);
        if (spanStyleA != null) {
            int size2 = this.annotations.size() + 1;
            arrayList = new ArrayList(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                if (i11 == 0) {
                    range = new AnnotatedString.Range<>(spanStyleA, 0, this.text.length());
                } else {
                    range = this.annotations.get(i11 - 1);
                }
                arrayList.add(range);
            }
        } else {
            arrayList = this.annotations;
        }
        CharSequence charSequenceA = c.a(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, aVar, this.emojiCompatProcessed);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new O(charSequenceA, this.textPaint, this.textDirectionHeuristic);
    }
}
