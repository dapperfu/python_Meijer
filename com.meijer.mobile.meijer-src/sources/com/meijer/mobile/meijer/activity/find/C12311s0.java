package com.meijer.mobile.meijer.activity.find;

import Nn.AbstractC4293t2;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/s0;", "Lku/a;", "LNn/t2;", "", "isClearEnabled", "Lkotlin/Function0;", "", "onClearClicked", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "", "j", "()I", "", "i", "()J", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LNn/t2;", "viewBinding", "position", "B", "(LNn/t2;I)V", "e", "Z", "f", "Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12311s0 extends AbstractC15424a<AbstractC4293t2> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isClearEnabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> onClearClicked;

    public C12311s0(boolean z10, Function0<Unit> onClearClicked) {
        Intrinsics.j(onClearClicked, "onClearClicked");
        this.isClearEnabled = z10;
        this.onClearClicked = onClearClicked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(C12311s0 c12311s0, View view) {
        c12311s0.onClearClicked.invoke();
    }

    @Override // ku.AbstractC15424a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void u(AbstractC4293t2 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f22321z.setEnabled(this.isClearEnabled);
        viewBinding.f22321z.setOnClickListener(new View.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.find.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12311s0.C(this.f108715a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public AbstractC4293t2 z(View view) {
        Intrinsics.j(view, "view");
        AbstractC4293t2 abstractC4293t2M0 = AbstractC4293t2.M0(view);
        Intrinsics.i(abstractC4293t2M0, "bind(...)");
        return abstractC4293t2M0;
    }

    @Override // ju.h
    public long i() {
        return Boolean.hashCode(this.isClearEnabled);
    }

    @Override // ju.h
    public int j() {
        return com.meijer.mobile.meijer.V.f100196O0;
    }
}
