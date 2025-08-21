package Cp;

import com.meijer.mobile.receipt.service.api.models.NextGenReceiptByIdResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import zp.ReceiptIdentifier;
import zp.c;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/meijer/mobile/receipt/service/api/models/NextGenReceiptByIdResponse;", "Lzp/f;", "identifier", "Lzp/c$b;", "a", "(Lcom/meijer/mobile/receipt/service/api/models/NextGenReceiptByIdResponse;Lzp/f;)Lzp/c$b;", "service_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    public static final c.Pdf a(NextGenReceiptByIdResponse nextGenReceiptByIdResponse, ReceiptIdentifier identifier) {
        Intrinsics.j(nextGenReceiptByIdResponse, "<this>");
        Intrinsics.j(identifier, "identifier");
        return new c.Pdf(identifier, nextGenReceiptByIdResponse.getPdfData(), nextGenReceiptByIdResponse.getExtension());
    }
}
