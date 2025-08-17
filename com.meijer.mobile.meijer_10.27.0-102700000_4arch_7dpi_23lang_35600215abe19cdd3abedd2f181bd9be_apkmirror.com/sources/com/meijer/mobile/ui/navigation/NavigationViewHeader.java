package com.meijer.mobile.ui.navigation;

import Tq.j;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.meijer.mobile.ui.navigation.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ps.e0;
import qs.AbstractC16603c;
import yo.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/meijer/mobile/ui/navigation/NavigationViewHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/meijer/mobile/ui/navigation/a$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lps/e0;", "listener", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "B", "(Lps/e0;Lyo/k;LTq/j;)V", "C", "onCreateAccount", "onSignIn", "", "storeId", "", "storeName", "e", "(ILjava/lang/String;)V", "b", "g", "x", "Lps/e0;", "Lqs/c;", "y", "Lqs/c;", "binding", "Lcom/meijer/mobile/ui/navigation/a;", "z", "Lcom/meijer/mobile/ui/navigation/a;", "viewModel", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NavigationViewHeader extends ConstraintLayout implements a.InterfaceC1935a {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private e0 listener;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private AbstractC16603c binding;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private a viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
    }

    public final void B(e0 listener, k userManager, j storeProvider) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        this.listener = listener;
        this.viewModel = new a(userManager, storeProvider, this);
        AbstractC16603c abstractC16603c = this.binding;
        AbstractC16603c abstractC16603c2 = null;
        if (abstractC16603c == null) {
            Intrinsics.y("binding");
            abstractC16603c = null;
        }
        abstractC16603c.O0(this.viewModel);
        AbstractC16603c abstractC16603c3 = this.binding;
        if (abstractC16603c3 == null) {
            Intrinsics.y("binding");
            abstractC16603c3 = null;
        }
        abstractC16603c3.P0(this.viewModel);
        AbstractC16603c abstractC16603c4 = this.binding;
        if (abstractC16603c4 == null) {
            Intrinsics.y("binding");
            abstractC16603c4 = null;
        }
        abstractC16603c4.a0();
        AbstractC16603c abstractC16603c5 = this.binding;
        if (abstractC16603c5 == null) {
            Intrinsics.y("binding");
        } else {
            abstractC16603c2 = abstractC16603c5;
        }
        abstractC16603c2.f157540z.sendAccessibilityEvent(32768);
    }

    public final void C() {
        a aVar = this.viewModel;
        if (aVar != null) {
            aVar.Q();
        }
    }

    @Override // com.meijer.mobile.ui.navigation.a.InterfaceC1935a
    public void b() {
        e0 e0Var = this.listener;
        if (e0Var != null) {
            e0Var.e(HttpResponseStatus.ERROR_BAD_REQUEST);
        }
    }

    @Override // com.meijer.mobile.ui.navigation.a.InterfaceC1935a
    public void e(int storeId, String storeName) {
        e0 e0Var = this.listener;
        if (e0Var != null) {
            e0Var.b(storeId, storeName);
        }
    }

    @Override // com.meijer.mobile.ui.navigation.a.InterfaceC1935a
    public void g() {
        e0 e0Var = this.listener;
        if (e0Var != null) {
            e0Var.g();
        }
    }

    @Override // com.meijer.mobile.ui.navigation.a.InterfaceC1935a
    public void onCreateAccount() {
        e0 e0Var = this.listener;
        if (e0Var != null) {
            e0Var.c();
        }
    }

    @Override // com.meijer.mobile.ui.navigation.a.InterfaceC1935a
    public void onSignIn() {
        e0 e0Var = this.listener;
        if (e0Var != null) {
            e0Var.a();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.binding = AbstractC16603c.K0(this);
    }
}
