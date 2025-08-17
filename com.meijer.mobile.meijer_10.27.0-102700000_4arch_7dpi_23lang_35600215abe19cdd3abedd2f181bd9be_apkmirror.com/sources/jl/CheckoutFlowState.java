package jl;

import ej.DeliveryMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jl.e;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0012B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Ljl/f;", "", "", "horizontalPaddingInDp", "", "Ljl/e;", "steps", "<init>", "(ILjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "c", "stepLabels", "d", "currentStep", "e", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: jl.f, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckoutFlowState {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int horizontalPaddingInDp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<e> steps;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepLabels;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int currentStep;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljl/f$a;", "", "<init>", "()V", "Ljl/v;", "checkoutState", "Ljl/f;", "a", "(Ljl/v;)Ljl/f;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jl.f$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CheckoutFlowState a(CheckoutState checkoutState) {
            Intrinsics.j(checkoutState, "checkoutState");
            DeliveryMode deliveryModeE = checkoutState.m().e();
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i10 = 1;
            int i11 = 0;
            return Intrinsics.e(deliveryModeE != null ? deliveryModeE.getCode() : null, "pickup") ? new CheckoutFlowState(i11, CollectionsKt.p(new e.DayAndTime("Day & Time", checkoutState.x().getIsValid()), new e.PickupPerson("Pickup Person", checkoutState.u().getIsValid()), new e.Payment("Payment", checkoutState.t().getIsValid()), new e.ReviewOrder("Review Order", false)), i10, defaultConstructorMarker) : new CheckoutFlowState(i11, CollectionsKt.p(new e.DayAndTime("Day & Time", checkoutState.x().getIsValid()), new e.ContactInfo("Contact Info.", checkoutState.j().getIsValid()), new e.Payment("Payment", checkoutState.t().getIsValid()), new e.ReviewOrder("Review Order", false)), i10, defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutFlowState() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutFlowState)) {
            return false;
        }
        CheckoutFlowState checkoutFlowState = (CheckoutFlowState) other;
        return this.horizontalPaddingInDp == checkoutFlowState.horizontalPaddingInDp && Intrinsics.e(this.steps, checkoutFlowState.steps);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutFlowState(int i10, List<? extends e> steps) {
        Intrinsics.j(steps, "steps");
        this.horizontalPaddingInDp = i10;
        this.steps = steps;
        List<? extends e> list = steps;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).getStepLabel());
        }
        this.stepLabels = arrayList;
        List<e> list2 = this.steps;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(((e) it2.next()).getCompleted()));
        }
        Iterator it3 = arrayList2.iterator();
        int i11 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i11 = -1;
                break;
            } else if (!((Boolean) it3.next()).booleanValue()) {
                break;
            } else {
                i11++;
            }
        }
        this.currentStep = i11;
    }

    /* renamed from: a, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* renamed from: b, reason: from getter */
    public final int getHorizontalPaddingInDp() {
        return this.horizontalPaddingInDp;
    }

    public final List<String> c() {
        return this.stepLabels;
    }

    public int hashCode() {
        return (Integer.hashCode(this.horizontalPaddingInDp) * 31) + this.steps.hashCode();
    }

    public String toString() {
        return "CheckoutFlowState(horizontalPaddingInDp=" + this.horizontalPaddingInDp + ", steps=" + this.steps + ')';
    }

    public /* synthetic */ CheckoutFlowState(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 40 : i10, (i11 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
