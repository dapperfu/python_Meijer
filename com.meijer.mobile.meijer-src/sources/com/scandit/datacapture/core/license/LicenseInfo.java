package com.scandit.datacapture.core.license;

import com.scandit.datacapture.core.internal.sdk.capture.NativeExpirationDateStatus;
import com.scandit.datacapture.core.internal.sdk.capture.NativeLicenseInfo;
import com.scandit.datacapture.core.license.Expiration;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/license/LicenseInfo;", "", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeLicenseInfo;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/capture/NativeLicenseInfo;)V", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/core/license/Expiration;", "b", "Lcom/scandit/datacapture/core/license/Expiration;", "getExpiration", "()Lcom/scandit/datacapture/core/license/Expiration;", "expiration", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class LicenseInfo {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLicenseInfo f126793a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Expiration expiration;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeExpirationDateStatus.values().length];
            try {
                iArr[NativeExpirationDateStatus.PERPETUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeExpirationDateStatus.AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LicenseInfo(NativeLicenseInfo impl) {
        Intrinsics.j(impl, "impl");
        this.f126793a = impl;
        NativeExpirationDateStatus expirationDateStatus = impl.getExpirationDateStatus();
        int i10 = expirationDateStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[expirationDateStatus.ordinal()];
        this.expiration = i10 != 1 ? i10 != 2 ? Expiration.NotAvailable.INSTANCE : new Expiration.Available(new Date(impl.getExpirationDate().secondsSinceEpochUInt64() * 1000)) : Expiration.Perpetual.INSTANCE;
    }

    public final Expiration getExpiration() {
        return this.expiration;
    }

    public final String toJson() {
        String json = this.f126793a.toJson();
        Intrinsics.i(json, "toJson(...)");
        return json;
    }
}
