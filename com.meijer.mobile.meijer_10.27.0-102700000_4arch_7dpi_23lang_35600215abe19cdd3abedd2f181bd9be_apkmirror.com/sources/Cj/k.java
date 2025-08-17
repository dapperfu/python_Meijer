package Cj;

import android.view.View;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nu.C15949d;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LCj/k;", "Lou/a;", "LNj/k;", "<init>", "()V", "viewBinding", "", "position", "", "A", "(LNj/k;I)V", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNj/k;", "Lnu/d;", "Lnu/g;", "e", "Lnu/d;", "getAdapter", "()Lnu/d;", "adapter", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k extends AbstractC16177a<Nj.k> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C15949d<nu.g> adapter = new C15949d<>();

    @Override // ou.AbstractC16177a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(Nj.k viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f22126b.setAdapter(this.adapter);
        this.adapter.x(CollectionsKt.p(new C3043j(Bj.m.f2932b), new C3043j(Bj.m.f2933c), new C3043j(Bj.m.f2934d), new C3043j(Bj.m.f2935e), new C3043j(Bj.m.f2936f), new o(), new m(), new l(), new p(), new r(), new q()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Nj.k z(View view) {
        Intrinsics.j(view, "view");
        Nj.k kVarA = Nj.k.a(view);
        Intrinsics.i(kVarA, "bind(...)");
        return kVarA;
    }

    @Override // nu.h
    /* renamed from: j */
    public int getLayoutId() {
        return Bj.m.f2944n;
    }
}
