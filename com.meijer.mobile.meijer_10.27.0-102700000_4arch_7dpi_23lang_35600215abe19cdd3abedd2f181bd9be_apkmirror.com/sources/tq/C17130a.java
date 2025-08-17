package tq;

import Tp.g;
import android.content.Context;
import androidx.room.C6136w;
import com.meijer.mobile.shopandscan.data.local.ShopAndScanDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltq/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase;", "a", "(Landroid/content/Context;)Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase;", "database", "LTp/g;", "c", "(Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase;)LTp/g;", "LTp/a;", "b", "(Lcom/meijer/mobile/shopandscan/data/local/ShopAndScanDatabase;)LTp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17130a {
    public final ShopAndScanDatabase a(Context context) {
        Intrinsics.j(context, "context");
        return (ShopAndScanDatabase) C6136w.a(context, ShopAndScanDatabase.class, "shop_and_scan_local_db").f(true).d();
    }

    public final Tp.a b(ShopAndScanDatabase database) {
        Intrinsics.j(database, "database");
        return database.g();
    }

    public final g c(ShopAndScanDatabase database) {
        Intrinsics.j(database, "database");
        return database.h();
    }
}
