package E1;

import C1.j;
import U0.k;
import V0.z1;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R1\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\"\u0004\b\u0017\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"LE1/e;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "LV0/z1;", "shaderBrush", "", "alpha", "<init>", "(LV0/z1;F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "LV0/z1;", "()LV0/z1;", "b", "F", "getAlpha", "()F", "LU0/k;", "<set-?>", "c", "Landroidx/compose/runtime/l0;", "()J", "(J)V", "size", "Landroidx/compose/runtime/z1;", "Landroid/graphics/Shader;", "d", "Landroidx/compose/runtime/z1;", "shaderState", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z1 shaderBrush;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 size = t1.e(k.c(k.INSTANCE.a()), null, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.z1<Shader> shaderState = o1.e(new a());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function0<Shader> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            if (e.this.b() == 9205357640488583168L || k.k(e.this.b())) {
                return null;
            }
            return e.this.getShaderBrush().b(e.this.b());
        }
    }

    /* renamed from: a, reason: from getter */
    public final z1 getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        return ((k) this.size.getValue()).getPackedValue();
    }

    public final void c(long j10) {
        this.size.setValue(k.c(j10));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }

    public e(z1 z1Var, float f10) {
        this.shaderBrush = z1Var;
        this.alpha = f10;
    }
}
