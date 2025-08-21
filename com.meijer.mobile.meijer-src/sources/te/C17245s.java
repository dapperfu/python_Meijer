package te;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: te.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C17245s extends AbstractC17243q {

    /* renamed from: te.s$a */
    class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (C17245s.this.f162630e.isEmpty()) {
                return;
            }
            outline.setPath(C17245s.this.f162630e);
        }
    }

    private void k(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // te.AbstractC17243q
    boolean i() {
        return this.f162626a;
    }

    C17245s(View view) {
        k(view);
    }

    @Override // te.AbstractC17243q
    void b(View view) {
        view.setClipToOutline(!i());
        if (i()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
