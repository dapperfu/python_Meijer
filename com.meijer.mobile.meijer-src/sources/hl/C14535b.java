package hl;

import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lhl/b;", "", "<init>", "()V", "", "saveAddress", "", "serviceTier", "Lii/f;", "c", "(ZLjava/lang/String;)Lii/f;", "b", "()Lii/f;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hl.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14535b {

    /* renamed from: a, reason: collision with root package name */
    public static final C14535b f135840a = new C14535b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(boolean z10, String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("saveAddress", String.valueOf(z10));
        if (str != null) {
            TrackingData.h("serviceTier", str);
        }
        return Unit.f143329a;
    }

    public final TrackingData b() {
        return new TrackingData(C14756c.a("Add new address canceled"), null, 2, null);
    }

    public final TrackingData c(final boolean saveAddress, final String serviceTier) {
        return C14760g.a(C14756c.a("Add new address success"), new Function1() { // from class: hl.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14535b.d(saveAddress, serviceTier, (TrackingData) obj);
            }
        });
    }

    private C14535b() {
    }
}
