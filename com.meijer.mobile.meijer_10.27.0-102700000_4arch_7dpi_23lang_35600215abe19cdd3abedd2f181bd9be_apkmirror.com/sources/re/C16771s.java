package re;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: re.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C16771s extends AbstractC16769q {

    /* renamed from: re.s$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (C16771s.this.f158140e.isEmpty()) {
                return;
            }
            outline.setPath(C16771s.this.f158140e);
        }
    }

    private void k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // re.AbstractC16769q
    boolean i() {
        return this.f158136a;
    }

    C16771s(View view) {
        k(view);
    }

    @Override // re.AbstractC16769q
    void b(View view) {
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
