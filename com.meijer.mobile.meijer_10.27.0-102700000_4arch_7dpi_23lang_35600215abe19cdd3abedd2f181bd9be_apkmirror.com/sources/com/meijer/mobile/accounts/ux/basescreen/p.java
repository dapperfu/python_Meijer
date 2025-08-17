package com.meijer.mobile.accounts.ux.basescreen;

import Dh.AccountChip;
import Jk.AppVersion;
import Rh.ContactUsDecorator;
import androidx.view.c0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.P;
import tv.S;
import zh.C18464b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/p;", "Landroidx/lifecycle/c0;", "Lzh/b;", "accountChipDataSource", "LCs/b;", "userProvider", "LJk/a;", "appVersion", "<init>", "(Lzh/b;LCs/b;LJk/a;)V", "Ltv/B;", "Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "a", "Ltv/B;", "_viewState", "Ltv/P;", "b", "Ltv/P;", "m", "()Ltv/P;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AccountOverviewViewState> _viewState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P<AccountOverviewViewState> viewState;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/p$a;", "", "LRh/a;", "contactUsDecorator", "", "LDh/c;", "chips", "<init>", "(LRh/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LRh/a;", "b", "()LRh/a;", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.accounts.ux.basescreen.p$a, reason: from toString */
    public static final /* data */ class AccountOverviewViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactUsDecorator contactUsDecorator;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<AccountChip> chips;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountOverviewViewState)) {
                return false;
            }
            AccountOverviewViewState accountOverviewViewState = (AccountOverviewViewState) other;
            return Intrinsics.e(this.contactUsDecorator, accountOverviewViewState.contactUsDecorator) && Intrinsics.e(this.chips, accountOverviewViewState.chips);
        }

        public int hashCode() {
            ContactUsDecorator contactUsDecorator = this.contactUsDecorator;
            return ((contactUsDecorator == null ? 0 : contactUsDecorator.hashCode()) * 31) + this.chips.hashCode();
        }

        public String toString() {
            return "AccountOverviewViewState(contactUsDecorator=" + this.contactUsDecorator + ", chips=" + this.chips + ')';
        }

        public AccountOverviewViewState(ContactUsDecorator contactUsDecorator, List<AccountChip> chips) {
            Intrinsics.j(chips, "chips");
            this.contactUsDecorator = contactUsDecorator;
            this.chips = chips;
        }

        public final List<AccountChip> a() {
            return this.chips;
        }

        /* renamed from: b, reason: from getter */
        public final ContactUsDecorator getContactUsDecorator() {
            return this.contactUsDecorator;
        }
    }

    public p(C18464b accountChipDataSource, Cs.b userProvider, AppVersion appVersion) {
        ContactUsDecorator contactUsDecorator;
        Intrinsics.j(accountChipDataSource, "accountChipDataSource");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(appVersion, "appVersion");
        List<AccountChip> listA = accountChipDataSource.a();
        String strA = userProvider.a();
        if (strA == null || strA.length() <= 0 || appVersion.getVersionName().length() <= 0) {
            contactUsDecorator = null;
        } else {
            String strA2 = userProvider.a();
            Intrinsics.g(strA2);
            contactUsDecorator = new ContactUsDecorator(strA2, appVersion.getVersionName());
        }
        InterfaceC17140B<AccountOverviewViewState> interfaceC17140BA = S.a(new AccountOverviewViewState(contactUsDecorator, listA));
        this._viewState = interfaceC17140BA;
        this.viewState = C17154h.c(interfaceC17140BA);
    }

    public final P<AccountOverviewViewState> m() {
        return this.viewState;
    }
}
