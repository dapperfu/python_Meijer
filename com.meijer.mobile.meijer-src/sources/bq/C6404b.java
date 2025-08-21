package bq;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.E0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbq/b;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "permission", "", "hasShownRationale", "Lkotlin/Result;", "Lbq/a;", "b", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6404b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    public C6404b(Context applicationContext) {
        Intrinsics.j(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final Object b(String str, boolean z10, Continuation<? super Result<? extends EnumC6403a>> continuation) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            qw.a.INSTANCE.z("ShopAndScan").k(C6404b.class.getSimpleName() + ".kt:1", new Object[0]);
            boolean z11 = Z1.b.a(this.applicationContext, str) == 0;
            objB = Result.b((z11 || z10) ? (z11 || !z10) ? EnumC6403a.f60486c : EnumC6403a.f60485b : EnumC6403a.f60484a);
        } catch (Exception e10) {
            E0.i(continuation.getContext());
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(e10));
        }
        if (Result.h(objB)) {
            qw.a.INSTANCE.z("ShopAndScan").a(StringsKt.n("\n                    Checking Permission...\n                        Permission: " + str + "\n                        Permission Action: " + ((EnumC6403a) objB) + "\n                "), new Object[0]);
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            qw.a.INSTANCE.z("ShopAndScan").e(thE);
        }
        return objB;
    }
}
