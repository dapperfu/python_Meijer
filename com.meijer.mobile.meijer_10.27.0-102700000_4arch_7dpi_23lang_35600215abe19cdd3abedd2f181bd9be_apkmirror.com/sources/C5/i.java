package C5;

import androidx.view.c0;
import androidx.view.f0;
import com.adobe.marketing.mobile.assurance.internal.E;
import com.adobe.marketing.mobile.assurance.internal.EnumC6426h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LC5/i;", "Landroidx/lifecycle/f0$c;", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "assuranceStateManager", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "environment", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/E;Lcom/adobe/marketing/mobile/assurance/internal/h;)V", "Landroidx/lifecycle/c0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c0;", "b", "Lcom/adobe/marketing/mobile/assurance/internal/E;", "c", "Lcom/adobe/marketing/mobile/assurance/internal/h;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements f0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final E assuranceStateManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC6426h environment;

    public i(E assuranceStateManager, EnumC6426h environment) {
        Intrinsics.j(assuranceStateManager, "assuranceStateManager");
        Intrinsics.j(environment, "environment");
        this.assuranceStateManager = assuranceStateManager;
        this.environment = environment;
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends c0> T create(Class<T> modelClass) {
        Intrinsics.j(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(k.class)) {
            return new k(this.assuranceStateManager, this.environment);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
