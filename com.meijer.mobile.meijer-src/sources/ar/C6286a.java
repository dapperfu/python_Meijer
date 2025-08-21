package ar;

import com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiError;
import com.meijer.mobile.storeinfo.api.model.errors.StoreInfoApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiError;", "", "cause", "Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiException;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiError;Ljava/lang/Throwable;)Lcom/meijer/mobile/storeinfo/api/model/errors/StoreInfoApiException;", "storeinfo_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ar.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6286a {
    public static final StoreInfoApiException a(StoreInfoApiError storeInfoApiError, Throwable th2) {
        Intrinsics.j(storeInfoApiError, "<this>");
        return new StoreInfoApiException(storeInfoApiError, th2);
    }
}
