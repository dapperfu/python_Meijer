package zm;

import Mn.AbstractC4210b3;
import ak.AbstractC5607a;
import android.view.View;
import bk.d;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.meijer.V;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.h;
import ou.AbstractC16177a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lzm/a;", "Lou/a;", "LMn/b3;", "Lak/a;", "savingTitle", "savingAmount", "<init>", "(Lak/a;Lak/a;)V", "viewBinding", "", "position", "", "A", "(LMn/b3;I)V", "j", "()I", "Landroid/view/View;", "view", "B", "(Landroid/view/View;)LMn/b3;", "Lnu/h;", "other", "", "m", "(Lnu/h;)Z", "", "i", "()J", "e", "Lak/a;", "getSavingTitle", "()Lak/a;", "f", "getSavingAmount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C18538a extends AbstractC16177a<AbstractC4210b3> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a savingTitle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a savingAmount;

    /* JADX WARN: Multi-variable type inference failed */
    public C18538a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ C18538a(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a, (i10 & 2) != 0 ? null : abstractC5607a2);
    }

    @Override // ou.AbstractC16177a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4210b3 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        MaterialTextView savingTitle = viewBinding.f20486A;
        Intrinsics.i(savingTitle, "savingTitle");
        d.g(savingTitle, this.savingTitle);
        MaterialTextView savingPrice = viewBinding.f20487z;
        Intrinsics.i(savingPrice, "savingPrice");
        d.g(savingPrice, this.savingAmount);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ou.AbstractC16177a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public AbstractC4210b3 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4210b3 abstractC4210b3K0 = AbstractC4210b3.K0(view);
        Intrinsics.i(abstractC4210b3K0, "bind(...)");
        return abstractC4210b3K0;
    }

    @Override // nu.h
    public long i() {
        return this.savingTitle != null ? r0.hashCode() : 0;
    }

    @Override // nu.h
    public int j() {
        return V.f99386h1;
    }

    @Override // nu.h
    public boolean m(h<?> other) {
        Intrinsics.j(other, "other");
        C18538a c18538a = other instanceof C18538a ? (C18538a) other : null;
        if (Intrinsics.e(c18538a != null ? c18538a.savingTitle : null, this.savingTitle)) {
            return Intrinsics.e(c18538a != null ? c18538a.savingAmount : null, this.savingAmount);
        }
        return false;
    }

    public C18538a(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
        this.savingTitle = abstractC5607a;
        this.savingAmount = abstractC5607a2;
    }
}
