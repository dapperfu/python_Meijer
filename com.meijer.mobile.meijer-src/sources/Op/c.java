package Op;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"", "", "b", "(I)Ljava/lang/String;", "barcodeFormatName", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(int i10) {
        if (i10 == 1) {
            return "Code 128";
        }
        if (i10 == 2) {
            return "Code 39";
        }
        switch (i10) {
            case 4:
                return "Code 93";
            case 8:
                return "CodeBar";
            case 16:
                return "DataMatrix";
            case l3.f93325e /* 32 */:
                return "EAN 13";
            case 64:
                return "EAN 8";
            case 128:
                return "ITF";
            case 256:
                return "QR Code";
            case 512:
                return "UPC A";
            case 1024:
                return "UPC E";
            case RecyclerView.m.FLAG_MOVED /* 2048 */:
                return "PDF417";
            case RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT /* 4096 */:
                return "Aztec";
            default:
                return "Unknown Format";
        }
    }
}
