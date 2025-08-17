package l4;

import android.content.Context;
import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll4/b;", "", "<init>", "()V", "T", "Landroid/content/Context;", "context", "", "tag", "Lkotlin/Function1;", "manager", "a", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15364b {

    /* renamed from: a, reason: collision with root package name */
    public static final C15364b f148507a = new C15364b();

    public final <T> T a(Context context, String tag, Function1<? super Context, ? extends T> manager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(tag, "tag");
        Intrinsics.j(manager, "manager");
        try {
            return manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            FS.log_d(tag, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + C15363a.f148504a.b());
            return null;
        }
    }

    private C15364b() {
    }
}
