package com.adobe.marketing.mobile;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adobe/marketing/mobile/k;", "", "", "count", "", "oldestOccurrence", "newestOccurrence", "<init>", "(ILjava/lang/Long;Ljava/lang/Long;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Long;", "c", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.adobe.marketing.mobile.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class EventHistoryResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final int count;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Long oldestOccurrence;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @JvmField
    public final Long newestOccurrence;

    public EventHistoryResult(int i10, Long l10, Long l11) {
        this.count = i10;
        this.oldestOccurrence = l10;
        this.newestOccurrence = l11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventHistoryResult)) {
            return false;
        }
        EventHistoryResult eventHistoryResult = (EventHistoryResult) other;
        return this.count == eventHistoryResult.count && Intrinsics.e(this.oldestOccurrence, eventHistoryResult.oldestOccurrence) && Intrinsics.e(this.newestOccurrence, eventHistoryResult.newestOccurrence);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.count) * 31;
        Long l10 = this.oldestOccurrence;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.newestOccurrence;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "EventHistoryResult(count=" + this.count + ", oldestOccurrence=" + this.oldestOccurrence + ", newestOccurrence=" + this.newestOccurrence + ')';
    }

    public /* synthetic */ EventHistoryResult(int i10, Long l10, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : l10, (i11 & 4) != 0 ? null : l11);
    }
}
