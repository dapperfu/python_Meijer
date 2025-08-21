package Jn;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LJn/j;", "", "", "is24Hours", "", "LJn/a;", "hours", "<init>", "(ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Jn.j, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class StoreHoursPresenter {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean is24Hours;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DailySchedule> hours;

    /* JADX WARN: Multi-variable type inference failed */
    public StoreHoursPresenter() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreHoursPresenter)) {
            return false;
        }
        StoreHoursPresenter storeHoursPresenter = (StoreHoursPresenter) other;
        return this.is24Hours == storeHoursPresenter.is24Hours && Intrinsics.e(this.hours, storeHoursPresenter.hours);
    }

    public StoreHoursPresenter(boolean z10, List<DailySchedule> hours) {
        Intrinsics.j(hours, "hours");
        this.is24Hours = z10;
        this.hours = hours;
    }

    public final List<DailySchedule> a() {
        return this.hours;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.is24Hours) * 31) + this.hours.hashCode();
    }

    public String toString() {
        return "StoreHoursPresenter(is24Hours=" + this.is24Hours + ", hours=" + this.hours + ')';
    }

    public /* synthetic */ StoreHoursPresenter(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? CollectionsKt.m() : list);
    }
}
