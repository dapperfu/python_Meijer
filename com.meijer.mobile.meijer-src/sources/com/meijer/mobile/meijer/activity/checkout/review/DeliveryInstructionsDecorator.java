package com.meijer.mobile.meijer.activity.checkout.review;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/M1;", "", "", "instructions", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.M1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class DeliveryInstructionsDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String instructions;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryInstructionsDecorator) && Intrinsics.e(this.instructions, ((DeliveryInstructionsDecorator) other).instructions);
    }

    public int hashCode() {
        String str = this.instructions;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "DeliveryInstructionsDecorator(instructions=" + this.instructions + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    public DeliveryInstructionsDecorator(String str) {
        this.instructions = str;
    }
}
