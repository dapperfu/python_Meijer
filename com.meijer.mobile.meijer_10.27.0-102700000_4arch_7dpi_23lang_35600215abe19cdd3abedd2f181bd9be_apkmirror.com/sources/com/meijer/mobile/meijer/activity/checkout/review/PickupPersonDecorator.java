package com.meijer.mobile.meijer.activity.checkout.review;

import Hk.Validation;
import fj.PickupPerson;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "", "", "name", "email", "phone", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.U1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class PickupPersonDecorator {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/U1$a;", "", "<init>", "()V", "LHk/b;", "Lfj/b;", "person", "Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "a", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/U1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.U1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PickupPersonDecorator a(Validation<PickupPerson> person) {
            Intrinsics.j(person, "person");
            PickupPerson pickupPersonE = person.e();
            String strB0 = pickupPersonE != null ? CollectionsKt.B0(CollectionsKt.p(pickupPersonE.getFirstName(), pickupPersonE.getLastName()), " ", null, null, 0, null, null, 62, null) : null;
            PickupPerson pickupPersonE2 = person.e();
            String email = pickupPersonE2 != null ? pickupPersonE2.getEmail() : null;
            Fk.a aVar = Fk.a.f10894a;
            PickupPerson pickupPersonE3 = person.e();
            return new PickupPersonDecorator(strB0, email, aVar.a(pickupPersonE3 != null ? pickupPersonE3.getPhoneNumber() : null), person.getResult().a().isEmpty() ? null : Integer.valueOf(com.meijer.mobile.meijer.Y.f99769Qa));
        }
    }

    public PickupPersonDecorator() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PickupPersonDecorator)) {
            return false;
        }
        PickupPersonDecorator pickupPersonDecorator = (PickupPersonDecorator) other;
        return Intrinsics.e(this.name, pickupPersonDecorator.name) && Intrinsics.e(this.email, pickupPersonDecorator.email) && Intrinsics.e(this.phone, pickupPersonDecorator.phone) && Intrinsics.e(this.error, pickupPersonDecorator.error);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.email;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.error;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PickupPersonDecorator(name=" + this.name + ", email=" + this.email + ", phone=" + this.phone + ", error=" + this.error + ')';
    }

    public PickupPersonDecorator(String str, String str2, String str3, Integer num) {
        this.name = str;
        this.email = str2;
        this.phone = str3;
        this.error = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public /* synthetic */ PickupPersonDecorator(String str, String str2, String str3, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : num);
    }
}
