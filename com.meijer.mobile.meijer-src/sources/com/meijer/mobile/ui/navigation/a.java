package com.meijer.mobile.ui.navigation;

import Tq.j;
import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.InterfaceC16513Q;
import ps.j0;
import yo.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010!\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006\""}, d2 = {"Lcom/meijer/mobile/ui/navigation/a;", "Landroidx/databinding/a;", "Lps/Q;", "Lyo/k;", "userManager", "LTq/j;", "storeProvider", "Lcom/meijer/mobile/ui/navigation/a$a;", "listener", "<init>", "(Lyo/k;LTq/j;Lcom/meijer/mobile/ui/navigation/a$a;)V", "", "M", "()I", "S", "", "Q", "()V", "c", "a", "B", "g", "Lyo/k;", "b", "LTq/j;", "Lcom/meijer/mobile/ui/navigation/a$a;", "Lbk/a;", "O", "()Lbk/a;", "storeName", "P", "welcomeMessage", "N", "storeActionDescription", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a extends androidx.databinding.a implements InterfaceC16513Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1942a listener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/ui/navigation/a$a;", "", "", "onCreateAccount", "()V", "onSignIn", "", "storeId", "", "storeName", "e", "(ILjava/lang/String;)V", "b", "g", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.ui.navigation.a$a, reason: collision with other inner class name */
    public interface InterfaceC1942a {
        void b();

        void e(int storeId, String storeName);

        void g();

        void onCreateAccount();

        void onSignIn();
    }

    public a(k userManager, j storeProvider, InterfaceC1942a interfaceC1942a) {
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeProvider, "storeProvider");
        this.userManager = userManager;
        this.storeProvider = storeProvider;
        this.listener = interfaceC1942a;
    }

    @Override // ps.InterfaceC16513Q
    public void B() {
        if (this.storeProvider.d()) {
            InterfaceC1942a interfaceC1942a = this.listener;
            if (interfaceC1942a != null) {
                interfaceC1942a.e(this.storeProvider.b(), this.storeProvider.e());
                return;
            }
            return;
        }
        InterfaceC1942a interfaceC1942a2 = this.listener;
        if (interfaceC1942a2 != null) {
            interfaceC1942a2.b();
        }
    }

    public final int M() {
        return this.userManager.b() ? 0 : 8;
    }

    public final AbstractC6392a N() {
        return this.storeProvider.d() ? AbstractC6392a.INSTANCE.d(j0.f157335l, new Object[0]) : AbstractC6392a.INSTANCE.d(j0.f157332i, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bk.AbstractC6392a O() {
        /*
            r4 = this;
            bk.a$a r0 = bk.AbstractC6392a.INSTANCE
            int r1 = ps.j0.f157336m
            Tq.j r2 = r4.storeProvider
            java.lang.String r2 = r2.e()
            if (r2 == 0) goto L1d
            boolean r3 = kotlin.text.StringsKt.s0(r2)
            if (r3 != 0) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L1d
            bk.a r2 = r0.c(r2)
            if (r2 == 0) goto L1d
            goto L26
        L1d:
            int r2 = ps.j0.f157330g
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            bk.a r2 = r0.d(r2, r3)
        L26:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            bk.a r0 = r0.d(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.ui.navigation.a.O():bk.a");
    }

    public final AbstractC6392a P() {
        return AbstractC6392a.INSTANCE.d(j0.f157328e, this.userManager.p());
    }

    public final int S() {
        return this.userManager.b() ? 8 : 0;
    }

    @Override // ps.InterfaceC16513Q
    public void a() {
        InterfaceC1942a interfaceC1942a = this.listener;
        if (interfaceC1942a != null) {
            interfaceC1942a.onSignIn();
        }
    }

    @Override // ps.InterfaceC16513Q
    public void c() {
        InterfaceC1942a interfaceC1942a = this.listener;
        if (interfaceC1942a != null) {
            interfaceC1942a.onCreateAccount();
        }
    }

    @Override // ps.InterfaceC16513Q
    public void g() {
        InterfaceC1942a interfaceC1942a = this.listener;
        if (interfaceC1942a != null) {
            interfaceC1942a.g();
        }
    }

    public final void Q() {
        notifyChange();
    }
}
