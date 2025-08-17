package Ok;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"LOk/c;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "Z0", "()J", "offerId", "D1", "sourceId", "H", "couponId", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface c extends Parcelable {
    /* renamed from: Z0 */
    long getOfferId();

    default long D1() {
        Long lX = StringsKt.x(StringsKt.J1(String.valueOf(getOfferId()), 2));
        if (lX != null) {
            return lX.longValue();
        }
        return 0L;
    }

    default long H() {
        Long lX = StringsKt.x(StringsKt.E1(String.valueOf(getOfferId()), 2));
        if (lX != null) {
            return lX.longValue();
        }
        return 0L;
    }
}
