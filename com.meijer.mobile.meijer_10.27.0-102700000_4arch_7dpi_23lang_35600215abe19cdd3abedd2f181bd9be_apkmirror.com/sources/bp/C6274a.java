package bp;

import Du.ConstructorIoConfig;
import Du.v;
import android.content.Context;
import cp.InterfaceC13412a;
import io.constructor.BuildConfig;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbp/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "constructorIoKey", "LDu/v;", "b", "(Landroid/content/Context;Ljava/lang/String;)LDu/v;", "LZo/a;", "dataSource", "Lcp/a;", "a", "(LZo/a;)Lcp/a;", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C6274a {

    /* renamed from: a, reason: collision with root package name */
    public static final C6274a f60608a = new C6274a();

    public final InterfaceC13412a a(Zo.a dataSource) {
        Intrinsics.j(dataSource, "dataSource");
        return dataSource;
    }

    public final v b(Context context, String constructorIoKey) {
        Intrinsics.j(context, "context");
        Intrinsics.j(constructorIoKey, "constructorIoKey");
        v vVar = v.f7377a;
        vVar.H(context, new ConstructorIoConfig(constructorIoKey, null, null, null, null, MapsKt.o(TuplesKt.a("Search Suggestions", 8), TuplesKt.a(BuildConfig.DEFAULT_ITEM_SECTION, 0)), null, 0, null, null, 990, null));
        return vVar;
    }

    private C6274a() {
    }
}
