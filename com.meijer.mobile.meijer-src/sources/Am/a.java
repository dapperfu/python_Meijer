package Am;

import Nn.AbstractC4215b3;
import android.view.View;
import bk.AbstractC6392a;
import ck.d;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.V;
import ju.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"LAm/a;", "Lku/a;", "LNn/b3;", "Lbk/a;", "savingTitle", "savingAmount", "<init>", "(Lbk/a;Lbk/a;)V", "viewBinding", "", "position", "", "A", "(LNn/b3;I)V", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LNn/b3;", "Lju/h;", "other", "", "m", "(Lju/h;)Z", "", "i", "()J", "e", "Lbk/a;", "getSavingTitle", "()Lbk/a;", "f", "getSavingAmount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends AbstractC15424a<AbstractC4215b3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a savingTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6392a savingAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2);
    }

    @Override // ku.AbstractC15424a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4215b3 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        MaterialTextView savingTitle = viewBinding.f21818A;
        Intrinsics.i(savingTitle, "savingTitle");
        d.g(savingTitle, this.savingTitle);
        MaterialTextView savingPrice = viewBinding.f21819z;
        Intrinsics.i(savingPrice, "savingPrice");
        d.g(savingPrice, this.savingAmount);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC4215b3 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4215b3 abstractC4215b3M0 = AbstractC4215b3.M0(view);
        Intrinsics.i(abstractC4215b3M0, "bind(...)");
        return abstractC4215b3M0;
    }

    @Override // ju.h
    public long i() {
        return this.savingTitle != null ? r0.hashCode() : 0;
    }

    @Override // ju.h
    public int j() {
        return V.f100242h1;
    }

    @Override // ju.h
    public boolean m(h<?> other) {
        Intrinsics.j(other, "other");
        a aVar = other instanceof a ? (a) other : null;
        if (Intrinsics.e(aVar != null ? aVar.savingTitle : null, this.savingTitle)) {
            return Intrinsics.e(aVar != null ? aVar.savingAmount : null, this.savingAmount);
        }
        return false;
    }

    public a(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
        this.savingTitle = abstractC6392a;
        this.savingAmount = abstractC6392a2;
    }
}
