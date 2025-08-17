package com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections;

import com.meijer.mobile.meijer.Y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b \b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\u0014R\u001c\u0010/\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "", "", "isLoading", "", "Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/f;", "highValuePromosOfferList", "highValuePromosResponseList", "", "mPerksPoints", "hasPreviouslySelectedPromos", "isFromDialog", "<init>", "(ZLjava/util/List;Ljava/util/List;IZZ)V", "a", "(ZLjava/util/List;Ljava/util/List;IZZ)Lcom/meijer/mobile/meijer/activity/checkout/highvaluepromoselections/q;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "k", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "e", "I", "f", "getHasPreviouslySelectedPromos", "j", "g", "hasUnsavedChanges", "h", "selectedOfferList", "i", "unselectedOfferList", "newAppliedOfferCount", "Ljava/lang/Integer;", "getButtonStringRes", "()Ljava/lang/Integer;", "buttonStringRes", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.q, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class HighValuePromoSelectionsViewState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HighValuePromoOfferDecorator> highValuePromosOfferList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HighValuePromoOfferDecorator> highValuePromosResponseList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mPerksPoints;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasPreviouslySelectedPromos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isFromDialog;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean hasUnsavedChanges;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<String> selectedOfferList;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<String> unselectedOfferList;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int newAppliedOfferCount;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Integer buttonStringRes;

    public HighValuePromoSelectionsViewState() {
        this(false, null, null, 0, false, false, 63, null);
    }

    public static /* synthetic */ HighValuePromoSelectionsViewState b(HighValuePromoSelectionsViewState highValuePromoSelectionsViewState, boolean z10, List list, List list2, int i10, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = highValuePromoSelectionsViewState.isLoading;
        }
        if ((i11 & 2) != 0) {
            list = highValuePromoSelectionsViewState.highValuePromosOfferList;
        }
        if ((i11 & 4) != 0) {
            list2 = highValuePromoSelectionsViewState.highValuePromosResponseList;
        }
        if ((i11 & 8) != 0) {
            i10 = highValuePromoSelectionsViewState.mPerksPoints;
        }
        if ((i11 & 16) != 0) {
            z11 = highValuePromoSelectionsViewState.hasPreviouslySelectedPromos;
        }
        if ((i11 & 32) != 0) {
            z12 = highValuePromoSelectionsViewState.isFromDialog;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return highValuePromoSelectionsViewState.a(z10, list, list2, i10, z13, z14);
    }

    public final HighValuePromoSelectionsViewState a(boolean isLoading, List<HighValuePromoOfferDecorator> highValuePromosOfferList, List<HighValuePromoOfferDecorator> highValuePromosResponseList, int mPerksPoints, boolean hasPreviouslySelectedPromos, boolean isFromDialog) {
        Intrinsics.j(highValuePromosOfferList, "highValuePromosOfferList");
        Intrinsics.j(highValuePromosResponseList, "highValuePromosResponseList");
        return new HighValuePromoSelectionsViewState(isLoading, highValuePromosOfferList, highValuePromosResponseList, mPerksPoints, hasPreviouslySelectedPromos, isFromDialog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighValuePromoSelectionsViewState)) {
            return false;
        }
        HighValuePromoSelectionsViewState highValuePromoSelectionsViewState = (HighValuePromoSelectionsViewState) other;
        return this.isLoading == highValuePromoSelectionsViewState.isLoading && Intrinsics.e(this.highValuePromosOfferList, highValuePromoSelectionsViewState.highValuePromosOfferList) && Intrinsics.e(this.highValuePromosResponseList, highValuePromoSelectionsViewState.highValuePromosResponseList) && this.mPerksPoints == highValuePromoSelectionsViewState.mPerksPoints && this.hasPreviouslySelectedPromos == highValuePromoSelectionsViewState.hasPreviouslySelectedPromos && this.isFromDialog == highValuePromoSelectionsViewState.isFromDialog;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + this.highValuePromosOfferList.hashCode()) * 31) + this.highValuePromosResponseList.hashCode()) * 31) + Integer.hashCode(this.mPerksPoints)) * 31) + Boolean.hashCode(this.hasPreviouslySelectedPromos)) * 31) + Boolean.hashCode(this.isFromDialog);
    }

    public String toString() {
        return "HighValuePromoSelectionsViewState(isLoading=" + this.isLoading + ", highValuePromosOfferList=" + this.highValuePromosOfferList + ", highValuePromosResponseList=" + this.highValuePromosResponseList + ", mPerksPoints=" + this.mPerksPoints + ", hasPreviouslySelectedPromos=" + this.hasPreviouslySelectedPromos + ", isFromDialog=" + this.isFromDialog + ')';
    }

    public HighValuePromoSelectionsViewState(boolean z10, List<HighValuePromoOfferDecorator> highValuePromosOfferList, List<HighValuePromoOfferDecorator> highValuePromosResponseList, int i10, boolean z11, boolean z12) {
        Intrinsics.j(highValuePromosOfferList, "highValuePromosOfferList");
        Intrinsics.j(highValuePromosResponseList, "highValuePromosResponseList");
        this.isLoading = z10;
        this.highValuePromosOfferList = highValuePromosOfferList;
        this.highValuePromosResponseList = highValuePromosResponseList;
        this.mPerksPoints = i10;
        this.hasPreviouslySelectedPromos = z11;
        this.isFromDialog = z12;
        this.hasUnsavedChanges = !Intrinsics.e(highValuePromosOfferList, highValuePromosResponseList);
        ArrayList arrayList = new ArrayList();
        for (Object obj : highValuePromosOfferList) {
            if (((HighValuePromoOfferDecorator) obj).getIsChecked()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((HighValuePromoOfferDecorator) it.next()).getPromoNum());
        }
        this.selectedOfferList = arrayList2;
        List<HighValuePromoOfferDecorator> list = this.highValuePromosOfferList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            if (!((HighValuePromoOfferDecorator) obj2).getIsChecked()) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((HighValuePromoOfferDecorator) it2.next()).getPromoNum());
        }
        this.unselectedOfferList = arrayList4;
        int size = 0;
        if (!this.highValuePromosOfferList.isEmpty() && !this.highValuePromosResponseList.isEmpty()) {
            List<HighValuePromoOfferDecorator> list2 = this.highValuePromosOfferList;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                int i11 = size + 1;
                if (size < 0) {
                    CollectionsKt.w();
                }
                if (((HighValuePromoOfferDecorator) obj3).getIsChecked() && !this.highValuePromosResponseList.get(size).getIsChecked()) {
                    arrayList5.add(obj3);
                }
                size = i11;
            }
            size = arrayList5.size();
        }
        this.newAppliedOfferCount = size;
        this.buttonStringRes = this.hasPreviouslySelectedPromos ? Integer.valueOf(Y.f99996c7) : null;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasUnsavedChanges() {
        return this.hasUnsavedChanges;
    }

    public final List<HighValuePromoOfferDecorator> d() {
        return this.highValuePromosOfferList;
    }

    public final List<HighValuePromoOfferDecorator> e() {
        return this.highValuePromosResponseList;
    }

    /* renamed from: f, reason: from getter */
    public final int getMPerksPoints() {
        return this.mPerksPoints;
    }

    /* renamed from: g, reason: from getter */
    public final int getNewAppliedOfferCount() {
        return this.newAppliedOfferCount;
    }

    public final List<String> h() {
        return this.selectedOfferList;
    }

    public final List<String> i() {
        return this.unselectedOfferList;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsFromDialog() {
        return this.isFromDialog;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HighValuePromoSelectionsViewState(boolean r2, java.util.List r3, java.util.List r4, int r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 1
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Ld
            java.util.List r3 = kotlin.collections.CollectionsKt.m()
        Ld:
            r9 = r8 & 4
            if (r9 == 0) goto L15
            java.util.List r4 = kotlin.collections.CollectionsKt.m()
        L15:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            if (r9 == 0) goto L20
            r6 = r0
        L20:
            r8 = r8 & 32
            if (r8 == 0) goto L2c
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L33
        L2c:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L33:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.highvaluepromoselections.HighValuePromoSelectionsViewState.<init>(boolean, java.util.List, java.util.List, int, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
