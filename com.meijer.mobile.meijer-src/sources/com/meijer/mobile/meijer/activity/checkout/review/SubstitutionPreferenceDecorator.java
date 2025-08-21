package com.meijer.mobile.meijer.activity.checkout.review;

import Ik.Validation;
import fj.SubstitutePreference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "", "", "name", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Y1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class SubstitutionPreferenceDecorator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Y1$a;", "", "<init>", "()V", "LIk/b;", "Lfj/D;", "validation", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "a", "(LIk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Y1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SubstitutionPreferenceDecorator a(Validation<SubstitutePreference> validation) {
            Intrinsics.j(validation, "validation");
            SubstitutePreference substitutePreferenceE = validation.e();
            String name = substitutePreferenceE != null ? substitutePreferenceE.getName() : null;
            SubstitutePreference substitutePreferenceE2 = validation.e();
            return new SubstitutionPreferenceDecorator(name, substitutePreferenceE2 != null ? substitutePreferenceE2.getName() : null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubstitutionPreferenceDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubstitutionPreferenceDecorator)) {
            return false;
        }
        SubstitutionPreferenceDecorator substitutionPreferenceDecorator = (SubstitutionPreferenceDecorator) other;
        return Intrinsics.e(this.name, substitutionPreferenceDecorator.name) && Intrinsics.e(this.description, substitutionPreferenceDecorator.description);
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SubstitutionPreferenceDecorator(name=" + this.name + ", description=" + this.description + ')';
    }

    public SubstitutionPreferenceDecorator(String str, String str2) {
        this.name = str;
        this.description = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ SubstitutionPreferenceDecorator(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
