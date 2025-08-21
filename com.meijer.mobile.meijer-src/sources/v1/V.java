package v1;

import android.os.Build;
import android.text.StaticLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv1/V;", "Lv1/k0;", "<init>", "()V", "Lv1/l0;", "params", "Landroid/text/StaticLayout;", "a", "(Lv1/l0;)Landroid/text/StaticLayout;", "layout", "", "useFallbackLineSpacing", "b", "(Landroid/text/StaticLayout;Z)Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class V implements k0 {
    @Override // v1.k0
    public boolean b(StaticLayout layout, boolean useFallbackLineSpacing) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return g0.a(layout);
        }
        if (i10 >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }

    @Override // v1.k0
    public StaticLayout a(l0 params) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            X.a(builderObtain, params.getJustificationMode());
        }
        if (i10 >= 28) {
            Z.a(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i10 >= 33) {
            g0.b(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        if (i10 >= 35) {
            i0.a(builderObtain);
        }
        return builderObtain.build();
    }
}
