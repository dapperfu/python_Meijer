package com.meijer.mobile.subscription.ux.subscription;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.TimeSlotTimeDecorator;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/J;", "", "<init>", "()V", "a", "b", "Lcom/meijer/mobile/subscription/ux/subscription/J$a;", "Lcom/meijer/mobile/subscription/ux/subscription/J$b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class J {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/J$a;", "Lcom/meijer/mobile/subscription/ux/subscription/J;", "Lbk/a;", "headingText", "<init>", "(Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.J$a, reason: from toString */
    public static final /* data */ class HeaderItem extends J {

        /* renamed from: b, reason: collision with root package name */
        public static final int f119927b = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a headingText;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeaderItem) && Intrinsics.e(this.headingText, ((HeaderItem) other).headingText);
        }

        public int hashCode() {
            return this.headingText.hashCode();
        }

        public String toString() {
            return "HeaderItem(headingText=" + this.headingText + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderItem(AbstractC6392a headingText) {
            super(null);
            Intrinsics.j(headingText, "headingText");
            this.headingText = headingText;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getHeadingText() {
            return this.headingText;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/J$b;", "Lcom/meijer/mobile/subscription/ux/subscription/J;", "Lmr/n;", "slotDecorator", "<init>", "(Lmr/n;)V", "a", "(Lmr/n;)Lcom/meijer/mobile/subscription/ux/subscription/J$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmr/n;", "b", "()Lmr/n;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.J$b, reason: from toString */
    public static final /* data */ class SlotItem extends J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TimeSlotTimeDecorator slotDecorator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SlotItem) && Intrinsics.e(this.slotDecorator, ((SlotItem) other).slotDecorator);
        }

        public int hashCode() {
            return this.slotDecorator.hashCode();
        }

        public String toString() {
            return "SlotItem(slotDecorator=" + this.slotDecorator + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SlotItem(TimeSlotTimeDecorator slotDecorator) {
            super(null);
            Intrinsics.j(slotDecorator, "slotDecorator");
            this.slotDecorator = slotDecorator;
        }

        public final SlotItem a(TimeSlotTimeDecorator slotDecorator) {
            Intrinsics.j(slotDecorator, "slotDecorator");
            return new SlotItem(slotDecorator);
        }

        /* renamed from: b, reason: from getter */
        public final TimeSlotTimeDecorator getSlotDecorator() {
            return this.slotDecorator;
        }
    }

    public /* synthetic */ J(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private J() {
    }
}
