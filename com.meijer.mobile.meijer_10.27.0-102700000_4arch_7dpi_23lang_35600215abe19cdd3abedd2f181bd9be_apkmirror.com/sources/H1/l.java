package H1;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"LH1/l;", "", "LH1/h;", "LH1/v;", "o", "(F)J", "t", "(J)F", "", "F1", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public interface l {
    /* renamed from: F1 */
    float getFontScale();

    default long o(float f10) {
        I1.b bVar = I1.b.f13447a;
        if (!bVar.f(getFontScale())) {
            return w.h(f10 / getFontScale());
        }
        I1.a aVarB = bVar.b(getFontScale());
        return w.h(aVarB != null ? aVarB.a(f10) : f10 / getFontScale());
    }

    default float t(long j10) {
        if (!x.g(v.g(j10), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        I1.b bVar = I1.b.f13447a;
        if (!bVar.f(getFontScale())) {
            return h.p(v.h(j10) * getFontScale());
        }
        I1.a aVarB = bVar.b(getFontScale());
        float fH = v.h(j10);
        if (aVarB == null) {
            return h.p(fH * getFontScale());
        }
        return h.p(aVarB.b(fH));
    }
}
