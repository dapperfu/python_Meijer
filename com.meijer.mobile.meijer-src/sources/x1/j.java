package x1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 52\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b#\u0010'R$\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R$\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b$\u0010'R$\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b!\u0010'R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lx1/j;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", "F", "b", "I", "c", "d", "e", "f", "()I", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "h", "widthPx", "i", "heightPx", "", "j", "Z", "isLaidOut", "k", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j extends ReplacementSpan {

    /* renamed from: l, reason: collision with root package name */
    public static final int f170064l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int widthUnit;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int heightUnit;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float pxPerSp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int verticalAlign;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int widthPx;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int heightPx;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isLaidOut;

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x10, int top, int y10, int bottom, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
        float f10;
        int iA;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (!(a().descent > a().ascent)) {
            A1.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i10 = this.widthUnit;
        if (i10 == 0) {
            f10 = this.width * this.pxPerSp;
        } else {
            if (i10 != 1) {
                A1.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f10 = this.width * textSize;
        }
        this.widthPx = k.a(f10);
        int i11 = this.heightUnit;
        if (i11 == 0) {
            iA = k.a(this.height * this.pxPerSp);
        } else {
            if (i11 != 1) {
                A1.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            iA = k.a(this.height * textSize);
        }
        this.heightPx = iA;
        if (fm2 != null) {
            fm2.ascent = a().ascent;
            fm2.descent = a().descent;
            fm2.leading = a().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm2.ascent > (-b())) {
                        fm2.ascent = -b();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (fm2.ascent + b() > fm2.descent) {
                        fm2.descent = fm2.ascent + b();
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fm2.ascent > fm2.descent - b()) {
                        fm2.ascent = fm2.descent - b();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fm2.descent - fm2.ascent < b()) {
                        int iB = fm2.ascent - ((b() - (fm2.descent - fm2.ascent)) / 2);
                        fm2.ascent = iB;
                        fm2.descent = iB + b();
                        break;
                    }
                    break;
                default:
                    A1.a.a("Unknown verticalAlign.");
                    break;
            }
            fm2.top = Math.min(a().top, fm2.ascent);
            fm2.bottom = Math.max(a().bottom, fm2.descent);
        }
        return d();
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.x("fontMetrics");
        return null;
    }

    public final int b() {
        if (!this.isLaidOut) {
            A1.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    /* renamed from: c, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int d() {
        if (!this.isLaidOut) {
            A1.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    public j(float f10, int i10, float f11, int i11, float f12, int i12) {
        this.width = f10;
        this.widthUnit = i10;
        this.height = f11;
        this.heightUnit = i11;
        this.pxPerSp = f12;
        this.verticalAlign = i12;
    }
}
