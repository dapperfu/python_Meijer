package Cj;

import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ou.AbstractC16177a;
import p2.C16204c0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LCj/n;", "Lou/a;", "LNj/h;", "<init>", "()V", "", "j", "()I", "binding", "position", "", "A", "(LNj/h;I)V", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNj/h;", "", "e", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "icons", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class n extends AbstractC16177a<Nj.h> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> icons = CollectionsKt.p(Integer.valueOf(Bj.i.f2743h), Integer.valueOf(Bj.i.f2747i), Integer.valueOf(Bj.i.f2751j), Integer.valueOf(Bj.i.f2755k), Integer.valueOf(Bj.i.f2758l), Integer.valueOf(Bj.i.f2761m), Integer.valueOf(Bj.i.f2764n), Integer.valueOf(Bj.i.f2767o), Integer.valueOf(Bj.i.f2770p), Integer.valueOf(Bj.i.f2773q), Integer.valueOf(Bj.i.f2776r), Integer.valueOf(Bj.i.f2779s), Integer.valueOf(Bj.i.f2782t), Integer.valueOf(Bj.i.f2785u), Integer.valueOf(Bj.i.f2788v), Integer.valueOf(Bj.i.f2791w), Integer.valueOf(Bj.i.f2794x), Integer.valueOf(Bj.i.f2797y), Integer.valueOf(Bj.i.f2800z), Integer.valueOf(Bj.i.f2637A), Integer.valueOf(Bj.i.f2640B), Integer.valueOf(Bj.i.f2643C), Integer.valueOf(Bj.i.f2646D), Integer.valueOf(Bj.i.f2649E), Integer.valueOf(Bj.i.f2652F), Integer.valueOf(Bj.i.f2655G), Integer.valueOf(Bj.i.f2658H), Integer.valueOf(Bj.i.f2661I), Integer.valueOf(Bj.i.f2664J), Integer.valueOf(Bj.i.f2667K), Integer.valueOf(Bj.i.f2670L), Integer.valueOf(Bj.i.f2673M), Integer.valueOf(Bj.i.f2676N), Integer.valueOf(Bj.i.f2682P), Integer.valueOf(Bj.i.f2688R), Integer.valueOf(Bj.i.f2694T), Integer.valueOf(Bj.i.f2697U), Integer.valueOf(Bj.i.f2700V), Integer.valueOf(Bj.i.f2703W), Integer.valueOf(Bj.i.f2706X), Integer.valueOf(Bj.i.f2709Y), Integer.valueOf(Bj.i.f2712Z), Integer.valueOf(Bj.i.f2716a0), Integer.valueOf(Bj.i.f2720b0), Integer.valueOf(Bj.i.f2724c0), Integer.valueOf(Bj.i.f2728d0), Integer.valueOf(Bj.i.f2732e0), Integer.valueOf(Bj.i.f2736f0), Integer.valueOf(Bj.i.f2748i0), Integer.valueOf(Bj.i.f2752j0), Integer.valueOf(Bj.i.f2759l0), Integer.valueOf(Bj.i.f2765n0), Integer.valueOf(Bj.i.f2771p0), Integer.valueOf(Bj.i.f2774q0), Integer.valueOf(Bj.i.f2777r0), Integer.valueOf(Bj.i.f2780s0), Integer.valueOf(Bj.i.f2786u0), Integer.valueOf(Bj.i.f2789v0), Integer.valueOf(Bj.i.f2792w0), Integer.valueOf(Bj.i.f2795x0), Integer.valueOf(Bj.i.f2647D0), Integer.valueOf(Bj.i.f2650E0), Integer.valueOf(Bj.i.f2653F0), Integer.valueOf(Bj.i.f2691S), Integer.valueOf(Bj.i.f2656G0), Integer.valueOf(Bj.i.f2659H0), Integer.valueOf(Bj.i.f2662I0), Integer.valueOf(Bj.i.f2665J0), Integer.valueOf(Bj.i.f2671L0), Integer.valueOf(Bj.i.f2674M0), Integer.valueOf(Bj.i.f2677N0), Integer.valueOf(Bj.i.f2680O0), Integer.valueOf(Bj.i.f2683P0), Integer.valueOf(Bj.i.f2686Q0), Integer.valueOf(Bj.i.f2689R0), Integer.valueOf(Bj.i.f2692S0), Integer.valueOf(Bj.i.f2701V0), Integer.valueOf(Bj.i.f2704W0), Integer.valueOf(Bj.i.f2707X0), Integer.valueOf(Bj.i.f2710Y0), Integer.valueOf(Bj.i.f2713Z0), Integer.valueOf(Bj.i.f2717a1), Integer.valueOf(Bj.i.f2725c1), Integer.valueOf(Bj.i.f2729d1), Integer.valueOf(Bj.i.f2733e1), Integer.valueOf(Bj.i.f2737f1), Integer.valueOf(Bj.i.f2741g1), Integer.valueOf(Bj.i.f2745h1), Integer.valueOf(Bj.i.f2749i1), Integer.valueOf(Bj.i.f2753j1), Integer.valueOf(Bj.i.f2760l1), Integer.valueOf(Bj.i.f2763m1), Integer.valueOf(Bj.i.f2766n1), Integer.valueOf(Bj.i.f2769o1), Integer.valueOf(Bj.i.f2772p1), Integer.valueOf(Bj.i.f2775q1), Integer.valueOf(Bj.i.f2778r1), Integer.valueOf(Bj.i.f2781s1), Integer.valueOf(Bj.i.f2784t1), Integer.valueOf(Bj.i.f2793w1), Integer.valueOf(Bj.i.f2799y1), Integer.valueOf(Bj.i.f2802z1), Integer.valueOf(Bj.i.f2639A1), Integer.valueOf(Bj.i.f2642B1), Integer.valueOf(Bj.i.f2645C1), Integer.valueOf(Bj.i.f2648D1), Integer.valueOf(Bj.i.f2651E1), Integer.valueOf(Bj.i.f2654F1), Integer.valueOf(Bj.i.f2657G1), Integer.valueOf(Bj.i.f2660H1), Integer.valueOf(Bj.i.f2663I1), Integer.valueOf(Bj.i.f2666J1), Integer.valueOf(Bj.i.f2669K1), Integer.valueOf(Bj.i.f2672L1), Integer.valueOf(Bj.i.f2675M1), Integer.valueOf(Bj.i.f2757k1));

    @Override // ou.AbstractC16177a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(Nj.h binding, int position) {
        List<Integer> list;
        Intrinsics.j(binding, "binding");
        GridLayout iconGrid = binding.f22118c;
        Intrinsics.i(iconGrid, "iconGrid");
        int i10 = Bj.m.f2939i;
        List<Integer> list2 = this.icons;
        while (true) {
            list = list2;
            if (iconGrid.getChildCount() >= list.size()) {
                break;
            } else {
                dj.c.c(iconGrid, i10, iconGrid.getChildCount());
            }
        }
        while (iconGrid.getChildCount() > list.size()) {
            iconGrid.removeViewAt(iconGrid.getChildCount() - 1);
        }
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.w();
            }
            View viewA = C16204c0.a(iconGrid, i11);
            int iIntValue = ((Number) obj).intValue();
            Intrinsics.h(viewA, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewA;
            FS.Resources_setImageResource(imageView, iIntValue);
            imageView.setContentDescription(imageView.getResources().getResourceEntryName(iIntValue));
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Nj.h z(View view) {
        Intrinsics.j(view, "view");
        Nj.h hVarA = Nj.h.a(view);
        Intrinsics.i(hVarA, "bind(...)");
        return hVarA;
    }

    @Override // nu.h
    public int j() {
        return Bj.m.f2941k;
    }
}
