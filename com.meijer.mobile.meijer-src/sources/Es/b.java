package Es;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.h;
import androidx.recyclerview.widget.RecyclerView;
import p2.InterfaceC16357g0;

/* loaded from: classes12.dex */
public class b extends c {

    class a implements InterfaceC16357g0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f8448a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f8449b;

        @Override // p2.InterfaceC16357g0
        public void a(View view) {
        }

        a(RecyclerView.F f10, h hVar) {
            this.f8448a = f10;
            this.f8449b = hVar;
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            this.f8449b.g(null);
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            b.this.dispatchRemoveFinished(this.f8448a);
            b.this.f8461j.remove(this.f8448a);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // p2.InterfaceC16357g0
        public void c(View view) {
            b.this.dispatchRemoveStarting(this.f8448a);
        }
    }

    @Override // Es.c
    protected void animateRemoveImpl(RecyclerView.F f10) {
        h hVarF = ViewCompat.f(f10.itemView);
        hVarF.e(200L).b(0.0f).l(r0.getWidth());
        hVarF.g(new a(f10, hVarF));
        hVarF.k();
    }
}
