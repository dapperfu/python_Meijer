package gi;

import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14480g;
import hi.InterfaceC14474a;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0017\u0010\u0012J0\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u0012J0\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH&¢\u0006\u0004\b\u001b\u0010\u000fJ0\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\b\fH&¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"Lgi/a;", "", "Lhi/h;", "event", "", "Lhi/i;", "extraData", "", "b", "(Lhi/h;[Lhi/i;)V", "Lkotlin/Function1;", "Lhi/f;", "Lkotlin/ExtensionFunctionType;", "dataBuilder", "h", "(Lhi/h;Lkotlin/jvm/functions/Function1;)V", "trackingData", "e", "(Lhi/f;)V", "Lhi/a;", "trackable", "a", "(Lhi/a;)V", "d", "c", "g", "builder", "i", "f", "j", "(Lhi/h;)V", "", "timeFormat", "k", "(Ljava/lang/String;)V", "engine_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gi.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC14261a {
    void d(TrackingData trackingData);

    void f(AbstractC14481h event, Function1<? super TrackingData, Unit> builder);

    void g(TrackingData trackingData);

    void i(AbstractC14481h event, Function1<? super TrackingData, Unit> builder);

    void j(AbstractC14481h event);

    void k(String timeFormat);

    default void a(InterfaceC14474a trackable) {
        Intrinsics.j(trackable, "trackable");
        TrackingData c14479fA = trackable.a();
        if (c14479fA != null) {
            d(c14479fA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    default void b(AbstractC14481h event, AbstractC14482i... extraData) {
        Intrinsics.j(event, "event");
        Intrinsics.j(extraData, "extraData");
        d(new TrackingData(event, null, 2, 0 == true ? 1 : 0).d(ArraysKt.c0(extraData)));
    }

    default void c(AbstractC14481h event, Function1<? super TrackingData, Unit> dataBuilder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(dataBuilder, "dataBuilder");
        g(C14480g.a(event, dataBuilder));
    }

    default void e(TrackingData trackingData) {
        if (trackingData != null) {
            d(trackingData);
        }
    }

    default void h(AbstractC14481h event, Function1<? super TrackingData, Unit> dataBuilder) {
        Intrinsics.j(event, "event");
        Intrinsics.j(dataBuilder, "dataBuilder");
        d(C14480g.a(event, dataBuilder));
    }
}
