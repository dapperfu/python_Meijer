package kotlin;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Li4/v;", "", "Landroid/content/Context;", "context", "Li4/C;", "navigatorProvider", "<init>", "(Landroid/content/Context;Li4/C;)V", "a", "Landroid/content/Context;", "b", "Li4/C;", "c", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14681v {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f137174d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14657C navigatorProvider;

    public C14681v(Context context, C14657C navigatorProvider) {
        Intrinsics.j(context, "context");
        Intrinsics.j(navigatorProvider, "navigatorProvider");
        this.context = context;
        this.navigatorProvider = navigatorProvider;
    }
}
