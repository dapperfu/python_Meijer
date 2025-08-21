package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/Pages;", "", "next", "", "previous", "current", "", "count", "per", "(Ljava/lang/String;Ljava/lang/String;III)V", "getCount", "()I", "getCurrent", "getNext", "()Ljava/lang/String;", "getPer", "getPrevious", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Pages {
    private final int count;
    private final int current;
    private final String next;
    private final int per;
    private final String previous;

    public static /* synthetic */ Pages copy$default(Pages pages, String str, String str2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = pages.next;
        }
        if ((i13 & 2) != 0) {
            str2 = pages.previous;
        }
        if ((i13 & 4) != 0) {
            i10 = pages.current;
        }
        if ((i13 & 8) != 0) {
            i11 = pages.count;
        }
        if ((i13 & 16) != 0) {
            i12 = pages.per;
        }
        int i14 = i12;
        int i15 = i10;
        return pages.copy(str, str2, i15, i11, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrevious() {
        return this.previous;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPer() {
        return this.per;
    }

    public final Pages copy(String next, String previous, int current, int count, int per) {
        return new Pages(next, previous, current, count, per);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pages)) {
            return false;
        }
        Pages pages = (Pages) other;
        return Intrinsics.e(this.next, pages.next) && Intrinsics.e(this.previous, pages.previous) && this.current == pages.current && this.count == pages.count && this.per == pages.per;
    }

    public int hashCode() {
        String str = this.next;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.previous;
        return Integer.hashCode(this.per) + ((Integer.hashCode(this.count) + ((Integer.hashCode(this.current) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Pages(next=" + this.next + ", previous=" + this.previous + ", current=" + this.current + ", count=" + this.count + ", per=" + this.per + ')';
    }

    public final int getCount() {
        return this.count;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final String getNext() {
        return this.next;
    }

    public final int getPer() {
        return this.per;
    }

    public final String getPrevious() {
        return this.previous;
    }

    public Pages(String str, String str2, int i10, int i11, int i12) {
        this.next = str;
        this.previous = str2;
        this.current = i10;
        this.count = i11;
        this.per = i12;
    }
}
