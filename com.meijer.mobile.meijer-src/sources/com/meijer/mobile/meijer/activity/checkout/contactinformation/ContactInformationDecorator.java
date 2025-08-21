package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Ik.Validation;
import com.meijer.mobile.meijer.Y;
import gj.ContactInformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "", "", "emailAddress", "phoneNumber", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ContactInformationDecorator {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a$a;", "", "<init>", "()V", "LIk/b;", "Lgj/a;", "contactInformation", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "a", "(LIk/b;)Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContactInformationDecorator a(Validation<ContactInformation> contactInformation) {
            Intrinsics.j(contactInformation, "contactInformation");
            ContactInformation contactInformationE = contactInformation.e();
            Integer num = null;
            String emailAddress = contactInformationE != null ? contactInformationE.getEmailAddress() : null;
            ContactInformation contactInformationE2 = contactInformation.e();
            String phoneNumber = contactInformationE2 != null ? contactInformationE2.getPhoneNumber() : null;
            Integer numValueOf = Integer.valueOf(Y.f100650Ra);
            List<Ik.c> listC = contactInformation.c();
            if (listC != null && !listC.isEmpty()) {
                num = numValueOf;
            }
            return new ContactInformationDecorator(emailAddress, phoneNumber, num);
        }
    }

    public ContactInformationDecorator() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInformationDecorator)) {
            return false;
        }
        ContactInformationDecorator contactInformationDecorator = (ContactInformationDecorator) other;
        return Intrinsics.e(this.emailAddress, contactInformationDecorator.emailAddress) && Intrinsics.e(this.phoneNumber, contactInformationDecorator.phoneNumber) && Intrinsics.e(this.error, contactInformationDecorator.error);
    }

    public int hashCode() {
        String str = this.emailAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.error;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ContactInformationDecorator(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ", error=" + this.error + ')';
    }

    public ContactInformationDecorator(String str, String str2, Integer num) {
        this.emailAddress = str;
        this.phoneNumber = str2;
        this.error = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public /* synthetic */ ContactInformationDecorator(String str, String str2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num);
    }
}
