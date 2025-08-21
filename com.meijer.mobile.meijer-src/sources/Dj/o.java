package Dj;

import android.view.View;
import android.widget.ImageButton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LDj/o;", "Lku/a;", "LOj/g;", "<init>", "()V", "", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LOj/g;", "binding", "position", "", "A", "(LOj/g;I)V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class o extends AbstractC15424a<Oj.g> {
    @Override // ku.AbstractC15424a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(Oj.g binding, int position) {
        Intrinsics.j(binding, "binding");
        int i10 = 0;
        for (Object obj : CollectionsKt.p(binding.f24356b, binding.f24357c, binding.f24358d, binding.f24359e)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            ImageButton imageButton = (ImageButton) obj;
            Intrinsics.g(imageButton);
            double d10 = i10;
            Rj.a.e(imageButton, (int) (d10 * Math.pow(10.0d, d10)));
            i10 = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Oj.g z(View view) {
        Intrinsics.j(view, "view");
        Oj.g gVarA = Oj.g.a(view);
        Intrinsics.i(gVarA, "bind(...)");
        return gVarA;
    }

    @Override // ju.h
    public int j() {
        return Cj.m.f4985j;
    }
}
