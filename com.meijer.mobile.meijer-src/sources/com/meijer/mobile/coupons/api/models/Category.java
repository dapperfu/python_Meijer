package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/Category;", "", "", "categoryID", "categoryName", "", "offerCountCategory", "", "isCustomCategory", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;IZZ)Lcom/meijer/mobile/coupons/api/models/Category;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "setCategoryID", "(Ljava/lang/String;)V", "c", "setCategoryName", "I", "d", "setOfferCountCategory", "(I)V", "Z", "e", "()Z", "setCustomCategory", "(Z)V", "f", "setSelected", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Category {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String categoryID;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String categoryName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int offerCountCategory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isCustomCategory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private transient boolean isSelected;

    public Category() {
        this(null, null, 0, false, false, 31, null);
    }

    public static /* synthetic */ Category a(Category category, String str, String str2, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = category.categoryID;
        }
        if ((i11 & 2) != 0) {
            str2 = category.categoryName;
        }
        if ((i11 & 4) != 0) {
            i10 = category.offerCountCategory;
        }
        if ((i11 & 8) != 0) {
            z10 = category.isCustomCategory;
        }
        if ((i11 & 16) != 0) {
            z11 = category.isSelected;
        }
        boolean z12 = z11;
        int i12 = i10;
        return category.copy(str, str2, i12, z10, z12);
    }

    public final Category copy(@g(name = "categoryID") String categoryID, @g(name = "categoryName") String categoryName, @g(name = "offerCountDepartment") int offerCountCategory, @g(name = "isCustomCategory") boolean isCustomCategory, boolean isSelected) {
        return new Category(categoryID, categoryName, offerCountCategory, isCustomCategory, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            return false;
        }
        Category category = (Category) other;
        return Intrinsics.e(this.categoryID, category.categoryID) && Intrinsics.e(this.categoryName, category.categoryName) && this.offerCountCategory == category.offerCountCategory && this.isCustomCategory == category.isCustomCategory && this.isSelected == category.isSelected;
    }

    public int hashCode() {
        String str = this.categoryID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryName;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.offerCountCategory)) * 31) + Boolean.hashCode(this.isCustomCategory)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "Category(categoryID=" + this.categoryID + ", categoryName=" + this.categoryName + ", offerCountCategory=" + this.offerCountCategory + ", isCustomCategory=" + this.isCustomCategory + ", isSelected=" + this.isSelected + ')';
    }

    public Category(@g(name = "categoryID") String str, @g(name = "categoryName") String str2, @g(name = "offerCountDepartment") int i10, @g(name = "isCustomCategory") boolean z10, boolean z11) {
        this.categoryID = str;
        this.categoryName = str2;
        this.offerCountCategory = i10;
        this.isCustomCategory = z10;
        this.isSelected = z11;
    }

    /* renamed from: b, reason: from getter */
    public final String getCategoryID() {
        return this.categoryID;
    }

    /* renamed from: c, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* renamed from: d, reason: from getter */
    public final int getOfferCountCategory() {
        return this.offerCountCategory;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCustomCategory() {
        return this.isCustomCategory;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ Category(String str, String str2, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }
}
