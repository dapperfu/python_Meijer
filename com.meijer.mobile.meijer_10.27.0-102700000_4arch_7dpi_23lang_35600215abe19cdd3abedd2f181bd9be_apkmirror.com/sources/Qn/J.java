package Qn;

import Gl.FlyBuyOrderDetail;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import uw.a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "sdkError", "LQn/K;", "flyBuyState", "LGl/b$c;", "flyBuyData", "", "a", "(Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;LQn/K;LGl/b$c;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResponseEventType.values().length];
            try {
                iArr[ResponseEventType.NO_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResponseEventType.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(SdkError sdkError, FlyBuyState flyBuyState, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder) {
        String strC;
        Intrinsics.j(flyBuyState, "flyBuyState");
        if (flyBuyOrder == null || (strC = I.f30906i.b(flyBuyOrder)) == null) {
            strC = I.f30906i.c(flyBuyState);
        }
        ResponseEventType type = sdkError != null ? sdkError.getType() : null;
        int i10 = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            uw.a.INSTANCE.d("FlyBuy SDK Error: No Connection: " + sdkError.getType() + ": ErrorCode: " + sdkError.getCode() + " -> " + sdkError.userError() + ": " + strC, new Object[0]);
            return;
        }
        if (i10 != 2) {
            a.Companion companion = uw.a.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FlyBuy SDK Error: ");
            sb2.append(sdkError != null ? sdkError.getType() : null);
            sb2.append(" -> ");
            sb2.append(sdkError != null ? sdkError.userError() : null);
            sb2.append(": : ErrorCode: ");
            sb2.append(sdkError != null ? Integer.valueOf(sdkError.getCode()) : null);
            sb2.append(" :");
            sb2.append(strC);
            companion.d(sb2.toString(), new Object[0]);
            return;
        }
        if (sdkError.getCode() == 425) {
            uw.a.INSTANCE.d("FlyBuy SDK Error: Upgrade your app!: " + sdkError.getType() + ": ErrorCode: " + sdkError.getCode() + " -> " + sdkError.userError() + ": " + strC, new Object[0]);
            return;
        }
        uw.a.INSTANCE.d("FlyBuy SDK Error: " + sdkError.getType() + " -> " + sdkError.userError() + ": : ErrorCode: " + sdkError.getCode() + ": " + strC, new Object[0]);
    }

    public static /* synthetic */ void b(SdkError sdkError, FlyBuyState flyBuyState, FlyBuyOrderDetail.FlyBuyOrder flyBuyOrder, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            flyBuyOrder = null;
        }
        a(sdkError, flyBuyState, flyBuyOrder);
    }
}
