package com.meijer.mobile.product.model.hybris.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001\u0017BM\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJV\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006$"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "", "", "eligibility", "", "level", "stockLevelStatus", "ilcPrimary", "", "ilcs", "", "isNewILC", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisStockInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "d", "c", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Z", "()Z", "g", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisStockInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int level;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stockLevelStatus;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ilcPrimary;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> ilcs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isNewILC;

    public HybrisStockInfo() {
        this(null, 0, null, null, null, false, 63, null);
    }

    public final HybrisStockInfo copy(@g(name = "eligibility") String eligibility, @g(name = "stockLevel") int level, @g(name = "stockLevelStatus") String stockLevelStatus, @g(name = "ilcPrimary") String ilcPrimary, @g(name = "ilcs") List<String> ilcs, @g(name = "isNewILC") boolean isNewILC) {
        Intrinsics.j(eligibility, "eligibility");
        Intrinsics.j(ilcs, "ilcs");
        return new HybrisStockInfo(eligibility, level, stockLevelStatus, ilcPrimary, ilcs, isNewILC);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisStockInfo)) {
            return false;
        }
        HybrisStockInfo hybrisStockInfo = (HybrisStockInfo) other;
        return Intrinsics.e(this.eligibility, hybrisStockInfo.eligibility) && this.level == hybrisStockInfo.level && Intrinsics.e(this.stockLevelStatus, hybrisStockInfo.stockLevelStatus) && Intrinsics.e(this.ilcPrimary, hybrisStockInfo.ilcPrimary) && Intrinsics.e(this.ilcs, hybrisStockInfo.ilcs) && this.isNewILC == hybrisStockInfo.isNewILC;
    }

    public int hashCode() {
        int iHashCode = ((this.eligibility.hashCode() * 31) + Integer.hashCode(this.level)) * 31;
        String str = this.stockLevelStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ilcPrimary;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.ilcs.hashCode()) * 31) + Boolean.hashCode(this.isNewILC);
    }

    public String toString() {
        return "HybrisStockInfo(eligibility=" + this.eligibility + ", level=" + this.level + ", stockLevelStatus=" + this.stockLevelStatus + ", ilcPrimary=" + this.ilcPrimary + ", ilcs=" + this.ilcs + ", isNewILC=" + this.isNewILC + ')';
    }

    public HybrisStockInfo(@g(name = "eligibility") String eligibility, @g(name = "stockLevel") int i10, @g(name = "stockLevelStatus") String str, @g(name = "ilcPrimary") String str2, @g(name = "ilcs") List<String> ilcs, @g(name = "isNewILC") boolean z10) {
        Intrinsics.j(eligibility, "eligibility");
        Intrinsics.j(ilcs, "ilcs");
        this.eligibility = eligibility;
        this.level = i10;
        this.stockLevelStatus = str;
        this.ilcPrimary = str2;
        this.ilcs = ilcs;
        this.isNewILC = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getEligibility() {
        return this.eligibility;
    }

    /* renamed from: b, reason: from getter */
    public final String getIlcPrimary() {
        return this.ilcPrimary;
    }

    public final List<String> c() {
        return this.ilcs;
    }

    /* renamed from: d, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: e, reason: from getter */
    public final String getStockLevelStatus() {
        return this.stockLevelStatus;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsNewILC() {
        return this.isNewILC;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HybrisStockInfo(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.util.List r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = "OWN"
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            java.lang.String r4 = "inStock"
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            r5 = 0
        L17:
            r9 = r8 & 16
            if (r9 == 0) goto L1f
            java.util.List r6 = kotlin.collections.CollectionsKt.m()
        L1f:
            r8 = r8 & 32
            if (r8 == 0) goto L2b
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L32
        L2b:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L32:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.product.model.hybris.api.models.HybrisStockInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
