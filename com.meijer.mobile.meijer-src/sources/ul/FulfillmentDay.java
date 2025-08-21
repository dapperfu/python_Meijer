package ul;

import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jj.FulfillmentSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lul/c;", "", "j$/time/LocalDate", "date", "", "Ljj/c;", "fulfillmentSlots", "<init>", "(Lj$/time/LocalDate;Ljava/util/List;)V", "a", "(Lj$/time/LocalDate;Ljava/util/List;)Lul/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/LocalDate;", "c", "()Lj$/time/LocalDate;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "e", "()Z", "isDayValid", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ul.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentDay {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentSlot> fulfillmentSlots;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentDay)) {
            return false;
        }
        FulfillmentDay fulfillmentDay = (FulfillmentDay) other;
        return Intrinsics.e(this.date, fulfillmentDay.date) && Intrinsics.e(this.fulfillmentSlots, fulfillmentDay.fulfillmentSlots);
    }

    public FulfillmentDay(LocalDate date, List<FulfillmentSlot> fulfillmentSlots) {
        Intrinsics.j(date, "date");
        Intrinsics.j(fulfillmentSlots, "fulfillmentSlots");
        this.date = date;
        this.fulfillmentSlots = fulfillmentSlots;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FulfillmentDay b(FulfillmentDay fulfillmentDay, LocalDate localDate, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = fulfillmentDay.date;
        }
        if ((i10 & 2) != 0) {
            list = fulfillmentDay.fulfillmentSlots;
        }
        return fulfillmentDay.a(localDate, list);
    }

    public final FulfillmentDay a(LocalDate date, List<FulfillmentSlot> fulfillmentSlots) {
        Intrinsics.j(date, "date");
        Intrinsics.j(fulfillmentSlots, "fulfillmentSlots");
        return new FulfillmentDay(date, fulfillmentSlots);
    }

    /* renamed from: c, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final List<FulfillmentSlot> d() {
        return this.fulfillmentSlots;
    }

    public final boolean e() {
        List<FulfillmentSlot> list = this.fulfillmentSlots;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FulfillmentSlot) obj).s()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return arrayList != null;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.fulfillmentSlots.hashCode();
    }

    public String toString() {
        return "FulfillmentDay(date=" + this.date + ", fulfillmentSlots=" + this.fulfillmentSlots + ')';
    }
}
