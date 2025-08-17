package hi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhi/h;", "event", "Lkotlin/Function1;", "Lhi/f;", "", "Lkotlin/ExtensionFunctionType;", "builder", "a", "(Lhi/h;Lkotlin/jvm/functions/Function1;)Lhi/f;", "model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hi.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14480g {
    public static final TrackingData a(AbstractC14481h event, Function1<? super TrackingData, Unit> builder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(builder, "builder");
        TrackingData trackingData = new TrackingData(event, null, 2, null);
        builder.invoke(trackingData);
        return trackingData;
    }
}
