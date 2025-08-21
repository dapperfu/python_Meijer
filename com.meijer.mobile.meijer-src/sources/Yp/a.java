package Yp;

import Xp.a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYp/a;", "", "<init>", "()V", "LXp/a;", "barcode", "a", "(LXp/a;)LXp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {
    public final Xp.a a(Xp.a barcode) {
        Object objB;
        Intrinsics.j(barcode, "barcode");
        qw.a.INSTANCE.z("ShopAndScan").a("Barcode Detected: " + barcode.getData(), new Object[0]);
        if (!(barcode instanceof a.QR)) {
            if (!(barcode instanceof a.UPCE)) {
                return barcode instanceof a.PLU ? ((a.PLU) barcode).d() : barcode;
            }
            a.UPCA upcaB = ((a.UPCE) barcode).b();
            return upcaB != null ? upcaB : barcode;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(((a.QR) barcode).b());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.g(objB)) {
            objB = null;
        }
        return (Xp.a) objB;
    }
}
