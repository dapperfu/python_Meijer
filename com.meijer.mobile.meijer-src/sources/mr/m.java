package mr;

import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kr.C15407a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lmr/m;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "", "c", "()Ljava/util/List;", "a", "b", "Landroid/content/Context;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    public m(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
    }

    public final List<String> a() throws Resources.NotFoundException {
        String[] stringArray = this.context.getResources().getStringArray(C15407a.f148719a);
        Intrinsics.i(stringArray, "getStringArray(...)");
        return ArraysKt.h1(stringArray);
    }

    public final List<String> b() throws Resources.NotFoundException {
        String[] stringArray = this.context.getResources().getStringArray(C15407a.f148720b);
        Intrinsics.i(stringArray, "getStringArray(...)");
        return ArraysKt.h1(stringArray);
    }

    public final List<String> c() throws Resources.NotFoundException {
        String[] stringArray = this.context.getResources().getStringArray(C15407a.f148721c);
        Intrinsics.i(stringArray, "getStringArray(...)");
        return ArraysKt.h1(stringArray);
    }
}
