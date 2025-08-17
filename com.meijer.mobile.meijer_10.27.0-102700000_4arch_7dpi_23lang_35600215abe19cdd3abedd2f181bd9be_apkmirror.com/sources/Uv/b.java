package Uv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ljava/util/logging/Logger;", "LUv/a;", "task", "LUv/c;", "queue", "", "message", "", "c", "(Ljava/util/logging/Logger;LUv/a;LUv/c;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Logger logger, a aVar, c cVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cVar.h());
        sb2.append(' ');
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(...)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(aVar.getName());
        logger.fine(sb2.toString());
    }

    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.i(str2, "format(...)");
        return str2;
    }
}
