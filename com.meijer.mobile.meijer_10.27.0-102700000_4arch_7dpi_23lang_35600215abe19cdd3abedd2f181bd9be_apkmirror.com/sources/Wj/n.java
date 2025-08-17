package Wj;

import com.meijer.mobile.core.design.widget.stepperview.a;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"LWj/n;", "", "LWj/u;", "viewVisibilityState", "", "setViewVisibility", "(LWj/u;)V", "f", "()V", "c", "i", "h", "a", "", "getQuantityText", "()Ljava/lang/String;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "getControlState", "()Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "LWj/t;", "getValueState", "()LWj/t;", "setValueState", "(LWj/t;)V", "valueState", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface n {
    com.meijer.mobile.core.design.widget.stepperview.a getControlState();

    ValueState getValueState();

    void setValueState(ValueState valueState);

    void setViewVisibility(ViewVisibilityState viewVisibilityState);

    default void a() {
        ValueState valueState = getControlState().getValueState();
        setValueState(ValueState.b(valueState, 0.0d, valueState.getQuantity() - valueState.getStepperValue(), false, null, false, 0.0d, 61, null));
    }

    default void c() {
        ValueState valueState = getControlState().getValueState();
        setValueState(ValueState.b(valueState, 0.0d, valueState.getStepperValue(), false, null, false, 0.0d, 61, null));
    }

    default void f() {
        ViewVisibilityState viewVisibilityState;
        boolean z10;
        com.meijer.mobile.core.design.widget.stepperview.a controlState = getControlState();
        if (controlState instanceof a.Loading) {
            viewVisibilityState = new ViewVisibilityState(true, false, false, false, false, false, false, 126, null);
        } else if (controlState instanceof a.SingleQuantity) {
            viewVisibilityState = new ViewVisibilityState(false, false, true, true, false, false, false, 115, null);
        } else if (controlState instanceof a.MultipleQuantity) {
            viewVisibilityState = new ViewVisibilityState(false, false, true, false, true, false, false, 107, null);
        } else if (controlState instanceof a.NotAdded) {
            viewVisibilityState = new ViewVisibilityState(false, true, false, false, false, false, false, 125, null);
        } else if (controlState instanceof a.ShowQuantity) {
            viewVisibilityState = new ViewVisibilityState(false, false, false, false, false, true, false, 95, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (getValueState().getQuantity() < getValueState().getMaxQuantityAllowed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        setViewVisibility(ViewVisibilityState.b(viewVisibilityState, false, false, false, false, false, false, z10, 63, null));
    }

    default String getQuantityText() {
        if (getControlState().getValueState().getStepperValue() % 1 == 0.0d) {
            String str = new DecimalFormat("#").format(getControlState().getValueState().getQuantity());
            Intrinsics.g(str);
            return str;
        }
        return String.valueOf(getControlState().getValueState().getQuantity());
    }

    default void h() {
        ValueState valueState = getControlState().getValueState();
        setValueState(ValueState.b(valueState, 0.0d, valueState.getStepperValue() + valueState.getQuantity(), false, null, false, 0.0d, 61, null));
    }

    default void i() {
        setValueState(ValueState.b(getControlState().getValueState(), 0.0d, 0.0d, false, null, false, 0.0d, 61, null));
    }
}
