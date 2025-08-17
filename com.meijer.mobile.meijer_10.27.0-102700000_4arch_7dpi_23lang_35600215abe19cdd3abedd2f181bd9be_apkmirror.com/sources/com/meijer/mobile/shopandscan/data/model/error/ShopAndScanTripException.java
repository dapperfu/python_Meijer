package com.meijer.mobile.shopandscan.data.model.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanTripException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "message", "", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "error", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanTripException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable error;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanTripException)) {
            return false;
        }
        ShopAndScanTripException shopAndScanTripException = (ShopAndScanTripException) other;
        return Intrinsics.e(this.message, shopAndScanTripException.message) && Intrinsics.e(this.error, shopAndScanTripException.error);
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th2 = this.error;
        return iHashCode + (th2 != null ? th2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ShopAndScanTripException(message=" + this.message + ", error=" + this.error + ')';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
