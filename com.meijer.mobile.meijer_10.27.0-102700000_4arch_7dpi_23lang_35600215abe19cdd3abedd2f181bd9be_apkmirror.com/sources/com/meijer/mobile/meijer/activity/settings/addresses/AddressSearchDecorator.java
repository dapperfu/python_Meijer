package com.meijer.mobile.meijer.activity.settings.addresses;

import Dn.AddressPrediction;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "", "Lak/a;", "formattedAddress", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "()Lak/a;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.u, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class AddressSearchDecorator {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f111852c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a formattedAddress;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/u$a;", "", "<init>", "()V", "LDn/A;", "prediction", "Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "a", "(LDn/A;)Lcom/meijer/mobile/meijer/activity/settings/addresses/u;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AddressSearchDecorator a(AddressPrediction prediction) {
            Intrinsics.j(prediction, "prediction");
            return new AddressSearchDecorator(AbstractC5607a.INSTANCE.d(Y.f99955a6, prediction.getPrimaryText(), prediction.getSecondaryText()));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddressSearchDecorator) && Intrinsics.e(this.formattedAddress, ((AddressSearchDecorator) other).formattedAddress);
    }

    public int hashCode() {
        return this.formattedAddress.hashCode();
    }

    public String toString() {
        return "AddressSearchDecorator(formattedAddress=" + this.formattedAddress + ')';
    }

    public AddressSearchDecorator(AbstractC5607a formattedAddress) {
        Intrinsics.j(formattedAddress, "formattedAddress");
        this.formattedAddress = formattedAddress;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getFormattedAddress() {
        return this.formattedAddress;
    }
}
