package com.meijer.mobile.mperks.ux.rewardDetail;

import Ir.UserActionDialogInfo;
import Yr.CouponsProductDecorator;
import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ur.AbstractC17302a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b$\u0010'R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "", "", "isLoadingContent", "", "cartItemCount", "", "LYr/a;", "productsDetailDecorator", "isLoadProductsError", "Lak/a;", "productErrorMessage", "LIr/a;", "Lur/a;", "chokingDialog", "<init>", "(ZILjava/util/List;ZLak/a;LIr/a;)V", "a", "(ZILjava/util/List;ZLak/a;LIr/a;)Lcom/meijer/mobile/mperks/ux/rewardDetail/C;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "b", "I", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "f", "Lak/a;", "()Lak/a;", "LIr/a;", "getChokingDialog", "()LIr/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.mperks.ux.rewardDetail.C, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class RewardsDetailsViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoadingContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cartItemCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CouponsProductDecorator> productsDetailDecorator;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoadProductsError;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a productErrorMessage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserActionDialogInfo<AbstractC17302a> chokingDialog;

    public RewardsDetailsViewState() {
        this(false, 0, null, false, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsDetailsViewState)) {
            return false;
        }
        RewardsDetailsViewState rewardsDetailsViewState = (RewardsDetailsViewState) other;
        return this.isLoadingContent == rewardsDetailsViewState.isLoadingContent && this.cartItemCount == rewardsDetailsViewState.cartItemCount && Intrinsics.e(this.productsDetailDecorator, rewardsDetailsViewState.productsDetailDecorator) && this.isLoadProductsError == rewardsDetailsViewState.isLoadProductsError && Intrinsics.e(this.productErrorMessage, rewardsDetailsViewState.productErrorMessage) && Intrinsics.e(this.chokingDialog, rewardsDetailsViewState.chokingDialog);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoadingContent) * 31) + Integer.hashCode(this.cartItemCount)) * 31;
        List<CouponsProductDecorator> list = this.productsDetailDecorator;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.isLoadProductsError)) * 31;
        AbstractC5607a abstractC5607a = this.productErrorMessage;
        int iHashCode3 = (iHashCode2 + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        UserActionDialogInfo<AbstractC17302a> userActionDialogInfo = this.chokingDialog;
        return iHashCode3 + (userActionDialogInfo != null ? userActionDialogInfo.hashCode() : 0);
    }

    public String toString() {
        return "RewardsDetailsViewState(isLoadingContent=" + this.isLoadingContent + ", cartItemCount=" + this.cartItemCount + ", productsDetailDecorator=" + this.productsDetailDecorator + ", isLoadProductsError=" + this.isLoadProductsError + ", productErrorMessage=" + this.productErrorMessage + ", chokingDialog=" + this.chokingDialog + ')';
    }

    public RewardsDetailsViewState(boolean z10, int i10, List<CouponsProductDecorator> list, boolean z11, AbstractC5607a abstractC5607a, UserActionDialogInfo<AbstractC17302a> userActionDialogInfo) {
        this.isLoadingContent = z10;
        this.cartItemCount = i10;
        this.productsDetailDecorator = list;
        this.isLoadProductsError = z11;
        this.productErrorMessage = abstractC5607a;
        this.chokingDialog = userActionDialogInfo;
    }

    public static /* synthetic */ RewardsDetailsViewState b(RewardsDetailsViewState rewardsDetailsViewState, boolean z10, int i10, List list, boolean z11, AbstractC5607a abstractC5607a, UserActionDialogInfo userActionDialogInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = rewardsDetailsViewState.isLoadingContent;
        }
        if ((i11 & 2) != 0) {
            i10 = rewardsDetailsViewState.cartItemCount;
        }
        if ((i11 & 4) != 0) {
            list = rewardsDetailsViewState.productsDetailDecorator;
        }
        if ((i11 & 8) != 0) {
            z11 = rewardsDetailsViewState.isLoadProductsError;
        }
        if ((i11 & 16) != 0) {
            abstractC5607a = rewardsDetailsViewState.productErrorMessage;
        }
        if ((i11 & 32) != 0) {
            userActionDialogInfo = rewardsDetailsViewState.chokingDialog;
        }
        AbstractC5607a abstractC5607a2 = abstractC5607a;
        UserActionDialogInfo userActionDialogInfo2 = userActionDialogInfo;
        return rewardsDetailsViewState.a(z10, i10, list, z11, abstractC5607a2, userActionDialogInfo2);
    }

    public final RewardsDetailsViewState a(boolean isLoadingContent, int cartItemCount, List<CouponsProductDecorator> productsDetailDecorator, boolean isLoadProductsError, AbstractC5607a productErrorMessage, UserActionDialogInfo<AbstractC17302a> chokingDialog) {
        return new RewardsDetailsViewState(isLoadingContent, cartItemCount, productsDetailDecorator, isLoadProductsError, productErrorMessage, chokingDialog);
    }

    /* renamed from: c, reason: from getter */
    public final int getCartItemCount() {
        return this.cartItemCount;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getProductErrorMessage() {
        return this.productErrorMessage;
    }

    public final List<CouponsProductDecorator> e() {
        return this.productsDetailDecorator;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsLoadProductsError() {
        return this.isLoadProductsError;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsLoadingContent() {
        return this.isLoadingContent;
    }

    public /* synthetic */ RewardsDetailsViewState(boolean z10, int i10, List list, boolean z11, AbstractC5607a abstractC5607a, UserActionDialogInfo userActionDialogInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : abstractC5607a, (i11 & 32) != 0 ? null : userActionDialogInfo);
    }
}
