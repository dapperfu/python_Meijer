package com.meijer.mobile.meijer.activity.checkout.review;

import com.medallia.digital.mobilesdk.l3;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import vk.C17590a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001\u0016B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u001f\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b\u001f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "", "", "date", "time", "", "error", "", "isLoading", "Lcom/meijer/mobile/core/model/common/ResourceId;", "slotId", "dateForAdobeTag", "timeForAdobeTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Z", "()Z", "e", "getSlotId", "f", "g", "h", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.R1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class FulfillmentSlotInfoDecorator {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String time;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String slotId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateForAdobeTag;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timeForAdobeTag;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/R1$a;", "", "<init>", "()V", "LHk/b;", "Lij/c;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "b", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/R1;", "j$/time/LocalDate", "date", "", "a", "(Lj$/time/LocalDate;)Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.R1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(LocalDate date) {
            Intrinsics.j(date, "date");
            String strQ = date.format(C17590a.f164803a.n());
            Intrinsics.g(strQ);
            String str = ((String[]) StringsKt.a1(strQ, new String[]{","}, false, 0, 6, null).toArray(new String[0]))[0];
            if (date.atStartOfDay().isEqual(LocalDate.now().atStartOfDay())) {
                Intrinsics.g(strQ);
                strQ = StringsKt.Q(strQ, str, "Today", false, 4, null);
            }
            Intrinsics.g(strQ);
            return strQ;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.meijer.mobile.meijer.activity.checkout.review.FulfillmentSlotInfoDecorator b(Hk.Validation<ij.FulfillmentSlot> r20) {
            /*
                Method dump skipped, instructions count: 362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.review.FulfillmentSlotInfoDecorator.Companion.b(Hk.b):com.meijer.mobile.meijer.activity.checkout.review.R1");
        }
    }

    public FulfillmentSlotInfoDecorator() {
        this(null, null, null, false, null, null, null, l3.f92485d, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSlotInfoDecorator)) {
            return false;
        }
        FulfillmentSlotInfoDecorator fulfillmentSlotInfoDecorator = (FulfillmentSlotInfoDecorator) other;
        return Intrinsics.e(this.date, fulfillmentSlotInfoDecorator.date) && Intrinsics.e(this.time, fulfillmentSlotInfoDecorator.time) && Intrinsics.e(this.error, fulfillmentSlotInfoDecorator.error) && this.isLoading == fulfillmentSlotInfoDecorator.isLoading && Intrinsics.e(this.slotId, fulfillmentSlotInfoDecorator.slotId) && Intrinsics.e(this.dateForAdobeTag, fulfillmentSlotInfoDecorator.dateForAdobeTag) && Intrinsics.e(this.timeForAdobeTag, fulfillmentSlotInfoDecorator.timeForAdobeTag);
    }

    public int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.error;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        String str3 = this.slotId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateForAdobeTag;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.timeForAdobeTag;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "FulfillmentSlotInfoDecorator(date=" + this.date + ", time=" + this.time + ", error=" + this.error + ", isLoading=" + this.isLoading + ", slotId=" + this.slotId + ", dateForAdobeTag=" + this.dateForAdobeTag + ", timeForAdobeTag=" + this.timeForAdobeTag + ')';
    }

    public FulfillmentSlotInfoDecorator(String str, String str2, Integer num, boolean z10, String str3, String str4, String str5) {
        this.date = str;
        this.time = str2;
        this.error = num;
        this.isLoading = z10;
        this.slotId = str3;
        this.dateForAdobeTag = str4;
        this.timeForAdobeTag = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final String getDateForAdobeTag() {
        return this.dateForAdobeTag;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* renamed from: e, reason: from getter */
    public final String getTimeForAdobeTag() {
        return this.timeForAdobeTag;
    }

    public /* synthetic */ FulfillmentSlotInfoDecorator(String str, String str2, Integer num, boolean z10, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5);
    }
}
