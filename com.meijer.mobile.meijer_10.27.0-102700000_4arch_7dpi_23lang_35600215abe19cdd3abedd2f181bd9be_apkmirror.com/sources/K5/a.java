package K5;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LK5/a;", "", "<init>", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "DATABASE_NAMES", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16299a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<String> DATABASE_NAMES = CollectionsKt.g("ADBMobile3rdPartyDataCache.sqlite", "ADBMobilePIICache.sqlite", "ADBMobileDataCache.sqlite", "ADBMobileTimedActionsCache.sqlite");

    /* renamed from: c, reason: collision with root package name */
    public static final int f16301c = 8;

    public final ArrayList<String> a() {
        return DATABASE_NAMES;
    }

    private a() {
    }
}
