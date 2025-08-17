package mk;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lmk/i;", "Landroid/os/Parcelable;", "", "quantity", "A2", "(D)Lmk/i;", "X1", "other", "", "w1", "(Lmk/i;)I", "Lmk/f;", "m", "()Lmk/f;", "product", "getQuantity", "()D", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "h2", "()Ljava/lang/String;", "productCode", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface i extends Parcelable {
    double getQuantity();

    f m();

    default int w1(i other) {
        Intrinsics.j(other, "other");
        return Double.compare(getQuantity(), other.getQuantity());
    }

    default i A2(double quantity) {
        return k.c(m(), quantity);
    }

    default i X1(double quantity) {
        return A2(getQuantity() + quantity);
    }

    default String h2() {
        return m().getCode();
    }
}
