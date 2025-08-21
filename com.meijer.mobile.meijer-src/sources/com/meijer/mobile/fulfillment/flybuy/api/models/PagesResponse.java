package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "", "", "current", "count", "per", "<init>", "(III)V", "copy", "(III)Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PagesResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int current;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int count;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int per;

    public PagesResponse() {
        this(0, 0, 0, 7, null);
    }

    public final PagesResponse copy(@g(name = "current") int current, @g(name = "count") int count, @g(name = "per") int per) {
        return new PagesResponse(current, count, per);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PagesResponse)) {
            return false;
        }
        PagesResponse pagesResponse = (PagesResponse) other;
        return this.current == pagesResponse.current && this.count == pagesResponse.count && this.per == pagesResponse.per;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.current) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.per);
    }

    public String toString() {
        return "PagesResponse(current=" + this.current + ", count=" + this.count + ", per=" + this.per + ')';
    }

    public PagesResponse(@g(name = "current") int i10, @g(name = "count") int i11, @g(name = "per") int i12) {
        this.current = i10;
        this.count = i11;
        this.per = i12;
    }

    /* renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: b, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* renamed from: c, reason: from getter */
    public final int getPer() {
        return this.per;
    }

    public /* synthetic */ PagesResponse(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
