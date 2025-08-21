package com.meijer.mobile.shopandscan.data.model.error;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/shopandscan/data/model/error/ShopAndScanItemException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMessage", "b", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanItemException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable error;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanItemException)) {
            return false;
        }
        ShopAndScanItemException shopAndScanItemException = (ShopAndScanItemException) other;
        return Intrinsics.e(this.message, shopAndScanItemException.message) && Intrinsics.e(this.error, shopAndScanItemException.error);
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Throwable th2 = this.error;
        return iHashCode + (th2 != null ? th2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ShopAndScanItemException(message=" + this.message + ", error=" + this.error + ')';
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public ShopAndScanItemException(String str, Throwable th2) {
        this.message = str;
        this.error = th2;
    }
}
