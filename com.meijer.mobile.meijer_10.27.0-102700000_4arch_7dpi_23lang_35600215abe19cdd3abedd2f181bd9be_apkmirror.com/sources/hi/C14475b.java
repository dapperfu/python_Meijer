package hi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhi/a;", "T", "Lkotlin/Function1;", "Lhi/f;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lhi/a;Lkotlin/jvm/functions/Function1;)Lhi/a;", "model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hi.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14475b {
    public static final <T extends InterfaceC14474a> T a(T t10, Function1<? super TrackingData, Unit> block) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(block, "block");
        TrackingData trackingDataA = t10.a();
        if (trackingDataA != null) {
            block.invoke(trackingDataA);
        }
        return t10;
    }
}
