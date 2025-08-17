package com.meijer.mobile.shopandscan.domain.model.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/shopandscan/domain/model/exception/ShopAndScanUserBlockedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "deviceId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShopAndScanUserBlockedException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Blocked User Device ID: " + this.deviceId;
    }

    public ShopAndScanUserBlockedException(String str) {
        this.deviceId = str;
    }
}
