package Dj;

import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import com.fullstory.FS;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ku.AbstractC15424a;
import p2.C16349c0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LDj/n;", "Lku/a;", "LOj/h;", "<init>", "()V", "", "j", "()I", "binding", "position", "", "A", "(LOj/h;I)V", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LOj/h;", "", "e", "Ljava/util/List;", "getIcons", "()Ljava/util/List;", "icons", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class n extends AbstractC15424a<Oj.h> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> icons = CollectionsKt.p(Integer.valueOf(Cj.i.f4788h), Integer.valueOf(Cj.i.f4792i), Integer.valueOf(Cj.i.f4796j), Integer.valueOf(Cj.i.f4800k), Integer.valueOf(Cj.i.f4803l), Integer.valueOf(Cj.i.f4806m), Integer.valueOf(Cj.i.f4809n), Integer.valueOf(Cj.i.f4812o), Integer.valueOf(Cj.i.f4815p), Integer.valueOf(Cj.i.f4818q), Integer.valueOf(Cj.i.f4821r), Integer.valueOf(Cj.i.f4824s), Integer.valueOf(Cj.i.f4827t), Integer.valueOf(Cj.i.f4830u), Integer.valueOf(Cj.i.f4833v), Integer.valueOf(Cj.i.f4836w), Integer.valueOf(Cj.i.f4839x), Integer.valueOf(Cj.i.f4842y), Integer.valueOf(Cj.i.f4845z), Integer.valueOf(Cj.i.f4682A), Integer.valueOf(Cj.i.f4685B), Integer.valueOf(Cj.i.f4688C), Integer.valueOf(Cj.i.f4691D), Integer.valueOf(Cj.i.f4694E), Integer.valueOf(Cj.i.f4697F), Integer.valueOf(Cj.i.f4700G), Integer.valueOf(Cj.i.f4703H), Integer.valueOf(Cj.i.f4706I), Integer.valueOf(Cj.i.f4709J), Integer.valueOf(Cj.i.f4712K), Integer.valueOf(Cj.i.f4715L), Integer.valueOf(Cj.i.f4718M), Integer.valueOf(Cj.i.f4721N), Integer.valueOf(Cj.i.f4727P), Integer.valueOf(Cj.i.f4733R), Integer.valueOf(Cj.i.f4739T), Integer.valueOf(Cj.i.f4742U), Integer.valueOf(Cj.i.f4745V), Integer.valueOf(Cj.i.f4748W), Integer.valueOf(Cj.i.f4751X), Integer.valueOf(Cj.i.f4754Y), Integer.valueOf(Cj.i.f4757Z), Integer.valueOf(Cj.i.f4761a0), Integer.valueOf(Cj.i.f4765b0), Integer.valueOf(Cj.i.f4769c0), Integer.valueOf(Cj.i.f4773d0), Integer.valueOf(Cj.i.f4777e0), Integer.valueOf(Cj.i.f4781f0), Integer.valueOf(Cj.i.f4793i0), Integer.valueOf(Cj.i.f4797j0), Integer.valueOf(Cj.i.f4804l0), Integer.valueOf(Cj.i.f4810n0), Integer.valueOf(Cj.i.f4816p0), Integer.valueOf(Cj.i.f4819q0), Integer.valueOf(Cj.i.f4822r0), Integer.valueOf(Cj.i.f4825s0), Integer.valueOf(Cj.i.f4831u0), Integer.valueOf(Cj.i.f4834v0), Integer.valueOf(Cj.i.f4837w0), Integer.valueOf(Cj.i.f4840x0), Integer.valueOf(Cj.i.f4692D0), Integer.valueOf(Cj.i.f4695E0), Integer.valueOf(Cj.i.f4698F0), Integer.valueOf(Cj.i.f4736S), Integer.valueOf(Cj.i.f4701G0), Integer.valueOf(Cj.i.f4704H0), Integer.valueOf(Cj.i.f4707I0), Integer.valueOf(Cj.i.f4710J0), Integer.valueOf(Cj.i.f4716L0), Integer.valueOf(Cj.i.f4719M0), Integer.valueOf(Cj.i.f4722N0), Integer.valueOf(Cj.i.f4725O0), Integer.valueOf(Cj.i.f4728P0), Integer.valueOf(Cj.i.f4731Q0), Integer.valueOf(Cj.i.f4734R0), Integer.valueOf(Cj.i.f4737S0), Integer.valueOf(Cj.i.f4746V0), Integer.valueOf(Cj.i.f4749W0), Integer.valueOf(Cj.i.f4752X0), Integer.valueOf(Cj.i.f4755Y0), Integer.valueOf(Cj.i.f4758Z0), Integer.valueOf(Cj.i.f4762a1), Integer.valueOf(Cj.i.f4770c1), Integer.valueOf(Cj.i.f4774d1), Integer.valueOf(Cj.i.f4778e1), Integer.valueOf(Cj.i.f4782f1), Integer.valueOf(Cj.i.f4786g1), Integer.valueOf(Cj.i.f4790h1), Integer.valueOf(Cj.i.f4794i1), Integer.valueOf(Cj.i.f4798j1), Integer.valueOf(Cj.i.f4805l1), Integer.valueOf(Cj.i.f4808m1), Integer.valueOf(Cj.i.f4811n1), Integer.valueOf(Cj.i.f4814o1), Integer.valueOf(Cj.i.f4817p1), Integer.valueOf(Cj.i.f4820q1), Integer.valueOf(Cj.i.f4823r1), Integer.valueOf(Cj.i.f4826s1), Integer.valueOf(Cj.i.f4829t1), Integer.valueOf(Cj.i.f4838w1), Integer.valueOf(Cj.i.f4844y1), Integer.valueOf(Cj.i.f4847z1), Integer.valueOf(Cj.i.f4684A1), Integer.valueOf(Cj.i.f4687B1), Integer.valueOf(Cj.i.f4690C1), Integer.valueOf(Cj.i.f4693D1), Integer.valueOf(Cj.i.f4696E1), Integer.valueOf(Cj.i.f4699F1), Integer.valueOf(Cj.i.f4702G1), Integer.valueOf(Cj.i.f4705H1), Integer.valueOf(Cj.i.f4708I1), Integer.valueOf(Cj.i.f4711J1), Integer.valueOf(Cj.i.f4714K1), Integer.valueOf(Cj.i.f4717L1), Integer.valueOf(Cj.i.f4720M1), Integer.valueOf(Cj.i.f4802k1));

    @Override // ku.AbstractC15424a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(Oj.h binding, int position) {
        List<Integer> list;
        Intrinsics.j(binding, "binding");
        GridLayout iconGrid = binding.f24363c;
        Intrinsics.i(iconGrid, "iconGrid");
        int i10 = Cj.m.f4984i;
        List<Integer> list2 = this.icons;
        while (true) {
            list = list2;
            if (iconGrid.getChildCount() >= list.size()) {
                break;
            } else {
                ej.c.c(iconGrid, i10, iconGrid.getChildCount());
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
            View viewA = C16349c0.a(iconGrid, i11);
            int iIntValue = ((Number) obj).intValue();
            Intrinsics.h(viewA, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewA;
            FS.Resources_setImageResource(imageView, iIntValue);
            imageView.setContentDescription(imageView.getResources().getResourceEntryName(iIntValue));
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Oj.h z(View view) {
        Intrinsics.j(view, "view");
        Oj.h hVarA = Oj.h.a(view);
        Intrinsics.i(hVarA, "bind(...)");
        return hVarA;
    }

    @Override // ju.h
    public int j() {
        return Cj.m.f4986k;
    }
}
