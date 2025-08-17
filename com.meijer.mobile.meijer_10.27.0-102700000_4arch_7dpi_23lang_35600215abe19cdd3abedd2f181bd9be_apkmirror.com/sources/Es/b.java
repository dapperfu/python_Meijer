package Es;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.h;
import androidx.recyclerview.widget.RecyclerView;
import p2.InterfaceC16212g0;

/* loaded from: classes11.dex */
public class b extends c {

    class a implements InterfaceC16212g0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f9736a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f9737b;

        @Override // p2.InterfaceC16212g0
        public void a(View view) {
        }

        a(RecyclerView.F f10, h hVar) {
            this.f9736a = f10;
            this.f9737b = hVar;
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            this.f9737b.g(null);
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            b.this.dispatchRemoveFinished(this.f9736a);
            b.this.f9749j.remove(this.f9736a);
            b.this.dispatchFinishedWhenDone();
        }

        @Override // p2.InterfaceC16212g0
        public void c(View view) {
            b.this.dispatchRemoveStarting(this.f9736a);
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
