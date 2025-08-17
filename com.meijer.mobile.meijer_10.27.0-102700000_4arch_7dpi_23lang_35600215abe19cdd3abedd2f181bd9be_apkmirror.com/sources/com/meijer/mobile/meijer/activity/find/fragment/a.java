package com.meijer.mobile.meijer.activity.find.fragment;

import Zm.InterfaceC5528a;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b%\u0010&R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\u000e¨\u0006,"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/fragment/a;", "Landroidx/viewpager2/adapter/a;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "", "useCompose", "<init>", "(Landroidx/fragment/app/FragmentActivity;Z)V", "", "getItemCount", "()I", "newTotal", "", "m", "(I)V", "k", "()V", "Landroid/view/MotionEvent;", "ev", "h", "(Landroid/view/MotionEvent;)V", "LZm/a;", "a", "LZm/a;", "()LZm/a;", "i", "(LZm/a;)V", "productsFragment", "", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "query", "Z", "f", "()Z", "d", "I", "getTotalNumberOfTabs", "l", "totalNumberOfTabs", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a extends androidx.viewpager2.adapter.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5528a productsFragment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String query;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean useCompose;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int totalNumberOfTabs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentActivity fragmentActivity, boolean z10) {
        super(fragmentActivity);
        Intrinsics.j(fragmentActivity, "fragmentActivity");
        this.useCompose = z10;
    }

    /* renamed from: a, reason: from getter */
    public final InterfaceC5528a getProductsFragment() {
        return this.productsFragment;
    }

    /* renamed from: c, reason: from getter */
    protected final String getQuery() {
        return this.query;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getUseCompose() {
        return this.useCompose;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: getItemCount, reason: from getter */
    public int getTotalNumberOfTabs() {
        return this.totalNumberOfTabs;
    }

    public void h(MotionEvent ev2) {
        InterfaceC5528a interfaceC5528a = this.productsFragment;
        if (interfaceC5528a != null) {
            interfaceC5528a.T(ev2);
        }
    }

    public final void i(InterfaceC5528a interfaceC5528a) {
        this.productsFragment = interfaceC5528a;
    }

    protected final void j(String str) {
        this.query = str;
    }

    public final void k() {
        InterfaceC5528a interfaceC5528a = this.productsFragment;
        if (interfaceC5528a != null) {
            interfaceC5528a.e();
        }
    }

    public final void l(int i10) {
        this.totalNumberOfTabs = i10;
    }

    public final void m(int newTotal) {
        this.totalNumberOfTabs = newTotal;
    }
}
