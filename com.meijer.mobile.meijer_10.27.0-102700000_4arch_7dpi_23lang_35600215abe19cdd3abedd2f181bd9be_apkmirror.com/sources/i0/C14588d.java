package i0;

import F1.TextGeometricTransform;
import F1.k;
import H1.v;
import H1.x;
import V0.C5346q0;
import V0.Shadow;
import android.os.Parcel;
import android.util.Base64;
import androidx.compose.ui.text.SpanStyle;
import fsimpl.C14045dq;
import kotlin.C18153w;
import kotlin.C18154x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00042\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u0010\u001bJ\u0015\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u0010\"J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010\u0010J\u0015\u0010=\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0006¢\u0006\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B"}, d2 = {"Li0/d;", "", "<init>", "()V", "", "q", "", "p", "()Ljava/lang/String;", "Landroidx/compose/ui/text/s;", "spanStyle", "g", "(Landroidx/compose/ui/text/s;)V", "LV0/q0;", "color", "m", "(J)V", "LH1/v;", "textUnit", "j", "Ly1/B;", "fontWeight", "i", "(Ly1/B;)V", "Ly1/w;", "fontStyle", "o", "(I)V", "Ly1/x;", "fontSynthesis", "l", "LF1/a;", "baselineShift", "k", "(F)V", "LF1/o;", "textGeometricTransform", "e", "(LF1/o;)V", "LF1/k;", "textDecoration", "d", "(LF1/k;)V", "LV0/B1;", "shadow", "f", "(LV0/B1;)V", "", "byte", "a", "(B)V", "", "int", "c", "", "float", "b", "Lkotlin/ULong;", "uLong", "n", "string", "h", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14588d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Parcel parcel = Parcel.obtain();

    public final void a(byte b10) {
        this.parcel.writeByte(b10);
    }

    public final void b(float f10) {
        this.parcel.writeFloat(f10);
    }

    public final void c(int i10) {
        this.parcel.writeInt(i10);
    }

    public final void h(String string) {
        this.parcel.writeString(string);
    }

    public final void l(int fontSynthesis) {
        C18154x.Companion companion = C18154x.INSTANCE;
        byte b10 = 0;
        if (!C18154x.h(fontSynthesis, companion.b())) {
            if (C18154x.h(fontSynthesis, companion.a())) {
                b10 = 1;
            } else if (C18154x.h(fontSynthesis, companion.d())) {
                b10 = 2;
            } else if (C18154x.h(fontSynthesis, companion.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void n(long uLong) {
        this.parcel.writeLong(uLong);
    }

    public final void o(int fontStyle) {
        C18153w.Companion companion = C18153w.INSTANCE;
        byte b10 = 0;
        if (!C18153w.f(fontStyle, companion.b()) && C18153w.f(fontStyle, companion.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        return Base64.encodeToString(this.parcel.marshall(), 0);
    }

    public final void q() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final void d(k textDecoration) {
        c(textDecoration.getMask());
    }

    public final void e(TextGeometricTransform textGeometricTransform) {
        b(textGeometricTransform.getScaleX());
        b(textGeometricTransform.getSkewX());
    }

    public final void f(Shadow shadow) {
        m(shadow.getColor());
        b(Float.intBitsToFloat((int) (shadow.getOffset() >> 32)));
        b(Float.intBitsToFloat((int) (shadow.getOffset() & 4294967295L)));
        b(shadow.getBlurRadius());
    }

    public final void g(SpanStyle spanStyle) {
        long jG = spanStyle.g();
        C5346q0.Companion companion = C5346q0.INSTANCE;
        if (!C5346q0.s(jG, companion.j())) {
            a((byte) 1);
            m(spanStyle.g());
        }
        long fontSize = spanStyle.getFontSize();
        v.Companion companion2 = v.INSTANCE;
        if (!v.e(fontSize, companion2.a())) {
            a((byte) 2);
            j(spanStyle.getFontSize());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            a((byte) 3);
            i(fontWeight);
        }
        C18153w fontStyle = spanStyle.getFontStyle();
        if (fontStyle != null) {
            int value = fontStyle.getValue();
            a((byte) 4);
            o(value);
        }
        C18154x fontSynthesis = spanStyle.getFontSynthesis();
        if (fontSynthesis != null) {
            int value2 = fontSynthesis.getValue();
            a((byte) 5);
            l(value2);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            a((byte) 6);
            h(fontFeatureSettings);
        }
        if (!v.e(spanStyle.getLetterSpacing(), companion2.a())) {
            a((byte) 7);
            j(spanStyle.getLetterSpacing());
        }
        F1.a baselineShift = spanStyle.getBaselineShift();
        if (baselineShift != null) {
            float multiplier = baselineShift.getMultiplier();
            a((byte) 8);
            k(multiplier);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            a((byte) 9);
            e(textGeometricTransform);
        }
        if (!C5346q0.s(spanStyle.getBackground(), companion.j())) {
            a((byte) 10);
            m(spanStyle.getBackground());
        }
        k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            a(C14045dq.DST_ATOP);
            d(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            a(C14045dq.XOR);
            f(shadow);
        }
    }

    public final void i(FontWeight fontWeight) {
        c(fontWeight.getWeight());
    }

    public final void j(long textUnit) {
        long jG = v.g(textUnit);
        x.Companion companion = x.INSTANCE;
        byte b10 = 0;
        if (!x.g(jG, companion.c())) {
            if (x.g(jG, companion.b())) {
                b10 = 1;
            } else if (x.g(jG, companion.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (!x.g(v.g(textUnit), companion.c())) {
            b(v.h(textUnit));
        }
    }

    public final void k(float baselineShift) {
        b(baselineShift);
    }

    public final void m(long color) {
        n(color);
    }
}
