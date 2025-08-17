package mc;

import U0.k;
import U0.l;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00068BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroid/os/Handler;", "a", "Lkotlin/Lazy;", "d", "()Landroid/os/Handler;", "MAIN_HANDLER", "Landroid/graphics/drawable/Drawable;", "LU0/k;", "c", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "drawablepainter_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: mc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15594b {

    /* renamed from: a, reason: collision with root package name */
    private static final Lazy f150054a = LazyKt.a(LazyThreadSafetyMode.f142381c, a.f150055f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Handler;", "c", "()Landroid/os/Handler;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: mc.b$a */
    static final class a extends Lambda implements Function0<Handler> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f150055f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f150054a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return k.INSTANCE.a();
    }
}
