package androidx.view;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0006*\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/b;", "Landroidx/lifecycle/c0;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "T", "getApplication", "()Landroid/app/Application;", "Landroid/app/Application;", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6153b extends c0 {
    private final Application application;

    public C6153b(Application application) {
        Intrinsics.j(application, "application");
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t10 = (T) this.application;
        Intrinsics.h(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
