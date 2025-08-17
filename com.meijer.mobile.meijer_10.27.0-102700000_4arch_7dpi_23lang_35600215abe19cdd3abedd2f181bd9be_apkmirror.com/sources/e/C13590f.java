package e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.InterfaceC5739q;
import androidx.compose.runtime.r;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/F0;", "Landroid/app/Activity;", "a", "Landroidx/compose/runtime/F0;", "()Landroidx/compose/runtime/F0;", "LocalActivity", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13590f {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<Activity> f127661a = r.e(a.f127662f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/q;", "Landroid/app/Activity;", "a", "(Landroidx/compose/runtime/q;)Landroid/app/Activity;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: e.f$a */
    static final class a extends Lambda implements Function1<InterfaceC5739q, Activity> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f127662f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Activity invoke(InterfaceC5739q interfaceC5739q) {
            Context baseContext = (Context) interfaceC5739q.e(AndroidCompositionLocals_androidKt.g());
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else {
                    baseContext = null;
                    break;
                }
            }
            return (Activity) baseContext;
        }
    }

    public static final F0<Activity> a() {
        return f127661a;
    }
}
