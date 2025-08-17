package com.meijer.mobile.meijer.activity.orderoptions;

import ak.AbstractC5607a;
import com.meijer.mobile.meijer.activity.orderoptions.y;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0088\u0001\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b&\u0010#R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b$\u0010-R\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b.\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b/\u0010#R\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b0\u0010+R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b(\u0010#¨\u00061"}, d2 = {"Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "Lak/a;", "name", "nameWithDistance", "addressLine1", "addressLine2", "", "isSelected", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "action", "listItemActionText", "milesAway", "isPrimaryAddress", "fullAddress", "<init>", "(Ljava/lang/String;Lak/a;Lak/a;Lak/a;Lak/a;ZLcom/meijer/mobile/meijer/activity/orderoptions/y$e;Lak/a;Lak/a;ZLak/a;)V", "a", "(Ljava/lang/String;Lak/a;Lak/a;Lak/a;Lak/a;ZLcom/meijer/mobile/meijer/activity/orderoptions/y$e;Lak/a;Lak/a;ZLak/a;)Lcom/meijer/mobile/meijer/activity/orderoptions/s;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "Lak/a;", "j", "()Lak/a;", "c", "k", "d", "e", "f", "Z", "m", "()Z", "Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "()Lcom/meijer/mobile/meijer/activity/orderoptions/y$e;", "h", "i", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.orderoptions.s, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderOptionsListItem {

    /* renamed from: l, reason: collision with root package name */
    public static final int f109969l = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a nameWithDistance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a addressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a addressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.e action;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a listItemActionText;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a milesAway;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimaryAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a fullAddress;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderOptionsListItem)) {
            return false;
        }
        OrderOptionsListItem orderOptionsListItem = (OrderOptionsListItem) other;
        return Intrinsics.e(this.id, orderOptionsListItem.id) && Intrinsics.e(this.name, orderOptionsListItem.name) && Intrinsics.e(this.nameWithDistance, orderOptionsListItem.nameWithDistance) && Intrinsics.e(this.addressLine1, orderOptionsListItem.addressLine1) && Intrinsics.e(this.addressLine2, orderOptionsListItem.addressLine2) && this.isSelected == orderOptionsListItem.isSelected && Intrinsics.e(this.action, orderOptionsListItem.action) && Intrinsics.e(this.listItemActionText, orderOptionsListItem.listItemActionText) && Intrinsics.e(this.milesAway, orderOptionsListItem.milesAway) && this.isPrimaryAddress == orderOptionsListItem.isPrimaryAddress && Intrinsics.e(this.fullAddress, orderOptionsListItem.fullAddress);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.name.hashCode()) * 31) + this.nameWithDistance.hashCode()) * 31) + this.addressLine1.hashCode()) * 31) + this.addressLine2.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.action.hashCode()) * 31) + this.listItemActionText.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.milesAway;
        return ((((iHashCode + (abstractC5607a != null ? abstractC5607a.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31) + this.fullAddress.hashCode();
    }

    public String toString() {
        return "OrderOptionsListItem(id=" + this.id + ", name=" + this.name + ", nameWithDistance=" + this.nameWithDistance + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", isSelected=" + this.isSelected + ", action=" + this.action + ", listItemActionText=" + this.listItemActionText + ", milesAway=" + this.milesAway + ", isPrimaryAddress=" + this.isPrimaryAddress + ", fullAddress=" + this.fullAddress + ')';
    }

    public OrderOptionsListItem(String str, AbstractC5607a name, AbstractC5607a nameWithDistance, AbstractC5607a addressLine1, AbstractC5607a addressLine2, boolean z10, y.e action, AbstractC5607a listItemActionText, AbstractC5607a abstractC5607a, boolean z11, AbstractC5607a fullAddress) {
        Intrinsics.j(name, "name");
        Intrinsics.j(nameWithDistance, "nameWithDistance");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(addressLine2, "addressLine2");
        Intrinsics.j(action, "action");
        Intrinsics.j(listItemActionText, "listItemActionText");
        Intrinsics.j(fullAddress, "fullAddress");
        this.id = str;
        this.name = name;
        this.nameWithDistance = nameWithDistance;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.isSelected = z10;
        this.action = action;
        this.listItemActionText = listItemActionText;
        this.milesAway = abstractC5607a;
        this.isPrimaryAddress = z11;
        this.fullAddress = fullAddress;
    }

    public static /* synthetic */ OrderOptionsListItem b(OrderOptionsListItem orderOptionsListItem, String str, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, boolean z10, y.e eVar, AbstractC5607a abstractC5607a5, AbstractC5607a abstractC5607a6, boolean z11, AbstractC5607a abstractC5607a7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = orderOptionsListItem.id;
        }
        if ((i10 & 2) != 0) {
            abstractC5607a = orderOptionsListItem.name;
        }
        if ((i10 & 4) != 0) {
            abstractC5607a2 = orderOptionsListItem.nameWithDistance;
        }
        if ((i10 & 8) != 0) {
            abstractC5607a3 = orderOptionsListItem.addressLine1;
        }
        if ((i10 & 16) != 0) {
            abstractC5607a4 = orderOptionsListItem.addressLine2;
        }
        if ((i10 & 32) != 0) {
            z10 = orderOptionsListItem.isSelected;
        }
        if ((i10 & 64) != 0) {
            eVar = orderOptionsListItem.action;
        }
        if ((i10 & 128) != 0) {
            abstractC5607a5 = orderOptionsListItem.listItemActionText;
        }
        if ((i10 & 256) != 0) {
            abstractC5607a6 = orderOptionsListItem.milesAway;
        }
        if ((i10 & 512) != 0) {
            z11 = orderOptionsListItem.isPrimaryAddress;
        }
        if ((i10 & 1024) != 0) {
            abstractC5607a7 = orderOptionsListItem.fullAddress;
        }
        boolean z12 = z11;
        AbstractC5607a abstractC5607a8 = abstractC5607a7;
        AbstractC5607a abstractC5607a9 = abstractC5607a5;
        AbstractC5607a abstractC5607a10 = abstractC5607a6;
        boolean z13 = z10;
        y.e eVar2 = eVar;
        AbstractC5607a abstractC5607a11 = abstractC5607a4;
        AbstractC5607a abstractC5607a12 = abstractC5607a2;
        return orderOptionsListItem.a(str, abstractC5607a, abstractC5607a12, abstractC5607a3, abstractC5607a11, z13, eVar2, abstractC5607a9, abstractC5607a10, z12, abstractC5607a8);
    }

    public final OrderOptionsListItem a(String id2, AbstractC5607a name, AbstractC5607a nameWithDistance, AbstractC5607a addressLine1, AbstractC5607a addressLine2, boolean isSelected, y.e action, AbstractC5607a listItemActionText, AbstractC5607a milesAway, boolean isPrimaryAddress, AbstractC5607a fullAddress) {
        Intrinsics.j(name, "name");
        Intrinsics.j(nameWithDistance, "nameWithDistance");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(addressLine2, "addressLine2");
        Intrinsics.j(action, "action");
        Intrinsics.j(listItemActionText, "listItemActionText");
        Intrinsics.j(fullAddress, "fullAddress");
        return new OrderOptionsListItem(id2, name, nameWithDistance, addressLine1, addressLine2, isSelected, action, listItemActionText, milesAway, isPrimaryAddress, fullAddress);
    }

    /* renamed from: c, reason: from getter */
    public final y.e getAction() {
        return this.action;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getFullAddress() {
        return this.fullAddress;
    }

    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC5607a getListItemActionText() {
        return this.listItemActionText;
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC5607a getMilesAway() {
        return this.milesAway;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC5607a getName() {
        return this.name;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC5607a getNameWithDistance() {
        return this.nameWithDistance;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsPrimaryAddress() {
        return this.isPrimaryAddress;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }
}
