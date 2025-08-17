package com.meijer.mobile.meijer.activity.checkout.review;

import Hk.Validation;
import ak.AbstractC5607a;
import gk.EbtPaymentOption;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "", "", PreferencesHelper.PREF_ID, "Lak/a;", "description", "<init>", "(Ljava/lang/String;Lak/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lak/a;", "()Lak/a;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.O1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class EbtCardDetailsDecorator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f104583d = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/O1$a;", "", "<init>", "()V", "LHk/b;", "Lgk/d;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "a", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/O1;", "", "EBT_NAME", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.O1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final EbtCardDetailsDecorator a(Validation<EbtPaymentOption> validation) {
            Intrinsics.j(validation, "validation");
            EbtPaymentOption ebtPaymentOptionE = validation.e();
            String str = null;
            Object[] objArr = 0;
            if (ebtPaymentOptionE != null) {
                return new EbtCardDetailsDecorator(str, AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99840U5, "EBT", StringsKt.K1(ebtPaymentOptionE.getMeijerMaskedAccountNumber(), 4)), 1, objArr == true ? 1 : 0);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EbtCardDetailsDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtCardDetailsDecorator)) {
            return false;
        }
        EbtCardDetailsDecorator ebtCardDetailsDecorator = (EbtCardDetailsDecorator) other;
        return Intrinsics.e(this.id, ebtCardDetailsDecorator.id) && Intrinsics.e(this.description, ebtCardDetailsDecorator.description);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.description;
        return iHashCode + (abstractC5607a != null ? abstractC5607a.hashCode() : 0);
    }

    public String toString() {
        return "EbtCardDetailsDecorator(id=" + this.id + ", description=" + this.description + ')';
    }

    public EbtCardDetailsDecorator(String str, AbstractC5607a abstractC5607a) {
        this.id = str;
        this.description = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    public /* synthetic */ EbtCardDetailsDecorator(String str, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : abstractC5607a);
    }
}
