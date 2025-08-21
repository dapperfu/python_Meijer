package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0014B;\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001dR\u0011\u0010 \u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010!\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0011\u0010#\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Lfj/h;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lnk/b;", "deliveryCost", "description", "name", "<init>", "(Ljava/lang/String;Lnk/b;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnk/b;", "()Lnk/b;", "c", "getDescription", "d", "getName", "()Z", "isDelivery", "f", "isPickup", "isFree", "e", "isFreeDelivery", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.h, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class DeliveryMode {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b deliveryCost;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public DeliveryMode() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryMode)) {
            return false;
        }
        DeliveryMode deliveryMode = (DeliveryMode) other;
        return Intrinsics.e(this.code, deliveryMode.code) && Intrinsics.e(this.deliveryCost, deliveryMode.deliveryCost) && Intrinsics.e(this.description, deliveryMode.description) && Intrinsics.e(this.name, deliveryMode.name);
    }

    public DeliveryMode(String str, nk.b deliveryCost, String str2, String str3) {
        Intrinsics.j(deliveryCost, "deliveryCost");
        this.code = str;
        this.deliveryCost = deliveryCost;
        this.description = str2;
        this.name = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final nk.b getDeliveryCost() {
        return this.deliveryCost;
    }

    public final boolean c() {
        return Intrinsics.e(this.code, "delivery");
    }

    public final boolean d() {
        return StringsKt.s0(this.deliveryCost.getFormattedValue()) || Intrinsics.e(this.deliveryCost.getFormattedValue(), "$0.00");
    }

    public final boolean f() {
        return Intrinsics.e(this.code, "pickup");
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.deliveryCost.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryMode(code=" + this.code + ", deliveryCost=" + this.deliveryCost + ", description=" + this.description + ", name=" + this.name + ')';
    }

    public final boolean e() {
        if (c() && d()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ DeliveryMode(String str, nk.b bVar, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i10 & 4) != 0 ? null : str2, (i10 & 8) == 0 ? str3 : null);
    }
}
